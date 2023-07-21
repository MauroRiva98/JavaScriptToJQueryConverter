// $ANTLR 3.5.1 C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g 2023-07-21 12:16:37

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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:46:1: parseJava : ( getRule | variableDefinitionRule | objectRule | ifStatementRule );
	public final void parseJava() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:48:2: ( getRule | variableDefinitionRule | objectRule | ifStatementRule )
			int alt1=4;
			switch ( input.LA(1) ) {
			case DOCUMENT:
				{
				alt1=1;
				}
				break;
			case CONST:
			case ID:
			case LET:
			case THIS:
			case VAR:
				{
				alt1=2;
				}
				break;
			case LBR:
				{
				alt1=3;
				}
				break;
			case IF:
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:49:3: getRule
					{
					pushFollow(FOLLOW_getRule_in_parseJava64);
					getRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:50:4: variableDefinitionRule
					{
					pushFollow(FOLLOW_variableDefinitionRule_in_parseJava70);
					variableDefinitionRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:51:4: objectRule
					{
					pushFollow(FOLLOW_objectRule_in_parseJava75);
					objectRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:52:4: ifStatementRule
					{
					pushFollow(FOLLOW_ifStatementRule_in_parseJava80);
					ifStatementRule();
					state._fsp--;

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
	// $ANTLR end "parseJava"


	public static class getRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "getRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:1: getRule : DOCUMENT DOT get= ID x= LP i= STRING RP ( SC )? ;
	public final JavaScriptToJQueryConverterParser.getRule_return getRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.getRule_return retval = new JavaScriptToJQueryConverterParser.getRule_return();
		retval.start = input.LT(1);

		Token get=null;
		Token x=null;
		Token i=null;

		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:56:2: ( DOCUMENT DOT get= ID x= LP i= STRING RP ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:57:3: DOCUMENT DOT get= ID x= LP i= STRING RP ( SC )?
			{
			match(input,DOCUMENT,FOLLOW_DOCUMENT_in_getRule95); 
			System.out.println("Ho riconosciuto DOCUMENT");
			match(input,DOT,FOLLOW_DOT_in_getRule99); 
			get=(Token)match(input,ID,FOLLOW_ID_in_getRule103); 
			x=(Token)match(input,LP,FOLLOW_LP_in_getRule107); 
			i=(Token)match(input,STRING,FOLLOW_STRING_in_getRule111); 
			match(input,RP,FOLLOW_RP_in_getRule113); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:57:90: ( SC )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==SC) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:57:90: SC
					{
					match(input,SC,FOLLOW_SC_in_getRule115); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:60:1: idDotIdRule : ID ( DOT ID )* ;
	public final void idDotIdRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:61:2: ( ID ( DOT ID )* )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:62:3: ID ( DOT ID )*
			{
			match(input,ID,FOLLOW_ID_in_idDotIdRule132); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:62:6: ( DOT ID )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==DOT) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:62:7: DOT ID
					{
					match(input,DOT,FOLLOW_DOT_in_idDotIdRule135); 
					match(input,ID,FOLLOW_ID_in_idDotIdRule137); 
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



	// $ANTLR start "idDotArrayRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:1: idDotArrayRule : ( idDotIdRule | ( THIS ( DOT ID )* ) ) ( ( LB ( INTEGER | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) | STRING ) RB )+ ( DOT ID )* )* ;
	public final void idDotArrayRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:66:2: ( ( idDotIdRule | ( THIS ( DOT ID )* ) ) ( ( LB ( INTEGER | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) | STRING ) RB )+ ( DOT ID )* )* )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:3: ( idDotIdRule | ( THIS ( DOT ID )* ) ) ( ( LB ( INTEGER | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) | STRING ) RB )+ ( DOT ID )* )*
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:3: ( idDotIdRule | ( THIS ( DOT ID )* ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				alt5=1;
			}
			else if ( (LA5_0==THIS) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:4: idDotIdRule
					{
					pushFollow(FOLLOW_idDotIdRule_in_idDotArrayRule155);
					idDotIdRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:18: ( THIS ( DOT ID )* )
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:18: ( THIS ( DOT ID )* )
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:19: THIS ( DOT ID )*
					{
					match(input,THIS,FOLLOW_THIS_in_idDotArrayRule160); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:24: ( DOT ID )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==DOT) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:25: DOT ID
							{
							match(input,DOT,FOLLOW_DOT_in_idDotArrayRule163); 
							match(input,ID,FOLLOW_ID_in_idDotArrayRule165); 
							}
							break;

						default :
							break loop4;
						}
					}

					}

					}
					break;

			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:37: ( ( LB ( INTEGER | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) | STRING ) RB )+ ( DOT ID )* )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==LB) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:38: ( LB ( INTEGER | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) | STRING ) RB )+ ( DOT ID )*
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:38: ( LB ( INTEGER | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) | STRING ) RB )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==LB) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:39: LB ( INTEGER | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) | STRING ) RB
							{
							match(input,LB,FOLLOW_LB_in_idDotArrayRule174); 
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:42: ( INTEGER | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) | STRING )
							int alt8=3;
							switch ( input.LA(1) ) {
							case INTEGER:
								{
								alt8=1;
								}
								break;
							case ID:
							case THIS:
								{
								alt8=2;
								}
								break;
							case STRING:
								{
								alt8=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 8, 0, input);
								throw nvae;
							}
							switch (alt8) {
								case 1 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:43: INTEGER
									{
									match(input,INTEGER,FOLLOW_INTEGER_in_idDotArrayRule177); 
									}
									break;
								case 2 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:53: ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? )
									{
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:53: ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? )
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:54: idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )?
									{
									pushFollow(FOLLOW_idDotArrayRule_in_idDotArrayRule182);
									idDotArrayRule();
									state._fsp--;

									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:69: ( LP assignTypologyRule ( CM assignTypologyRule )* RP )?
									int alt7=2;
									int LA7_0 = input.LA(1);
									if ( (LA7_0==LP) ) {
										alt7=1;
									}
									switch (alt7) {
										case 1 :
											// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:70: LP assignTypologyRule ( CM assignTypologyRule )* RP
											{
											match(input,LP,FOLLOW_LP_in_idDotArrayRule185); 
											pushFollow(FOLLOW_assignTypologyRule_in_idDotArrayRule187);
											assignTypologyRule();
											state._fsp--;

											// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:92: ( CM assignTypologyRule )*
											loop6:
											while (true) {
												int alt6=2;
												int LA6_0 = input.LA(1);
												if ( (LA6_0==CM) ) {
													alt6=1;
												}

												switch (alt6) {
												case 1 :
													// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:93: CM assignTypologyRule
													{
													match(input,CM,FOLLOW_CM_in_idDotArrayRule190); 
													pushFollow(FOLLOW_assignTypologyRule_in_idDotArrayRule192);
													assignTypologyRule();
													state._fsp--;

													}
													break;

												default :
													break loop6;
												}
											}

											match(input,RP,FOLLOW_RP_in_idDotArrayRule196); 
											}
											break;

									}

									}

									}
									break;
								case 3 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:125: STRING
									{
									match(input,STRING,FOLLOW_STRING_in_idDotArrayRule203); 
									}
									break;

							}

							match(input,RB,FOLLOW_RB_in_idDotArrayRule206); 
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:138: ( DOT ID )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==DOT) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:139: DOT ID
							{
							match(input,DOT,FOLLOW_DOT_in_idDotArrayRule211); 
							match(input,ID,FOLLOW_ID_in_idDotArrayRule213); 
							}
							break;

						default :
							break loop10;
						}
					}

					}
					break;

				default :
					break loop11;
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



	// $ANTLR start "expressionRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:1: expressionRule : SUB ;
	public final void expressionRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:71:2: ( SUB )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:72:3: SUB
			{
			match(input,SUB,FOLLOW_SUB_in_expressionRule232); 
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
	// $ANTLR end "expressionRule"



	// $ANTLR start "instructionRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:75:1: instructionRule : SC ;
	public final void instructionRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:2: ( SC )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:2: SC
			{
			match(input,SC,FOLLOW_SC_in_instructionRule246); 
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



	// $ANTLR start "returnRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:1: returnRule : RETURN assignTypologyRule ( SC )? ;
	public final void returnRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:81:2: ( RETURN assignTypologyRule ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:82:3: RETURN assignTypologyRule ( SC )?
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnRule260); 
			pushFollow(FOLLOW_assignTypologyRule_in_returnRule262);
			assignTypologyRule();
			state._fsp--;

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:82:29: ( SC )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==SC) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:82:29: SC
					{
					match(input,SC,FOLLOW_SC_in_returnRule264); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:1: functionDeclarationRule : FUNCTION ( ID )? LP ( ID ( ( CM ID )* ) )? RP ;
	public final void functionDeclarationRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:86:2: ( FUNCTION ( ID )? LP ( ID ( ( CM ID )* ) )? RP )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:3: FUNCTION ( ID )? LP ( ID ( ( CM ID )* ) )? RP
			{
			match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclarationRule280); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:12: ( ID )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ID) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:12: ID
					{
					match(input,ID,FOLLOW_ID_in_functionDeclarationRule282); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_functionDeclarationRule285); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:19: ( ID ( ( CM ID )* ) )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:20: ID ( ( CM ID )* )
					{
					match(input,ID,FOLLOW_ID_in_functionDeclarationRule288); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:23: ( ( CM ID )* )
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:24: ( CM ID )*
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:24: ( CM ID )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==CM) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:25: CM ID
							{
							match(input,CM,FOLLOW_CM_in_functionDeclarationRule292); 
							match(input,ID,FOLLOW_ID_in_functionDeclarationRule294); 
							}
							break;

						default :
							break loop14;
						}
					}

					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionDeclarationRule301); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:90:1: functionDefinitionRule : functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR ;
	public final void functionDefinitionRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:2: ( functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:92:3: functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR
			{
			pushFollow(FOLLOW_functionDeclarationRule_in_functionDefinitionRule315);
			functionDeclarationRule();
			state._fsp--;

			match(input,LBR,FOLLOW_LBR_in_functionDefinitionRule319); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:4: ( instructionRule )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==SC) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:4: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_functionDefinitionRule324);
					instructionRule();
					state._fsp--;

					}
					break;

				default :
					break loop16;
				}
			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:95:4: ( returnRule )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==RETURN) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:95:4: returnRule
					{
					pushFollow(FOLLOW_returnRule_in_functionDefinitionRule330);
					returnRule();
					state._fsp--;

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_functionDefinitionRule335); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:99:1: functionCallRule : idDotArrayRule LP ( assignTypologyRule ( CM assignTypologyRule )* )? RP ( SC )? ;
	public final void functionCallRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:2: ( idDotArrayRule LP ( assignTypologyRule ( CM assignTypologyRule )* )? RP ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:101:3: idDotArrayRule LP ( assignTypologyRule ( CM assignTypologyRule )* )? RP ( SC )?
			{
			pushFollow(FOLLOW_idDotArrayRule_in_functionCallRule349);
			idDotArrayRule();
			state._fsp--;

			match(input,LP,FOLLOW_LP_in_functionCallRule351); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:101:21: ( assignTypologyRule ( CM assignTypologyRule )* )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==FALSE||LA19_0==FLOAT||LA19_0==FUNCTION||LA19_0==ID||LA19_0==INTEGER||(LA19_0 >= LB && LA19_0 <= LBR)||LA19_0==NEW||LA19_0==NULL||(LA19_0 >= STRING && LA19_0 <= SUB)||LA19_0==THIS||LA19_0==TRUE||LA19_0==UNDEFINED) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:101:22: assignTypologyRule ( CM assignTypologyRule )*
					{
					pushFollow(FOLLOW_assignTypologyRule_in_functionCallRule354);
					assignTypologyRule();
					state._fsp--;

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:101:41: ( CM assignTypologyRule )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==CM) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:101:42: CM assignTypologyRule
							{
							match(input,CM,FOLLOW_CM_in_functionCallRule357); 
							pushFollow(FOLLOW_assignTypologyRule_in_functionCallRule359);
							assignTypologyRule();
							state._fsp--;

							}
							break;

						default :
							break loop18;
						}
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionCallRule365); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:101:71: ( SC )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==SC) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:101:71: SC
					{
					match(input,SC,FOLLOW_SC_in_functionCallRule367); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:105:1: arrayRule : LB ( assignTypologyRule ( CM assignTypologyRule )* )? RB ;
	public final void arrayRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:106:2: ( LB ( assignTypologyRule ( CM assignTypologyRule )* )? RB )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:107:3: LB ( assignTypologyRule ( CM assignTypologyRule )* )? RB
			{
			match(input,LB,FOLLOW_LB_in_arrayRule387); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:108:4: ( assignTypologyRule ( CM assignTypologyRule )* )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==FALSE||LA22_0==FLOAT||LA22_0==FUNCTION||LA22_0==ID||LA22_0==INTEGER||(LA22_0 >= LB && LA22_0 <= LBR)||LA22_0==NEW||LA22_0==NULL||(LA22_0 >= STRING && LA22_0 <= SUB)||LA22_0==THIS||LA22_0==TRUE||LA22_0==UNDEFINED) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:109:4: assignTypologyRule ( CM assignTypologyRule )*
					{
					pushFollow(FOLLOW_assignTypologyRule_in_arrayRule397);
					assignTypologyRule();
					state._fsp--;

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:4: ( CM assignTypologyRule )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==CM) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:5: CM assignTypologyRule
							{
							match(input,CM,FOLLOW_CM_in_arrayRule403); 
							pushFollow(FOLLOW_assignTypologyRule_in_arrayRule405);
							assignTypologyRule();
							state._fsp--;

							}
							break;

						default :
							break loop21;
						}
					}

					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_arrayRule417); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:115:1: objectRule : LBR ( ( ID | STRING ) CL assignTypologyRule ( CM ( ID | STRING ) CL assignTypologyRule )* )? RBR ;
	public final void objectRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:2: ( LBR ( ( ID | STRING ) CL assignTypologyRule ( CM ( ID | STRING ) CL assignTypologyRule )* )? RBR )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:117:3: LBR ( ( ID | STRING ) CL assignTypologyRule ( CM ( ID | STRING ) CL assignTypologyRule )* )? RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectRule432); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:118:4: ( ( ID | STRING ) CL assignTypologyRule ( CM ( ID | STRING ) CL assignTypologyRule )* )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==ID||LA24_0==STRING) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:119:4: ( ID | STRING ) CL assignTypologyRule ( CM ( ID | STRING ) CL assignTypologyRule )*
					{
					if ( input.LA(1)==ID||input.LA(1)==STRING ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,CL,FOLLOW_CL_in_objectRule454); 
					pushFollow(FOLLOW_assignTypologyRule_in_objectRule460);
					assignTypologyRule();
					state._fsp--;

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:122:4: ( CM ( ID | STRING ) CL assignTypologyRule )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==CM) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:123:4: CM ( ID | STRING ) CL assignTypologyRule
							{
							match(input,CM,FOLLOW_CM_in_objectRule470); 
							if ( input.LA(1)==ID||input.LA(1)==STRING ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,CL,FOLLOW_CL_in_objectRule487); 
							pushFollow(FOLLOW_assignTypologyRule_in_objectRule493);
							assignTypologyRule();
							state._fsp--;

							}
							break;

						default :
							break loop23;
						}
					}

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_objectRule509); 
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



	// $ANTLR start "varDeclarationRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:133:1: varDeclarationRule : ( VAR | LET | CONST ) ID ( CM ID )* ( SC )? ;
	public final void varDeclarationRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:134:2: ( ( VAR | LET | CONST ) ID ( CM ID )* ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:135:3: ( VAR | LET | CONST ) ID ( CM ID )* ( SC )?
			{
			if ( input.LA(1)==CONST||input.LA(1)==LET||input.LA(1)==VAR ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,ID,FOLLOW_ID_in_varDeclarationRule540); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:135:26: ( CM ID )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==CM) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:135:27: CM ID
					{
					match(input,CM,FOLLOW_CM_in_varDeclarationRule543); 
					match(input,ID,FOLLOW_ID_in_varDeclarationRule545); 
					}
					break;

				default :
					break loop25;
				}
			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:135:35: ( SC )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==SC) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:135:35: SC
					{
					match(input,SC,FOLLOW_SC_in_varDeclarationRule549); 
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
	// $ANTLR end "varDeclarationRule"



	// $ANTLR start "varAssignmentRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:1: varAssignmentRule : ( VAR | LET | CONST )? idDotArrayRule ASSIGN assignTypologyRule ( SC )? ;
	public final void varAssignmentRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:139:2: ( ( VAR | LET | CONST )? idDotArrayRule ASSIGN assignTypologyRule ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:3: ( VAR | LET | CONST )? idDotArrayRule ASSIGN assignTypologyRule ( SC )?
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:3: ( VAR | LET | CONST )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==CONST||LA27_0==LET||LA27_0==VAR) ) {
				alt27=1;
			}
			switch (alt27) {
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

			pushFollow(FOLLOW_idDotArrayRule_in_varAssignmentRule579);
			idDotArrayRule();
			state._fsp--;

			match(input,ASSIGN,FOLLOW_ASSIGN_in_varAssignmentRule581); 
			pushFollow(FOLLOW_assignTypologyRule_in_varAssignmentRule583);
			assignTypologyRule();
			state._fsp--;

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:65: ( SC )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==SC) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:65: SC
					{
					match(input,SC,FOLLOW_SC_in_varAssignmentRule585); 
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
	// $ANTLR end "varAssignmentRule"


	public static class variableDefinitionRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "variableDefinitionRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:143:1: variableDefinitionRule : ( VAR | LET | CONST )? idDotArrayRule ( ASSIGN assignTypologyRule )? ( SC )? ;
	public final JavaScriptToJQueryConverterParser.variableDefinitionRule_return variableDefinitionRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.variableDefinitionRule_return retval = new JavaScriptToJQueryConverterParser.variableDefinitionRule_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:144:2: ( ( VAR | LET | CONST )? idDotArrayRule ( ASSIGN assignTypologyRule )? ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:145:3: ( VAR | LET | CONST )? idDotArrayRule ( ASSIGN assignTypologyRule )? ( SC )?
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:145:3: ( VAR | LET | CONST )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==CONST||LA29_0==LET||LA29_0==VAR) ) {
				alt29=1;
			}
			switch (alt29) {
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

			pushFollow(FOLLOW_idDotArrayRule_in_variableDefinitionRule616);
			idDotArrayRule();
			state._fsp--;

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:3: ( ASSIGN assignTypologyRule )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==ASSIGN) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:4: ASSIGN assignTypologyRule
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDefinitionRule621); 
					pushFollow(FOLLOW_assignTypologyRule_in_variableDefinitionRule623);
					assignTypologyRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:148:3: ( SC )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==SC) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:148:3: SC
					{
					match(input,SC,FOLLOW_SC_in_variableDefinitionRule629); 
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



	// $ANTLR start "assignTypologyRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:1: assignTypologyRule : ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED | functionDefinitionRule | expressionRule | newRule | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) ) ;
	public final void assignTypologyRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:153:2: ( ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED | functionDefinitionRule | expressionRule | newRule | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) ) )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:3: ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED | functionDefinitionRule | expressionRule | newRule | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) )
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:3: ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED | functionDefinitionRule | expressionRule | newRule | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) )
			int alt34=13;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt34=1;
				}
				break;
			case INTEGER:
				{
				alt34=2;
				}
				break;
			case FLOAT:
				{
				alt34=3;
				}
				break;
			case LBR:
				{
				alt34=4;
				}
				break;
			case LB:
				{
				alt34=5;
				}
				break;
			case TRUE:
				{
				alt34=6;
				}
				break;
			case FALSE:
				{
				alt34=7;
				}
				break;
			case NULL:
				{
				alt34=8;
				}
				break;
			case UNDEFINED:
				{
				alt34=9;
				}
				break;
			case FUNCTION:
				{
				alt34=10;
				}
				break;
			case SUB:
				{
				alt34=11;
				}
				break;
			case NEW:
				{
				alt34=12;
				}
				break;
			case ID:
			case THIS:
				{
				alt34=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:4: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_assignTypologyRule648); 
					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:13: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_assignTypologyRule652); 
					}
					break;
				case 3 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:23: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_assignTypologyRule656); 
					}
					break;
				case 4 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:31: objectRule
					{
					pushFollow(FOLLOW_objectRule_in_assignTypologyRule660);
					objectRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:44: arrayRule
					{
					pushFollow(FOLLOW_arrayRule_in_assignTypologyRule664);
					arrayRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:56: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_assignTypologyRule668); 
					}
					break;
				case 7 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:63: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_assignTypologyRule672); 
					}
					break;
				case 8 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:71: NULL
					{
					match(input,NULL,FOLLOW_NULL_in_assignTypologyRule676); 
					}
					break;
				case 9 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:78: UNDEFINED
					{
					match(input,UNDEFINED,FOLLOW_UNDEFINED_in_assignTypologyRule680); 
					}
					break;
				case 10 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:90: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_assignTypologyRule684);
					functionDefinitionRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:115: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_assignTypologyRule688);
					expressionRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:132: newRule
					{
					pushFollow(FOLLOW_newRule_in_assignTypologyRule692);
					newRule();
					state._fsp--;

					}
					break;
				case 13 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:142: ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? )
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:142: ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? )
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:143: idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )?
					{
					pushFollow(FOLLOW_idDotArrayRule_in_assignTypologyRule697);
					idDotArrayRule();
					state._fsp--;

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:158: ( LP assignTypologyRule ( CM assignTypologyRule )* RP )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==LP) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:159: LP assignTypologyRule ( CM assignTypologyRule )* RP
							{
							match(input,LP,FOLLOW_LP_in_assignTypologyRule700); 
							pushFollow(FOLLOW_assignTypologyRule_in_assignTypologyRule702);
							assignTypologyRule();
							state._fsp--;

							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:181: ( CM assignTypologyRule )*
							loop32:
							while (true) {
								int alt32=2;
								int LA32_0 = input.LA(1);
								if ( (LA32_0==CM) ) {
									alt32=1;
								}

								switch (alt32) {
								case 1 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:182: CM assignTypologyRule
									{
									match(input,CM,FOLLOW_CM_in_assignTypologyRule705); 
									pushFollow(FOLLOW_assignTypologyRule_in_assignTypologyRule707);
									assignTypologyRule();
									state._fsp--;

									}
									break;

								default :
									break loop32;
								}
							}

							match(input,RP,FOLLOW_RP_in_assignTypologyRule711); 
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
	// $ANTLR end "assignTypologyRule"



	// $ANTLR start "newRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:157:1: newRule : NEW ID LP ( assignTypologyRule ( CM assignTypologyRule )* )? RP ;
	public final void newRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:158:2: ( NEW ID LP ( assignTypologyRule ( CM assignTypologyRule )* )? RP )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:159:3: NEW ID LP ( assignTypologyRule ( CM assignTypologyRule )* )? RP
			{
			match(input,NEW,FOLLOW_NEW_in_newRule729); 
			match(input,ID,FOLLOW_ID_in_newRule731); 
			match(input,LP,FOLLOW_LP_in_newRule733); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:159:13: ( assignTypologyRule ( CM assignTypologyRule )* )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==FALSE||LA36_0==FLOAT||LA36_0==FUNCTION||LA36_0==ID||LA36_0==INTEGER||(LA36_0 >= LB && LA36_0 <= LBR)||LA36_0==NEW||LA36_0==NULL||(LA36_0 >= STRING && LA36_0 <= SUB)||LA36_0==THIS||LA36_0==TRUE||LA36_0==UNDEFINED) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:159:14: assignTypologyRule ( CM assignTypologyRule )*
					{
					pushFollow(FOLLOW_assignTypologyRule_in_newRule736);
					assignTypologyRule();
					state._fsp--;

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:159:33: ( CM assignTypologyRule )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==CM) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:159:34: CM assignTypologyRule
							{
							match(input,CM,FOLLOW_CM_in_newRule739); 
							pushFollow(FOLLOW_assignTypologyRule_in_newRule741);
							assignTypologyRule();
							state._fsp--;

							}
							break;

						default :
							break loop35;
						}
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_newRule747); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:1: arithmeticOperatorsRule : ( ADD | SUB | STAR | DIV | MOD | INC | DEC | EXP ) ;
	public final void arithmeticOperatorsRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:163:2: ( ( ADD | SUB | STAR | DIV | MOD | INC | DEC | EXP ) )
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:174:1: comparatorRule : ( EQ | NEQ | LT | LE | GT | GE | TEQ | NTEQ ) ;
	public final void comparatorRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:175:2: ( ( EQ | NEQ | LT | LE | GT | GE | TEQ | NTEQ ) )
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:179:1: conditionRule : SC ;
	public final void conditionRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:180:2: ( SC )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:181:2: SC
			{
			match(input,SC,FOLLOW_SC_in_conditionRule857); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:184:1: blockRule : LBR ( instructionRule )* RBR ;
	public final void blockRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:185:2: ( LBR ( instructionRule )* RBR )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:186:3: LBR ( instructionRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_blockRule870); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:186:7: ( instructionRule )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==SC) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:186:7: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_blockRule872);
					instructionRule();
					state._fsp--;

					}
					break;

				default :
					break loop37;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_blockRule875); 
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



	// $ANTLR start "ifStatementRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:189:1: ifStatementRule : IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )* ;
	public final void ifStatementRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:190:2: ( IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )* )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:191:3: IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )*
			{
			match(input,IF,FOLLOW_IF_in_ifStatementRule889); 
			match(input,LP,FOLLOW_LP_in_ifStatementRule891); 
			pushFollow(FOLLOW_conditionRule_in_ifStatementRule893);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_ifStatementRule895); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:192:4: ( blockRule | instructionRule )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==LBR) ) {
				alt38=1;
			}
			else if ( (LA38_0==SC) ) {
				alt38=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:192:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_ifStatementRule902);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:192:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_ifStatementRule906);
					instructionRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:193:3: ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==ELSE) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:193:4: ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule )
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStatementRule912); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:193:9: ( IF LP conditionRule RP )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==IF) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:193:10: IF LP conditionRule RP
							{
							match(input,IF,FOLLOW_IF_in_ifStatementRule915); 
							match(input,LP,FOLLOW_LP_in_ifStatementRule917); 
							pushFollow(FOLLOW_conditionRule_in_ifStatementRule919);
							conditionRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_ifStatementRule921); 
							}
							break;

					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:193:35: ( blockRule | instructionRule )
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==LBR) ) {
						alt40=1;
					}
					else if ( (LA40_0==SC) ) {
						alt40=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 40, 0, input);
						throw nvae;
					}

					switch (alt40) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:193:36: blockRule
							{
							pushFollow(FOLLOW_blockRule_in_ifStatementRule926);
							blockRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:193:48: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_ifStatementRule930);
							instructionRule();
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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifStatementRule"

	// Delegated rules



	public static final BitSet FOLLOW_getRule_in_parseJava64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDefinitionRule_in_parseJava70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectRule_in_parseJava75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatementRule_in_parseJava80 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOCUMENT_in_getRule95 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_DOT_in_getRule99 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_getRule103 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_getRule107 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_STRING_in_getRule111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_getRule113 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_getRule115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule132 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotIdRule135 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule137 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_idDotIdRule_in_idDotArrayRule155 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_THIS_in_idDotArrayRule160 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRule163 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idDotArrayRule165 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_LB_in_idDotArrayRule174 = new BitSet(new long[]{0x0040800000000000L,0x0000000084000000L});
	public static final BitSet FOLLOW_INTEGER_in_idDotArrayRule177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_idDotArrayRule_in_idDotArrayRule182 = new BitSet(new long[]{0x2000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LP_in_idDotArrayRule185 = new BitSet(new long[]{0x03408A8000000000L,0x000000128C000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idDotArrayRule187 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_idDotArrayRule190 = new BitSet(new long[]{0x03408A8000000000L,0x000000128C000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idDotArrayRule192 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_idDotArrayRule196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_idDotArrayRule203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_idDotArrayRule206 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRule211 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idDotArrayRule213 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_SUB_in_expressionRule232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SC_in_instructionRule246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnRule260 = new BitSet(new long[]{0x03408A8000000000L,0x000000128C000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_returnRule262 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_returnRule264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_functionDeclarationRule280 = new BitSet(new long[]{0x2000800000000000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule282 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_functionDeclarationRule285 = new BitSet(new long[]{0x0000800000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule288 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_functionDeclarationRule292 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule294 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_functionDeclarationRule301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationRule_in_functionDefinitionRule315 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_functionDefinitionRule319 = new BitSet(new long[]{0x0000000000000000L,0x00000000004C0000L});
	public static final BitSet FOLLOW_instructionRule_in_functionDefinitionRule324 = new BitSet(new long[]{0x0000000000000000L,0x00000000004C0000L});
	public static final BitSet FOLLOW_returnRule_in_functionDefinitionRule330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_functionDefinitionRule335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_functionCallRule349 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_functionCallRule351 = new BitSet(new long[]{0x03408A8000000000L,0x000000128C100090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_functionCallRule354 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_functionCallRule357 = new BitSet(new long[]{0x03408A8000000000L,0x000000128C000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_functionCallRule359 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_functionCallRule365 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_functionCallRule367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_arrayRule387 = new BitSet(new long[]{0x03408A8000000000L,0x000000128C020090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_arrayRule397 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_CM_in_arrayRule403 = new BitSet(new long[]{0x03408A8000000000L,0x000000128C000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_arrayRule405 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_arrayRule417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectRule432 = new BitSet(new long[]{0x0000800000000000L,0x0000000004040000L});
	public static final BitSet FOLLOW_set_in_objectRule442 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule454 = new BitSet(new long[]{0x03408A8000000000L,0x000000128C000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_objectRule460 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_CM_in_objectRule470 = new BitSet(new long[]{0x0000800000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_set_in_objectRule475 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule487 = new BitSet(new long[]{0x03408A8000000000L,0x000000128C000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_objectRule493 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_objectRule509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_varDeclarationRule528 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_varDeclarationRule540 = new BitSet(new long[]{0x0000000000008002L,0x0000000000400000L});
	public static final BitSet FOLLOW_CM_in_varDeclarationRule543 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_varDeclarationRule545 = new BitSet(new long[]{0x0000000000008002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_varDeclarationRule549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_varAssignmentRule579 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_varAssignmentRule581 = new BitSet(new long[]{0x03408A8000000000L,0x000000128C000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_varAssignmentRule583 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_varAssignmentRule585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_variableDefinitionRule616 = new BitSet(new long[]{0x0000000000000082L,0x0000000000400000L});
	public static final BitSet FOLLOW_ASSIGN_in_variableDefinitionRule621 = new BitSet(new long[]{0x03408A8000000000L,0x000000128C000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_variableDefinitionRule623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_variableDefinitionRule629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_assignTypologyRule648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_assignTypologyRule652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_assignTypologyRule656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectRule_in_assignTypologyRule660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRule_in_assignTypologyRule664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_assignTypologyRule668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_assignTypologyRule672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_assignTypologyRule676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNDEFINED_in_assignTypologyRule680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_assignTypologyRule684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionRule_in_assignTypologyRule688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newRule_in_assignTypologyRule692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_assignTypologyRule697 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_LP_in_assignTypologyRule700 = new BitSet(new long[]{0x03408A8000000000L,0x000000128C000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_assignTypologyRule702 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_assignTypologyRule705 = new BitSet(new long[]{0x03408A8000000000L,0x000000128C000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_assignTypologyRule707 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_assignTypologyRule711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_newRule729 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_newRule731 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_newRule733 = new BitSet(new long[]{0x03408A8000000000L,0x000000128C100090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_newRule736 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_newRule739 = new BitSet(new long[]{0x03408A8000000000L,0x000000128C000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_newRule741 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_newRule747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SC_in_conditionRule857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_blockRule870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000440000L});
	public static final BitSet FOLLOW_instructionRule_in_blockRule872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000440000L});
	public static final BitSet FOLLOW_RBR_in_blockRule875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatementRule889 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_ifStatementRule891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_conditionRule_in_ifStatementRule893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ifStatementRule895 = new BitSet(new long[]{0x0200000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_blockRule_in_ifStatementRule902 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_instructionRule_in_ifStatementRule906 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ELSE_in_ifStatementRule912 = new BitSet(new long[]{0x0201000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_IF_in_ifStatementRule915 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_ifStatementRule917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_conditionRule_in_ifStatementRule919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ifStatementRule921 = new BitSet(new long[]{0x0200000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_blockRule_in_ifStatementRule926 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_instructionRule_in_ifStatementRule930 = new BitSet(new long[]{0x0000000020000002L});
}
