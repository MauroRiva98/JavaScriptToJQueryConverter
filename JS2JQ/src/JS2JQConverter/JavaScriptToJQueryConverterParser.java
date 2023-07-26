// $ANTLR 3.5.1 C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g 2023-07-26 12:09:46

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


	public JavaScriptToJQueryConverterParser(TokenRewriteStream input) {
		this(input, new RecognizerSharedState());
	}
	public JavaScriptToJQueryConverterParser(TokenRewriteStream input, RecognizerSharedState state) {
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:53:1: getRule : DOCUMENT DOT get= ID x= LP STRING RP ( SC )? ;
	public final JavaScriptToJQueryConverterParser.getRule_return getRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.getRule_return retval = new JavaScriptToJQueryConverterParser.getRule_return();
		retval.start = input.LT(1);

		Token get=null;
		Token x=null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:54:2: ( DOCUMENT DOT get= ID x= LP STRING RP ( SC )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:3: DOCUMENT DOT get= ID x= LP STRING RP ( SC )?
			{
			match(input,DOCUMENT,FOLLOW_DOCUMENT_in_getRule91); 
			System.out.println("Ho riconosciuto DOCUMENT");
			match(input,DOT,FOLLOW_DOT_in_getRule95); 
			get=(Token)match(input,ID,FOLLOW_ID_in_getRule99); 
			x=(Token)match(input,LP,FOLLOW_LP_in_getRule103); 
			match(input,STRING,FOLLOW_STRING_in_getRule105); 
			match(input,RP,FOLLOW_RP_in_getRule107); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:88: ( SC )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==SC) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:88: SC
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:58:1: idDotIdRule : ID ( DOT ID )* ;
	public final void idDotIdRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:59:2: ( ID ( DOT ID )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:60:3: ID ( DOT ID )*
			{
			match(input,ID,FOLLOW_ID_in_idDotIdRule126); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:60:6: ( DOT ID )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==DOT) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:60:7: DOT ID
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



	// $ANTLR start "factorTypologyRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:63:1: factorTypologyRule : ( STRING | INTEGER | FLOAT | TRUE | FALSE | idDotArrayRule ) ;
	public final void factorTypologyRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:2: ( ( STRING | INTEGER | FLOAT | TRUE | FALSE | idDotArrayRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:3: ( STRING | INTEGER | FLOAT | TRUE | FALSE | idDotArrayRule )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:3: ( STRING | INTEGER | FLOAT | TRUE | FALSE | idDotArrayRule )
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:4: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_factorTypologyRule148); 
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:13: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_factorTypologyRule152); 
					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:23: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_factorTypologyRule156); 
					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:31: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factorTypologyRule160); 
					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:38: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factorTypologyRule164); 
					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:46: idDotArrayRule
					{
					pushFollow(FOLLOW_idDotArrayRule_in_factorTypologyRule168);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:68:1: assignTypologyRule : ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule ) ;
	public final void assignTypologyRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:69:2: ( ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:3: ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:3: ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule )
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:4: objectRule
					{
					pushFollow(FOLLOW_objectRule_in_assignTypologyRule184);
					objectRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:17: arrayRule
					{
					pushFollow(FOLLOW_arrayRule_in_assignTypologyRule188);
					arrayRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:29: NULL
					{
					match(input,NULL,FOLLOW_NULL_in_assignTypologyRule192); 
					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:36: UNDEFINED
					{
					match(input,UNDEFINED,FOLLOW_UNDEFINED_in_assignTypologyRule196); 
					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:48: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_assignTypologyRule200);
					functionDefinitionRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:73: newRule
					{
					pushFollow(FOLLOW_newRule_in_assignTypologyRule204);
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
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ID) ) {
				alt7=1;
			}
			else if ( (LA7_0==THIS) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:75:4: idDotIdRule
					{
					pushFollow(FOLLOW_idDotIdRule_in_idDotArrayRuleOld219);
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
					match(input,THIS,FOLLOW_THIS_in_idDotArrayRuleOld224); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:75:24: ( DOT ID )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==DOT) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:75:25: DOT ID
							{
							match(input,DOT,FOLLOW_DOT_in_idDotArrayRuleOld227); 
							match(input,ID,FOLLOW_ID_in_idDotArrayRuleOld229); 
							}
							break;

						default :
							break loop6;
						}
					}

					}

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:3: ( ( LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB )+ ( DOT ID )* )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==LB) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:4: ( LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB )+ ( DOT ID )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:4: ( LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==LB) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:5: LB ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING ) RB
							{
							match(input,LB,FOLLOW_LB_in_idDotArrayRuleOld239); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:8: ( INTEGER | ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? ) | STRING )
							int alt12=3;
							switch ( input.LA(1) ) {
							case INTEGER:
								{
								alt12=1;
								}
								break;
							case ID:
							case THIS:
								{
								alt12=2;
								}
								break;
							case STRING:
								{
								alt12=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 12, 0, input);
								throw nvae;
							}
							switch (alt12) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:9: INTEGER
									{
									match(input,INTEGER,FOLLOW_INTEGER_in_idDotArrayRuleOld242); 
									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:19: ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? )
									{
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:19: ( idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )? )
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:20: idDotArrayRule ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )?
									{
									pushFollow(FOLLOW_idDotArrayRule_in_idDotArrayRuleOld247);
									idDotArrayRule();
									state._fsp--;

									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:35: ( LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP )?
									int alt11=2;
									int LA11_0 = input.LA(1);
									if ( (LA11_0==LP) ) {
										alt11=1;
									}
									switch (alt11) {
										case 1 :
											// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:36: LP ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* RP
											{
											match(input,LP,FOLLOW_LP_in_idDotArrayRuleOld250); 
											// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:39: ( assignTypologyRule | expressionRule )
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
													// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:40: assignTypologyRule
													{
													pushFollow(FOLLOW_assignTypologyRule_in_idDotArrayRuleOld253);
													assignTypologyRule();
													state._fsp--;

													}
													break;
												case 2 :
													// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:59: expressionRule
													{
													pushFollow(FOLLOW_expressionRule_in_idDotArrayRuleOld255);
													expressionRule();
													state._fsp--;

													}
													break;

											}

											// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:75: ( CM ( assignTypologyRule | expressionRule ) )*
											loop10:
											while (true) {
												int alt10=2;
												int LA10_0 = input.LA(1);
												if ( (LA10_0==CM) ) {
													alt10=1;
												}

												switch (alt10) {
												case 1 :
													// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:76: CM ( assignTypologyRule | expressionRule )
													{
													match(input,CM,FOLLOW_CM_in_idDotArrayRuleOld259); 
													// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:79: ( assignTypologyRule | expressionRule )
													int alt9=2;
													int LA9_0 = input.LA(1);
													if ( (LA9_0==FUNCTION||(LA9_0 >= LB && LA9_0 <= LBR)||LA9_0==NEW||LA9_0==NULL||LA9_0==UNDEFINED) ) {
														alt9=1;
													}
													else if ( (LA9_0==DEC||LA9_0==FALSE||LA9_0==FLOAT||LA9_0==ID||LA9_0==INC||LA9_0==INTEGER||LA9_0==LP||LA9_0==STRING||LA9_0==THIS||LA9_0==TRUE) ) {
														alt9=2;
													}

													else {
														NoViableAltException nvae =
															new NoViableAltException("", 9, 0, input);
														throw nvae;
													}

													switch (alt9) {
														case 1 :
															// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:80: assignTypologyRule
															{
															pushFollow(FOLLOW_assignTypologyRule_in_idDotArrayRuleOld262);
															assignTypologyRule();
															state._fsp--;

															}
															break;
														case 2 :
															// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:99: expressionRule
															{
															pushFollow(FOLLOW_expressionRule_in_idDotArrayRuleOld264);
															expressionRule();
															state._fsp--;

															}
															break;

													}

													}
													break;

												default :
													break loop10;
												}
											}

											match(input,RP,FOLLOW_RP_in_idDotArrayRuleOld269); 
											}
											break;

									}

									}

									}
									break;
								case 3 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:125: STRING
									{
									match(input,STRING,FOLLOW_STRING_in_idDotArrayRuleOld276); 
									}
									break;

							}

							match(input,RB,FOLLOW_RB_in_idDotArrayRuleOld279); 
							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:138: ( DOT ID )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==DOT) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:139: DOT ID
							{
							match(input,DOT,FOLLOW_DOT_in_idDotArrayRuleOld284); 
							match(input,ID,FOLLOW_ID_in_idDotArrayRuleOld286); 
							}
							break;

						default :
							break loop14;
						}
					}

					}
					break;

				default :
					break loop15;
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
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==THIS) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:82:4: THIS DOT
					{
					match(input,THIS,FOLLOW_THIS_in_idDotArrayRule310); 
					match(input,DOT,FOLLOW_DOT_in_idDotArrayRule312); 
					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:83:3: ( idDotIdRule ( LB expressionRule RB )* ( DOT )? ( LP ( parametersRule )? RP ( DOT )? )? )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==ID) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:83:4: idDotIdRule ( LB expressionRule RB )* ( DOT )? ( LP ( parametersRule )? RP ( DOT )? )?
					{
					pushFollow(FOLLOW_idDotIdRule_in_idDotArrayRule320);
					idDotIdRule();
					state._fsp--;

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:4: ( LB expressionRule RB )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==LB) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:5: LB expressionRule RB
							{
							match(input,LB,FOLLOW_LB_in_idDotArrayRule326); 
							pushFollow(FOLLOW_expressionRule_in_idDotArrayRule328);
							expressionRule();
							state._fsp--;

							match(input,RB,FOLLOW_RB_in_idDotArrayRule330); 
							}
							break;

						default :
							break loop17;
						}
					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:28: ( DOT )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==DOT) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:28: DOT
							{
							match(input,DOT,FOLLOW_DOT_in_idDotArrayRule334); 
							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:4: ( LP ( parametersRule )? RP ( DOT )? )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==LP) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:5: LP ( parametersRule )? RP ( DOT )?
							{
							match(input,LP,FOLLOW_LP_in_idDotArrayRule341); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:8: ( parametersRule )?
							int alt19=2;
							int LA19_0 = input.LA(1);
							if ( (LA19_0==DEC||LA19_0==FALSE||LA19_0==FLOAT||LA19_0==FUNCTION||LA19_0==ID||LA19_0==INC||LA19_0==INTEGER||(LA19_0 >= LB && LA19_0 <= LBR)||LA19_0==LP||LA19_0==NEW||LA19_0==NULL||LA19_0==STRING||LA19_0==THIS||LA19_0==TRUE||LA19_0==UNDEFINED) ) {
								alt19=1;
							}
							switch (alt19) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:8: parametersRule
									{
									pushFollow(FOLLOW_parametersRule_in_idDotArrayRule343);
									parametersRule();
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_idDotArrayRule346); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:27: ( DOT )?
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0==DOT) ) {
								alt20=1;
							}
							switch (alt20) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:27: DOT
									{
									match(input,DOT,FOLLOW_DOT_in_idDotArrayRule348); 
									}
									break;

							}

							}
							break;

					}

					}
					break;

				default :
					if ( cnt22 >= 1 ) break loop22;
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
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
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==FUNCTION||(LA23_0 >= LB && LA23_0 <= LBR)||LA23_0==NEW||LA23_0==NULL||LA23_0==UNDEFINED) ) {
				alt23=1;
			}
			else if ( (LA23_0==DEC||LA23_0==FALSE||LA23_0==FLOAT||LA23_0==ID||LA23_0==INC||LA23_0==INTEGER||LA23_0==LP||LA23_0==STRING||LA23_0==THIS||LA23_0==TRUE) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:4: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_parametersRule372);
					assignTypologyRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:25: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_parametersRule376);
					expressionRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:40: ( CM ( assignTypologyRule | expressionRule ) )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==CM) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:41: CM ( assignTypologyRule | expressionRule )
					{
					match(input,CM,FOLLOW_CM_in_parametersRule379); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:44: ( assignTypologyRule | expressionRule )
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==FUNCTION||(LA24_0 >= LB && LA24_0 <= LBR)||LA24_0==NEW||LA24_0==NULL||LA24_0==UNDEFINED) ) {
						alt24=1;
					}
					else if ( (LA24_0==DEC||LA24_0==FALSE||LA24_0==FLOAT||LA24_0==ID||LA24_0==INC||LA24_0==INTEGER||LA24_0==LP||LA24_0==STRING||LA24_0==THIS||LA24_0==TRUE) ) {
						alt24=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}

					switch (alt24) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:45: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_parametersRule382);
							assignTypologyRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:66: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_parametersRule386);
							expressionRule();
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop25;
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:1: expressionRule : termRule ( ( ADD | SUB | MOD ) termRule )* ;
	public final void expressionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:111:2: ( termRule ( ( ADD | SUB | MOD ) termRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:112:3: termRule ( ( ADD | SUB | MOD ) termRule )*
			{
			pushFollow(FOLLOW_termRule_in_expressionRule404);
			termRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:112:12: ( ( ADD | SUB | MOD ) termRule )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==ADD||LA26_0==MOD||LA26_0==SUB) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:112:13: ( ADD | SUB | MOD ) termRule
					{
					if ( input.LA(1)==ADD||input.LA(1)==MOD||input.LA(1)==SUB ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_termRule_in_expressionRule419);
					termRule();
					state._fsp--;

					}
					break;

				default :
					break loop26;
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:114:1: termRule : factorRule ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )* ;
	public final void termRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:115:2: ( factorRule ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:3: factorRule ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )*
			{
			pushFollow(FOLLOW_factorRule_in_termRule434);
			factorRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:14: ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==AND_BIT||LA27_0==DIV||LA27_0==EXP||LA27_0==LSHIFT||LA27_0==OR_BIT||LA27_0==RSHIFT||LA27_0==STAR||LA27_0==URSHIFT||LA27_0==XOR) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:15: ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule
					{
					if ( input.LA(1)==AND_BIT||input.LA(1)==DIV||input.LA(1)==EXP||input.LA(1)==LSHIFT||input.LA(1)==OR_BIT||input.LA(1)==RSHIFT||input.LA(1)==STAR||input.LA(1)==URSHIFT||input.LA(1)==XOR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factorRule_in_termRule473);
					factorRule();
					state._fsp--;

					}
					break;

				default :
					break loop27;
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:119:1: factorRule : ( ( INC | DEC )? factorTypologyRule ( INC | DEC )? | LP expressionRule RP );
	public final void factorRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:120:2: ( ( INC | DEC )? factorTypologyRule ( INC | DEC )? | LP expressionRule RP )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==DEC||LA30_0==FALSE||LA30_0==FLOAT||LA30_0==ID||LA30_0==INC||LA30_0==INTEGER||LA30_0==STRING||LA30_0==THIS||LA30_0==TRUE) ) {
				alt30=1;
			}
			else if ( (LA30_0==LP) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:121:3: ( INC | DEC )? factorTypologyRule ( INC | DEC )?
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:121:3: ( INC | DEC )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==DEC||LA28_0==INC) ) {
						alt28=1;
					}
					switch (alt28) {
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

					pushFollow(FOLLOW_factorTypologyRule_in_factorRule497);
					factorTypologyRule();
					state._fsp--;

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:121:33: ( INC | DEC )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==DEC||LA29_0==INC) ) {
						alt29=1;
					}
					switch (alt29) {
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:122:5: LP expressionRule RP
					{
					match(input,LP,FOLLOW_LP_in_factorRule510); 
					pushFollow(FOLLOW_expressionRule_in_factorRule512);
					expressionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_factorRule514); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:125:1: instructionRule : ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule ) ( SC )? ;
	public final void instructionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:126:2: ( ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule ) ( SC )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:127:3: ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule ) ( SC )?
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:127:3: ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule )
			int alt31=12;
			switch ( input.LA(1) ) {
			case BREAK:
				{
				alt31=1;
				}
				break;
			case CONTINUE:
				{
				alt31=2;
				}
				break;
			case TRY:
				{
				alt31=3;
				}
				break;
			case FUNCTION:
				{
				alt31=4;
				}
				break;
			case IF:
				{
				alt31=5;
				}
				break;
			case SWITCH:
				{
				alt31=6;
				}
				break;
			case FOR:
				{
				alt31=7;
				}
				break;
			case WHILE:
				{
				alt31=8;
				}
				break;
			case DO:
				{
				alt31=9;
				}
				break;
			case THROW:
				{
				alt31=10;
				}
				break;
			case TYPEOF:
				{
				alt31=11;
				}
				break;
			case CONST:
			case ID:
			case LET:
			case THIS:
			case VAR:
				{
				alt31=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:127:4: BREAK
					{
					match(input,BREAK,FOLLOW_BREAK_in_instructionRule528); 
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:5: CONTINUE
					{
					match(input,CONTINUE,FOLLOW_CONTINUE_in_instructionRule535); 
					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:129:5: tryCatchRule
					{
					pushFollow(FOLLOW_tryCatchRule_in_instructionRule542);
					tryCatchRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:130:5: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_instructionRule549);
					functionDefinitionRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:131:5: ifStatementRule
					{
					pushFollow(FOLLOW_ifStatementRule_in_instructionRule557);
					ifStatementRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:132:5: switchCaseRule
					{
					pushFollow(FOLLOW_switchCaseRule_in_instructionRule564);
					switchCaseRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:133:5: forRule
					{
					pushFollow(FOLLOW_forRule_in_instructionRule571);
					forRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:134:5: whileRule
					{
					pushFollow(FOLLOW_whileRule_in_instructionRule578);
					whileRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:135:5: doWhileRule
					{
					pushFollow(FOLLOW_doWhileRule_in_instructionRule585);
					doWhileRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:136:5: throwRule
					{
					pushFollow(FOLLOW_throwRule_in_instructionRule592);
					throwRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:137:5: typeOfRule
					{
					pushFollow(FOLLOW_typeOfRule_in_instructionRule599);
					typeOfRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:5: idStartingRule
					{
					pushFollow(FOLLOW_idStartingRule_in_instructionRule606);
					idStartingRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:20: ( SC )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==SC) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:20: SC
					{
					match(input,SC,FOLLOW_SC_in_instructionRule608); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:141:1: throwRule : THROW ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule ) ;
	public final void throwRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:142:2: ( THROW ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:143:3: THROW ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule )
			{
			match(input,THROW,FOLLOW_THROW_in_throwRule623); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:143:9: ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule )
			int alt33=6;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt33=1;
				}
				break;
			case TRUE:
				{
				alt33=2;
				}
				break;
			case FALSE:
				{
				alt33=3;
				}
				break;
			case INTEGER:
				{
				alt33=4;
				}
				break;
			case FLOAT:
				{
				alt33=5;
				}
				break;
			case ID:
			case THIS:
				{
				alt33=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:143:10: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_throwRule626); 
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:143:19: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_throwRule630); 
					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:143:26: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_throwRule634); 
					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:143:34: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_throwRule638); 
					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:143:44: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_throwRule642); 
					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:143:52: idDotArrayRule
					{
					pushFollow(FOLLOW_idDotArrayRule_in_throwRule646);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:146:1: typeOfRule : TYPEOF assignTypologyRule ;
	public final void typeOfRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:2: ( TYPEOF assignTypologyRule )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:148:3: TYPEOF assignTypologyRule
			{
			match(input,TYPEOF,FOLLOW_TYPEOF_in_typeOfRule662); 
			pushFollow(FOLLOW_assignTypologyRule_in_typeOfRule664);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:153:1: tryCatchRule : TRY blockRule CATCH LP ID RP blockRule ( FINALLY blockRule )? ;
	public final void tryCatchRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:2: ( TRY blockRule CATCH LP ID RP blockRule ( FINALLY blockRule )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:3: TRY blockRule CATCH LP ID RP blockRule ( FINALLY blockRule )?
			{
			match(input,TRY,FOLLOW_TRY_in_tryCatchRule681); 
			pushFollow(FOLLOW_blockRule_in_tryCatchRule683);
			blockRule();
			state._fsp--;

			match(input,CATCH,FOLLOW_CATCH_in_tryCatchRule688); 
			match(input,LP,FOLLOW_LP_in_tryCatchRule690); 
			match(input,ID,FOLLOW_ID_in_tryCatchRule692); 
			match(input,RP,FOLLOW_RP_in_tryCatchRule694); 
			pushFollow(FOLLOW_blockRule_in_tryCatchRule696);
			blockRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:157:3: ( FINALLY blockRule )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==FINALLY) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:157:4: FINALLY blockRule
					{
					match(input,FINALLY,FOLLOW_FINALLY_in_tryCatchRule702); 
					pushFollow(FOLLOW_blockRule_in_tryCatchRule704);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:160:1: returnRule : RETURN ( expressionRule | assignTypologyRule ) ( SC )? ;
	public final void returnRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:161:2: ( RETURN ( expressionRule | assignTypologyRule ) ( SC )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:3: RETURN ( expressionRule | assignTypologyRule ) ( SC )?
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnRule720); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:10: ( expressionRule | assignTypologyRule )
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:11: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_returnRule723);
					expressionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:26: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_returnRule725);
					assignTypologyRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:46: ( SC )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==SC) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:46: SC
					{
					match(input,SC,FOLLOW_SC_in_returnRule728); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:165:1: functionDeclarationRule : func= FUNCTION (name= ID )? LP ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )? RP ;
	public final void functionDeclarationRule() throws RecognitionException {
		Token func=null;
		Token name=null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:166:2: (func= FUNCTION (name= ID )? LP ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )? RP )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:3: func= FUNCTION (name= ID )? LP ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )? RP
			{
			func=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclarationRule746); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:23: (name= ID )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==ID) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:23: name= ID
					{
					name=(Token)match(input,ID,FOLLOW_ID_in_functionDeclarationRule752); 
					}
					break;

			}

			h.checkFunctionName(name, func);
			match(input,LP,FOLLOW_LP_in_functionDeclarationRule757); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:69: ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==DEC||LA41_0==FALSE||LA41_0==FLOAT||LA41_0==FUNCTION||LA41_0==ID||LA41_0==INC||LA41_0==INTEGER||(LA41_0 >= LB && LA41_0 <= LBR)||LA41_0==LP||LA41_0==NEW||LA41_0==NULL||LA41_0==STRING||LA41_0==THIS||LA41_0==TRUE||LA41_0==UNDEFINED) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:70: ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* )
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:70: ( assignTypologyRule | expressionRule )
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==FUNCTION||(LA38_0 >= LB && LA38_0 <= LBR)||LA38_0==NEW||LA38_0==NULL||LA38_0==UNDEFINED) ) {
						alt38=1;
					}
					else if ( (LA38_0==DEC||LA38_0==FALSE||LA38_0==FLOAT||LA38_0==ID||LA38_0==INC||LA38_0==INTEGER||LA38_0==LP||LA38_0==STRING||LA38_0==THIS||LA38_0==TRUE) ) {
						alt38=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 38, 0, input);
						throw nvae;
					}

					switch (alt38) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:71: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_functionDeclarationRule761);
							assignTypologyRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:90: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_functionDeclarationRule763);
							expressionRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:106: ( ( CM ( assignTypologyRule | expressionRule ) )* )
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:107: ( CM ( assignTypologyRule | expressionRule ) )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:107: ( CM ( assignTypologyRule | expressionRule ) )*
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0==CM) ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:108: CM ( assignTypologyRule | expressionRule )
							{
							match(input,CM,FOLLOW_CM_in_functionDeclarationRule768); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:111: ( assignTypologyRule | expressionRule )
							int alt39=2;
							int LA39_0 = input.LA(1);
							if ( (LA39_0==FUNCTION||(LA39_0 >= LB && LA39_0 <= LBR)||LA39_0==NEW||LA39_0==NULL||LA39_0==UNDEFINED) ) {
								alt39=1;
							}
							else if ( (LA39_0==DEC||LA39_0==FALSE||LA39_0==FLOAT||LA39_0==ID||LA39_0==INC||LA39_0==INTEGER||LA39_0==LP||LA39_0==STRING||LA39_0==THIS||LA39_0==TRUE) ) {
								alt39=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 39, 0, input);
								throw nvae;
							}

							switch (alt39) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:112: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_functionDeclarationRule771);
									assignTypologyRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:131: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_functionDeclarationRule773);
									expressionRule();
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

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionDeclarationRule781); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:170:1: functionDefinitionRule : functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR ;
	public final void functionDefinitionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:171:2: ( functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:172:3: functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR
			{
			pushFollow(FOLLOW_functionDeclarationRule_in_functionDefinitionRule796);
			functionDeclarationRule();
			state._fsp--;

			match(input,LBR,FOLLOW_LBR_in_functionDefinitionRule800); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:174:4: ( instructionRule )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==BREAK||(LA42_0 >= CONST && LA42_0 <= CONTINUE)||LA42_0==DO||(LA42_0 >= FOR && LA42_0 <= FUNCTION)||(LA42_0 >= ID && LA42_0 <= IF)||LA42_0==LET||LA42_0==SWITCH||(LA42_0 >= THIS && LA42_0 <= THROW)||(LA42_0 >= TRY && LA42_0 <= TYPEOF)||LA42_0==VAR||LA42_0==WHILE) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:174:4: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_functionDefinitionRule805);
					instructionRule();
					state._fsp--;

					}
					break;

				default :
					break loop42;
				}
			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:175:4: ( returnRule )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==RETURN) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:175:4: returnRule
					{
					pushFollow(FOLLOW_returnRule_in_functionDefinitionRule811);
					returnRule();
					state._fsp--;

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_functionDefinitionRule816); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:185:1: arrayRule : LB ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )? RB ;
	public final void arrayRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:186:2: ( LB ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )? RB )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:187:3: LB ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )? RB
			{
			match(input,LB,FOLLOW_LB_in_arrayRule832); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:4: ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==DEC||LA47_0==FALSE||LA47_0==FLOAT||LA47_0==FUNCTION||LA47_0==ID||LA47_0==INC||LA47_0==INTEGER||(LA47_0 >= LB && LA47_0 <= LBR)||LA47_0==LP||LA47_0==NEW||LA47_0==NULL||LA47_0==STRING||LA47_0==THIS||LA47_0==TRUE||LA47_0==UNDEFINED) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:189:4: ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:189:4: ( expressionRule | assignTypologyRule )
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
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:189:5: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_arrayRule843);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:189:20: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_arrayRule845);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:190:4: ( CM ( expressionRule | assignTypologyRule )? )*
					loop46:
					while (true) {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==CM) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:190:5: CM ( expressionRule | assignTypologyRule )?
							{
							match(input,CM,FOLLOW_CM_in_arrayRule852); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:190:8: ( expressionRule | assignTypologyRule )?
							int alt45=3;
							int LA45_0 = input.LA(1);
							if ( (LA45_0==DEC||LA45_0==FALSE||LA45_0==FLOAT||LA45_0==ID||LA45_0==INC||LA45_0==INTEGER||LA45_0==LP||LA45_0==STRING||LA45_0==THIS||LA45_0==TRUE) ) {
								alt45=1;
							}
							else if ( (LA45_0==FUNCTION||(LA45_0 >= LB && LA45_0 <= LBR)||LA45_0==NEW||LA45_0==NULL||LA45_0==UNDEFINED) ) {
								alt45=2;
							}
							switch (alt45) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:190:9: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_arrayRule855);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:190:24: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_arrayRule857);
									assignTypologyRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop46;
						}
					}

					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_arrayRule871); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:195:1: objectRule : LBR ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )? RBR ;
	public final void objectRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:196:2: ( LBR ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )? RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:197:3: LBR ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )? RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectRule886); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:198:4: ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==ID||LA51_0==STRING) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:199:4: ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )*
					{
					if ( input.LA(1)==ID||input.LA(1)==STRING ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,CL,FOLLOW_CL_in_objectRule908); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:201:4: ( expressionRule | assignTypologyRule )
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
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:201:5: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_objectRule915);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:201:20: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_objectRule917);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:202:4: ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )*
					loop50:
					while (true) {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==CM) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:203:4: CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule )
							{
							match(input,CM,FOLLOW_CM_in_objectRule928); 
							if ( input.LA(1)==ID||input.LA(1)==STRING ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,CL,FOLLOW_CL_in_objectRule945); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:206:4: ( expressionRule | assignTypologyRule )
							int alt49=2;
							int LA49_0 = input.LA(1);
							if ( (LA49_0==DEC||LA49_0==FALSE||LA49_0==FLOAT||LA49_0==ID||LA49_0==INC||LA49_0==INTEGER||LA49_0==LP||LA49_0==STRING||LA49_0==THIS||LA49_0==TRUE) ) {
								alt49=1;
							}
							else if ( (LA49_0==FUNCTION||(LA49_0 >= LB && LA49_0 <= LBR)||LA49_0==NEW||LA49_0==NULL||LA49_0==UNDEFINED) ) {
								alt49=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 49, 0, input);
								throw nvae;
							}

							switch (alt49) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:206:5: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_objectRule952);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:206:20: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_objectRule954);
									assignTypologyRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop50;
						}
					}

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_objectRule971); 
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



	// $ANTLR start "variableDefinitionRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:1: variableDefinitionRule : ( VAR | LET | CONST )? idDotArrayRule ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? ;
	public final void variableDefinitionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:215:2: ( ( VAR | LET | CONST )? idDotArrayRule ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:216:3: ( VAR | LET | CONST )? idDotArrayRule ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:216:3: ( VAR | LET | CONST )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==CONST||LA52_0==LET||LA52_0==VAR) ) {
				alt52=1;
			}
			switch (alt52) {
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

			pushFollow(FOLLOW_idDotArrayRule_in_variableDefinitionRule1007);
			idDotArrayRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:218:3: ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==ASSIGN||LA54_0==DIVEQ||LA54_0==EXPEQ||LA54_0==MINUSEQ||LA54_0==MODEQ||LA54_0==PLUSEQ||LA54_0==STAREQ) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:218:4: ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule )
					{
					if ( input.LA(1)==ASSIGN||input.LA(1)==DIVEQ||input.LA(1)==EXPEQ||input.LA(1)==MINUSEQ||input.LA(1)==MODEQ||input.LA(1)==PLUSEQ||input.LA(1)==STAREQ ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:218:53: ( expressionRule | assignTypologyRule )
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
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:218:54: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_variableDefinitionRule1029);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:218:69: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_variableDefinitionRule1031);
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



	// $ANTLR start "idStartingRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:222:1: idStartingRule : ( VAR | LET | CONST )? idDotArrayRule ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID ) ;
	public final void idStartingRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:223:2: ( ( VAR | LET | CONST )? idDotArrayRule ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:224:3: ( VAR | LET | CONST )? idDotArrayRule ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:224:3: ( VAR | LET | CONST )?
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

			pushFollow(FOLLOW_idDotArrayRule_in_idStartingRule1066);
			idDotArrayRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:18: ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID )
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==EOF||LA58_0==ASSIGN||(LA58_0 >= BREAK && LA58_0 <= CASE)||LA58_0==CLASS||(LA58_0 >= CONST && LA58_0 <= CONTINUE)||LA58_0==DEFAULT||(LA58_0 >= DIVEQ && LA58_0 <= DO)||LA58_0==ELSE||LA58_0==EXPEQ||(LA58_0 >= FOR && LA58_0 <= FUNCTION)||(LA58_0 >= ID && LA58_0 <= IF)||LA58_0==LBR||LA58_0==LET||LA58_0==MINUSEQ||LA58_0==MODEQ||LA58_0==PLUSEQ||(LA58_0 >= RBR && LA58_0 <= RETURN)||LA58_0==SC||LA58_0==STAREQ||LA58_0==SWITCH||(LA58_0 >= THIS && LA58_0 <= THROW)||(LA58_0 >= TRY && LA58_0 <= TYPEOF)||LA58_0==VAR||LA58_0==WHILE) ) {
				alt58=1;
			}
			else if ( (LA58_0==INSTANCEOF) ) {
				alt58=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:20: ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:20: ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==ASSIGN||LA57_0==DIVEQ||LA57_0==EXPEQ||LA57_0==MINUSEQ||LA57_0==MODEQ||LA57_0==PLUSEQ||LA57_0==STAREQ) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:21: ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule )
							{
							if ( input.LA(1)==ASSIGN||input.LA(1)==DIVEQ||input.LA(1)==EXPEQ||input.LA(1)==MINUSEQ||input.LA(1)==MODEQ||input.LA(1)==PLUSEQ||input.LA(1)==STAREQ ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:70: ( expressionRule | assignTypologyRule )
							int alt56=2;
							int LA56_0 = input.LA(1);
							if ( (LA56_0==DEC||LA56_0==FALSE||LA56_0==FLOAT||LA56_0==ID||LA56_0==INC||LA56_0==INTEGER||LA56_0==LP||LA56_0==STRING||LA56_0==THIS||LA56_0==TRUE) ) {
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
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:71: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_idStartingRule1088);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:86: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_idStartingRule1090);
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:110: INSTANCEOF ID
					{
					match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_idStartingRule1097); 
					match(input,ID,FOLLOW_ID_in_idStartingRule1099); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:229:1: newRule : NEW ID LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP ;
	public final void newRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:230:2: ( NEW ID LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:3: NEW ID LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP
			{
			match(input,NEW,FOLLOW_NEW_in_newRule1115); 
			match(input,ID,FOLLOW_ID_in_newRule1117); 
			match(input,LP,FOLLOW_LP_in_newRule1119); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:13: ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==DEC||LA62_0==FALSE||LA62_0==FLOAT||LA62_0==FUNCTION||LA62_0==ID||LA62_0==INC||LA62_0==INTEGER||(LA62_0 >= LB && LA62_0 <= LBR)||LA62_0==LP||LA62_0==NEW||LA62_0==NULL||LA62_0==STRING||LA62_0==THIS||LA62_0==TRUE||LA62_0==UNDEFINED) ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:14: ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:14: ( expressionRule | assignTypologyRule )
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==DEC||LA59_0==FALSE||LA59_0==FLOAT||LA59_0==ID||LA59_0==INC||LA59_0==INTEGER||LA59_0==LP||LA59_0==STRING||LA59_0==THIS||LA59_0==TRUE) ) {
						alt59=1;
					}
					else if ( (LA59_0==FUNCTION||(LA59_0 >= LB && LA59_0 <= LBR)||LA59_0==NEW||LA59_0==NULL||LA59_0==UNDEFINED) ) {
						alt59=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 59, 0, input);
						throw nvae;
					}

					switch (alt59) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:15: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_newRule1123);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:30: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_newRule1125);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:50: ( CM ( expressionRule | assignTypologyRule ) )*
					loop61:
					while (true) {
						int alt61=2;
						int LA61_0 = input.LA(1);
						if ( (LA61_0==CM) ) {
							alt61=1;
						}

						switch (alt61) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:51: CM ( expressionRule | assignTypologyRule )
							{
							match(input,CM,FOLLOW_CM_in_newRule1129); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:54: ( expressionRule | assignTypologyRule )
							int alt60=2;
							int LA60_0 = input.LA(1);
							if ( (LA60_0==DEC||LA60_0==FALSE||LA60_0==FLOAT||LA60_0==ID||LA60_0==INC||LA60_0==INTEGER||LA60_0==LP||LA60_0==STRING||LA60_0==THIS||LA60_0==TRUE) ) {
								alt60=1;
							}
							else if ( (LA60_0==FUNCTION||(LA60_0 >= LB && LA60_0 <= LBR)||LA60_0==NEW||LA60_0==NULL||LA60_0==UNDEFINED) ) {
								alt60=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 60, 0, input);
								throw nvae;
							}

							switch (alt60) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:55: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_newRule1132);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:70: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_newRule1134);
									assignTypologyRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop61;
						}
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_newRule1141); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:234:1: arithmeticOperatorsRule : ( ADD | SUB | STAR | DIV | MOD | INC | DEC | EXP ) ;
	public final void arithmeticOperatorsRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:235:2: ( ( ADD | SUB | STAR | DIV | MOD | INC | DEC | EXP ) )
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:246:1: comparatorRule : ( EQ | NEQ | LT | LE | GT | GE | TEQ | NTEQ ) ;
	public final void comparatorRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:247:2: ( ( EQ | NEQ | LT | LE | GT | GE | TEQ | NTEQ ) )
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:1: conditionRule : ( NOT )? expressionRule ( comparatorRule ( NOT )? expressionRule )? ( ( AND | OR ) conditionRule )* ;
	public final void conditionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:252:2: ( ( NOT )? expressionRule ( comparatorRule ( NOT )? expressionRule )? ( ( AND | OR ) conditionRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:253:3: ( NOT )? expressionRule ( comparatorRule ( NOT )? expressionRule )? ( ( AND | OR ) conditionRule )*
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:253:3: ( NOT )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==NOT) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:253:3: NOT
					{
					match(input,NOT,FOLLOW_NOT_in_conditionRule1250); 
					}
					break;

			}

			pushFollow(FOLLOW_expressionRule_in_conditionRule1253);
			expressionRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:253:23: ( comparatorRule ( NOT )? expressionRule )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==EQ||(LA65_0 >= GE && LA65_0 <= GT)||LA65_0==LE||LA65_0==LT||LA65_0==NEQ||LA65_0==NTEQ||LA65_0==TEQ) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:253:24: comparatorRule ( NOT )? expressionRule
					{
					pushFollow(FOLLOW_comparatorRule_in_conditionRule1256);
					comparatorRule();
					state._fsp--;

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:253:39: ( NOT )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==NOT) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:253:39: NOT
							{
							match(input,NOT,FOLLOW_NOT_in_conditionRule1258); 
							}
							break;

					}

					pushFollow(FOLLOW_expressionRule_in_conditionRule1261);
					expressionRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:254:3: ( ( AND | OR ) conditionRule )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==AND||LA66_0==OR) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:254:4: ( AND | OR ) conditionRule
					{
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_conditionRule_in_conditionRule1274);
					conditionRule();
					state._fsp--;

					}
					break;

				default :
					break loop66;
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:257:1: blockRule : LBR ( instructionRule | blockRule )* RBR ;
	public final void blockRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:258:2: ( LBR ( instructionRule | blockRule )* RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:259:3: LBR ( instructionRule | blockRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_blockRule1290); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:259:7: ( instructionRule | blockRule )*
			loop67:
			while (true) {
				int alt67=3;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==BREAK||(LA67_0 >= CONST && LA67_0 <= CONTINUE)||LA67_0==DO||(LA67_0 >= FOR && LA67_0 <= FUNCTION)||(LA67_0 >= ID && LA67_0 <= IF)||LA67_0==LET||LA67_0==SWITCH||(LA67_0 >= THIS && LA67_0 <= THROW)||(LA67_0 >= TRY && LA67_0 <= TYPEOF)||LA67_0==VAR||LA67_0==WHILE) ) {
					alt67=1;
				}
				else if ( (LA67_0==LBR) ) {
					alt67=2;
				}

				switch (alt67) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:259:8: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_blockRule1293);
					instructionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:259:24: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_blockRule1295);
					blockRule();
					state._fsp--;

					}
					break;

				default :
					break loop67;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_blockRule1299); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:262:1: ifStatementRule : IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )* ;
	public final JavaScriptToJQueryConverterParser.ifStatementRule_return ifStatementRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.ifStatementRule_return retval = new JavaScriptToJQueryConverterParser.ifStatementRule_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:263:2: ( IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:264:3: IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )*
			{
			match(input,IF,FOLLOW_IF_in_ifStatementRule1314); 
			match(input,LP,FOLLOW_LP_in_ifStatementRule1316); 
			pushFollow(FOLLOW_conditionRule_in_ifStatementRule1318);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_ifStatementRule1320); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:265:4: ( blockRule | instructionRule )
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==LBR) ) {
				alt68=1;
			}
			else if ( (LA68_0==BREAK||(LA68_0 >= CONST && LA68_0 <= CONTINUE)||LA68_0==DO||(LA68_0 >= FOR && LA68_0 <= FUNCTION)||(LA68_0 >= ID && LA68_0 <= IF)||LA68_0==LET||LA68_0==SWITCH||(LA68_0 >= THIS && LA68_0 <= THROW)||(LA68_0 >= TRY && LA68_0 <= TYPEOF)||LA68_0==VAR||LA68_0==WHILE) ) {
				alt68=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}

			switch (alt68) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:265:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_ifStatementRule1327);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:265:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_ifStatementRule1331);
					instructionRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:266:3: ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==ELSE) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:266:4: ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule )
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStatementRule1337); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:266:9: ( IF LP conditionRule RP )?
					int alt69=2;
					int LA69_0 = input.LA(1);
					if ( (LA69_0==IF) ) {
						alt69=1;
					}
					switch (alt69) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:266:10: IF LP conditionRule RP
							{
							match(input,IF,FOLLOW_IF_in_ifStatementRule1340); 
							match(input,LP,FOLLOW_LP_in_ifStatementRule1342); 
							pushFollow(FOLLOW_conditionRule_in_ifStatementRule1344);
							conditionRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_ifStatementRule1346); 
							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:266:35: ( blockRule | instructionRule )
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0==LBR) ) {
						alt70=1;
					}
					else if ( (LA70_0==BREAK||(LA70_0 >= CONST && LA70_0 <= CONTINUE)||LA70_0==DO||(LA70_0 >= FOR && LA70_0 <= FUNCTION)||(LA70_0 >= ID && LA70_0 <= IF)||LA70_0==LET||LA70_0==SWITCH||(LA70_0 >= THIS && LA70_0 <= THROW)||(LA70_0 >= TRY && LA70_0 <= TYPEOF)||LA70_0==VAR||LA70_0==WHILE) ) {
						alt70=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 70, 0, input);
						throw nvae;
					}

					switch (alt70) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:266:36: blockRule
							{
							pushFollow(FOLLOW_blockRule_in_ifStatementRule1351);
							blockRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:266:48: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_ifStatementRule1355);
							instructionRule();
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop71;
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



	// $ANTLR start "switchCaseRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:269:1: switchCaseRule : SWITCH LP ( expressionRule | assignTypologyRule ) RP LBR ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )+ ( DEFAULT CL ( instructionRule )* )? RBR ;
	public final void switchCaseRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:270:2: ( SWITCH LP ( expressionRule | assignTypologyRule ) RP LBR ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )+ ( DEFAULT CL ( instructionRule )* )? RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:271:3: SWITCH LP ( expressionRule | assignTypologyRule ) RP LBR ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )+ ( DEFAULT CL ( instructionRule )* )? RBR
			{
			match(input,SWITCH,FOLLOW_SWITCH_in_switchCaseRule1375); 
			match(input,LP,FOLLOW_LP_in_switchCaseRule1377); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:271:13: ( expressionRule | assignTypologyRule )
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==DEC||LA72_0==FALSE||LA72_0==FLOAT||LA72_0==ID||LA72_0==INC||LA72_0==INTEGER||LA72_0==LP||LA72_0==STRING||LA72_0==THIS||LA72_0==TRUE) ) {
				alt72=1;
			}
			else if ( (LA72_0==FUNCTION||(LA72_0 >= LB && LA72_0 <= LBR)||LA72_0==NEW||LA72_0==NULL||LA72_0==UNDEFINED) ) {
				alt72=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}

			switch (alt72) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:271:14: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_switchCaseRule1380);
					expressionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:271:29: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_switchCaseRule1382);
					assignTypologyRule();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_switchCaseRule1385); 
			match(input,LBR,FOLLOW_LBR_in_switchCaseRule1389); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:273:4: ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )+
			int cnt75=0;
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==CASE) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:273:5: CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )*
					{
					match(input,CASE,FOLLOW_CASE_in_switchCaseRule1395); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:273:10: ( expressionRule | assignTypologyRule )
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==DEC||LA73_0==FALSE||LA73_0==FLOAT||LA73_0==ID||LA73_0==INC||LA73_0==INTEGER||LA73_0==LP||LA73_0==STRING||LA73_0==THIS||LA73_0==TRUE) ) {
						alt73=1;
					}
					else if ( (LA73_0==FUNCTION||(LA73_0 >= LB && LA73_0 <= LBR)||LA73_0==NEW||LA73_0==NULL||LA73_0==UNDEFINED) ) {
						alt73=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 73, 0, input);
						throw nvae;
					}

					switch (alt73) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:273:11: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_switchCaseRule1398);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:273:26: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_switchCaseRule1400);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					match(input,CL,FOLLOW_CL_in_switchCaseRule1403); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:274:5: ( instructionRule )*
					loop74:
					while (true) {
						int alt74=2;
						int LA74_0 = input.LA(1);
						if ( (LA74_0==BREAK||(LA74_0 >= CONST && LA74_0 <= CONTINUE)||LA74_0==DO||(LA74_0 >= FOR && LA74_0 <= FUNCTION)||(LA74_0 >= ID && LA74_0 <= IF)||LA74_0==LET||LA74_0==SWITCH||(LA74_0 >= THIS && LA74_0 <= THROW)||(LA74_0 >= TRY && LA74_0 <= TYPEOF)||LA74_0==VAR||LA74_0==WHILE) ) {
							alt74=1;
						}

						switch (alt74) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:274:5: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_switchCaseRule1409);
							instructionRule();
							state._fsp--;

							}
							break;

						default :
							break loop74;
						}
					}

					}
					break;

				default :
					if ( cnt75 >= 1 ) break loop75;
					EarlyExitException eee = new EarlyExitException(75, input);
					throw eee;
				}
				cnt75++;
			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:276:4: ( DEFAULT CL ( instructionRule )* )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==DEFAULT) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:276:5: DEFAULT CL ( instructionRule )*
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_switchCaseRule1422); 
					match(input,CL,FOLLOW_CL_in_switchCaseRule1424); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:277:5: ( instructionRule )*
					loop76:
					while (true) {
						int alt76=2;
						int LA76_0 = input.LA(1);
						if ( (LA76_0==BREAK||(LA76_0 >= CONST && LA76_0 <= CONTINUE)||LA76_0==DO||(LA76_0 >= FOR && LA76_0 <= FUNCTION)||(LA76_0 >= ID && LA76_0 <= IF)||LA76_0==LET||LA76_0==SWITCH||(LA76_0 >= THIS && LA76_0 <= THROW)||(LA76_0 >= TRY && LA76_0 <= TYPEOF)||LA76_0==VAR||LA76_0==WHILE) ) {
							alt76=1;
						}

						switch (alt76) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:277:5: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_switchCaseRule1430);
							instructionRule();
							state._fsp--;

							}
							break;

						default :
							break loop76;
						}
					}

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_switchCaseRule1441); 
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


	public static class forRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "forRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:283:1: forRule : FOR LP ( forInitVarRule )? SC ( conditionRule )? SC ( stepRule )? RP ( blockRule | instructionRule ) ;
	public final JavaScriptToJQueryConverterParser.forRule_return forRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.forRule_return retval = new JavaScriptToJQueryConverterParser.forRule_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:285:2: ( FOR LP ( forInitVarRule )? SC ( conditionRule )? SC ( stepRule )? RP ( blockRule | instructionRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:286:3: FOR LP ( forInitVarRule )? SC ( conditionRule )? SC ( stepRule )? RP ( blockRule | instructionRule )
			{
			match(input,FOR,FOLLOW_FOR_in_forRule1464); 
			match(input,LP,FOLLOW_LP_in_forRule1466); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:286:10: ( forInitVarRule )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==ID||LA78_0==LET||LA78_0==THIS||LA78_0==VAR) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:286:10: forInitVarRule
					{
					pushFollow(FOLLOW_forInitVarRule_in_forRule1468);
					forInitVarRule();
					state._fsp--;

					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_forRule1471); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:286:29: ( conditionRule )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==DEC||LA79_0==FALSE||LA79_0==FLOAT||LA79_0==ID||LA79_0==INC||LA79_0==INTEGER||LA79_0==LP||LA79_0==NOT||LA79_0==STRING||LA79_0==THIS||LA79_0==TRUE) ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:286:29: conditionRule
					{
					pushFollow(FOLLOW_conditionRule_in_forRule1473);
					conditionRule();
					state._fsp--;

					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_forRule1476); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:286:47: ( stepRule )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==DEC||LA80_0==ID||LA80_0==INC) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:286:47: stepRule
					{
					pushFollow(FOLLOW_stepRule_in_forRule1478);
					stepRule();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_forRule1481); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:287:4: ( blockRule | instructionRule )
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:287:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_forRule1487);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:287:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_forRule1491);
					instructionRule();
					state._fsp--;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			h.prova((retval.start));
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
	// $ANTLR end "forRule"



	// $ANTLR start "forInitVarRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:291:1: forInitVarRule : ( VAR | LET )? idDotArrayRule ASSIGN ( expressionRule | assignTypologyRule ) ;
	public final void forInitVarRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:292:2: ( ( VAR | LET )? idDotArrayRule ASSIGN ( expressionRule | assignTypologyRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:293:3: ( VAR | LET )? idDotArrayRule ASSIGN ( expressionRule | assignTypologyRule )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:293:3: ( VAR | LET )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==LET||LA82_0==VAR) ) {
				alt82=1;
			}
			switch (alt82) {
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

			pushFollow(FOLLOW_idDotArrayRule_in_forInitVarRule1516);
			idDotArrayRule();
			state._fsp--;

			match(input,ASSIGN,FOLLOW_ASSIGN_in_forInitVarRule1518); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:293:38: ( expressionRule | assignTypologyRule )
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==DEC||LA83_0==FALSE||LA83_0==FLOAT||LA83_0==ID||LA83_0==INC||LA83_0==INTEGER||LA83_0==LP||LA83_0==STRING||LA83_0==THIS||LA83_0==TRUE) ) {
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:293:39: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_forInitVarRule1521);
					expressionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:293:54: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_forInitVarRule1523);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:296:1: stepRule : (o1= incDecRule )? i= ID (o2= incDecRule )? ;
	public final void stepRule() throws RecognitionException {
		Token i=null;
		Token o1 =null;
		Token o2 =null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:297:2: ( (o1= incDecRule )? i= ID (o2= incDecRule )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:298:3: (o1= incDecRule )? i= ID (o2= incDecRule )?
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:298:3: (o1= incDecRule )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==DEC||LA84_0==INC) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:298:4: o1= incDecRule
					{
					pushFollow(FOLLOW_incDecRule_in_stepRule1543);
					o1=incDecRule();
					state._fsp--;

					}
					break;

			}

			i=(Token)match(input,ID,FOLLOW_ID_in_stepRule1552); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:300:3: (o2= incDecRule )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==DEC||LA85_0==INC) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:300:4: o2= incDecRule
					{
					pushFollow(FOLLOW_incDecRule_in_stepRule1560);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:303:1: incDecRule returns [Token tk] : (o1= DEC |o2= INC );
	public final Token incDecRule() throws RecognitionException {
		Token tk = null;


		Token o1=null;
		Token o2=null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:304:2: (o1= DEC |o2= INC )
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==DEC) ) {
				alt86=1;
			}
			else if ( (LA86_0==INC) ) {
				alt86=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}

			switch (alt86) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:305:3: o1= DEC
					{
					o1=(Token)match(input,DEC,FOLLOW_DEC_in_incDecRule1582); 
					tk = o1;
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:306:4: o2= INC
					{
					o2=(Token)match(input,INC,FOLLOW_INC_in_incDecRule1593); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:309:1: whileRule : WHILE LP conditionRule RP ( blockRule | instructionRule ) ;
	public final void whileRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:310:2: ( WHILE LP conditionRule RP ( blockRule | instructionRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:311:3: WHILE LP conditionRule RP ( blockRule | instructionRule )
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileRule1610); 
			match(input,LP,FOLLOW_LP_in_whileRule1612); 
			pushFollow(FOLLOW_conditionRule_in_whileRule1614);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_whileRule1616); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:312:4: ( blockRule | instructionRule )
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==LBR) ) {
				alt87=1;
			}
			else if ( (LA87_0==BREAK||(LA87_0 >= CONST && LA87_0 <= CONTINUE)||LA87_0==DO||(LA87_0 >= FOR && LA87_0 <= FUNCTION)||(LA87_0 >= ID && LA87_0 <= IF)||LA87_0==LET||LA87_0==SWITCH||(LA87_0 >= THIS && LA87_0 <= THROW)||(LA87_0 >= TRY && LA87_0 <= TYPEOF)||LA87_0==VAR||LA87_0==WHILE) ) {
				alt87=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}

			switch (alt87) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:312:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_whileRule1622);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:312:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_whileRule1626);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:315:1: doWhileRule : DO ( blockRule | instructionRule ) WHILE LP conditionRule RP ( SC )? ;
	public final void doWhileRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:316:2: ( DO ( blockRule | instructionRule ) WHILE LP conditionRule RP ( SC )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:317:3: DO ( blockRule | instructionRule ) WHILE LP conditionRule RP ( SC )?
			{
			match(input,DO,FOLLOW_DO_in_doWhileRule1640); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:318:4: ( blockRule | instructionRule )
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==LBR) ) {
				alt88=1;
			}
			else if ( (LA88_0==BREAK||(LA88_0 >= CONST && LA88_0 <= CONTINUE)||LA88_0==DO||(LA88_0 >= FOR && LA88_0 <= FUNCTION)||(LA88_0 >= ID && LA88_0 <= IF)||LA88_0==LET||LA88_0==SWITCH||(LA88_0 >= THIS && LA88_0 <= THROW)||(LA88_0 >= TRY && LA88_0 <= TYPEOF)||LA88_0==VAR||LA88_0==WHILE) ) {
				alt88=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}

			switch (alt88) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:318:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_doWhileRule1646);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:318:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_doWhileRule1650);
					instructionRule();
					state._fsp--;

					}
					break;

			}

			match(input,WHILE,FOLLOW_WHILE_in_doWhileRule1655); 
			match(input,LP,FOLLOW_LP_in_doWhileRule1657); 
			pushFollow(FOLLOW_conditionRule_in_doWhileRule1659);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_doWhileRule1661); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:319:29: ( SC )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==SC) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:319:29: SC
					{
					match(input,SC,FOLLOW_SC_in_doWhileRule1663); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:322:1: classRule : CLASS ID LBR ( functionDefinitionRule )* RBR ;
	public final void classRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:323:2: ( CLASS ID LBR ( functionDefinitionRule )* RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:324:3: CLASS ID LBR ( functionDefinitionRule )* RBR
			{
			match(input,CLASS,FOLLOW_CLASS_in_classRule1678); 
			match(input,ID,FOLLOW_ID_in_classRule1680); 
			match(input,LBR,FOLLOW_LBR_in_classRule1685); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:326:4: ( functionDefinitionRule )*
			loop90:
			while (true) {
				int alt90=2;
				int LA90_0 = input.LA(1);
				if ( (LA90_0==FUNCTION) ) {
					alt90=1;
				}

				switch (alt90) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:326:4: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_classRule1691);
					functionDefinitionRule();
					state._fsp--;

					}
					break;

				default :
					break loop90;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_classRule1696); 
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
	public static final BitSet FOLLOW_blockRule_in_parseJava70 = new BitSet(new long[]{0x0A018C0004064402L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_classRule_in_parseJava76 = new BitSet(new long[]{0x0A018C0004064402L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_DOCUMENT_in_getRule91 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_DOT_in_getRule95 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_getRule99 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_getRule103 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_STRING_in_getRule105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_getRule107 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_getRule109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule126 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotIdRule129 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule131 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_STRING_in_factorTypologyRule148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_factorTypologyRule152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_factorTypologyRule156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factorTypologyRule160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factorTypologyRule164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_factorTypologyRule168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectRule_in_assignTypologyRule184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRule_in_assignTypologyRule188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_assignTypologyRule192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNDEFINED_in_assignTypologyRule196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_assignTypologyRule200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newRule_in_assignTypologyRule204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotIdRule_in_idDotArrayRuleOld219 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_THIS_in_idDotArrayRuleOld224 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRuleOld227 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idDotArrayRuleOld229 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_LB_in_idDotArrayRuleOld239 = new BitSet(new long[]{0x0040800000000000L,0x0000000084000000L});
	public static final BitSet FOLLOW_INTEGER_in_idDotArrayRuleOld242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_idDotArrayRule_in_idDotArrayRuleOld247 = new BitSet(new long[]{0x2000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LP_in_idDotArrayRuleOld250 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idDotArrayRuleOld253 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_idDotArrayRuleOld255 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_idDotArrayRuleOld259 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idDotArrayRuleOld262 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_idDotArrayRuleOld264 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_idDotArrayRuleOld269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_STRING_in_idDotArrayRuleOld276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_idDotArrayRuleOld279 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRuleOld284 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idDotArrayRuleOld286 = new BitSet(new long[]{0x0100000010000002L});
	public static final BitSet FOLLOW_THIS_in_idDotArrayRule310 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRule312 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_idDotIdRule_in_idDotArrayRule320 = new BitSet(new long[]{0x2100800010000002L});
	public static final BitSet FOLLOW_LB_in_idDotArrayRule326 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_idDotArrayRule328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_idDotArrayRule330 = new BitSet(new long[]{0x2100800010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRule334 = new BitSet(new long[]{0x2000800000000002L});
	public static final BitSet FOLLOW_LP_in_idDotArrayRule341 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284100090L});
	public static final BitSet FOLLOW_parametersRule_in_idDotArrayRule343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_idDotArrayRule346 = new BitSet(new long[]{0x0000800010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRule348 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_parametersRule372 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expressionRule_in_parametersRule376 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_CM_in_parametersRule379 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_parametersRule382 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expressionRule_in_parametersRule386 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_termRule_in_expressionRule404 = new BitSet(new long[]{0x0000000000000012L,0x0000000008000002L});
	public static final BitSet FOLLOW_set_in_expressionRule407 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_termRule_in_expressionRule419 = new BitSet(new long[]{0x0000000000000012L,0x0000000008000002L});
	public static final BitSet FOLLOW_factorRule_in_termRule434 = new BitSet(new long[]{0x4000000401000042L,0x0000104000A00400L});
	public static final BitSet FOLLOW_set_in_termRule437 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_factorRule_in_termRule473 = new BitSet(new long[]{0x4000000401000042L,0x0000104000A00400L});
	public static final BitSet FOLLOW_factorTypologyRule_in_factorRule497 = new BitSet(new long[]{0x0010000000100002L});
	public static final BitSet FOLLOW_LP_in_factorRule510 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_factorRule512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_factorRule514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_instructionRule528 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_CONTINUE_in_instructionRule535 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_tryCatchRule_in_instructionRule542 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_instructionRule549 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_ifStatementRule_in_instructionRule557 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_switchCaseRule_in_instructionRule564 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_forRule_in_instructionRule571 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_whileRule_in_instructionRule578 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_doWhileRule_in_instructionRule585 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_throwRule_in_instructionRule592 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_typeOfRule_in_instructionRule599 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_idStartingRule_in_instructionRule606 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_instructionRule608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THROW_in_throwRule623 = new BitSet(new long[]{0x0040828000000000L,0x0000000284000000L});
	public static final BitSet FOLLOW_STRING_in_throwRule626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_throwRule630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_throwRule634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_throwRule638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_throwRule642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_throwRule646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEOF_in_typeOfRule662 = new BitSet(new long[]{0x0300080000000000L,0x0000001000000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_typeOfRule664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRY_in_tryCatchRule681 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockRule_in_tryCatchRule683 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CATCH_in_tryCatchRule688 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_tryCatchRule690 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_tryCatchRule692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_tryCatchRule694 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockRule_in_tryCatchRule696 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_FINALLY_in_tryCatchRule702 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockRule_in_tryCatchRule704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnRule720 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_returnRule723 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_returnRule725 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_returnRule728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_functionDeclarationRule746 = new BitSet(new long[]{0x2000800000000000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule752 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_functionDeclarationRule757 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284100090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_functionDeclarationRule761 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_functionDeclarationRule763 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_functionDeclarationRule768 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_functionDeclarationRule771 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_functionDeclarationRule773 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_functionDeclarationRule781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationRule_in_functionDefinitionRule796 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_functionDefinitionRule800 = new BitSet(new long[]{0x08018C0004060400L,0x0000028DA00C0000L});
	public static final BitSet FOLLOW_instructionRule_in_functionDefinitionRule805 = new BitSet(new long[]{0x08018C0004060400L,0x0000028DA00C0000L});
	public static final BitSet FOLLOW_returnRule_in_functionDefinitionRule811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_functionDefinitionRule816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_arrayRule832 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284020090L});
	public static final BitSet FOLLOW_expressionRule_in_arrayRule843 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_arrayRule845 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_CM_in_arrayRule852 = new BitSet(new long[]{0x23508A8000108000L,0x0000001284020090L});
	public static final BitSet FOLLOW_expressionRule_in_arrayRule855 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_arrayRule857 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_arrayRule871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectRule886 = new BitSet(new long[]{0x0000800000000000L,0x0000000004040000L});
	public static final BitSet FOLLOW_set_in_objectRule896 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule908 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_objectRule915 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_objectRule917 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_CM_in_objectRule928 = new BitSet(new long[]{0x0000800000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_set_in_objectRule933 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule945 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_objectRule952 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_objectRule954 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_objectRule971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_variableDefinitionRule1007 = new BitSet(new long[]{0x0000000802000082L,0x0000000001001005L});
	public static final BitSet FOLLOW_set_in_variableDefinitionRule1012 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_variableDefinitionRule1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_variableDefinitionRule1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_idStartingRule1066 = new BitSet(new long[]{0x0020000802000082L,0x0000000001001005L});
	public static final BitSet FOLLOW_set_in_idStartingRule1071 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_idStartingRule1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idStartingRule1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTANCEOF_in_idStartingRule1097 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idStartingRule1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_newRule1115 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_newRule1117 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_newRule1119 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284100090L});
	public static final BitSet FOLLOW_expressionRule_in_newRule1123 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_newRule1125 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_newRule1129 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_newRule1132 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_newRule1134 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_newRule1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_conditionRule1250 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_conditionRule1253 = new BitSet(new long[]{0x8400300080000022L,0x0000000040000248L});
	public static final BitSet FOLLOW_comparatorRule_in_conditionRule1256 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_NOT_in_conditionRule1258 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_conditionRule1261 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000200L});
	public static final BitSet FOLLOW_set_in_conditionRule1268 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_conditionRule1274 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000200L});
	public static final BitSet FOLLOW_LBR_in_blockRule1290 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_blockRule1293 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_blockRule_in_blockRule1295 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_RBR_in_blockRule1299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatementRule1314 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_ifStatementRule1316 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_ifStatementRule1318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ifStatementRule1320 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_ifStatementRule1327 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_instructionRule_in_ifStatementRule1331 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ELSE_in_ifStatementRule1337 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_IF_in_ifStatementRule1340 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_ifStatementRule1342 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_ifStatementRule1344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ifStatementRule1346 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_ifStatementRule1351 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_instructionRule_in_ifStatementRule1355 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_SWITCH_in_switchCaseRule1375 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_switchCaseRule1377 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_switchCaseRule1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_switchCaseRule1382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_switchCaseRule1385 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_switchCaseRule1389 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CASE_in_switchCaseRule1395 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_switchCaseRule1398 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_switchCaseRule1400 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_switchCaseRule1403 = new BitSet(new long[]{0x08018C0004260C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_switchCaseRule1409 = new BitSet(new long[]{0x08018C0004260C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_DEFAULT_in_switchCaseRule1422 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_switchCaseRule1424 = new BitSet(new long[]{0x08018C0004060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_switchCaseRule1430 = new BitSet(new long[]{0x08018C0004060400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_RBR_in_switchCaseRule1441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule1464 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_forRule1466 = new BitSet(new long[]{0x0800800000000000L,0x0000008080400000L});
	public static final BitSet FOLLOW_forInitVarRule_in_forRule1468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_forRule1471 = new BitSet(new long[]{0x2050828000100000L,0x0000000284400020L});
	public static final BitSet FOLLOW_conditionRule_in_forRule1473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_forRule1476 = new BitSet(new long[]{0x0010800000100000L,0x0000000000100000L});
	public static final BitSet FOLLOW_stepRule_in_forRule1478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_forRule1481 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_forRule1487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionRule_in_forRule1491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_forInitVarRule1516 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_forInitVarRule1518 = new BitSet(new long[]{0x23508A8000100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_forInitVarRule1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_forInitVarRule1523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incDecRule_in_stepRule1543 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_stepRule1552 = new BitSet(new long[]{0x0010000000100002L});
	public static final BitSet FOLLOW_incDecRule_in_stepRule1560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_incDecRule1582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INC_in_incDecRule1593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileRule1610 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_whileRule1612 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_whileRule1614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_whileRule1616 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_whileRule1622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionRule_in_whileRule1626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_doWhileRule1640 = new BitSet(new long[]{0x0A018C0004060400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_doWhileRule1646 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_instructionRule_in_doWhileRule1650 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_WHILE_in_doWhileRule1655 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_doWhileRule1657 = new BitSet(new long[]{0x2050828000100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_doWhileRule1659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_doWhileRule1661 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_doWhileRule1663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule1678 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_classRule1680 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_classRule1685 = new BitSet(new long[]{0x0000080000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_classRule1691 = new BitSet(new long[]{0x0000080000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_classRule1696 = new BitSet(new long[]{0x0000000000000002L});
}
