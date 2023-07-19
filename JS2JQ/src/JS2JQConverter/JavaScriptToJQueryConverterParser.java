// $ANTLR 3.5.1 C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g 2023-07-19 17:19:27

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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:46:1: parseJava : ( getRule | variableDefinitionRule | objectRule );
	public final void parseJava() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:48:2: ( getRule | variableDefinitionRule | objectRule )
			int alt1=3;
			switch ( input.LA(1) ) {
			case DOCUMENT:
				{
				alt1=1;
				}
				break;
			case CONST:
			case ID:
			case LET:
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:49:3: getRule
					{
					pushFollow(FOLLOW_getRule_in_parseJava63);
					getRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:50:4: variableDefinitionRule
					{
					pushFollow(FOLLOW_variableDefinitionRule_in_parseJava69);
					variableDefinitionRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:51:4: objectRule
					{
					pushFollow(FOLLOW_objectRule_in_parseJava74);
					objectRule();
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:54:1: getRule : DOCUMENT DOT get= ID x= LP i= STRING RP ( SC )? ;
	public final JavaScriptToJQueryConverterParser.getRule_return getRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.getRule_return retval = new JavaScriptToJQueryConverterParser.getRule_return();
		retval.start = input.LT(1);

		Token get=null;
		Token x=null;
		Token i=null;

		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:2: ( DOCUMENT DOT get= ID x= LP i= STRING RP ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:56:3: DOCUMENT DOT get= ID x= LP i= STRING RP ( SC )?
			{
			match(input,DOCUMENT,FOLLOW_DOCUMENT_in_getRule89); 
			System.out.println("Ho riconosciuto DOCUMENT");
			match(input,DOT,FOLLOW_DOT_in_getRule93); 
			get=(Token)match(input,ID,FOLLOW_ID_in_getRule97); 
			x=(Token)match(input,LP,FOLLOW_LP_in_getRule101); 
			i=(Token)match(input,STRING,FOLLOW_STRING_in_getRule105); 
			match(input,RP,FOLLOW_RP_in_getRule107); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:56:90: ( SC )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==SC) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:56:90: SC
					{
					match(input,SC,FOLLOW_SC_in_getRule109); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:59:1: idDotIdRule : ID ( DOT ID )* ;
	public final void idDotIdRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:60:2: ( ID ( DOT ID )* )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:61:3: ID ( DOT ID )*
			{
			match(input,ID,FOLLOW_ID_in_idDotIdRule126); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:61:6: ( DOT ID )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==DOT) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:61:7: DOT ID
					{
					match(input,DOT,FOLLOW_DOT_in_idDotIdRule129); 
					match(input,ID,FOLLOW_ID_in_idDotIdRule131); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:1: idDotArrayRule : idDotIdRule ( ( LB ( INTEGER | ID | STRING ) RB )+ ( DOT ID )* )* ;
	public final void idDotArrayRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:2: ( idDotIdRule ( ( LB ( INTEGER | ID | STRING ) RB )+ ( DOT ID )* )* )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:66:3: idDotIdRule ( ( LB ( INTEGER | ID | STRING ) RB )+ ( DOT ID )* )*
			{
			pushFollow(FOLLOW_idDotIdRule_in_idDotArrayRule148);
			idDotIdRule();
			state._fsp--;

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:66:15: ( ( LB ( INTEGER | ID | STRING ) RB )+ ( DOT ID )* )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==LB) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:66:16: ( LB ( INTEGER | ID | STRING ) RB )+ ( DOT ID )*
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:66:16: ( LB ( INTEGER | ID | STRING ) RB )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==LB) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:66:17: LB ( INTEGER | ID | STRING ) RB
							{
							match(input,LB,FOLLOW_LB_in_idDotArrayRule152); 
							if ( input.LA(1)==ID||input.LA(1)==INTEGER||input.LA(1)==STRING ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,RB,FOLLOW_RB_in_idDotArrayRule166); 
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:66:49: ( DOT ID )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==DOT) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:66:50: DOT ID
							{
							match(input,DOT,FOLLOW_DOT_in_idDotArrayRule171); 
							match(input,ID,FOLLOW_ID_in_idDotArrayRule173); 
							}
							break;

						default :
							break loop5;
						}
					}

					}
					break;

				default :
					break loop6;
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:1: expressionRule : SUB ;
	public final void expressionRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:2: ( SUB )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:71:3: SUB
			{
			match(input,SUB,FOLLOW_SUB_in_expressionRule192); 
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



	// $ANTLR start "istructionRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:1: istructionRule : SC ;
	public final void istructionRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:75:2: ( SC )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:2: SC
			{
			match(input,SC,FOLLOW_SC_in_istructionRule206); 
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
	// $ANTLR end "istructionRule"



	// $ANTLR start "functionDeclarationRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:79:1: functionDeclarationRule : FUNCTION ( ID )? LP ( ID ( ( CM ID )* ) )? RP ;
	public final void functionDeclarationRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:80:2: ( FUNCTION ( ID )? LP ( ID ( ( CM ID )* ) )? RP )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:81:3: FUNCTION ( ID )? LP ( ID ( ( CM ID )* ) )? RP
			{
			match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclarationRule221); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:81:12: ( ID )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ID) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:81:12: ID
					{
					match(input,ID,FOLLOW_ID_in_functionDeclarationRule223); 
					}
					break;

			}

			match(input,LP,FOLLOW_LP_in_functionDeclarationRule226); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:81:19: ( ID ( ( CM ID )* ) )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:81:20: ID ( ( CM ID )* )
					{
					match(input,ID,FOLLOW_ID_in_functionDeclarationRule229); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:81:23: ( ( CM ID )* )
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:81:24: ( CM ID )*
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:81:24: ( CM ID )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==CM) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:81:25: CM ID
							{
							match(input,CM,FOLLOW_CM_in_functionDeclarationRule233); 
							match(input,ID,FOLLOW_ID_in_functionDeclarationRule235); 
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

			match(input,RP,FOLLOW_RP_in_functionDeclarationRule242); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:1: functionDefinitionRule : functionDeclarationRule LBR ( istructionRule )* RBR ;
	public final void functionDefinitionRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:2: ( functionDeclarationRule LBR ( istructionRule )* RBR )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:86:3: functionDeclarationRule LBR ( istructionRule )* RBR
			{
			pushFollow(FOLLOW_functionDeclarationRule_in_functionDefinitionRule256);
			functionDeclarationRule();
			state._fsp--;

			match(input,LBR,FOLLOW_LBR_in_functionDefinitionRule260); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:88:4: ( istructionRule )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==SC) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:88:4: istructionRule
					{
					pushFollow(FOLLOW_istructionRule_in_functionDefinitionRule265);
					istructionRule();
					state._fsp--;

					}
					break;

				default :
					break loop10;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_functionDefinitionRule270); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:92:1: functionCallRule : idDotArrayRule LP ( ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED | idDotArrayRule ) ( ( CM ID | STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED | idDotArrayRule )* ) )? RP ( SC )? ;
	public final void functionCallRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:93:2: ( idDotArrayRule LP ( ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED | idDotArrayRule ) ( ( CM ID | STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED | idDotArrayRule )* ) )? RP ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:3: idDotArrayRule LP ( ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED | idDotArrayRule ) ( ( CM ID | STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED | idDotArrayRule )* ) )? RP ( SC )?
			{
			pushFollow(FOLLOW_idDotArrayRule_in_functionCallRule284);
			idDotArrayRule();
			state._fsp--;

			match(input,LP,FOLLOW_LP_in_functionCallRule286); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:21: ( ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED | idDotArrayRule ) ( ( CM ID | STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED | idDotArrayRule )* ) )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==FALSE||LA13_0==FLOAT||LA13_0==ID||LA13_0==INTEGER||(LA13_0 >= LB && LA13_0 <= LBR)||LA13_0==NULL||(LA13_0 >= STRING && LA13_0 <= SUB)||LA13_0==TRUE||LA13_0==UNDEFINED) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:22: ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED | idDotArrayRule ) ( ( CM ID | STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED | idDotArrayRule )* )
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:22: ( STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED | idDotArrayRule )
					int alt11=11;
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
					case TRUE:
						{
						alt11=4;
						}
						break;
					case FALSE:
						{
						alt11=5;
						}
						break;
					case LBR:
						{
						alt11=6;
						}
						break;
					case LB:
						{
						alt11=7;
						}
						break;
					case NULL:
						{
						alt11=8;
						}
						break;
					case SUB:
						{
						alt11=9;
						}
						break;
					case UNDEFINED:
						{
						alt11=10;
						}
						break;
					case ID:
						{
						alt11=11;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:23: STRING
							{
							match(input,STRING,FOLLOW_STRING_in_functionCallRule290); 
							}
							break;
						case 2 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:32: INTEGER
							{
							match(input,INTEGER,FOLLOW_INTEGER_in_functionCallRule294); 
							}
							break;
						case 3 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:42: FLOAT
							{
							match(input,FLOAT,FOLLOW_FLOAT_in_functionCallRule298); 
							}
							break;
						case 4 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:50: TRUE
							{
							match(input,TRUE,FOLLOW_TRUE_in_functionCallRule302); 
							}
							break;
						case 5 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:57: FALSE
							{
							match(input,FALSE,FOLLOW_FALSE_in_functionCallRule306); 
							}
							break;
						case 6 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:65: objectRule
							{
							pushFollow(FOLLOW_objectRule_in_functionCallRule310);
							objectRule();
							state._fsp--;

							}
							break;
						case 7 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:78: arrayRule
							{
							pushFollow(FOLLOW_arrayRule_in_functionCallRule314);
							arrayRule();
							state._fsp--;

							}
							break;
						case 8 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:90: NULL
							{
							match(input,NULL,FOLLOW_NULL_in_functionCallRule318); 
							}
							break;
						case 9 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:97: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_functionCallRule322);
							expressionRule();
							state._fsp--;

							}
							break;
						case 10 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:114: UNDEFINED
							{
							match(input,UNDEFINED,FOLLOW_UNDEFINED_in_functionCallRule326); 
							}
							break;
						case 11 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:126: idDotArrayRule
							{
							pushFollow(FOLLOW_idDotArrayRule_in_functionCallRule330);
							idDotArrayRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:142: ( ( CM ID | STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED | idDotArrayRule )* )
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:143: ( CM ID | STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED | idDotArrayRule )*
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:143: ( CM ID | STRING | INTEGER | FLOAT | TRUE | FALSE | objectRule | arrayRule | NULL | expressionRule | UNDEFINED | idDotArrayRule )*
					loop12:
					while (true) {
						int alt12=13;
						switch ( input.LA(1) ) {
						case CM:
							{
							alt12=1;
							}
							break;
						case STRING:
							{
							alt12=2;
							}
							break;
						case INTEGER:
							{
							alt12=3;
							}
							break;
						case FLOAT:
							{
							alt12=4;
							}
							break;
						case TRUE:
							{
							alt12=5;
							}
							break;
						case FALSE:
							{
							alt12=6;
							}
							break;
						case LBR:
							{
							alt12=7;
							}
							break;
						case LB:
							{
							alt12=8;
							}
							break;
						case NULL:
							{
							alt12=9;
							}
							break;
						case SUB:
							{
							alt12=10;
							}
							break;
						case UNDEFINED:
							{
							alt12=11;
							}
							break;
						case ID:
							{
							alt12=12;
							}
							break;
						}
						switch (alt12) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:144: CM ID
							{
							match(input,CM,FOLLOW_CM_in_functionCallRule335); 
							match(input,ID,FOLLOW_ID_in_functionCallRule337); 
							}
							break;
						case 2 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:152: STRING
							{
							match(input,STRING,FOLLOW_STRING_in_functionCallRule341); 
							}
							break;
						case 3 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:161: INTEGER
							{
							match(input,INTEGER,FOLLOW_INTEGER_in_functionCallRule345); 
							}
							break;
						case 4 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:171: FLOAT
							{
							match(input,FLOAT,FOLLOW_FLOAT_in_functionCallRule349); 
							}
							break;
						case 5 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:179: TRUE
							{
							match(input,TRUE,FOLLOW_TRUE_in_functionCallRule353); 
							}
							break;
						case 6 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:186: FALSE
							{
							match(input,FALSE,FOLLOW_FALSE_in_functionCallRule357); 
							}
							break;
						case 7 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:194: objectRule
							{
							pushFollow(FOLLOW_objectRule_in_functionCallRule361);
							objectRule();
							state._fsp--;

							}
							break;
						case 8 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:207: arrayRule
							{
							pushFollow(FOLLOW_arrayRule_in_functionCallRule365);
							arrayRule();
							state._fsp--;

							}
							break;
						case 9 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:219: NULL
							{
							match(input,NULL,FOLLOW_NULL_in_functionCallRule369); 
							}
							break;
						case 10 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:226: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_functionCallRule373);
							expressionRule();
							state._fsp--;

							}
							break;
						case 11 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:243: UNDEFINED
							{
							match(input,UNDEFINED,FOLLOW_UNDEFINED_in_functionCallRule377); 
							}
							break;
						case 12 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:255: idDotArrayRule
							{
							pushFollow(FOLLOW_idDotArrayRule_in_functionCallRule381);
							idDotArrayRule();
							state._fsp--;

							}
							break;

						default :
							break loop12;
						}
					}

					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionCallRule388); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:278: ( SC )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==SC) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:278: SC
					{
					match(input,SC,FOLLOW_SC_in_functionCallRule390); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:98:1: arrayRule : LB ( assignTypologyRule ( CM assignTypologyRule )* )? RB ;
	public final void arrayRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:99:2: ( LB ( assignTypologyRule ( CM assignTypologyRule )* )? RB )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:3: LB ( assignTypologyRule ( CM assignTypologyRule )* )? RB
			{
			match(input,LB,FOLLOW_LB_in_arrayRule410); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:101:4: ( assignTypologyRule ( CM assignTypologyRule )* )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==FALSE||LA16_0==FLOAT||LA16_0==FUNCTION||LA16_0==ID||LA16_0==INTEGER||(LA16_0 >= LB && LA16_0 <= LBR)||LA16_0==NULL||(LA16_0 >= STRING && LA16_0 <= SUB)||LA16_0==TRUE||LA16_0==UNDEFINED) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:102:4: assignTypologyRule ( CM assignTypologyRule )*
					{
					pushFollow(FOLLOW_assignTypologyRule_in_arrayRule420);
					assignTypologyRule();
					state._fsp--;

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:103:4: ( CM assignTypologyRule )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==CM) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:103:5: CM assignTypologyRule
							{
							match(input,CM,FOLLOW_CM_in_arrayRule426); 
							pushFollow(FOLLOW_assignTypologyRule_in_arrayRule428);
							assignTypologyRule();
							state._fsp--;

							}
							break;

						default :
							break loop15;
						}
					}

					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_arrayRule440); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:108:1: objectRule : LBR ( ( ID | STRING ) CL assignTypologyRule ( CM ( ID | STRING ) CL assignTypologyRule )* )? RBR ;
	public final void objectRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:109:2: ( LBR ( ( ID | STRING ) CL assignTypologyRule ( CM ( ID | STRING ) CL assignTypologyRule )* )? RBR )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:3: LBR ( ( ID | STRING ) CL assignTypologyRule ( CM ( ID | STRING ) CL assignTypologyRule )* )? RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectRule455); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:111:4: ( ( ID | STRING ) CL assignTypologyRule ( CM ( ID | STRING ) CL assignTypologyRule )* )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==ID||LA18_0==STRING) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:112:4: ( ID | STRING ) CL assignTypologyRule ( CM ( ID | STRING ) CL assignTypologyRule )*
					{
					if ( input.LA(1)==ID||input.LA(1)==STRING ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,CL,FOLLOW_CL_in_objectRule477); 
					pushFollow(FOLLOW_assignTypologyRule_in_objectRule483);
					assignTypologyRule();
					state._fsp--;

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:115:4: ( CM ( ID | STRING ) CL assignTypologyRule )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==CM) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:4: CM ( ID | STRING ) CL assignTypologyRule
							{
							match(input,CM,FOLLOW_CM_in_objectRule493); 
							if ( input.LA(1)==ID||input.LA(1)==STRING ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,CL,FOLLOW_CL_in_objectRule510); 
							pushFollow(FOLLOW_assignTypologyRule_in_objectRule516);
							assignTypologyRule();
							state._fsp--;

							}
							break;

						default :
							break loop17;
						}
					}

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_objectRule532); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:126:1: varDeclarationRule : ( VAR | LET | CONST ) ID ( CM ID )* ( SC )? ;
	public final void varDeclarationRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:127:2: ( ( VAR | LET | CONST ) ID ( CM ID )* ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:3: ( VAR | LET | CONST ) ID ( CM ID )* ( SC )?
			{
			if ( input.LA(1)==CONST||input.LA(1)==LET||input.LA(1)==VAR ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,ID,FOLLOW_ID_in_varDeclarationRule563); 
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:26: ( CM ID )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==CM) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:27: CM ID
					{
					match(input,CM,FOLLOW_CM_in_varDeclarationRule566); 
					match(input,ID,FOLLOW_ID_in_varDeclarationRule568); 
					}
					break;

				default :
					break loop19;
				}
			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:35: ( SC )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==SC) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:35: SC
					{
					match(input,SC,FOLLOW_SC_in_varDeclarationRule572); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:131:1: varAssignmentRule : ( VAR | LET | CONST )? idDotArrayRule ASSIGN assignTypologyRule ( SC )? ;
	public final void varAssignmentRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:132:2: ( ( VAR | LET | CONST )? idDotArrayRule ASSIGN assignTypologyRule ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:133:3: ( VAR | LET | CONST )? idDotArrayRule ASSIGN assignTypologyRule ( SC )?
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:133:3: ( VAR | LET | CONST )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==CONST||LA21_0==LET||LA21_0==VAR) ) {
				alt21=1;
			}
			switch (alt21) {
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

			pushFollow(FOLLOW_idDotArrayRule_in_varAssignmentRule602);
			idDotArrayRule();
			state._fsp--;

			match(input,ASSIGN,FOLLOW_ASSIGN_in_varAssignmentRule604); 
			pushFollow(FOLLOW_assignTypologyRule_in_varAssignmentRule606);
			assignTypologyRule();
			state._fsp--;

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:133:65: ( SC )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==SC) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:133:65: SC
					{
					match(input,SC,FOLLOW_SC_in_varAssignmentRule608); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:136:1: variableDefinitionRule : ( VAR | LET | CONST )? idDotArrayRule ( ASSIGN assignTypologyRule )? ( SC )? ;
	public final JavaScriptToJQueryConverterParser.variableDefinitionRule_return variableDefinitionRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.variableDefinitionRule_return retval = new JavaScriptToJQueryConverterParser.variableDefinitionRule_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:137:2: ( ( VAR | LET | CONST )? idDotArrayRule ( ASSIGN assignTypologyRule )? ( SC )? )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:3: ( VAR | LET | CONST )? idDotArrayRule ( ASSIGN assignTypologyRule )? ( SC )?
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:3: ( VAR | LET | CONST )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==CONST||LA23_0==LET||LA23_0==VAR) ) {
				alt23=1;
			}
			switch (alt23) {
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

			pushFollow(FOLLOW_idDotArrayRule_in_variableDefinitionRule639);
			idDotArrayRule();
			state._fsp--;

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:3: ( ASSIGN assignTypologyRule )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==ASSIGN) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:4: ASSIGN assignTypologyRule
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDefinitionRule644); 
					pushFollow(FOLLOW_assignTypologyRule_in_variableDefinitionRule646);
					assignTypologyRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:141:3: ( SC )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==SC) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:141:3: SC
					{
					match(input,SC,FOLLOW_SC_in_variableDefinitionRule652); 
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
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:145:1: assignTypologyRule : ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED | functionDefinitionRule | expressionRule | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) ) ;
	public final void assignTypologyRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:146:2: ( ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED | functionDefinitionRule | expressionRule | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) ) )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:3: ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED | functionDefinitionRule | expressionRule | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) )
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:3: ( STRING | INTEGER | FLOAT | objectRule | arrayRule | TRUE | FALSE | NULL | UNDEFINED | functionDefinitionRule | expressionRule | ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? ) )
			int alt28=12;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt28=1;
				}
				break;
			case INTEGER:
				{
				alt28=2;
				}
				break;
			case FLOAT:
				{
				alt28=3;
				}
				break;
			case LBR:
				{
				alt28=4;
				}
				break;
			case LB:
				{
				alt28=5;
				}
				break;
			case TRUE:
				{
				alt28=6;
				}
				break;
			case FALSE:
				{
				alt28=7;
				}
				break;
			case NULL:
				{
				alt28=8;
				}
				break;
			case UNDEFINED:
				{
				alt28=9;
				}
				break;
			case FUNCTION:
				{
				alt28=10;
				}
				break;
			case SUB:
				{
				alt28=11;
				}
				break;
			case ID:
				{
				alt28=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:4: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_assignTypologyRule671); 
					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:13: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_assignTypologyRule675); 
					}
					break;
				case 3 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:23: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_assignTypologyRule679); 
					}
					break;
				case 4 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:31: objectRule
					{
					pushFollow(FOLLOW_objectRule_in_assignTypologyRule683);
					objectRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:44: arrayRule
					{
					pushFollow(FOLLOW_arrayRule_in_assignTypologyRule687);
					arrayRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:56: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_assignTypologyRule691); 
					}
					break;
				case 7 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:63: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_assignTypologyRule695); 
					}
					break;
				case 8 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:71: NULL
					{
					match(input,NULL,FOLLOW_NULL_in_assignTypologyRule699); 
					}
					break;
				case 9 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:78: UNDEFINED
					{
					match(input,UNDEFINED,FOLLOW_UNDEFINED_in_assignTypologyRule703); 
					}
					break;
				case 10 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:90: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_assignTypologyRule707);
					functionDefinitionRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:115: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_assignTypologyRule711);
					expressionRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:132: ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? )
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:132: ( idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )? )
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:133: idDotArrayRule ( LP assignTypologyRule ( CM assignTypologyRule )* RP )?
					{
					pushFollow(FOLLOW_idDotArrayRule_in_assignTypologyRule716);
					idDotArrayRule();
					state._fsp--;

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:148: ( LP assignTypologyRule ( CM assignTypologyRule )* RP )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==LP) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:149: LP assignTypologyRule ( CM assignTypologyRule )* RP
							{
							match(input,LP,FOLLOW_LP_in_assignTypologyRule719); 
							pushFollow(FOLLOW_assignTypologyRule_in_assignTypologyRule721);
							assignTypologyRule();
							state._fsp--;

							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:171: ( CM assignTypologyRule )*
							loop26:
							while (true) {
								int alt26=2;
								int LA26_0 = input.LA(1);
								if ( (LA26_0==CM) ) {
									alt26=1;
								}

								switch (alt26) {
								case 1 :
									// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:172: CM assignTypologyRule
									{
									match(input,CM,FOLLOW_CM_in_assignTypologyRule724); 
									pushFollow(FOLLOW_assignTypologyRule_in_assignTypologyRule726);
									assignTypologyRule();
									state._fsp--;

									}
									break;

								default :
									break loop26;
								}
							}

							match(input,RP,FOLLOW_RP_in_assignTypologyRule730); 
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



	// $ANTLR start "arithmeticOperatorsRule"
	// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:150:1: arithmeticOperatorsRule : ( ADD | SUB | STAR | DIV | MOD | INC | DEC | EXP ) ;
	public final void arithmeticOperatorsRule() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:151:2: ( ( ADD | SUB | STAR | DIV | MOD | INC | DEC | EXP ) )
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

	// Delegated rules



	public static final BitSet FOLLOW_getRule_in_parseJava63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDefinitionRule_in_parseJava69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectRule_in_parseJava74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOCUMENT_in_getRule89 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_DOT_in_getRule93 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_getRule97 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_getRule101 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_STRING_in_getRule105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_getRule107 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_getRule109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule126 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotIdRule129 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule131 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_idDotIdRule_in_idDotArrayRule148 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_LB_in_idDotArrayRule152 = new BitSet(new long[]{0x0040800000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_set_in_idDotArrayRule154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_idDotArrayRule166 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRule171 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idDotArrayRule173 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_SUB_in_expressionRule192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SC_in_istructionRule206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_functionDeclarationRule221 = new BitSet(new long[]{0x2000800000000000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule223 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_functionDeclarationRule226 = new BitSet(new long[]{0x0000800000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule229 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_functionDeclarationRule233 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule235 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_functionDeclarationRule242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationRule_in_functionDefinitionRule256 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_functionDefinitionRule260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000440000L});
	public static final BitSet FOLLOW_istructionRule_in_functionDefinitionRule265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000440000L});
	public static final BitSet FOLLOW_RBR_in_functionDefinitionRule270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_functionCallRule284 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_functionCallRule286 = new BitSet(new long[]{0x0340828000000000L,0x000000120C100080L});
	public static final BitSet FOLLOW_STRING_in_functionCallRule290 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_INTEGER_in_functionCallRule294 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_FLOAT_in_functionCallRule298 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_TRUE_in_functionCallRule302 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_FALSE_in_functionCallRule306 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_objectRule_in_functionCallRule310 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_arrayRule_in_functionCallRule314 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_NULL_in_functionCallRule318 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_expressionRule_in_functionCallRule322 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_UNDEFINED_in_functionCallRule326 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_idDotArrayRule_in_functionCallRule330 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_CM_in_functionCallRule335 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_functionCallRule337 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_STRING_in_functionCallRule341 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_INTEGER_in_functionCallRule345 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_FLOAT_in_functionCallRule349 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_TRUE_in_functionCallRule353 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_FALSE_in_functionCallRule357 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_objectRule_in_functionCallRule361 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_arrayRule_in_functionCallRule365 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_NULL_in_functionCallRule369 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_expressionRule_in_functionCallRule373 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_UNDEFINED_in_functionCallRule377 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_idDotArrayRule_in_functionCallRule381 = new BitSet(new long[]{0x0340828000008000L,0x000000120C100080L});
	public static final BitSet FOLLOW_RP_in_functionCallRule388 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_functionCallRule390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_arrayRule410 = new BitSet(new long[]{0x03408A8000000000L,0x000000120C020080L});
	public static final BitSet FOLLOW_assignTypologyRule_in_arrayRule420 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_CM_in_arrayRule426 = new BitSet(new long[]{0x03408A8000000000L,0x000000120C000080L});
	public static final BitSet FOLLOW_assignTypologyRule_in_arrayRule428 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_arrayRule440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectRule455 = new BitSet(new long[]{0x0000800000000000L,0x0000000004040000L});
	public static final BitSet FOLLOW_set_in_objectRule465 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule477 = new BitSet(new long[]{0x03408A8000000000L,0x000000120C000080L});
	public static final BitSet FOLLOW_assignTypologyRule_in_objectRule483 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_CM_in_objectRule493 = new BitSet(new long[]{0x0000800000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_set_in_objectRule498 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule510 = new BitSet(new long[]{0x03408A8000000000L,0x000000120C000080L});
	public static final BitSet FOLLOW_assignTypologyRule_in_objectRule516 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_objectRule532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_varDeclarationRule551 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_varDeclarationRule563 = new BitSet(new long[]{0x0000000000008002L,0x0000000000400000L});
	public static final BitSet FOLLOW_CM_in_varDeclarationRule566 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_varDeclarationRule568 = new BitSet(new long[]{0x0000000000008002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_varDeclarationRule572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_varAssignmentRule602 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_varAssignmentRule604 = new BitSet(new long[]{0x03408A8000000000L,0x000000120C000080L});
	public static final BitSet FOLLOW_assignTypologyRule_in_varAssignmentRule606 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_varAssignmentRule608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_variableDefinitionRule639 = new BitSet(new long[]{0x0000000000000082L,0x0000000000400000L});
	public static final BitSet FOLLOW_ASSIGN_in_variableDefinitionRule644 = new BitSet(new long[]{0x03408A8000000000L,0x000000120C000080L});
	public static final BitSet FOLLOW_assignTypologyRule_in_variableDefinitionRule646 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_variableDefinitionRule652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_assignTypologyRule671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_assignTypologyRule675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_assignTypologyRule679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectRule_in_assignTypologyRule683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRule_in_assignTypologyRule687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_assignTypologyRule691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_assignTypologyRule695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_assignTypologyRule699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNDEFINED_in_assignTypologyRule703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_assignTypologyRule707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionRule_in_assignTypologyRule711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_assignTypologyRule716 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_LP_in_assignTypologyRule719 = new BitSet(new long[]{0x03408A8000000000L,0x000000120C000080L});
	public static final BitSet FOLLOW_assignTypologyRule_in_assignTypologyRule721 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_assignTypologyRule724 = new BitSet(new long[]{0x03408A8000000000L,0x000000120C000080L});
	public static final BitSet FOLLOW_assignTypologyRule_in_assignTypologyRule726 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_assignTypologyRule730 = new BitSet(new long[]{0x0000000000000002L});
}
