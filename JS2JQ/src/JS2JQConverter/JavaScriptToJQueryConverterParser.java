// $ANTLR 3.5.1 C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g 2023-05-23 17:07:07

	package JS2JQConverter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JavaScriptToJQueryConverterParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ADD", "AND", "AND_BIT", 
		"ASSERT", "ASSIGN", "AT", "BASIC_TYPE", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CL", "CLASS", "CM", "COMMENT", "CONTINUE", "DEC", "DEFAULT", 
		"DIGIT", "DIV", "DO", "DOCUMENT", "DOT", "ELSE", "ENDTEST", "ENUM", "EQ", 
		"ERROR_TK", "ESC_SEQ", "EXPONENT", "EXTENDS", "FINAL", "FINALLY", "FLOAT", 
		"FOR", "GE", "GT", "HEX_DIGIT", "ID", "IF", "IMPLEMENTS", "IMPORT", "INC", 
		"INSTANCEOF", "INTEGER", "INTERFACE", "LB", "LBR", "LE", "LETTER", "LP", 
		"LT", "MOD", "NATIVE", "NEQ", "NEW", "NOT", "OCTAL_ESC", "OR", "OR_BIT", 
		"PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RB", "RBR", "RETURN", "RP", 
		"SC", "STAR", "STATIC", "STRING", "SUB", "SUPER", "SWITCH", "SYNCHRONIZED", 
		"TEST", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "UNICODE_ESC", 
		"VOID", "VOLATILE", "WHILE", "WS", "XOR"
	};
	public static final int EOF=-1;
	public static final int ABSTRACT=4;
	public static final int ADD=5;
	public static final int AND=6;
	public static final int AND_BIT=7;
	public static final int ASSERT=8;
	public static final int ASSIGN=9;
	public static final int AT=10;
	public static final int BASIC_TYPE=11;
	public static final int BREAK=12;
	public static final int BYTE=13;
	public static final int CASE=14;
	public static final int CATCH=15;
	public static final int CHAR=16;
	public static final int CL=17;
	public static final int CLASS=18;
	public static final int CM=19;
	public static final int COMMENT=20;
	public static final int CONTINUE=21;
	public static final int DEC=22;
	public static final int DEFAULT=23;
	public static final int DIGIT=24;
	public static final int DIV=25;
	public static final int DO=26;
	public static final int DOCUMENT=27;
	public static final int DOT=28;
	public static final int ELSE=29;
	public static final int ENDTEST=30;
	public static final int ENUM=31;
	public static final int EQ=32;
	public static final int ERROR_TK=33;
	public static final int ESC_SEQ=34;
	public static final int EXPONENT=35;
	public static final int EXTENDS=36;
	public static final int FINAL=37;
	public static final int FINALLY=38;
	public static final int FLOAT=39;
	public static final int FOR=40;
	public static final int GE=41;
	public static final int GT=42;
	public static final int HEX_DIGIT=43;
	public static final int ID=44;
	public static final int IF=45;
	public static final int IMPLEMENTS=46;
	public static final int IMPORT=47;
	public static final int INC=48;
	public static final int INSTANCEOF=49;
	public static final int INTEGER=50;
	public static final int INTERFACE=51;
	public static final int LB=52;
	public static final int LBR=53;
	public static final int LE=54;
	public static final int LETTER=55;
	public static final int LP=56;
	public static final int LT=57;
	public static final int MOD=58;
	public static final int NATIVE=59;
	public static final int NEQ=60;
	public static final int NEW=61;
	public static final int NOT=62;
	public static final int OCTAL_ESC=63;
	public static final int OR=64;
	public static final int OR_BIT=65;
	public static final int PACKAGE=66;
	public static final int PRIVATE=67;
	public static final int PROTECTED=68;
	public static final int PUBLIC=69;
	public static final int RB=70;
	public static final int RBR=71;
	public static final int RETURN=72;
	public static final int RP=73;
	public static final int SC=74;
	public static final int STAR=75;
	public static final int STATIC=76;
	public static final int STRING=77;
	public static final int SUB=78;
	public static final int SUPER=79;
	public static final int SWITCH=80;
	public static final int SYNCHRONIZED=81;
	public static final int TEST=82;
	public static final int THIS=83;
	public static final int THROW=84;
	public static final int THROWS=85;
	public static final int TRANSIENT=86;
	public static final int TRY=87;
	public static final int UNICODE_ESC=88;
	public static final int VOID=89;
	public static final int VOLATILE=90;
	public static final int WHILE=91;
	public static final int WS=92;
	public static final int XOR=93;

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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:50:1: parseJava : getRule ;
	public final void parseJava() throws RecognitionException {
		initParser();
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:52:2: ( getRule )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:53:3: getRule
			{
			pushFollow(FOLLOW_getRule_in_parseJava64);
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:55:1: getRule : DOCUMENT DOT get= ID LP i= STRING RP SC ;
	public final void getRule() throws RecognitionException {
		Token get=null;
		Token i=null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:56:2: ( DOCUMENT DOT get= ID LP i= STRING RP SC )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:57:3: DOCUMENT DOT get= ID LP i= STRING RP SC
			{
			match(input,DOCUMENT,FOLLOW_DOCUMENT_in_getRule76); 
			System.out.println("Ho riconosciuto DOCUMENT");
			match(input,DOT,FOLLOW_DOT_in_getRule80); 
			get=(Token)match(input,ID,FOLLOW_ID_in_getRule84); 
			match(input,LP,FOLLOW_LP_in_getRule86); 
			i=(Token)match(input,STRING,FOLLOW_STRING_in_getRule90); 
			match(input,RP,FOLLOW_RP_in_getRule92); 
			match(input,SC,FOLLOW_SC_in_getRule94); 
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



	// $ANTLR start "prologRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:60:1: prologRule : ( packageDefintionRule )? ( importRule )* ;
	public final void prologRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:61:2: ( ( packageDefintionRule )? ( importRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:62:3: ( packageDefintionRule )? ( importRule )*
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:62:3: ( packageDefintionRule )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==PACKAGE) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:62:3: packageDefintionRule
					{
					pushFollow(FOLLOW_packageDefintionRule_in_prologRule109);
					packageDefintionRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:63:3: ( importRule )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==IMPORT) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:63:3: importRule
					{
					pushFollow(FOLLOW_importRule_in_prologRule114);
					importRule();
					state._fsp--;

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
	// $ANTLR end "prologRule"



	// $ANTLR start "packageDefintionRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:66:1: packageDefintionRule : PACKAGE ID ( DOT ID )* SC ;
	public final void packageDefintionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:67:2: ( PACKAGE ID ( DOT ID )* SC )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:68:3: PACKAGE ID ( DOT ID )* SC
			{
			match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDefintionRule129); 
			match(input,ID,FOLLOW_ID_in_packageDefintionRule131); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:68:14: ( DOT ID )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==DOT) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:68:15: DOT ID
					{
					match(input,DOT,FOLLOW_DOT_in_packageDefintionRule134); 
					match(input,ID,FOLLOW_ID_in_packageDefintionRule136); 
					}
					break;

				default :
					break loop3;
				}
			}

			match(input,SC,FOLLOW_SC_in_packageDefintionRule140); 
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
	// $ANTLR end "packageDefintionRule"



	// $ANTLR start "importRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:71:1: importRule : IMPORT ID ( importSubRule )? SC ;
	public final void importRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:72:2: ( IMPORT ID ( importSubRule )? SC )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:73:3: IMPORT ID ( importSubRule )? SC
			{
			match(input,IMPORT,FOLLOW_IMPORT_in_importRule154); 
			match(input,ID,FOLLOW_ID_in_importRule156); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:73:13: ( importSubRule )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==DOT) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:73:13: importSubRule
					{
					pushFollow(FOLLOW_importSubRule_in_importRule158);
					importSubRule();
					state._fsp--;

					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_importRule161); 
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
	// $ANTLR end "importRule"



	// $ANTLR start "importSubRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:75:1: importSubRule : DOT ( STAR | ID ( importSubRule )? ) ;
	public final void importSubRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:76:2: ( DOT ( STAR | ID ( importSubRule )? ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:3: DOT ( STAR | ID ( importSubRule )? )
			{
			match(input,DOT,FOLLOW_DOT_in_importSubRule174); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:7: ( STAR | ID ( importSubRule )? )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==STAR) ) {
				alt6=1;
			}
			else if ( (LA6_0==ID) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:77:9: STAR
					{
					match(input,STAR,FOLLOW_STAR_in_importSubRule178); 
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:7: ID ( importSubRule )?
					{
					match(input,ID,FOLLOW_ID_in_importSubRule186); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:10: ( importSubRule )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==DOT) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:78:10: importSubRule
							{
							pushFollow(FOLLOW_importSubRule_in_importSubRule188);
							importSubRule();
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
	// $ANTLR end "importSubRule"



	// $ANTLR start "classDefinitionRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:82:1: classDefinitionRule : modifiersRule CLASS ID ( extendsRule )? ( implementsRule )? LBR ( methodDefinitionRule | propertyDefinitionRule )* RBR ;
	public final void classDefinitionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:83:2: ( modifiersRule CLASS ID ( extendsRule )? ( implementsRule )? LBR ( methodDefinitionRule | propertyDefinitionRule )* RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:3: modifiersRule CLASS ID ( extendsRule )? ( implementsRule )? LBR ( methodDefinitionRule | propertyDefinitionRule )* RBR
			{
			pushFollow(FOLLOW_modifiersRule_in_classDefinitionRule209);
			modifiersRule();
			state._fsp--;

			match(input,CLASS,FOLLOW_CLASS_in_classDefinitionRule211); 
			match(input,ID,FOLLOW_ID_in_classDefinitionRule213); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:26: ( extendsRule )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==EXTENDS) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:26: extendsRule
					{
					pushFollow(FOLLOW_extendsRule_in_classDefinitionRule215);
					extendsRule();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:39: ( implementsRule )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==IMPLEMENTS) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:84:39: implementsRule
					{
					pushFollow(FOLLOW_implementsRule_in_classDefinitionRule218);
					implementsRule();
					state._fsp--;

					}
					break;

			}

			match(input,LBR,FOLLOW_LBR_in_classDefinitionRule225); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:86:5: ( methodDefinitionRule | propertyDefinitionRule )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==VOID) ) {
					alt9=1;
				}
				else if ( (LA9_0==BASIC_TYPE) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:86:7: methodDefinitionRule
					{
					pushFollow(FOLLOW_methodDefinitionRule_in_classDefinitionRule234);
					methodDefinitionRule();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:87:7: propertyDefinitionRule
					{
					pushFollow(FOLLOW_propertyDefinitionRule_in_classDefinitionRule242);
					propertyDefinitionRule();
					state._fsp--;

					}
					break;

				default :
					break loop9;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_classDefinitionRule250); 
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
	// $ANTLR end "classDefinitionRule"



	// $ANTLR start "modifiersRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:91:1: modifiersRule : ( PUBLIC )? ( ABSTRACT | FINAL )? ;
	public final void modifiersRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:92:2: ( ( PUBLIC )? ( ABSTRACT | FINAL )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:93:4: ( PUBLIC )? ( ABSTRACT | FINAL )?
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:93:4: ( PUBLIC )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==PUBLIC) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:93:4: PUBLIC
					{
					match(input,PUBLIC,FOLLOW_PUBLIC_in_modifiersRule266); 
					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:94:3: ( ABSTRACT | FINAL )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ABSTRACT||LA11_0==FINAL) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
					{
					if ( input.LA(1)==ABSTRACT||input.LA(1)==FINAL ) {
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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "modifiersRule"



	// $ANTLR start "idDotIdRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:98:1: idDotIdRule : ID ( DOT ID )* ;
	public final void idDotIdRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:99:2: ( ID ( DOT ID )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:3: ID ( DOT ID )*
			{
			match(input,ID,FOLLOW_ID_in_idDotIdRule296); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:6: ( DOT ID )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==DOT) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:100:7: DOT ID
					{
					match(input,DOT,FOLLOW_DOT_in_idDotIdRule299); 
					match(input,ID,FOLLOW_ID_in_idDotIdRule301); 
					}
					break;

				default :
					break loop12;
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



	// $ANTLR start "extendsRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:103:1: extendsRule : EXTENDS idDotIdRule ;
	public final void extendsRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:104:2: ( EXTENDS idDotIdRule )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:105:3: EXTENDS idDotIdRule
			{
			match(input,EXTENDS,FOLLOW_EXTENDS_in_extendsRule316); 
			pushFollow(FOLLOW_idDotIdRule_in_extendsRule318);
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
	// $ANTLR end "extendsRule"



	// $ANTLR start "implementsRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:108:1: implementsRule : IMPLEMENTS idDotIdRule ( CM idDotIdRule )* ;
	public final void implementsRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:109:2: ( IMPLEMENTS idDotIdRule ( CM idDotIdRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:3: IMPLEMENTS idDotIdRule ( CM idDotIdRule )*
			{
			match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_implementsRule332); 
			pushFollow(FOLLOW_idDotIdRule_in_implementsRule334);
			idDotIdRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:26: ( CM idDotIdRule )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==CM) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:110:27: CM idDotIdRule
					{
					match(input,CM,FOLLOW_CM_in_implementsRule337); 
					pushFollow(FOLLOW_idDotIdRule_in_implementsRule339);
					idDotIdRule();
					state._fsp--;

					}
					break;

				default :
					break loop13;
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
	// $ANTLR end "implementsRule"



	// $ANTLR start "methodDefinitionRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:114:1: methodDefinitionRule : VOID ID LP ( parameterRule ( CM parameterRule )* )? RP LBR ( instructionRule )* RBR ;
	public final void methodDefinitionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:115:2: ( VOID ID LP ( parameterRule ( CM parameterRule )* )? RP LBR ( instructionRule )* RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:3: VOID ID LP ( parameterRule ( CM parameterRule )* )? RP LBR ( instructionRule )* RBR
			{
			match(input,VOID,FOLLOW_VOID_in_methodDefinitionRule358); 
			match(input,ID,FOLLOW_ID_in_methodDefinitionRule360); 
			match(input,LP,FOLLOW_LP_in_methodDefinitionRule363); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:15: ( parameterRule ( CM parameterRule )* )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==BASIC_TYPE) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:16: parameterRule ( CM parameterRule )*
					{
					pushFollow(FOLLOW_parameterRule_in_methodDefinitionRule366);
					parameterRule();
					state._fsp--;

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:30: ( CM parameterRule )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==CM) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:116:32: CM parameterRule
							{
							match(input,CM,FOLLOW_CM_in_methodDefinitionRule370); 
							pushFollow(FOLLOW_parameterRule_in_methodDefinitionRule372);
							parameterRule();
							state._fsp--;

							}
							break;

						default :
							break loop14;
						}
					}

					}
					break;

			}

			match(input,RP,FOLLOW_RP_in_methodDefinitionRule378); 
			match(input,LBR,FOLLOW_LBR_in_methodDefinitionRule384); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:118:5: ( instructionRule )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==BASIC_TYPE||LA16_0==FOR||(LA16_0 >= ID && LA16_0 <= IF)||LA16_0==LBR||LA16_0==SC||LA16_0==TEST||LA16_0==WHILE) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:118:5: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_methodDefinitionRule391);
					instructionRule();
					state._fsp--;

					}
					break;

				default :
					break loop16;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_methodDefinitionRule397); 
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
	// $ANTLR end "methodDefinitionRule"



	// $ANTLR start "parameterRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:123:1: parameterRule : BASIC_TYPE ID ;
	public final void parameterRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:124:2: ( BASIC_TYPE ID )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:125:3: BASIC_TYPE ID
			{
			match(input,BASIC_TYPE,FOLLOW_BASIC_TYPE_in_parameterRule411); 
			match(input,ID,FOLLOW_ID_in_parameterRule413); 
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
	// $ANTLR end "parameterRule"



	// $ANTLR start "testRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:130:1: testRule[String caller] : TEST ( blockRule )+ ( ifStatementRule )? ( whileCycleRule )? ( forCycleRule )? SC ;
	public final void testRule(String caller) throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:130:25: ( TEST ( blockRule )+ ( ifStatementRule )? ( whileCycleRule )? ( forCycleRule )? SC )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:131:2: TEST ( blockRule )+ ( ifStatementRule )? ( whileCycleRule )? ( forCycleRule )? SC
			{
			match(input,TEST,FOLLOW_TEST_in_testRule428); 
			 int c=0; 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:132:3: ( blockRule )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==LBR) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:132:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_testRule436);
					blockRule();
					state._fsp--;

					c++;
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			 if (c!=5)
						System.err.println("Errore sul numero dei blocchi: " +c);
			 boolean flag=false;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:137:3: ( ifStatementRule )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==IF) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:137:4: ifStatementRule
					{
					pushFollow(FOLLOW_ifStatementRule_in_testRule456);
					ifStatementRule();
					state._fsp--;

					flag=true;
					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:3: ( whileCycleRule )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==WHILE) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:138:4: whileCycleRule
					{
					pushFollow(FOLLOW_whileCycleRule_in_testRule465);
					whileCycleRule();
					state._fsp--;

					flag=true;
					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:139:3: ( forCycleRule )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==FOR) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:139:4: forCycleRule
					{
					pushFollow(FOLLOW_forCycleRule_in_testRule475);
					forCycleRule();
					state._fsp--;

					flag=true;
					}
					break;

			}

			/*controllo */
			match(input,SC,FOLLOW_SC_in_testRule497); 
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
	// $ANTLR end "testRule"



	// $ANTLR start "instructionRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:147:1: instructionRule : ( SC | testRule[caller] | blockRule | ifStatementRule | forCycleRule | whileCycleRule | propertyDefinitionRule |n= ID (v= assignRule SC | methodCallRule SC ) ) ;
	public final void instructionRule() throws RecognitionException {
		Token n=null;
		float v =0.0f;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:148:2: ( ( SC | testRule[caller] | blockRule | ifStatementRule | forCycleRule | whileCycleRule | propertyDefinitionRule |n= ID (v= assignRule SC | methodCallRule SC ) ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:149:3: ( SC | testRule[caller] | blockRule | ifStatementRule | forCycleRule | whileCycleRule | propertyDefinitionRule |n= ID (v= assignRule SC | methodCallRule SC ) )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:149:3: ( SC | testRule[caller] | blockRule | ifStatementRule | forCycleRule | whileCycleRule | propertyDefinitionRule |n= ID (v= assignRule SC | methodCallRule SC ) )
			int alt22=8;
			switch ( input.LA(1) ) {
			case SC:
				{
				alt22=1;
				}
				break;
			case TEST:
				{
				alt22=2;
				}
				break;
			case LBR:
				{
				alt22=3;
				}
				break;
			case IF:
				{
				alt22=4;
				}
				break;
			case FOR:
				{
				alt22=5;
				}
				break;
			case WHILE:
				{
				alt22=6;
				}
				break;
			case BASIC_TYPE:
				{
				alt22=7;
				}
				break;
			case ID:
				{
				alt22=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:149:5: SC
					{
					match(input,SC,FOLLOW_SC_in_instructionRule511); 
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:150:5: testRule[caller]
					{
					pushFollow(FOLLOW_testRule_in_instructionRule517);
					testRule(caller);
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:151:5: blockRule
					{
					pushFollow(FOLLOW_blockRule_in_instructionRule525);
					blockRule();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:5: ifStatementRule
					{
					pushFollow(FOLLOW_ifStatementRule_in_instructionRule531);
					ifStatementRule();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:153:5: forCycleRule
					{
					pushFollow(FOLLOW_forCycleRule_in_instructionRule537);
					forCycleRule();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:5: whileCycleRule
					{
					pushFollow(FOLLOW_whileCycleRule_in_instructionRule543);
					whileCycleRule();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:5: propertyDefinitionRule
					{
					pushFollow(FOLLOW_propertyDefinitionRule_in_instructionRule555);
					propertyDefinitionRule();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:156:5: n= ID (v= assignRule SC | methodCallRule SC )
					{
					n=(Token)match(input,ID,FOLLOW_ID_in_instructionRule565); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:156:11: (v= assignRule SC | methodCallRule SC )
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==ASSIGN) ) {
						alt21=1;
					}
					else if ( (LA21_0==LP) ) {
						alt21=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}

					switch (alt21) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:156:13: v= assignRule SC
							{
							pushFollow(FOLLOW_assignRule_in_instructionRule572);
							v=assignRule();
							state._fsp--;

							match(input,SC,FOLLOW_SC_in_instructionRule574); 
								h.assignValue(n, v);	
							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:157:9: methodCallRule SC
							{
							pushFollow(FOLLOW_methodCallRule_in_instructionRule591);
							methodCallRule();
							state._fsp--;

							match(input,SC,FOLLOW_SC_in_instructionRule593); 
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
	// $ANTLR end "instructionRule"



	// $ANTLR start "forCycleRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:1: forCycleRule : FOR LP forInitVarRule SC conditionRule SC stepRule RP instructionRule ;
	public final void forCycleRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:163:2: ( FOR LP forInitVarRule SC conditionRule SC stepRule RP instructionRule )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:164:3: FOR LP forInitVarRule SC conditionRule SC stepRule RP instructionRule
			{
			match(input,FOR,FOLLOW_FOR_in_forCycleRule615); 
			match(input,LP,FOLLOW_LP_in_forCycleRule617); 
			pushFollow(FOLLOW_forInitVarRule_in_forCycleRule619);
			forInitVarRule();
			state._fsp--;

			match(input,SC,FOLLOW_SC_in_forCycleRule621); 
			pushFollow(FOLLOW_conditionRule_in_forCycleRule623);
			conditionRule();
			state._fsp--;

			match(input,SC,FOLLOW_SC_in_forCycleRule625); 
			pushFollow(FOLLOW_stepRule_in_forCycleRule627);
			stepRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_forCycleRule629); 
			pushFollow(FOLLOW_instructionRule_in_forCycleRule634);
			instructionRule();
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
	// $ANTLR end "forCycleRule"



	// $ANTLR start "forInitVarRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:168:1: forInitVarRule : ( BASIC_TYPE )? ID ASSIGN exprRule ;
	public final void forInitVarRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:169:2: ( ( BASIC_TYPE )? ID ASSIGN exprRule )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:170:3: ( BASIC_TYPE )? ID ASSIGN exprRule
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:170:3: ( BASIC_TYPE )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==BASIC_TYPE) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:170:3: BASIC_TYPE
					{
					match(input,BASIC_TYPE,FOLLOW_BASIC_TYPE_in_forInitVarRule647); 
					}
					break;

			}

			match(input,ID,FOLLOW_ID_in_forInitVarRule650); 
			match(input,ASSIGN,FOLLOW_ASSIGN_in_forInitVarRule652); 
			pushFollow(FOLLOW_exprRule_in_forInitVarRule654);
			exprRule();
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
	// $ANTLR end "forInitVarRule"



	// $ANTLR start "stepRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:174:1: stepRule : (o1= incDecRule )? i= ID (o2= incDecRule )? ;
	public final void stepRule() throws RecognitionException {
		Token i=null;
		Token o1 =null;
		Token o2 =null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:175:2: ( (o1= incDecRule )? i= ID (o2= incDecRule )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:176:3: (o1= incDecRule )? i= ID (o2= incDecRule )?
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:176:3: (o1= incDecRule )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==DEC||LA24_0==INC) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:176:4: o1= incDecRule
					{
					pushFollow(FOLLOW_incDecRule_in_stepRule671);
					o1=incDecRule();
					state._fsp--;

					}
					break;

			}

			i=(Token)match(input,ID,FOLLOW_ID_in_stepRule680); 
			h.checkReference (i);
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:178:3: (o2= incDecRule )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==DEC||LA25_0==INC) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:178:4: o2= incDecRule
					{
					pushFollow(FOLLOW_incDecRule_in_stepRule689);
					o2=incDecRule();
					state._fsp--;

					}
					break;

			}

			 h.checkIncDec(o1, o2, i); 
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
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:181:1: incDecRule returns [Token tk] : (o1= DEC |o2= INC );
	public final Token incDecRule() throws RecognitionException {
		Token tk = null;


		Token o1=null;
		Token o2=null;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:182:2: (o1= DEC |o2= INC )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==DEC) ) {
				alt26=1;
			}
			else if ( (LA26_0==INC) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:183:3: o1= DEC
					{
					o1=(Token)match(input,DEC,FOLLOW_DEC_in_incDecRule713); 
					tk = o1;
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:184:4: o2= INC
					{
					o2=(Token)match(input,INC,FOLLOW_INC_in_incDecRule724); 
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



	// $ANTLR start "whileCycleRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:1: whileCycleRule : WHILE LP conditionRule RP instructionRule ;
	public final void whileCycleRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:189:2: ( WHILE LP conditionRule RP instructionRule )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:190:3: WHILE LP conditionRule RP instructionRule
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileCycleRule742); 
			match(input,LP,FOLLOW_LP_in_whileCycleRule744); 
			pushFollow(FOLLOW_conditionRule_in_whileCycleRule746);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_whileCycleRule748); 
			pushFollow(FOLLOW_instructionRule_in_whileCycleRule753);
			instructionRule();
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
	// $ANTLR end "whileCycleRule"



	// $ANTLR start "methodCallRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:195:1: methodCallRule : LP exprRule ( CM exprRule )* RP ;
	public final void methodCallRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:196:2: ( LP exprRule ( CM exprRule )* RP )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:197:3: LP exprRule ( CM exprRule )* RP
			{
			match(input,LP,FOLLOW_LP_in_methodCallRule767); 
			pushFollow(FOLLOW_exprRule_in_methodCallRule769);
			exprRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:197:15: ( CM exprRule )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==CM) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:197:16: CM exprRule
					{
					match(input,CM,FOLLOW_CM_in_methodCallRule772); 
					pushFollow(FOLLOW_exprRule_in_methodCallRule774);
					exprRule();
					state._fsp--;

					}
					break;

				default :
					break loop27;
				}
			}

			match(input,RP,FOLLOW_RP_in_methodCallRule778); 
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
	// $ANTLR end "methodCallRule"



	// $ANTLR start "ifStatementRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:201:1: ifStatementRule : IF LP conditionRule RP instructionRule ( ELSE instructionRule )? ;
	public final void ifStatementRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:202:2: ( IF LP conditionRule RP instructionRule ( ELSE instructionRule )? )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:203:3: IF LP conditionRule RP instructionRule ( ELSE instructionRule )?
			{
			match(input,IF,FOLLOW_IF_in_ifStatementRule792); 
			match(input,LP,FOLLOW_LP_in_ifStatementRule794); 
			pushFollow(FOLLOW_conditionRule_in_ifStatementRule796);
			conditionRule();
			state._fsp--;

			match(input,RP,FOLLOW_RP_in_ifStatementRule798); 
			pushFollow(FOLLOW_instructionRule_in_ifStatementRule804);
			instructionRule();
			state._fsp--;

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:207:3: ( ELSE instructionRule )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==ELSE) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:207:5: ELSE instructionRule
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifStatementRule816); 
					pushFollow(FOLLOW_instructionRule_in_ifStatementRule818);
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
	// $ANTLR end "ifStatementRule"



	// $ANTLR start "conditionRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:1: conditionRule : exprRule comparatorRule exprRule ;
	public final void conditionRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:212:2: ( exprRule comparatorRule exprRule )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:213:3: exprRule comparatorRule exprRule
			{
			pushFollow(FOLLOW_exprRule_in_conditionRule839);
			exprRule();
			state._fsp--;

			pushFollow(FOLLOW_comparatorRule_in_conditionRule841);
			comparatorRule();
			state._fsp--;

			pushFollow(FOLLOW_exprRule_in_conditionRule843);
			exprRule();
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
	// $ANTLR end "conditionRule"



	// $ANTLR start "comparatorRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:216:1: comparatorRule : ( EQ | NEQ | LT | LE | GT | GE ) ;
	public final void comparatorRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:217:2: ( ( EQ | NEQ | LT | LE | GT | GE ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
			{
			if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NEQ ) {
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



	// $ANTLR start "blockRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:221:1: blockRule : LBR ( instructionRule )* RBR ;
	public final void blockRule() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:222:2: ( LBR ( instructionRule )* RBR )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:223:3: LBR ( instructionRule )* RBR
			{
			match(input,LBR,FOLLOW_LBR_in_blockRule895); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:223:7: ( instructionRule )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==BASIC_TYPE||LA29_0==FOR||(LA29_0 >= ID && LA29_0 <= IF)||LA29_0==LBR||LA29_0==SC||LA29_0==TEST||LA29_0==WHILE) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:223:7: instructionRule
					{
					pushFollow(FOLLOW_instructionRule_in_blockRule897);
					instructionRule();
					state._fsp--;

					}
					break;

				default :
					break loop29;
				}
			}

			match(input,RBR,FOLLOW_RBR_in_blockRule900); 
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



	// $ANTLR start "propertyDefinitionRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:1: propertyDefinitionRule : t= BASIC_TYPE n= ID (v= assignRule )? SC ;
	public final void propertyDefinitionRule() throws RecognitionException {
		Token t=null;
		Token n=null;
		float v =0.0f;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:228:2: (t= BASIC_TYPE n= ID (v= assignRule )? SC )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:229:3: t= BASIC_TYPE n= ID (v= assignRule )? SC
			{
			t=(Token)match(input,BASIC_TYPE,FOLLOW_BASIC_TYPE_in_propertyDefinitionRule918); 
			n=(Token)match(input,ID,FOLLOW_ID_in_propertyDefinitionRule922); 
				h.declareVar(t, n);	
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:230:3: (v= assignRule )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==ASSIGN) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:230:5: v= assignRule
					{
					pushFollow(FOLLOW_assignRule_in_propertyDefinitionRule934);
					v=assignRule();
					state._fsp--;

						h.assignValue(n, v);	
					}
					break;

			}

			match(input,SC,FOLLOW_SC_in_propertyDefinitionRule948); 
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
	// $ANTLR end "propertyDefinitionRule"



	// $ANTLR start "assignRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:235:1: assignRule returns [float v] : ASSIGN e= exprRule ;
	public final float assignRule() throws RecognitionException {
		float v = 0.0f;


		float e =0.0f;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:236:2: ( ASSIGN e= exprRule )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:236:4: ASSIGN e= exprRule
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assignRule965); 
			pushFollow(FOLLOW_exprRule_in_assignRule969);
			e=exprRule();
			state._fsp--;

			 v=e; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return v;
	}
	// $ANTLR end "assignRule"



	// $ANTLR start "exprRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:240:1: exprRule returns [float v] : t1= termRule ( (op= ADD |op= SUB ) t2= termRule )* ;
	public final float exprRule() throws RecognitionException {
		float v = 0.0f;


		Token op=null;
		float t1 =0.0f;
		float t2 =0.0f;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:241:2: (t1= termRule ( (op= ADD |op= SUB ) t2= termRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:242:3: t1= termRule ( (op= ADD |op= SUB ) t2= termRule )*
			{
			pushFollow(FOLLOW_termRule_in_exprRule992);
			t1=termRule();
			state._fsp--;

			 v = t1;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:3: ( (op= ADD |op= SUB ) t2= termRule )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==ADD||LA32_0==SUB) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:4: (op= ADD |op= SUB ) t2= termRule
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:4: (op= ADD |op= SUB )
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==ADD) ) {
						alt31=1;
					}
					else if ( (LA31_0==SUB) ) {
						alt31=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}

					switch (alt31) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:5: op= ADD
							{
							op=(Token)match(input,ADD,FOLLOW_ADD_in_exprRule1002); 
							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:14: op= SUB
							{
							op=(Token)match(input,SUB,FOLLOW_SUB_in_exprRule1008); 
							}
							break;

					}

					pushFollow(FOLLOW_termRule_in_exprRule1013);
					t2=termRule();
					state._fsp--;

					 v=h.calculateAdd(v, op, t2); 
					}
					break;

				default :
					break loop32;
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
		return v;
	}
	// $ANTLR end "exprRule"



	// $ANTLR start "termRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:246:1: termRule returns [float v] : f1= factorRule ( (op= STAR |op= DIV ) f2= factorRule )* ;
	public final float termRule() throws RecognitionException {
		float v = 0.0f;


		Token op=null;
		float f1 =0.0f;
		float f2 =0.0f;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:247:2: (f1= factorRule ( (op= STAR |op= DIV ) f2= factorRule )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:248:3: f1= factorRule ( (op= STAR |op= DIV ) f2= factorRule )*
			{
			pushFollow(FOLLOW_factorRule_in_termRule1042);
			f1=factorRule();
			state._fsp--;

			 v = f1;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:249:3: ( (op= STAR |op= DIV ) f2= factorRule )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==DIV||LA34_0==STAR) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:249:5: (op= STAR |op= DIV ) f2= factorRule
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:249:5: (op= STAR |op= DIV )
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==STAR) ) {
						alt33=1;
					}
					else if ( (LA33_0==DIV) ) {
						alt33=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}

					switch (alt33) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:249:6: op= STAR
							{
							op=(Token)match(input,STAR,FOLLOW_STAR_in_termRule1054); 
							}
							break;
						case 2 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:249:16: op= DIV
							{
							op=(Token)match(input,DIV,FOLLOW_DIV_in_termRule1060); 
							}
							break;

					}

					pushFollow(FOLLOW_factorRule_in_termRule1065);
					f2=factorRule();
					state._fsp--;

					 v=h.calculateMul(v, op, f2); 
					}
					break;

				default :
					break loop34;
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
		return v;
	}
	// $ANTLR end "termRule"



	// $ANTLR start "factorRule"
	// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:253:1: factorRule returns [float v] : (x= ID |i= INTEGER |f= FLOAT | LP e= exprRule RP );
	public final float factorRule() throws RecognitionException {
		float v = 0.0f;


		Token x=null;
		Token i=null;
		Token f=null;
		float e =0.0f;

		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:254:2: (x= ID |i= INTEGER |f= FLOAT | LP e= exprRule RP )
			int alt35=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt35=1;
				}
				break;
			case INTEGER:
				{
				alt35=2;
				}
				break;
			case FLOAT:
				{
				alt35=3;
				}
				break;
			case LP:
				{
				alt35=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:255:4: x= ID
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_factorRule1094); 
					 v=h.getVarValue(x);
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:256:5: i= INTEGER
					{
					i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_factorRule1110); 
					 v=h.convertToFloat(i);
					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:257:5: f= FLOAT
					{
					f=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_factorRule1123); 
					 v=h.convertToFloat(f);
					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:258:5: LP e= exprRule RP
					{
					match(input,LP,FOLLOW_LP_in_factorRule1135); 
					pushFollow(FOLLOW_exprRule_in_factorRule1139);
					e=exprRule();
					state._fsp--;

					match(input,RP,FOLLOW_RP_in_factorRule1141); 
					 v = e; 
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
		return v;
	}
	// $ANTLR end "factorRule"

	// Delegated rules



	public static final BitSet FOLLOW_getRule_in_parseJava64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOCUMENT_in_getRule76 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_DOT_in_getRule80 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_ID_in_getRule84 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LP_in_getRule86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_STRING_in_getRule90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_RP_in_getRule92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_getRule94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_packageDefintionRule_in_prologRule109 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_importRule_in_prologRule114 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_PACKAGE_in_packageDefintionRule129 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_ID_in_packageDefintionRule131 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_DOT_in_packageDefintionRule134 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_ID_in_packageDefintionRule136 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_packageDefintionRule140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPORT_in_importRule154 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_ID_in_importRule156 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_importSubRule_in_importRule158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_importRule161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_importSubRule174 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_STAR_in_importSubRule178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_importSubRule186 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_importSubRule_in_importSubRule188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiersRule_in_classDefinitionRule209 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CLASS_in_classDefinitionRule211 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_ID_in_classDefinitionRule213 = new BitSet(new long[]{0x0020401000000000L});
	public static final BitSet FOLLOW_extendsRule_in_classDefinitionRule215 = new BitSet(new long[]{0x0020400000000000L});
	public static final BitSet FOLLOW_implementsRule_in_classDefinitionRule218 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LBR_in_classDefinitionRule225 = new BitSet(new long[]{0x0000000000000800L,0x0000000002000080L});
	public static final BitSet FOLLOW_methodDefinitionRule_in_classDefinitionRule234 = new BitSet(new long[]{0x0000000000000800L,0x0000000002000080L});
	public static final BitSet FOLLOW_propertyDefinitionRule_in_classDefinitionRule242 = new BitSet(new long[]{0x0000000000000800L,0x0000000002000080L});
	public static final BitSet FOLLOW_RBR_in_classDefinitionRule250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUBLIC_in_modifiersRule266 = new BitSet(new long[]{0x0000002000000012L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule296 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_DOT_in_idDotIdRule299 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_ID_in_idDotIdRule301 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_EXTENDS_in_extendsRule316 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_idDotIdRule_in_extendsRule318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPLEMENTS_in_implementsRule332 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_idDotIdRule_in_implementsRule334 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_CM_in_implementsRule337 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_idDotIdRule_in_implementsRule339 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_VOID_in_methodDefinitionRule358 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_ID_in_methodDefinitionRule360 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LP_in_methodDefinitionRule363 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000200L});
	public static final BitSet FOLLOW_parameterRule_in_methodDefinitionRule366 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_methodDefinitionRule370 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_parameterRule_in_methodDefinitionRule372 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000200L});
	public static final BitSet FOLLOW_RP_in_methodDefinitionRule378 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LBR_in_methodDefinitionRule384 = new BitSet(new long[]{0x0020310000000800L,0x0000000008040480L});
	public static final BitSet FOLLOW_instructionRule_in_methodDefinitionRule391 = new BitSet(new long[]{0x0020310000000800L,0x0000000008040480L});
	public static final BitSet FOLLOW_RBR_in_methodDefinitionRule397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BASIC_TYPE_in_parameterRule411 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_ID_in_parameterRule413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEST_in_testRule428 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_blockRule_in_testRule436 = new BitSet(new long[]{0x0020210000000000L,0x0000000008000400L});
	public static final BitSet FOLLOW_ifStatementRule_in_testRule456 = new BitSet(new long[]{0x0000010000000000L,0x0000000008000400L});
	public static final BitSet FOLLOW_whileCycleRule_in_testRule465 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_forCycleRule_in_testRule475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_testRule497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SC_in_instructionRule511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_testRule_in_instructionRule517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blockRule_in_instructionRule525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatementRule_in_instructionRule531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forCycleRule_in_instructionRule537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileCycleRule_in_instructionRule543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyDefinitionRule_in_instructionRule555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_instructionRule565 = new BitSet(new long[]{0x0100000000000200L});
	public static final BitSet FOLLOW_assignRule_in_instructionRule572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_instructionRule574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallRule_in_instructionRule591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_instructionRule593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forCycleRule615 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LP_in_forCycleRule617 = new BitSet(new long[]{0x0000100000000800L});
	public static final BitSet FOLLOW_forInitVarRule_in_forCycleRule619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_forCycleRule621 = new BitSet(new long[]{0x0104108000000000L});
	public static final BitSet FOLLOW_conditionRule_in_forCycleRule623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_forCycleRule625 = new BitSet(new long[]{0x0001100000400000L});
	public static final BitSet FOLLOW_stepRule_in_forCycleRule627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_RP_in_forCycleRule629 = new BitSet(new long[]{0x0020310000000800L,0x0000000008040400L});
	public static final BitSet FOLLOW_instructionRule_in_forCycleRule634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BASIC_TYPE_in_forInitVarRule647 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_ID_in_forInitVarRule650 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ASSIGN_in_forInitVarRule652 = new BitSet(new long[]{0x0104108000000000L});
	public static final BitSet FOLLOW_exprRule_in_forInitVarRule654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incDecRule_in_stepRule671 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_ID_in_stepRule680 = new BitSet(new long[]{0x0001000000400002L});
	public static final BitSet FOLLOW_incDecRule_in_stepRule689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_incDecRule713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INC_in_incDecRule724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileCycleRule742 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LP_in_whileCycleRule744 = new BitSet(new long[]{0x0104108000000000L});
	public static final BitSet FOLLOW_conditionRule_in_whileCycleRule746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_RP_in_whileCycleRule748 = new BitSet(new long[]{0x0020310000000800L,0x0000000008040400L});
	public static final BitSet FOLLOW_instructionRule_in_whileCycleRule753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_methodCallRule767 = new BitSet(new long[]{0x0104108000000000L});
	public static final BitSet FOLLOW_exprRule_in_methodCallRule769 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000200L});
	public static final BitSet FOLLOW_CM_in_methodCallRule772 = new BitSet(new long[]{0x0104108000000000L});
	public static final BitSet FOLLOW_exprRule_in_methodCallRule774 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000200L});
	public static final BitSet FOLLOW_RP_in_methodCallRule778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatementRule792 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LP_in_ifStatementRule794 = new BitSet(new long[]{0x0104108000000000L});
	public static final BitSet FOLLOW_conditionRule_in_ifStatementRule796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_RP_in_ifStatementRule798 = new BitSet(new long[]{0x0020310000000800L,0x0000000008040400L});
	public static final BitSet FOLLOW_instructionRule_in_ifStatementRule804 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ELSE_in_ifStatementRule816 = new BitSet(new long[]{0x0020310000000800L,0x0000000008040400L});
	public static final BitSet FOLLOW_instructionRule_in_ifStatementRule818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprRule_in_conditionRule839 = new BitSet(new long[]{0x1240060100000000L});
	public static final BitSet FOLLOW_comparatorRule_in_conditionRule841 = new BitSet(new long[]{0x0104108000000000L});
	public static final BitSet FOLLOW_exprRule_in_conditionRule843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_blockRule895 = new BitSet(new long[]{0x0020310000000800L,0x0000000008040480L});
	public static final BitSet FOLLOW_instructionRule_in_blockRule897 = new BitSet(new long[]{0x0020310000000800L,0x0000000008040480L});
	public static final BitSet FOLLOW_RBR_in_blockRule900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BASIC_TYPE_in_propertyDefinitionRule918 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_ID_in_propertyDefinitionRule922 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000400L});
	public static final BitSet FOLLOW_assignRule_in_propertyDefinitionRule934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_SC_in_propertyDefinitionRule948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_assignRule965 = new BitSet(new long[]{0x0104108000000000L});
	public static final BitSet FOLLOW_exprRule_in_assignRule969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_termRule_in_exprRule992 = new BitSet(new long[]{0x0000000000000022L,0x0000000000004000L});
	public static final BitSet FOLLOW_ADD_in_exprRule1002 = new BitSet(new long[]{0x0104108000000000L});
	public static final BitSet FOLLOW_SUB_in_exprRule1008 = new BitSet(new long[]{0x0104108000000000L});
	public static final BitSet FOLLOW_termRule_in_exprRule1013 = new BitSet(new long[]{0x0000000000000022L,0x0000000000004000L});
	public static final BitSet FOLLOW_factorRule_in_termRule1042 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_STAR_in_termRule1054 = new BitSet(new long[]{0x0104108000000000L});
	public static final BitSet FOLLOW_DIV_in_termRule1060 = new BitSet(new long[]{0x0104108000000000L});
	public static final BitSet FOLLOW_factorRule_in_termRule1065 = new BitSet(new long[]{0x0000000002000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_factorRule1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_factorRule1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_factorRule1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_factorRule1135 = new BitSet(new long[]{0x0104108000000000L});
	public static final BitSet FOLLOW_exprRule_in_factorRule1139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_RP_in_factorRule1141 = new BitSet(new long[]{0x0000000000000002L});
}
