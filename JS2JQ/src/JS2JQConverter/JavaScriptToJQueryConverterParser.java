// $ANTLR 3.5.1 C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g 2023-07-25 18:22:09

	package JS2JQConverter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JavaScriptToJQueryConverterParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "AND", "AND_BIT", "ASSIGN", 
		"AT", "AWAIT", "BREAK", "CASE", "CATCH", "CL", "CLASS", "CM", "COMMENT", 
		"CONST", "CONTINUE", "DEBUGGER", "DEC", "DEFAULT", "DELETE", "DIGIT", 
		"DIV", "DIVEQ", "DO", "DOCUMENT", "DOT", "ELSE", "ENUM", "EQ", "ERROR_TK", 
		"ESC_SEQ", "EXP", "EXPEQ", "EXPONENT", "EXPORT", "EXTENDS", "FALSE", "FINALLY", 
		"FLOAT", "FOR", "FUNCTION", "GE", "GT", "HEX_DIGIT", "ID", "IF", "IMPLEMENTS", 
		"IMPORT", "IN", "INC", "INSTANCEOF", "INTEGER", "INTERFACE", "LB", "LBR", 
		"LE", "LET", "LETTER", "LP", "LSHIFT", "LT", "MINUSEQ", "MOD", "MODEQ", 
		"NEQ", "NEW", "NOT", "NTEQ", "NULL", "OCTAL_ESC", "OR", "OR_BIT", "PACKAGE", 
		"PLUSEQ", "PRIVATE", "PROTECTED", "PUBLIC", "QUEST", "RB", "RBR", "RETURN", 
		"RP", "RSHIFT", "SC", "STAR", "STAREQ", "STATIC", "STRING", "SUB", "SUPER", 
		"SWITCH", "TEQ", "THIS", "THROW", "TRUE", "TRY", "TYPEOF", "UNDEFINED", 
		"UNICODE_ESC", "URSHIFT", "VAR", "VOID", "WHILE", "WITH", "WS", "XOR", 
		"YIELD"
	};
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int AND=5;
	public static final int AND_BIT=6;
	public static final int ASSIGN=7;
	public static final int AT=8;
	public static final int AWAIT=9;
	public static final int BREAK=10;
	public static final int CASE=11;
	public static final int CATCH=12;
	public static final int CL=13;
	public static final int CLASS=14;
	public static final int CM=15;
	public static final int COMMENT=16;
	public static final int CONST=17;
	public static final int CONTINUE=18;
	public static final int DEBUGGER=19;
	public static final int DEC=20;
	public static final int DEFAULT=21;
	public static final int DELETE=22;
	public static final int DIGIT=23;
	public static final int DIV=24;
	public static final int DIVEQ=25;
	public static final int DO=26;
	public static final int DOCUMENT=27;
	public static final int DOT=28;
	public static final int ELSE=29;
	public static final int ENUM=30;
	public static final int EQ=31;
	public static final int ERROR_TK=32;
	public static final int ESC_SEQ=33;
	public static final int EXP=34;
	public static final int EXPEQ=35;
	public static final int EXPONENT=36;
	public static final int EXPORT=37;
	public static final int EXTENDS=38;
	public static final int FALSE=39;
	public static final int FINALLY=40;
	public static final int FLOAT=41;
	public static final int FOR=42;
	public static final int FUNCTION=43;
	public static final int GE=44;
	public static final int GT=45;
	public static final int HEX_DIGIT=46;
	public static final int ID=47;
	public static final int IF=48;
	public static final int IMPLEMENTS=49;
	public static final int IMPORT=50;
	public static final int IN=51;
	public static final int INC=52;
	public static final int INSTANCEOF=53;
	public static final int INTEGER=54;
	public static final int INTERFACE=55;
	public static final int LB=56;
	public static final int LBR=57;
	public static final int LE=58;
	public static final int LET=59;
	public static final int LETTER=60;
	public static final int LP=61;
	public static final int LSHIFT=62;
	public static final int LT=63;
	public static final int MINUSEQ=64;
	public static final int MOD=65;
	public static final int MODEQ=66;
	public static final int NEQ=67;
	public static final int NEW=68;
	public static final int NOT=69;
	public static final int NTEQ=70;
	public static final int NULL=71;
	public static final int OCTAL_ESC=72;
	public static final int OR=73;
	public static final int OR_BIT=74;
	public static final int PACKAGE=75;
	public static final int PLUSEQ=76;
	public static final int PRIVATE=77;
	public static final int PROTECTED=78;
	public static final int PUBLIC=79;
	public static final int QUEST=80;
	public static final int RB=81;
	public static final int RBR=82;
	public static final int RETURN=83;
	public static final int RP=84;
	public static final int RSHIFT=85;
	public static final int SC=86;
	public static final int STAR=87;
	public static final int STAREQ=88;
	public static final int STATIC=89;
	public static final int STRING=90;
	public static final int SUB=91;
	public static final int SUPER=92;
	public static final int SWITCH=93;
	public static final int TEQ=94;
	public static final int THIS=95;
	public static final int THROW=96;
	public static final int TRUE=97;
	public static final int TRY=98;
	public static final int TYPEOF=99;
	public static final int UNDEFINED=100;
	public static final int UNICODE_ESC=101;
	public static final int URSHIFT=102;
	public static final int VAR=103;
	public static final int VOID=104;
	public static final int WHILE=105;
	public static final int WITH=106;
	public static final int WS=107;
	public static final int XOR=108;
	public static final int YIELD=109;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public JavaScriptToJQueryConverterParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JavaScriptToJQueryConverterParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return JavaScriptToJQueryConverterParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g"; }


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



	// $ANTLR start "parseJava"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:46:1: parseJava : ( instructionRule | classRule )* ;
	public final void parseJava() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:48:2: ( ( instructionRule | classRule )* )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:49:3: ( instructionRule | classRule )*
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:49:3: ( instructionRule | classRule )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==BREAK||(LA1_0 >= CONST && LA1_0 <= CONTINUE)||LA1_0==DO||(LA1_0 >= FOR && LA1_0 <= FUNCTION)||(LA1_0 >= ID && LA1_0 <= IF)||LA1_0==LBR||LA1_0==LET||LA1_0==SWITCH||(LA1_0 >= THIS && LA1_0 <= THROW)||(LA1_0 >= TRY && LA1_0 <= TYPEOF)||LA1_0==VAR||LA1_0==WHILE) ) {
					alt1=1;
				}
				else if ( (LA1_0==CLASS) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:49:4: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_parseJava64);
					instructionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:50:5: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava70);
					classRule();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parseJava"


	public static class getRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "getRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:52:1: getRule : DOCUMENT DOT get= ID x= LP STRING RP ( SC )? ;
	public final JavaScriptToJQueryConverterParser.getRule_return getRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.getRule_return retval = new JavaScriptToJQueryConverterParser.getRule_return();
		retval.start = input.LT(1);

		Token get=null;
		Token x=null;

		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:53:2: ( DOCUMENT DOT get= ID x= LP STRING RP ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:54:3: DOCUMENT DOT get= ID x= LP STRING RP ( SC )?
			{
			match(input,DOCUMENT,FOLLOW_DOCUMENT_in_getRule85); 
			System.out.println("Ho riconosciuto DOCUMENT");
			match(input,DOT,FOLLOW_DOT_in_getRule89); 
			get=(Token)match(input,ID,FOLLOW_ID_in_getRule93); 
			x=(Token)match(input,LP,FOLLOW_LP_in_getRule97); 
			match(input,STRING,FOLLOW_STRING_in_getRule99); 
			match(input,RP,FOLLOW_RP_in_getRule101); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:54:88: ( SC )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==SC) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:54:88: SC
					{
					match(input,SC,FOLLOW_SC_in_getRule103); 
					}
					break;

			}

			h.test(input.toString(retval.start,input.LT(-1)), (retval.start));
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "getRule"



	// $ANTLR start "idDotIdRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:57:1: idDotIdRule : ID ( DOT ID )* ;
	public final void idDotIdRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:58:2: ( ID ( DOT ID )* )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:59:3: ID ( DOT ID )*
			{
			match(input,ID,FOLLOW_ID_in_idDotIdRule120); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:59:6: ( DOT ID )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==DOT) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:59:7: DOT ID
					{
					match(input,DOT,FOLLOW_DOT_in_idDotIdRule123); 
					match(input,ID,FOLLOW_ID_in_idDotIdRule125); 
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "idDotIdRule"



	// $ANTLR start "factorTypologyRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:62:1: factorTypologyRule : ( STRING | INTEGER | FLOAT | TRUE | FALSE | idDotArrayRule ) ;
	public final void factorTypologyRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:63:2: ( ( STRING | INTEGER | FLOAT | TRUE | FALSE | idDotArrayRule ) )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:3: ( STRING | INTEGER | FLOAT | TRUE | FALSE | idDotArrayRule )
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:3: ( STRING | INTEGER | FLOAT | TRUE | FALSE | idDotArrayRule )
			int alt4=6;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt4=1;
				}
				break;
			case INTEGER:
				{
				alt4=2;
				}
				break;
			case FLOAT:
				{
				alt4=3;
				}
				break;
			case TRUE:
				{
				alt4=4;
				}
				break;
			case FALSE:
				{
				alt4=5;
				}
				break;
			case ID:
			case THIS:
				{
				alt4=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:4: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_factorTypologyRule142); 
					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:13: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_factorTypologyRule146); 
					}
					break;
				case 3 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:23: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_factorTypologyRule150); 
					}
					break;
				case 4 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:31: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factorTypologyRule154); 
					}
					break;
				case 5 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:38: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factorTypologyRule158); 
					}
					break;
				case 6 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:46: idDotArrayRule
					{
					pushFollow(FOLLOW_idDotArrayRule_in_factorTypologyRule162);
					idDotArrayRule();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "factorTypologyRule"



	// $ANTLR start "assignTypologyRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:1: assignTypologyRule : ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule ) ;
	public final void assignTypologyRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:68:2: ( ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule ) )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:3: ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule )
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:3: ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule )
			int alt5=6;
			switch ( input.LA(1) ) {
			case LBR:
				{
				alt5=1;
				}
				break;
			case LB:
				{
				alt5=2;
				}
				break;
			case NULL:
				{
				alt5=3;
				}
				break;
			case UNDEFINED:
				{
				alt5=4;
				}
				break;
			case FUNCTION:
				{
				alt5=5;
				}
				break;
			case NEW:
				{
				alt5=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:4: objectRule
					{
					pushFollow(FOLLOW_objectRule_in_assignTypologyRule178);
					objectRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:17: arrayRule
					{
					pushFollow(FOLLOW_arrayRule_in_assignTypologyRule182);
					arrayRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:29: NULL
					{
					match(input,NULL,FOLLOW_NULL_in_assignTypologyRule186); 
					}
					break;
				case 4 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:36: UNDEFINED
					{
					match(input,UNDEFINED,FOLLOW_UNDEFINED_in_assignTypologyRule190); 
					}
					break;
				case 5 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:48: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_assignTypologyRule194);
					functionDefinitionRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:73: newRule
					{
					pushFollow(FOLLOW_newRule_in_assignTypologyRule198);
					newRule();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignTypologyRule"



	// $ANTLR start "idDotSubRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:1: idDotSubRule : idDotIdRule ( ( LB expressionRule RB )+ ( LP ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )? RP )? | ( LP ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )? RP ) ( LB expressionRule RB )* ) ;
	public final void idDotSubRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:79:2: ( idDotIdRule ( ( LB expressionRule RB )+ ( LP ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )? RP )? | ( LP ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )? RP ) ( LB expressionRule RB )* ) )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:3: idDotIdRule ( ( LB expressionRule RB )+ ( LP ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )? RP )? | ( LP ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )? RP ) ( LB expressionRule RB )* )
			{
			pushFollow(FOLLOW_idDotIdRule_in_idDotSubRule216);
			idDotIdRule();
			state._fsp--;

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:15: ( ( LB expressionRule RB )+ ( LP ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )? RP )? | ( LP ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )? RP ) ( LB expressionRule RB )* )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==LB) ) {
				alt17=1;
			}
			else if ( (LA17_0==LP) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:16: ( LB expressionRule RB )+ ( LP ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )? RP )?
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:16: ( LB expressionRule RB )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==LB) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:17: LB expressionRule RB
							{
							match(input,LB,FOLLOW_LB_in_idDotSubRule220); 
							pushFollow(FOLLOW_expressionRule_in_idDotSubRule222);
							expressionRule();
							state._fsp--;

							match(input,RB,FOLLOW_RB_in_idDotSubRule224); 
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:40: ( LP ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )? RP )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==LP) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:41: LP ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )? RP
							{
							match(input,LP,FOLLOW_LP_in_idDotSubRule229); 
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:44: ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )?
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==DEC||LA10_0==FALSE||LA10_0==FLOAT||LA10_0==FUNCTION||LA10_0==ID||LA10_0==INC||LA10_0==INTEGER||(LA10_0 >= LB && LA10_0 <= LBR)||LA10_0==LP||LA10_0==NEW||LA10_0==NULL||LA10_0==STRING||LA10_0==THIS||LA10_0==TRUE||LA10_0==UNDEFINED) ) {
								alt10=1;
							}
							switch (alt10) {
								case 1 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:45: ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )*
									{
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:45: ( assignTypologyRule | expressionRule )
									int alt7=2;
									int LA7_0 = input.LA(1);
									if ( (LA7_0==FUNCTION||(LA7_0 >= LB && LA7_0 <= LBR)||LA7_0==NEW||LA7_0==NULL||LA7_0==UNDEFINED) ) {
										alt7=1;
									}
									else if ( (LA7_0==DEC||LA7_0==FALSE||LA7_0==FLOAT||LA7_0==ID||LA7_0==INC||LA7_0==INTEGER||LA7_0==LP||LA7_0==STRING||LA7_0==THIS||LA7_0==TRUE) ) {
										alt7=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 7, 0, input);
										throw nvae;
									}

									switch (alt7) {
										case 1 :
											// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:46: assignTypologyRule
											{
											pushFollow(FOLLOW_assignTypologyRule_in_idDotSubRule233);
											assignTypologyRule();
											state._fsp--;

											}
											break;
										case 2 :
											// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:65: expressionRule
											{
											pushFollow(FOLLOW_expressionRule_in_idDotSubRule235);
											expressionRule();
											state._fsp--;

											}
											break;

									}

									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:81: ( CM ( assignTypologyRule | expressionRule ) )*
									loop9:
									while (true) {
										int alt9=2;
										int LA9_0 = input.LA(1);
										if ( (LA9_0==CM) ) {
											alt9=1;
										}

										switch (alt9) {
										case 1 :
											// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:82: CM ( assignTypologyRule | expressionRule )
											{
											match(input,CM,FOLLOW_CM_in_idDotSubRule239); 
											// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:85: ( assignTypologyRule | expressionRule )
											int alt8=2;
											int LA8_0 = input.LA(1);
											if ( (LA8_0==FUNCTION||(LA8_0 >= LB && LA8_0 <= LBR)||LA8_0==NEW||LA8_0==NULL||LA8_0==UNDEFINED) ) {
												alt8=1;
											}
											else if ( (LA8_0==DEC||LA8_0==FALSE||LA8_0==FLOAT||LA8_0==ID||LA8_0==INC||LA8_0==INTEGER||LA8_0==LP||LA8_0==STRING||LA8_0==THIS||LA8_0==TRUE) ) {
												alt8=2;
											}

											else {
												NoViableAltException nvae =
													new NoViableAltException("", 8, 0, input);
												throw nvae;
											}

											switch (alt8) {
												case 1 :
													// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:86: assignTypologyRule
													{
													pushFollow(FOLLOW_assignTypologyRule_in_idDotSubRule242);
													assignTypologyRule();
													state._fsp--;

													}
													break;
												case 2 :
													// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:105: expressionRule
													{
													pushFollow(FOLLOW_expressionRule_in_idDotSubRule244);
													expressionRule();
													state._fsp--;

													}
													break;

											}

											}
											break;

										default :
											break loop9;
										}
									}

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_idDotSubRule251); 
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:132: ( LP ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )? RP ) ( LB expressionRule RB )*
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:132: ( LP ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )? RP )
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:133: LP ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )? RP
					{
					match(input,LP,FOLLOW_LP_in_idDotSubRule258); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:136: ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==DEC||LA15_0==FALSE||LA15_0==FLOAT||LA15_0==FUNCTION||LA15_0==ID||LA15_0==INC||LA15_0==INTEGER||(LA15_0 >= LB && LA15_0 <= LBR)||LA15_0==LP||LA15_0==NEW||LA15_0==NULL||LA15_0==STRING||LA15_0==THIS||LA15_0==TRUE||LA15_0==UNDEFINED) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:137: ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )*
							{
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:137: ( assignTypologyRule | expressionRule )
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==FUNCTION||(LA12_0 >= LB && LA12_0 <= LBR)||LA12_0==NEW||LA12_0==NULL||LA12_0==UNDEFINED) ) {
								alt12=1;
							}
							else if ( (LA12_0==DEC||LA12_0==FALSE||LA12_0==FLOAT||LA12_0==ID||LA12_0==INC||LA12_0==INTEGER||LA12_0==LP||LA12_0==STRING||LA12_0==THIS||LA12_0==TRUE) ) {
								alt12=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 12, 0, input);
								throw nvae;
							}

							switch (alt12) {
								case 1 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:138: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_idDotSubRule262);
									assignTypologyRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:157: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_idDotSubRule264);
									expressionRule();
									state._fsp--;

									}
									break;

							}

							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:173: ( CM ( assignTypologyRule | expressionRule ) )*
							loop14:
							while (true) {
								int alt14=2;
								int LA14_0 = input.LA(1);
								if ( (LA14_0==CM) ) {
									alt14=1;
								}

								switch (alt14) {
								case 1 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:174: CM ( assignTypologyRule | expressionRule )
									{
									match(input,CM,FOLLOW_CM_in_idDotSubRule268); 
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:177: ( assignTypologyRule | expressionRule )
									int alt13=2;
									int LA13_0 = input.LA(1);
									if ( (LA13_0==FUNCTION||(LA13_0 >= LB && LA13_0 <= LBR)||LA13_0==NEW||LA13_0==NULL||LA13_0==UNDEFINED) ) {
										alt13=1;
									}
									else if ( (LA13_0==DEC||LA13_0==FALSE||LA13_0==FLOAT||LA13_0==ID||LA13_0==INC||LA13_0==INTEGER||LA13_0==LP||LA13_0==STRING||LA13_0==THIS||LA13_0==TRUE) ) {
										alt13=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 13, 0, input);
										throw nvae;
									}

									switch (alt13) {
										case 1 :
											// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:178: assignTypologyRule
											{
											pushFollow(FOLLOW_assignTypologyRule_in_idDotSubRule271);
											assignTypologyRule();
											state._fsp--;

											}
											break;
										case 2 :
											// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:197: expressionRule
											{
											pushFollow(FOLLOW_expressionRule_in_idDotSubRule273);
											expressionRule();
											state._fsp--;

											}
											break;

									}

									}
									break;

								default :
									break loop14;
								}
							}

							}
							break;

					}

					match(input,RP,FOLLOW_RP_in_idDotSubRule279); 
					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:220: ( LB expressionRule RB )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==LB) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:221: LB expressionRule RB
							{
							match(input,LB,FOLLOW_LB_in_idDotSubRule283); 
							pushFollow(FOLLOW_expressionRule_in_idDotSubRule285);
							expressionRule();
							state._fsp--;

							match(input,RB,FOLLOW_RB_in_idDotSubRule287); 
							}
							break;

						default :
							break loop16;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "idDotSubRule"



	// $ANTLR start "idTestRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:83:1: idTestRule : idDotIdRule ;
	public final void idTestRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:2: ( idDotIdRule )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:3: idDotIdRule
			{
			pushFollow(FOLLOW_idDotIdRule_in_idTestRule304);
			idDotIdRule();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "idTestRule"



	// $ANTLR start "idDotArrayRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:88:1: idDotArrayRule : ( THIS DOT )? ( idTestRule )+ ;
	public final void idDotArrayRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:89:2: ( ( THIS DOT )? ( idTestRule )+ )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:90:3: ( THIS DOT )? ( idTestRule )+
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:90:3: ( THIS DOT )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==THIS) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:90:4: THIS DOT
					{
					match(input,THIS,FOLLOW_THIS_in_idDotArrayRule319); 
					match(input,DOT,FOLLOW_DOT_in_idDotArrayRule321); 
					}
					break;

			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:90:15: ( idTestRule )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==ID) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:90:15: idTestRule
					{
					pushFollow(FOLLOW_idTestRule_in_idDotArrayRule325);
					idTestRule();
					state._fsp--;

					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "idDotArrayRule"


	public static class expressionRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "expressionRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:93:1: expressionRule : termRule ( ( ADD | SUB | MOD ) termRule )* ;
	public final JavaScriptToJQueryConverterParser.expressionRule_return expressionRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.expressionRule_return retval = new JavaScriptToJQueryConverterParser.expressionRule_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:2: ( termRule ( ( ADD | SUB | MOD ) termRule )* )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:95:3: termRule ( ( ADD | SUB | MOD ) termRule )*
			{
			pushFollow(FOLLOW_termRule_in_expressionRule339);
			termRule();
			state._fsp--;

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:95:12: ( ( ADD | SUB | MOD ) termRule )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==ADD||LA20_0==MOD||LA20_0==SUB) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:95:13: ( ADD | SUB | MOD ) termRule
					{
					if ( input.LA(1)==ADD||input.LA(1)==MOD||input.LA(1)==SUB ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_termRule_in_expressionRule354);
					termRule();
					state._fsp--;

					}
					break;

				default :
					break loop20;
				}
			}

			System.out.println(input.toString(retval.start,input.LT(-1)));
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressionRule"



	// $ANTLR start "termRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:97:1: termRule : factorRule ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )* ;
	public final void termRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:98:2: ( factorRule ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )* )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:99:3: factorRule ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )*
			{
			pushFollow(FOLLOW_factorRule_in_termRule370);
			factorRule();
			state._fsp--;

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:99:14: ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==AND_BIT||LA21_0==DIV||LA21_0==EXP||LA21_0==LSHIFT||LA21_0==OR_BIT||LA21_0==RSHIFT||LA21_0==STAR||LA21_0==URSHIFT||LA21_0==XOR) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:99:15: ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule
					{
					if ( input.LA(1)==AND_BIT||input.LA(1)==DIV||input.LA(1)==EXP||input.LA(1)==LSHIFT||input.LA(1)==OR_BIT||input.LA(1)==RSHIFT||input.LA(1)==STAR||input.LA(1)==URSHIFT||input.LA(1)==XOR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factorRule_in_termRule409);
					factorRule();
					state._fsp--;

					}
					break;

				default :
					break loop21;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "termRule"



	// $ANTLR start "factorRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:102:1: factorRule : ( ( INC | DEC )? factorTypologyRule ( INC | DEC )? | LP expressionRule RP );
	public final void factorRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:103:2: ( ( INC | DEC )? factorTypologyRule ( INC | DEC )? | LP expressionRule RP )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==DEC||LA24_0==FALSE||LA24_0==FLOAT||LA24_0==ID||LA24_0==INC||LA24_0==INTEGER||LA24_0==STRING||LA24_0==THIS||LA24_0==TRUE) ) {
				alt24=1;
			}
			else if ( (LA24_0==LP) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:104:3: ( INC | DEC )? factorTypologyRule ( INC | DEC )?
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:104:3: ( INC | DEC )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==DEC||LA22_0==INC) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
							{
							if ( input.LA(1)==DEC||input.LA(1)==INC ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					pushFollow(FOLLOW_factorTypologyRule_in_factorRule433);
					factorTypologyRule();
					state._fsp--;

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:104:33: ( INC | DEC )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==DEC||LA23_0==INC) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
							{
							if ( input.LA(1)==DEC||input.LA(1)==INC ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:105:5: LP expressionRule RP
					{
					match(input,LP,FOLLOW_LP_in_factorRule446); 
					pushFollow(FOLLOW_expressionRule_in_factorRule448);
					expressionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_factorRule450); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "factorRule"



	// $ANTLR start "instructionRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:108:1: instructionRule : ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | blockRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule ) ( SC )? ;
	public final void instructionRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:109:2: ( ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | blockRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule ) ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:3: ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | blockRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule ) ( SC )?
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:3: ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | blockRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule )
			int alt25=13;
			switch ( input.LA(1) ) {
			case BREAK:
				{
				alt25=1;
				}
				break;
			case CONTINUE:
				{
				alt25=2;
				}
				break;
			case TRY:
				{
				alt25=3;
				}
				break;
			case FUNCTION:
				{
				alt25=4;
				}
				break;
			case LBR:
				{
				alt25=5;
				}
				break;
			case IF:
				{
				alt25=6;
				}
				break;
			case SWITCH:
				{
				alt25=7;
				}
				break;
			case FOR:
				{
				alt25=8;
				}
				break;
			case WHILE:
				{
				alt25=9;
				}
				break;
			case DO:
				{
				alt25=10;
				}
				break;
			case THROW:
				{
				alt25=11;
				}
				break;
			case TYPEOF:
				{
				alt25=12;
				}
				break;
			case CONST:
			case ID:
			case LET:
			case THIS:
			case VAR:
				{
				alt25=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:4: BREAK
					{
					match(input,BREAK,FOLLOW_BREAK_in_instructionRule464); 
					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:12: CONTINUE
					{
					match(input,CONTINUE,FOLLOW_CONTINUE_in_instructionRule468); 
					}
					break;
				case 3 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:23: tryCatchRule
					{
					pushFollow(FOLLOW_tryCatchRule_in_instructionRule472);
					tryCatchRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:38: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_instructionRule476);
					functionDefinitionRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:63: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_instructionRule480);
					blockRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:75: ifStatementRule
					{
					pushFollow(FOLLOW_ifStatementRule_in_instructionRule484);
					ifStatementRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:93: switchCaseRule
					{
					pushFollow(FOLLOW_switchCaseRule_in_instructionRule488);
					switchCaseRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:110: forRule
					{
					pushFollow(FOLLOW_forRule_in_instructionRule492);
					forRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:120: whileRule
					{
					pushFollow(FOLLOW_whileRule_in_instructionRule496);
					whileRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:132: doWhileRule
					{
					pushFollow(FOLLOW_doWhileRule_in_instructionRule500);
					doWhileRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:146: throwRule
					{
					pushFollow(FOLLOW_throwRule_in_instructionRule504);
					throwRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:158: typeOfRule
					{
					pushFollow(FOLLOW_typeOfRule_in_instructionRule508);
					typeOfRule();
					state._fsp--;

					}
					break;
				case 13 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:171: idStartingRule
					{
					pushFollow(FOLLOW_idStartingRule_in_instructionRule512);
					idStartingRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:111:3: ( SC )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==SC) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:111:3: SC
					{
					match(input,SC,FOLLOW_SC_in_instructionRule518); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "instructionRule"



	// $ANTLR start "throwRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:114:1: throwRule : THROW ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule ) ;
	public final void throwRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:115:2: ( THROW ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule ) )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:3: THROW ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule )
			{
			match(input,THROW,FOLLOW_THROW_in_throwRule533); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:9: ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule )
			int alt27=6;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt27=1;
				}
				break;
			case TRUE:
				{
				alt27=2;
				}
				break;
			case FALSE:
				{
				alt27=3;
				}
				break;
			case INTEGER:
				{
				alt27=4;
				}
				break;
			case FLOAT:
				{
				alt27=5;
				}
				break;
			case ID:
			case THIS:
				{
				alt27=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:10: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_throwRule536); 
					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:19: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_throwRule540); 
					}
					break;
				case 3 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:26: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_throwRule544); 
					}
					break;
				case 4 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:34: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_throwRule548); 
					}
					break;
				case 5 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:44: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_throwRule552); 
					}
					break;
				case 6 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:52: idDotArrayRule
					{
					pushFollow(FOLLOW_idDotArrayRule_in_throwRule556);
					idDotArrayRule();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "throwRule"



	// $ANTLR start "typeOfRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:119:1: typeOfRule : TYPEOF assignTypologyRule ;
	public final void typeOfRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:120:2: ( TYPEOF assignTypologyRule )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:121:3: TYPEOF assignTypologyRule
			{
			match(input,TYPEOF,FOLLOW_TYPEOF_in_typeOfRule572); 
			pushFollow(FOLLOW_assignTypologyRule_in_typeOfRule574);
			assignTypologyRule();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "typeOfRule"



	// $ANTLR start "tryCatchRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:126:1: tryCatchRule : TRY blockRule CATCH LP ID RP blockRule ( FINALLY blockRule )? ;
	public final void tryCatchRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:127:2: ( TRY blockRule CATCH LP ID RP blockRule ( FINALLY blockRule )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:3: TRY blockRule CATCH LP ID RP blockRule ( FINALLY blockRule )?
			{
			match(input,TRY,FOLLOW_TRY_in_tryCatchRule591); 
			pushFollow(FOLLOW_blockRule_in_tryCatchRule593);
			blockRule();
			state._fsp--;

			match(input,CATCH,FOLLOW_CATCH_in_tryCatchRule598); 
			match(input,LP,FOLLOW_LP_in_tryCatchRule600); 
			match(input,ID,FOLLOW_ID_in_tryCatchRule602); 
			match(input,RP,FOLLOW_RP_in_tryCatchRule604); 
			pushFollow(FOLLOW_blockRule_in_tryCatchRule606);
			blockRule();
			state._fsp--;

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:130:3: ( FINALLY blockRule )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==FINALLY) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:130:4: FINALLY blockRule
					{
					match(input,FINALLY,FOLLOW_FINALLY_in_tryCatchRule612); 
					pushFollow(FOLLOW_blockRule_in_tryCatchRule614);
					blockRule();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tryCatchRule"



	// $ANTLR start "returnRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:133:1: returnRule : RETURN ( expressionRule | assignTypologyRule ) ( SC )? ;
	public final void returnRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:134:2: ( RETURN ( expressionRule | assignTypologyRule ) ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:135:3: RETURN ( expressionRule | assignTypologyRule ) ( SC )?
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnRule630); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:135:10: ( expressionRule | assignTypologyRule )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==DEC||LA29_0==FALSE||LA29_0==FLOAT||LA29_0==ID||LA29_0==INC||LA29_0==INTEGER||LA29_0==LP||LA29_0==STRING||LA29_0==THIS||LA29_0==TRUE) ) {
				alt29=1;
			}
			else if ( (LA29_0==FUNCTION||(LA29_0 >= LB && LA29_0 <= LBR)||LA29_0==NEW||LA29_0==NULL||LA29_0==UNDEFINED) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:135:11: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_returnRule633);
					expressionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:135:26: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_returnRule635);
					assignTypologyRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:135:46: ( SC )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==SC) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:135:46: SC
					{
					match(input,SC,FOLLOW_SC_in_returnRule638); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "returnRule"



	// $ANTLR start "functionDeclarationRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:1: functionDeclarationRule : func= FUNCTION (name= ID )? LP ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )? RP ;
	public final void functionDeclarationRule() throws RecognitionException {
		Token func=null;
		Token name=null;

		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:139:2: (func= FUNCTION (name= ID )? LP ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )? RP )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:3: func= FUNCTION (name= ID )? LP ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )? RP
			{
			func=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclarationRule656); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:23: (name= ID )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==ID) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:23: name= ID
					{
					name=(Token)match(input,ID,FOLLOW_ID_in_functionDeclarationRule662); 
					}
					break;

			}

			h.checkFunctionName(name, func);
			match(input,LP,FOLLOW_LP_in_functionDeclarationRule667); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:69: ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==DEC||LA35_0==FALSE||LA35_0==FLOAT||LA35_0==FUNCTION||LA35_0==ID||LA35_0==INC||LA35_0==INTEGER||(LA35_0 >= LB && LA35_0 <= LBR)||LA35_0==LP||LA35_0==NEW||LA35_0==NULL||LA35_0==STRING||LA35_0==THIS||LA35_0==TRUE||LA35_0==UNDEFINED) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:70: ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* )
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:70: ( assignTypologyRule | expressionRule )
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==FUNCTION||(LA32_0 >= LB && LA32_0 <= LBR)||LA32_0==NEW||LA32_0==NULL||LA32_0==UNDEFINED) ) {
						alt32=1;
					}
					else if ( (LA32_0==DEC||LA32_0==FALSE||LA32_0==FLOAT||LA32_0==ID||LA32_0==INC||LA32_0==INTEGER||LA32_0==LP||LA32_0==STRING||LA32_0==THIS||LA32_0==TRUE) ) {
						alt32=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 32, 0, input);
						throw nvae;
					}

					switch (alt32) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:71: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_functionDeclarationRule671);
							assignTypologyRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:90: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_functionDeclarationRule673);
							expressionRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:106: ( ( CM ( assignTypologyRule | expressionRule ) )* )
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:107: ( CM ( assignTypologyRule | expressionRule ) )*
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:107: ( CM ( assignTypologyRule | expressionRule ) )*
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0==CM) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:108: CM ( assignTypologyRule | expressionRule )
							{
							match(input,CM,FOLLOW_CM_in_functionDeclarationRule678); 
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:111: ( assignTypologyRule | expressionRule )
							int alt33=2;
							int LA33_0 = input.LA(1);
							if ( (LA33_0==FUNCTION||(LA33_0 >= LB && LA33_0 <= LBR)||LA33_0==NEW||LA33_0==NULL||LA33_0==UNDEFINED) ) {
								alt33=1;
							}
							else if ( (LA33_0==DEC||LA33_0==FALSE||LA33_0==FLOAT||LA33_0==ID||LA33_0==INC||LA33_0==INTEGER||LA33_0==LP||LA33_0==STRING||LA33_0==THIS||LA33_0==TRUE) ) {
								alt33=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 33, 0, input);
								throw nvae;
							}

							switch (alt33) {
								case 1 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:112: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_functionDeclarationRule681);
									assignTypologyRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:131: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_functionDeclarationRule683);
									expressionRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop34;
						}
					}

					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionDeclarationRule691); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "functionDeclarationRule"



	// $ANTLR start "functionDefinitionRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:143:1: functionDefinitionRule : functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR ;
	public final void functionDefinitionRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:144:2: ( functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:145:3: functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR
			{
			pushFollow(FOLLOW_functionDeclarationRule_in_functionDefinitionRule706);
			functionDeclarationRule();
			state._fsp--;

			match(input,LBR,FOLLOW_LBR_in_functionDefinitionRule710); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:4: ( instructionRule )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==BREAK||(LA36_0 >= CONST && LA36_0 <= CONTINUE)||LA36_0==DO||(LA36_0 >= FOR && LA36_0 <= FUNCTION)||(LA36_0 >= ID && LA36_0 <= IF)||LA36_0==LBR||LA36_0==LET||LA36_0==SWITCH||(LA36_0 >= THIS && LA36_0 <= THROW)||(LA36_0 >= TRY && LA36_0 <= TYPEOF)||LA36_0==VAR||LA36_0==WHILE) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:4: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_functionDefinitionRule715);
					instructionRule();
					state._fsp--;

					}
					break;

				default :
					break loop36;
				}
			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:148:4: ( returnRule )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==RETURN) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:148:4: returnRule
					{
					pushFollow(FOLLOW_returnRule_in_functionDefinitionRule721);
					returnRule();
					state._fsp--;

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_functionDefinitionRule726); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "functionDefinitionRule"



	// $ANTLR start "arrayRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:158:1: arrayRule : LB ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )? RB ;
	public final void arrayRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:159:2: ( LB ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )? RB )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:160:3: LB ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )? RB
			{
			match(input,LB,FOLLOW_LB_in_arrayRule742); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:161:4: ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==DEC||LA41_0==FALSE||LA41_0==FLOAT||LA41_0==FUNCTION||LA41_0==ID||LA41_0==INC||LA41_0==INTEGER||(LA41_0 >= LB && LA41_0 <= LBR)||LA41_0==LP||LA41_0==NEW||LA41_0==NULL||LA41_0==STRING||LA41_0==THIS||LA41_0==TRUE||LA41_0==UNDEFINED) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:4: ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )*
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:4: ( expressionRule | assignTypologyRule )
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==DEC||LA38_0==FALSE||LA38_0==FLOAT||LA38_0==ID||LA38_0==INC||LA38_0==INTEGER||LA38_0==LP||LA38_0==STRING||LA38_0==THIS||LA38_0==TRUE) ) {
						alt38=1;
					}
					else if ( (LA38_0==FUNCTION||(LA38_0 >= LB && LA38_0 <= LBR)||LA38_0==NEW||LA38_0==NULL||LA38_0==UNDEFINED) ) {
						alt38=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 38, 0, input);
						throw nvae;
					}

					switch (alt38) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:5: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_arrayRule753);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:20: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_arrayRule755);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:163:4: ( CM ( expressionRule | assignTypologyRule )? )*
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0==CM) ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:163:5: CM ( expressionRule | assignTypologyRule )?
							{
							match(input,CM,FOLLOW_CM_in_arrayRule762); 
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:163:8: ( expressionRule | assignTypologyRule )?
							int alt39=3;
							int LA39_0 = input.LA(1);
							if ( (LA39_0==DEC||LA39_0==FALSE||LA39_0==FLOAT||LA39_0==ID||LA39_0==INC||LA39_0==INTEGER||LA39_0==LP||LA39_0==STRING||LA39_0==THIS||LA39_0==TRUE) ) {
								alt39=1;
							}
							else if ( (LA39_0==FUNCTION||(LA39_0 >= LB && LA39_0 <= LBR)||LA39_0==NEW||LA39_0==NULL||LA39_0==UNDEFINED) ) {
								alt39=2;
							}
							switch (alt39) {
								case 1 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:163:9: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_arrayRule765);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:163:24: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_arrayRule767);
									assignTypologyRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop40;
						}
					}

					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_arrayRule781); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arrayRule"



	// $ANTLR start "objectRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:168:1: objectRule : LBR ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )? RBR ;
	public final void objectRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:169:2: ( LBR ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )? RBR )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:170:3: LBR ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )? RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectRule796); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:171:4: ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==ID||LA45_0==STRING) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:172:4: ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )*
					{
					if ( input.LA(1)==ID||input.LA(1)==STRING ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,CL,FOLLOW_CL_in_objectRule818); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:174:4: ( expressionRule | assignTypologyRule )
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==DEC||LA42_0==FALSE||LA42_0==FLOAT||LA42_0==ID||LA42_0==INC||LA42_0==INTEGER||LA42_0==LP||LA42_0==STRING||LA42_0==THIS||LA42_0==TRUE) ) {
						alt42=1;
					}
					else if ( (LA42_0==FUNCTION||(LA42_0 >= LB && LA42_0 <= LBR)||LA42_0==NEW||LA42_0==NULL||LA42_0==UNDEFINED) ) {
						alt42=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 42, 0, input);
						throw nvae;
					}

					switch (alt42) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:174:5: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_objectRule825);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:174:20: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_objectRule827);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:175:4: ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )*
					loop44:
					while (true) {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==CM) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:176:4: CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule )
							{
							match(input,CM,FOLLOW_CM_in_objectRule838); 
							if ( input.LA(1)==ID||input.LA(1)==STRING ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,CL,FOLLOW_CL_in_objectRule855); 
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:179:4: ( expressionRule | assignTypologyRule )
							int alt43=2;
							int LA43_0 = input.LA(1);
							if ( (LA43_0==DEC||LA43_0==FALSE||LA43_0==FLOAT||LA43_0==ID||LA43_0==INC||LA43_0==INTEGER||LA43_0==LP||LA43_0==STRING||LA43_0==THIS||LA43_0==TRUE) ) {
								alt43=1;
							}
							else if ( (LA43_0==FUNCTION||(LA43_0 >= LB && LA43_0 <= LBR)||LA43_0==NEW||LA43_0==NULL||LA43_0==UNDEFINED) ) {
								alt43=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 43, 0, input);
								throw nvae;
							}

							switch (alt43) {
								case 1 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:179:5: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_objectRule862);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:179:20: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_objectRule864);
									assignTypologyRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop44;
						}
					}

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_objectRule881); 
			System.out.println("Ho riconosciuto JSON");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "objectRule"


	public static class variableDefinitionRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "variableDefinitionRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:187:1: variableDefinitionRule : ( VAR | LET | CONST )? idDotArrayRule ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? ;
	public final JavaScriptToJQueryConverterParser.variableDefinitionRule_return variableDefinitionRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.variableDefinitionRule_return retval = new JavaScriptToJQueryConverterParser.variableDefinitionRule_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:2: ( ( VAR | LET | CONST )? idDotArrayRule ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:189:3: ( VAR | LET | CONST )? idDotArrayRule ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:189:3: ( VAR | LET | CONST )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==CONST||LA46_0==LET||LA46_0==VAR) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
					{
					if ( input.LA(1)==CONST||input.LA(1)==LET||input.LA(1)==VAR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			pushFollow(FOLLOW_idDotArrayRule_in_variableDefinitionRule917);
			idDotArrayRule();
			state._fsp--;

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:191:3: ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==ASSIGN||LA48_0==DIVEQ||LA48_0==EXPEQ||LA48_0==MINUSEQ||LA48_0==MODEQ||LA48_0==PLUSEQ||LA48_0==STAREQ) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:191:4: ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule )
					{
					if ( input.LA(1)==ASSIGN||input.LA(1)==DIVEQ||input.LA(1)==EXPEQ||input.LA(1)==MINUSEQ||input.LA(1)==MODEQ||input.LA(1)==PLUSEQ||input.LA(1)==STAREQ ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:191:53: ( expressionRule | assignTypologyRule )
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==DEC||LA47_0==FALSE||LA47_0==FLOAT||LA47_0==ID||LA47_0==INC||LA47_0==INTEGER||LA47_0==LP||LA47_0==STRING||LA47_0==THIS||LA47_0==TRUE) ) {
						alt47=1;
					}
					else if ( (LA47_0==FUNCTION||(LA47_0 >= LB && LA47_0 <= LBR)||LA47_0==NEW||LA47_0==NULL||LA47_0==UNDEFINED) ) {
						alt47=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						throw nvae;
					}

					switch (alt47) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:191:54: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_variableDefinitionRule939);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:191:69: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_variableDefinitionRule941);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}

			System.out.println(input.toString(retval.start,input.LT(-1)));
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableDefinitionRule"



	// $ANTLR start "idStartingRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:195:1: idStartingRule : ( VAR | LET | CONST )? idDotArrayRule ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID ) ;
	public final void idStartingRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:196:2: ( ( VAR | LET | CONST )? idDotArrayRule ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID ) )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:197:3: ( VAR | LET | CONST )? idDotArrayRule ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID )
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:197:3: ( VAR | LET | CONST )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==CONST||LA49_0==LET||LA49_0==VAR) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
					{
					if ( input.LA(1)==CONST||input.LA(1)==LET||input.LA(1)==VAR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			pushFollow(FOLLOW_idDotArrayRule_in_idStartingRule977);
			idDotArrayRule();
			state._fsp--;

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:198:18: ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==EOF||LA52_0==ASSIGN||(LA52_0 >= BREAK && LA52_0 <= CASE)||LA52_0==CLASS||(LA52_0 >= CONST && LA52_0 <= CONTINUE)||LA52_0==DEFAULT||(LA52_0 >= DIVEQ && LA52_0 <= DO)||LA52_0==ELSE||LA52_0==EXPEQ||(LA52_0 >= FOR && LA52_0 <= FUNCTION)||(LA52_0 >= ID && LA52_0 <= IF)||LA52_0==LBR||LA52_0==LET||LA52_0==MINUSEQ||LA52_0==MODEQ||LA52_0==PLUSEQ||(LA52_0 >= RBR && LA52_0 <= RETURN)||LA52_0==SC||LA52_0==STAREQ||LA52_0==SWITCH||(LA52_0 >= THIS && LA52_0 <= THROW)||(LA52_0 >= TRY && LA52_0 <= TYPEOF)||LA52_0==VAR||LA52_0==WHILE) ) {
				alt52=1;
			}
			else if ( (LA52_0==INSTANCEOF) ) {
				alt52=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:198:20: ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:198:20: ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==ASSIGN||LA51_0==DIVEQ||LA51_0==EXPEQ||LA51_0==MINUSEQ||LA51_0==MODEQ||LA51_0==PLUSEQ||LA51_0==STAREQ) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:198:21: ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule )
							{
							if ( input.LA(1)==ASSIGN||input.LA(1)==DIVEQ||input.LA(1)==EXPEQ||input.LA(1)==MINUSEQ||input.LA(1)==MODEQ||input.LA(1)==PLUSEQ||input.LA(1)==STAREQ ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:198:70: ( expressionRule | assignTypologyRule )
							int alt50=2;
							int LA50_0 = input.LA(1);
							if ( (LA50_0==DEC||LA50_0==FALSE||LA50_0==FLOAT||LA50_0==ID||LA50_0==INC||LA50_0==INTEGER||LA50_0==LP||LA50_0==STRING||LA50_0==THIS||LA50_0==TRUE) ) {
								alt50=1;
							}
							else if ( (LA50_0==FUNCTION||(LA50_0 >= LB && LA50_0 <= LBR)||LA50_0==NEW||LA50_0==NULL||LA50_0==UNDEFINED) ) {
								alt50=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 50, 0, input);
								throw nvae;
							}

							switch (alt50) {
								case 1 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:198:71: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_idStartingRule999);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:198:86: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_idStartingRule1001);
									assignTypologyRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:198:110: INSTANCEOF ID
					{
					match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_idStartingRule1008); 
					match(input,ID,FOLLOW_ID_in_idStartingRule1010); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "idStartingRule"



	// $ANTLR start "newRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:202:1: newRule : NEW ID LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP ;
	public final void newRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:203:2: ( NEW ID LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:204:3: NEW ID LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP
			{
			match(input,NEW,FOLLOW_NEW_in_newRule1026); 
			match(input,ID,FOLLOW_ID_in_newRule1028); 
			match(input,LP,FOLLOW_LP_in_newRule1030); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:204:13: ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==DEC||LA56_0==FALSE||LA56_0==FLOAT||LA56_0==FUNCTION||LA56_0==ID||LA56_0==INC||LA56_0==INTEGER||(LA56_0 >= LB && LA56_0 <= LBR)||LA56_0==LP||LA56_0==NEW||LA56_0==NULL||LA56_0==STRING||LA56_0==THIS||LA56_0==TRUE||LA56_0==UNDEFINED) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:204:14: ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )*
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:204:14: ( expressionRule | assignTypologyRule )
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==DEC||LA53_0==FALSE||LA53_0==FLOAT||LA53_0==ID||LA53_0==INC||LA53_0==INTEGER||LA53_0==LP||LA53_0==STRING||LA53_0==THIS||LA53_0==TRUE) ) {
						alt53=1;
					}
					else if ( (LA53_0==FUNCTION||(LA53_0 >= LB && LA53_0 <= LBR)||LA53_0==NEW||LA53_0==NULL||LA53_0==UNDEFINED) ) {
						alt53=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 53, 0, input);
						throw nvae;
					}

					switch (alt53) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:204:15: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_newRule1034);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:204:30: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_newRule1036);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:204:50: ( CM ( expressionRule | assignTypologyRule ) )*
					loop55:
					while (true) {
						int alt55=2;
						int LA55_0 = input.LA(1);
						if ( (LA55_0==CM) ) {
							alt55=1;
						}

						switch (alt55) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:204:51: CM ( expressionRule | assignTypologyRule )
							{
							match(input,CM,FOLLOW_CM_in_newRule1040); 
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:204:54: ( expressionRule | assignTypologyRule )
							int alt54=2;
							int LA54_0 = input.LA(1);
							if ( (LA54_0==DEC||LA54_0==FALSE||LA54_0==FLOAT||LA54_0==ID||LA54_0==INC||LA54_0==INTEGER||LA54_0==LP||LA54_0==STRING||LA54_0==THIS||LA54_0==TRUE) ) {
								alt54=1;
							}
							else if ( (LA54_0==FUNCTION||(LA54_0 >= LB && LA54_0 <= LBR)||LA54_0==NEW||LA54_0==NULL||LA54_0==UNDEFINED) ) {
								alt54=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 54, 0, input);
								throw nvae;
							}

							switch (alt54) {
								case 1 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:204:55: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_newRule1043);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:204:70: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_newRule1045);
									assignTypologyRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop55;
						}
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_newRule1052); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "newRule"



	// $ANTLR start "arithmeticOperatorsRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:207:1: arithmeticOperatorsRule : ( ADD | SUB | STAR | DIV | MOD | INC | DEC | EXP ) ;
	public final void arithmeticOperatorsRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:208:2: ( ( ADD | SUB | STAR | DIV | MOD | INC | DEC | EXP ) )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
			{
			if ( input.LA(1)==ADD||input.LA(1)==DEC||input.LA(1)==DIV||input.LA(1)==EXP||input.LA(1)==INC||input.LA(1)==MOD||input.LA(1)==STAR||input.LA(1)==SUB ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arithmeticOperatorsRule"



	// $ANTLR start "comparatorRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:219:1: comparatorRule : ( EQ | NEQ | LT | LE | GT | GE | TEQ | NTEQ ) ;
	public final void comparatorRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:220:2: ( ( EQ | NEQ | LT | LE | GT | GE | TEQ | NTEQ ) )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
			{
			if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NEQ||input.LA(1)==NTEQ||input.LA(1)==TEQ ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "comparatorRule"



	// $ANTLR start "conditionRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:224:1: conditionRule : ( NOT )? expressionRule ( comparatorRule ( NOT )? expressionRule )? ( ( AND | OR ) conditionRule )* ;
	public final void conditionRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:2: ( ( NOT )? expressionRule ( comparatorRule ( NOT )? expressionRule )? ( ( AND | OR ) conditionRule )* )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:226:3: ( NOT )? expressionRule ( comparatorRule ( NOT )? expressionRule )? ( ( AND | OR ) conditionRule )*
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:226:3: ( NOT )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==NOT) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:226:3: NOT
					{
					match(input,NOT,FOLLOW_NOT_in_conditionRule1161); 
					}
					break;

			}

			pushFollow(FOLLOW_expressionRule_in_conditionRule1164);
			expressionRule();
			state._fsp--;

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:226:23: ( comparatorRule ( NOT )? expressionRule )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==EQ||(LA59_0 >= GE && LA59_0 <= GT)||LA59_0==LE||LA59_0==LT||LA59_0==NEQ||LA59_0==NTEQ||LA59_0==TEQ) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:226:24: comparatorRule ( NOT )? expressionRule
					{
					pushFollow(FOLLOW_comparatorRule_in_conditionRule1167);
					comparatorRule();
					state._fsp--;

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:226:39: ( NOT )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==NOT) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:226:39: NOT
							{
							match(input,NOT,FOLLOW_NOT_in_conditionRule1169); 
							}
							break;

					}

					pushFollow(FOLLOW_expressionRule_in_conditionRule1172);
					expressionRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:3: ( ( AND | OR ) conditionRule )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==AND||LA60_0==OR) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:4: ( AND | OR ) conditionRule
					{
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_conditionRule_in_conditionRule1185);
					conditionRule();
					state._fsp--;

					}
					break;

				default :
					break loop60;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "conditionRule"



	// $ANTLR start "blockRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:230:1: blockRule : LBR ( instructionRule )* RBR ;
	public final void blockRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:2: ( LBR ( instructionRule )* RBR )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:232:3: LBR ( instructionRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_blockRule1201); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:232:7: ( instructionRule )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==BREAK||(LA61_0 >= CONST && LA61_0 <= CONTINUE)||LA61_0==DO||(LA61_0 >= FOR && LA61_0 <= FUNCTION)||(LA61_0 >= ID && LA61_0 <= IF)||LA61_0==LBR||LA61_0==LET||LA61_0==SWITCH||(LA61_0 >= THIS && LA61_0 <= THROW)||(LA61_0 >= TRY && LA61_0 <= TYPEOF)||LA61_0==VAR||LA61_0==WHILE) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:232:7: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_blockRule1203);
					instructionRule();
					state._fsp--;

					}
					break;

				default :
					break loop61;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_blockRule1206); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "blockRule"


	public static class ifStatementRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "ifStatementRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:235:1: ifStatementRule : IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )* ;
	public final JavaScriptToJQueryConverterParser.ifStatementRule_return ifStatementRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.ifStatementRule_return retval = new JavaScriptToJQueryConverterParser.ifStatementRule_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:236:2: ( IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )* )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:237:3: IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )*
			{
			match(input,IF,FOLLOW_IF_in_ifStatementRule1221); 
			match(input,LP,FOLLOW_LP_in_ifStatementRule1223); 
			pushFollow(FOLLOW_conditionRule_in_ifStatementRule1225);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_ifStatementRule1227); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:4: ( blockRule | instructionRule )
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==LBR) ) {
				alt62=1;
			}
			else if ( (LA62_0==BREAK||(LA62_0 >= CONST && LA62_0 <= CONTINUE)||LA62_0==DO||(LA62_0 >= FOR && LA62_0 <= FUNCTION)||(LA62_0 >= ID && LA62_0 <= IF)||LA62_0==LET||LA62_0==SWITCH||(LA62_0 >= THIS && LA62_0 <= THROW)||(LA62_0 >= TRY && LA62_0 <= TYPEOF)||LA62_0==VAR||LA62_0==WHILE) ) {
				alt62=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_ifStatementRule1234);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_ifStatementRule1238);
					instructionRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:239:3: ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==ELSE) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:239:4: ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule )
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStatementRule1244); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:239:9: ( IF LP conditionRule RP )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==IF) ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:239:10: IF LP conditionRule RP
							{
							match(input,IF,FOLLOW_IF_in_ifStatementRule1247); 
							match(input,LP,FOLLOW_LP_in_ifStatementRule1249); 
							pushFollow(FOLLOW_conditionRule_in_ifStatementRule1251);
							conditionRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_ifStatementRule1253); 
							}
							break;

					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:239:35: ( blockRule | instructionRule )
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==LBR) ) {
						alt64=1;
					}
					else if ( (LA64_0==BREAK||(LA64_0 >= CONST && LA64_0 <= CONTINUE)||LA64_0==DO||(LA64_0 >= FOR && LA64_0 <= FUNCTION)||(LA64_0 >= ID && LA64_0 <= IF)||LA64_0==LET||LA64_0==SWITCH||(LA64_0 >= THIS && LA64_0 <= THROW)||(LA64_0 >= TRY && LA64_0 <= TYPEOF)||LA64_0==VAR||LA64_0==WHILE) ) {
						alt64=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 64, 0, input);
						throw nvae;
					}

					switch (alt64) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:239:36: blockRule
							{
							pushFollow(FOLLOW_blockRule_in_ifStatementRule1258);
							blockRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:239:48: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_ifStatementRule1262);
							instructionRule();
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop65;
				}
			}

			System.out.println(input.toString(retval.start,input.LT(-1)));
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStatementRule"


	public static class switchCaseRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "switchCaseRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:242:1: switchCaseRule : SWITCH LP ( expressionRule | assignTypologyRule ) RP LBR ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )+ ( DEFAULT CL ( instructionRule )* )? RBR ;
	public final JavaScriptToJQueryConverterParser.switchCaseRule_return switchCaseRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.switchCaseRule_return retval = new JavaScriptToJQueryConverterParser.switchCaseRule_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:2: ( SWITCH LP ( expressionRule | assignTypologyRule ) RP LBR ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )+ ( DEFAULT CL ( instructionRule )* )? RBR )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:244:3: SWITCH LP ( expressionRule | assignTypologyRule ) RP LBR ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )+ ( DEFAULT CL ( instructionRule )* )? RBR
			{
			match(input,SWITCH,FOLLOW_SWITCH_in_switchCaseRule1282); 
			match(input,LP,FOLLOW_LP_in_switchCaseRule1284); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:244:13: ( expressionRule | assignTypologyRule )
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==DEC||LA66_0==FALSE||LA66_0==FLOAT||LA66_0==ID||LA66_0==INC||LA66_0==INTEGER||LA66_0==LP||LA66_0==STRING||LA66_0==THIS||LA66_0==TRUE) ) {
				alt66=1;
			}
			else if ( (LA66_0==FUNCTION||(LA66_0 >= LB && LA66_0 <= LBR)||LA66_0==NEW||LA66_0==NULL||LA66_0==UNDEFINED) ) {
				alt66=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:244:14: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_switchCaseRule1287);
					expressionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:244:29: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_switchCaseRule1289);
					assignTypologyRule();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_switchCaseRule1292); 
			match(input,LBR,FOLLOW_LBR_in_switchCaseRule1296); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:246:4: ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )+
			int cnt69=0;
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==CASE) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:246:5: CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )*
					{
					match(input,CASE,FOLLOW_CASE_in_switchCaseRule1302); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:246:10: ( expressionRule | assignTypologyRule )
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0==DEC||LA67_0==FALSE||LA67_0==FLOAT||LA67_0==ID||LA67_0==INC||LA67_0==INTEGER||LA67_0==LP||LA67_0==STRING||LA67_0==THIS||LA67_0==TRUE) ) {
						alt67=1;
					}
					else if ( (LA67_0==FUNCTION||(LA67_0 >= LB && LA67_0 <= LBR)||LA67_0==NEW||LA67_0==NULL||LA67_0==UNDEFINED) ) {
						alt67=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 67, 0, input);
						throw nvae;
					}

					switch (alt67) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:246:11: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_switchCaseRule1305);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:246:26: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_switchCaseRule1307);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					match(input,CL,FOLLOW_CL_in_switchCaseRule1310); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:247:5: ( instructionRule )*
					loop68:
					while (true) {
						int alt68=2;
						int LA68_0 = input.LA(1);
						if ( (LA68_0==BREAK||(LA68_0 >= CONST && LA68_0 <= CONTINUE)||LA68_0==DO||(LA68_0 >= FOR && LA68_0 <= FUNCTION)||(LA68_0 >= ID && LA68_0 <= IF)||LA68_0==LBR||LA68_0==LET||LA68_0==SWITCH||(LA68_0 >= THIS && LA68_0 <= THROW)||(LA68_0 >= TRY && LA68_0 <= TYPEOF)||LA68_0==VAR||LA68_0==WHILE) ) {
							alt68=1;
						}

						switch (alt68) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:247:5: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_switchCaseRule1316);
							instructionRule();
							state._fsp--;

							}
							break;

						default :
							break loop68;
						}
					}

					}
					break;

				default :
					if ( cnt69 >= 1 ) break loop69;
					EarlyExitException eee = new EarlyExitException(69, input);
					throw eee;
				}
				cnt69++;
			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:249:4: ( DEFAULT CL ( instructionRule )* )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==DEFAULT) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:249:5: DEFAULT CL ( instructionRule )*
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_switchCaseRule1329); 
					match(input,CL,FOLLOW_CL_in_switchCaseRule1331); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:250:5: ( instructionRule )*
					loop70:
					while (true) {
						int alt70=2;
						int LA70_0 = input.LA(1);
						if ( (LA70_0==BREAK||(LA70_0 >= CONST && LA70_0 <= CONTINUE)||LA70_0==DO||(LA70_0 >= FOR && LA70_0 <= FUNCTION)||(LA70_0 >= ID && LA70_0 <= IF)||LA70_0==LBR||LA70_0==LET||LA70_0==SWITCH||(LA70_0 >= THIS && LA70_0 <= THROW)||(LA70_0 >= TRY && LA70_0 <= TYPEOF)||LA70_0==VAR||LA70_0==WHILE) ) {
							alt70=1;
						}

						switch (alt70) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:250:5: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_switchCaseRule1337);
							instructionRule();
							state._fsp--;

							}
							break;

						default :
							break loop70;
						}
					}

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_switchCaseRule1348); 
			System.out.println(input.toString(retval.start,input.LT(-1)));
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "switchCaseRule"



	// $ANTLR start "forRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:256:1: forRule : FOR LP ( forInitVarRule )? SC ( conditionRule )? SC ( stepRule )? RP ( blockRule | instructionRule ) ;
	public final void forRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:257:2: ( FOR LP ( forInitVarRule )? SC ( conditionRule )? SC ( stepRule )? RP ( blockRule | instructionRule ) )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:258:3: FOR LP ( forInitVarRule )? SC ( conditionRule )? SC ( stepRule )? RP ( blockRule | instructionRule )
			{
			match(input,FOR,FOLLOW_FOR_in_forRule1367); 
			match(input,LP,FOLLOW_LP_in_forRule1369); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:258:10: ( forInitVarRule )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==ID||LA72_0==LET||LA72_0==THIS||LA72_0==VAR) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:258:10: forInitVarRule
					{
					pushFollow(FOLLOW_forInitVarRule_in_forRule1371);
					forInitVarRule();
					state._fsp--;

					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_forRule1374); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:258:29: ( conditionRule )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==DEC||LA73_0==FALSE||LA73_0==FLOAT||LA73_0==ID||LA73_0==INC||LA73_0==INTEGER||LA73_0==LP||LA73_0==NOT||LA73_0==STRING||LA73_0==THIS||LA73_0==TRUE) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:258:29: conditionRule
					{
					pushFollow(FOLLOW_conditionRule_in_forRule1376);
					conditionRule();
					state._fsp--;

					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_forRule1379); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:258:47: ( stepRule )?
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==DEC||LA74_0==ID||LA74_0==INC) ) {
				alt74=1;
			}
			switch (alt74) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:258:47: stepRule
					{
					pushFollow(FOLLOW_stepRule_in_forRule1381);
					stepRule();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_forRule1384); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:259:4: ( blockRule | instructionRule )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==LBR) ) {
				alt75=1;
			}
			else if ( (LA75_0==BREAK||(LA75_0 >= CONST && LA75_0 <= CONTINUE)||LA75_0==DO||(LA75_0 >= FOR && LA75_0 <= FUNCTION)||(LA75_0 >= ID && LA75_0 <= IF)||LA75_0==LET||LA75_0==SWITCH||(LA75_0 >= THIS && LA75_0 <= THROW)||(LA75_0 >= TRY && LA75_0 <= TYPEOF)||LA75_0==VAR||LA75_0==WHILE) ) {
				alt75=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:259:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_forRule1390);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:259:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_forRule1394);
					instructionRule();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "forRule"



	// $ANTLR start "forInitVarRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:262:1: forInitVarRule : ( VAR | LET )? idDotArrayRule ASSIGN ( expressionRule | assignTypologyRule ) ;
	public final void forInitVarRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:263:2: ( ( VAR | LET )? idDotArrayRule ASSIGN ( expressionRule | assignTypologyRule ) )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:264:3: ( VAR | LET )? idDotArrayRule ASSIGN ( expressionRule | assignTypologyRule )
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:264:3: ( VAR | LET )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==LET||LA76_0==VAR) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
					{
					if ( input.LA(1)==LET||input.LA(1)==VAR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			pushFollow(FOLLOW_idDotArrayRule_in_forInitVarRule1417);
			idDotArrayRule();
			state._fsp--;

			match(input,ASSIGN,FOLLOW_ASSIGN_in_forInitVarRule1419); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:264:38: ( expressionRule | assignTypologyRule )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==DEC||LA77_0==FALSE||LA77_0==FLOAT||LA77_0==ID||LA77_0==INC||LA77_0==INTEGER||LA77_0==LP||LA77_0==STRING||LA77_0==THIS||LA77_0==TRUE) ) {
				alt77=1;
			}
			else if ( (LA77_0==FUNCTION||(LA77_0 >= LB && LA77_0 <= LBR)||LA77_0==NEW||LA77_0==NULL||LA77_0==UNDEFINED) ) {
				alt77=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:264:39: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_forInitVarRule1422);
					expressionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:264:54: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_forInitVarRule1424);
					assignTypologyRule();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "forInitVarRule"



	// $ANTLR start "stepRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:267:1: stepRule : (o1= incDecRule )? i= ID (o2= incDecRule )? ;
	public final void stepRule() throws RecognitionException {
		Token i=null;
		Token o1 =null;
		Token o2 =null;

		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:268:2: ( (o1= incDecRule )? i= ID (o2= incDecRule )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:269:3: (o1= incDecRule )? i= ID (o2= incDecRule )?
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:269:3: (o1= incDecRule )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==DEC||LA78_0==INC) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:269:4: o1= incDecRule
					{
					pushFollow(FOLLOW_incDecRule_in_stepRule1444);
					o1=incDecRule();
					state._fsp--;

					}
					break;

			}

			i=(Token)match(input,ID,FOLLOW_ID_in_stepRule1453); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:271:3: (o2= incDecRule )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==DEC||LA79_0==INC) ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:271:4: o2= incDecRule
					{
					pushFollow(FOLLOW_incDecRule_in_stepRule1461);
					o2=incDecRule();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stepRule"



	// $ANTLR start "incDecRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:274:1: incDecRule returns [Token tk] : (o1= DEC |o2= INC );
	public final Token incDecRule() throws RecognitionException {
		Token tk = null;


		Token o1=null;
		Token o2=null;

		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:275:2: (o1= DEC |o2= INC )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==DEC) ) {
				alt80=1;
			}
			else if ( (LA80_0==INC) ) {
				alt80=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:276:3: o1= DEC
					{
					o1=(Token)match(input,DEC,FOLLOW_DEC_in_incDecRule1483); 
					tk = o1;
					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:277:4: o2= INC
					{
					o2=(Token)match(input,INC,FOLLOW_INC_in_incDecRule1494); 
					tk = o2;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tk;
	}
	// $ANTLR end "incDecRule"



	// $ANTLR start "whileRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:280:1: whileRule : WHILE LP conditionRule RP ( blockRule | instructionRule ) ;
	public final void whileRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:281:2: ( WHILE LP conditionRule RP ( blockRule | instructionRule ) )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:282:3: WHILE LP conditionRule RP ( blockRule | instructionRule )
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileRule1511); 
			match(input,LP,FOLLOW_LP_in_whileRule1513); 
			pushFollow(FOLLOW_conditionRule_in_whileRule1515);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_whileRule1517); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:283:4: ( blockRule | instructionRule )
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==LBR) ) {
				alt81=1;
			}
			else if ( (LA81_0==BREAK||(LA81_0 >= CONST && LA81_0 <= CONTINUE)||LA81_0==DO||(LA81_0 >= FOR && LA81_0 <= FUNCTION)||(LA81_0 >= ID && LA81_0 <= IF)||LA81_0==LET||LA81_0==SWITCH||(LA81_0 >= THIS && LA81_0 <= THROW)||(LA81_0 >= TRY && LA81_0 <= TYPEOF)||LA81_0==VAR||LA81_0==WHILE) ) {
				alt81=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:283:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_whileRule1523);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:283:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_whileRule1527);
					instructionRule();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "whileRule"



	// $ANTLR start "doWhileRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:286:1: doWhileRule : DO ( blockRule | instructionRule ) WHILE LP conditionRule RP ( SC )? ;
	public final void doWhileRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:287:2: ( DO ( blockRule | instructionRule ) WHILE LP conditionRule RP ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:288:3: DO ( blockRule | instructionRule ) WHILE LP conditionRule RP ( SC )?
			{
			match(input,DO,FOLLOW_DO_in_doWhileRule1541); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:289:4: ( blockRule | instructionRule )
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==LBR) ) {
				alt82=1;
			}
			else if ( (LA82_0==BREAK||(LA82_0 >= CONST && LA82_0 <= CONTINUE)||LA82_0==DO||(LA82_0 >= FOR && LA82_0 <= FUNCTION)||(LA82_0 >= ID && LA82_0 <= IF)||LA82_0==LET||LA82_0==SWITCH||(LA82_0 >= THIS && LA82_0 <= THROW)||(LA82_0 >= TRY && LA82_0 <= TYPEOF)||LA82_0==VAR||LA82_0==WHILE) ) {
				alt82=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}

			switch (alt82) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:289:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_doWhileRule1547);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:289:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_doWhileRule1551);
					instructionRule();
					state._fsp--;

					}
					break;

			}

			match(input,WHILE,FOLLOW_WHILE_in_doWhileRule1556); 
			match(input,LP,FOLLOW_LP_in_doWhileRule1558); 
			pushFollow(FOLLOW_conditionRule_in_doWhileRule1560);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_doWhileRule1562); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:290:29: ( SC )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==SC) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:290:29: SC
					{
					match(input,SC,FOLLOW_SC_in_doWhileRule1564); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "doWhileRule"



	// $ANTLR start "classRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:293:1: classRule : CLASS ID LBR ( functionDefinitionRule )* RBR ;
	public final void classRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:294:2: ( CLASS ID LBR ( functionDefinitionRule )* RBR )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:295:3: CLASS ID LBR ( functionDefinitionRule )* RBR
			{
			match(input,CLASS,FOLLOW_CLASS_in_classRule1579); 
			match(input,ID,FOLLOW_ID_in_classRule1581); 
			match(input,LBR,FOLLOW_LBR_in_classRule1586); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:297:4: ( functionDefinitionRule )*
			loop84:
			while (true) {
				int alt84=2;
				int LA84_0 = input.LA(1);
				if ( (LA84_0==FUNCTION) ) {
					alt84=1;
				}

				switch (alt84) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:297:4: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_classRule1592);
					functionDefinitionRule();
					state._fsp--;

					}
					break;

				default :
					break loop84;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_classRule1597); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classRule"

	// Delegated rules



	public static final BitSet FOLLOW_instructionRule_in_parseJava64 = new BitSet(new long[]{0x0A018C0004064402L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_classRule_in_parseJava70 = new BitSet(new long[]{0x0A018C0004064402L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_DOCUMENT_in_getRule85 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_DOT_in_getRule89 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_getRule93 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_getRule97 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_STRING_in_getRule99 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_getRule101 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_getRule103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule120 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotIdRule123 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule125 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_STRING_in_factorTypologyRule142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_factorTypologyRule146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_factorTypologyRule150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factorTypologyRule154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factorTypologyRule158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_factorTypologyRule162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectRule_in_assignTypologyRule178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRule_in_assignTypologyRule182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_assignTypologyRule186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNDEFINED_in_assignTypologyRule190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_assignTypologyRule194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newRule_in_assignTypologyRule198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotIdRule_in_idDotSubRule216 = new BitSet(new long[]{0x2100000000000000L});
	public static final BitSet FOLLOW_LB_in_idDotSubRule220 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_idDotSubRule222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_idDotSubRule224 = new BitSet(new long[]{0x2100000000000002L});
	public static final BitSet FOLLOW_LP_in_idDotSubRule229 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284100090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idDotSubRule233 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_idDotSubRule235 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_idDotSubRule239 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idDotSubRule242 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_idDotSubRule244 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_idDotSubRule251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_idDotSubRule258 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284100090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idDotSubRule262 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_idDotSubRule264 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_idDotSubRule268 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idDotSubRule271 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_idDotSubRule273 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_idDotSubRule279 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_LB_in_idDotSubRule283 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_idDotSubRule285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_idDotSubRule287 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_idDotIdRule_in_idTestRule304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_in_idDotArrayRule319 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRule321 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_idTestRule_in_idDotArrayRule325 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_termRule_in_expressionRule339 = new BitSet(new long[]{0x0000000000000012L,0x0000000008000002L});
	public static final BitSet FOLLOW_set_in_expressionRule342 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_termRule_in_expressionRule354 = new BitSet(new long[]{0x0000000000000012L,0x0000000008000002L});
	public static final BitSet FOLLOW_factorRule_in_termRule370 = new BitSet(new long[]{0x4000000401000042L,0x0000104000A00400L});
	public static final BitSet FOLLOW_set_in_termRule373 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_factorRule_in_termRule409 = new BitSet(new long[]{0x4000000401000042L,0x0000104000A00400L});
	public static final BitSet FOLLOW_factorTypologyRule_in_factorRule433 = new BitSet(new long[]{0x0010000000100002L});
	public static final BitSet FOLLOW_LP_in_factorRule446 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_factorRule448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_factorRule450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_instructionRule464 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_CONTINUE_in_instructionRule468 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_tryCatchRule_in_instructionRule472 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_instructionRule476 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_blockRule_in_instructionRule480 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_ifStatementRule_in_instructionRule484 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_switchCaseRule_in_instructionRule488 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_forRule_in_instructionRule492 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_whileRule_in_instructionRule496 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_doWhileRule_in_instructionRule500 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_throwRule_in_instructionRule504 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_typeOfRule_in_instructionRule508 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_idStartingRule_in_instructionRule512 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_instructionRule518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THROW_in_throwRule533 = new BitSet(new long[]{0x0040828000000000L,0x0000000284000000L});
	public static final BitSet FOLLOW_STRING_in_throwRule536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_throwRule540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_throwRule544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_throwRule548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_throwRule552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_throwRule556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEOF_in_typeOfRule572 = new BitSet(new long[]{0x0300080000000000L,0x0000001000000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_typeOfRule574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRY_in_tryCatchRule591 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockRule_in_tryCatchRule593 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CATCH_in_tryCatchRule598 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_tryCatchRule600 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_tryCatchRule602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_tryCatchRule604 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockRule_in_tryCatchRule606 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_FINALLY_in_tryCatchRule612 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockRule_in_tryCatchRule614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnRule630 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_returnRule633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_returnRule635 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_returnRule638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_functionDeclarationRule656 = new BitSet(new long[]{0x2000800000000000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule662 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_functionDeclarationRule667 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284100090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_functionDeclarationRule671 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_functionDeclarationRule673 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_functionDeclarationRule678 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_functionDeclarationRule681 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_functionDeclarationRule683 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_functionDeclarationRule691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationRule_in_functionDefinitionRule706 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_functionDefinitionRule710 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA00C0000L});
	public static final BitSet FOLLOW_instructionRule_in_functionDefinitionRule715 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA00C0000L});
	public static final BitSet FOLLOW_returnRule_in_functionDefinitionRule721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_functionDefinitionRule726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_arrayRule742 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284020090L});
	public static final BitSet FOLLOW_expressionRule_in_arrayRule753 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_arrayRule755 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_CM_in_arrayRule762 = new BitSet(new long[]{0x23508A8000108000L,0x0000001284020090L});
	public static final BitSet FOLLOW_expressionRule_in_arrayRule765 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_arrayRule767 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_arrayRule781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectRule796 = new BitSet(new long[]{0x0000800000000000L,0x0000000004040000L});
	public static final BitSet FOLLOW_set_in_objectRule806 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule818 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_objectRule825 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_objectRule827 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_CM_in_objectRule838 = new BitSet(new long[]{0x0000800000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_set_in_objectRule843 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule855 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_objectRule862 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_objectRule864 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_objectRule881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_variableDefinitionRule917 = new BitSet(new long[]{0x0000000802000082L,0x0000000001001005L});
	public static final BitSet FOLLOW_set_in_variableDefinitionRule922 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_variableDefinitionRule939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_variableDefinitionRule941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_idStartingRule977 = new BitSet(new long[]{0x0020000802000082L,0x0000000001001005L});
	public static final BitSet FOLLOW_set_in_idStartingRule982 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_idStartingRule999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idStartingRule1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTANCEOF_in_idStartingRule1008 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idStartingRule1010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_newRule1026 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_newRule1028 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_newRule1030 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284100090L});
	public static final BitSet FOLLOW_expressionRule_in_newRule1034 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_newRule1036 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_newRule1040 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_newRule1043 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_newRule1045 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_newRule1052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_conditionRule1161 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_conditionRule1164 = new BitSet(new long[]{0x8400300080000022L,0x0000000040000248L});
	public static final BitSet FOLLOW_comparatorRule_in_conditionRule1167 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_NOT_in_conditionRule1169 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_conditionRule1172 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000200L});
	public static final BitSet FOLLOW_set_in_conditionRule1179 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_conditionRule1185 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000200L});
	public static final BitSet FOLLOW_LBR_in_blockRule1201 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_blockRule1203 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_RBR_in_blockRule1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatementRule1221 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_ifStatementRule1223 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_ifStatementRule1225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ifStatementRule1227 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_ifStatementRule1234 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_instructionRule_in_ifStatementRule1238 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ELSE_in_ifStatementRule1244 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_IF_in_ifStatementRule1247 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_ifStatementRule1249 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_ifStatementRule1251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ifStatementRule1253 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_ifStatementRule1258 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_instructionRule_in_ifStatementRule1262 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_SWITCH_in_switchCaseRule1282 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_switchCaseRule1284 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_switchCaseRule1287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_switchCaseRule1289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_switchCaseRule1292 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_switchCaseRule1296 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CASE_in_switchCaseRule1302 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_switchCaseRule1305 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_switchCaseRule1307 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_switchCaseRule1310 = new BitSet(new long[]{0x0A018C0004260C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_switchCaseRule1316 = new BitSet(new long[]{0x0A018C0004260C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_DEFAULT_in_switchCaseRule1329 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_switchCaseRule1331 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_switchCaseRule1337 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_RBR_in_switchCaseRule1348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule1367 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_forRule1369 = new BitSet(new long[]{0x0800800000000000L,0x0000008080400000L});
	public static final BitSet FOLLOW_forInitVarRule_in_forRule1371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_forRule1374 = new BitSet(new long[]{0x2050828000100000L,0x0000000284400020L});
	public static final BitSet FOLLOW_conditionRule_in_forRule1376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_forRule1379 = new BitSet(new long[]{0x0010800000100000L,0x0000000000100000L});
	public static final BitSet FOLLOW_stepRule_in_forRule1381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_forRule1384 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_forRule1390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionRule_in_forRule1394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_forInitVarRule1417 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_forInitVarRule1419 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_forInitVarRule1422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_forInitVarRule1424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incDecRule_in_stepRule1444 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_stepRule1453 = new BitSet(new long[]{0x0010000000100002L});
	public static final BitSet FOLLOW_incDecRule_in_stepRule1461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_incDecRule1483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INC_in_incDecRule1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileRule1511 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_whileRule1513 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_whileRule1515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_whileRule1517 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_whileRule1523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionRule_in_whileRule1527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_doWhileRule1541 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_doWhileRule1547 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_instructionRule_in_doWhileRule1551 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_WHILE_in_doWhileRule1556 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_doWhileRule1558 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_doWhileRule1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_doWhileRule1562 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_doWhileRule1564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule1579 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_classRule1581 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_classRule1586 = new BitSet(new long[]{0x0000080000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_classRule1592 = new BitSet(new long[]{0x0000080000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_classRule1597 = new BitSet(new long[]{0x0000000000000002L});
}
