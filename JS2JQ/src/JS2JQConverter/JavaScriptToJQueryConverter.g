grammar JavaScriptToJQueryConverter;

options {
	language = Java;
	k =1;
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
@init {initParser();} //TODO
	: 
		getRule 
		|variableDefinitionRule
		|objectRule
		//|functionCallRule problema con variableDefinitionRule
	;
getRule
	:
		DOCUMENT {System.out.println("Ho riconosciuto DOCUMENT");} DOT get=ID x=LP i=STRING RP SC? {h.test($getRule.text, $start);}
	;
	
idDotIdRule
	:
		ID (DOT ID)*
	;
	
idDotArrayRule //TOFIX
	:
		(idDotIdRule | (THIS (DOT ID)*) ) ((LB (INTEGER | (idDotArrayRule (LP assignTypologyRule (CM assignTypologyRule)* RP)?) | STRING) RB)+ (DOT ID)*)*
	;
	
expressionRule //TODO
	:
		SUB
	;
	
istructionRule //TODO
	:
	SC
	;
	
returnRule
	:
		RETURN assignTypologyRule SC?
	;
	
functionDeclarationRule //Controllare che l'ID ci sia se non siamo in un oggetto
	:
		FUNCTION ID? LP (ID ((CM ID)*))? RP
	;
	
functionDefinitionRule
	:
		functionDeclarationRule
		LBR
			istructionRule*
			returnRule?
		RBR
	;
	
functionCallRule
	:
		idDotArrayRule LP (assignTypologyRule (CM assignTypologyRule)*)? RP SC?
		{System.out.println("Ho riconosciuto una chiamata a funzione");}
	;
	
arrayRule //Problema virgola finale
	:
		LB
			(
			assignTypologyRule
			(CM assignTypologyRule)*
			)?
		RB
	;
	
objectRule //Problema virgola finale
	:
		LBR
			(
			(ID | STRING) 
			CL 
			assignTypologyRule
			(
			CM
			(ID | STRING) 
			CL 
			assignTypologyRule
			)*
			)?
		RBR
		{System.out.println("Ho riconosciuto JSON");}
	;
	
varDeclarationRule //Confluita in variableDefinitionRule
	:
		(VAR | LET | CONST) ID (CM ID)* SC?
	;
	
varAssignmentRule //Confluita in variableDefinitionRule
	:	
		(VAR | LET | CONST)? idDotArrayRule ASSIGN assignTypologyRule SC?
	;
	
variableDefinitionRule //Ci sarebbe da fare il controllo, in dichiarazione può essere solo ID e non idDotId (e dovrebbe avere let,const o var)
	:
		(VAR | LET | CONST)?
		idDotArrayRule
		(ASSIGN assignTypologyRule)?
		SC?
		{System.out.println($text);}
	;

assignTypologyRule
	:
		(STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED | functionDefinitionRule | expressionRule | newRule | (idDotArrayRule (LP assignTypologyRule (CM assignTypologyRule)* RP)?))
	;
	
newRule
	:
		NEW ID LP (assignTypologyRule (CM assignTypologyRule)*)? RP
	;
	
arithmeticOperatorsRule //TODO
	:
		(ADD
		|SUB
		|STAR
		|DIV
		|MOD
		|INC
		|DEC
		|EXP)
	;
	

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
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



