// $ANTLR 3.5.1 C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g 2023-07-31 15:12:02

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
				case DEC:
				case DO:
				case DOCUMENT:
				case FOR:
				case FUNCTION:
				case ID:
				case IF:
				case INC:
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



	// $ANTLR start "idDotIdRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:54:1: idDotIdRule : ID ( DOT ID )* ;
	public final void idDotIdRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:2: ( ID ( DOT ID )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:56:3: ID ( DOT ID )*
			{
			match(input,ID,FOLLOW_ID_in_idDotIdRule92); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:56:6: ( DOT ID )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DOT) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:56:7: DOT ID
					{
					match(input,DOT,FOLLOW_DOT_in_idDotIdRule95); 
					match(input,ID,FOLLOW_ID_in_idDotIdRule97); 
					}
					break;

				default :
					break loop2;
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:59:1: factorTypologyRule : (o1= STRING |o2= INTEGER |o3= FLOAT |o4= TRUE |o5= FALSE |o6= idDotArrayRule |o7= getRule ) ;
	public final void factorTypologyRule() throws RecognitionException {
		Token o1=null;
		Token o2=null;
		Token o3=null;
		Token o4=null;
		Token o5=null;
		ParserRuleReturnScope o6 =null;
		ParserRuleReturnScope o7 =null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:60:2: ( (o1= STRING |o2= INTEGER |o3= FLOAT |o4= TRUE |o5= FALSE |o6= idDotArrayRule |o7= getRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:61:3: (o1= STRING |o2= INTEGER |o3= FLOAT |o4= TRUE |o5= FALSE |o6= idDotArrayRule |o7= getRule )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:61:3: (o1= STRING |o2= INTEGER |o3= FLOAT |o4= TRUE |o5= FALSE |o6= idDotArrayRule |o7= getRule )
			int alt3=7;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt3=1;
				}
				break;
			case INTEGER:
				{
				alt3=2;
				}
				break;
			case FLOAT:
				{
				alt3=3;
				}
				break;
			case TRUE:
				{
				alt3=4;
				}
				break;
			case FALSE:
				{
				alt3=5;
				}
				break;
			case DEC:
			case ID:
			case INC:
			case THIS:
				{
				alt3=6;
				}
				break;
			case DOCUMENT:
				{
				alt3=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:61:4: o1= STRING
					{
					o1=(Token)match(input,STRING,FOLLOW_STRING_in_factorTypologyRule117); 
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:62:5: o2= INTEGER
					{
					o2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_factorTypologyRule125); 
					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:63:5: o3= FLOAT
					{
					o3=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_factorTypologyRule134); 
					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:64:5: o4= TRUE
					{
					o4=(Token)match(input,TRUE,FOLLOW_TRUE_in_factorTypologyRule144); 
					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:65:5: o5= FALSE
					{
					o5=(Token)match(input,FALSE,FOLLOW_FALSE_in_factorTypologyRule153); 
					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:66:5: o6= idDotArrayRule
					{
					pushFollow(FOLLOW_idDotArrayRule_in_factorTypologyRule163);
					o6=idDotArrayRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:5: o7= getRule
					{
					pushFollow(FOLLOW_getRule_in_factorTypologyRule171);
					o7=getRule();
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:70:1: assignTypologyRule : ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule ) ;
	public final void assignTypologyRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:71:2: ( ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:72:3: ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:72:3: ( objectRule | arrayRule | NULL | UNDEFINED | functionDefinitionRule | newRule )
			int alt4=6;
			switch ( input.LA(1) ) {
			case LBR:
				{
				alt4=1;
				}
				break;
			case LB:
				{
				alt4=2;
				}
				break;
			case NULL:
				{
				alt4=3;
				}
				break;
			case UNDEFINED:
				{
				alt4=4;
				}
				break;
			case FUNCTION:
				{
				alt4=5;
				}
				break;
			case NEW:
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:72:4: objectRule
					{
					pushFollow(FOLLOW_objectRule_in_assignTypologyRule188);
					objectRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:72:17: arrayRule
					{
					pushFollow(FOLLOW_arrayRule_in_assignTypologyRule192);
					arrayRule();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:72:29: NULL
					{
					match(input,NULL,FOLLOW_NULL_in_assignTypologyRule196); 
					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:72:36: UNDEFINED
					{
					match(input,UNDEFINED,FOLLOW_UNDEFINED_in_assignTypologyRule200); 
					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:72:48: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_assignTypologyRule204);
					functionDefinitionRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:72:73: newRule
					{
					pushFollow(FOLLOW_newRule_in_assignTypologyRule208);
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


	public static class idDotArrayRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "idDotArrayRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:1: idDotArrayRule : (o1= incDecRule )? ( THIS DOT )? ( idDotIdRule ( LB expressionRule RB )* ( DOT )? ( LP ( parametersRule )? RP ( DOT )? )? )+ (o2= incDecRule )? ;
	public final JavaScriptToJQueryConverterParser.idDotArrayRule_return idDotArrayRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.idDotArrayRule_return retval = new JavaScriptToJQueryConverterParser.idDotArrayRule_return();
		retval.start = input.LT(1);

		Token o1 =null;
		Token o2 =null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:82:2: ( (o1= incDecRule )? ( THIS DOT )? ( idDotIdRule ( LB expressionRule RB )* ( DOT )? ( LP ( parametersRule )? RP ( DOT )? )? )+ (o2= incDecRule )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:83:3: (o1= incDecRule )? ( THIS DOT )? ( idDotIdRule ( LB expressionRule RB )* ( DOT )? ( LP ( parametersRule )? RP ( DOT )? )? )+ (o2= incDecRule )?
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:83:5: (o1= incDecRule )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==DEC||LA5_0==INC) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:83:5: o1= incDecRule
					{
					pushFollow(FOLLOW_incDecRule_in_idDotArrayRule230);
					o1=incDecRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:3: ( THIS DOT )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==THIS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:4: THIS DOT
					{
					match(input,THIS,FOLLOW_THIS_in_idDotArrayRule237); 
					match(input,DOT,FOLLOW_DOT_in_idDotArrayRule239); 
					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:3: ( idDotIdRule ( LB expressionRule RB )* ( DOT )? ( LP ( parametersRule )? RP ( DOT )? )? )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==ID) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:85:4: idDotIdRule ( LB expressionRule RB )* ( DOT )? ( LP ( parametersRule )? RP ( DOT )? )?
					{
					pushFollow(FOLLOW_idDotIdRule_in_idDotArrayRule247);
					idDotIdRule();
					state._fsp--;

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:86:4: ( LB expressionRule RB )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==LB) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:86:5: LB expressionRule RB
							{
							match(input,LB,FOLLOW_LB_in_idDotArrayRule253); 
							pushFollow(FOLLOW_expressionRule_in_idDotArrayRule255);
							expressionRule();
							state._fsp--;

							match(input,RB,FOLLOW_RB_in_idDotArrayRule257); 
							}
							break;

						default :
							break loop7;
						}
					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:86:28: ( DOT )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==DOT) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:86:28: DOT
							{
							match(input,DOT,FOLLOW_DOT_in_idDotArrayRule261); 
							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:4: ( LP ( parametersRule )? RP ( DOT )? )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==LP) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:5: LP ( parametersRule )? RP ( DOT )?
							{
							match(input,LP,FOLLOW_LP_in_idDotArrayRule268); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:8: ( parametersRule )?
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( (LA9_0==DEC||LA9_0==DOCUMENT||LA9_0==FALSE||LA9_0==FLOAT||LA9_0==FUNCTION||LA9_0==ID||LA9_0==INC||LA9_0==INTEGER||(LA9_0 >= LB && LA9_0 <= LBR)||LA9_0==LP||LA9_0==NEW||LA9_0==NULL||LA9_0==STRING||LA9_0==THIS||LA9_0==TRUE||LA9_0==UNDEFINED) ) {
								alt9=1;
							}
							switch (alt9) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:8: parametersRule
									{
									pushFollow(FOLLOW_parametersRule_in_idDotArrayRule270);
									parametersRule();
									state._fsp--;

									}
									break;

							}

							match(input,RP,FOLLOW_RP_in_idDotArrayRule273); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:27: ( DOT )?
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==DOT) ) {
								alt10=1;
							}
							switch (alt10) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:27: DOT
									{
									match(input,DOT,FOLLOW_DOT_in_idDotArrayRule275); 
									}
									break;

							}

							}
							break;

					}

					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:89:5: (o2= incDecRule )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==DEC) ) {
				alt13=1;
			}
			else if ( (LA13_0==INC) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:89:5: o2= incDecRule
					{
					pushFollow(FOLLOW_incDecRule_in_idDotArrayRule290);
					o2=incDecRule();
					state._fsp--;

					}
					break;

			}

			h.checkDuplicateIncDec(o1, o2, (retval.start));
			}

			retval.stop = input.LT(-1);

			h.checkLastDot((retval.stop));
				h.translateId((retval.start), (retval.stop));
				h.saveVariable(input.toString(retval.start,input.LT(-1)), (retval.start), (retval.stop), o1, o2);
				h.getAjaxMethod((retval.start), (retval.stop));
				
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:92:1: parametersRule : ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* ;
	public final void parametersRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:93:2: ( ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:3: ( assignTypologyRule | expressionRule ) ( CM ( assignTypologyRule | expressionRule ) )*
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:3: ( assignTypologyRule | expressionRule )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==FUNCTION||(LA14_0 >= LB && LA14_0 <= LBR)||LA14_0==NEW||LA14_0==NULL||LA14_0==UNDEFINED) ) {
				alt14=1;
			}
			else if ( (LA14_0==DEC||LA14_0==DOCUMENT||LA14_0==FALSE||LA14_0==FLOAT||LA14_0==ID||LA14_0==INC||LA14_0==INTEGER||LA14_0==LP||LA14_0==STRING||LA14_0==THIS||LA14_0==TRUE) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:4: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_parametersRule308);
					assignTypologyRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:25: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_parametersRule312);
					expressionRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:40: ( CM ( assignTypologyRule | expressionRule ) )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==CM) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:41: CM ( assignTypologyRule | expressionRule )
					{
					match(input,CM,FOLLOW_CM_in_parametersRule315); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:44: ( assignTypologyRule | expressionRule )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==FUNCTION||(LA15_0 >= LB && LA15_0 <= LBR)||LA15_0==NEW||LA15_0==NULL||LA15_0==UNDEFINED) ) {
						alt15=1;
					}
					else if ( (LA15_0==DEC||LA15_0==DOCUMENT||LA15_0==FALSE||LA15_0==FLOAT||LA15_0==ID||LA15_0==INC||LA15_0==INTEGER||LA15_0==LP||LA15_0==STRING||LA15_0==THIS||LA15_0==TRUE) ) {
						alt15=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:45: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_parametersRule318);
							assignTypologyRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:66: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_parametersRule322);
							expressionRule();
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop16;
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:97:1: expressionRule : termRule ( ( ADD | SUB | MOD ) termRule )* ;
	public final void expressionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:98:2: ( termRule ( ( ADD | SUB | MOD ) termRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:99:3: termRule ( ( ADD | SUB | MOD ) termRule )*
			{
			pushFollow(FOLLOW_termRule_in_expressionRule338);
			termRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:99:12: ( ( ADD | SUB | MOD ) termRule )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==ADD||LA17_0==MOD||LA17_0==SUB) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:99:13: ( ADD | SUB | MOD ) termRule
					{
					if ( input.LA(1)==ADD||input.LA(1)==MOD||input.LA(1)==SUB ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_termRule_in_expressionRule353);
					termRule();
					state._fsp--;

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
	// $ANTLR end "expressionRule"



	// $ANTLR start "termRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:101:1: termRule : factorRule ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )* ;
	public final void termRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:102:2: ( factorRule ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:103:3: factorRule ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )*
			{
			pushFollow(FOLLOW_factorRule_in_termRule368);
			factorRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:103:14: ( ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==AND_BIT||LA18_0==DIV||LA18_0==EXP||LA18_0==LSHIFT||LA18_0==OR_BIT||LA18_0==RSHIFT||LA18_0==STAR||LA18_0==URSHIFT||LA18_0==XOR) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:103:15: ( STAR | DIV | EXP | XOR | AND_BIT | OR_BIT | LSHIFT | RSHIFT | URSHIFT ) factorRule
					{
					if ( input.LA(1)==AND_BIT||input.LA(1)==DIV||input.LA(1)==EXP||input.LA(1)==LSHIFT||input.LA(1)==OR_BIT||input.LA(1)==RSHIFT||input.LA(1)==STAR||input.LA(1)==URSHIFT||input.LA(1)==XOR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_factorRule_in_termRule407);
					factorRule();
					state._fsp--;

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
	// $ANTLR end "termRule"



	// $ANTLR start "factorRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:106:1: factorRule : ( factorTypologyRule | LP expressionRule RP );
	public final void factorRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:107:2: ( factorTypologyRule | LP expressionRule RP )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==DEC||LA19_0==DOCUMENT||LA19_0==FALSE||LA19_0==FLOAT||LA19_0==ID||LA19_0==INC||LA19_0==INTEGER||LA19_0==STRING||LA19_0==THIS||LA19_0==TRUE) ) {
				alt19=1;
			}
			else if ( (LA19_0==LP) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:108:3: factorTypologyRule
					{
					pushFollow(FOLLOW_factorTypologyRule_in_factorRule424);
					factorTypologyRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:109:5: LP expressionRule RP
					{
					match(input,LP,FOLLOW_LP_in_factorRule430); 
					pushFollow(FOLLOW_expressionRule_in_factorRule432);
					expressionRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_factorRule434); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:112:1: instructionRule : ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | documentRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule ) ( SC )? ;
	public final void instructionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:113:2: ( ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | documentRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule ) ( SC )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:114:3: ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | documentRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule ) ( SC )?
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:114:3: ( BREAK | CONTINUE | tryCatchRule | functionDefinitionRule | documentRule | ifStatementRule | switchCaseRule | forRule | whileRule | doWhileRule | throwRule | typeOfRule | idStartingRule )
			int alt20=13;
			switch ( input.LA(1) ) {
			case BREAK:
				{
				alt20=1;
				}
				break;
			case CONTINUE:
				{
				alt20=2;
				}
				break;
			case TRY:
				{
				alt20=3;
				}
				break;
			case FUNCTION:
				{
				alt20=4;
				}
				break;
			case DOCUMENT:
				{
				alt20=5;
				}
				break;
			case IF:
				{
				alt20=6;
				}
				break;
			case SWITCH:
				{
				alt20=7;
				}
				break;
			case FOR:
				{
				alt20=8;
				}
				break;
			case WHILE:
				{
				alt20=9;
				}
				break;
			case DO:
				{
				alt20=10;
				}
				break;
			case THROW:
				{
				alt20=11;
				}
				break;
			case TYPEOF:
				{
				alt20=12;
				}
				break;
			case CONST:
			case DEC:
			case ID:
			case INC:
			case LET:
			case THIS:
			case VAR:
				{
				alt20=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:114:4: BREAK
					{
					match(input,BREAK,FOLLOW_BREAK_in_instructionRule449); 
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:115:5: CONTINUE
					{
					match(input,CONTINUE,FOLLOW_CONTINUE_in_instructionRule456); 
					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:5: tryCatchRule
					{
					pushFollow(FOLLOW_tryCatchRule_in_instructionRule463);
					tryCatchRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:117:5: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_instructionRule470);
					functionDefinitionRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:118:5: documentRule
					{
					pushFollow(FOLLOW_documentRule_in_instructionRule477);
					documentRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:119:5: ifStatementRule
					{
					pushFollow(FOLLOW_ifStatementRule_in_instructionRule483);
					ifStatementRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:120:5: switchCaseRule
					{
					pushFollow(FOLLOW_switchCaseRule_in_instructionRule489);
					switchCaseRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:121:5: forRule
					{
					pushFollow(FOLLOW_forRule_in_instructionRule496);
					forRule();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:122:5: whileRule
					{
					pushFollow(FOLLOW_whileRule_in_instructionRule503);
					whileRule();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:123:5: doWhileRule
					{
					pushFollow(FOLLOW_doWhileRule_in_instructionRule510);
					doWhileRule();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:124:5: throwRule
					{
					pushFollow(FOLLOW_throwRule_in_instructionRule517);
					throwRule();
					state._fsp--;

					}
					break;
				case 12 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:125:5: typeOfRule
					{
					pushFollow(FOLLOW_typeOfRule_in_instructionRule523);
					typeOfRule();
					state._fsp--;

					}
					break;
				case 13 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:126:5: idStartingRule
					{
					pushFollow(FOLLOW_idStartingRule_in_instructionRule530);
					idStartingRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:126:20: ( SC )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==SC) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:126:20: SC
					{
					match(input,SC,FOLLOW_SC_in_instructionRule532); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:129:1: throwRule : THROW ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule ) ;
	public final void throwRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:130:2: ( THROW ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:131:3: THROW ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule )
			{
			match(input,THROW,FOLLOW_THROW_in_throwRule547); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:131:9: ( STRING | TRUE | FALSE | INTEGER | FLOAT | idDotArrayRule )
			int alt22=6;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt22=1;
				}
				break;
			case TRUE:
				{
				alt22=2;
				}
				break;
			case FALSE:
				{
				alt22=3;
				}
				break;
			case INTEGER:
				{
				alt22=4;
				}
				break;
			case FLOAT:
				{
				alt22=5;
				}
				break;
			case DEC:
			case ID:
			case INC:
			case THIS:
				{
				alt22=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:131:10: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_throwRule550); 
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:131:19: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_throwRule554); 
					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:131:26: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_throwRule558); 
					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:131:34: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_throwRule562); 
					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:131:44: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_throwRule566); 
					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:131:52: idDotArrayRule
					{
					pushFollow(FOLLOW_idDotArrayRule_in_throwRule570);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:134:1: typeOfRule : TYPEOF assignTypologyRule ;
	public final void typeOfRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:135:2: ( TYPEOF assignTypologyRule )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:136:3: TYPEOF assignTypologyRule
			{
			match(input,TYPEOF,FOLLOW_TYPEOF_in_typeOfRule586); 
			pushFollow(FOLLOW_assignTypologyRule_in_typeOfRule588);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:141:1: tryCatchRule : TRY blockRule CATCH LP ID RP blockRule ( FINALLY blockRule )? ;
	public final void tryCatchRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:142:2: ( TRY blockRule CATCH LP ID RP blockRule ( FINALLY blockRule )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:143:3: TRY blockRule CATCH LP ID RP blockRule ( FINALLY blockRule )?
			{
			match(input,TRY,FOLLOW_TRY_in_tryCatchRule605); 
			pushFollow(FOLLOW_blockRule_in_tryCatchRule607);
			blockRule();
			state._fsp--;

			match(input,CATCH,FOLLOW_CATCH_in_tryCatchRule612); 
			match(input,LP,FOLLOW_LP_in_tryCatchRule614); 
			match(input,ID,FOLLOW_ID_in_tryCatchRule616); 
			match(input,RP,FOLLOW_RP_in_tryCatchRule618); 
			pushFollow(FOLLOW_blockRule_in_tryCatchRule620);
			blockRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:145:3: ( FINALLY blockRule )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==FINALLY) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:145:4: FINALLY blockRule
					{
					match(input,FINALLY,FOLLOW_FINALLY_in_tryCatchRule626); 
					pushFollow(FOLLOW_blockRule_in_tryCatchRule628);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:148:1: returnRule : RETURN ( expressionRule | assignTypologyRule ) ( SC )? ;
	public final void returnRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:149:2: ( RETURN ( expressionRule | assignTypologyRule ) ( SC )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:150:3: RETURN ( expressionRule | assignTypologyRule ) ( SC )?
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnRule644); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:150:10: ( expressionRule | assignTypologyRule )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==DEC||LA24_0==DOCUMENT||LA24_0==FALSE||LA24_0==FLOAT||LA24_0==ID||LA24_0==INC||LA24_0==INTEGER||LA24_0==LP||LA24_0==STRING||LA24_0==THIS||LA24_0==TRUE) ) {
				alt24=1;
			}
			else if ( (LA24_0==FUNCTION||(LA24_0 >= LB && LA24_0 <= LBR)||LA24_0==NEW||LA24_0==NULL||LA24_0==UNDEFINED) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:150:11: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_returnRule647);
					expressionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:150:26: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_returnRule649);
					assignTypologyRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:150:46: ( SC )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==SC) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:150:46: SC
					{
					match(input,SC,FOLLOW_SC_in_returnRule652); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:153:1: functionDeclarationRule : func= FUNCTION (name= ID )? LP ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )? RP ;
	public final void functionDeclarationRule() throws RecognitionException {
		Token func=null;
		Token name=null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:2: (func= FUNCTION (name= ID )? LP ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )? RP )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:3: func= FUNCTION (name= ID )? LP ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )? RP
			{
			func=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclarationRule670); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:23: (name= ID )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==ID) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:23: name= ID
					{
					name=(Token)match(input,ID,FOLLOW_ID_in_functionDeclarationRule676); 
					}
					break;

			}

			h.checkFunctionName(name, func);
			match(input,LP,FOLLOW_LP_in_functionDeclarationRule681); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:69: ( ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* ) )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==DEC||LA30_0==DOCUMENT||LA30_0==FALSE||LA30_0==FLOAT||LA30_0==FUNCTION||LA30_0==ID||LA30_0==INC||LA30_0==INTEGER||(LA30_0 >= LB && LA30_0 <= LBR)||LA30_0==LP||LA30_0==NEW||LA30_0==NULL||LA30_0==STRING||LA30_0==THIS||LA30_0==TRUE||LA30_0==UNDEFINED) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:70: ( assignTypologyRule | expressionRule ) ( ( CM ( assignTypologyRule | expressionRule ) )* )
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:70: ( assignTypologyRule | expressionRule )
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
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:71: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_functionDeclarationRule685);
							assignTypologyRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:90: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_functionDeclarationRule687);
							expressionRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:106: ( ( CM ( assignTypologyRule | expressionRule ) )* )
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:107: ( CM ( assignTypologyRule | expressionRule ) )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:107: ( CM ( assignTypologyRule | expressionRule ) )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==CM) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:108: CM ( assignTypologyRule | expressionRule )
							{
							match(input,CM,FOLLOW_CM_in_functionDeclarationRule692); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:111: ( assignTypologyRule | expressionRule )
							int alt28=2;
							int LA28_0 = input.LA(1);
							if ( (LA28_0==FUNCTION||(LA28_0 >= LB && LA28_0 <= LBR)||LA28_0==NEW||LA28_0==NULL||LA28_0==UNDEFINED) ) {
								alt28=1;
							}
							else if ( (LA28_0==DEC||LA28_0==DOCUMENT||LA28_0==FALSE||LA28_0==FLOAT||LA28_0==ID||LA28_0==INC||LA28_0==INTEGER||LA28_0==LP||LA28_0==STRING||LA28_0==THIS||LA28_0==TRUE) ) {
								alt28=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 28, 0, input);
								throw nvae;
							}

							switch (alt28) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:112: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_functionDeclarationRule695);
									assignTypologyRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:131: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_functionDeclarationRule697);
									expressionRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop29;
						}
					}

					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_functionDeclarationRule705); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:158:1: functionDefinitionRule : functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR ;
	public final void functionDefinitionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:159:2: ( functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:160:3: functionDeclarationRule LBR ( instructionRule )* ( returnRule )? RBR
			{
			pushFollow(FOLLOW_functionDeclarationRule_in_functionDefinitionRule720);
			functionDeclarationRule();
			state._fsp--;

			match(input,LBR,FOLLOW_LBR_in_functionDefinitionRule724); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:4: ( instructionRule )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==BREAK||(LA31_0 >= CONST && LA31_0 <= CONTINUE)||LA31_0==DEC||(LA31_0 >= DO && LA31_0 <= DOCUMENT)||(LA31_0 >= FOR && LA31_0 <= FUNCTION)||(LA31_0 >= ID && LA31_0 <= IF)||LA31_0==INC||LA31_0==LET||LA31_0==SWITCH||(LA31_0 >= THIS && LA31_0 <= THROW)||(LA31_0 >= TRY && LA31_0 <= TYPEOF)||LA31_0==VAR||LA31_0==WHILE) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:4: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_functionDefinitionRule729);
					instructionRule();
					state._fsp--;

					}
					break;

				default :
					break loop31;
				}
			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:163:4: ( returnRule )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==RETURN) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:163:4: returnRule
					{
					pushFollow(FOLLOW_returnRule_in_functionDefinitionRule735);
					returnRule();
					state._fsp--;

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_functionDefinitionRule740); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:167:1: arrayRule : LB ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )? RB ;
	public final void arrayRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:168:2: ( LB ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )? RB )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:169:3: LB ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )? RB
			{
			match(input,LB,FOLLOW_LB_in_arrayRule754); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:170:4: ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )* )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==DEC||LA36_0==DOCUMENT||LA36_0==FALSE||LA36_0==FLOAT||LA36_0==FUNCTION||LA36_0==ID||LA36_0==INC||LA36_0==INTEGER||(LA36_0 >= LB && LA36_0 <= LBR)||LA36_0==LP||LA36_0==NEW||LA36_0==NULL||LA36_0==STRING||LA36_0==THIS||LA36_0==TRUE||LA36_0==UNDEFINED) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:171:4: ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule )? )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:171:4: ( expressionRule | assignTypologyRule )
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==DEC||LA33_0==DOCUMENT||LA33_0==FALSE||LA33_0==FLOAT||LA33_0==ID||LA33_0==INC||LA33_0==INTEGER||LA33_0==LP||LA33_0==STRING||LA33_0==THIS||LA33_0==TRUE) ) {
						alt33=1;
					}
					else if ( (LA33_0==FUNCTION||(LA33_0 >= LB && LA33_0 <= LBR)||LA33_0==NEW||LA33_0==NULL||LA33_0==UNDEFINED) ) {
						alt33=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}

					switch (alt33) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:171:5: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_arrayRule765);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:171:20: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_arrayRule767);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:172:4: ( CM ( expressionRule | assignTypologyRule )? )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==CM) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:172:5: CM ( expressionRule | assignTypologyRule )?
							{
							match(input,CM,FOLLOW_CM_in_arrayRule774); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:172:8: ( expressionRule | assignTypologyRule )?
							int alt34=3;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==DEC||LA34_0==DOCUMENT||LA34_0==FALSE||LA34_0==FLOAT||LA34_0==ID||LA34_0==INC||LA34_0==INTEGER||LA34_0==LP||LA34_0==STRING||LA34_0==THIS||LA34_0==TRUE) ) {
								alt34=1;
							}
							else if ( (LA34_0==FUNCTION||(LA34_0 >= LB && LA34_0 <= LBR)||LA34_0==NEW||LA34_0==NULL||LA34_0==UNDEFINED) ) {
								alt34=2;
							}
							switch (alt34) {
								case 1 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:172:9: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_arrayRule777);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:172:24: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_arrayRule779);
									assignTypologyRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop35;
						}
					}

					}
					break;

			}

			match(input,RB,FOLLOW_RB_in_arrayRule793); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:177:1: objectRule : LBR ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )? RBR ;
	public final void objectRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:178:2: ( LBR ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )? RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:179:3: LBR ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )? RBR
			{
			match(input,LBR,FOLLOW_LBR_in_objectRule808); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:180:4: ( ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )* )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==ID||LA40_0==STRING) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:181:4: ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )*
					{
					if ( input.LA(1)==ID||input.LA(1)==STRING ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,CL,FOLLOW_CL_in_objectRule830); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:183:4: ( expressionRule | assignTypologyRule )
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==DEC||LA37_0==DOCUMENT||LA37_0==FALSE||LA37_0==FLOAT||LA37_0==ID||LA37_0==INC||LA37_0==INTEGER||LA37_0==LP||LA37_0==STRING||LA37_0==THIS||LA37_0==TRUE) ) {
						alt37=1;
					}
					else if ( (LA37_0==FUNCTION||(LA37_0 >= LB && LA37_0 <= LBR)||LA37_0==NEW||LA37_0==NULL||LA37_0==UNDEFINED) ) {
						alt37=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 37, 0, input);
						throw nvae;
					}

					switch (alt37) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:183:5: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_objectRule837);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:183:20: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_objectRule839);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:184:4: ( CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule ) )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==CM) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:185:4: CM ( ID | STRING ) CL ( expressionRule | assignTypologyRule )
							{
							match(input,CM,FOLLOW_CM_in_objectRule850); 
							if ( input.LA(1)==ID||input.LA(1)==STRING ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,CL,FOLLOW_CL_in_objectRule867); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:4: ( expressionRule | assignTypologyRule )
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
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:5: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_objectRule874);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:20: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_objectRule876);
									assignTypologyRule();
									state._fsp--;

									}
									break;

							}

							}
							break;

						default :
							break loop39;
						}
					}

					}
					break;

			}

			match(input,RBR,FOLLOW_RBR_in_objectRule893); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:195:1: variableDefinitionRule : ( VAR | LET | CONST )? idDotArrayRule ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? ;
	public final void variableDefinitionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:196:2: ( ( VAR | LET | CONST )? idDotArrayRule ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:197:3: ( VAR | LET | CONST )? idDotArrayRule ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:197:3: ( VAR | LET | CONST )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==CONST||LA41_0==LET||LA41_0==VAR) ) {
				alt41=1;
			}
			switch (alt41) {
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

			pushFollow(FOLLOW_idDotArrayRule_in_variableDefinitionRule925);
			idDotArrayRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:199:3: ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==ASSIGN||LA43_0==DIVEQ||LA43_0==EXPEQ||LA43_0==MINUSEQ||LA43_0==MODEQ||LA43_0==PLUSEQ||LA43_0==STAREQ) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:199:4: ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule )
					{
					if ( input.LA(1)==ASSIGN||input.LA(1)==DIVEQ||input.LA(1)==EXPEQ||input.LA(1)==MINUSEQ||input.LA(1)==MODEQ||input.LA(1)==PLUSEQ||input.LA(1)==STAREQ ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:199:53: ( expressionRule | assignTypologyRule )
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==DEC||LA42_0==DOCUMENT||LA42_0==FALSE||LA42_0==FLOAT||LA42_0==ID||LA42_0==INC||LA42_0==INTEGER||LA42_0==LP||LA42_0==STRING||LA42_0==THIS||LA42_0==TRUE) ) {
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
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:199:54: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_variableDefinitionRule947);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:199:69: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_variableDefinitionRule949);
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


	public static class documentRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "documentRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:203:1: documentRule : getRule ( ( ASSIGN | PLUSEQ ) ( expressionRule | assignTypologyRule ) )? ;
	public final JavaScriptToJQueryConverterParser.documentRule_return documentRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.documentRule_return retval = new JavaScriptToJQueryConverterParser.documentRule_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:205:2: ( getRule ( ( ASSIGN | PLUSEQ ) ( expressionRule | assignTypologyRule ) )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:206:3: getRule ( ( ASSIGN | PLUSEQ ) ( expressionRule | assignTypologyRule ) )?
			{
			pushFollow(FOLLOW_getRule_in_documentRule972);
			getRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:206:11: ( ( ASSIGN | PLUSEQ ) ( expressionRule | assignTypologyRule ) )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==ASSIGN||LA45_0==PLUSEQ) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:206:12: ( ASSIGN | PLUSEQ ) ( expressionRule | assignTypologyRule )
					{
					if ( input.LA(1)==ASSIGN||input.LA(1)==PLUSEQ ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:206:27: ( expressionRule | assignTypologyRule )
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==DEC||LA44_0==DOCUMENT||LA44_0==FALSE||LA44_0==FLOAT||LA44_0==ID||LA44_0==INC||LA44_0==INTEGER||LA44_0==LP||LA44_0==STRING||LA44_0==THIS||LA44_0==TRUE) ) {
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
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:206:28: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_documentRule981);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:206:43: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_documentRule983);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			h.translateIdWithAssign((retval.start), (retval.stop));
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
	// $ANTLR end "documentRule"


	public static class getRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "getRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:209:1: getRule : DOCUMENT DOT get= ID LP ( ( idDotArrayRule | STRING ) ( ADD ( idDotArrayRule | STRING ) )* ) end= RP ( DOT idDotArrayRule )? ;
	public final JavaScriptToJQueryConverterParser.getRule_return getRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.getRule_return retval = new JavaScriptToJQueryConverterParser.getRule_return();
		retval.start = input.LT(1);

		Token get=null;
		Token end=null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:210:2: ( DOCUMENT DOT get= ID LP ( ( idDotArrayRule | STRING ) ( ADD ( idDotArrayRule | STRING ) )* ) end= RP ( DOT idDotArrayRule )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:3: DOCUMENT DOT get= ID LP ( ( idDotArrayRule | STRING ) ( ADD ( idDotArrayRule | STRING ) )* ) end= RP ( DOT idDotArrayRule )?
			{
			match(input,DOCUMENT,FOLLOW_DOCUMENT_in_getRule1001); 
			match(input,DOT,FOLLOW_DOT_in_getRule1003); 
			get=(Token)match(input,ID,FOLLOW_ID_in_getRule1007); 
			match(input,LP,FOLLOW_LP_in_getRule1009); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:26: ( ( idDotArrayRule | STRING ) ( ADD ( idDotArrayRule | STRING ) )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:27: ( idDotArrayRule | STRING ) ( ADD ( idDotArrayRule | STRING ) )*
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:27: ( idDotArrayRule | STRING )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==DEC||LA46_0==ID||LA46_0==INC||LA46_0==THIS) ) {
				alt46=1;
			}
			else if ( (LA46_0==STRING) ) {
				alt46=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:28: idDotArrayRule
					{
					pushFollow(FOLLOW_idDotArrayRule_in_getRule1013);
					idDotArrayRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:43: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_getRule1015); 
					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:51: ( ADD ( idDotArrayRule | STRING ) )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==ADD) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:52: ADD ( idDotArrayRule | STRING )
					{
					match(input,ADD,FOLLOW_ADD_in_getRule1019); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:56: ( idDotArrayRule | STRING )
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==DEC||LA47_0==ID||LA47_0==INC||LA47_0==THIS) ) {
						alt47=1;
					}
					else if ( (LA47_0==STRING) ) {
						alt47=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						throw nvae;
					}

					switch (alt47) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:57: idDotArrayRule
							{
							pushFollow(FOLLOW_idDotArrayRule_in_getRule1022);
							idDotArrayRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:74: STRING
							{
							match(input,STRING,FOLLOW_STRING_in_getRule1026); 
							}
							break;

					}

					}
					break;

				default :
					break loop48;
				}
			}

			}

			end=(Token)match(input,RP,FOLLOW_RP_in_getRule1034); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:92: ( DOT idDotArrayRule )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==DOT) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:93: DOT idDotArrayRule
					{
					match(input,DOT,FOLLOW_DOT_in_getRule1037); 
					pushFollow(FOLLOW_idDotArrayRule_in_getRule1039);
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


	public static class idStartingRule_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "idStartingRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:1: idStartingRule : ( VAR | LET | CONST )? id= idDotArrayRule ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID ) ;
	public final JavaScriptToJQueryConverterParser.idStartingRule_return idStartingRule() throws RecognitionException {
		JavaScriptToJQueryConverterParser.idStartingRule_return retval = new JavaScriptToJQueryConverterParser.idStartingRule_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope id =null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:219:2: ( ( VAR | LET | CONST )? id= idDotArrayRule ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:220:3: ( VAR | LET | CONST )? id= idDotArrayRule ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:220:3: ( VAR | LET | CONST )?
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

			pushFollow(FOLLOW_idDotArrayRule_in_idStartingRule1078);
			id=idDotArrayRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:221:21: ( ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )? | INSTANCEOF ID )
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==EOF||LA53_0==ASSIGN||(LA53_0 >= BREAK && LA53_0 <= CASE)||LA53_0==CLASS||(LA53_0 >= CONST && LA53_0 <= CONTINUE)||(LA53_0 >= DEC && LA53_0 <= DEFAULT)||(LA53_0 >= DIVEQ && LA53_0 <= DOCUMENT)||LA53_0==ELSE||LA53_0==EXPEQ||(LA53_0 >= FOR && LA53_0 <= FUNCTION)||(LA53_0 >= ID && LA53_0 <= IF)||LA53_0==INC||LA53_0==LBR||LA53_0==LET||LA53_0==MINUSEQ||LA53_0==MODEQ||LA53_0==PLUSEQ||(LA53_0 >= RBR && LA53_0 <= RETURN)||LA53_0==SC||LA53_0==STAREQ||LA53_0==SWITCH||(LA53_0 >= THIS && LA53_0 <= THROW)||(LA53_0 >= TRY && LA53_0 <= TYPEOF)||LA53_0==VAR||LA53_0==WHILE) ) {
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:221:23: ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:221:23: ( ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule ) )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==ASSIGN||LA52_0==DIVEQ||LA52_0==EXPEQ||LA52_0==MINUSEQ||LA52_0==MODEQ||LA52_0==PLUSEQ||LA52_0==STAREQ) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:221:24: ( ASSIGN | PLUSEQ | MINUSEQ | STAREQ | DIVEQ | MODEQ | EXPEQ ) ( expressionRule | assignTypologyRule )
							{
							if ( input.LA(1)==ASSIGN||input.LA(1)==DIVEQ||input.LA(1)==EXPEQ||input.LA(1)==MINUSEQ||input.LA(1)==MODEQ||input.LA(1)==PLUSEQ||input.LA(1)==STAREQ ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:221:73: ( expressionRule | assignTypologyRule )
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
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:221:74: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_idStartingRule1100);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:221:89: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_idStartingRule1102);
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:221:113: INSTANCEOF ID
					{
					match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_idStartingRule1109); 
					match(input,ID,FOLLOW_ID_in_idStartingRule1111); 
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			h.translateIdWithAssign((retval.start), (retval.stop));
				h.searchXMLHttpRequest((retval.start), (retval.stop));
				h.getAjaxAttribute((retval.start), (retval.stop));
				
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
	// $ANTLR end "idStartingRule"



	// $ANTLR start "newRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:1: newRule : NEW ID LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP ;
	public final void newRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:226:2: ( NEW ID LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:3: NEW ID LP ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )? RP
			{
			match(input,NEW,FOLLOW_NEW_in_newRule1127); 
			match(input,ID,FOLLOW_ID_in_newRule1129); 
			match(input,LP,FOLLOW_LP_in_newRule1131); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:13: ( ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )* )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==DEC||LA57_0==DOCUMENT||LA57_0==FALSE||LA57_0==FLOAT||LA57_0==FUNCTION||LA57_0==ID||LA57_0==INC||LA57_0==INTEGER||(LA57_0 >= LB && LA57_0 <= LBR)||LA57_0==LP||LA57_0==NEW||LA57_0==NULL||LA57_0==STRING||LA57_0==THIS||LA57_0==TRUE||LA57_0==UNDEFINED) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:14: ( expressionRule | assignTypologyRule ) ( CM ( expressionRule | assignTypologyRule ) )*
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:14: ( expressionRule | assignTypologyRule )
					int alt54=2;
					int LA54_0 = input.LA(1);
					if ( (LA54_0==DEC||LA54_0==DOCUMENT||LA54_0==FALSE||LA54_0==FLOAT||LA54_0==ID||LA54_0==INC||LA54_0==INTEGER||LA54_0==LP||LA54_0==STRING||LA54_0==THIS||LA54_0==TRUE) ) {
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
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:15: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_newRule1135);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:30: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_newRule1137);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:50: ( CM ( expressionRule | assignTypologyRule ) )*
					loop56:
					while (true) {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==CM) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:51: CM ( expressionRule | assignTypologyRule )
							{
							match(input,CM,FOLLOW_CM_in_newRule1141); 
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:54: ( expressionRule | assignTypologyRule )
							int alt55=2;
							int LA55_0 = input.LA(1);
							if ( (LA55_0==DEC||LA55_0==DOCUMENT||LA55_0==FALSE||LA55_0==FLOAT||LA55_0==ID||LA55_0==INC||LA55_0==INTEGER||LA55_0==LP||LA55_0==STRING||LA55_0==THIS||LA55_0==TRUE) ) {
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
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:55: expressionRule
									{
									pushFollow(FOLLOW_expressionRule_in_newRule1144);
									expressionRule();
									state._fsp--;

									}
									break;
								case 2 :
									// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:70: assignTypologyRule
									{
									pushFollow(FOLLOW_assignTypologyRule_in_newRule1146);
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

			match(input,RP,FOLLOW_RP_in_newRule1153); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:1: comparatorRule : ( EQ | NEQ | LT | LE | GT | GE | TEQ | NTEQ ) ;
	public final void comparatorRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:232:2: ( ( EQ | NEQ | LT | LE | GT | GE | TEQ | NTEQ ) )
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:236:1: conditionRule : ( NOT )? expressionRule ( comparatorRule ( NOT )? expressionRule )? ( ( AND | OR ) conditionRule )* ;
	public final void conditionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:237:2: ( ( NOT )? expressionRule ( comparatorRule ( NOT )? expressionRule )? ( ( AND | OR ) conditionRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:3: ( NOT )? expressionRule ( comparatorRule ( NOT )? expressionRule )? ( ( AND | OR ) conditionRule )*
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:3: ( NOT )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==NOT) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:3: NOT
					{
					match(input,NOT,FOLLOW_NOT_in_conditionRule1212); 
					}
					break;

			}

			pushFollow(FOLLOW_expressionRule_in_conditionRule1215);
			expressionRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:23: ( comparatorRule ( NOT )? expressionRule )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==EQ||(LA60_0 >= GE && LA60_0 <= GT)||LA60_0==LE||LA60_0==LT||LA60_0==NEQ||LA60_0==NTEQ||LA60_0==TEQ) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:24: comparatorRule ( NOT )? expressionRule
					{
					pushFollow(FOLLOW_comparatorRule_in_conditionRule1218);
					comparatorRule();
					state._fsp--;

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:39: ( NOT )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==NOT) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:39: NOT
							{
							match(input,NOT,FOLLOW_NOT_in_conditionRule1220); 
							}
							break;

					}

					pushFollow(FOLLOW_expressionRule_in_conditionRule1223);
					expressionRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:239:3: ( ( AND | OR ) conditionRule )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==AND||LA61_0==OR) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:239:4: ( AND | OR ) conditionRule
					{
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_conditionRule_in_conditionRule1236);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:242:1: blockRule : LBR ( instructionRule | blockRule )* RBR ;
	public final void blockRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:2: ( LBR ( instructionRule | blockRule )* RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:244:3: LBR ( instructionRule | blockRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_blockRule1251); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:244:7: ( instructionRule | blockRule )*
			loop62:
			while (true) {
				int alt62=3;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==BREAK||(LA62_0 >= CONST && LA62_0 <= CONTINUE)||LA62_0==DEC||(LA62_0 >= DO && LA62_0 <= DOCUMENT)||(LA62_0 >= FOR && LA62_0 <= FUNCTION)||(LA62_0 >= ID && LA62_0 <= IF)||LA62_0==INC||LA62_0==LET||LA62_0==SWITCH||(LA62_0 >= THIS && LA62_0 <= THROW)||(LA62_0 >= TRY && LA62_0 <= TYPEOF)||LA62_0==VAR||LA62_0==WHILE) ) {
					alt62=1;
				}
				else if ( (LA62_0==LBR) ) {
					alt62=2;
				}

				switch (alt62) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:244:8: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_blockRule1254);
					instructionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:244:24: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_blockRule1256);
					blockRule();
					state._fsp--;

					}
					break;

				default :
					break loop62;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_blockRule1260); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:247:1: ifStatementRule : IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )* ;
	public final void ifStatementRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:248:2: ( IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:249:3: IF LP conditionRule RP ( blockRule | instructionRule ) ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )*
			{
			match(input,IF,FOLLOW_IF_in_ifStatementRule1274); 
			match(input,LP,FOLLOW_LP_in_ifStatementRule1276); 
			pushFollow(FOLLOW_conditionRule_in_ifStatementRule1278);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_ifStatementRule1280); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:250:4: ( blockRule | instructionRule )
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==LBR) ) {
				alt63=1;
			}
			else if ( (LA63_0==BREAK||(LA63_0 >= CONST && LA63_0 <= CONTINUE)||LA63_0==DEC||(LA63_0 >= DO && LA63_0 <= DOCUMENT)||(LA63_0 >= FOR && LA63_0 <= FUNCTION)||(LA63_0 >= ID && LA63_0 <= IF)||LA63_0==INC||LA63_0==LET||LA63_0==SWITCH||(LA63_0 >= THIS && LA63_0 <= THROW)||(LA63_0 >= TRY && LA63_0 <= TYPEOF)||LA63_0==VAR||LA63_0==WHILE) ) {
				alt63=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:250:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_ifStatementRule1287);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:250:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_ifStatementRule1291);
					instructionRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:3: ( ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule ) )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==ELSE) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:4: ELSE ( IF LP conditionRule RP )? ( blockRule | instructionRule )
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStatementRule1297); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:9: ( IF LP conditionRule RP )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==IF) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:10: IF LP conditionRule RP
							{
							match(input,IF,FOLLOW_IF_in_ifStatementRule1300); 
							match(input,LP,FOLLOW_LP_in_ifStatementRule1302); 
							pushFollow(FOLLOW_conditionRule_in_ifStatementRule1304);
							conditionRule();
							state._fsp--;

							match(input,RP,FOLLOW_RP_in_ifStatementRule1306); 
							}
							break;

					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:35: ( blockRule | instructionRule )
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==LBR) ) {
						alt65=1;
					}
					else if ( (LA65_0==BREAK||(LA65_0 >= CONST && LA65_0 <= CONTINUE)||LA65_0==DEC||(LA65_0 >= DO && LA65_0 <= DOCUMENT)||(LA65_0 >= FOR && LA65_0 <= FUNCTION)||(LA65_0 >= ID && LA65_0 <= IF)||LA65_0==INC||LA65_0==LET||LA65_0==SWITCH||(LA65_0 >= THIS && LA65_0 <= THROW)||(LA65_0 >= TRY && LA65_0 <= TYPEOF)||LA65_0==VAR||LA65_0==WHILE) ) {
						alt65=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 65, 0, input);
						throw nvae;
					}

					switch (alt65) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:36: blockRule
							{
							pushFollow(FOLLOW_blockRule_in_ifStatementRule1311);
							blockRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:48: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_ifStatementRule1315);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:255:1: switchCaseRule : SWITCH LP ( expressionRule | assignTypologyRule ) RP LBR ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )* ( DEFAULT CL ( instructionRule )* )? ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )* RBR ;
	public final void switchCaseRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:256:2: ( SWITCH LP ( expressionRule | assignTypologyRule ) RP LBR ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )* ( DEFAULT CL ( instructionRule )* )? ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )* RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:257:3: SWITCH LP ( expressionRule | assignTypologyRule ) RP LBR ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )* ( DEFAULT CL ( instructionRule )* )? ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )* RBR
			{
			match(input,SWITCH,FOLLOW_SWITCH_in_switchCaseRule1336); 
			match(input,LP,FOLLOW_LP_in_switchCaseRule1338); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:257:13: ( expressionRule | assignTypologyRule )
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==DEC||LA67_0==DOCUMENT||LA67_0==FALSE||LA67_0==FLOAT||LA67_0==ID||LA67_0==INC||LA67_0==INTEGER||LA67_0==LP||LA67_0==STRING||LA67_0==THIS||LA67_0==TRUE) ) {
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
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:257:14: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_switchCaseRule1341);
					expressionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:257:29: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_switchCaseRule1343);
					assignTypologyRule();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_switchCaseRule1346); 
			match(input,LBR,FOLLOW_LBR_in_switchCaseRule1350); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:259:4: ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==CASE) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:259:5: CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )*
					{
					match(input,CASE,FOLLOW_CASE_in_switchCaseRule1356); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:259:10: ( expressionRule | assignTypologyRule )
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==DEC||LA68_0==DOCUMENT||LA68_0==FALSE||LA68_0==FLOAT||LA68_0==ID||LA68_0==INC||LA68_0==INTEGER||LA68_0==LP||LA68_0==STRING||LA68_0==THIS||LA68_0==TRUE) ) {
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
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:259:11: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_switchCaseRule1359);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:259:26: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_switchCaseRule1361);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					match(input,CL,FOLLOW_CL_in_switchCaseRule1364); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:260:5: ( instructionRule )*
					loop69:
					while (true) {
						int alt69=2;
						int LA69_0 = input.LA(1);
						if ( (LA69_0==BREAK||(LA69_0 >= CONST && LA69_0 <= CONTINUE)||LA69_0==DEC||(LA69_0 >= DO && LA69_0 <= DOCUMENT)||(LA69_0 >= FOR && LA69_0 <= FUNCTION)||(LA69_0 >= ID && LA69_0 <= IF)||LA69_0==INC||LA69_0==LET||LA69_0==SWITCH||(LA69_0 >= THIS && LA69_0 <= THROW)||(LA69_0 >= TRY && LA69_0 <= TYPEOF)||LA69_0==VAR||LA69_0==WHILE) ) {
							alt69=1;
						}

						switch (alt69) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:260:5: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_switchCaseRule1370);
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
					break loop70;
				}
			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:262:4: ( DEFAULT CL ( instructionRule )* )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==DEFAULT) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:262:5: DEFAULT CL ( instructionRule )*
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_switchCaseRule1383); 
					match(input,CL,FOLLOW_CL_in_switchCaseRule1385); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:263:5: ( instructionRule )*
					loop71:
					while (true) {
						int alt71=2;
						int LA71_0 = input.LA(1);
						if ( (LA71_0==BREAK||(LA71_0 >= CONST && LA71_0 <= CONTINUE)||LA71_0==DEC||(LA71_0 >= DO && LA71_0 <= DOCUMENT)||(LA71_0 >= FOR && LA71_0 <= FUNCTION)||(LA71_0 >= ID && LA71_0 <= IF)||LA71_0==INC||LA71_0==LET||LA71_0==SWITCH||(LA71_0 >= THIS && LA71_0 <= THROW)||(LA71_0 >= TRY && LA71_0 <= TYPEOF)||LA71_0==VAR||LA71_0==WHILE) ) {
							alt71=1;
						}

						switch (alt71) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:263:5: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_switchCaseRule1391);
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

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:265:4: ( CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )* )*
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==CASE) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:265:5: CASE ( expressionRule | assignTypologyRule ) CL ( instructionRule )*
					{
					match(input,CASE,FOLLOW_CASE_in_switchCaseRule1404); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:265:10: ( expressionRule | assignTypologyRule )
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==DEC||LA73_0==DOCUMENT||LA73_0==FALSE||LA73_0==FLOAT||LA73_0==ID||LA73_0==INC||LA73_0==INTEGER||LA73_0==LP||LA73_0==STRING||LA73_0==THIS||LA73_0==TRUE) ) {
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
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:265:11: expressionRule
							{
							pushFollow(FOLLOW_expressionRule_in_switchCaseRule1407);
							expressionRule();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:265:26: assignTypologyRule
							{
							pushFollow(FOLLOW_assignTypologyRule_in_switchCaseRule1409);
							assignTypologyRule();
							state._fsp--;

							}
							break;

					}

					match(input,CL,FOLLOW_CL_in_switchCaseRule1412); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:266:5: ( instructionRule )*
					loop74:
					while (true) {
						int alt74=2;
						int LA74_0 = input.LA(1);
						if ( (LA74_0==BREAK||(LA74_0 >= CONST && LA74_0 <= CONTINUE)||LA74_0==DEC||(LA74_0 >= DO && LA74_0 <= DOCUMENT)||(LA74_0 >= FOR && LA74_0 <= FUNCTION)||(LA74_0 >= ID && LA74_0 <= IF)||LA74_0==INC||LA74_0==LET||LA74_0==SWITCH||(LA74_0 >= THIS && LA74_0 <= THROW)||(LA74_0 >= TRY && LA74_0 <= TYPEOF)||LA74_0==VAR||LA74_0==WHILE) ) {
							alt74=1;
						}

						switch (alt74) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:266:5: instructionRule
							{
							pushFollow(FOLLOW_instructionRule_in_switchCaseRule1418);
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
					break loop75;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_switchCaseRule1429); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:272:1: forRule : FOR LP ( forInitVarRule )? SC ( conditionRule )? SC ( idDotArrayRule )? RP ( blockRule | instructionRule ) ;
	public final void forRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:273:2: ( FOR LP ( forInitVarRule )? SC ( conditionRule )? SC ( idDotArrayRule )? RP ( blockRule | instructionRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:274:3: FOR LP ( forInitVarRule )? SC ( conditionRule )? SC ( idDotArrayRule )? RP ( blockRule | instructionRule )
			{
			match(input,FOR,FOLLOW_FOR_in_forRule1447); 
			match(input,LP,FOLLOW_LP_in_forRule1449); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:274:10: ( forInitVarRule )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==DEC||LA76_0==ID||LA76_0==INC||LA76_0==LET||LA76_0==THIS||LA76_0==VAR) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:274:10: forInitVarRule
					{
					pushFollow(FOLLOW_forInitVarRule_in_forRule1451);
					forInitVarRule();
					state._fsp--;

					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_forRule1454); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:274:29: ( conditionRule )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==DEC||LA77_0==DOCUMENT||LA77_0==FALSE||LA77_0==FLOAT||LA77_0==ID||LA77_0==INC||LA77_0==INTEGER||LA77_0==LP||LA77_0==NOT||LA77_0==STRING||LA77_0==THIS||LA77_0==TRUE) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:274:29: conditionRule
					{
					pushFollow(FOLLOW_conditionRule_in_forRule1456);
					conditionRule();
					state._fsp--;

					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_forRule1459); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:274:47: ( idDotArrayRule )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==DEC||LA78_0==ID||LA78_0==INC||LA78_0==THIS) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:274:47: idDotArrayRule
					{
					pushFollow(FOLLOW_idDotArrayRule_in_forRule1461);
					idDotArrayRule();
					state._fsp--;

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_forRule1464); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:275:4: ( blockRule | instructionRule )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==LBR) ) {
				alt79=1;
			}
			else if ( (LA79_0==BREAK||(LA79_0 >= CONST && LA79_0 <= CONTINUE)||LA79_0==DEC||(LA79_0 >= DO && LA79_0 <= DOCUMENT)||(LA79_0 >= FOR && LA79_0 <= FUNCTION)||(LA79_0 >= ID && LA79_0 <= IF)||LA79_0==INC||LA79_0==LET||LA79_0==SWITCH||(LA79_0 >= THIS && LA79_0 <= THROW)||(LA79_0 >= TRY && LA79_0 <= TYPEOF)||LA79_0==VAR||LA79_0==WHILE) ) {
				alt79=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:275:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_forRule1470);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:275:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_forRule1474);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:278:1: forInitVarRule : ( VAR | LET )? idDotArrayRule ASSIGN ( expressionRule | assignTypologyRule ) ;
	public final void forInitVarRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:279:2: ( ( VAR | LET )? idDotArrayRule ASSIGN ( expressionRule | assignTypologyRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:280:3: ( VAR | LET )? idDotArrayRule ASSIGN ( expressionRule | assignTypologyRule )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:280:3: ( VAR | LET )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==LET||LA80_0==VAR) ) {
				alt80=1;
			}
			switch (alt80) {
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

			pushFollow(FOLLOW_idDotArrayRule_in_forInitVarRule1498);
			idDotArrayRule();
			state._fsp--;

			match(input,ASSIGN,FOLLOW_ASSIGN_in_forInitVarRule1500); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:280:38: ( expressionRule | assignTypologyRule )
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==DEC||LA81_0==DOCUMENT||LA81_0==FALSE||LA81_0==FLOAT||LA81_0==ID||LA81_0==INC||LA81_0==INTEGER||LA81_0==LP||LA81_0==STRING||LA81_0==THIS||LA81_0==TRUE) ) {
				alt81=1;
			}
			else if ( (LA81_0==FUNCTION||(LA81_0 >= LB && LA81_0 <= LBR)||LA81_0==NEW||LA81_0==NULL||LA81_0==UNDEFINED) ) {
				alt81=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:280:39: expressionRule
					{
					pushFollow(FOLLOW_expressionRule_in_forInitVarRule1503);
					expressionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:280:54: assignTypologyRule
					{
					pushFollow(FOLLOW_assignTypologyRule_in_forInitVarRule1505);
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



	// $ANTLR start "incDecRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:290:1: incDecRule returns [Token tk] : (o1= DEC |o2= INC );
	public final Token incDecRule() throws RecognitionException {
		Token tk = null;


		Token o1=null;
		Token o2=null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:291:2: (o1= DEC |o2= INC )
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==DEC) ) {
				alt82=1;
			}
			else if ( (LA82_0==INC) ) {
				alt82=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}

			switch (alt82) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:292:3: o1= DEC
					{
					o1=(Token)match(input,DEC,FOLLOW_DEC_in_incDecRule1540); 
					tk = o1;
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:293:4: o2= INC
					{
					o2=(Token)match(input,INC,FOLLOW_INC_in_incDecRule1553); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:296:1: whileRule : WHILE LP conditionRule RP ( blockRule | instructionRule ) ;
	public final void whileRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:297:2: ( WHILE LP conditionRule RP ( blockRule | instructionRule ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:298:3: WHILE LP conditionRule RP ( blockRule | instructionRule )
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileRule1572); 
			match(input,LP,FOLLOW_LP_in_whileRule1574); 
			pushFollow(FOLLOW_conditionRule_in_whileRule1576);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_whileRule1578); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:299:4: ( blockRule | instructionRule )
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==LBR) ) {
				alt83=1;
			}
			else if ( (LA83_0==BREAK||(LA83_0 >= CONST && LA83_0 <= CONTINUE)||LA83_0==DEC||(LA83_0 >= DO && LA83_0 <= DOCUMENT)||(LA83_0 >= FOR && LA83_0 <= FUNCTION)||(LA83_0 >= ID && LA83_0 <= IF)||LA83_0==INC||LA83_0==LET||LA83_0==SWITCH||(LA83_0 >= THIS && LA83_0 <= THROW)||(LA83_0 >= TRY && LA83_0 <= TYPEOF)||LA83_0==VAR||LA83_0==WHILE) ) {
				alt83=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}

			switch (alt83) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:299:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_whileRule1584);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:299:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_whileRule1588);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:302:1: doWhileRule : DO ( blockRule | instructionRule ) WHILE LP conditionRule RP ( SC )? ;
	public final void doWhileRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:303:2: ( DO ( blockRule | instructionRule ) WHILE LP conditionRule RP ( SC )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:304:3: DO ( blockRule | instructionRule ) WHILE LP conditionRule RP ( SC )?
			{
			match(input,DO,FOLLOW_DO_in_doWhileRule1602); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:305:4: ( blockRule | instructionRule )
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==LBR) ) {
				alt84=1;
			}
			else if ( (LA84_0==BREAK||(LA84_0 >= CONST && LA84_0 <= CONTINUE)||LA84_0==DEC||(LA84_0 >= DO && LA84_0 <= DOCUMENT)||(LA84_0 >= FOR && LA84_0 <= FUNCTION)||(LA84_0 >= ID && LA84_0 <= IF)||LA84_0==INC||LA84_0==LET||LA84_0==SWITCH||(LA84_0 >= THIS && LA84_0 <= THROW)||(LA84_0 >= TRY && LA84_0 <= TYPEOF)||LA84_0==VAR||LA84_0==WHILE) ) {
				alt84=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}

			switch (alt84) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:305:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_doWhileRule1608);
					blockRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:305:17: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_doWhileRule1612);
					instructionRule();
					state._fsp--;

					}
					break;

			}

			match(input,WHILE,FOLLOW_WHILE_in_doWhileRule1617); 
			match(input,LP,FOLLOW_LP_in_doWhileRule1619); 
			pushFollow(FOLLOW_conditionRule_in_doWhileRule1621);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_doWhileRule1623); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:306:29: ( SC )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==SC) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:306:29: SC
					{
					match(input,SC,FOLLOW_SC_in_doWhileRule1625); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:309:1: classRule : CLASS ID LBR ( functionDefinitionRule )* RBR ;
	public final void classRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:310:2: ( CLASS ID LBR ( functionDefinitionRule )* RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:311:3: CLASS ID LBR ( functionDefinitionRule )* RBR
			{
			match(input,CLASS,FOLLOW_CLASS_in_classRule1640); 
			match(input,ID,FOLLOW_ID_in_classRule1642); 
			match(input,LBR,FOLLOW_LBR_in_classRule1647); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:313:4: ( functionDefinitionRule )*
			loop86:
			while (true) {
				int alt86=2;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==FUNCTION) ) {
					alt86=1;
				}

				switch (alt86) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:313:4: functionDefinitionRule
					{
					pushFollow(FOLLOW_functionDefinitionRule_in_classRule1653);
					functionDefinitionRule();
					state._fsp--;

					}
					break;

				default :
					break loop86;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_classRule1658); 
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



	public static final BitSet FOLLOW_instructionRule_in_parseJava64 = new BitSet(new long[]{0x0A118C000C164402L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_parseJava70 = new BitSet(new long[]{0x0A118C000C164402L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_classRule_in_parseJava76 = new BitSet(new long[]{0x0A118C000C164402L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule92 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotIdRule95 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule97 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_STRING_in_factorTypologyRule117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_factorTypologyRule125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_factorTypologyRule134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factorTypologyRule144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factorTypologyRule153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_factorTypologyRule163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getRule_in_factorTypologyRule171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objectRule_in_assignTypologyRule188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRule_in_assignTypologyRule192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_assignTypologyRule196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNDEFINED_in_assignTypologyRule200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_assignTypologyRule204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newRule_in_assignTypologyRule208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incDecRule_in_idDotArrayRule230 = new BitSet(new long[]{0x0000800000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_THIS_in_idDotArrayRule237 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRule239 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_idDotIdRule_in_idDotArrayRule247 = new BitSet(new long[]{0x2110800010100002L});
	public static final BitSet FOLLOW_LB_in_idDotArrayRule253 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_idDotArrayRule255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_idDotArrayRule257 = new BitSet(new long[]{0x2110800010100002L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRule261 = new BitSet(new long[]{0x2010800000100002L});
	public static final BitSet FOLLOW_LP_in_idDotArrayRule268 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284100090L});
	public static final BitSet FOLLOW_parametersRule_in_idDotArrayRule270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_idDotArrayRule273 = new BitSet(new long[]{0x0010800010100002L});
	public static final BitSet FOLLOW_DOT_in_idDotArrayRule275 = new BitSet(new long[]{0x0010800000100002L});
	public static final BitSet FOLLOW_incDecRule_in_idDotArrayRule290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_parametersRule308 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expressionRule_in_parametersRule312 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_CM_in_parametersRule315 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_parametersRule318 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expressionRule_in_parametersRule322 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_termRule_in_expressionRule338 = new BitSet(new long[]{0x0000000000000012L,0x0000000008000002L});
	public static final BitSet FOLLOW_set_in_expressionRule341 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_termRule_in_expressionRule353 = new BitSet(new long[]{0x0000000000000012L,0x0000000008000002L});
	public static final BitSet FOLLOW_factorRule_in_termRule368 = new BitSet(new long[]{0x4000000401000042L,0x0000104000A00400L});
	public static final BitSet FOLLOW_set_in_termRule371 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_factorRule_in_termRule407 = new BitSet(new long[]{0x4000000401000042L,0x0000104000A00400L});
	public static final BitSet FOLLOW_factorTypologyRule_in_factorRule424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_factorRule430 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_factorRule432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_factorRule434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_instructionRule449 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_CONTINUE_in_instructionRule456 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_tryCatchRule_in_instructionRule463 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_instructionRule470 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_documentRule_in_instructionRule477 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_ifStatementRule_in_instructionRule483 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_switchCaseRule_in_instructionRule489 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_forRule_in_instructionRule496 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_whileRule_in_instructionRule503 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_doWhileRule_in_instructionRule510 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_throwRule_in_instructionRule517 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_typeOfRule_in_instructionRule523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_idStartingRule_in_instructionRule530 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_instructionRule532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THROW_in_throwRule547 = new BitSet(new long[]{0x0050828000100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_STRING_in_throwRule550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_throwRule554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_throwRule558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_throwRule562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_throwRule566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_throwRule570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPEOF_in_typeOfRule586 = new BitSet(new long[]{0x0300080000000000L,0x0000001000000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_typeOfRule588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRY_in_tryCatchRule605 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockRule_in_tryCatchRule607 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CATCH_in_tryCatchRule612 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_tryCatchRule614 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_tryCatchRule616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_tryCatchRule618 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockRule_in_tryCatchRule620 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_FINALLY_in_tryCatchRule626 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_blockRule_in_tryCatchRule628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnRule644 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_returnRule647 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_returnRule649 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_returnRule652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_functionDeclarationRule670 = new BitSet(new long[]{0x2000800000000000L});
	public static final BitSet FOLLOW_ID_in_functionDeclarationRule676 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_functionDeclarationRule681 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284100090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_functionDeclarationRule685 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_functionDeclarationRule687 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_functionDeclarationRule692 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_assignTypologyRule_in_functionDeclarationRule695 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionRule_in_functionDeclarationRule697 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_functionDeclarationRule705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclarationRule_in_functionDefinitionRule720 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_functionDefinitionRule724 = new BitSet(new long[]{0x08118C000C160400L,0x0000028DA00C0000L});
	public static final BitSet FOLLOW_instructionRule_in_functionDefinitionRule729 = new BitSet(new long[]{0x08118C000C160400L,0x0000028DA00C0000L});
	public static final BitSet FOLLOW_returnRule_in_functionDefinitionRule735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_functionDefinitionRule740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LB_in_arrayRule754 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284020090L});
	public static final BitSet FOLLOW_expressionRule_in_arrayRule765 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_arrayRule767 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_CM_in_arrayRule774 = new BitSet(new long[]{0x23508A8008108000L,0x0000001284020090L});
	public static final BitSet FOLLOW_expressionRule_in_arrayRule777 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_arrayRule779 = new BitSet(new long[]{0x0000000000008000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RB_in_arrayRule793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_objectRule808 = new BitSet(new long[]{0x0000800000000000L,0x0000000004040000L});
	public static final BitSet FOLLOW_set_in_objectRule818 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule830 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_objectRule837 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_objectRule839 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_CM_in_objectRule850 = new BitSet(new long[]{0x0000800000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_set_in_objectRule855 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_objectRule867 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_objectRule874 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_objectRule876 = new BitSet(new long[]{0x0000000000008000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_objectRule893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_variableDefinitionRule925 = new BitSet(new long[]{0x0000000802000082L,0x0000000001001005L});
	public static final BitSet FOLLOW_set_in_variableDefinitionRule930 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_variableDefinitionRule947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_variableDefinitionRule949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getRule_in_documentRule972 = new BitSet(new long[]{0x0000000000000082L,0x0000000000001000L});
	public static final BitSet FOLLOW_set_in_documentRule975 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_documentRule981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_documentRule983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOCUMENT_in_getRule1001 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_DOT_in_getRule1003 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_getRule1007 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_getRule1009 = new BitSet(new long[]{0x0010800000100000L,0x0000000084000000L});
	public static final BitSet FOLLOW_idDotArrayRule_in_getRule1013 = new BitSet(new long[]{0x0000000000000010L,0x0000000000100000L});
	public static final BitSet FOLLOW_STRING_in_getRule1015 = new BitSet(new long[]{0x0000000000000010L,0x0000000000100000L});
	public static final BitSet FOLLOW_ADD_in_getRule1019 = new BitSet(new long[]{0x0010800000100000L,0x0000000084000000L});
	public static final BitSet FOLLOW_idDotArrayRule_in_getRule1022 = new BitSet(new long[]{0x0000000000000010L,0x0000000000100000L});
	public static final BitSet FOLLOW_STRING_in_getRule1026 = new BitSet(new long[]{0x0000000000000010L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_getRule1034 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_DOT_in_getRule1037 = new BitSet(new long[]{0x0010800000100000L,0x0000000080000000L});
	public static final BitSet FOLLOW_idDotArrayRule_in_getRule1039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_idStartingRule1078 = new BitSet(new long[]{0x0020000802000082L,0x0000000001001005L});
	public static final BitSet FOLLOW_set_in_idStartingRule1083 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_idStartingRule1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_idStartingRule1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTANCEOF_in_idStartingRule1109 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_idStartingRule1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_newRule1127 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_newRule1129 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_newRule1131 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284100090L});
	public static final BitSet FOLLOW_expressionRule_in_newRule1135 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_newRule1137 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_CM_in_newRule1141 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_newRule1144 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_newRule1146 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_newRule1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_conditionRule1212 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_conditionRule1215 = new BitSet(new long[]{0x8400300080000022L,0x0000000040000248L});
	public static final BitSet FOLLOW_comparatorRule_in_conditionRule1218 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_NOT_in_conditionRule1220 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000000L});
	public static final BitSet FOLLOW_expressionRule_in_conditionRule1223 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000200L});
	public static final BitSet FOLLOW_set_in_conditionRule1230 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_conditionRule1236 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000200L});
	public static final BitSet FOLLOW_LBR_in_blockRule1251 = new BitSet(new long[]{0x0A118C000C160400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_blockRule1254 = new BitSet(new long[]{0x0A118C000C160400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_blockRule_in_blockRule1256 = new BitSet(new long[]{0x0A118C000C160400L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_RBR_in_blockRule1260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatementRule1274 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_ifStatementRule1276 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_ifStatementRule1278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ifStatementRule1280 = new BitSet(new long[]{0x0A118C000C160400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_ifStatementRule1287 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_instructionRule_in_ifStatementRule1291 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ELSE_in_ifStatementRule1297 = new BitSet(new long[]{0x0A118C000C160400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_IF_in_ifStatementRule1300 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_ifStatementRule1302 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_ifStatementRule1304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_ifStatementRule1306 = new BitSet(new long[]{0x0A118C000C160400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_ifStatementRule1311 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_instructionRule_in_ifStatementRule1315 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_SWITCH_in_switchCaseRule1336 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_switchCaseRule1338 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_switchCaseRule1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_switchCaseRule1343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_switchCaseRule1346 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_switchCaseRule1350 = new BitSet(new long[]{0x0000000000200800L,0x0000000000040000L});
	public static final BitSet FOLLOW_CASE_in_switchCaseRule1356 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_switchCaseRule1359 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_switchCaseRule1361 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_switchCaseRule1364 = new BitSet(new long[]{0x08118C000C360C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_switchCaseRule1370 = new BitSet(new long[]{0x08118C000C360C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_DEFAULT_in_switchCaseRule1383 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_switchCaseRule1385 = new BitSet(new long[]{0x08118C000C160C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_switchCaseRule1391 = new BitSet(new long[]{0x08118C000C160C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_CASE_in_switchCaseRule1404 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_switchCaseRule1407 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_assignTypologyRule_in_switchCaseRule1409 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CL_in_switchCaseRule1412 = new BitSet(new long[]{0x08118C000C160C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_instructionRule_in_switchCaseRule1418 = new BitSet(new long[]{0x08118C000C160C00L,0x0000028DA0040000L});
	public static final BitSet FOLLOW_RBR_in_switchCaseRule1429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forRule1447 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_forRule1449 = new BitSet(new long[]{0x0810800000100000L,0x0000008080400000L});
	public static final BitSet FOLLOW_forInitVarRule_in_forRule1451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_forRule1454 = new BitSet(new long[]{0x2050828008100000L,0x0000000284400020L});
	public static final BitSet FOLLOW_conditionRule_in_forRule1456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_forRule1459 = new BitSet(new long[]{0x0010800000100000L,0x0000000080100000L});
	public static final BitSet FOLLOW_idDotArrayRule_in_forRule1461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_forRule1464 = new BitSet(new long[]{0x0A118C000C160400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_forRule1470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionRule_in_forRule1474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idDotArrayRule_in_forInitVarRule1498 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_forInitVarRule1500 = new BitSet(new long[]{0x23508A8008100000L,0x0000001284000090L});
	public static final BitSet FOLLOW_expressionRule_in_forInitVarRule1503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignTypologyRule_in_forInitVarRule1505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_incDecRule1540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INC_in_incDecRule1553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileRule1572 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_whileRule1574 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_whileRule1576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_whileRule1578 = new BitSet(new long[]{0x0A118C000C160400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_whileRule1584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instructionRule_in_whileRule1588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_doWhileRule1602 = new BitSet(new long[]{0x0A118C000C160400L,0x0000028DA0000000L});
	public static final BitSet FOLLOW_blockRule_in_doWhileRule1608 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_instructionRule_in_doWhileRule1612 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_WHILE_in_doWhileRule1617 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LP_in_doWhileRule1619 = new BitSet(new long[]{0x2050828008100000L,0x0000000284000020L});
	public static final BitSet FOLLOW_conditionRule_in_doWhileRule1621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RP_in_doWhileRule1623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_SC_in_doWhileRule1625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classRule1640 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_ID_in_classRule1642 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBR_in_classRule1647 = new BitSet(new long[]{0x0000080000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_functionDefinitionRule_in_classRule1653 = new BitSet(new long[]{0x0000080000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_RBR_in_classRule1658 = new BitSet(new long[]{0x0000000000000002L});
}
