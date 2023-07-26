// $ANTLR 3.5.1 C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g 2023-07-26 16:43:58

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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:46:1: parseJava : ( instructionRule | blockRule | classRule )* ;
	public final void parseJava() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:48:2: ( ( instructionRule | blockRule | classRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:49:3: ( instructionRule | blockRule | classRule )*
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:49:3: ( instructionRule | blockRule | classRule )*
			loop1:
			while (true) {
				int alt1=4;
				switch ( input.LA(1) ) {
				case BREAK:
				case CONST:
				case CONTINUE:
				case DO:
				case DOCUMENT:
				case FOR:
				case FUNCTION:
				case ID:
				case IF:
				case LET:
				case SWITCH:
				case THIS:
				case THROW:
				case TRY:
				case TYPEOF:
				case VAR:
				case WHILE:
					{
					alt1=1;
					}
					break;
				case LBR:
					{
					alt1=2;
					}
					break;
				case CLASS:
					{
					alt1=3;
					}
					break;
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:50:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_parseJava70);
					blockRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:51:5: classRule
					{
					pushFollow(FOLLOW_classRule_in_parseJava76);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:53:1: getRule : DOCUMENT DOT get= ID LP ( ( idDotArrayRule | STRING ) ( ADD ( idDotArrayRule | STRING ) )* ) end= RP ( DOT idDotArrayRule )? ;
	public final JavaScriptToJQueryConverterParser.getRule_return getRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.getRule_return retval = new JavaScriptToJQueryConverterParser.getRule_return();
		retval.start = input.LT(1);

		Token get=null;
		Token end=null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:54:2: ( DOCUMENT DOT get= ID LP ( ( idDotArrayRule | STRING ) ( ADD ( idDotArrayRule | STRING ) )* ) end= RP ( DOT idDotArrayRule )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:3: DOCUMENT DOT get= ID LP ( ( idDotArrayRule | STRING ) ( ADD ( idDotArrayRule | STRING ) )* ) end= RP ( DOT idDotArrayRule )?
			{
			match(input,DOCUMENT,FOLLOW_DOCUMENT_in_getRule90); 
			match(input,DOT,FOLLOW_DOT_in_getRule92); 
			get=(Token)match(input,ID,FOLLOW_ID_in_getRule96); 
			match(input,LP,FOLLOW_LP_in_getRule98); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:26: ( ( idDotArrayRule | STRING ) ( ADD ( idDotArrayRule | STRING ) )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:27: ( idDotArrayRule | STRING ) ( ADD ( idDotArrayRule | STRING ) )*
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:27: ( idDotArrayRule | STRING )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ID||LA2_0==THIS) ) {
				alt2=1;
			}
			else if ( (LA2_0==STRING) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:28: idDotArrayRule
					{
					pushFollow(FOLLOW_idDotArrayRule_in_getRule102);
					idDotArrayRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:43: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_getRule104); 
					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:51: ( ADD ( idDotArrayRule | STRING ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ADD) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:52: ADD ( idDotArrayRule | STRING )
					{
					match(input,ADD,FOLLOW_ADD_in_getRule108); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:56: ( idDotArrayRule | STRING )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==ID||LA3_0==THIS) ) {
						alt3=1;
					}
					else if ( (LA3_0==STRING) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:57: idDotArrayRule
							{
							pushFollow(FOLLOW_idDotArrayRule_in_getRule111);
							idDotArrayRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:74: STRING
							{
							match(input,STRING,FOLLOW_STRING_in_getRule115); 
							}
							break;

					}

					}
					break;

				default :
					break loop4;
				}
			}

			}

			end=(Token)match(input,RP,FOLLOW_RP_in_getRule123); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:92: ( DOT idDotArrayRule )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==DOT) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:93: DOT idDotArrayRule
					{
					match(input,DOT,FOLLOW_DOT_in_getRule126); 
					pushFollow(FOLLOW_idDotArrayRule_in_getRule128);
					idDotArrayRule();
					state._fsp--;

					}
					break;

			}

			h.translateGet(get, (retval.start), end);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:58:1: idDotIdRule : ID ( DOT ID )* ;
	public final void idDotIdRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:59:2: ( ID ( DOT ID )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:60:3: ID ( DOT ID )*
			{
			match(input,ID,FOLLOW_ID_in_idDotIdRule146); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:60:6: ( DOT ID )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==DOT) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:60:7: DOT ID
					{
					match(input,DOT,FOLLOW_DOT_in_idDotIdRule149); 
					match(input,ID,FOLLOW_ID_in_idDotIdRule151); 
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
	// $ANTLR end "idDotIdRule"



	// $ANTLR start "factorTypologyRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:63:1: factorTypologyRule : ( STRING | INTEGER | FLOAT | TRUE | FALSE | idDotArrayRule | getRule ) ;
	public final void factorTypologyRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:2: ( ( STRING | INTEGER | FLOAT | TRUE | FALSE | idDotArrayRule | getRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:3: ( STRING | INTEGER | FLOAT | TRUE | FALSE | idDotArrayRule | getRule )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:3: ( STRING | INTEGER | FLOAT | TRUE | FALSE | idDotArrayRule | getRule )
			int alt7=7;
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
			case ID:
			case THIS:
				{
				alt7=6;
				}
				break;
			case DOCUMENT:
				{
				alt7=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:4: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_factorTypologyRule168); 
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:13: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_factorTypologyRule172); 
					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:23: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_factorTypologyRule176); 
					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:31: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factorTypologyRule180); 
					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:38: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factorTypologyRule184); 
					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:46: idDotArrayRule
					{
					pushFollow(FOLLOW_idDotArrayRule_in_factorTypologyRule188);
					idDotArrayRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:63: getRule
					{
					pushFollow(FOLLOW_getRule_in_factorTypologyRule192);
					getRule();
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:68:1: assignTypologyRule : ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule ) ;
	public final void assignTypologyRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:2: ( ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:3: ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:3: ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule )
			int alt8=6;
			switch ( input.LA(1) ) {
			case LBR:
				{
				alt8=1;
				}
				break;
			case LB:
				{
				alt8=2;
				}
				break;
			case NULL:
				{
				alt8=3;
				}
				break;
			case UNDEFINED:
				{
				alt8=4;
				}
				break;
			case FUNCTION:
				{
				alt8=5;
				}
				break;
			case NEW:
				{
				alt8=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:4: objectRule
					{
					pushFollow(FOLLOW_objectRule_in_assignTypologyRule208);
					objectRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:17: arrayRule
					{
					pushFollow(FOLLOW_arrayRule_in_assignTypologyRule212);
					arrayRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:29: NULL
					{
					match(input,NULL,FOLLOW_NULL_in_assignTypologyRule216); 
					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:36: UNDEFINED
					{
					match(input,UNDEFINED,FOLLOW_UNDEFINED_in_assignTypologyRule220); 
					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:48: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_assignTypologyRule224);
					functionDefinitionRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:73: newRule
					{
					pushFollow(FOLLOW_newRule_in_assignTypologyRule228);
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



	// $ANTLR start "idDotArrayRuleOld"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:73:1: idDotArrayRuleOld : ( idDotIdRule | ( THIS ( DOT ID )* ) ) ( ( LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB )+ ( DOT ID )* )* ;
	public final void idDotArrayRuleOld() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:74:2: ( ( idDotIdRule | ( THIS ( DOT ID )* ) ) ( ( LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB )+ ( DOT ID )* )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:75:3: ( idDotIdRule | ( THIS ( DOT ID )* ) ) ( ( LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB )+ ( DOT ID )* )*
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:75:3: ( idDotIdRule | ( THIS ( DOT ID )* ) )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				alt10=1;
			}
			else if ( (LA10_0==THIS) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:75:4: idDotIdRule
					{
					pushFollow(FOLLOW_idDotIdRule_in_idDotArrayRuleOld243);
					idDotIdRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:75:18: ( THIS ( DOT ID )* )
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:75:18: ( THIS ( DOT ID )* )
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:75:19: THIS ( DOT ID )*
					{
					match(input,THIS,FOLLOW_THIS_in_idDotArrayRuleOld248); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:75:24: ( DOT ID )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==DOT) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:75:25: DOT ID
							{
							match(input,DOT,FOLLOW_DOT_in_idDotArrayRuleOld251); 
							match(input,ID,FOLLOW_ID_in_idDotArrayRuleOld253); 
							}
							break;

						default :
							break loop9;
						}
					}

					}

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:3: ( ( LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB )+ ( DOT ID )* )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==LB) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:4: ( LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB )+ ( DOT ID )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:4: ( LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==LB) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:5: LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB
							{
							match(input,LB,FOLLOW_LB_in_idDotArrayRuleOld263); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:8: ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING )
							int alt15=3;
							switch ( input.LA(1) ) {
							case INTEGER:
								{
								alt15=1;
								}
								break;
							case ID:
							case THIS:
								{
								alt15=2;
								}
								break;
							case STRING:
								{
								alt15=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 15, 0, input);
								throw nvae;
							}
							switch (alt15) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:9: INTEGER
									{
									match(input,INTEGER,FOLLOW_INTEGER_in_idDotArrayRuleOld266); 
									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:19: ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? )
									{
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:19: ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? )
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:20: idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )?
									{
									pushFollow(FOLLOW_idDotArrayRule_in_idDotArrayRuleOld271);
									idDotArrayRule();
									state._fsp--;

									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:35: ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )?
									int alt14=2;
									int LA14_0 = input.LA(1);
									if ( (LA14_0==LP) ) {
										alt14=1;
									}
									switch (alt14) {
										case 1 :
											// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:36: LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP
											{
											match(input,LP,FOLLOW_LP_in_idDotArrayRuleOld274); 
											// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:39: ( assignTypologyRule | expressionRule )
											int alt11=2;
											int LA11_0 = input.LA(1);
											if ( (LA11_0==FUNCTION||(LA11_0 >= LB && LA11_0 <= LBR)||LA11_0==NEW||LA11_0==NULL||LA11_0==UNDEFINED) ) {
												alt11=1;
											}
											else if ( (LA11_0==DEC||LA11_0==DOCUMENT||LA11_0==FALSE||LA11_0==FLOAT||LA11_0==ID||LA11_0==INC||LA11_0==INTEGER||LA11_0==LP||LA11_0==STRING||LA11_0==THIS||LA11_0==TRUE) ) {
												alt11=2;
											}

											else {
												NoViableAltException nvae =
													new NoViableAltException("", 11, 0, input);
												throw nvae;
											}

											switch (alt11) {
												case 1 :
													// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:40: assignTypologyRule
													{
													pushFollow(FOLLOW_assignTypologyRule_in_idDotArrayRuleOld277);
													assignTypologyRule();
													state._fsp--;

													}
													break;
												case 2 :
													// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:59: expressionRule
													{
													pushFollow(FOLLOW_expressionRule_in_idDotArrayRuleOld279);
													expressionRule();
													state._fsp--;

													}
													break;

											}

											// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:75: ( CM ( assignTypologyRule | expressionRule ) )*
											loop13:
											while (true) {
												int alt13=2;
												int LA13_0 = input.LA(1);
												if ( (LA13_0==CM) ) {
													alt13=1;
												}

												switch (alt13) {
												case 1 :
													// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:76: CM ( assignTypologyRule | expressionRule )
													{
													match(input,CM,FOLLOW_CM_in_idDotArrayRuleOld283); 
													// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:79: ( assignTypologyRule | expressionRule )
													int alt12=2;
													int LA12_0 = input.LA(1);
													if ( (LA12_0==FUNCTION||(LA12_0 >= LB && LA12_0 <= LBR)||LA12_0==NEW||LA12_0==NULL||LA12_0==UNDEFINED) ) {
														alt12=1;
													}
													else if ( (LA12_0==DEC||LA12_0==DOCUMENT||LA12_0==FALSE||LA12_0==FLOAT||LA12_0==ID||LA12_0==INC||LA12_0==INTEGER||LA12_0==LP||LA12_0==STRING||LA12_0==THIS||LA12_0==TRUE) ) {
														alt12=2;
													}

													else {
														NoViableAltException nvae =
															new NoViableAltException("", 12, 0, input);
														throw nvae;
													}

													switch (alt12) {
														case 1 :
															// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:80: assignTypologyRule
															{
															pushFollow(FOLLOW_assignTypologyRule_in_idDotArrayRuleOld286);
															assignTypologyRule();
															state._fsp--;

															}
															break;
														case 2 :
															// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:99: expressionRule
															{
															pushFollow(FOLLOW_expressionRule_in_idDotArrayRuleOld288);
															expressionRule();
															state._fsp--;

															}
															break;

													}

													}
													break;

												default :
													break loop13;
												}
											}

											match(input,RP,FOLLOW_RP_in_idDotArrayRuleOld293); 
											}
											break;

									}

									}

									}
									break;
								case 3 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:125: STRING
									{
									match(input,STRING,FOLLOW_STRING_in_idDotArrayRuleOld300); 
									}
									break;

							}

							match(input,RB,FOLLOW_RB_in_idDotArrayRuleOld303); 
							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:138: ( DOT ID )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==DOT) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:139: DOT ID
							{
							match(input,DOT,FOLLOW_DOT_in_idDotArrayRuleOld308); 
							match(input,ID,FOLLOW_ID_in_idDotArrayRuleOld310); 
							}
							break;

						default :
							break loop17;
						}
					}

					}
					break;

				default :
					break loop18;
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
	// $ANTLR end "idDotArrayRuleOld"


	public static class idDotArrayRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "idDotArrayRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:79:1: idDotArrayRule : ( THIS DOT )? ( idDotIdRule ( LB expressionRule RB )* ( DOT )? ( LP ( parametersRule )? RP ( DOT )? )? )+ ;
	public final JavaScriptToJQueryConverterParser.idDotArrayRule_return idDotArrayRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.idDotArrayRule_return retval = new JavaScriptToJQueryConverterParser.idDotArrayRule_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:81:2: ( ( THIS DOT )? ( idDotIdRule ( LB expressionRule RB )* ( DOT )? ( LP ( parametersRule )? RP ( DOT )? )? )+ )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:82:3: ( THIS DOT )? ( idDotIdRule ( LB expressionRule RB )* ( DOT )? ( LP ( parametersRule )? RP ( DOT )? )? )+
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:82:3: ( THIS DOT )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==THIS) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:82:4: THIS DOT
					{
					match(input,THIS,FOLLOW_THIS_in_idDotArrayRule333); 
					match(input,DOT,FOLLOW_DOT_in_idDotArrayRule335); 
					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:83:3: ( idDotIdRule ( LB expressionRule RB )* ( DOT )? ( LP ( parametersRule )? RP ( DOT )? )? )+
			int cnt25=0;
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==ID) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:83:4: idDotIdRule ( LB expressionRule RB )* ( DOT )? ( LP ( parametersRule )? RP ( DOT )? )?
					{
					pushFollow(FOLLOW_idDotIdRule_in_idDotArrayRule343);
					idDotIdRule();
					state._fsp--;

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:4: ( LB expressionRule RB )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==LB) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:5: LB expressionRule RB
							{
							match(input,LB,FOLLOW_LB_in_idDotArrayRule349); 
							pushFollow(FOLLOW_expressionRule_in_idDotArrayRule351);
							expressionRule();
							state._fsp--;

							match(input,RB,FOLLOW_RB_in_idDotArrayRule353); 
							}
							break;

						default :
							break loop20;
						}
					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:28: ( DOT )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==DOT) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:28: DOT
							{
							match(input,DOT,FOLLOW_DOT_in_idDotArrayRule357); 
							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:4: ( LP ( parametersRule )? RP ( DOT )? )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==LP) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:5: LP ( parametersRule )? RP ( DOT )?
							{
							match(input,LP,FOLLOW_LP_in_idDotArrayRule364); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:8: ( parametersRule )?
							int alt22=2;
							int LA22_0 = input.LA(1);
							if ( (LA22_0==DEC||LA22_0==DOCUMENT||LA22_0==FALSE||LA22_0==FLOAT||LA22_0==FUNCTION||LA22_0==ID||LA22_0==INC||LA22_0==INTEGER||(LA22_0 >= LB && LA22_0 <= LBR)||LA22_0==LP||LA22_0==NEW||LA22_0==NULL||LA22_0==STRING||LA22_0==THIS||LA22_0==TRUE||LA22_0==UNDEFINED) ) {
								alt22=1;
							}
							switch (alt22) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:8: parametersRule
									{
									pushFollow(FOLLOW_parametersRule_in_idDotArrayRule366);
									parametersRule();
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_idDotArrayRule369); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:27: ( DOT )?
							int alt23=2;
							int LA23_0 = input.LA(1);
							if ( (LA23_0==DOT) ) {
								alt23=1;
							}
							switch (alt23) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:27: DOT
									{
									match(input,DOT,FOLLOW_DOT_in_idDotArrayRule371); 
									}
									break;

							}

							}
							break;

					}

					}
					break;

				default :
					if ( cnt25 >= 1 ) break loop25;
					EarlyExitException eee = new EarlyExitException(25, input);
					throw eee;
				}
				cnt25++;
			}

			}

			retval.stop = input.LT(-1);

			h.checkLastDot((retval.stop));
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
	// $ANTLR end "idDotArrayRule"



	// $ANTLR start "parametersRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:89:1: parametersRule : ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* ;
	public final void parametersRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:90:2: ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:3: ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )*
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:3: ( assignTypologyRule | expressionRule )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==FUNCTION||(LA26_0 >= LB && LA26_0 <= LBR)||LA26_0==NEW||LA26_0==NULL||LA26_0==UNDEFINED) ) {
				alt26=1;
			}
			else if ( (LA26_0==DEC||LA26_0==DOCUMENT||LA26_0==FALSE||LA26_0==FLOAT||LA26_0==ID||LA26_0==INC||LA26_0==INTEGER||LA26_0==LP||LA26_0==STRING||LA26_0==THIS||LA26_0==TRUE) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:4: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_parametersRule395);
					assignTypologyRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:25: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_parametersRule399);
					expressionRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:40: ( CM ( assignTypologyRule | expressionRule ) )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==CM) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:41: CM ( assignTypologyRule | expressionRule )
					{
					match(input,CM,FOLLOW_CM_in_parametersRule402); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:44: ( assignTypologyRule | expressionRule )
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==FUNCTION||(LA27_0 >= LB && LA27_0 <= LBR)||LA27_0==NEW||LA27_0==NULL||LA27_0==UNDEFINED) ) {
						alt27=1;
					}
					else if ( (LA27_0==DEC||LA27_0==DOCUMENT||LA27_0==FALSE||LA27_0==FLOAT||LA27_0==ID||LA27_0==INC||LA27_0==INTEGER||LA27_0==LP||LA27_0==STRING||LA27_0==THIS||LA27_0==TRUE) ) {
						alt27=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}

					switch (alt27) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:45: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_parametersRule405);
							assignTypologyRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:66: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_parametersRule409);
							expressionRule();
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop28;
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
	// $ANTLR end "parametersRule"



	// $ANTLR start "expressionRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:1: expressionRule : termRule ( ( ADD | SUB | MOD ) termRule )* ;
	public final void expressionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:95:2: ( termRule ( ( ADD | SUB | MOD ) termRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:96:3: termRule ( ( ADD | SUB | MOD ) termRule )*
			{
			pushFollow(FOLLOW_termRule_in_expressionRule425);
			termRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:96:12: ( ( ADD | SUB | MOD ) termRule )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==ADD||LA29_0==MOD||LA29_0==SUB) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:96:13: ( ADD | SUB | MOD ) termRule
					{
					if ( input.LA(1)==ADD||input.LA(1)==MOD||input.LA(1)==SUB ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_termRule_in_expressionRule440);
					termRule();
					state._fsp--;

					}
					break;

				default :
					break loop29;
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
	// $ANTLR end "expressionRule"



	// $ANTLR start "termRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:98:1: termRule : factorRule ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )* ;
	public final void termRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:99:2: ( factorRule ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:3: factorRule ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )*
			{
			pushFollow(FOLLOW_factorRule_in_termRule455);
			factorRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:14: ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==AND_BIT||LA30_0==DIV||LA30_0==EXP||LA30_0==LSHIFT||LA30_0==OR_BIT||LA30_0==RSHIFT||LA30_0==STAR||LA30_0==URSHIFT||LA30_0==XOR) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:15: ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule
					{
					if ( input.LA(1)==AND_BIT||input.LA(1)==DIV||input.LA(1)==EXP||input.LA(1)==LSHIFT||input.LA(1)==OR_BIT||input.LA(1)==RSHIFT||input.LA(1)==STAR||input.LA(1)==URSHIFT||input.LA(1)==XOR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factorRule_in_termRule494);
					factorRule();
					state._fsp--;

					}
					break;

				default :
					break loop30;
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:103:1: factorRule : ( ( INC | DEC )? factorTypologyRule ( INC | DEC )? | LP expressionRule RP );
	public final void factorRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:104:2: ( ( INC | DEC )? factorTypologyRule ( INC | DEC )? | LP expressionRule RP )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==DEC||LA33_0==DOCUMENT||LA33_0==FALSE||LA33_0==FLOAT||LA33_0==ID||LA33_0==INC||LA33_0==INTEGER||LA33_0==STRING||LA33_0==THIS||LA33_0==TRUE) ) {
				alt33=1;
			}
			else if ( (LA33_0==LP) ) {
				alt33=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:105:3: ( INC | DEC )? factorTypologyRule ( INC | DEC )?
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:105:3: ( INC | DEC )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==DEC||LA31_0==INC) ) {
						alt31=1;
					}
					switch (alt31) {
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

					pushFollow(FOLLOW_factorTypologyRule_in_factorRule518);
					factorTypologyRule();
					state._fsp--;

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:105:33: ( INC | DEC )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==DEC||LA32_0==INC) ) {
						alt32=1;
					}
					switch (alt32) {
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:106:5: LP expressionRule RP
					{
					match(input,LP,FOLLOW_LP_in_factorRule531); 
					pushFollow(FOLLOW_expressionRule_in_factorRule533);
					expressionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_factorRule535); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:109:1: instructionRule : ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | documentRule | typeOfRule | idStartingRule ) ( SC )? ;
	public final void instructionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:2: ( ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | documentRule | typeOfRule | idStartingRule ) ( SC )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:111:3: ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | documentRule | typeOfRule | idStartingRule ) ( SC )?
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:111:3: ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | documentRule | typeOfRule | idStartingRule )
			int alt34=13;
			switch ( input.LA(1) ) {
			case BREAK:
				{
				alt34=1;
				}
				break;
			case CONTINUE:
				{
				alt34=2;
				}
				break;
			case TRY:
				{
				alt34=3;
				}
				break;
			case FUNCTION:
				{
				alt34=4;
				}
				break;
			case IF:
				{
				alt34=5;
				}
				break;
			case SWITCH:
				{
				alt34=6;
				}
				break;
			case FOR:
				{
				alt34=7;
				}
				break;
			case WHILE:
				{
				alt34=8;
				}
				break;
			case DO:
				{
				alt34=9;
				}
				break;
			case THROW:
				{
				alt34=10;
				}
				break;
			case DOCUMENT:
				{
				alt34=11;
				}
				break;
			case TYPEOF:
				{
				alt34=12;
				}
				break;
			case CONST:
			case ID:
			case LET:
			case THIS:
			case VAR:
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:111:4: BREAK
					{
					match(input,BREAK,FOLLOW_BREAK_in_instructionRule549); 
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:112:5: CONTINUE
					{
					match(input,CONTINUE,FOLLOW_CONTINUE_in_instructionRule556); 
					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:113:5: tryCatchRule
					{
					pushFollow(FOLLOW_tryCatchRule_in_instructionRule563);
					tryCatchRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:114:5: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_instructionRule570);
					functionDefinitionRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:115:5: ifStatementRule
					{
					pushFollow(FOLLOW_ifStatementRule_in_instructionRule578);
					ifStatementRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:5: switchCaseRule
					{
					pushFollow(FOLLOW_switchCaseRule_in_instructionRule585);
					switchCaseRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:117:5: forRule
					{
					pushFollow(FOLLOW_forRule_in_instructionRule592);
					forRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:118:5: whileRule
					{
					pushFollow(FOLLOW_whileRule_in_instructionRule599);
					whileRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:119:5: doWhileRule
					{
					pushFollow(FOLLOW_doWhileRule_in_instructionRule606);
					doWhileRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:120:5: throwRule
					{
					pushFollow(FOLLOW_throwRule_in_instructionRule613);
					throwRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:121:5: documentRule
					{
					pushFollow(FOLLOW_documentRule_in_instructionRule620);
					documentRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:122:5: typeOfRule
					{
					pushFollow(FOLLOW_typeOfRule_in_instructionRule626);
					typeOfRule();
					state._fsp--;

					}
					break;
				case 13 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:123:5: idStartingRule
					{
					pushFollow(FOLLOW_idStartingRule_in_instructionRule633);
					idStartingRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:123:20: ( SC )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==SC) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:123:20: SC
					{
					match(input,SC,FOLLOW_SC_in_instructionRule635); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:126:1: throwRule : THROW ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule ) ;
	public final void throwRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:127:2: ( THROW ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:3: THROW ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule )
			{
			match(input,THROW,FOLLOW_THROW_in_throwRule650); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:9: ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule )
			int alt36=6;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt36=1;
				}
				break;
			case TRUE:
				{
				alt36=2;
				}
				break;
			case FALSE:
				{
				alt36=3;
				}
				break;
			case INTEGER:
				{
				alt36=4;
				}
				break;
			case FLOAT:
				{
				alt36=5;
				}
				break;
			case ID:
			case THIS:
				{
				alt36=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:10: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_throwRule653); 
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:19: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_throwRule657); 
					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:26: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_throwRule661); 
					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:34: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_throwRule665); 
					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:44: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_throwRule669); 
					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:52: idDotArrayRule
					{
					pushFollow(FOLLOW_idDotArrayRule_in_throwRule673);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:131:1: typeOfRule : TYPEOF assignTypologyRule ;
	public final void typeOfRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:132:2: ( TYPEOF assignTypologyRule )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:133:3: TYPEOF assignTypologyRule
			{
			match(input,TYPEOF,FOLLOW_TYPEOF_in_typeOfRule689); 
			pushFollow(FOLLOW_assignTypologyRule_in_typeOfRule691);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:1: tryCatchRule : TRY blockRule CATCH LP ID RP blockRule ( FINALLY blockRule )? ;
	public final void tryCatchRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:139:2: ( TRY blockRule CATCH LP ID RP blockRule ( FINALLY blockRule )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:3: TRY blockRule CATCH LP ID RP blockRule ( FINALLY blockRule )?
			{
			match(input,TRY,FOLLOW_TRY_in_tryCatchRule708); 
			pushFollow(FOLLOW_blockRule_in_tryCatchRule710);
			blockRule();
			state._fsp--;

			match(input,CATCH,FOLLOW_CATCH_in_tryCatchRule715); 
			match(input,LP,FOLLOW_LP_in_tryCatchRule717); 
			match(input,ID,FOLLOW_ID_in_tryCatchRule719); 
			match(input,RP,FOLLOW_RP_in_tryCatchRule721); 
			pushFollow(FOLLOW_blockRule_in_tryCatchRule723);
			blockRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:142:3: ( FINALLY blockRule )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==FINALLY) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:142:4: FINALLY blockRule
					{
					match(input,FINALLY,FOLLOW_FINALLY_in_tryCatchRule729); 
					pushFollow(FOLLOW_blockRule_in_tryCatchRule731);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:145:1: returnRule : RETURN ( expressionRule | assignTypologyRule ) ( SC )? ;
	public final void returnRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:146:2: ( RETURN ( expressionRule | assignTypologyRule ) ( SC )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:3: RETURN ( expressionRule | assignTypologyRule ) ( SC )?
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnRule747); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:10: ( expressionRule | assignTypologyRule )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==DEC||LA38_0==DOCUMENT||LA38_0==FALSE||LA38_0==FLOAT||LA38_0==ID||LA38_0==INC||LA38_0==INTEGER||LA38_0==LP||LA38_0==STRING||LA38_0==THIS||LA38_0==TRUE) ) {
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:11: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_returnRule750);
					expressionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:26: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_returnRule752);
					assignTypologyRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:46: ( SC )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==SC) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:46: SC
					{
					match(input,SC,FOLLOW_SC_in_returnRule755); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:150:1: functionDeclarationRule : func= FUNCTION (name= ID )? LP ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )? RP ;
	public final void functionDeclarationRule() throws RecognitionException {
		Token func=null;
		Token name=null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:151:2: (func= FUNCTION (name= ID )? LP ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )? RP )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:3: func= FUNCTION (name= ID )? LP ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )? RP
			{
			func=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclarationRule773); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:23: (name= ID )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==ID) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:23: name= ID
					{
					name=(Token)match(input,ID,FOLLOW_ID_in_functionDeclarationRule779); 
					}
					break;

			}

			h.checkFunctionName(name, func);
			match(input,LP,FOLLOW_LP_in_functionDeclarationRule784); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:69: ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==DEC||LA44_0==DOCUMENT||LA44_0==FALSE||LA44_0==FLOAT||LA44_0==FUNCTION||LA44_0==ID||LA44_0==INC||LA44_0==INTEGER||(LA44_0 >= LB && LA44_0 <= LBR)||LA44_0==LP||LA44_0==NEW||LA44_0==NULL||LA44_0==STRING||LA44_0==THIS||LA44_0==TRUE||LA44_0==UNDEFINED) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:70: ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* )
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:70: ( assignTypologyRule | expressionRule )
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==FUNCTION||(LA41_0 >= LB && LA41_0 <= LBR)||LA41_0==NEW||LA41_0==NULL||LA41_0==UNDEFINED) ) {
						alt41=1;
					}
					else if ( (LA41_0==DEC||LA41_0==DOCUMENT||LA41_0==FALSE||LA41_0==FLOAT||LA41_0==ID||LA41_0==INC||LA41_0==INTEGER||LA41_0==LP||LA41_0==STRING||LA41_0==THIS||LA41_0==TRUE) ) {
						alt41=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 41, 0, input);
						throw nvae;
					}

					switch (alt41) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:71: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_functionDeclarationRule788);
							assignTypologyRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:90: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_functionDeclarationRule790);
							expressionRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:106: ( ( CM ( assignTypologyRule | expressionRule ) )* )
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:107: ( CM ( assignTypologyRule | expressionRule ) )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:107: ( CM ( assignTypologyRule | expressionRule ) )*
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==CM) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:108: CM ( assignTypologyRule | expressionRule )
							{
							match(input,CM,FOLLOW_CM_in_functionDeclarationRule795); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:111: ( assignTypologyRule | expressionRule )
							int alt42=2;
							int LA42_0 = input.LA(1);
							if ( (LA42_0==FUNCTION||(LA42_0 >= LB && LA42_0 <= LBR)||LA42_0==NEW||LA42_0==NULL||LA42_0==UNDEFINED) ) {
								alt42=1;
							}
							else if ( (LA42_0==DEC||LA42_0==DOCUMENT||LA42_0==FALSE||LA42_0==FLOAT||LA42_0==ID||LA42_0==INC||LA42_0==INTEGER||LA42_0==LP||LA42_0==STRING||LA42_0==THIS||LA42_0==TRUE) ) {
								alt42=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 42, 0, input);
								throw nvae;
							}

							switch (alt42) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:112: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_functionDeclarationRule798);
									assignTypologyRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:131: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_functionDeclarationRule800);
									expressionRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop43;
						}
					}

					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionDeclarationRule808); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:1: functionDefinitionRule : functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR ;
	public final void functionDefinitionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:156:2: ( functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:157:3: functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR
			{
			pushFollow(FOLLOW_functionDeclarationRule_in_functionDefinitionRule823);
			functionDeclarationRule();
			state._fsp--;

			match(input,LBR,FOLLOW_LBR_in_functionDefinitionRule827); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:159:4: ( instructionRule )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==BREAK||(LA45_0 >= CONST && LA45_0 <= CONTINUE)||(LA45_0 >= DO && LA45_0 <= DOCUMENT)||(LA45_0 >= FOR && LA45_0 <= FUNCTION)||(LA45_0 >= ID && LA45_0 <= IF)||LA45_0==LET||LA45_0==SWITCH||(LA45_0 >= THIS && LA45_0 <= THROW)||(LA45_0 >= TRY && LA45_0 <= TYPEOF)||LA45_0==VAR||LA45_0==WHILE) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:159:4: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_functionDefinitionRule832);
					instructionRule();
					state._fsp--;

					}
					break;

				default :
					break loop45;
				}
			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:160:4: ( returnRule )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==RETURN) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:160:4: returnRule
					{
					pushFollow(FOLLOW_returnRule_in_functionDefinitionRule838);
					returnRule();
					state._fsp--;

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_functionDefinitionRule843); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:164:1: arrayRule : LB ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )? RB ;
	public final void arrayRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:165:2: ( LB ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )? RB )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:166:3: LB ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )? RB
			{
			match(input,LB,FOLLOW_LB_in_arrayRule857); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:4: ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==DEC||LA50_0==DOCUMENT||LA50_0==FALSE||LA50_0==FLOAT||LA50_0==FUNCTION||LA50_0==ID||LA50_0==INC||LA50_0==INTEGER||(LA50_0 >= LB && LA50_0 <= LBR)||LA50_0==LP||LA50_0==NEW||LA50_0==NULL||LA50_0==STRING||LA50_0==THIS||LA50_0==TRUE||LA50_0==UNDEFINED) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:168:4: ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:168:4: ( expressionRule | assignTypologyRule )
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==DEC||LA47_0==DOCUMENT||LA47_0==FALSE||LA47_0==FLOAT||LA47_0==ID||LA47_0==INC||LA47_0==INTEGER||LA47_0==LP||LA47_0==STRING||LA47_0==THIS||LA47_0==TRUE) ) {
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
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:168:5: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_arrayRule868);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:168:20: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_arrayRule870);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:169:4: ( CM ( expressionRule | assignTypologyRule )? )*
					loop49:
					while (true) {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==CM) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:169:5: CM ( expressionRule | assignTypologyRule )?
							{
							match(input,CM,FOLLOW_CM_in_arrayRule877); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:169:8: ( expressionRule | assignTypologyRule )?
							int alt48=3;
							int LA48_0 = input.LA(1);
							if ( (LA48_0==DEC||LA48_0==DOCUMENT||LA48_0==FALSE||LA48_0==FLOAT||LA48_0==ID||LA48_0==INC||LA48_0==INTEGER||LA48_0==LP||LA48_0==STRING||LA48_0==THIS||LA48_0==TRUE) ) {
								alt48=1;
							}
							else if ( (LA48_0==FUNCTION||(LA48_0 >= LB && LA48_0 <= LBR)||LA48_0==NEW||LA48_0==NULL||LA48_0==UNDEFINED) ) {
								alt48=2;
							}
							switch (alt48) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:169:9: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_arrayRule880);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:169:24: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_arrayRule882);
									assignTypologyRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop49;
						}
					}

					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_arrayRule896); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:174:1: objectRule : LBR ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )? RBR ;
	public final void objectRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:175:2: ( LBR ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )? RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:176:3: LBR ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )? RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectRule911); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:177:4: ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==ID||LA54_0==STRING) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:178:4: ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )*
					{
					if ( input.LA(1)==ID||input.LA(1)==STRING ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,CL,FOLLOW_CL_in_objectRule933); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:180:4: ( expressionRule | assignTypologyRule )
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==DEC||LA51_0==DOCUMENT||LA51_0==FALSE||LA51_0==FLOAT||LA51_0==ID||LA51_0==INC||LA51_0==INTEGER||LA51_0==LP||LA51_0==STRING||LA51_0==THIS||LA51_0==TRUE) ) {
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
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:180:5: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_objectRule940);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:180:20: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_objectRule942);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:181:4: ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )*
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==CM) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:182:4: CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule )
							{
							match(input,CM,FOLLOW_CM_in_objectRule953); 
							if ( input.LA(1)==ID||input.LA(1)==STRING ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,CL,FOLLOW_CL_in_objectRule970); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:185:4: ( expressionRule | assignTypologyRule )
							int alt52=2;
							int LA52_0 = input.LA(1);
							if ( (LA52_0==DEC||LA52_0==DOCUMENT||LA52_0==FALSE||LA52_0==FLOAT||LA52_0==ID||LA52_0==INC||LA52_0==INTEGER||LA52_0==LP||LA52_0==STRING||LA52_0==THIS||LA52_0==TRUE) ) {
								alt52=1;
							}
							else if ( (LA52_0==FUNCTION||(LA52_0 >= LB && LA52_0 <= LBR)||LA52_0==NEW||LA52_0==NULL||LA52_0==UNDEFINED) ) {
								alt52=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 52, 0, input);
								throw nvae;
							}

							switch (alt52) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:185:5: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_objectRule977);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:185:20: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_objectRule979);
									assignTypologyRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop53;
						}
					}

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_objectRule996); 
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



	// $ANTLR start "variableDefinitionRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:192:1: variableDefinitionRule : ( VAR | LET | CONST )? idDotArrayRule ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? ;
	public final void variableDefinitionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:193:2: ( ( VAR | LET | CONST )? idDotArrayRule ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:194:3: ( VAR | LET | CONST )? idDotArrayRule ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:194:3: ( VAR | LET | CONST )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==CONST||LA55_0==LET||LA55_0==VAR) ) {
				alt55=1;
			}
			switch (alt55) {
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

			pushFollow(FOLLOW_idDotArrayRule_in_variableDefinitionRule1028);
			idDotArrayRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:196:3: ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==ASSIGN||LA57_0==DIVEQ||LA57_0==EXPEQ||LA57_0==MINUSEQ||LA57_0==MODEQ||LA57_0==PLUSEQ||LA57_0==STAREQ) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:196:4: ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule )
					{
					if ( input.LA(1)==ASSIGN||input.LA(1)==DIVEQ||input.LA(1)==EXPEQ||input.LA(1)==MINUSEQ||input.LA(1)==MODEQ||input.LA(1)==PLUSEQ||input.LA(1)==STAREQ ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:196:53: ( expressionRule | assignTypologyRule )
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==DEC||LA56_0==DOCUMENT||LA56_0==FALSE||LA56_0==FLOAT||LA56_0==ID||LA56_0==INC||LA56_0==INTEGER||LA56_0==LP||LA56_0==STRING||LA56_0==THIS||LA56_0==TRUE) ) {
						alt56=1;
					}
					else if ( (LA56_0==FUNCTION||(LA56_0 >= LB && LA56_0 <= LBR)||LA56_0==NEW||LA56_0==NULL||LA56_0==UNDEFINED) ) {
						alt56=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 56, 0, input);
						throw nvae;
					}

					switch (alt56) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:196:54: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_variableDefinitionRule1050);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:196:69: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_variableDefinitionRule1052);
							assignTypologyRule();
							state._fsp--;

							}
							break;

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
	// $ANTLR end "variableDefinitionRule"



	// $ANTLR start "documentRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:200:1: documentRule : getRule ( ( ASSIGN | PLUSEQ ) ( expressionRule | assignTypologyRule ) )? ;
	public final void documentRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:201:2: ( getRule ( ( ASSIGN | PLUSEQ ) ( expressionRule | assignTypologyRule ) )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:202:3: getRule ( ( ASSIGN | PLUSEQ ) ( expressionRule | assignTypologyRule ) )?
			{
			pushFollow(FOLLOW_getRule_in_documentRule1071);
			getRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:202:11: ( ( ASSIGN | PLUSEQ ) ( expressionRule | assignTypologyRule ) )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==ASSIGN||LA59_0==PLUSEQ) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:202:12: ( ASSIGN | PLUSEQ ) ( expressionRule | assignTypologyRule )
					{
					if ( input.LA(1)==ASSIGN||input.LA(1)==PLUSEQ ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:202:27: ( expressionRule | assignTypologyRule )
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==DEC||LA58_0==DOCUMENT||LA58_0==FALSE||LA58_0==FLOAT||LA58_0==ID||LA58_0==INC||LA58_0==INTEGER||LA58_0==LP||LA58_0==STRING||LA58_0==THIS||LA58_0==TRUE) ) {
						alt58=1;
					}
					else if ( (LA58_0==FUNCTION||(LA58_0 >= LB && LA58_0 <= LBR)||LA58_0==NEW||LA58_0==NULL||LA58_0==UNDEFINED) ) {
						alt58=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 58, 0, input);
						throw nvae;
					}

					switch (alt58) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:202:28: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_documentRule1080);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:202:43: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_documentRule1082);
							assignTypologyRule();
							state._fsp--;

							}
							break;

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
	// $ANTLR end "documentRule"



	// $ANTLR start "idStartingRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:205:1: idStartingRule : ( VAR | LET | CONST )? idDotArrayRule ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID ) ;
	public final void idStartingRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:206:2: ( ( VAR | LET | CONST )? idDotArrayRule ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:207:3: ( VAR | LET | CONST )? idDotArrayRule ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:207:3: ( VAR | LET | CONST )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==CONST||LA60_0==LET||LA60_0==VAR) ) {
				alt60=1;
			}
			switch (alt60) {
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

			pushFollow(FOLLOW_idDotArrayRule_in_idStartingRule1114);
			idDotArrayRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:208:18: ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID )
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==EOF||LA63_0==ASSIGN||(LA63_0 >= BREAK && LA63_0 <= CASE)||LA63_0==CLASS||(LA63_0 >= CONST && LA63_0 <= CONTINUE)||LA63_0==DEFAULT||(LA63_0 >= DIVEQ && LA63_0 <= DOCUMENT)||LA63_0==ELSE||LA63_0==EXPEQ||(LA63_0 >= FOR && LA63_0 <= FUNCTION)||(LA63_0 >= ID && LA63_0 <= IF)||LA63_0==LBR||LA63_0==LET||LA63_0==MINUSEQ||LA63_0==MODEQ||LA63_0==PLUSEQ||(LA63_0 >= RBR && LA63_0 <= RETURN)||LA63_0==SC||LA63_0==STAREQ||LA63_0==SWITCH||(LA63_0 >= THIS && LA63_0 <= THROW)||(LA63_0 >= TRY && LA63_0 <= TYPEOF)||LA63_0==VAR||LA63_0==WHILE) ) {
				alt63=1;
			}
			else if ( (LA63_0==INSTANCEOF) ) {
				alt63=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:208:20: ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:208:20: ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0==ASSIGN||LA62_0==DIVEQ||LA62_0==EXPEQ||LA62_0==MINUSEQ||LA62_0==MODEQ||LA62_0==PLUSEQ||LA62_0==STAREQ) ) {
						alt62=1;
					}
					switch (alt62) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:208:21: ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule )
							{
							if ( input.LA(1)==ASSIGN||input.LA(1)==DIVEQ||input.LA(1)==EXPEQ||input.LA(1)==MINUSEQ||input.LA(1)==MODEQ||input.LA(1)==PLUSEQ||input.LA(1)==STAREQ ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:208:70: ( expressionRule | assignTypologyRule )
							int alt61=2;
							int LA61_0 = input.LA(1);
							if ( (LA61_0==DEC||LA61_0==DOCUMENT||LA61_0==FALSE||LA61_0==FLOAT||LA61_0==ID||LA61_0==INC||LA61_0==INTEGER||LA61_0==LP||LA61_0==STRING||LA61_0==THIS||LA61_0==TRUE) ) {
								alt61=1;
							}
							else if ( (LA61_0==FUNCTION||(LA61_0 >= LB && LA61_0 <= LBR)||LA61_0==NEW||LA61_0==NULL||LA61_0==UNDEFINED) ) {
								alt61=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 61, 0, input);
								throw nvae;
							}

							switch (alt61) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:208:71: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_idStartingRule1136);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:208:86: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_idStartingRule1138);
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:208:110: INSTANCEOF ID
					{
					match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_idStartingRule1145); 
					match(input,ID,FOLLOW_ID_in_idStartingRule1147); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:212:1: newRule : NEW ID LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP ;
	public final void newRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:213:2: ( NEW ID LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:3: NEW ID LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP
			{
			match(input,NEW,FOLLOW_NEW_in_newRule1163); 
			match(input,ID,FOLLOW_ID_in_newRule1165); 
			match(input,LP,FOLLOW_LP_in_newRule1167); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:13: ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==DEC||LA67_0==DOCUMENT||LA67_0==FALSE||LA67_0==FLOAT||LA67_0==FUNCTION||LA67_0==ID||LA67_0==INC||LA67_0==INTEGER||(LA67_0 >= LB && LA67_0 <= LBR)||LA67_0==LP||LA67_0==NEW||LA67_0==NULL||LA67_0==STRING||LA67_0==THIS||LA67_0==TRUE||LA67_0==UNDEFINED) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:14: ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:14: ( expressionRule | assignTypologyRule )
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==DEC||LA64_0==DOCUMENT||LA64_0==FALSE||LA64_0==FLOAT||LA64_0==ID||LA64_0==INC||LA64_0==INTEGER||LA64_0==LP||LA64_0==STRING||LA64_0==THIS||LA64_0==TRUE) ) {
						alt64=1;
					}
					else if ( (LA64_0==FUNCTION||(LA64_0 >= LB && LA64_0 <= LBR)||LA64_0==NEW||LA64_0==NULL||LA64_0==UNDEFINED) ) {
						alt64=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 64, 0, input);
						throw nvae;
					}

					switch (alt64) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:15: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_newRule1171);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:30: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_newRule1173);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:50: ( CM ( expressionRule | assignTypologyRule ) )*
					loop66:
					while (true) {
						int alt66=2;
						int LA66_0 = input.LA(1);
						if ( (LA66_0==CM) ) {
							alt66=1;
						}

						switch (alt66) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:51: CM ( expressionRule | assignTypologyRule )
							{
							match(input,CM,FOLLOW_CM_in_newRule1177); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:54: ( expressionRule | assignTypologyRule )
							int alt65=2;
							int LA65_0 = input.LA(1);
							if ( (LA65_0==DEC||LA65_0==DOCUMENT||LA65_0==FALSE||LA65_0==FLOAT||LA65_0==ID||LA65_0==INC||LA65_0==INTEGER||LA65_0==LP||LA65_0==STRING||LA65_0==THIS||LA65_0==TRUE) ) {
								alt65=1;
							}
							else if ( (LA65_0==FUNCTION||(LA65_0 >= LB && LA65_0 <= LBR)||LA65_0==NEW||LA65_0==NULL||LA65_0==UNDEFINED) ) {
								alt65=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 65, 0, input);
								throw nvae;
							}

							switch (alt65) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:55: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_newRule1180);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:70: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_newRule1182);
									assignTypologyRule();
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

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_newRule1189); 
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



	// $ANTLR start "comparatorRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:218:1: comparatorRule : ( EQ | NEQ | LT | LE | GT | GE | TEQ | NTEQ ) ;
	public final void comparatorRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:219:2: ( ( EQ | NEQ | LT | LE | GT | GE | TEQ | NTEQ ) )
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:223:1: conditionRule : ( NOT )? expressionRule ( comparatorRule ( NOT )? expressionRule )? ( ( AND | OR ) conditionRule )* ;
	public final void conditionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:224:2: ( ( NOT )? expressionRule ( comparatorRule ( NOT )? expressionRule )? ( ( AND | OR ) conditionRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:3: ( NOT )? expressionRule ( comparatorRule ( NOT )? expressionRule )? ( ( AND | OR ) conditionRule )*
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:3: ( NOT )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==NOT) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:3: NOT
					{
					match(input,NOT,FOLLOW_NOT_in_conditionRule1248); 
					}
					break;

			}

			pushFollow(FOLLOW_expressionRule_in_conditionRule1251);
			expressionRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:23: ( comparatorRule ( NOT )? expressionRule )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==EQ||(LA70_0 >= GE && LA70_0 <= GT)||LA70_0==LE||LA70_0==LT||LA70_0==NEQ||LA70_0==NTEQ||LA70_0==TEQ) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:24: comparatorRule ( NOT )? expressionRule
					{
					pushFollow(FOLLOW_comparatorRule_in_conditionRule1254);
					comparatorRule();
					state._fsp--;

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:39: ( NOT )?
					int alt69=2;
					int LA69_0 = input.LA(1);
					if ( (LA69_0==NOT) ) {
						alt69=1;
					}
					switch (alt69) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:39: NOT
							{
							match(input,NOT,FOLLOW_NOT_in_conditionRule1256); 
							}
							break;

					}

					pushFollow(FOLLOW_expressionRule_in_conditionRule1259);
					expressionRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:226:3: ( ( AND | OR ) conditionRule )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==AND||LA71_0==OR) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:226:4: ( AND | OR ) conditionRule
					{
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_conditionRule_in_conditionRule1272);
					conditionRule();
					state._fsp--;

					}
					break;

				default :
					break loop71;
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:229:1: blockRule : LBR ( instructionRule | blockRule )* RBR ;
	public final void blockRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:230:2: ( LBR ( instructionRule | blockRule )* RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:3: LBR ( instructionRule | blockRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_blockRule1288); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:7: ( instructionRule | blockRule )*
			loop72:
			while (true) {
				int alt72=3;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==BREAK||(LA72_0 >= CONST && LA72_0 <= CONTINUE)||(LA72_0 >= DO && LA72_0 <= DOCUMENT)||(LA72_0 >= FOR && LA72_0 <= FUNCTION)||(LA72_0 >= ID && LA72_0 <= IF)||LA72_0==LET||LA72_0==SWITCH||(LA72_0 >= THIS && LA72_0 <= THROW)||(LA72_0 >= TRY && LA72_0 <= TYPEOF)||LA72_0==VAR||LA72_0==WHILE) ) {
					alt72=1;
				}
				else if ( (LA72_0==LBR) ) {
					alt72=2;
				}

				switch (alt72) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:8: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_blockRule1291);
					instructionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:24: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_blockRule1293);
					blockRule();
					state._fsp--;

					}
					break;

				default :
					break loop72;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_blockRule1297); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:234:1: ifStatementRule : IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )* ;
	public final void ifStatementRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:235:2: ( IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:236:3: IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )*
			{
			match(input,IF,FOLLOW_IF_in_ifStatementRule1312); 
			match(input,LP,FOLLOW_LP_in_ifStatementRule1314); 
			pushFollow(FOLLOW_conditionRule_in_ifStatementRule1316);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_ifStatementRule1318); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:237:4: ( blockRule | instructionRule )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==LBR) ) {
				alt73=1;
			}
			else if ( (LA73_0==BREAK||(LA73_0 >= CONST && LA73_0 <= CONTINUE)||(LA73_0 >= DO && LA73_0 <= DOCUMENT)||(LA73_0 >= FOR && LA73_0 <= FUNCTION)||(LA73_0 >= ID && LA73_0 <= IF)||LA73_0==LET||LA73_0==SWITCH||(LA73_0 >= THIS && LA73_0 <= THROW)||(LA73_0 >= TRY && LA73_0 <= TYPEOF)||LA73_0==VAR||LA73_0==WHILE) ) {
				alt73=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:237:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_ifStatementRule1325);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:237:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_ifStatementRule1329);
					instructionRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:3: ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )*
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==ELSE) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:4: ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule )
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStatementRule1335); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:9: ( IF LP conditionRule RP )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==IF) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:10: IF LP conditionRule RP
							{
							match(input,IF,FOLLOW_IF_in_ifStatementRule1338); 
							match(input,LP,FOLLOW_LP_in_ifStatementRule1340); 
							pushFollow(FOLLOW_conditionRule_in_ifStatementRule1342);
							conditionRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_ifStatementRule1344); 
							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:35: ( blockRule | instructionRule )
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==LBR) ) {
						alt75=1;
					}
					else if ( (LA75_0==BREAK||(LA75_0 >= CONST && LA75_0 <= CONTINUE)||(LA75_0 >= DO && LA75_0 <= DOCUMENT)||(LA75_0 >= FOR && LA75_0 <= FUNCTION)||(LA75_0 >= ID && LA75_0 <= IF)||LA75_0==LET||LA75_0==SWITCH||(LA75_0 >= THIS && LA75_0 <= THROW)||(LA75_0 >= TRY && LA75_0 <= TYPEOF)||LA75_0==VAR||LA75_0==WHILE) ) {
						alt75=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 75, 0, input);
						throw nvae;
					}

					switch (alt75) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:36: blockRule
							{
							pushFollow(FOLLOW_blockRule_in_ifStatementRule1349);
							blockRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:48: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_ifStatementRule1353);
							instructionRule();
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop76;
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



	// $ANTLR start "switchCaseRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:241:1: switchCaseRule : SWITCH LP ( expressionRule | assignTypologyRule ) RP LBR ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )* ( DEFAULT CL ( instructionRule )* )? ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )* RBR ;
	public final void switchCaseRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:242:2: ( SWITCH LP ( expressionRule | assignTypologyRule ) RP LBR ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )* ( DEFAULT CL ( instructionRule )* )? ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )* RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:3: SWITCH LP ( expressionRule | assignTypologyRule ) RP LBR ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )* ( DEFAULT CL ( instructionRule )* )? ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )* RBR
			{
			match(input,SWITCH,FOLLOW_SWITCH_in_switchCaseRule1371); 
			match(input,LP,FOLLOW_LP_in_switchCaseRule1373); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:13: ( expressionRule | assignTypologyRule )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==DEC||LA77_0==DOCUMENT||LA77_0==FALSE||LA77_0==FLOAT||LA77_0==ID||LA77_0==INC||LA77_0==INTEGER||LA77_0==LP||LA77_0==STRING||LA77_0==THIS||LA77_0==TRUE) ) {
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:14: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_switchCaseRule1376);
					expressionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:29: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_switchCaseRule1378);
					assignTypologyRule();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_switchCaseRule1381); 
			match(input,LBR,FOLLOW_LBR_in_switchCaseRule1385); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:245:4: ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )*
			loop80:
			while (true) {
				int alt80=2;
				int LA80_0 = input.LA(1);
				if ( (LA80_0==CASE) ) {
					alt80=1;
				}

				switch (alt80) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:245:5: CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )*
					{
					match(input,CASE,FOLLOW_CASE_in_switchCaseRule1391); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:245:10: ( expressionRule | assignTypologyRule )
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==DEC||LA78_0==DOCUMENT||LA78_0==FALSE||LA78_0==FLOAT||LA78_0==ID||LA78_0==INC||LA78_0==INTEGER||LA78_0==LP||LA78_0==STRING||LA78_0==THIS||LA78_0==TRUE) ) {
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
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:245:11: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_switchCaseRule1394);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:245:26: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_switchCaseRule1396);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					match(input,CL,FOLLOW_CL_in_switchCaseRule1399); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:246:5: ( instructionRule )*
					loop79:
					while (true) {
						int alt79=2;
						int LA79_0 = input.LA(1);
						if ( (LA79_0==BREAK||(LA79_0 >= CONST && LA79_0 <= CONTINUE)||(LA79_0 >= DO && LA79_0 <= DOCUMENT)||(LA79_0 >= FOR && LA79_0 <= FUNCTION)||(LA79_0 >= ID && LA79_0 <= IF)||LA79_0==LET||LA79_0==SWITCH||(LA79_0 >= THIS && LA79_0 <= THROW)||(LA79_0 >= TRY && LA79_0 <= TYPEOF)||LA79_0==VAR||LA79_0==WHILE) ) {
							alt79=1;
						}

						switch (alt79) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:246:5: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_switchCaseRule1405);
							instructionRule();
							state._fsp--;

							}
							break;

						default :
							break loop79;
						}
					}

					}
					break;

				default :
					break loop80;
				}
			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:248:4: ( DEFAULT CL ( instructionRule )* )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==DEFAULT) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:248:5: DEFAULT CL ( instructionRule )*
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_switchCaseRule1418); 
					match(input,CL,FOLLOW_CL_in_switchCaseRule1420); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:249:5: ( instructionRule )*
					loop81:
					while (true) {
						int alt81=2;
						int LA81_0 = input.LA(1);
						if ( (LA81_0==BREAK||(LA81_0 >= CONST && LA81_0 <= CONTINUE)||(LA81_0 >= DO && LA81_0 <= DOCUMENT)||(LA81_0 >= FOR && LA81_0 <= FUNCTION)||(LA81_0 >= ID && LA81_0 <= IF)||LA81_0==LET||LA81_0==SWITCH||(LA81_0 >= THIS && LA81_0 <= THROW)||(LA81_0 >= TRY && LA81_0 <= TYPEOF)||LA81_0==VAR||LA81_0==WHILE) ) {
							alt81=1;
						}

						switch (alt81) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:249:5: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_switchCaseRule1426);
							instructionRule();
							state._fsp--;

							}
							break;

						default :
							break loop81;
						}
					}

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:4: ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )*
			loop85:
			while (true) {
				int alt85=2;
				int LA85_0 = input.LA(1);
				if ( (LA85_0==CASE) ) {
					alt85=1;
				}

				switch (alt85) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:5: CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )*
					{
					match(input,CASE,FOLLOW_CASE_in_switchCaseRule1439); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:10: ( expressionRule | assignTypologyRule )
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==DEC||LA83_0==DOCUMENT||LA83_0==FALSE||LA83_0==FLOAT||LA83_0==ID||LA83_0==INC||LA83_0==INTEGER||LA83_0==LP||LA83_0==STRING||LA83_0==THIS||LA83_0==TRUE) ) {
						alt83=1;
					}
					else if ( (LA83_0==FUNCTION||(LA83_0 >= LB && LA83_0 <= LBR)||LA83_0==NEW||LA83_0==NULL||LA83_0==UNDEFINED) ) {
						alt83=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 83, 0, input);
						throw nvae;
					}

					switch (alt83) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:11: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_switchCaseRule1442);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:26: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_switchCaseRule1444);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					match(input,CL,FOLLOW_CL_in_switchCaseRule1447); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:252:5: ( instructionRule )*
					loop84:
					while (true) {
						int alt84=2;
						int LA84_0 = input.LA(1);
						if ( (LA84_0==BREAK||(LA84_0 >= CONST && LA84_0 <= CONTINUE)||(LA84_0 >= DO && LA84_0 <= DOCUMENT)||(LA84_0 >= FOR && LA84_0 <= FUNCTION)||(LA84_0 >= ID && LA84_0 <= IF)||LA84_0==LET||LA84_0==SWITCH||(LA84_0 >= THIS && LA84_0 <= THROW)||(LA84_0 >= TRY && LA84_0 <= TYPEOF)||LA84_0==VAR||LA84_0==WHILE) ) {
							alt84=1;
						}

						switch (alt84) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:252:5: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_switchCaseRule1453);
							instructionRule();
							state._fsp--;

							}
							break;

						default :
							break loop84;
						}
					}

					}
					break;

				default :
					break loop85;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_switchCaseRule1464); 
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
	// $ANTLR end "switchCaseRule"



	// $ANTLR start "forRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:258:1: forRule : FOR LP ( forInitVarRule )? SC ( conditionRule )? SC ( stepRule )? RP ( blockRule | instructionRule ) ;
	public final void forRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:259:2: ( FOR LP ( forInitVarRule )? SC ( conditionRule )? SC ( stepRule )? RP ( blockRule | instructionRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:260:3: FOR LP ( forInitVarRule )? SC ( conditionRule )? SC ( stepRule )? RP ( blockRule | instructionRule )
			{
			match(input,FOR,FOLLOW_FOR_in_forRule1482); 
			match(input,LP,FOLLOW_LP_in_forRule1484); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:260:10: ( forInitVarRule )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==ID||LA86_0==LET||LA86_0==THIS||LA86_0==VAR) ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:260:10: forInitVarRule
					{
					pushFollow(FOLLOW_forInitVarRule_in_forRule1486);
					forInitVarRule();
					state._fsp--;

					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_forRule1489); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:260:29: ( conditionRule )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==DEC||LA87_0==DOCUMENT||LA87_0==FALSE||LA87_0==FLOAT||LA87_0==ID||LA87_0==INC||LA87_0==INTEGER||LA87_0==LP||LA87_0==NOT||LA87_0==STRING||LA87_0==THIS||LA87_0==TRUE) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:260:29: conditionRule
					{
					pushFollow(FOLLOW_conditionRule_in_forRule1491);
					conditionRule();
					state._fsp--;

					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_forRule1494); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:260:47: ( stepRule )?
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==DEC||LA88_0==ID||LA88_0==INC) ) {
				alt88=1;
			}
			switch (alt88) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:260:47: stepRule
					{
					pushFollow(FOLLOW_stepRule_in_forRule1496);
					stepRule();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_forRule1499); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:261:4: ( blockRule | instructionRule )
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==LBR) ) {
				alt89=1;
			}
			else if ( (LA89_0==BREAK||(LA89_0 >= CONST && LA89_0 <= CONTINUE)||(LA89_0 >= DO && LA89_0 <= DOCUMENT)||(LA89_0 >= FOR && LA89_0 <= FUNCTION)||(LA89_0 >= ID && LA89_0 <= IF)||LA89_0==LET||LA89_0==SWITCH||(LA89_0 >= THIS && LA89_0 <= THROW)||(LA89_0 >= TRY && LA89_0 <= TYPEOF)||LA89_0==VAR||LA89_0==WHILE) ) {
				alt89=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 89, 0, input);
				throw nvae;
			}

			switch (alt89) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:261:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_forRule1505);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:261:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_forRule1509);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:264:1: forInitVarRule : ( VAR | LET )? idDotArrayRule ASSIGN ( expressionRule | assignTypologyRule ) ;
	public final void forInitVarRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:265:2: ( ( VAR | LET )? idDotArrayRule ASSIGN ( expressionRule | assignTypologyRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:266:3: ( VAR | LET )? idDotArrayRule ASSIGN ( expressionRule | assignTypologyRule )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:266:3: ( VAR | LET )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==LET||LA90_0==VAR) ) {
				alt90=1;
			}
			switch (alt90) {
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

			pushFollow(FOLLOW_idDotArrayRule_in_forInitVarRule1533);
			idDotArrayRule();
			state._fsp--;

			match(input,ASSIGN,FOLLOW_ASSIGN_in_forInitVarRule1535); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:266:38: ( expressionRule | assignTypologyRule )
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==DEC||LA91_0==DOCUMENT||LA91_0==FALSE||LA91_0==FLOAT||LA91_0==ID||LA91_0==INC||LA91_0==INTEGER||LA91_0==LP||LA91_0==STRING||LA91_0==THIS||LA91_0==TRUE) ) {
				alt91=1;
			}
			else if ( (LA91_0==FUNCTION||(LA91_0 >= LB && LA91_0 <= LBR)||LA91_0==NEW||LA91_0==NULL||LA91_0==UNDEFINED) ) {
				alt91=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}

			switch (alt91) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:266:39: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_forInitVarRule1538);
					expressionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:266:54: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_forInitVarRule1540);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:269:1: stepRule : (o1= incDecRule )? i= ID (o2= incDecRule )? ;
	public final void stepRule() throws RecognitionException {
		Token i=null;
		Token o1 =null;
		Token o2 =null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:270:2: ( (o1= incDecRule )? i= ID (o2= incDecRule )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:271:3: (o1= incDecRule )? i= ID (o2= incDecRule )?
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:271:3: (o1= incDecRule )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==DEC||LA92_0==INC) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:271:4: o1= incDecRule
					{
					pushFollow(FOLLOW_incDecRule_in_stepRule1560);
					o1=incDecRule();
					state._fsp--;

					}
					break;

			}

			i=(Token)match(input,ID,FOLLOW_ID_in_stepRule1569); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:273:3: (o2= incDecRule )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==DEC||LA93_0==INC) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:273:4: o2= incDecRule
					{
					pushFollow(FOLLOW_incDecRule_in_stepRule1577);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:276:1: incDecRule returns [Token tk] : (o1= DEC |o2= INC );
	public final Token incDecRule() throws RecognitionException {
		Token tk = null;


		Token o1=null;
		Token o2=null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:277:2: (o1= DEC |o2= INC )
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==DEC) ) {
				alt94=1;
			}
			else if ( (LA94_0==INC) ) {
				alt94=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 94, 0, input);
				throw nvae;
			}

			switch (alt94) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:278:3: o1= DEC
					{
					o1=(Token)match(input,DEC,FOLLOW_DEC_in_incDecRule1599); 
					tk = o1;
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:279:4: o2= INC
					{
					o2=(Token)match(input,INC,FOLLOW_INC_in_incDecRule1610); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:282:1: whileRule : WHILE LP conditionRule RP ( blockRule | instructionRule ) ;
	public final void whileRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:283:2: ( WHILE LP conditionRule RP ( blockRule | instructionRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:284:3: WHILE LP conditionRule RP ( blockRule | instructionRule )
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileRule1627); 
			match(input,LP,FOLLOW_LP_in_whileRule1629); 
			pushFollow(FOLLOW_conditionRule_in_whileRule1631);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_whileRule1633); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:285:4: ( blockRule | instructionRule )
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==LBR) ) {
				alt95=1;
			}
			else if ( (LA95_0==BREAK||(LA95_0 >= CONST && LA95_0 <= CONTINUE)||(LA95_0 >= DO && LA95_0 <= DOCUMENT)||(LA95_0 >= FOR && LA95_0 <= FUNCTION)||(LA95_0 >= ID && LA95_0 <= IF)||LA95_0==LET||LA95_0==SWITCH||(LA95_0 >= THIS && LA95_0 <= THROW)||(LA95_0 >= TRY && LA95_0 <= TYPEOF)||LA95_0==VAR||LA95_0==WHILE) ) {
				alt95=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}

			switch (alt95) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:285:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_whileRule1639);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:285:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_whileRule1643);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:288:1: doWhileRule : DO ( blockRule | instructionRule ) WHILE LP conditionRule RP ( SC )? ;
	public final void doWhileRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:289:2: ( DO ( blockRule | instructionRule ) WHILE LP conditionRule RP ( SC )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:290:3: DO ( blockRule | instructionRule ) WHILE LP conditionRule RP ( SC )?
			{
			match(input,DO,FOLLOW_DO_in_doWhileRule1657); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:291:4: ( blockRule | instructionRule )
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==LBR) ) {
				alt96=1;
			}
			else if ( (LA96_0==BREAK||(LA96_0 >= CONST && LA96_0 <= CONTINUE)||(LA96_0 >= DO && LA96_0 <= DOCUMENT)||(LA96_0 >= FOR && LA96_0 <= FUNCTION)||(LA96_0 >= ID && LA96_0 <= IF)||LA96_0==LET||LA96_0==SWITCH||(LA96_0 >= THIS && LA96_0 <= THROW)||(LA96_0 >= TRY && LA96_0 <= TYPEOF)||LA96_0==VAR||LA96_0==WHILE) ) {
				alt96=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}

			switch (alt96) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:291:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_doWhileRule1663);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:291:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_doWhileRule1667);
					instructionRule();
					state._fsp--;

					}
					break;

			}

			match(input,WHILE,FOLLOW_WHILE_in_doWhileRule1672); 
			match(input,LP,FOLLOW_LP_in_doWhileRule1674); 
			pushFollow(FOLLOW_conditionRule_in_doWhileRule1676);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_doWhileRule1678); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:292:29: ( SC )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==SC) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:292:29: SC
					{
					match(input,SC,FOLLOW_SC_in_doWhileRule1680); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:295:1: classRule : CLASS ID LBR ( functionDefinitionRule )* RBR ;
	public final void classRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:296:2: ( CLASS ID LBR ( functionDefinitionRule )* RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:297:3: CLASS ID LBR ( functionDefinitionRule )* RBR
			{
			match(input,CLASS,FOLLOW_CLASS_in_classRule1695); 
			match(input,ID,FOLLOW_ID_in_classRule1697); 
			match(input,LBR,FOLLOW_LBR_in_classRule1702); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:299:4: ( functionDefinitionRule )*
			loop98:
			while (true) {
				int alt98=2;
				int LA98_0 = input.LA(1);
				if ( (LA98_0==FUNCTION) ) {
					alt98=1;
				}

				switch (alt98) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:299:4: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_classRule1708);
					functionDefinitionRule();
					state._fsp--;

					}
					break;

				default :
					break loop98;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_classRule1713); 
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



	public static final BitSet FOLLOW_instructionRule_in_parseJava64 = new BitSet(new long[]{0x0A018C000C064402L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_parseJava70 = new BitSet(new long[]{0x0A018C000C064402L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_classRule_in_parseJava76 = new BitSet(new long[]{0x0A018C000C064402L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_DOCUMENT_in_getRule90 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_DOT_in_getRule92 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_getRule96 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_getRule98 = new BitSet(new long[]{0x0000800000000000L,0x0000000084000000L});
	public static final BitSet FOLLOW_idDotArrayRule_in_getRule102 = new BitSet(new long[]{0x0000000000000010L,0x0000000000100000L});
	public static final BitSet FOLLOW_STRING_in_getRule104 = new BitSet(new long[]{0x0000000000000010L,0x0000000000100000L});
	public static final BitSet FOLLOW_ADD_in_getRule108 = new BitSet(new long[]{0x0000800000000000L,0x0000000084000000L});
	public static final BitSet FOLLOW_idDotArrayRule_in_getRule111 = new BitSet(new long[]{0x0000000000000010L,0x0000000000100000L});
	public static final BitSet FOLLOW_STRING_in_getRule115 = new BitSet(new long[]{0x0000000000000010L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_getRule123 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_DOT_in_getRule126 = new BitSet(new long[]{0x0000800000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_idDotArrayRule_in_getRule128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule146 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotIdRule149 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule151 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_STRING_in_factorTypologyRule168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_factorTypologyRule172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_factorTypologyRule176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factorTypologyRule180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factorTypologyRule184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_factorTypologyRule188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getRule_in_factorTypologyRule192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectRule_in_assignTypologyRule208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRule_in_assignTypologyRule212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_assignTypologyRule216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNDEFINED_in_assignTypologyRule220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_assignTypologyRule224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newRule_in_assignTypologyRule228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotIdRule_in_idDotArrayRuleOld243 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_THIS_in_idDotArrayRuleOld248 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRuleOld251 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idDotArrayRuleOld253 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_LB_in_idDotArrayRuleOld263 = new BitSet(new long[]{0x0040800000000000L,0x0000000084000000L});
	public static final BitSet FOLLOW_INTEGER_in_idDotArrayRuleOld266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_idDotArrayRule_in_idDotArrayRuleOld271 = new BitSet(new long[]{0x2000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LP_in_idDotArrayRuleOld274 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idDotArrayRuleOld277 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_idDotArrayRuleOld279 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_idDotArrayRuleOld283 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idDotArrayRuleOld286 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_idDotArrayRuleOld288 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_idDotArrayRuleOld293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_idDotArrayRuleOld300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_idDotArrayRuleOld303 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRuleOld308 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idDotArrayRuleOld310 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_THIS_in_idDotArrayRule333 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRule335 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_idDotIdRule_in_idDotArrayRule343 = new BitSet(new long[]{0x2100800010000002L});
	public static final BitSet FOLLOW_LB_in_idDotArrayRule349 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_idDotArrayRule351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_idDotArrayRule353 = new BitSet(new long[]{0x2100800010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRule357 = new BitSet(new long[]{0x2000800000000002L});
	public static final BitSet FOLLOW_LP_in_idDotArrayRule364 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284100090L});
	public static final BitSet FOLLOW_parametersRule_in_idDotArrayRule366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_idDotArrayRule369 = new BitSet(new long[]{0x0000800010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRule371 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_parametersRule395 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expressionRule_in_parametersRule399 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_CM_in_parametersRule402 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_parametersRule405 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expressionRule_in_parametersRule409 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_termRule_in_expressionRule425 = new BitSet(new long[]{0x0000000000000012L,0x0000000008000002L});
	public static final BitSet FOLLOW_set_in_expressionRule428 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_termRule_in_expressionRule440 = new BitSet(new long[]{0x0000000000000012L,0x0000000008000002L});
	public static final BitSet FOLLOW_factorRule_in_termRule455 = new BitSet(new long[]{0x4000000401000042L,0x0000104000A00400L});
	public static final BitSet FOLLOW_set_in_termRule458 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_factorRule_in_termRule494 = new BitSet(new long[]{0x4000000401000042L,0x0000104000A00400L});
	public static final BitSet FOLLOW_factorTypologyRule_in_factorRule518 = new BitSet(new long[]{0x0010000000100002L});
	public static final BitSet FOLLOW_LP_in_factorRule531 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_factorRule533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_factorRule535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_instructionRule549 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_CONTINUE_in_instructionRule556 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_tryCatchRule_in_instructionRule563 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_instructionRule570 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_ifStatementRule_in_instructionRule578 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_switchCaseRule_in_instructionRule585 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_forRule_in_instructionRule592 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_whileRule_in_instructionRule599 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_doWhileRule_in_instructionRule606 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_throwRule_in_instructionRule613 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_documentRule_in_instructionRule620 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_typeOfRule_in_instructionRule626 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_idStartingRule_in_instructionRule633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_instructionRule635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THROW_in_throwRule650 = new BitSet(new long[]{0x0040828000000000L,0x0000000284000000L});
	public static final BitSet FOLLOW_STRING_in_throwRule653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_throwRule657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_throwRule661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_throwRule665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_throwRule669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_throwRule673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEOF_in_typeOfRule689 = new BitSet(new long[]{0x0300080000000000L,0x0000001000000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_typeOfRule691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRY_in_tryCatchRule708 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockRule_in_tryCatchRule710 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CATCH_in_tryCatchRule715 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_tryCatchRule717 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_tryCatchRule719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_tryCatchRule721 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockRule_in_tryCatchRule723 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_FINALLY_in_tryCatchRule729 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockRule_in_tryCatchRule731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnRule747 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_returnRule750 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_returnRule752 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_returnRule755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_functionDeclarationRule773 = new BitSet(new long[]{0x2000800000000000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule779 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_functionDeclarationRule784 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284100090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_functionDeclarationRule788 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_functionDeclarationRule790 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_functionDeclarationRule795 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_functionDeclarationRule798 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_functionDeclarationRule800 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_functionDeclarationRule808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationRule_in_functionDefinitionRule823 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_functionDefinitionRule827 = new BitSet(new long[]{0x08018C000C060400L,0x0000028DA00C0000L});
	public static final BitSet FOLLOW_instructionRule_in_functionDefinitionRule832 = new BitSet(new long[]{0x08018C000C060400L,0x0000028DA00C0000L});
	public static final BitSet FOLLOW_returnRule_in_functionDefinitionRule838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_functionDefinitionRule843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_arrayRule857 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284020090L});
	public static final BitSet FOLLOW_expressionRule_in_arrayRule868 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_arrayRule870 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_CM_in_arrayRule877 = new BitSet(new long[]{0x23508A8008108000L,0x0000001284020090L});
	public static final BitSet FOLLOW_expressionRule_in_arrayRule880 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_arrayRule882 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_arrayRule896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectRule911 = new BitSet(new long[]{0x0000800000000000L,0x0000000004040000L});
	public static final BitSet FOLLOW_set_in_objectRule921 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule933 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_objectRule940 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_objectRule942 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_CM_in_objectRule953 = new BitSet(new long[]{0x0000800000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_set_in_objectRule958 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule970 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_objectRule977 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_objectRule979 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_objectRule996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_variableDefinitionRule1028 = new BitSet(new long[]{0x0000000802000082L,0x0000000001001005L});
	public static final BitSet FOLLOW_set_in_variableDefinitionRule1033 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_variableDefinitionRule1050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_variableDefinitionRule1052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getRule_in_documentRule1071 = new BitSet(new long[]{0x0000000000000082L,0x0000000000001000L});
	public static final BitSet FOLLOW_set_in_documentRule1074 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_documentRule1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_documentRule1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_idStartingRule1114 = new BitSet(new long[]{0x0020000802000082L,0x0000000001001005L});
	public static final BitSet FOLLOW_set_in_idStartingRule1119 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_idStartingRule1136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idStartingRule1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTANCEOF_in_idStartingRule1145 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idStartingRule1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_newRule1163 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_newRule1165 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_newRule1167 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284100090L});
	public static final BitSet FOLLOW_expressionRule_in_newRule1171 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_newRule1173 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_newRule1177 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_newRule1180 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_newRule1182 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_newRule1189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_conditionRule1248 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_conditionRule1251 = new BitSet(new long[]{0x8400300080000022L,0x0000000040000248L});
	public static final BitSet FOLLOW_comparatorRule_in_conditionRule1254 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_NOT_in_conditionRule1256 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_conditionRule1259 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000200L});
	public static final BitSet FOLLOW_set_in_conditionRule1266 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_conditionRule1272 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000200L});
	public static final BitSet FOLLOW_LBR_in_blockRule1288 = new BitSet(new long[]{0x0A018C000C060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_blockRule1291 = new BitSet(new long[]{0x0A018C000C060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_blockRule_in_blockRule1293 = new BitSet(new long[]{0x0A018C000C060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_RBR_in_blockRule1297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatementRule1312 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_ifStatementRule1314 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_ifStatementRule1316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ifStatementRule1318 = new BitSet(new long[]{0x0A018C000C060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_ifStatementRule1325 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_instructionRule_in_ifStatementRule1329 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ELSE_in_ifStatementRule1335 = new BitSet(new long[]{0x0A018C000C060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_IF_in_ifStatementRule1338 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_ifStatementRule1340 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_ifStatementRule1342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ifStatementRule1344 = new BitSet(new long[]{0x0A018C000C060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_ifStatementRule1349 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_instructionRule_in_ifStatementRule1353 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_SWITCH_in_switchCaseRule1371 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_switchCaseRule1373 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_switchCaseRule1376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_switchCaseRule1378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_switchCaseRule1381 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_switchCaseRule1385 = new BitSet(new long[]{0x0000000000200800L,0x0000000000040000L});
	public static final BitSet FOLLOW_CASE_in_switchCaseRule1391 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_switchCaseRule1394 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_switchCaseRule1396 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_switchCaseRule1399 = new BitSet(new long[]{0x08018C000C260C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_switchCaseRule1405 = new BitSet(new long[]{0x08018C000C260C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_DEFAULT_in_switchCaseRule1418 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_switchCaseRule1420 = new BitSet(new long[]{0x08018C000C060C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_switchCaseRule1426 = new BitSet(new long[]{0x08018C000C060C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_CASE_in_switchCaseRule1439 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_switchCaseRule1442 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_switchCaseRule1444 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_switchCaseRule1447 = new BitSet(new long[]{0x08018C000C060C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_switchCaseRule1453 = new BitSet(new long[]{0x08018C000C060C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_RBR_in_switchCaseRule1464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule1482 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_forRule1484 = new BitSet(new long[]{0x0800800000000000L,0x0000008080400000L});
	public static final BitSet FOLLOW_forInitVarRule_in_forRule1486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_forRule1489 = new BitSet(new long[]{0x2050828008100000L,0x0000000284400020L});
	public static final BitSet FOLLOW_conditionRule_in_forRule1491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_forRule1494 = new BitSet(new long[]{0x0010800000100000L,0x0000000000100000L});
	public static final BitSet FOLLOW_stepRule_in_forRule1496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_forRule1499 = new BitSet(new long[]{0x0A018C000C060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_forRule1505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionRule_in_forRule1509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_forInitVarRule1533 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_forInitVarRule1535 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_forInitVarRule1538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_forInitVarRule1540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incDecRule_in_stepRule1560 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_stepRule1569 = new BitSet(new long[]{0x0010000000100002L});
	public static final BitSet FOLLOW_incDecRule_in_stepRule1577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_incDecRule1599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INC_in_incDecRule1610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileRule1627 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_whileRule1629 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_whileRule1631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_whileRule1633 = new BitSet(new long[]{0x0A018C000C060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_whileRule1639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionRule_in_whileRule1643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_doWhileRule1657 = new BitSet(new long[]{0x0A018C000C060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_doWhileRule1663 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_instructionRule_in_doWhileRule1667 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_WHILE_in_doWhileRule1672 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_doWhileRule1674 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_doWhileRule1676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_doWhileRule1678 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_doWhileRule1680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule1695 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_classRule1697 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_classRule1702 = new BitSet(new long[]{0x0000080000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_classRule1708 = new BitSet(new long[]{0x0000080000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_classRule1713 = new BitSet(new long[]{0x0000000000000002L});
}
