// $ANTLR 3.5.1 C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g 2023-05-23 17:37:46

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
		"EXPONENT", "EXPORT", "EXTENDS", "FALSE", "FINALLY", "FLOAT", "FOR", "FUNCTION", 
		"GE", "GT", "HEX_DIGIT", "ID", "IF", "IMPLEMENTS", "IMPORT", "IN", "INC", 
		"INSTANCEOF", "INTEGER", "INTERFACE", "LB", "LBR", "LE", "LET", "LETTER", 
		"LP", "LT", "MOD", "NEQ", "NEW", "NOT", "NULL", "OCTAL_ESC", "OR", "OR_BIT", 
		"PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RB", "RBR", "RETURN", "RP", 
		"SC", "STAR", "STATIC", "STRING", "SUB", "SUPER", "SWITCH", "THIS", "THROW", 
		"TRUE", "TRY", "TYPEOF", "UNICODE_ESC", "VAR", "VOID", "WHILE", "WITH", 
		"WS", "XOR", "YIELD"
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
	public static final int EXPONENT=33;
	public static final int EXPORT=34;
	public static final int EXTENDS=35;
	public static final int FALSE=36;
	public static final int FINALLY=37;
	public static final int FLOAT=38;
	public static final int FOR=39;
	public static final int FUNCTION=40;
	public static final int GE=41;
	public static final int GT=42;
	public static final int HEX_DIGIT=43;
	public static final int ID=44;
	public static final int IF=45;
	public static final int IMPLEMENTS=46;
	public static final int IMPORT=47;
	public static final int IN=48;
	public static final int INC=49;
	public static final int INSTANCEOF=50;
	public static final int INTEGER=51;
	public static final int INTERFACE=52;
	public static final int LB=53;
	public static final int LBR=54;
	public static final int LE=55;
	public static final int LET=56;
	public static final int LETTER=57;
	public static final int LP=58;
	public static final int LT=59;
	public static final int MOD=60;
	public static final int NEQ=61;
	public static final int NEW=62;
	public static final int NOT=63;
	public static final int NULL=64;
	public static final int OCTAL_ESC=65;
	public static final int OR=66;
	public static final int OR_BIT=67;
	public static final int PACKAGE=68;
	public static final int PRIVATE=69;
	public static final int PROTECTED=70;
	public static final int PUBLIC=71;
	public static final int RB=72;
	public static final int RBR=73;
	public static final int RETURN=74;
	public static final int RP=75;
	public static final int SC=76;
	public static final int STAR=77;
	public static final int STATIC=78;
	public static final int STRING=79;
	public static final int SUB=80;
	public static final int SUPER=81;
	public static final int SWITCH=82;
	public static final int THIS=83;
	public static final int THROW=84;
	public static final int TRUE=85;
	public static final int TRY=86;
	public static final int TYPEOF=87;
	public static final int UNICODE_ESC=88;
	public static final int VAR=89;
	public static final int VOID=90;
	public static final int WHILE=91;
	public static final int WITH=92;
	public static final int WS=93;
	public static final int XOR=94;
	public static final int YIELD=95;

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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:46:1: parseJava : getRule ;
	public final void parseJava() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:48:2: ( getRule )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:49:3: getRule
			{
			pushFollow(FOLLOW_getRule_in_parseJava62);
			getRule();
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
	// $ANTLR end "parseJava"



	// $ANTLR start "getRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:51:1: getRule : DOCUMENT DOT get= ID LP i= STRING RP SC ;
	public final void getRule() throws RecognitionException {
		Token get=null;
		Token i=null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:52:2: ( DOCUMENT DOT get= ID LP i= STRING RP SC )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:53:3: DOCUMENT DOT get= ID LP i= STRING RP SC
			{
			match(input,DOCUMENT,FOLLOW_DOCUMENT_in_getRule74); 
			System.out.println("Ho riconosciuto DOCUMENT");
			match(input,DOT,FOLLOW_DOT_in_getRule78); 
			get=(Token)match(input,ID,FOLLOW_ID_in_getRule82); 
			match(input,LP,FOLLOW_LP_in_getRule84); 
			i=(Token)match(input,STRING,FOLLOW_STRING_in_getRule88); 
			match(input,RP,FOLLOW_RP_in_getRule90); 
			match(input,SC,FOLLOW_SC_in_getRule92); 
			h.translate(get, i);
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
	// $ANTLR end "getRule"



	// $ANTLR start "idDotIdRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:56:1: idDotIdRule : ID ( DOT ID )* ;
	public final void idDotIdRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:57:2: ( ID ( DOT ID )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:58:3: ID ( DOT ID )*
			{
			match(input,ID,FOLLOW_ID_in_idDotIdRule108); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:58:6: ( DOT ID )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==DOT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:58:7: DOT ID
					{
					match(input,DOT,FOLLOW_DOT_in_idDotIdRule111); 
					match(input,ID,FOLLOW_ID_in_idDotIdRule113); 
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
	// $ANTLR end "idDotIdRule"

	// Delegated rules



	public static final BitSet FOLLOW_getRule_in_parseJava62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOCUMENT_in_getRule74 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_DOT_in_getRule78 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_ID_in_getRule82 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_LP_in_getRule84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_STRING_in_getRule88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RP_in_getRule90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SC_in_getRule92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule108 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_DOT_in_idDotIdRule111 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule113 = new BitSet(new long[]{0x0000000008000002L});
}
