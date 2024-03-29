grammar JavaScriptToJQueryConverter;

options {
	language = Java;
	k = 1;
}

@header {
	package JS2JQConverter;
}

@lexer::header {
	package JS2JQConverter;
}

@members {
	Handler h;

	// *****
	public Handler getHandler () {
		return h;
	}

	// Override e delega nella gestione degli errori sintattici
  public void displayRecognitionError(String[] tokenNames,
                                       RecognitionException e) {
    // recupero alcune meta informazioni relative all'errore
		String hdr = " * " + getErrorHeader(e);
		String msg = " - " + getErrorMessage(e, tokenNames);
		
		// recuperoil token corrente  
		Token tk = input.LT(1);
		
		// lascio gestire il messaggio all'handler
		h.handleError(tk, hdr, msg);
  }

	//*******
 	void initParser () {
 		// passo lo stream di token all'handler 
		h = new Handler(input);
	}
}


parseJava 
@init {initParser();}
	: 
		(instructionRule
		| blockRule
		| classRule)*
	;
	
idDotIdRule
	:
		ID (DOT ID)* 
	;
	
factorTypologyRule
	:
		(o1=STRING
		| o2=INTEGER 
		| o3=FLOAT  
		| o4=TRUE 
		| o5=FALSE  
		| o6=idDotArrayRule
		| o7=getRule )
	;
	
assignTypologyRule
	:
		(objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule)
	;


idDotArrayRule
@after {h.checkLastDot($stop);
	h.translateId($start, $stop);
	h.saveVariable($text, $start, $stop, o1, o2);
	h.getAjaxMethod($start, $stop);
	}
	:
		o1=incDecRule? 
		(THIS DOT)? 
		(idDotIdRule
			(LB expressionRule RB)* DOT?
			(LP parametersRule? RP DOT?)? 
		)+
		o2=incDecRule? {h.checkDuplicateIncDec(o1, o2, $start);}
	;
	
parametersRule
	:
		(assignTypologyRule | expressionRule)(CM (assignTypologyRule | expressionRule))*
	;

expressionRule
	:
		termRule ((ADD | SUB | MOD) termRule)* 
	;
termRule
	:
		factorRule ((STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT) factorRule)* 
	;

factorRule //CONTROLLO AGGIUNTO
	:
		factorTypologyRule
		| LP expressionRule RP
	;

instructionRule //ho tolto documentRule perche dovevo inserire espressionRule che mancava ma facevano conflitto, ora manca  "| documentRule" --> unica soluzione pensata: raggiungere espressionda documentRule mettendo (ASSIGN|PLUSEQ) opzionali 
	:
		(BREAK 
		| CONTINUE 
		| tryCatchRule 
		| functionDefinitionRule 
		| documentRule
		| ifStatementRule
		| switchCaseRule 
		| forRule 
		| whileRule 
		| doWhileRule 
		| throwRule
		| typeOfRule 
		| idStartingRule)SC?
	;
	
throwRule
	:
		THROW (STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule)
	;
	
typeOfRule
	:	
		TYPEOF assignTypologyRule
	;


	
tryCatchRule
	:	
		TRY blockRule 
		CATCH LP ID RP blockRule 
		(FINALLY blockRule)?
	;
	
returnRule
	:
		RETURN (expressionRule|assignTypologyRule) SC?
	;
	
functionDeclarationRule
	:
		func =FUNCTION name = ID? {h.checkFunctionName($name, $func);} LP ((assignTypologyRule|expressionRule) ((CM (assignTypologyRule|expressionRule))*))? RP 
	;
	
functionDefinitionRule
	:
		functionDeclarationRule
		LBR
			instructionRule*
			returnRule?
		RBR
	;
	
arrayRule
	:
		LB
			(
			(expressionRule|assignTypologyRule)
			(CM (expressionRule|assignTypologyRule)?)*
			)?
		RB
	;
	
objectRule //Problema virgola finale
	:
		LBR
			(
			(ID | STRING) 
			CL 
			(expressionRule|assignTypologyRule)
			(
			CM
			(ID | STRING) 
			CL 
			(expressionRule|assignTypologyRule)
			)*
			)?
		RBR
	;
	
	
variableDefinitionRule //Ci sarebbe da fare il controllo, in dichiarazione pu� essere solo ID e non idDotId (e dovrebbe avere let,const o var)
	:
		(VAR | LET | CONST)?
		idDotArrayRule
		((ASSIGN|PLUSEQ|MINUSEQ|STAREQ|DIVEQ|MODEQ|EXPEQ) (expressionRule|assignTypologyRule))?
		
	;

documentRule
@after{h.translateIdWithAssign($start, $stop);}
	:
		getRule ((ASSIGN|PLUSEQ)(expressionRule|assignTypologyRule))?
	;
	
getRule 
	:
		DOCUMENT DOT get=ID LP ((idDotArrayRule|STRING) (ADD (idDotArrayRule | STRING))*) end=RP (DOT idDotArrayRule)? {h.translateGet($get, $start, $end);}
	;

idStartingRule 
@after{h.translateIdWithAssign($start, $stop);
	h.searchXMLHttpRequest($start, $stop);
	h.getAjaxAttribute($start, $stop);
	}
	:
		(VAR | LET | CONST)?
		id=idDotArrayRule ( ((ASSIGN|PLUSEQ|MINUSEQ|STAREQ|DIVEQ|MODEQ|EXPEQ) (expressionRule|assignTypologyRule))? | INSTANCEOF ID)
	;

	
newRule
	:
		NEW ID LP ((expressionRule|assignTypologyRule) (CM (expressionRule|assignTypologyRule))*)? RP
	;
	

comparatorRule
	:
		(EQ | NEQ | LT | LE | GT | GE | TEQ | NTEQ)
	;
	
conditionRule
	:
		NOT? expressionRule (comparatorRule NOT? expressionRule)?
		((AND|OR) conditionRule)*
	;

blockRule
	:
		LBR (instructionRule|blockRule)* RBR
	;
	
ifStatementRule
@after{h.searchStatus($start, $stop);}
	:
		IF LP conditionRule RP 
			(blockRule | instructionRule)
		(ELSE (IF LP conditionRule RP)? (blockRule | instructionRule))*	
		
	;
	
switchCaseRule
	:
		SWITCH LP (expressionRule|assignTypologyRule) RP
		LBR
			(CASE (expressionRule|assignTypologyRule) CL
				instructionRule*
			)*
			(DEFAULT CL
				instructionRule*
			)?
			(CASE (expressionRule|assignTypologyRule) CL
				instructionRule*
			)*
		RBR
		
	;
	
forRule //TODO, ci sarebbe anche il for in e il for of	NB: non ci sono controlli sullo step
	:
		FOR LP forInitVarRule? SC conditionRule? SC idDotArrayRule? RP
			(blockRule | instructionRule)
	;
	
forInitVarRule
	:
		(VAR | LET)? idDotArrayRule ASSIGN (expressionRule|assignTypologyRule)
	;
		
//stepRule //CONTROLLO AGGIUNTO
	//:
	//	(o1=incDecRule)? 
	//	i=ID 
	//	(o2=incDecRule)? {h.checkIncDec(o1, o2, $i);}
	//;
	
incDecRule returns[Token tk] 
	:
		o1=DEC    {tk = $o1;} 
		|o2=INC   {tk = $o2;}
	;
	
whileRule 
	:
		WHILE LP conditionRule RP
			(blockRule | instructionRule)
	;

doWhileRule
	:
		DO
			(blockRule | instructionRule)
		WHILE LP conditionRule RP SC?
	;
	
classRule
	:
		CLASS ID 
		LBR 
			functionDefinitionRule*
		RBR
	;
	
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\'|'\/')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

fragment 
LETTER : 'a'..'z'|'A'..'Z';
fragment 
DIGIT : '0'..'9';

DOCUMENT 
	:'document';

ASSIGN	: '=';
// comparatori
EQ 	: '==';
TEQ	: '===';
NEQ 	: '!=';
NTEQ 	: '!==';
GT 	: '>';
GE	: '>=';
LT 	: '<';
LE 	: '<=';
QUEST 	: '?';

// punteggiatura
AT	: '@';
CL 	: ':';
CM 	: ',';
DOT 	: '.';
SC 	: ';';

// parentesi
LP 	: '(';		// Parenthesis
RP 	: ')';
LB	: '[';		// Brackets
RB	: ']';
LBR	: '{';		// BRaces
RBR	: '}';

// operatori
ADD		: '+';
SUB		: '-';
STAR		: '*';
DIV		: '/';
MOD		: '%';
INC		: '++';
DEC		: '--';
EXP		: '**';
PLUSEQ		: '+=';
MINUSEQ		: '-=';
STAREQ		: '*=';
DIVEQ		: '/=';
MODEQ		: '%=';
EXPEQ		: '**=';

// operatori logici
NOT		: '!';
AND		: '&&';
OR		: '||';
XOR		: '^';
AND_BIT 	:'&';
OR_BIT 		:'|';
LSHIFT		: '<<';
RSHIFT		: '>>';
URSHIFT		: '>>>';
						
// keywords
AWAIT		:'await';
BREAK		:'break';
CASE		:'case';
CATCH		:'catch';
CLASS		:'class';
CONST		:'const';
CONTINUE	:'continue';
DEBUGGER	:'debugger';
DEFAULT		:'default';
DELETE		:'delete';	
DO		:'do';
ELSE		:'else';
ENUM		:'enum';
EXPORT		:'export';
EXTENDS		:'extends';
FALSE		:'false';
FINALLY		:'finally';
FOR		:'for';
FUNCTION	:'function';
IF		:'if';
IMPLEMENTS	:'implements';
IMPORT		:'import';
IN 		:'in';
INSTANCEOF	:'instanceof';
INTERFACE	:'interface';
LET		:'let';
NEW		:'new';
NULL		:'null';
PACKAGE		:'package';
PRIVATE		:'private';
PROTECTED	:'protected';
PUBLIC		:'public';
RETURN		:'return';
STATIC		:'static';
SUPER		:'super';
SWITCH		:'switch';
THIS		:'this';
THROW		:'throw';
TRY		:'try';
TRUE		:'true';
TYPEOF		:'typeof';
VAR		:'var';
VOID		:'void';
WHILE		:'while';
WITH		:'with';
YIELD		:'yield';

UNDEFINED	: 'undefined';

		
ID  	:	
	( LETTER |'_' | '$')( LETTER |DIGIT |'_' | '$')* 
	;


INTEGER :	DIGIT+ ('n')?
	;

FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;
    
COMMENT
    :   ('//' ~('\n'|'\r')* '\r'? '\n' 	
    |   '/*' ( options {greedy=false;} : . )* '*/') {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;

STRING	:  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
	|  '\'' ( ESC_SEQ | ~('\\'|'\'') )* '\''
	;

ERROR_TK	: . ; 



