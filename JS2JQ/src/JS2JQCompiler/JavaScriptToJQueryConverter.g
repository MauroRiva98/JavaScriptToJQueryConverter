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


/* ****************************
**	 Analizzatore sintattico 
**	 aka Lexer, aka Scanner
***************************** */
parseJava 
@init {initParser();}
	: 
		getRule
	;
getRule
	:
		DOCUMENT {System.out.println("Ho riconosciuto DOCUMENT");} DOT get=ID LP i=STRING RP SC {h.translate($get, $i);}
	;

prologRule
	:
		packageDefintionRule?
		importRule*
	;
	
packageDefintionRule
	:
		PACKAGE ID (DOT ID)* SC
	;
	
importRule
	:
		IMPORT ID importSubRule? SC
	;
importSubRule
	:	
		DOT (	STAR
				|	ID importSubRule?
				)
	;
	
classDefinitionRule
	:
		modifiersRule CLASS ID extendsRule? implementsRule? 
			LBR	
				(	methodDefinitionRule
				| propertyDefinitionRule )*
			RBR
	;
	
modifiersRule 
	:
			PUBLIC?
		( ABSTRACT
		|	FINAL )?
	;
	
idDotIdRule
	:
		ID (DOT ID)*
	;

extendsRule
	:
		EXTENDS idDotIdRule
	;
	
implementsRule
	:
		IMPLEMENTS idDotIdRule (CM idDotIdRule)*
	;	
	
	
methodDefinitionRule
	:
		VOID ID  LP (parameterRule ( CM parameterRule)*)? RP 
			LBR	
				instructionRule*
			RBR
	;


parameterRule
	:
		BASIC_TYPE ID	
	;



testRule [String caller]:
	TEST { int c=0; }
		( blockRule {c++;})+
		{ if (c!=5)
			System.err.println("Errore sul numero dei blocchi: " +c);}
		
		{ boolean flag=false;}
		(ifStatementRule {flag=true;})?
		(whileCycleRule  {flag=true;})?
		(forCycleRule {flag=true;})?
		
		{/*controllo */}
		

		
		SC
	;
instructionRule
	:
		(	SC
		| testRule [caller]
		| blockRule
		|	ifStatementRule
		| forCycleRule
		| whileCycleRule  				// aggiunta
		| propertyDefinitionRule 	// aggiunta
		| n=ID  ( v=assignRule SC			{	h.assignValue($n, v);	}			
						| methodCallRule SC )	// aggiunta
		)
	;


forCycleRule 
	:
		FOR LP forInitVarRule SC conditionRule SC stepRule RP
			instructionRule
	;

forInitVarRule
	:
		BASIC_TYPE? ID ASSIGN exprRule
	;


stepRule
	:
		(o1=incDecRule)? 
		i=ID {h.checkReference ($i);}
		(o2=incDecRule)?
		{ h.checkIncDec(o1, o2, $i); } 
	;
incDecRule returns[Token tk]
	:
		o1=DEC  {tk = $o1;} 
	|	o2=INC	{tk = $o2;}
	;

	
whileCycleRule 
	:
		WHILE LP conditionRule RP
			instructionRule
	;


methodCallRule
	:
		LP exprRule (CM exprRule)* RP
	;


ifStatementRule
	:
		IF LP conditionRule RP 
			instructionRule
		// Dangling Else
		// https://en.wikipedia.org/wiki/Dangling_else
		( ELSE instructionRule )?			
	;


conditionRule 
	:
		exprRule comparatorRule exprRule
	;
	
comparatorRule
	:
		( EQ | NEQ | LT | LE | GT | GE )
	;

blockRule 
	:
		LBR instructionRule* RBR
	;	


propertyDefinitionRule
	:	
		t=BASIC_TYPE n=ID 	{	h.declareVar($t, $n);	} 
		( v=assignRule 			{	h.assignValue($n, v);	}	) ? 
		SC 
	;

// **** spostare qui l'azione di inizializzazione
assignRule returns [float v]
	:	ASSIGN e=exprRule { v=e; }
	;

// ********
exprRule  returns [float v]
	:
		t1=termRule { v = t1;}
		((op=ADD | op=SUB) t2=termRule { v=h.calculateAdd(v, $op, t2); } )*     
//		 ATTENZIONE questa è sbagliata: v=h.calculateAdd(t1, $op, t2); 
	;
termRule returns [float v]
	:
		f1=factorRule  { v = f1;}
		( (op=STAR | op=DIV) f2=factorRule { v=h.calculateMul(v, $op, f2); } )*  
//		 ATTENZIONE questa è sbagliata: v=h.calculateMul(f1, $op, f2); 
	;
	
factorRule returns [float v]
	:
			x=ID  					{ v=h.getVarValue($x);}
		| i=INTEGER 			{ v=h.convertToFloat($i);}
		| f=FLOAT					{ v=h.convertToFloat($f);}
		| LP e=exprRule RP  { v = e; }
		
	;
/* ****************************
**	 Analizzatore sintattico 
**	 aka Lexer, aka Scanner
***************************** */

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
	:'document'	;

ASSIGN	: '=';
// comparatori
EQ 			: '==';
NEQ 		: '!=';
GT 			: '>';
GE			: '>=';
LT 			: '<';
LE 			: '<=';

// punteggiatura
AT	: '@';
CL 	:	':';
CM 	:	',';
DOT : '.';
SC 	: ';';

// parentesi
LP 	: '(';		// Parenthesis
RP 	: ')';
LB	:	'[';		// Brackets
RB	:	']';
LBR	:	'{';		// BRaces
RBR	:	'}';

// operatori
ADD		: '+';
SUB		: '-';
STAR	: '*';
DIV		: '/';
MOD		:	'%';
INC		: '++';
DEC		: '--';

// operatori logici
NOT			:	'!';
AND			: '&&';
OR			: '||';
XOR			: '^';
AND_BIT :	'&';
OR_BIT 	:	'|';

// basic types
VOID 				:	'void';
// attenzione... vedere sotto 
BASIC_TYPE 	: 'int' 	| 'long'		| 'short' 	| 
							'float' |	'double'	| 'boolean' | 
							'char'	|	'String';
/* attenzione
//VOID 			:	'void';
BOOLEAN		:	'boolean';
CHAR_K		:	'char';
DOUBLE		:	'double';
FLOAT_K		:	'float';
INT				:	'int';
LONG			:	'long';
SHORT			:	'short';
STRING_K	:	'String'; // attenzione
*/							
							
// keywords
ABSTRACT			:	'abstract';
ASSERT				:	'assert';
BREAK					:	'break';
BYTE					:	'byte';
CASE					:	'case';
CATCH					:	'catch';
CLASS					:	'class';
CONTINUE			:	'continue';
DEFAULT				:	'default';
DO						:	'do';
ELSE					:	'else';
ENUM					:	'enum';
EXTENDS				:	'extends';
FINAL					:	'final';
FINALLY				:	'finally';
FOR						:	'for';
IF						:	'if';
IMPLEMENTS		:	'implements';
IMPORT				:	'import';
INSTANCEOF		:	'instanceof';
INTERFACE			:	'interface';
NATIVE				:	'native';
NEW						:	'new';
PACKAGE				:	'package';
PRIVATE				:	'private';
PROTECTED			:	'protected';
PUBLIC				:	'public';
RETURN				:	'return';
STATIC				:	'static';
SUPER					:	'super';
SWITCH				:	'switch';
SYNCHRONIZED	:	'synchronized';
TEST 					: 'XXX';
ENDTEST 			: 'YYY';
THIS					:	'this';
THROW					:	'throw';
THROWS				:	'throws';
TRANSIENT			:	'transient';
TRY						:	'try';
VOLATILE			:	'volatile';
WHILE					:	'while';

		
ID  :	( LETTER |'_') 
			( LETTER |DIGIT |'_')*
    ;


INTEGER :	DIGIT+
    ;

FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;

COMMENT
    :   ('//' ~('\n'|'\r')* '\r'? '\n' 							{$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/') {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;

STRING			:  '"' ( ESC_SEQ | ~('\\'|'"') )* '"';

CHAR				:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\'';

ERROR_TK		: . ; 

