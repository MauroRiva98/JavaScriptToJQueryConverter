// $ANTLR 3.5.1 C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g 2023-07-24 19:00:02

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
	@Override public String getGrammarFileName() { return "C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g"; }


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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:46:1: parseJava : ( instructionRule | classRule )* ;
	public final void parseJava() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:48:2: ( ( instructionRule | classRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:49:3: ( instructionRule | classRule )*
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:49:3: ( instructionRule | classRule )*
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:49:4: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_parseJava64);
					instructionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:50:5: classRule
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:52:1: getRule : DOCUMENT DOT get= ID x= LP STRING RP ( SC )? ;
	public final JavaScriptToJQueryConverterParser.getRule_return getRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.getRule_return retval = new JavaScriptToJQueryConverterParser.getRule_return();
		retval.start = input.LT(1);

		Token get=null;
		Token x=null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:53:2: ( DOCUMENT DOT get= ID x= LP STRING RP ( SC )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:54:3: DOCUMENT DOT get= ID x= LP STRING RP ( SC )?
			{
			match(input,DOCUMENT,FOLLOW_DOCUMENT_in_getRule85); 
			System.out.println("Ho riconosciuto DOCUMENT");
			match(input,DOT,FOLLOW_DOT_in_getRule89); 
			get=(Token)match(input,ID,FOLLOW_ID_in_getRule93); 
			x=(Token)match(input,LP,FOLLOW_LP_in_getRule97); 
			match(input,STRING,FOLLOW_STRING_in_getRule99); 
			match(input,RP,FOLLOW_RP_in_getRule101); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:54:88: ( SC )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==SC) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:54:88: SC
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:57:1: idDotIdRule : ID ( DOT ID )* ;
	public final void idDotIdRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:58:2: ( ID ( DOT ID )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:59:3: ID ( DOT ID )*
			{
			match(input,ID,FOLLOW_ID_in_idDotIdRule120); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:59:6: ( DOT ID )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==DOT) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:59:7: DOT ID
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:62:1: factorTypologyRule : ( STRING | INTEGER | FLOAT | TRUE | FALSE | ( idDotArrayRule ( LP expressionRule ( CM expressionRule )* RP )? ) ) ;
	public final void factorTypologyRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:63:2: ( ( STRING | INTEGER | FLOAT | TRUE | FALSE | ( idDotArrayRule ( LP expressionRule ( CM expressionRule )* RP )? ) ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:3: ( STRING | INTEGER | FLOAT | TRUE | FALSE | ( idDotArrayRule ( LP expressionRule ( CM expressionRule )* RP )? ) )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:3: ( STRING | INTEGER | FLOAT | TRUE | FALSE | ( idDotArrayRule ( LP expressionRule ( CM expressionRule )* RP )? ) )
			int alt6=6;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt6=1;
				}
				break;
			case INTEGER:
				{
				alt6=2;
				}
				break;
			case FLOAT:
				{
				alt6=3;
				}
				break;
			case TRUE:
				{
				alt6=4;
				}
				break;
			case FALSE:
				{
				alt6=5;
				}
				break;
			case ID:
			case THIS:
				{
				alt6=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:4: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_factorTypologyRule142); 
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:13: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_factorTypologyRule146); 
					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:23: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_factorTypologyRule150); 
					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:31: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factorTypologyRule154); 
					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:38: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factorTypologyRule158); 
					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:46: ( idDotArrayRule ( LP expressionRule ( CM expressionRule )* RP )? )
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:46: ( idDotArrayRule ( LP expressionRule ( CM expressionRule )* RP )? )
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:47: idDotArrayRule ( LP expressionRule ( CM expressionRule )* RP )?
					{
					pushFollow(FOLLOW_idDotArrayRule_in_factorTypologyRule163);
					idDotArrayRule();
					state._fsp--;

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:62: ( LP expressionRule ( CM expressionRule )* RP )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==LP) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:63: LP expressionRule ( CM expressionRule )* RP
							{
							match(input,LP,FOLLOW_LP_in_factorTypologyRule166); 
							pushFollow(FOLLOW_expressionRule_in_factorTypologyRule168);
							expressionRule();
							state._fsp--;

							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:81: ( CM expressionRule )*
							loop4:
							while (true) {
								int alt4=2;
								int LA4_0 = input.LA(1);
								if ( (LA4_0==CM) ) {
									alt4=1;
								}

								switch (alt4) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:82: CM expressionRule
									{
									match(input,CM,FOLLOW_CM_in_factorTypologyRule171); 
									pushFollow(FOLLOW_expressionRule_in_factorTypologyRule173);
									expressionRule();
									state._fsp--;

									}
									break;

								default :
									break loop4;
								}
							}

							match(input,RP,FOLLOW_RP_in_factorTypologyRule177); 
							}
							break;

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
	// $ANTLR end "factorTypologyRule"



	// $ANTLR start "assignTypologyRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:1: assignTypologyRule : ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule ) ;
	public final void assignTypologyRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:68:2: ( ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:3: ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:3: ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule )
			int alt7=6;
			switch ( input.LA(1) ) {
			case LBR:
				{
				alt7=1;
				}
				break;
			case LB:
				{
				alt7=2;
				}
				break;
			case NULL:
				{
				alt7=3;
				}
				break;
			case UNDEFINED:
				{
				alt7=4;
				}
				break;
			case FUNCTION:
				{
				alt7=5;
				}
				break;
			case NEW:
				{
				alt7=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:4: objectRule
					{
					pushFollow(FOLLOW_objectRule_in_assignTypologyRule196);
					objectRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:17: arrayRule
					{
					pushFollow(FOLLOW_arrayRule_in_assignTypologyRule200);
					arrayRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:29: NULL
					{
					match(input,NULL,FOLLOW_NULL_in_assignTypologyRule204); 
					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:36: UNDEFINED
					{
					match(input,UNDEFINED,FOLLOW_UNDEFINED_in_assignTypologyRule208); 
					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:48: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_assignTypologyRule212);
					functionDefinitionRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:73: newRule
					{
					pushFollow(FOLLOW_newRule_in_assignTypologyRule216);
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



	// $ANTLR start "idDotArrayRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:72:1: idDotArrayRule : ( idDotIdRule | ( THIS ( DOT ID )* ) ) ( ( LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB )+ ( DOT ID )* )* ;
	public final void idDotArrayRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:73:2: ( ( idDotIdRule | ( THIS ( DOT ID )* ) ) ( ( LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB )+ ( DOT ID )* )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:3: ( idDotIdRule | ( THIS ( DOT ID )* ) ) ( ( LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB )+ ( DOT ID )* )*
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:3: ( idDotIdRule | ( THIS ( DOT ID )* ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				alt9=1;
			}
			else if ( (LA9_0==THIS) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:4: idDotIdRule
					{
					pushFollow(FOLLOW_idDotIdRule_in_idDotArrayRule232);
					idDotIdRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:18: ( THIS ( DOT ID )* )
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:18: ( THIS ( DOT ID )* )
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:19: THIS ( DOT ID )*
					{
					match(input,THIS,FOLLOW_THIS_in_idDotArrayRule237); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:24: ( DOT ID )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==DOT) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:25: DOT ID
							{
							match(input,DOT,FOLLOW_DOT_in_idDotArrayRule240); 
							match(input,ID,FOLLOW_ID_in_idDotArrayRule242); 
							}
							break;

						default :
							break loop8;
						}
					}

					}

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:37: ( ( LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB )+ ( DOT ID )* )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==LB) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:38: ( LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB )+ ( DOT ID )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:38: ( LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==LB) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:39: LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB
							{
							match(input,LB,FOLLOW_LB_in_idDotArrayRule251); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:42: ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING )
							int alt14=3;
							switch ( input.LA(1) ) {
							case INTEGER:
								{
								alt14=1;
								}
								break;
							case ID:
							case THIS:
								{
								alt14=2;
								}
								break;
							case STRING:
								{
								alt14=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 14, 0, input);
								throw nvae;
							}
							switch (alt14) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:43: INTEGER
									{
									match(input,INTEGER,FOLLOW_INTEGER_in_idDotArrayRule254); 
									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:53: ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? )
									{
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:53: ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? )
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:54: idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )?
									{
									pushFollow(FOLLOW_idDotArrayRule_in_idDotArrayRule259);
									idDotArrayRule();
									state._fsp--;

									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:69: ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )?
									int alt13=2;
									int LA13_0 = input.LA(1);
									if ( (LA13_0==LP) ) {
										alt13=1;
									}
									switch (alt13) {
										case 1 :
											// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:70: LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP
											{
											match(input,LP,FOLLOW_LP_in_idDotArrayRule262); 
											// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:73: ( assignTypologyRule | expressionRule )
											int alt10=2;
											int LA10_0 = input.LA(1);
											if ( (LA10_0==FUNCTION||(LA10_0 >= LB && LA10_0 <= LBR)||LA10_0==NEW||LA10_0==NULL||LA10_0==UNDEFINED) ) {
												alt10=1;
											}
											else if ( (LA10_0==DEC||LA10_0==FALSE||LA10_0==FLOAT||LA10_0==ID||LA10_0==INC||LA10_0==INTEGER||LA10_0==LP||LA10_0==STRING||LA10_0==THIS||LA10_0==TRUE) ) {
												alt10=2;
											}

											else {
												NoViableAltException nvae =
													new NoViableAltException("", 10, 0, input);
												throw nvae;
											}

											switch (alt10) {
												case 1 :
													// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:74: assignTypologyRule
													{
													pushFollow(FOLLOW_assignTypologyRule_in_idDotArrayRule265);
													assignTypologyRule();
													state._fsp--;

													}
													break;
												case 2 :
													// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:93: expressionRule
													{
													pushFollow(FOLLOW_expressionRule_in_idDotArrayRule267);
													expressionRule();
													state._fsp--;

													}
													break;

											}

											// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:109: ( CM ( assignTypologyRule | expressionRule ) )*
											loop12:
											while (true) {
												int alt12=2;
												int LA12_0 = input.LA(1);
												if ( (LA12_0==CM) ) {
													alt12=1;
												}

												switch (alt12) {
												case 1 :
													// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:110: CM ( assignTypologyRule | expressionRule )
													{
													match(input,CM,FOLLOW_CM_in_idDotArrayRule271); 
													// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:113: ( assignTypologyRule | expressionRule )
													int alt11=2;
													int LA11_0 = input.LA(1);
													if ( (LA11_0==FUNCTION||(LA11_0 >= LB && LA11_0 <= LBR)||LA11_0==NEW||LA11_0==NULL||LA11_0==UNDEFINED) ) {
														alt11=1;
													}
													else if ( (LA11_0==DEC||LA11_0==FALSE||LA11_0==FLOAT||LA11_0==ID||LA11_0==INC||LA11_0==INTEGER||LA11_0==LP||LA11_0==STRING||LA11_0==THIS||LA11_0==TRUE) ) {
														alt11=2;
													}

													else {
														NoViableAltException nvae =
															new NoViableAltException("", 11, 0, input);
														throw nvae;
													}

													switch (alt11) {
														case 1 :
															// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:114: assignTypologyRule
															{
															pushFollow(FOLLOW_assignTypologyRule_in_idDotArrayRule274);
															assignTypologyRule();
															state._fsp--;

															}
															break;
														case 2 :
															// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:133: expressionRule
															{
															pushFollow(FOLLOW_expressionRule_in_idDotArrayRule276);
															expressionRule();
															state._fsp--;

															}
															break;

													}

													}
													break;

												default :
													break loop12;
												}
											}

											match(input,RP,FOLLOW_RP_in_idDotArrayRule281); 
											}
											break;

									}

									}

									}
									break;
								case 3 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:159: STRING
									{
									match(input,STRING,FOLLOW_STRING_in_idDotArrayRule288); 
									}
									break;

							}

							match(input,RB,FOLLOW_RB_in_idDotArrayRule291); 
							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:172: ( DOT ID )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==DOT) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:173: DOT ID
							{
							match(input,DOT,FOLLOW_DOT_in_idDotArrayRule296); 
							match(input,ID,FOLLOW_ID_in_idDotArrayRule298); 
							}
							break;

						default :
							break loop16;
						}
					}

					}
					break;

				default :
					break loop17;
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
	// $ANTLR end "idDotArrayRule"


	public static class expressionRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "expressionRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:1: expressionRule : termRule ( ( ADD | SUB | MOD ) termRule )* ;
	public final JavaScriptToJQueryConverterParser.expressionRule_return expressionRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.expressionRule_return retval = new JavaScriptToJQueryConverterParser.expressionRule_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:2: ( termRule ( ( ADD | SUB | MOD ) termRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:79:3: termRule ( ( ADD | SUB | MOD ) termRule )*
			{
			pushFollow(FOLLOW_termRule_in_expressionRule315);
			termRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:79:12: ( ( ADD | SUB | MOD ) termRule )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==ADD||LA18_0==MOD||LA18_0==SUB) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:79:13: ( ADD | SUB | MOD ) termRule
					{
					if ( input.LA(1)==ADD||input.LA(1)==MOD||input.LA(1)==SUB ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_termRule_in_expressionRule330);
					termRule();
					state._fsp--;

					}
					break;

				default :
					break loop18;
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:81:1: termRule : factorRule ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )* ;
	public final void termRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:82:2: ( factorRule ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:83:3: factorRule ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )*
			{
			pushFollow(FOLLOW_factorRule_in_termRule346);
			factorRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:83:14: ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==AND_BIT||LA19_0==DIV||LA19_0==EXP||LA19_0==LSHIFT||LA19_0==OR_BIT||LA19_0==RSHIFT||LA19_0==STAR||LA19_0==URSHIFT||LA19_0==XOR) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:83:15: ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule
					{
					if ( input.LA(1)==AND_BIT||input.LA(1)==DIV||input.LA(1)==EXP||input.LA(1)==LSHIFT||input.LA(1)==OR_BIT||input.LA(1)==RSHIFT||input.LA(1)==STAR||input.LA(1)==URSHIFT||input.LA(1)==XOR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factorRule_in_termRule385);
					factorRule();
					state._fsp--;

					}
					break;

				default :
					break loop19;
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:86:1: factorRule : ( ( INC | DEC )? factorTypologyRule ( INC | DEC )? | LP expressionRule RP );
	public final void factorRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:2: ( ( INC | DEC )? factorTypologyRule ( INC | DEC )? | LP expressionRule RP )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==DEC||LA22_0==FALSE||LA22_0==FLOAT||LA22_0==ID||LA22_0==INC||LA22_0==INTEGER||LA22_0==STRING||LA22_0==THIS||LA22_0==TRUE) ) {
				alt22=1;
			}
			else if ( (LA22_0==LP) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:88:3: ( INC | DEC )? factorTypologyRule ( INC | DEC )?
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:88:3: ( INC | DEC )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==DEC||LA20_0==INC) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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

					pushFollow(FOLLOW_factorTypologyRule_in_factorRule409);
					factorTypologyRule();
					state._fsp--;

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:88:33: ( INC | DEC )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==DEC||LA21_0==INC) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:89:5: LP expressionRule RP
					{
					match(input,LP,FOLLOW_LP_in_factorRule422); 
					pushFollow(FOLLOW_expressionRule_in_factorRule424);
					expressionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_factorRule426); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:92:1: instructionRule : ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | blockRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule ) ( SC )? ;
	public final void instructionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:93:2: ( ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | blockRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule ) ( SC )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:3: ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | blockRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule ) ( SC )?
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:3: ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | blockRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule )
			int alt23=13;
			switch ( input.LA(1) ) {
			case BREAK:
				{
				alt23=1;
				}
				break;
			case CONTINUE:
				{
				alt23=2;
				}
				break;
			case TRY:
				{
				alt23=3;
				}
				break;
			case FUNCTION:
				{
				alt23=4;
				}
				break;
			case LBR:
				{
				alt23=5;
				}
				break;
			case IF:
				{
				alt23=6;
				}
				break;
			case SWITCH:
				{
				alt23=7;
				}
				break;
			case FOR:
				{
				alt23=8;
				}
				break;
			case WHILE:
				{
				alt23=9;
				}
				break;
			case DO:
				{
				alt23=10;
				}
				break;
			case THROW:
				{
				alt23=11;
				}
				break;
			case TYPEOF:
				{
				alt23=12;
				}
				break;
			case CONST:
			case ID:
			case LET:
			case THIS:
			case VAR:
				{
				alt23=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:4: BREAK
					{
					match(input,BREAK,FOLLOW_BREAK_in_instructionRule441); 
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:12: CONTINUE
					{
					match(input,CONTINUE,FOLLOW_CONTINUE_in_instructionRule445); 
					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:23: tryCatchRule
					{
					pushFollow(FOLLOW_tryCatchRule_in_instructionRule449);
					tryCatchRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:38: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_instructionRule453);
					functionDefinitionRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:63: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_instructionRule457);
					blockRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:75: ifStatementRule
					{
					pushFollow(FOLLOW_ifStatementRule_in_instructionRule461);
					ifStatementRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:93: switchCaseRule
					{
					pushFollow(FOLLOW_switchCaseRule_in_instructionRule465);
					switchCaseRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:110: forRule
					{
					pushFollow(FOLLOW_forRule_in_instructionRule469);
					forRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:120: whileRule
					{
					pushFollow(FOLLOW_whileRule_in_instructionRule473);
					whileRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:132: doWhileRule
					{
					pushFollow(FOLLOW_doWhileRule_in_instructionRule477);
					doWhileRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:146: throwRule
					{
					pushFollow(FOLLOW_throwRule_in_instructionRule481);
					throwRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:158: typeOfRule
					{
					pushFollow(FOLLOW_typeOfRule_in_instructionRule485);
					typeOfRule();
					state._fsp--;

					}
					break;
				case 13 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:171: idStartingRule
					{
					pushFollow(FOLLOW_idStartingRule_in_instructionRule489);
					idStartingRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:95:3: ( SC )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==SC) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:95:3: SC
					{
					match(input,SC,FOLLOW_SC_in_instructionRule495); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:98:1: throwRule : THROW ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule ) ;
	public final void throwRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:99:2: ( THROW ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:3: THROW ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule )
			{
			match(input,THROW,FOLLOW_THROW_in_throwRule510); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:9: ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule )
			int alt25=6;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt25=1;
				}
				break;
			case TRUE:
				{
				alt25=2;
				}
				break;
			case FALSE:
				{
				alt25=3;
				}
				break;
			case INTEGER:
				{
				alt25=4;
				}
				break;
			case FLOAT:
				{
				alt25=5;
				}
				break;
			case ID:
			case THIS:
				{
				alt25=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:10: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_throwRule513); 
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:19: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_throwRule517); 
					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:26: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_throwRule521); 
					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:34: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_throwRule525); 
					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:44: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_throwRule529); 
					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:52: idDotArrayRule
					{
					pushFollow(FOLLOW_idDotArrayRule_in_throwRule533);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:103:1: typeOfRule : TYPEOF assignTypologyRule ;
	public final void typeOfRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:104:2: ( TYPEOF assignTypologyRule )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:105:3: TYPEOF assignTypologyRule
			{
			match(input,TYPEOF,FOLLOW_TYPEOF_in_typeOfRule549); 
			pushFollow(FOLLOW_assignTypologyRule_in_typeOfRule551);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:1: tryCatchRule : TRY blockRule CATCH LP ID RP blockRule ( FINALLY blockRule )? ;
	public final void tryCatchRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:111:2: ( TRY blockRule CATCH LP ID RP blockRule ( FINALLY blockRule )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:112:3: TRY blockRule CATCH LP ID RP blockRule ( FINALLY blockRule )?
			{
			match(input,TRY,FOLLOW_TRY_in_tryCatchRule569); 
			pushFollow(FOLLOW_blockRule_in_tryCatchRule571);
			blockRule();
			state._fsp--;

			match(input,CATCH,FOLLOW_CATCH_in_tryCatchRule576); 
			match(input,LP,FOLLOW_LP_in_tryCatchRule578); 
			match(input,ID,FOLLOW_ID_in_tryCatchRule580); 
			match(input,RP,FOLLOW_RP_in_tryCatchRule582); 
			pushFollow(FOLLOW_blockRule_in_tryCatchRule584);
			blockRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:114:3: ( FINALLY blockRule )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==FINALLY) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:114:4: FINALLY blockRule
					{
					match(input,FINALLY,FOLLOW_FINALLY_in_tryCatchRule590); 
					pushFollow(FOLLOW_blockRule_in_tryCatchRule592);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:117:1: returnRule : RETURN ( expressionRule | assignTypologyRule ) ( SC )? ;
	public final void returnRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:118:2: ( RETURN ( expressionRule | assignTypologyRule ) ( SC )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:119:3: RETURN ( expressionRule | assignTypologyRule ) ( SC )?
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnRule608); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:119:10: ( expressionRule | assignTypologyRule )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==DEC||LA27_0==FALSE||LA27_0==FLOAT||LA27_0==ID||LA27_0==INC||LA27_0==INTEGER||LA27_0==LP||LA27_0==STRING||LA27_0==THIS||LA27_0==TRUE) ) {
				alt27=1;
			}
			else if ( (LA27_0==FUNCTION||(LA27_0 >= LB && LA27_0 <= LBR)||LA27_0==NEW||LA27_0==NULL||LA27_0==UNDEFINED) ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:119:11: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_returnRule611);
					expressionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:119:26: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_returnRule613);
					assignTypologyRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:119:46: ( SC )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==SC) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:119:46: SC
					{
					match(input,SC,FOLLOW_SC_in_returnRule616); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:122:1: functionDeclarationRule : FUNCTION ( ID )? LP ( ID ( ( CM ID )* ) )? RP ;
	public final void functionDeclarationRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:123:2: ( FUNCTION ( ID )? LP ( ID ( ( CM ID )* ) )? RP )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:124:3: FUNCTION ( ID )? LP ( ID ( ( CM ID )* ) )? RP
			{
			match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclarationRule632); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:124:12: ( ID )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ID) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:124:12: ID
					{
					match(input,ID,FOLLOW_ID_in_functionDeclarationRule634); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_functionDeclarationRule637); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:124:19: ( ID ( ( CM ID )* ) )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==ID) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:124:20: ID ( ( CM ID )* )
					{
					match(input,ID,FOLLOW_ID_in_functionDeclarationRule640); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:124:23: ( ( CM ID )* )
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:124:24: ( CM ID )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:124:24: ( CM ID )*
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==CM) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:124:25: CM ID
							{
							match(input,CM,FOLLOW_CM_in_functionDeclarationRule644); 
							match(input,ID,FOLLOW_ID_in_functionDeclarationRule646); 
							}
							break;

						default :
							break loop30;
						}
					}

					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionDeclarationRule653); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:127:1: functionDefinitionRule : functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR ;
	public final void functionDefinitionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:2: ( functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:129:3: functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR
			{
			pushFollow(FOLLOW_functionDeclarationRule_in_functionDefinitionRule667);
			functionDeclarationRule();
			state._fsp--;

			match(input,LBR,FOLLOW_LBR_in_functionDefinitionRule671); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:131:4: ( instructionRule )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==BREAK||(LA32_0 >= CONST && LA32_0 <= CONTINUE)||LA32_0==DO||(LA32_0 >= FOR && LA32_0 <= FUNCTION)||(LA32_0 >= ID && LA32_0 <= IF)||LA32_0==LBR||LA32_0==LET||LA32_0==SWITCH||(LA32_0 >= THIS && LA32_0 <= THROW)||(LA32_0 >= TRY && LA32_0 <= TYPEOF)||LA32_0==VAR||LA32_0==WHILE) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:131:4: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_functionDefinitionRule676);
					instructionRule();
					state._fsp--;

					}
					break;

				default :
					break loop32;
				}
			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:132:4: ( returnRule )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==RETURN) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:132:4: returnRule
					{
					pushFollow(FOLLOW_returnRule_in_functionDefinitionRule682);
					returnRule();
					state._fsp--;

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_functionDefinitionRule687); 
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



	// $ANTLR start "functionCallRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:136:1: functionCallRule : idDotArrayRule LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP ( SC )? ;
	public final void functionCallRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:137:2: ( idDotArrayRule LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP ( SC )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:3: idDotArrayRule LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP ( SC )?
			{
			pushFollow(FOLLOW_idDotArrayRule_in_functionCallRule701);
			idDotArrayRule();
			state._fsp--;

			match(input,LP,FOLLOW_LP_in_functionCallRule703); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:21: ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==DEC||LA37_0==FALSE||LA37_0==FLOAT||LA37_0==FUNCTION||LA37_0==ID||LA37_0==INC||LA37_0==INTEGER||(LA37_0 >= LB && LA37_0 <= LBR)||LA37_0==LP||LA37_0==NEW||LA37_0==NULL||LA37_0==STRING||LA37_0==THIS||LA37_0==TRUE||LA37_0==UNDEFINED) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:22: ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:22: ( expressionRule | assignTypologyRule )
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==DEC||LA34_0==FALSE||LA34_0==FLOAT||LA34_0==ID||LA34_0==INC||LA34_0==INTEGER||LA34_0==LP||LA34_0==STRING||LA34_0==THIS||LA34_0==TRUE) ) {
						alt34=1;
					}
					else if ( (LA34_0==FUNCTION||(LA34_0 >= LB && LA34_0 <= LBR)||LA34_0==NEW||LA34_0==NULL||LA34_0==UNDEFINED) ) {
						alt34=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 34, 0, input);
						throw nvae;
					}

					switch (alt34) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:23: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_functionCallRule707);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:38: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_functionCallRule709);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:58: ( CM ( expressionRule | assignTypologyRule ) )*
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==CM) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:59: CM ( expressionRule | assignTypologyRule )
							{
							match(input,CM,FOLLOW_CM_in_functionCallRule713); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:62: ( expressionRule | assignTypologyRule )
							int alt35=2;
							int LA35_0 = input.LA(1);
							if ( (LA35_0==DEC||LA35_0==FALSE||LA35_0==FLOAT||LA35_0==ID||LA35_0==INC||LA35_0==INTEGER||LA35_0==LP||LA35_0==STRING||LA35_0==THIS||LA35_0==TRUE) ) {
								alt35=1;
							}
							else if ( (LA35_0==FUNCTION||(LA35_0 >= LB && LA35_0 <= LBR)||LA35_0==NEW||LA35_0==NULL||LA35_0==UNDEFINED) ) {
								alt35=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 35, 0, input);
								throw nvae;
							}

							switch (alt35) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:63: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_functionCallRule716);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:78: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_functionCallRule718);
									assignTypologyRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop36;
						}
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionCallRule725); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:105: ( SC )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==SC) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:105: SC
					{
					match(input,SC,FOLLOW_SC_in_functionCallRule727); 
					}
					break;

			}

			System.out.println("Ho riconosciuto una chiamata a funzione");
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
	// $ANTLR end "functionCallRule"



	// $ANTLR start "arrayRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:142:1: arrayRule : LB ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RB ;
	public final void arrayRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:143:2: ( LB ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RB )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:144:3: LB ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RB
			{
			match(input,LB,FOLLOW_LB_in_arrayRule747); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:145:4: ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==DEC||LA42_0==FALSE||LA42_0==FLOAT||LA42_0==FUNCTION||LA42_0==ID||LA42_0==INC||LA42_0==INTEGER||(LA42_0 >= LB && LA42_0 <= LBR)||LA42_0==LP||LA42_0==NEW||LA42_0==NULL||LA42_0==STRING||LA42_0==THIS||LA42_0==TRUE||LA42_0==UNDEFINED) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:146:4: ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:146:4: ( expressionRule | assignTypologyRule )
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==DEC||LA39_0==FALSE||LA39_0==FLOAT||LA39_0==ID||LA39_0==INC||LA39_0==INTEGER||LA39_0==LP||LA39_0==STRING||LA39_0==THIS||LA39_0==TRUE) ) {
						alt39=1;
					}
					else if ( (LA39_0==FUNCTION||(LA39_0 >= LB && LA39_0 <= LBR)||LA39_0==NEW||LA39_0==NULL||LA39_0==UNDEFINED) ) {
						alt39=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 39, 0, input);
						throw nvae;
					}

					switch (alt39) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:146:5: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_arrayRule758);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:146:20: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_arrayRule760);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:4: ( CM ( expressionRule | assignTypologyRule ) )*
					loop41:
					while (true) {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( (LA41_0==CM) ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:5: CM ( expressionRule | assignTypologyRule )
							{
							match(input,CM,FOLLOW_CM_in_arrayRule767); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:8: ( expressionRule | assignTypologyRule )
							int alt40=2;
							int LA40_0 = input.LA(1);
							if ( (LA40_0==DEC||LA40_0==FALSE||LA40_0==FLOAT||LA40_0==ID||LA40_0==INC||LA40_0==INTEGER||LA40_0==LP||LA40_0==STRING||LA40_0==THIS||LA40_0==TRUE) ) {
								alt40=1;
							}
							else if ( (LA40_0==FUNCTION||(LA40_0 >= LB && LA40_0 <= LBR)||LA40_0==NEW||LA40_0==NULL||LA40_0==UNDEFINED) ) {
								alt40=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 40, 0, input);
								throw nvae;
							}

							switch (alt40) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:9: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_arrayRule770);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:24: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_arrayRule772);
									assignTypologyRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop41;
						}
					}

					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_arrayRule785); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:1: objectRule : LBR ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )? RBR ;
	public final void objectRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:153:2: ( LBR ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )? RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:3: LBR ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )? RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectRule800); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:4: ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==ID||LA46_0==STRING) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:156:4: ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )*
					{
					if ( input.LA(1)==ID||input.LA(1)==STRING ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,CL,FOLLOW_CL_in_objectRule822); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:158:4: ( expressionRule | assignTypologyRule )
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
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:158:5: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_objectRule829);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:158:20: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_objectRule831);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:159:4: ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )*
					loop45:
					while (true) {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==CM) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:160:4: CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule )
							{
							match(input,CM,FOLLOW_CM_in_objectRule842); 
							if ( input.LA(1)==ID||input.LA(1)==STRING ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,CL,FOLLOW_CL_in_objectRule859); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:163:4: ( expressionRule | assignTypologyRule )
							int alt44=2;
							int LA44_0 = input.LA(1);
							if ( (LA44_0==DEC||LA44_0==FALSE||LA44_0==FLOAT||LA44_0==ID||LA44_0==INC||LA44_0==INTEGER||LA44_0==LP||LA44_0==STRING||LA44_0==THIS||LA44_0==TRUE) ) {
								alt44=1;
							}
							else if ( (LA44_0==FUNCTION||(LA44_0 >= LB && LA44_0 <= LBR)||LA44_0==NEW||LA44_0==NULL||LA44_0==UNDEFINED) ) {
								alt44=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 44, 0, input);
								throw nvae;
							}

							switch (alt44) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:163:5: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_objectRule866);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:163:20: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_objectRule868);
									assignTypologyRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop45;
						}
					}

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_objectRule885); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:171:1: variableDefinitionRule : ( VAR | LET | CONST )? idDotArrayRule ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? ;
	public final JavaScriptToJQueryConverterParser.variableDefinitionRule_return variableDefinitionRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.variableDefinitionRule_return retval = new JavaScriptToJQueryConverterParser.variableDefinitionRule_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:172:2: ( ( VAR | LET | CONST )? idDotArrayRule ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:173:3: ( VAR | LET | CONST )? idDotArrayRule ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:173:3: ( VAR | LET | CONST )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==CONST||LA47_0==LET||LA47_0==VAR) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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

			pushFollow(FOLLOW_idDotArrayRule_in_variableDefinitionRule921);
			idDotArrayRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:175:3: ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==ASSIGN||LA49_0==DIVEQ||LA49_0==EXPEQ||LA49_0==MINUSEQ||LA49_0==MODEQ||LA49_0==PLUSEQ||LA49_0==STAREQ) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:175:4: ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule )
					{
					if ( input.LA(1)==ASSIGN||input.LA(1)==DIVEQ||input.LA(1)==EXPEQ||input.LA(1)==MINUSEQ||input.LA(1)==MODEQ||input.LA(1)==PLUSEQ||input.LA(1)==STAREQ ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:175:53: ( expressionRule | assignTypologyRule )
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==DEC||LA48_0==FALSE||LA48_0==FLOAT||LA48_0==ID||LA48_0==INC||LA48_0==INTEGER||LA48_0==LP||LA48_0==STRING||LA48_0==THIS||LA48_0==TRUE) ) {
						alt48=1;
					}
					else if ( (LA48_0==FUNCTION||(LA48_0 >= LB && LA48_0 <= LBR)||LA48_0==NEW||LA48_0==NULL||LA48_0==UNDEFINED) ) {
						alt48=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 48, 0, input);
						throw nvae;
					}

					switch (alt48) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:175:54: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_variableDefinitionRule943);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:175:69: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_variableDefinitionRule945);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:179:1: idStartingRule : ( VAR | LET | CONST )? idDotArrayRule ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID ) ;
	public final void idStartingRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:180:2: ( ( VAR | LET | CONST )? idDotArrayRule ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:181:3: ( VAR | LET | CONST )? idDotArrayRule ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:181:3: ( VAR | LET | CONST )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==CONST||LA50_0==LET||LA50_0==VAR) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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

			pushFollow(FOLLOW_idDotArrayRule_in_idStartingRule981);
			idDotArrayRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:182:18: ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID )
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==EOF||LA53_0==ASSIGN||(LA53_0 >= BREAK && LA53_0 <= CASE)||LA53_0==CLASS||(LA53_0 >= CONST && LA53_0 <= CONTINUE)||LA53_0==DEFAULT||(LA53_0 >= DIVEQ && LA53_0 <= DO)||LA53_0==ELSE||LA53_0==EXPEQ||(LA53_0 >= FOR && LA53_0 <= FUNCTION)||(LA53_0 >= ID && LA53_0 <= IF)||LA53_0==LBR||LA53_0==LET||LA53_0==MINUSEQ||LA53_0==MODEQ||LA53_0==PLUSEQ||(LA53_0 >= RBR && LA53_0 <= RETURN)||LA53_0==SC||LA53_0==STAREQ||LA53_0==SWITCH||(LA53_0 >= THIS && LA53_0 <= THROW)||(LA53_0 >= TRY && LA53_0 <= TYPEOF)||LA53_0==VAR||LA53_0==WHILE) ) {
				alt53=1;
			}
			else if ( (LA53_0==INSTANCEOF) ) {
				alt53=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}

			switch (alt53) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:182:20: ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:182:20: ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==ASSIGN||LA52_0==DIVEQ||LA52_0==EXPEQ||LA52_0==MINUSEQ||LA52_0==MODEQ||LA52_0==PLUSEQ||LA52_0==STAREQ) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:182:21: ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule )
							{
							if ( input.LA(1)==ASSIGN||input.LA(1)==DIVEQ||input.LA(1)==EXPEQ||input.LA(1)==MINUSEQ||input.LA(1)==MODEQ||input.LA(1)==PLUSEQ||input.LA(1)==STAREQ ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:182:70: ( expressionRule | assignTypologyRule )
							int alt51=2;
							int LA51_0 = input.LA(1);
							if ( (LA51_0==DEC||LA51_0==FALSE||LA51_0==FLOAT||LA51_0==ID||LA51_0==INC||LA51_0==INTEGER||LA51_0==LP||LA51_0==STRING||LA51_0==THIS||LA51_0==TRUE) ) {
								alt51=1;
							}
							else if ( (LA51_0==FUNCTION||(LA51_0 >= LB && LA51_0 <= LBR)||LA51_0==NEW||LA51_0==NULL||LA51_0==UNDEFINED) ) {
								alt51=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 51, 0, input);
								throw nvae;
							}

							switch (alt51) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:182:71: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_idStartingRule1003);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:182:86: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_idStartingRule1005);
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:182:110: INSTANCEOF ID
					{
					match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_idStartingRule1012); 
					match(input,ID,FOLLOW_ID_in_idStartingRule1014); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:186:1: newRule : NEW ID LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP ;
	public final void newRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:187:2: ( NEW ID LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:3: NEW ID LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP
			{
			match(input,NEW,FOLLOW_NEW_in_newRule1030); 
			match(input,ID,FOLLOW_ID_in_newRule1032); 
			match(input,LP,FOLLOW_LP_in_newRule1034); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:13: ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==DEC||LA57_0==FALSE||LA57_0==FLOAT||LA57_0==FUNCTION||LA57_0==ID||LA57_0==INC||LA57_0==INTEGER||(LA57_0 >= LB && LA57_0 <= LBR)||LA57_0==LP||LA57_0==NEW||LA57_0==NULL||LA57_0==STRING||LA57_0==THIS||LA57_0==TRUE||LA57_0==UNDEFINED) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:14: ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:14: ( expressionRule | assignTypologyRule )
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
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:15: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_newRule1038);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:30: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_newRule1040);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:50: ( CM ( expressionRule | assignTypologyRule ) )*
					loop56:
					while (true) {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==CM) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:51: CM ( expressionRule | assignTypologyRule )
							{
							match(input,CM,FOLLOW_CM_in_newRule1044); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:54: ( expressionRule | assignTypologyRule )
							int alt55=2;
							int LA55_0 = input.LA(1);
							if ( (LA55_0==DEC||LA55_0==FALSE||LA55_0==FLOAT||LA55_0==ID||LA55_0==INC||LA55_0==INTEGER||LA55_0==LP||LA55_0==STRING||LA55_0==THIS||LA55_0==TRUE) ) {
								alt55=1;
							}
							else if ( (LA55_0==FUNCTION||(LA55_0 >= LB && LA55_0 <= LBR)||LA55_0==NEW||LA55_0==NULL||LA55_0==UNDEFINED) ) {
								alt55=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 55, 0, input);
								throw nvae;
							}

							switch (alt55) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:55: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_newRule1047);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:70: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_newRule1049);
									assignTypologyRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop56;
						}
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_newRule1056); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:191:1: arithmeticOperatorsRule : ( ADD | SUB | STAR | DIV | MOD | INC | DEC | EXP ) ;
	public final void arithmeticOperatorsRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:192:2: ( ( ADD | SUB | STAR | DIV | MOD | INC | DEC | EXP ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:203:1: comparatorRule : ( EQ | NEQ | LT | LE | GT | GE | TEQ | NTEQ ) ;
	public final void comparatorRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:204:2: ( ( EQ | NEQ | LT | LE | GT | GE | TEQ | NTEQ ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:208:1: conditionRule : ( NOT )? expressionRule ( comparatorRule ( NOT )? expressionRule )? ( ( AND | OR ) conditionRule )* ;
	public final void conditionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:209:2: ( ( NOT )? expressionRule ( comparatorRule ( NOT )? expressionRule )? ( ( AND | OR ) conditionRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:210:3: ( NOT )? expressionRule ( comparatorRule ( NOT )? expressionRule )? ( ( AND | OR ) conditionRule )*
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:210:3: ( NOT )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==NOT) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:210:3: NOT
					{
					match(input,NOT,FOLLOW_NOT_in_conditionRule1165); 
					}
					break;

			}

			pushFollow(FOLLOW_expressionRule_in_conditionRule1168);
			expressionRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:210:23: ( comparatorRule ( NOT )? expressionRule )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==EQ||(LA60_0 >= GE && LA60_0 <= GT)||LA60_0==LE||LA60_0==LT||LA60_0==NEQ||LA60_0==NTEQ||LA60_0==TEQ) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:210:24: comparatorRule ( NOT )? expressionRule
					{
					pushFollow(FOLLOW_comparatorRule_in_conditionRule1171);
					comparatorRule();
					state._fsp--;

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:210:39: ( NOT )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==NOT) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:210:39: NOT
							{
							match(input,NOT,FOLLOW_NOT_in_conditionRule1173); 
							}
							break;

					}

					pushFollow(FOLLOW_expressionRule_in_conditionRule1176);
					expressionRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:3: ( ( AND | OR ) conditionRule )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==AND||LA61_0==OR) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:4: ( AND | OR ) conditionRule
					{
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_conditionRule_in_conditionRule1189);
					conditionRule();
					state._fsp--;

					}
					break;

				default :
					break loop61;
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:1: blockRule : LBR ( instructionRule )* RBR ;
	public final void blockRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:215:2: ( LBR ( instructionRule )* RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:216:3: LBR ( instructionRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_blockRule1205); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:216:7: ( instructionRule )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==BREAK||(LA62_0 >= CONST && LA62_0 <= CONTINUE)||LA62_0==DO||(LA62_0 >= FOR && LA62_0 <= FUNCTION)||(LA62_0 >= ID && LA62_0 <= IF)||LA62_0==LBR||LA62_0==LET||LA62_0==SWITCH||(LA62_0 >= THIS && LA62_0 <= THROW)||(LA62_0 >= TRY && LA62_0 <= TYPEOF)||LA62_0==VAR||LA62_0==WHILE) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:216:7: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_blockRule1207);
					instructionRule();
					state._fsp--;

					}
					break;

				default :
					break loop62;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_blockRule1210); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:219:1: ifStatementRule : IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )* ;
	public final JavaScriptToJQueryConverterParser.ifStatementRule_return ifStatementRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.ifStatementRule_return retval = new JavaScriptToJQueryConverterParser.ifStatementRule_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:220:2: ( IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:221:3: IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )*
			{
			match(input,IF,FOLLOW_IF_in_ifStatementRule1225); 
			match(input,LP,FOLLOW_LP_in_ifStatementRule1227); 
			pushFollow(FOLLOW_conditionRule_in_ifStatementRule1229);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_ifStatementRule1231); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:222:4: ( blockRule | instructionRule )
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==LBR) ) {
				alt63=1;
			}
			else if ( (LA63_0==BREAK||(LA63_0 >= CONST && LA63_0 <= CONTINUE)||LA63_0==DO||(LA63_0 >= FOR && LA63_0 <= FUNCTION)||(LA63_0 >= ID && LA63_0 <= IF)||LA63_0==LET||LA63_0==SWITCH||(LA63_0 >= THIS && LA63_0 <= THROW)||(LA63_0 >= TRY && LA63_0 <= TYPEOF)||LA63_0==VAR||LA63_0==WHILE) ) {
				alt63=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:222:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_ifStatementRule1238);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:222:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_ifStatementRule1242);
					instructionRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:223:3: ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==ELSE) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:223:4: ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule )
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStatementRule1248); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:223:9: ( IF LP conditionRule RP )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==IF) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:223:10: IF LP conditionRule RP
							{
							match(input,IF,FOLLOW_IF_in_ifStatementRule1251); 
							match(input,LP,FOLLOW_LP_in_ifStatementRule1253); 
							pushFollow(FOLLOW_conditionRule_in_ifStatementRule1255);
							conditionRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_ifStatementRule1257); 
							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:223:35: ( blockRule | instructionRule )
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==LBR) ) {
						alt65=1;
					}
					else if ( (LA65_0==BREAK||(LA65_0 >= CONST && LA65_0 <= CONTINUE)||LA65_0==DO||(LA65_0 >= FOR && LA65_0 <= FUNCTION)||(LA65_0 >= ID && LA65_0 <= IF)||LA65_0==LET||LA65_0==SWITCH||(LA65_0 >= THIS && LA65_0 <= THROW)||(LA65_0 >= TRY && LA65_0 <= TYPEOF)||LA65_0==VAR||LA65_0==WHILE) ) {
						alt65=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 65, 0, input);
						throw nvae;
					}

					switch (alt65) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:223:36: blockRule
							{
							pushFollow(FOLLOW_blockRule_in_ifStatementRule1262);
							blockRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:223:48: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_ifStatementRule1266);
							instructionRule();
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop66;
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:226:1: switchCaseRule : SWITCH LP ( expressionRule | assignTypologyRule ) RP LBR ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )+ ( DEFAULT CL ( instructionRule )* )? RBR ;
	public final JavaScriptToJQueryConverterParser.switchCaseRule_return switchCaseRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.switchCaseRule_return retval = new JavaScriptToJQueryConverterParser.switchCaseRule_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:2: ( SWITCH LP ( expressionRule | assignTypologyRule ) RP LBR ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )+ ( DEFAULT CL ( instructionRule )* )? RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:228:3: SWITCH LP ( expressionRule | assignTypologyRule ) RP LBR ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )+ ( DEFAULT CL ( instructionRule )* )? RBR
			{
			match(input,SWITCH,FOLLOW_SWITCH_in_switchCaseRule1286); 
			match(input,LP,FOLLOW_LP_in_switchCaseRule1288); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:228:13: ( expressionRule | assignTypologyRule )
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:228:14: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_switchCaseRule1291);
					expressionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:228:29: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_switchCaseRule1293);
					assignTypologyRule();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_switchCaseRule1296); 
			match(input,LBR,FOLLOW_LBR_in_switchCaseRule1300); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:230:4: ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )+
			int cnt70=0;
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==CASE) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:230:5: CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )*
					{
					match(input,CASE,FOLLOW_CASE_in_switchCaseRule1306); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:230:10: ( expressionRule | assignTypologyRule )
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==DEC||LA68_0==FALSE||LA68_0==FLOAT||LA68_0==ID||LA68_0==INC||LA68_0==INTEGER||LA68_0==LP||LA68_0==STRING||LA68_0==THIS||LA68_0==TRUE) ) {
						alt68=1;
					}
					else if ( (LA68_0==FUNCTION||(LA68_0 >= LB && LA68_0 <= LBR)||LA68_0==NEW||LA68_0==NULL||LA68_0==UNDEFINED) ) {
						alt68=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 68, 0, input);
						throw nvae;
					}

					switch (alt68) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:230:11: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_switchCaseRule1309);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:230:26: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_switchCaseRule1311);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					match(input,CL,FOLLOW_CL_in_switchCaseRule1314); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:5: ( instructionRule )*
					loop69:
					while (true) {
						int alt69=2;
						int LA69_0 = input.LA(1);
						if ( (LA69_0==BREAK||(LA69_0 >= CONST && LA69_0 <= CONTINUE)||LA69_0==DO||(LA69_0 >= FOR && LA69_0 <= FUNCTION)||(LA69_0 >= ID && LA69_0 <= IF)||LA69_0==LBR||LA69_0==LET||LA69_0==SWITCH||(LA69_0 >= THIS && LA69_0 <= THROW)||(LA69_0 >= TRY && LA69_0 <= TYPEOF)||LA69_0==VAR||LA69_0==WHILE) ) {
							alt69=1;
						}

						switch (alt69) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:5: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_switchCaseRule1320);
							instructionRule();
							state._fsp--;

							}
							break;

						default :
							break loop69;
						}
					}

					}
					break;

				default :
					if ( cnt70 >= 1 ) break loop70;
					EarlyExitException eee = new EarlyExitException(70, input);
					throw eee;
				}
				cnt70++;
			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:233:4: ( DEFAULT CL ( instructionRule )* )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==DEFAULT) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:233:5: DEFAULT CL ( instructionRule )*
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_switchCaseRule1333); 
					match(input,CL,FOLLOW_CL_in_switchCaseRule1335); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:234:5: ( instructionRule )*
					loop71:
					while (true) {
						int alt71=2;
						int LA71_0 = input.LA(1);
						if ( (LA71_0==BREAK||(LA71_0 >= CONST && LA71_0 <= CONTINUE)||LA71_0==DO||(LA71_0 >= FOR && LA71_0 <= FUNCTION)||(LA71_0 >= ID && LA71_0 <= IF)||LA71_0==LBR||LA71_0==LET||LA71_0==SWITCH||(LA71_0 >= THIS && LA71_0 <= THROW)||(LA71_0 >= TRY && LA71_0 <= TYPEOF)||LA71_0==VAR||LA71_0==WHILE) ) {
							alt71=1;
						}

						switch (alt71) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:234:5: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_switchCaseRule1341);
							instructionRule();
							state._fsp--;

							}
							break;

						default :
							break loop71;
						}
					}

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_switchCaseRule1352); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:240:1: forRule : FOR LP ( forInitVarRule )? SC ( conditionRule )? SC ( stepRule )? RP ( blockRule | instructionRule ) ;
	public final void forRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:241:2: ( FOR LP ( forInitVarRule )? SC ( conditionRule )? SC ( stepRule )? RP ( blockRule | instructionRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:242:3: FOR LP ( forInitVarRule )? SC ( conditionRule )? SC ( stepRule )? RP ( blockRule | instructionRule )
			{
			match(input,FOR,FOLLOW_FOR_in_forRule1371); 
			match(input,LP,FOLLOW_LP_in_forRule1373); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:242:10: ( forInitVarRule )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==ID||LA73_0==LET||LA73_0==THIS||LA73_0==VAR) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:242:10: forInitVarRule
					{
					pushFollow(FOLLOW_forInitVarRule_in_forRule1375);
					forInitVarRule();
					state._fsp--;

					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_forRule1378); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:242:29: ( conditionRule )?
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==DEC||LA74_0==FALSE||LA74_0==FLOAT||LA74_0==ID||LA74_0==INC||LA74_0==INTEGER||LA74_0==LP||LA74_0==NOT||LA74_0==STRING||LA74_0==THIS||LA74_0==TRUE) ) {
				alt74=1;
			}
			switch (alt74) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:242:29: conditionRule
					{
					pushFollow(FOLLOW_conditionRule_in_forRule1380);
					conditionRule();
					state._fsp--;

					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_forRule1383); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:242:47: ( stepRule )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==DEC||LA75_0==ID||LA75_0==INC) ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:242:47: stepRule
					{
					pushFollow(FOLLOW_stepRule_in_forRule1385);
					stepRule();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_forRule1388); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:4: ( blockRule | instructionRule )
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==LBR) ) {
				alt76=1;
			}
			else if ( (LA76_0==BREAK||(LA76_0 >= CONST && LA76_0 <= CONTINUE)||LA76_0==DO||(LA76_0 >= FOR && LA76_0 <= FUNCTION)||(LA76_0 >= ID && LA76_0 <= IF)||LA76_0==LET||LA76_0==SWITCH||(LA76_0 >= THIS && LA76_0 <= THROW)||(LA76_0 >= TRY && LA76_0 <= TYPEOF)||LA76_0==VAR||LA76_0==WHILE) ) {
				alt76=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}

			switch (alt76) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_forRule1394);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_forRule1398);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:246:1: forInitVarRule : ( VAR | LET )? idDotArrayRule ASSIGN ( expressionRule | assignTypologyRule ) ;
	public final void forInitVarRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:247:2: ( ( VAR | LET )? idDotArrayRule ASSIGN ( expressionRule | assignTypologyRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:248:3: ( VAR | LET )? idDotArrayRule ASSIGN ( expressionRule | assignTypologyRule )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:248:3: ( VAR | LET )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==LET||LA77_0==VAR) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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

			pushFollow(FOLLOW_idDotArrayRule_in_forInitVarRule1421);
			idDotArrayRule();
			state._fsp--;

			match(input,ASSIGN,FOLLOW_ASSIGN_in_forInitVarRule1423); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:248:38: ( expressionRule | assignTypologyRule )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==DEC||LA78_0==FALSE||LA78_0==FLOAT||LA78_0==ID||LA78_0==INC||LA78_0==INTEGER||LA78_0==LP||LA78_0==STRING||LA78_0==THIS||LA78_0==TRUE) ) {
				alt78=1;
			}
			else if ( (LA78_0==FUNCTION||(LA78_0 >= LB && LA78_0 <= LBR)||LA78_0==NEW||LA78_0==NULL||LA78_0==UNDEFINED) ) {
				alt78=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}

			switch (alt78) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:248:39: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_forInitVarRule1426);
					expressionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:248:54: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_forInitVarRule1428);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:1: stepRule : (o1= incDecRule )? i= ID (o2= incDecRule )? ;
	public final void stepRule() throws RecognitionException {
		Token i=null;
		Token o1 =null;
		Token o2 =null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:252:2: ( (o1= incDecRule )? i= ID (o2= incDecRule )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:253:3: (o1= incDecRule )? i= ID (o2= incDecRule )?
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:253:3: (o1= incDecRule )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==DEC||LA79_0==INC) ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:253:4: o1= incDecRule
					{
					pushFollow(FOLLOW_incDecRule_in_stepRule1448);
					o1=incDecRule();
					state._fsp--;

					}
					break;

			}

			i=(Token)match(input,ID,FOLLOW_ID_in_stepRule1457); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:255:3: (o2= incDecRule )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==DEC||LA80_0==INC) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:255:4: o2= incDecRule
					{
					pushFollow(FOLLOW_incDecRule_in_stepRule1465);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:258:1: incDecRule returns [Token tk] : (o1= DEC |o2= INC );
	public final Token incDecRule() throws RecognitionException {
		Token tk = null;


		Token o1=null;
		Token o2=null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:259:2: (o1= DEC |o2= INC )
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==DEC) ) {
				alt81=1;
			}
			else if ( (LA81_0==INC) ) {
				alt81=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:260:3: o1= DEC
					{
					o1=(Token)match(input,DEC,FOLLOW_DEC_in_incDecRule1487); 
					tk = o1;
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:261:4: o2= INC
					{
					o2=(Token)match(input,INC,FOLLOW_INC_in_incDecRule1498); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:264:1: whileRule : WHILE LP conditionRule RP ( blockRule | instructionRule ) ;
	public final void whileRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:265:2: ( WHILE LP conditionRule RP ( blockRule | instructionRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:266:3: WHILE LP conditionRule RP ( blockRule | instructionRule )
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileRule1515); 
			match(input,LP,FOLLOW_LP_in_whileRule1517); 
			pushFollow(FOLLOW_conditionRule_in_whileRule1519);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_whileRule1521); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:267:4: ( blockRule | instructionRule )
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:267:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_whileRule1527);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:267:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_whileRule1531);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:270:1: doWhileRule : DO ( blockRule | instructionRule ) WHILE LP conditionRule RP ( SC )? ;
	public final void doWhileRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:271:2: ( DO ( blockRule | instructionRule ) WHILE LP conditionRule RP ( SC )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:272:3: DO ( blockRule | instructionRule ) WHILE LP conditionRule RP ( SC )?
			{
			match(input,DO,FOLLOW_DO_in_doWhileRule1545); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:273:4: ( blockRule | instructionRule )
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==LBR) ) {
				alt83=1;
			}
			else if ( (LA83_0==BREAK||(LA83_0 >= CONST && LA83_0 <= CONTINUE)||LA83_0==DO||(LA83_0 >= FOR && LA83_0 <= FUNCTION)||(LA83_0 >= ID && LA83_0 <= IF)||LA83_0==LET||LA83_0==SWITCH||(LA83_0 >= THIS && LA83_0 <= THROW)||(LA83_0 >= TRY && LA83_0 <= TYPEOF)||LA83_0==VAR||LA83_0==WHILE) ) {
				alt83=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}

			switch (alt83) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:273:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_doWhileRule1551);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:273:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_doWhileRule1555);
					instructionRule();
					state._fsp--;

					}
					break;

			}

			match(input,WHILE,FOLLOW_WHILE_in_doWhileRule1560); 
			match(input,LP,FOLLOW_LP_in_doWhileRule1562); 
			pushFollow(FOLLOW_conditionRule_in_doWhileRule1564);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_doWhileRule1566); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:274:29: ( SC )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==SC) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:274:29: SC
					{
					match(input,SC,FOLLOW_SC_in_doWhileRule1568); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:277:1: classRule : CLASS ID LBR ( functionDefinitionRule )* RBR ;
	public final void classRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:278:2: ( CLASS ID LBR ( functionDefinitionRule )* RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:279:3: CLASS ID LBR ( functionDefinitionRule )* RBR
			{
			match(input,CLASS,FOLLOW_CLASS_in_classRule1583); 
			match(input,ID,FOLLOW_ID_in_classRule1585); 
			match(input,LBR,FOLLOW_LBR_in_classRule1590); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:281:4: ( functionDefinitionRule )*
			loop85:
			while (true) {
				int alt85=2;
				int LA85_0 = input.LA(1);
				if ( (LA85_0==FUNCTION) ) {
					alt85=1;
				}

				switch (alt85) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:281:4: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_classRule1596);
					functionDefinitionRule();
					state._fsp--;

					}
					break;

				default :
					break loop85;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_classRule1601); 
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
	public static final BitSet FOLLOW_idDotArrayRule_in_factorTypologyRule163 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_LP_in_factorTypologyRule166 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_factorTypologyRule168 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_factorTypologyRule171 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_factorTypologyRule173 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_factorTypologyRule177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectRule_in_assignTypologyRule196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRule_in_assignTypologyRule200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_assignTypologyRule204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNDEFINED_in_assignTypologyRule208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_assignTypologyRule212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newRule_in_assignTypologyRule216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotIdRule_in_idDotArrayRule232 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_THIS_in_idDotArrayRule237 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRule240 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idDotArrayRule242 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_LB_in_idDotArrayRule251 = new BitSet(new long[]{0x0040800000000000L,0x0000000084000000L});
	public static final BitSet FOLLOW_INTEGER_in_idDotArrayRule254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_idDotArrayRule_in_idDotArrayRule259 = new BitSet(new long[]{0x2000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LP_in_idDotArrayRule262 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idDotArrayRule265 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_idDotArrayRule267 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_idDotArrayRule271 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idDotArrayRule274 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_idDotArrayRule276 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_idDotArrayRule281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_idDotArrayRule288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_idDotArrayRule291 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRule296 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idDotArrayRule298 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_termRule_in_expressionRule315 = new BitSet(new long[]{0x0000000000000012L,0x0000000008000002L});
	public static final BitSet FOLLOW_set_in_expressionRule318 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_termRule_in_expressionRule330 = new BitSet(new long[]{0x0000000000000012L,0x0000000008000002L});
	public static final BitSet FOLLOW_factorRule_in_termRule346 = new BitSet(new long[]{0x4000000401000042L,0x0000104000A00400L});
	public static final BitSet FOLLOW_set_in_termRule349 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_factorRule_in_termRule385 = new BitSet(new long[]{0x4000000401000042L,0x0000104000A00400L});
	public static final BitSet FOLLOW_factorTypologyRule_in_factorRule409 = new BitSet(new long[]{0x0010000000100002L});
	public static final BitSet FOLLOW_LP_in_factorRule422 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_factorRule424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_factorRule426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_instructionRule441 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_CONTINUE_in_instructionRule445 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_tryCatchRule_in_instructionRule449 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_instructionRule453 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_blockRule_in_instructionRule457 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_ifStatementRule_in_instructionRule461 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_switchCaseRule_in_instructionRule465 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_forRule_in_instructionRule469 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_whileRule_in_instructionRule473 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_doWhileRule_in_instructionRule477 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_throwRule_in_instructionRule481 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_typeOfRule_in_instructionRule485 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_idStartingRule_in_instructionRule489 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_instructionRule495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THROW_in_throwRule510 = new BitSet(new long[]{0x0040828000000000L,0x0000000284000000L});
	public static final BitSet FOLLOW_STRING_in_throwRule513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_throwRule517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_throwRule521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_throwRule525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_throwRule529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_throwRule533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEOF_in_typeOfRule549 = new BitSet(new long[]{0x0300080000000000L,0x0000001000000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_typeOfRule551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRY_in_tryCatchRule569 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockRule_in_tryCatchRule571 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CATCH_in_tryCatchRule576 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_tryCatchRule578 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_tryCatchRule580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_tryCatchRule582 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockRule_in_tryCatchRule584 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_FINALLY_in_tryCatchRule590 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockRule_in_tryCatchRule592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnRule608 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_returnRule611 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_returnRule613 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_returnRule616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_functionDeclarationRule632 = new BitSet(new long[]{0x2000800000000000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule634 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_functionDeclarationRule637 = new BitSet(new long[]{0x0000800000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule640 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_functionDeclarationRule644 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule646 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_functionDeclarationRule653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationRule_in_functionDefinitionRule667 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_functionDefinitionRule671 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA00C0000L});
	public static final BitSet FOLLOW_instructionRule_in_functionDefinitionRule676 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA00C0000L});
	public static final BitSet FOLLOW_returnRule_in_functionDefinitionRule682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_functionDefinitionRule687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_functionCallRule701 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_functionCallRule703 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284100090L});
	public static final BitSet FOLLOW_expressionRule_in_functionCallRule707 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_functionCallRule709 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_functionCallRule713 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_functionCallRule716 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_functionCallRule718 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_functionCallRule725 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_functionCallRule727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_arrayRule747 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284020090L});
	public static final BitSet FOLLOW_expressionRule_in_arrayRule758 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_arrayRule760 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_CM_in_arrayRule767 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_arrayRule770 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_arrayRule772 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_arrayRule785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectRule800 = new BitSet(new long[]{0x0000800000000000L,0x0000000004040000L});
	public static final BitSet FOLLOW_set_in_objectRule810 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule822 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_objectRule829 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_objectRule831 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_CM_in_objectRule842 = new BitSet(new long[]{0x0000800000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_set_in_objectRule847 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule859 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_objectRule866 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_objectRule868 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_objectRule885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_variableDefinitionRule921 = new BitSet(new long[]{0x0000000802000082L,0x0000000001001005L});
	public static final BitSet FOLLOW_set_in_variableDefinitionRule926 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_variableDefinitionRule943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_variableDefinitionRule945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_idStartingRule981 = new BitSet(new long[]{0x0020000802000082L,0x0000000001001005L});
	public static final BitSet FOLLOW_set_in_idStartingRule986 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_idStartingRule1003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idStartingRule1005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTANCEOF_in_idStartingRule1012 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idStartingRule1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_newRule1030 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_newRule1032 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_newRule1034 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284100090L});
	public static final BitSet FOLLOW_expressionRule_in_newRule1038 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_newRule1040 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_newRule1044 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_newRule1047 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_newRule1049 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_newRule1056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_conditionRule1165 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_conditionRule1168 = new BitSet(new long[]{0x8400300080000022L,0x0000000040000248L});
	public static final BitSet FOLLOW_comparatorRule_in_conditionRule1171 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_NOT_in_conditionRule1173 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_conditionRule1176 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000200L});
	public static final BitSet FOLLOW_set_in_conditionRule1183 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_conditionRule1189 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000200L});
	public static final BitSet FOLLOW_LBR_in_blockRule1205 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_blockRule1207 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_RBR_in_blockRule1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatementRule1225 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_ifStatementRule1227 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_ifStatementRule1229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ifStatementRule1231 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_ifStatementRule1238 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_instructionRule_in_ifStatementRule1242 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ELSE_in_ifStatementRule1248 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_IF_in_ifStatementRule1251 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_ifStatementRule1253 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_ifStatementRule1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ifStatementRule1257 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_ifStatementRule1262 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_instructionRule_in_ifStatementRule1266 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_SWITCH_in_switchCaseRule1286 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_switchCaseRule1288 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_switchCaseRule1291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_switchCaseRule1293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_switchCaseRule1296 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_switchCaseRule1300 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CASE_in_switchCaseRule1306 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_switchCaseRule1309 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_switchCaseRule1311 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_switchCaseRule1314 = new BitSet(new long[]{0x0A018C0004260C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_switchCaseRule1320 = new BitSet(new long[]{0x0A018C0004260C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_DEFAULT_in_switchCaseRule1333 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_switchCaseRule1335 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_switchCaseRule1341 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_RBR_in_switchCaseRule1352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule1371 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_forRule1373 = new BitSet(new long[]{0x0800800000000000L,0x0000008080400000L});
	public static final BitSet FOLLOW_forInitVarRule_in_forRule1375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_forRule1378 = new BitSet(new long[]{0x2050828000100000L,0x0000000284400020L});
	public static final BitSet FOLLOW_conditionRule_in_forRule1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_forRule1383 = new BitSet(new long[]{0x0010800000100000L,0x0000000000100000L});
	public static final BitSet FOLLOW_stepRule_in_forRule1385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_forRule1388 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_forRule1394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionRule_in_forRule1398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_forInitVarRule1421 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_forInitVarRule1423 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_forInitVarRule1426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_forInitVarRule1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incDecRule_in_stepRule1448 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_stepRule1457 = new BitSet(new long[]{0x0010000000100002L});
	public static final BitSet FOLLOW_incDecRule_in_stepRule1465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_incDecRule1487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INC_in_incDecRule1498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileRule1515 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_whileRule1517 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_whileRule1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_whileRule1521 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_whileRule1527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionRule_in_whileRule1531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_doWhileRule1545 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_doWhileRule1551 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_instructionRule_in_doWhileRule1555 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_WHILE_in_doWhileRule1560 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_doWhileRule1562 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_doWhileRule1564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_doWhileRule1566 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_doWhileRule1568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule1583 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_classRule1585 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_classRule1590 = new BitSet(new long[]{0x0000080000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_classRule1596 = new BitSet(new long[]{0x0000080000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_classRule1601 = new BitSet(new long[]{0x0000000000000002L});
}
