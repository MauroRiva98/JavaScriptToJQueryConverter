// $ANTLR 3.5.1 C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g 2023-07-17 18:58:48

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
		"DIV", "DO", "DOCUMENT", "DOT", "ELSE", "ENUM", "EQ", "ERROR_TK", "ESC_SEQ", 
		"EXP", "EXPONENT", "EXPORT", "EXTENDS", "FALSE", "FINALLY", "FLOAT", "FOR", 
		"FUNCTION", "GE", "GT", "HEX_DIGIT", "ID", "IF", "IMPLEMENTS", "IMPORT", 
		"IN", "INC", "INSTANCEOF", "INTEGER", "INTERFACE", "LB", "LBR", "LE", 
		"LET", "LETTER", "LP", "LT", "MOD", "NEQ", "NEW", "NOT", "NULL", "OCTAL_ESC", 
		"OR", "OR_BIT", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RB", "RBR", 
		"RETURN", "RP", "SC", "STAR", "STATIC", "STRING", "SUB", "SUPER", "SWITCH", 
		"TEQ", "THIS", "THROW", "TRUE", "TRY", "TYPEOF", "UNDEFINED", "UNICODE_ESC", 
		"VAR", "VOID", "WHILE", "WITH", "WS", "XOR", "YIELD"
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
	public static final int DO=25;
	public static final int DOCUMENT=26;
	public static final int DOT=27;
	public static final int ELSE=28;
	public static final int ENUM=29;
	public static final int EQ=30;
	public static final int ERROR_TK=31;
	public static final int ESC_SEQ=32;
	public static final int EXP=33;
	public static final int EXPONENT=34;
	public static final int EXPORT=35;
	public static final int EXTENDS=36;
	public static final int FALSE=37;
	public static final int FINALLY=38;
	public static final int FLOAT=39;
	public static final int FOR=40;
	public static final int FUNCTION=41;
	public static final int GE=42;
	public static final int GT=43;
	public static final int HEX_DIGIT=44;
	public static final int ID=45;
	public static final int IF=46;
	public static final int IMPLEMENTS=47;
	public static final int IMPORT=48;
	public static final int IN=49;
	public static final int INC=50;
	public static final int INSTANCEOF=51;
	public static final int INTEGER=52;
	public static final int INTERFACE=53;
	public static final int LB=54;
	public static final int LBR=55;
	public static final int LE=56;
	public static final int LET=57;
	public static final int LETTER=58;
	public static final int LP=59;
	public static final int LT=60;
	public static final int MOD=61;
	public static final int NEQ=62;
	public static final int NEW=63;
	public static final int NOT=64;
	public static final int NULL=65;
	public static final int OCTAL_ESC=66;
	public static final int OR=67;
	public static final int OR_BIT=68;
	public static final int PACKAGE=69;
	public static final int PRIVATE=70;
	public static final int PROTECTED=71;
	public static final int PUBLIC=72;
	public static final int RB=73;
	public static final int RBR=74;
	public static final int RETURN=75;
	public static final int RP=76;
	public static final int SC=77;
	public static final int STAR=78;
	public static final int STATIC=79;
	public static final int STRING=80;
	public static final int SUB=81;
	public static final int SUPER=82;
	public static final int SWITCH=83;
	public static final int TEQ=84;
	public static final int THIS=85;
	public static final int THROW=86;
	public static final int TRUE=87;
	public static final int TRY=88;
	public static final int TYPEOF=89;
	public static final int UNDEFINED=90;
	public static final int UNICODE_ESC=91;
	public static final int VAR=92;
	public static final int VOID=93;
	public static final int WHILE=94;
	public static final int WITH=95;
	public static final int WS=96;
	public static final int XOR=97;
	public static final int YIELD=98;

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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:46:1: parseJava : ( getRule | varDeclarationRule );
	public final void parseJava() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:48:2: ( getRule | varDeclarationRule )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==DOCUMENT) ) {
				alt1=1;
			}
			else if ( (LA1_0==CONST||LA1_0==LET||LA1_0==VAR) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:49:3: getRule
					{
					pushFollow(FOLLOW_getRule_in_parseJava62);
					getRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:50:4: varDeclarationRule
					{
					pushFollow(FOLLOW_varDeclarationRule_in_parseJava68);
					varDeclarationRule();
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:52:1: getRule : DOCUMENT DOT get= ID x= LP i= STRING RP ( SC )? ;
	public final JavaScriptToJQueryConverterParser.getRule_return getRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.getRule_return retval = new JavaScriptToJQueryConverterParser.getRule_return();
		retval.start = input.LT(1);

		Token get=null;
		Token x=null;
		Token i=null;

		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:53:2: ( DOCUMENT DOT get= ID x= LP i= STRING RP ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:54:3: DOCUMENT DOT get= ID x= LP i= STRING RP ( SC )?
			{
			match(input,DOCUMENT,FOLLOW_DOCUMENT_in_getRule81); 
			System.out.println("Ho riconosciuto DOCUMENT");
			match(input,DOT,FOLLOW_DOT_in_getRule85); 
			get=(Token)match(input,ID,FOLLOW_ID_in_getRule89); 
			x=(Token)match(input,LP,FOLLOW_LP_in_getRule93); 
			i=(Token)match(input,STRING,FOLLOW_STRING_in_getRule97); 
			match(input,RP,FOLLOW_RP_in_getRule99); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:54:90: ( SC )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==SC) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:54:90: SC
					{
					match(input,SC,FOLLOW_SC_in_getRule101); 
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
			match(input,ID,FOLLOW_ID_in_idDotIdRule118); 
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
					match(input,DOT,FOLLOW_DOT_in_idDotIdRule121); 
					match(input,ID,FOLLOW_ID_in_idDotIdRule123); 
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



	// $ANTLR start "expressionRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:62:1: expressionRule : SC ;
	public final void expressionRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:63:2: ( SC )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:2: SC
			{
			match(input,SC,FOLLOW_SC_in_expressionRule140); 
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



	// $ANTLR start "functionDeclarationRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:68:1: functionDeclarationRule : FUNCTION ID LP ( ID ( ( CM ID )* ) )? RP ;
	public final void functionDeclarationRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:2: ( FUNCTION ID LP ( ID ( ( CM ID )* ) )? RP )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:3: FUNCTION ID LP ( ID ( ( CM ID )* ) )? RP
			{
			match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclarationRule154); 
			match(input,ID,FOLLOW_ID_in_functionDeclarationRule156); 
			match(input,LP,FOLLOW_LP_in_functionDeclarationRule158); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:18: ( ID ( ( CM ID )* ) )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:19: ID ( ( CM ID )* )
					{
					match(input,ID,FOLLOW_ID_in_functionDeclarationRule161); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:22: ( ( CM ID )* )
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:23: ( CM ID )*
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:23: ( CM ID )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==CM) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:24: CM ID
							{
							match(input,CM,FOLLOW_CM_in_functionDeclarationRule165); 
							match(input,ID,FOLLOW_ID_in_functionDeclarationRule167); 
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

			match(input,RP,FOLLOW_RP_in_functionDeclarationRule174); 
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



	// $ANTLR start "arrayRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:73:1: arrayRule : LB ( ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED ) ( CM ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED ) )* )? RB ;
	public final void arrayRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:2: ( LB ( ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED ) ( CM ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED ) )* )? RB )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:75:3: LB ( ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED ) ( CM ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED ) )* )? RB
			{
			match(input,LB,FOLLOW_LB_in_arrayRule188); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:4: ( ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED ) ( CM ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED ) )* )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==FALSE||LA9_0==FLOAT||LA9_0==INTEGER||(LA9_0 >= LB && LA9_0 <= LBR)||LA9_0==NULL||LA9_0==SC||LA9_0==STRING||LA9_0==TRUE||LA9_0==UNDEFINED) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:4: ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED ) ( CM ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED ) )*
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:4: ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED )
					int alt6=10;
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
					case LBR:
						{
						alt6=6;
						}
						break;
					case LB:
						{
						alt6=7;
						}
						break;
					case NULL:
						{
						alt6=8;
						}
						break;
					case SC:
						{
						alt6=9;
						}
						break;
					case UNDEFINED:
						{
						alt6=10;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:5: STRING
							{
							match(input,STRING,FOLLOW_STRING_in_arrayRule199); 
							}
							break;
						case 2 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:14: INTEGER
							{
							match(input,INTEGER,FOLLOW_INTEGER_in_arrayRule203); 
							}
							break;
						case 3 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:24: FLOAT
							{
							match(input,FLOAT,FOLLOW_FLOAT_in_arrayRule207); 
							}
							break;
						case 4 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:32: TRUE
							{
							match(input,TRUE,FOLLOW_TRUE_in_arrayRule211); 
							}
							break;
						case 5 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:39: FALSE
							{
							match(input,FALSE,FOLLOW_FALSE_in_arrayRule215); 
							}
							break;
						case 6 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:47: objectRule
							{
							pushFollow(FOLLOW_objectRule_in_arrayRule219);
							objectRule();
							state._fsp--;

							}
							break;
						case 7 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:60: arrayRule
							{
							pushFollow(FOLLOW_arrayRule_in_arrayRule223);
							arrayRule();
							state._fsp--;

							}
							break;
						case 8 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:72: NULL
							{
							match(input,NULL,FOLLOW_NULL_in_arrayRule227); 
							}
							break;
						case 9 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:79: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_arrayRule231);
							expressionRule();
							state._fsp--;

							}
							break;
						case 10 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:96: UNDEFINED
							{
							match(input,UNDEFINED,FOLLOW_UNDEFINED_in_arrayRule235); 
							}
							break;

					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:4: ( CM ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED ) )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==CM) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:5: CM ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED )
							{
							match(input,CM,FOLLOW_CM_in_arrayRule242); 
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:8: ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED )
							int alt7=10;
							switch ( input.LA(1) ) {
							case STRING:
								{
								alt7=1;
								}
								break;
							case INTEGER:
								{
								alt7=2;
								}
								break;
							case FLOAT:
								{
								alt7=3;
								}
								break;
							case TRUE:
								{
								alt7=4;
								}
								break;
							case FALSE:
								{
								alt7=5;
								}
								break;
							case LBR:
								{
								alt7=6;
								}
								break;
							case LB:
								{
								alt7=7;
								}
								break;
							case NULL:
								{
								alt7=8;
								}
								break;
							case SC:
								{
								alt7=9;
								}
								break;
							case UNDEFINED:
								{
								alt7=10;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 7, 0, input);
								throw nvae;
							}
							switch (alt7) {
								case 1 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:9: STRING
									{
									match(input,STRING,FOLLOW_STRING_in_arrayRule245); 
									}
									break;
								case 2 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:18: INTEGER
									{
									match(input,INTEGER,FOLLOW_INTEGER_in_arrayRule249); 
									}
									break;
								case 3 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:28: FLOAT
									{
									match(input,FLOAT,FOLLOW_FLOAT_in_arrayRule253); 
									}
									break;
								case 4 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:36: TRUE
									{
									match(input,TRUE,FOLLOW_TRUE_in_arrayRule257); 
									}
									break;
								case 5 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:43: FALSE
									{
									match(input,FALSE,FOLLOW_FALSE_in_arrayRule261); 
									}
									break;
								case 6 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:51: objectRule
									{
									pushFollow(FOLLOW_objectRule_in_arrayRule265);
									objectRule();
									state._fsp--;

									}
									break;
								case 7 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:64: arrayRule
									{
									pushFollow(FOLLOW_arrayRule_in_arrayRule269);
									arrayRule();
									state._fsp--;

									}
									break;
								case 8 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:76: NULL
									{
									match(input,NULL,FOLLOW_NULL_in_arrayRule273); 
									}
									break;
								case 9 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:83: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_arrayRule277);
									expressionRule();
									state._fsp--;

									}
									break;
								case 10 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:100: UNDEFINED
									{
									match(input,UNDEFINED,FOLLOW_UNDEFINED_in_arrayRule281); 
									}
									break;

							}

							}
							break;

						default :
							break loop8;
						}
					}

					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_arrayRule294); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:83:1: objectRule : LBR ( ( ID | STRING ) CL ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED ) ( CM ( ID | STRING ) CL ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED ) )* )? RBR ;
	public final void objectRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:2: ( LBR ( ( ID | STRING ) CL ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED ) ( CM ( ID | STRING ) CL ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED ) )* )? RBR )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:3: LBR ( ( ID | STRING ) CL ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED ) ( CM ( ID | STRING ) CL ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED ) )* )? RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectRule308); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:86:4: ( ( ID | STRING ) CL ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED ) ( CM ( ID | STRING ) CL ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED ) )* )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ID||LA13_0==STRING) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:4: ( ID | STRING ) CL ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED ) ( CM ( ID | STRING ) CL ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED ) )*
					{
					if ( input.LA(1)==ID||input.LA(1)==STRING ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,CL,FOLLOW_CL_in_objectRule330); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:89:4: ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED )
					int alt10=9;
					switch ( input.LA(1) ) {
					case STRING:
						{
						alt10=1;
						}
						break;
					case INTEGER:
						{
						alt10=2;
						}
						break;
					case FLOAT:
						{
						alt10=3;
						}
						break;
					case LBR:
						{
						alt10=4;
						}
						break;
					case LB:
						{
						alt10=5;
						}
						break;
					case TRUE:
						{
						alt10=6;
						}
						break;
					case FALSE:
						{
						alt10=7;
						}
						break;
					case NULL:
						{
						alt10=8;
						}
						break;
					case UNDEFINED:
						{
						alt10=9;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:89:5: STRING
							{
							match(input,STRING,FOLLOW_STRING_in_objectRule337); 
							}
							break;
						case 2 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:89:14: INTEGER
							{
							match(input,INTEGER,FOLLOW_INTEGER_in_objectRule341); 
							}
							break;
						case 3 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:89:24: FLOAT
							{
							match(input,FLOAT,FOLLOW_FLOAT_in_objectRule345); 
							}
							break;
						case 4 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:89:32: objectRule
							{
							pushFollow(FOLLOW_objectRule_in_objectRule349);
							objectRule();
							state._fsp--;

							}
							break;
						case 5 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:89:45: arrayRule
							{
							pushFollow(FOLLOW_arrayRule_in_objectRule353);
							arrayRule();
							state._fsp--;

							}
							break;
						case 6 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:89:57: TRUE
							{
							match(input,TRUE,FOLLOW_TRUE_in_objectRule357); 
							}
							break;
						case 7 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:89:64: FALSE
							{
							match(input,FALSE,FOLLOW_FALSE_in_objectRule361); 
							}
							break;
						case 8 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:89:72: NULL
							{
							match(input,NULL,FOLLOW_NULL_in_objectRule365); 
							}
							break;
						case 9 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:89:79: UNDEFINED
							{
							match(input,UNDEFINED,FOLLOW_UNDEFINED_in_objectRule369); 
							}
							break;

					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:90:4: ( CM ( ID | STRING ) CL ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED ) )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==CM) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:4: CM ( ID | STRING ) CL ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED )
							{
							match(input,CM,FOLLOW_CM_in_objectRule380); 
							if ( input.LA(1)==ID||input.LA(1)==STRING ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,CL,FOLLOW_CL_in_objectRule397); 
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:4: ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED )
							int alt11=9;
							switch ( input.LA(1) ) {
							case STRING:
								{
								alt11=1;
								}
								break;
							case INTEGER:
								{
								alt11=2;
								}
								break;
							case FLOAT:
								{
								alt11=3;
								}
								break;
							case LBR:
								{
								alt11=4;
								}
								break;
							case LB:
								{
								alt11=5;
								}
								break;
							case TRUE:
								{
								alt11=6;
								}
								break;
							case FALSE:
								{
								alt11=7;
								}
								break;
							case NULL:
								{
								alt11=8;
								}
								break;
							case UNDEFINED:
								{
								alt11=9;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 11, 0, input);
								throw nvae;
							}
							switch (alt11) {
								case 1 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:5: STRING
									{
									match(input,STRING,FOLLOW_STRING_in_objectRule404); 
									}
									break;
								case 2 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:14: INTEGER
									{
									match(input,INTEGER,FOLLOW_INTEGER_in_objectRule408); 
									}
									break;
								case 3 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:24: FLOAT
									{
									match(input,FLOAT,FOLLOW_FLOAT_in_objectRule412); 
									}
									break;
								case 4 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:32: objectRule
									{
									pushFollow(FOLLOW_objectRule_in_objectRule416);
									objectRule();
									state._fsp--;

									}
									break;
								case 5 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:45: arrayRule
									{
									pushFollow(FOLLOW_arrayRule_in_objectRule420);
									arrayRule();
									state._fsp--;

									}
									break;
								case 6 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:57: TRUE
									{
									match(input,TRUE,FOLLOW_TRUE_in_objectRule424); 
									}
									break;
								case 7 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:64: FALSE
									{
									match(input,FALSE,FOLLOW_FALSE_in_objectRule428); 
									}
									break;
								case 8 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:72: NULL
									{
									match(input,NULL,FOLLOW_NULL_in_objectRule432); 
									}
									break;
								case 9 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:79: UNDEFINED
									{
									match(input,UNDEFINED,FOLLOW_UNDEFINED_in_objectRule436); 
									}
									break;

							}

							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_objectRule453); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:1: varDeclarationRule : ( VAR | LET | CONST ) idDotIdRule ( CM idDotIdRule )* ( SC )? ;
	public final void varDeclarationRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:101:2: ( ( VAR | LET | CONST ) idDotIdRule ( CM idDotIdRule )* ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:102:3: ( VAR | LET | CONST ) idDotIdRule ( CM idDotIdRule )* ( SC )?
			{
			if ( input.LA(1)==CONST||input.LA(1)==LET||input.LA(1)==VAR ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_idDotIdRule_in_varDeclarationRule479);
			idDotIdRule();
			state._fsp--;

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:102:35: ( CM idDotIdRule )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==CM) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:102:36: CM idDotIdRule
					{
					match(input,CM,FOLLOW_CM_in_varDeclarationRule482); 
					pushFollow(FOLLOW_idDotIdRule_in_varDeclarationRule484);
					idDotIdRule();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:102:53: ( SC )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==SC) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:102:53: SC
					{
					match(input,SC,FOLLOW_SC_in_varDeclarationRule488); 
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



	// $ANTLR start "assignRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:105:1: assignRule : ( ID | INTEGER | FLOAT | STRING |);
	public final void assignRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:106:2: ( ID | INTEGER | FLOAT | STRING |)
			int alt16=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt16=1;
				}
				break;
			case INTEGER:
				{
				alt16=2;
				}
				break;
			case FLOAT:
				{
				alt16=3;
				}
				break;
			case STRING:
				{
				alt16=4;
				}
				break;
			case EOF:
				{
				alt16=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:107:3: ID
					{
					match(input,ID,FOLLOW_ID_in_assignRule502); 
					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:107:8: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_assignRule506); 
					}
					break;
				case 3 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:107:18: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_assignRule510); 
					}
					break;
				case 4 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:107:26: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_assignRule514); 
					}
					break;
				case 5 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:108:2: 
					{
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
	// $ANTLR end "assignRule"



	// $ANTLR start "varAssignmentRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:1: varAssignmentRule : ( VAR | LET | CONST )? idDotIdRule ASSIGN () ( SC )? ;
	public final void varAssignmentRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:111:2: ( ( VAR | LET | CONST )? idDotIdRule ASSIGN () ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:112:3: ( VAR | LET | CONST )? idDotIdRule ASSIGN () ( SC )?
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:112:3: ( VAR | LET | CONST )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==CONST||LA17_0==LET||LA17_0==VAR) ) {
				alt17=1;
			}
			switch (alt17) {
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

			pushFollow(FOLLOW_idDotIdRule_in_varAssignmentRule545);
			idDotIdRule();
			state._fsp--;

			match(input,ASSIGN,FOLLOW_ASSIGN_in_varAssignmentRule547); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:112:43: ()
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:112:44: 
			{
			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:112:46: ( SC )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==SC) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:112:46: SC
					{
					match(input,SC,FOLLOW_SC_in_varAssignmentRule552); 
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

	// Delegated rules



	public static final BitSet FOLLOW_getRule_in_parseJava62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDeclarationRule_in_parseJava68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOCUMENT_in_getRule81 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_DOT_in_getRule85 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ID_in_getRule89 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LP_in_getRule93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_in_getRule97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RP_in_getRule99 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_getRule101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule118 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_DOT_in_idDotIdRule121 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule123 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_SC_in_expressionRule140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_functionDeclarationRule154 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule156 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LP_in_functionDeclarationRule158 = new BitSet(new long[]{0x0000200000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule161 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
	public static final BitSet FOLLOW_CM_in_functionDeclarationRule165 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule167 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RP_in_functionDeclarationRule174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_arrayRule188 = new BitSet(new long[]{0x00D000A000000000L,0x0000000004812202L});
	public static final BitSet FOLLOW_STRING_in_arrayRule199 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_INTEGER_in_arrayRule203 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_FLOAT_in_arrayRule207 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_TRUE_in_arrayRule211 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_FALSE_in_arrayRule215 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_objectRule_in_arrayRule219 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_arrayRule_in_arrayRule223 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_NULL_in_arrayRule227 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_expressionRule_in_arrayRule231 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_UNDEFINED_in_arrayRule235 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_arrayRule242 = new BitSet(new long[]{0x00D000A000000000L,0x0000000004812002L});
	public static final BitSet FOLLOW_STRING_in_arrayRule245 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_INTEGER_in_arrayRule249 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_FLOAT_in_arrayRule253 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_TRUE_in_arrayRule257 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_FALSE_in_arrayRule261 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_objectRule_in_arrayRule265 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_arrayRule_in_arrayRule269 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_NULL_in_arrayRule273 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_expressionRule_in_arrayRule277 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_UNDEFINED_in_arrayRule281 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000200L});
	public static final BitSet FOLLOW_RB_in_arrayRule294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectRule308 = new BitSet(new long[]{0x0000200000000000L,0x0000000000010400L});
	public static final BitSet FOLLOW_set_in_objectRule318 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule330 = new BitSet(new long[]{0x00D000A000000000L,0x0000000004810002L});
	public static final BitSet FOLLOW_STRING_in_objectRule337 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_INTEGER_in_objectRule341 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_FLOAT_in_objectRule345 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_objectRule_in_objectRule349 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_arrayRule_in_objectRule353 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TRUE_in_objectRule357 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_FALSE_in_objectRule361 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_NULL_in_objectRule365 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_UNDEFINED_in_objectRule369 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_CM_in_objectRule380 = new BitSet(new long[]{0x0000200000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_set_in_objectRule385 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule397 = new BitSet(new long[]{0x00D000A000000000L,0x0000000004810002L});
	public static final BitSet FOLLOW_STRING_in_objectRule404 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_INTEGER_in_objectRule408 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_FLOAT_in_objectRule412 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_objectRule_in_objectRule416 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_arrayRule_in_objectRule420 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_TRUE_in_objectRule424 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_FALSE_in_objectRule428 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_NULL_in_objectRule432 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_UNDEFINED_in_objectRule436 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RBR_in_objectRule453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_varDeclarationRule467 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_idDotIdRule_in_varDeclarationRule479 = new BitSet(new long[]{0x0000000000008002L,0x0000000000002000L});
	public static final BitSet FOLLOW_CM_in_varDeclarationRule482 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_idDotIdRule_in_varDeclarationRule484 = new BitSet(new long[]{0x0000000000008002L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_varDeclarationRule488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignRule502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_assignRule506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_assignRule510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_assignRule514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotIdRule_in_varAssignmentRule545 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_varAssignmentRule547 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_SC_in_varAssignmentRule552 = new BitSet(new long[]{0x0000000000000002L});
}
