// $ANTLR 3.5.1 C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g 2023-05-23 17:01:00

	package JS2JQConverter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JavaScriptToJQueryConverterLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public JavaScriptToJQueryConverterLexer() {} 
	public JavaScriptToJQueryConverterLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public JavaScriptToJQueryConverterLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g"; }

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:268:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:268:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:268:22: ( '+' | '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:268:33: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:271:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:275:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt3=1;
					}
					break;
				case 'u':
					{
					alt3=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt3=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:275:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:276:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:277:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:282:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt4=3;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\\') ) {
				int LA4_1 = input.LA(2);
				if ( ((LA4_1 >= '0' && LA4_1 <= '3')) ) {
					int LA4_2 = input.LA(3);
					if ( ((LA4_2 >= '0' && LA4_2 <= '7')) ) {
						int LA4_4 = input.LA(4);
						if ( ((LA4_4 >= '0' && LA4_4 <= '7')) ) {
							alt4=1;
						}

						else {
							alt4=2;
						}

					}

					else {
						alt4=3;
					}

				}
				else if ( ((LA4_1 >= '4' && LA4_1 <= '7')) ) {
					int LA4_3 = input.LA(3);
					if ( ((LA4_3 >= '0' && LA4_3 <= '7')) ) {
						alt4=2;
					}

					else {
						alt4=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:282:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:283:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:284:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:289:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:289:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:293:8: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:295:7: ( '0' .. '9' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "DOCUMENT"
	public final void mDOCUMENT() throws RecognitionException {
		try {
			int _type = DOCUMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:297:2: ( 'document' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:297:3: 'document'
			{
			match("document"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOCUMENT"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:299:8: ( '=' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:299:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:301:7: ( '==' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:301:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:302:7: ( '!=' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:302:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:303:7: ( '>' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:303:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:304:6: ( '>=' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:304:8: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:305:7: ( '<' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:305:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:306:7: ( '<=' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:306:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:309:4: ( '@' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:309:6: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "CL"
	public final void mCL() throws RecognitionException {
		try {
			int _type = CL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:310:5: ( ':' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:310:7: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CL"

	// $ANTLR start "CM"
	public final void mCM() throws RecognitionException {
		try {
			int _type = CM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:311:5: ( ',' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:311:7: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CM"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:312:5: ( '.' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:312:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "SC"
	public final void mSC() throws RecognitionException {
		try {
			int _type = SC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:313:5: ( ';' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:313:7: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SC"

	// $ANTLR start "LP"
	public final void mLP() throws RecognitionException {
		try {
			int _type = LP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:316:5: ( '(' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:316:7: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LP"

	// $ANTLR start "RP"
	public final void mRP() throws RecognitionException {
		try {
			int _type = RP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:317:5: ( ')' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:317:7: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RP"

	// $ANTLR start "LB"
	public final void mLB() throws RecognitionException {
		try {
			int _type = LB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:318:4: ( '[' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:318:6: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LB"

	// $ANTLR start "RB"
	public final void mRB() throws RecognitionException {
		try {
			int _type = RB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:319:4: ( ']' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:319:6: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RB"

	// $ANTLR start "LBR"
	public final void mLBR() throws RecognitionException {
		try {
			int _type = LBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:320:5: ( '{' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:320:7: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBR"

	// $ANTLR start "RBR"
	public final void mRBR() throws RecognitionException {
		try {
			int _type = RBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:321:5: ( '}' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:321:7: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBR"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:324:6: ( '+' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:324:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:325:6: ( '-' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:325:8: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:326:6: ( '*' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:326:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:327:6: ( '/' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:327:8: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:328:6: ( '%' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:328:8: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "INC"
	public final void mINC() throws RecognitionException {
		try {
			int _type = INC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:329:6: ( '++' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:329:8: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INC"

	// $ANTLR start "DEC"
	public final void mDEC() throws RecognitionException {
		try {
			int _type = DEC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:330:6: ( '--' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:330:8: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:333:7: ( '!' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:333:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:334:7: ( '&&' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:334:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:335:6: ( '||' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:335:8: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "XOR"
	public final void mXOR() throws RecognitionException {
		try {
			int _type = XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:336:7: ( '^' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:336:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XOR"

	// $ANTLR start "AND_BIT"
	public final void mAND_BIT() throws RecognitionException {
		try {
			int _type = AND_BIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:337:9: ( '&' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:337:11: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND_BIT"

	// $ANTLR start "OR_BIT"
	public final void mOR_BIT() throws RecognitionException {
		try {
			int _type = OR_BIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:338:9: ( '|' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:338:11: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_BIT"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:341:10: ( 'void' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:341:12: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "BASIC_TYPE"
	public final void mBASIC_TYPE() throws RecognitionException {
		try {
			int _type = BASIC_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:343:13: ( 'int' | 'long' | 'short' | 'float' | 'double' | 'boolean' | 'char' | 'String' )
			int alt5=8;
			switch ( input.LA(1) ) {
			case 'i':
				{
				alt5=1;
				}
				break;
			case 'l':
				{
				alt5=2;
				}
				break;
			case 's':
				{
				alt5=3;
				}
				break;
			case 'f':
				{
				alt5=4;
				}
				break;
			case 'd':
				{
				alt5=5;
				}
				break;
			case 'b':
				{
				alt5=6;
				}
				break;
			case 'c':
				{
				alt5=7;
				}
				break;
			case 'S':
				{
				alt5=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:343:15: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:343:24: 'long'
					{
					match("long"); 

					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:343:34: 'short'
					{
					match("short"); 

					}
					break;
				case 4 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:344:8: 'float'
					{
					match("float"); 

					}
					break;
				case 5 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:344:18: 'double'
					{
					match("double"); 

					}
					break;
				case 6 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:344:29: 'boolean'
					{
					match("boolean"); 

					}
					break;
				case 7 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:345:8: 'char'
					{
					match("char"); 

					}
					break;
				case 8 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:345:17: 'String'
					{
					match("String"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BASIC_TYPE"

	// $ANTLR start "ABSTRACT"
	public final void mABSTRACT() throws RecognitionException {
		try {
			int _type = ABSTRACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:359:12: ( 'abstract' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:359:14: 'abstract'
			{
			match("abstract"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ABSTRACT"

	// $ANTLR start "ASSERT"
	public final void mASSERT() throws RecognitionException {
		try {
			int _type = ASSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:360:11: ( 'assert' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:360:13: 'assert'
			{
			match("assert"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSERT"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:361:11: ( 'break' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:361:13: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "BYTE"
	public final void mBYTE() throws RecognitionException {
		try {
			int _type = BYTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:362:10: ( 'byte' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:362:12: 'byte'
			{
			match("byte"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BYTE"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:363:10: ( 'case' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:363:12: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "CATCH"
	public final void mCATCH() throws RecognitionException {
		try {
			int _type = CATCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:364:11: ( 'catch' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:364:13: 'catch'
			{
			match("catch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CATCH"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:365:11: ( 'class' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:365:13: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASS"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:366:12: ( 'continue' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:366:14: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:367:12: ( 'default' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:367:14: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:368:9: ( 'do' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:368:11: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:369:10: ( 'else' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:369:12: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "ENUM"
	public final void mENUM() throws RecognitionException {
		try {
			int _type = ENUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:370:10: ( 'enum' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:370:12: 'enum'
			{
			match("enum"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENUM"

	// $ANTLR start "EXTENDS"
	public final void mEXTENDS() throws RecognitionException {
		try {
			int _type = EXTENDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:371:12: ( 'extends' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:371:14: 'extends'
			{
			match("extends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTENDS"

	// $ANTLR start "FINAL"
	public final void mFINAL() throws RecognitionException {
		try {
			int _type = FINAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:372:11: ( 'final' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:372:13: 'final'
			{
			match("final"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FINAL"

	// $ANTLR start "FINALLY"
	public final void mFINALLY() throws RecognitionException {
		try {
			int _type = FINALLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:373:12: ( 'finally' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:373:14: 'finally'
			{
			match("finally"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FINALLY"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:374:10: ( 'for' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:374:12: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:375:9: ( 'if' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:375:11: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "IMPLEMENTS"
	public final void mIMPLEMENTS() throws RecognitionException {
		try {
			int _type = IMPLEMENTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:376:13: ( 'implements' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:376:15: 'implements'
			{
			match("implements"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPLEMENTS"

	// $ANTLR start "IMPORT"
	public final void mIMPORT() throws RecognitionException {
		try {
			int _type = IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:377:11: ( 'import' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:377:13: 'import'
			{
			match("import"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPORT"

	// $ANTLR start "INSTANCEOF"
	public final void mINSTANCEOF() throws RecognitionException {
		try {
			int _type = INSTANCEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:378:13: ( 'instanceof' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:378:15: 'instanceof'
			{
			match("instanceof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSTANCEOF"

	// $ANTLR start "INTERFACE"
	public final void mINTERFACE() throws RecognitionException {
		try {
			int _type = INTERFACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:379:13: ( 'interface' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:379:15: 'interface'
			{
			match("interface"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTERFACE"

	// $ANTLR start "NATIVE"
	public final void mNATIVE() throws RecognitionException {
		try {
			int _type = NATIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:380:11: ( 'native' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:380:13: 'native'
			{
			match("native"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NATIVE"

	// $ANTLR start "NEW"
	public final void mNEW() throws RecognitionException {
		try {
			int _type = NEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:381:10: ( 'new' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:381:12: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW"

	// $ANTLR start "PACKAGE"
	public final void mPACKAGE() throws RecognitionException {
		try {
			int _type = PACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:382:12: ( 'package' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:382:14: 'package'
			{
			match("package"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PACKAGE"

	// $ANTLR start "PRIVATE"
	public final void mPRIVATE() throws RecognitionException {
		try {
			int _type = PRIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:383:12: ( 'private' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:383:14: 'private'
			{
			match("private"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRIVATE"

	// $ANTLR start "PROTECTED"
	public final void mPROTECTED() throws RecognitionException {
		try {
			int _type = PROTECTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:384:13: ( 'protected' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:384:15: 'protected'
			{
			match("protected"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROTECTED"

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:385:11: ( 'public' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:385:13: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUBLIC"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:386:11: ( 'return' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:386:13: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "STATIC"
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:387:11: ( 'static' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:387:13: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATIC"

	// $ANTLR start "SUPER"
	public final void mSUPER() throws RecognitionException {
		try {
			int _type = SUPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:388:11: ( 'super' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:388:13: 'super'
			{
			match("super"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUPER"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:389:11: ( 'switch' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:389:13: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH"

	// $ANTLR start "SYNCHRONIZED"
	public final void mSYNCHRONIZED() throws RecognitionException {
		try {
			int _type = SYNCHRONIZED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:390:14: ( 'synchronized' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:390:16: 'synchronized'
			{
			match("synchronized"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYNCHRONIZED"

	// $ANTLR start "TEST"
	public final void mTEST() throws RecognitionException {
		try {
			int _type = TEST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:391:11: ( 'XXX' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:391:13: 'XXX'
			{
			match("XXX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEST"

	// $ANTLR start "ENDTEST"
	public final void mENDTEST() throws RecognitionException {
		try {
			int _type = ENDTEST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:392:12: ( 'YYY' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:392:14: 'YYY'
			{
			match("YYY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDTEST"

	// $ANTLR start "THIS"
	public final void mTHIS() throws RecognitionException {
		try {
			int _type = THIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:393:10: ( 'this' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:393:12: 'this'
			{
			match("this"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THIS"

	// $ANTLR start "THROW"
	public final void mTHROW() throws RecognitionException {
		try {
			int _type = THROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:394:11: ( 'throw' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:394:13: 'throw'
			{
			match("throw"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THROW"

	// $ANTLR start "THROWS"
	public final void mTHROWS() throws RecognitionException {
		try {
			int _type = THROWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:395:11: ( 'throws' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:395:13: 'throws'
			{
			match("throws"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THROWS"

	// $ANTLR start "TRANSIENT"
	public final void mTRANSIENT() throws RecognitionException {
		try {
			int _type = TRANSIENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:396:13: ( 'transient' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:396:15: 'transient'
			{
			match("transient"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRANSIENT"

	// $ANTLR start "TRY"
	public final void mTRY() throws RecognitionException {
		try {
			int _type = TRY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:397:10: ( 'try' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:397:12: 'try'
			{
			match("try"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRY"

	// $ANTLR start "VOLATILE"
	public final void mVOLATILE() throws RecognitionException {
		try {
			int _type = VOLATILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:398:12: ( 'volatile' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:398:14: 'volatile'
			{
			match("volatile"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOLATILE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:399:11: ( 'while' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:399:13: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:402:5: ( ( LETTER | '_' ) ( LETTER | DIGIT | '_' )* )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:402:7: ( LETTER | '_' ) ( LETTER | DIGIT | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:403:4: ( LETTER | DIGIT | '_' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:407:9: ( ( DIGIT )+ )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:407:11: ( DIGIT )+
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:407:11: ( DIGIT )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:411:5: ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT )
			int alt14=3;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:411:9: ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )?
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:411:9: ( DIGIT )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					match('.'); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:411:20: ( DIGIT )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop9;
						}
					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:411:27: ( EXPONENT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:411:27: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:412:9: '.' ( DIGIT )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:412:13: ( DIGIT )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:412:20: ( EXPONENT )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='E'||LA12_0=='e') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:412:20: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:413:9: ( DIGIT )+ EXPONENT
					{
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:413:9: ( DIGIT )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:417:5: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' ) )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:417:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:417:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='/') ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1=='/') ) {
					alt18=1;
				}
				else if ( (LA18_1=='*') ) {
					alt18=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:417:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:417:15: (~ ( '\\n' | '\\r' ) )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\uFFFF')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop15;
						}
					}

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:417:29: ( '\\r' )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0=='\r') ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:417:29: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:418:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:418:14: ( options {greedy=false; } : . )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0=='*') ) {
							int LA17_1 = input.LA(2);
							if ( (LA17_1=='/') ) {
								alt17=2;
							}
							else if ( ((LA17_1 >= '\u0000' && LA17_1 <= '.')||(LA17_1 >= '0' && LA17_1 <= '\uFFFF')) ) {
								alt17=1;
							}

						}
						else if ( ((LA17_0 >= '\u0000' && LA17_0 <= ')')||(LA17_0 >= '+' && LA17_0 <= '\uFFFF')) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:418:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop17;
						}
					}

					match("*/"); 

					}
					break;

			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:421:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:421:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:421:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( ((LA19_0 >= '\t' && LA19_0 <= '\n')||LA19_0=='\r'||LA19_0==' ') ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:428:10: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:428:13: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:428:17: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop20:
			while (true) {
				int alt20=3;
				int LA20_0 = input.LA(1);
				if ( (LA20_0=='\\') ) {
					alt20=1;
				}
				else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '!')||(LA20_0 >= '#' && LA20_0 <= '[')||(LA20_0 >= ']' && LA20_0 <= '\uFFFF')) ) {
					alt20=2;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:428:19: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:428:29: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop20;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:430:9: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:430:12: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:430:17: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='\\') ) {
				alt21=1;
			}
			else if ( ((LA21_0 >= '\u0000' && LA21_0 <= '&')||(LA21_0 >= '(' && LA21_0 <= '[')||(LA21_0 >= ']' && LA21_0 <= '\uFFFF')) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:430:19: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:430:29: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "ERROR_TK"
	public final void mERROR_TK() throws RecognitionException {
		try {
			int _type = ERROR_TK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:432:11: ( . )
			// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:432:13: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERROR_TK"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:8: ( DOCUMENT | ASSIGN | EQ | NEQ | GT | GE | LT | LE | AT | CL | CM | DOT | SC | LP | RP | LB | RB | LBR | RBR | ADD | SUB | STAR | DIV | MOD | INC | DEC | NOT | AND | OR | XOR | AND_BIT | OR_BIT | VOID | BASIC_TYPE | ABSTRACT | ASSERT | BREAK | BYTE | CASE | CATCH | CLASS | CONTINUE | DEFAULT | DO | ELSE | ENUM | EXTENDS | FINAL | FINALLY | FOR | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INTERFACE | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | STATIC | SUPER | SWITCH | SYNCHRONIZED | TEST | ENDTEST | THIS | THROW | THROWS | TRANSIENT | TRY | VOLATILE | WHILE | ID | INTEGER | FLOAT | COMMENT | WS | STRING | CHAR | ERROR_TK )
		int alt22=83;
		alt22 = dfa22.predict(input);
		switch (alt22) {
			case 1 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:10: DOCUMENT
				{
				mDOCUMENT(); 

				}
				break;
			case 2 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:19: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 3 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:26: EQ
				{
				mEQ(); 

				}
				break;
			case 4 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:29: NEQ
				{
				mNEQ(); 

				}
				break;
			case 5 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:33: GT
				{
				mGT(); 

				}
				break;
			case 6 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:36: GE
				{
				mGE(); 

				}
				break;
			case 7 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:39: LT
				{
				mLT(); 

				}
				break;
			case 8 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:42: LE
				{
				mLE(); 

				}
				break;
			case 9 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:45: AT
				{
				mAT(); 

				}
				break;
			case 10 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:48: CL
				{
				mCL(); 

				}
				break;
			case 11 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:51: CM
				{
				mCM(); 

				}
				break;
			case 12 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:54: DOT
				{
				mDOT(); 

				}
				break;
			case 13 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:58: SC
				{
				mSC(); 

				}
				break;
			case 14 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:61: LP
				{
				mLP(); 

				}
				break;
			case 15 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:64: RP
				{
				mRP(); 

				}
				break;
			case 16 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:67: LB
				{
				mLB(); 

				}
				break;
			case 17 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:70: RB
				{
				mRB(); 

				}
				break;
			case 18 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:73: LBR
				{
				mLBR(); 

				}
				break;
			case 19 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:77: RBR
				{
				mRBR(); 

				}
				break;
			case 20 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:81: ADD
				{
				mADD(); 

				}
				break;
			case 21 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:85: SUB
				{
				mSUB(); 

				}
				break;
			case 22 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:89: STAR
				{
				mSTAR(); 

				}
				break;
			case 23 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:94: DIV
				{
				mDIV(); 

				}
				break;
			case 24 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:98: MOD
				{
				mMOD(); 

				}
				break;
			case 25 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:102: INC
				{
				mINC(); 

				}
				break;
			case 26 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:106: DEC
				{
				mDEC(); 

				}
				break;
			case 27 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:110: NOT
				{
				mNOT(); 

				}
				break;
			case 28 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:114: AND
				{
				mAND(); 

				}
				break;
			case 29 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:118: OR
				{
				mOR(); 

				}
				break;
			case 30 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:121: XOR
				{
				mXOR(); 

				}
				break;
			case 31 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:125: AND_BIT
				{
				mAND_BIT(); 

				}
				break;
			case 32 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:133: OR_BIT
				{
				mOR_BIT(); 

				}
				break;
			case 33 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:140: VOID
				{
				mVOID(); 

				}
				break;
			case 34 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:145: BASIC_TYPE
				{
				mBASIC_TYPE(); 

				}
				break;
			case 35 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:156: ABSTRACT
				{
				mABSTRACT(); 

				}
				break;
			case 36 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:165: ASSERT
				{
				mASSERT(); 

				}
				break;
			case 37 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:172: BREAK
				{
				mBREAK(); 

				}
				break;
			case 38 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:178: BYTE
				{
				mBYTE(); 

				}
				break;
			case 39 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:183: CASE
				{
				mCASE(); 

				}
				break;
			case 40 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:188: CATCH
				{
				mCATCH(); 

				}
				break;
			case 41 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:194: CLASS
				{
				mCLASS(); 

				}
				break;
			case 42 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:200: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 43 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:209: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 44 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:217: DO
				{
				mDO(); 

				}
				break;
			case 45 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:220: ELSE
				{
				mELSE(); 

				}
				break;
			case 46 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:225: ENUM
				{
				mENUM(); 

				}
				break;
			case 47 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:230: EXTENDS
				{
				mEXTENDS(); 

				}
				break;
			case 48 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:238: FINAL
				{
				mFINAL(); 

				}
				break;
			case 49 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:244: FINALLY
				{
				mFINALLY(); 

				}
				break;
			case 50 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:252: FOR
				{
				mFOR(); 

				}
				break;
			case 51 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:256: IF
				{
				mIF(); 

				}
				break;
			case 52 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:259: IMPLEMENTS
				{
				mIMPLEMENTS(); 

				}
				break;
			case 53 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:270: IMPORT
				{
				mIMPORT(); 

				}
				break;
			case 54 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:277: INSTANCEOF
				{
				mINSTANCEOF(); 

				}
				break;
			case 55 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:288: INTERFACE
				{
				mINTERFACE(); 

				}
				break;
			case 56 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:298: NATIVE
				{
				mNATIVE(); 

				}
				break;
			case 57 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:305: NEW
				{
				mNEW(); 

				}
				break;
			case 58 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:309: PACKAGE
				{
				mPACKAGE(); 

				}
				break;
			case 59 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:317: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 60 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:325: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 61 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:335: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 62 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:342: RETURN
				{
				mRETURN(); 

				}
				break;
			case 63 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:349: STATIC
				{
				mSTATIC(); 

				}
				break;
			case 64 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:356: SUPER
				{
				mSUPER(); 

				}
				break;
			case 65 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:362: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 66 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:369: SYNCHRONIZED
				{
				mSYNCHRONIZED(); 

				}
				break;
			case 67 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:382: TEST
				{
				mTEST(); 

				}
				break;
			case 68 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:387: ENDTEST
				{
				mENDTEST(); 

				}
				break;
			case 69 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:395: THIS
				{
				mTHIS(); 

				}
				break;
			case 70 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:400: THROW
				{
				mTHROW(); 

				}
				break;
			case 71 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:406: THROWS
				{
				mTHROWS(); 

				}
				break;
			case 72 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:413: TRANSIENT
				{
				mTRANSIENT(); 

				}
				break;
			case 73 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:423: TRY
				{
				mTRY(); 

				}
				break;
			case 74 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:427: VOLATILE
				{
				mVOLATILE(); 

				}
				break;
			case 75 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:436: WHILE
				{
				mWHILE(); 

				}
				break;
			case 76 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:442: ID
				{
				mID(); 

				}
				break;
			case 77 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:445: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 78 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:453: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 79 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:459: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 80 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:467: WS
				{
				mWS(); 

				}
				break;
			case 81 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:470: STRING
				{
				mSTRING(); 

				}
				break;
			case 82 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:477: CHAR
				{
				mCHAR(); 

				}
				break;
			case 83 :
				// C:\\Users\\boffe\\Desktop\\Progetto_LFC\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQCompiler\\JavaScriptToJQueryConverter.g:1:482: ERROR_TK
				{
				mERROR_TK(); 

				}
				break;

		}
	}


	protected DFA14 dfa14 = new DFA14(this);
	protected DFA22 dfa22 = new DFA22(this);
	static final String DFA14_eotS =
		"\5\uffff";
	static final String DFA14_eofS =
		"\5\uffff";
	static final String DFA14_minS =
		"\2\56\3\uffff";
	static final String DFA14_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA14_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA14_specialS =
		"\5\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "410:1: FLOAT : ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT );";
		}
	}

	static final String DFA22_eotS =
		"\1\uffff\1\62\1\64\1\66\1\70\1\72\3\uffff\1\76\7\uffff\1\110\1\112\1\uffff"+
		"\1\115\1\uffff\1\120\1\122\1\uffff\21\62\1\uffff\1\171\1\uffff\2\57\1"+
		"\uffff\1\u0080\1\62\42\uffff\2\62\1\u0086\42\62\1\uffff\1\171\3\uffff"+
		"\2\62\1\uffff\3\62\1\u00b3\1\62\1\uffff\11\62\1\u00bf\17\62\1\u00cf\5"+
		"\62\1\u00d5\1\u00d6\3\62\1\u00da\4\62\1\u00df\2\62\1\uffff\3\62\1\u00b3"+
		"\7\62\1\uffff\2\62\1\u00ee\1\u00b3\1\u00ef\6\62\1\u00f6\1\u00f7\2\62\1"+
		"\uffff\5\62\2\uffff\1\u00ff\2\62\1\uffff\4\62\1\uffff\5\62\1\u00b3\1\62"+
		"\1\u010c\2\62\1\u00b3\1\u0110\1\62\1\u0112\2\uffff\1\u0113\1\u0114\4\62"+
		"\2\uffff\7\62\1\uffff\1\u0121\1\62\1\u0123\1\62\1\u00b3\5\62\1\u012a\1"+
		"\u012b\1\uffff\1\u012c\2\62\1\uffff\1\62\3\uffff\1\62\1\u00b3\1\62\1\u0132"+
		"\1\62\1\u0134\3\62\1\u0138\1\u0139\1\u013a\1\uffff\1\62\1\uffff\1\62\1"+
		"\u013d\4\62\3\uffff\1\62\1\u0143\1\u00b3\2\62\1\uffff\1\u0146\1\uffff"+
		"\1\u0147\1\u0148\1\62\3\uffff\1\62\1\u014b\1\uffff\1\u014c\4\62\1\uffff"+
		"\1\u0151\1\u0152\3\uffff\2\62\2\uffff\1\u0155\3\62\2\uffff\1\u0159\1\u015a"+
		"\1\uffff\1\u015b\1\u015c\1\62\4\uffff\1\62\1\u015f\1\uffff";
	static final String DFA22_eofS =
		"\u0160\uffff";
	static final String DFA22_minS =
		"\1\0\1\145\4\75\3\uffff\1\60\7\uffff\1\53\1\55\1\uffff\1\52\1\uffff\1"+
		"\46\1\174\1\uffff\1\157\1\146\1\157\1\150\1\151\1\157\1\141\1\164\1\142"+
		"\1\154\2\141\1\145\1\130\1\131\2\150\1\uffff\1\56\1\uffff\2\0\1\uffff"+
		"\1\60\1\146\42\uffff\1\151\1\163\1\60\1\160\1\156\1\157\1\141\1\160\1"+
		"\151\1\156\1\157\1\156\1\162\1\157\1\145\1\164\1\141\1\163\1\141\1\156"+
		"\1\162\3\163\1\165\2\164\1\167\1\143\1\151\1\142\1\164\1\130\1\131\1\151"+
		"\1\141\1\151\1\uffff\1\56\3\uffff\1\165\1\142\1\uffff\1\141\1\144\1\141"+
		"\1\60\1\164\1\uffff\1\154\1\147\1\162\1\164\1\145\1\164\1\143\2\141\1"+
		"\60\1\154\1\141\1\145\1\162\1\145\1\143\1\163\1\164\1\151\1\164\2\145"+
		"\1\155\1\145\1\151\1\60\1\153\1\166\1\164\1\154\1\165\2\60\1\163\1\157"+
		"\1\156\1\60\1\154\1\155\1\154\1\165\1\60\1\164\1\162\1\uffff\1\141\1\145"+
		"\1\162\1\60\1\164\1\151\1\162\1\143\1\150\1\164\1\154\1\uffff\1\145\1"+
		"\153\3\60\1\150\1\163\1\151\1\156\2\162\2\60\1\156\1\166\1\uffff\2\141"+
		"\1\145\1\151\1\162\2\uffff\1\60\1\167\1\163\1\uffff\3\145\1\154\1\uffff"+
		"\1\151\1\146\1\156\1\155\1\164\1\60\1\143\1\60\1\150\1\162\2\60\1\141"+
		"\1\60\2\uffff\2\60\1\156\1\147\1\141\1\164\2\uffff\1\144\1\145\1\147\1"+
		"\164\2\143\1\156\1\uffff\1\60\1\151\1\60\1\156\1\60\1\164\1\154\1\141"+
		"\1\143\1\145\2\60\1\uffff\1\60\1\157\1\171\1\uffff\1\156\3\uffff\1\165"+
		"\1\60\1\143\1\60\1\163\1\60\2\145\1\164\3\60\1\uffff\1\145\1\uffff\1\164"+
		"\1\60\1\145\1\143\1\145\1\156\3\uffff\1\156\2\60\1\145\1\164\1\uffff\1"+
		"\60\1\uffff\2\60\1\145\3\uffff\1\156\1\60\1\uffff\1\60\1\145\1\157\1\164"+
		"\1\151\1\uffff\2\60\3\uffff\1\144\1\164\2\uffff\1\60\1\146\1\163\1\172"+
		"\2\uffff\2\60\1\uffff\2\60\1\145\4\uffff\1\144\1\60\1\uffff";
	static final String DFA22_maxS =
		"\1\uffff\1\157\4\75\3\uffff\1\71\7\uffff\1\53\1\55\1\uffff\1\57\1\uffff"+
		"\1\46\1\174\1\uffff\1\157\1\156\1\157\1\171\1\157\1\171\1\157\1\164\1"+
		"\163\1\170\1\145\1\165\1\145\1\130\1\131\1\162\1\150\1\uffff\1\145\1\uffff"+
		"\2\uffff\1\uffff\1\172\1\146\42\uffff\1\154\1\164\1\172\1\160\1\156\1"+
		"\157\1\141\1\160\1\151\1\156\1\157\1\156\1\162\1\157\1\145\1\164\1\141"+
		"\1\164\1\141\1\156\1\162\3\163\1\165\2\164\1\167\1\143\1\157\1\142\1\164"+
		"\1\130\1\131\1\162\1\171\1\151\1\uffff\1\145\3\uffff\1\165\1\142\1\uffff"+
		"\1\141\1\144\1\141\1\172\1\164\1\uffff\1\157\1\147\1\162\1\164\1\145\1"+
		"\164\1\143\2\141\1\172\1\154\1\141\1\145\1\162\1\145\1\143\1\163\1\164"+
		"\1\151\1\164\2\145\1\155\1\145\1\151\1\172\1\153\1\166\1\164\1\154\1\165"+
		"\2\172\1\163\1\157\1\156\1\172\1\154\1\155\1\154\1\165\1\172\1\164\1\162"+
		"\1\uffff\1\141\1\145\1\162\1\172\1\164\1\151\1\162\1\143\1\150\1\164\1"+
		"\154\1\uffff\1\145\1\153\3\172\1\150\1\163\1\151\1\156\2\162\2\172\1\156"+
		"\1\166\1\uffff\2\141\1\145\1\151\1\162\2\uffff\1\172\1\167\1\163\1\uffff"+
		"\3\145\1\154\1\uffff\1\151\1\146\1\156\1\155\1\164\1\172\1\143\1\172\1"+
		"\150\1\162\2\172\1\141\1\172\2\uffff\2\172\1\156\1\147\1\141\1\164\2\uffff"+
		"\1\144\1\145\1\147\1\164\2\143\1\156\1\uffff\1\172\1\151\1\172\1\156\1"+
		"\172\1\164\1\154\1\141\1\143\1\145\2\172\1\uffff\1\172\1\157\1\171\1\uffff"+
		"\1\156\3\uffff\1\165\1\172\1\143\1\172\1\163\1\172\2\145\1\164\3\172\1"+
		"\uffff\1\145\1\uffff\1\164\1\172\1\145\1\143\1\145\1\156\3\uffff\1\156"+
		"\2\172\1\145\1\164\1\uffff\1\172\1\uffff\2\172\1\145\3\uffff\1\156\1\172"+
		"\1\uffff\1\172\1\145\1\157\1\164\1\151\1\uffff\2\172\3\uffff\1\144\1\164"+
		"\2\uffff\1\172\1\146\1\163\1\172\2\uffff\2\172\1\uffff\2\172\1\145\4\uffff"+
		"\1\144\1\172\1\uffff";
	static final String DFA22_acceptS =
		"\6\uffff\1\11\1\12\1\13\1\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\2\uffff"+
		"\1\26\1\uffff\1\30\2\uffff\1\36\21\uffff\1\114\1\uffff\1\120\2\uffff\1"+
		"\123\2\uffff\1\114\1\3\1\2\1\4\1\33\1\6\1\5\1\10\1\7\1\11\1\12\1\13\1"+
		"\14\1\116\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\31\1\24\1\32\1\25\1\26"+
		"\1\117\1\27\1\30\1\34\1\37\1\35\1\40\1\36\45\uffff\1\115\1\uffff\1\120"+
		"\1\121\1\122\2\uffff\1\54\5\uffff\1\63\54\uffff\1\42\13\uffff\1\62\17"+
		"\uffff\1\71\5\uffff\1\103\1\104\3\uffff\1\111\4\uffff\1\41\16\uffff\1"+
		"\46\1\47\6\uffff\1\55\1\56\7\uffff\1\105\14\uffff\1\100\3\uffff\1\60\1"+
		"\uffff\1\45\1\50\1\51\14\uffff\1\106\1\uffff\1\113\6\uffff\1\65\1\77\1"+
		"\101\5\uffff\1\44\1\uffff\1\70\3\uffff\1\75\1\76\1\107\2\uffff\1\53\5"+
		"\uffff\1\61\2\uffff\1\57\1\72\1\73\2\uffff\1\1\1\112\4\uffff\1\52\1\43"+
		"\2\uffff\1\67\3\uffff\1\74\1\110\1\66\1\64\2\uffff\1\102";
	static final String DFA22_specialS =
		"\1\1\54\uffff\1\2\1\0\u0131\uffff}>";
	static final String[] DFA22_transitionS = {
			"\11\57\2\54\2\57\1\54\22\57\1\54\1\3\1\55\2\57\1\25\1\26\1\56\1\13\1"+
			"\14\1\23\1\21\1\10\1\22\1\11\1\24\12\53\1\7\1\12\1\5\1\2\1\4\1\57\1\6"+
			"\22\52\1\40\4\52\1\46\1\47\1\52\1\15\1\57\1\16\1\30\1\52\1\57\1\41\1"+
			"\36\1\37\1\1\1\42\1\35\2\52\1\32\2\52\1\33\1\52\1\43\1\52\1\44\1\52\1"+
			"\45\1\34\1\50\1\52\1\31\1\51\3\52\1\17\1\27\1\20\uff82\57",
			"\1\61\11\uffff\1\60",
			"\1\63",
			"\1\65",
			"\1\67",
			"\1\71",
			"",
			"",
			"",
			"\12\77",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\107",
			"\1\111",
			"",
			"\1\114\4\uffff\1\114",
			"",
			"\1\117",
			"\1\121",
			"",
			"\1\124",
			"\1\126\6\uffff\1\127\1\125",
			"\1\130",
			"\1\131\13\uffff\1\132\1\133\1\uffff\1\134\1\uffff\1\135",
			"\1\137\2\uffff\1\136\2\uffff\1\140",
			"\1\141\2\uffff\1\142\6\uffff\1\143",
			"\1\145\6\uffff\1\144\3\uffff\1\146\2\uffff\1\147",
			"\1\150",
			"\1\151\20\uffff\1\152",
			"\1\153\1\uffff\1\154\11\uffff\1\155",
			"\1\156\3\uffff\1\157",
			"\1\160\20\uffff\1\161\2\uffff\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166\11\uffff\1\167",
			"\1\170",
			"",
			"\1\77\1\uffff\12\172\13\uffff\1\77\37\uffff\1\77",
			"",
			"\0\174",
			"\47\175\1\uffff\uffd8\175",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\176\21\62\1\177\5\62",
			"\1\u0081",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0082\2\uffff\1\u0083",
			"\1\u0085\1\u0084",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2\5\uffff\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8\10\uffff\1\u00a9",
			"\1\u00aa\27\uffff\1\u00ab",
			"\1\u00ac",
			"",
			"\1\77\1\uffff\12\172\13\uffff\1\77\37\uffff\1\77",
			"",
			"",
			"",
			"\1\u00ad",
			"\1\u00ae",
			"",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00b2\25\62",
			"\1\u00b4",
			"",
			"\1\u00b5\2\uffff\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00e0",
			"\1\u00e1",
			"",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"",
			"\1\u00ec",
			"\1\u00ed",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u00f8",
			"\1\u00f9",
			"",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe",
			"",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u0100",
			"\1\u0101",
			"",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u010b",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u010d",
			"\1\u010e",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u010f\16\62",
			"\1\u0111",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u0115",
			"\1\u0116",
			"\1\u0117",
			"\1\u0118",
			"",
			"",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0120\7\62",
			"\1\u0122",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u0124",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u0125",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u012d",
			"\1\u012e",
			"",
			"\1\u012f",
			"",
			"",
			"",
			"\1\u0130",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u0131",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u0133",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\1\u013b",
			"",
			"\1\u013c",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"",
			"",
			"",
			"\1\u0142",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u0144",
			"\1\u0145",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u0149",
			"",
			"",
			"",
			"\1\u014a",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"",
			"",
			"\1\u0153",
			"\1\u0154",
			"",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			"\1\u015d",
			"",
			"",
			"",
			"",
			"\1\u015e",
			"\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
			""
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( DOCUMENT | ASSIGN | EQ | NEQ | GT | GE | LT | LE | AT | CL | CM | DOT | SC | LP | RP | LB | RB | LBR | RBR | ADD | SUB | STAR | DIV | MOD | INC | DEC | NOT | AND | OR | XOR | AND_BIT | OR_BIT | VOID | BASIC_TYPE | ABSTRACT | ASSERT | BREAK | BYTE | CASE | CATCH | CLASS | CONTINUE | DEFAULT | DO | ELSE | ENUM | EXTENDS | FINAL | FINALLY | FOR | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INTERFACE | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | STATIC | SUPER | SWITCH | SYNCHRONIZED | TEST | ENDTEST | THIS | THROW | THROWS | TRANSIENT | TRY | VOLATILE | WHILE | ID | INTEGER | FLOAT | COMMENT | WS | STRING | CHAR | ERROR_TK );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA22_46 = input.LA(1);
						s = -1;
						if ( ((LA22_46 >= '\u0000' && LA22_46 <= '&')||(LA22_46 >= '(' && LA22_46 <= '\uFFFF')) ) {s = 125;}
						else s = 47;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA22_0 = input.LA(1);
						s = -1;
						if ( (LA22_0=='d') ) {s = 1;}
						else if ( (LA22_0=='=') ) {s = 2;}
						else if ( (LA22_0=='!') ) {s = 3;}
						else if ( (LA22_0=='>') ) {s = 4;}
						else if ( (LA22_0=='<') ) {s = 5;}
						else if ( (LA22_0=='@') ) {s = 6;}
						else if ( (LA22_0==':') ) {s = 7;}
						else if ( (LA22_0==',') ) {s = 8;}
						else if ( (LA22_0=='.') ) {s = 9;}
						else if ( (LA22_0==';') ) {s = 10;}
						else if ( (LA22_0=='(') ) {s = 11;}
						else if ( (LA22_0==')') ) {s = 12;}
						else if ( (LA22_0=='[') ) {s = 13;}
						else if ( (LA22_0==']') ) {s = 14;}
						else if ( (LA22_0=='{') ) {s = 15;}
						else if ( (LA22_0=='}') ) {s = 16;}
						else if ( (LA22_0=='+') ) {s = 17;}
						else if ( (LA22_0=='-') ) {s = 18;}
						else if ( (LA22_0=='*') ) {s = 19;}
						else if ( (LA22_0=='/') ) {s = 20;}
						else if ( (LA22_0=='%') ) {s = 21;}
						else if ( (LA22_0=='&') ) {s = 22;}
						else if ( (LA22_0=='|') ) {s = 23;}
						else if ( (LA22_0=='^') ) {s = 24;}
						else if ( (LA22_0=='v') ) {s = 25;}
						else if ( (LA22_0=='i') ) {s = 26;}
						else if ( (LA22_0=='l') ) {s = 27;}
						else if ( (LA22_0=='s') ) {s = 28;}
						else if ( (LA22_0=='f') ) {s = 29;}
						else if ( (LA22_0=='b') ) {s = 30;}
						else if ( (LA22_0=='c') ) {s = 31;}
						else if ( (LA22_0=='S') ) {s = 32;}
						else if ( (LA22_0=='a') ) {s = 33;}
						else if ( (LA22_0=='e') ) {s = 34;}
						else if ( (LA22_0=='n') ) {s = 35;}
						else if ( (LA22_0=='p') ) {s = 36;}
						else if ( (LA22_0=='r') ) {s = 37;}
						else if ( (LA22_0=='X') ) {s = 38;}
						else if ( (LA22_0=='Y') ) {s = 39;}
						else if ( (LA22_0=='t') ) {s = 40;}
						else if ( (LA22_0=='w') ) {s = 41;}
						else if ( ((LA22_0 >= 'A' && LA22_0 <= 'R')||(LA22_0 >= 'T' && LA22_0 <= 'W')||LA22_0=='Z'||LA22_0=='_'||(LA22_0 >= 'g' && LA22_0 <= 'h')||(LA22_0 >= 'j' && LA22_0 <= 'k')||LA22_0=='m'||LA22_0=='o'||LA22_0=='q'||LA22_0=='u'||(LA22_0 >= 'x' && LA22_0 <= 'z')) ) {s = 42;}
						else if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {s = 43;}
						else if ( ((LA22_0 >= '\t' && LA22_0 <= '\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 44;}
						else if ( (LA22_0=='\"') ) {s = 45;}
						else if ( (LA22_0=='\'') ) {s = 46;}
						else if ( ((LA22_0 >= '\u0000' && LA22_0 <= '\b')||(LA22_0 >= '\u000B' && LA22_0 <= '\f')||(LA22_0 >= '\u000E' && LA22_0 <= '\u001F')||(LA22_0 >= '#' && LA22_0 <= '$')||LA22_0=='?'||LA22_0=='\\'||LA22_0=='`'||(LA22_0 >= '~' && LA22_0 <= '\uFFFF')) ) {s = 47;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA22_45 = input.LA(1);
						s = -1;
						if ( ((LA22_45 >= '\u0000' && LA22_45 <= '\uFFFF')) ) {s = 124;}
						else s = 47;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 22, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
