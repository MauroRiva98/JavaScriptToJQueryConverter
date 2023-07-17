// $ANTLR 3.5.1 C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g 2023-07-17 18:58:48

	package JS2JQConverter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JavaScriptToJQueryConverterLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g"; }

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:119:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:119:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:119:22: ( '+' | '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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

			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:119:33: ( '0' .. '9' )+
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
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:122:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:126:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:126:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:127:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:128:9: OCTAL_ESC
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:133:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:133:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:134:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:135:9: '\\\\' ( '0' .. '7' )
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:140:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:144:8: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:146:7: ( '0' .. '9' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:148:2: ( 'document' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:148:3: 'document'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:150:8: ( '=' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:150:10: '='
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:5: ( '==' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:152:7: '=='
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

	// $ANTLR start "TEQ"
	public final void mTEQ() throws RecognitionException {
		try {
			int _type = TEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:153:5: ( '===' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:153:7: '==='
			{
			match("==="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEQ"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:6: ( '!=' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:154:8: '!='
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:5: ( '>' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:155:7: '>'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:156:4: ( '>=' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:156:6: '>='
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:157:5: ( '<' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:157:7: '<'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:158:5: ( '<=' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:158:7: '<='
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:161:4: ( '@' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:161:6: '@'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:5: ( ':' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:162:7: ':'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:163:5: ( ',' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:163:7: ','
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:164:6: ( '.' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:164:8: '.'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:165:5: ( ';' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:165:7: ';'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:168:5: ( '(' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:168:7: '('
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:169:5: ( ')' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:169:7: ')'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:170:4: ( '[' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:170:6: '['
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:171:4: ( ']' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:171:6: ']'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:172:5: ( '{' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:172:7: '{'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:173:5: ( '}' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:173:7: '}'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:176:6: ( '+' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:176:8: '+'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:177:6: ( '-' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:177:8: '-'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:178:7: ( '*' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:178:9: '*'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:179:6: ( '/' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:179:8: '/'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:180:6: ( '%' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:180:8: '%'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:181:6: ( '++' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:181:8: '++'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:182:6: ( '--' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:182:8: '--'
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

	// $ANTLR start "EXP"
	public final void mEXP() throws RecognitionException {
		try {
			int _type = EXP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:183:6: ( '**' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:183:8: '**'
			{
			match("**"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXP"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:187:6: ( '!' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:187:8: '!'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:6: ( '&&' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:188:8: '&&'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:189:5: ( '||' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:189:7: '||'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:190:6: ( '^' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:190:8: '^'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:191:10: ( '&' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:191:11: '&'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:192:10: ( '|' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:192:11: '|'
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

	// $ANTLR start "AWAIT"
	public final void mAWAIT() throws RecognitionException {
		try {
			int _type = AWAIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:196:8: ( 'await' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:196:9: 'await'
			{
			match("await"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AWAIT"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:197:8: ( 'break' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:197:9: 'break'
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

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:198:7: ( 'case' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:198:8: 'case'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:199:8: ( 'catch' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:199:9: 'catch'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:200:8: ( 'class' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:200:9: 'class'
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

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:201:8: ( 'const' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:201:9: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:202:10: ( 'continue' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:202:11: 'continue'
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

	// $ANTLR start "DEBUGGER"
	public final void mDEBUGGER() throws RecognitionException {
		try {
			int _type = DEBUGGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:203:10: ( 'debugger' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:203:11: 'debugger'
			{
			match("debugger"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEBUGGER"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:204:10: ( 'default' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:204:11: 'default'
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

	// $ANTLR start "DELETE"
	public final void mDELETE() throws RecognitionException {
		try {
			int _type = DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:205:9: ( 'delete' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:205:10: 'delete'
			{
			match("delete"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DELETE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:206:5: ( 'do' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:206:6: 'do'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:207:7: ( 'else' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:207:8: 'else'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:208:7: ( 'enum' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:208:8: 'enum'
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

	// $ANTLR start "EXPORT"
	public final void mEXPORT() throws RecognitionException {
		try {
			int _type = EXPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:209:9: ( 'export' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:209:10: 'export'
			{
			match("export"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPORT"

	// $ANTLR start "EXTENDS"
	public final void mEXTENDS() throws RecognitionException {
		try {
			int _type = EXTENDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:210:10: ( 'extends' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:210:11: 'extends'
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

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:8: ( 'false' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:211:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "FINALLY"
	public final void mFINALLY() throws RecognitionException {
		try {
			int _type = FINALLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:212:10: ( 'finally' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:212:11: 'finally'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:213:6: ( 'for' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:213:7: 'for'
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

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:10: ( 'function' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:214:11: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:215:5: ( 'if' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:215:6: 'if'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:216:12: ( 'implements' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:216:13: 'implements'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:217:9: ( 'import' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:217:10: 'import'
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

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:218:6: ( 'in' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:218:7: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "INSTANCEOF"
	public final void mINSTANCEOF() throws RecognitionException {
		try {
			int _type = INSTANCEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:219:12: ( 'instanceof' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:219:13: 'instanceof'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:220:11: ( 'interface' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:220:12: 'interface'
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

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:221:6: ( 'let' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:221:7: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "NEW"
	public final void mNEW() throws RecognitionException {
		try {
			int _type = NEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:222:6: ( 'new' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:222:7: 'new'
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

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:223:7: ( 'null' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:223:8: 'null'
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL"

	// $ANTLR start "PACKAGE"
	public final void mPACKAGE() throws RecognitionException {
		try {
			int _type = PACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:224:10: ( 'package' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:224:11: 'package'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:10: ( 'private' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:225:11: 'private'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:226:11: ( 'protected' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:226:12: 'protected'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:9: ( 'public' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:227:10: 'public'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:228:9: ( 'return' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:228:10: 'return'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:229:9: ( 'static' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:229:10: 'static'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:230:8: ( 'super' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:230:9: 'super'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:9: ( 'switch' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:231:10: 'switch'
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

	// $ANTLR start "THIS"
	public final void mTHIS() throws RecognitionException {
		try {
			int _type = THIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:232:7: ( 'this' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:232:8: 'this'
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:233:8: ( 'throw' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:233:9: 'throw'
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

	// $ANTLR start "TRY"
	public final void mTRY() throws RecognitionException {
		try {
			int _type = TRY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:234:6: ( 'try' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:234:7: 'try'
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

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:235:7: ( 'true' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:235:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "TYPEOF"
	public final void mTYPEOF() throws RecognitionException {
		try {
			int _type = TYPEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:236:9: ( 'typeof' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:236:10: 'typeof'
			{
			match("typeof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPEOF"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:237:6: ( 'var' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:237:7: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:7: ( 'void' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:238:8: 'void'
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

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:239:8: ( 'while' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:239:9: 'while'
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

	// $ANTLR start "WITH"
	public final void mWITH() throws RecognitionException {
		try {
			int _type = WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:240:7: ( 'with' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:240:8: 'with'
			{
			match("with"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WITH"

	// $ANTLR start "YIELD"
	public final void mYIELD() throws RecognitionException {
		try {
			int _type = YIELD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:241:8: ( 'yield' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:241:9: 'yield'
			{
			match("yield"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "YIELD"

	// $ANTLR start "UNDEFINED"
	public final void mUNDEFINED() throws RecognitionException {
		try {
			int _type = UNDEFINED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:11: ( 'undefined' )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:243:13: 'undefined'
			{
			match("undefined"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDEFINED"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:246:6: ( ( LETTER | '_' | '$' ) ( LETTER | DIGIT | '_' | '$' )* )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:247:2: ( LETTER | '_' | '$' ) ( LETTER | DIGIT | '_' | '$' )*
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:247:22: ( LETTER | DIGIT | '_' | '$' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='$'||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop5;
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:9: ( ( DIGIT )+ )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:11: ( DIGIT )+
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:251:11: ( DIGIT )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:255:5: ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT )
			int alt13=3;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:255:9: ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )?
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:255:9: ( DIGIT )+
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
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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

					match('.'); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:255:20: ( DIGIT )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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
							break loop8;
						}
					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:255:27: ( EXPONENT )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='E'||LA9_0=='e') ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:255:27: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:256:9: '.' ( DIGIT )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:256:13: ( DIGIT )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:256:20: ( EXPONENT )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='E'||LA11_0=='e') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:256:20: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:257:9: ( DIGIT )+ EXPONENT
					{
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:257:9: ( DIGIT )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:261:5: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' ) )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:261:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:261:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='/') ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1=='/') ) {
					alt17=1;
				}
				else if ( (LA17_1=='*') ) {
					alt17=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:261:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:261:15: (~ ( '\\n' | '\\r' ) )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF')) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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
							break loop14;
						}
					}

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:261:29: ( '\\r' )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0=='\r') ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:261:29: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:262:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:262:14: ( options {greedy=false; } : . )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0=='*') ) {
							int LA16_1 = input.LA(2);
							if ( (LA16_1=='/') ) {
								alt16=2;
							}
							else if ( ((LA16_1 >= '\u0000' && LA16_1 <= '.')||(LA16_1 >= '0' && LA16_1 <= '\uFFFF')) ) {
								alt16=1;
							}

						}
						else if ( ((LA16_0 >= '\u0000' && LA16_0 <= ')')||(LA16_0 >= '+' && LA16_0 <= '\uFFFF')) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:262:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop16;
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:265:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:265:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:265:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= '\t' && LA18_0 <= '\n')||LA18_0=='\r'||LA18_0==' ') ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:
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
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
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
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:272:8: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='\"') ) {
				alt21=1;
			}
			else if ( (LA21_0=='\'') ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:272:11: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
					{
					match('\"'); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:272:15: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
					loop19:
					while (true) {
						int alt19=3;
						int LA19_0 = input.LA(1);
						if ( (LA19_0=='\\') ) {
							alt19=1;
						}
						else if ( ((LA19_0 >= '\u0000' && LA19_0 <= '!')||(LA19_0 >= '#' && LA19_0 <= '[')||(LA19_0 >= ']' && LA19_0 <= '\uFFFF')) ) {
							alt19=2;
						}

						switch (alt19) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:272:17: ESC_SEQ
							{
							mESC_SEQ(); 

							}
							break;
						case 2 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:272:27: ~ ( '\\\\' | '\"' )
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
							break loop19;
						}
					}

					match('\"'); 
					}
					break;
				case 2 :
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:273:5: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\''
					{
					match('\''); 
					// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:273:10: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )*
					loop20:
					while (true) {
						int alt20=3;
						int LA20_0 = input.LA(1);
						if ( (LA20_0=='\\') ) {
							alt20=1;
						}
						else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '&')||(LA20_0 >= '(' && LA20_0 <= '[')||(LA20_0 >= ']' && LA20_0 <= '\uFFFF')) ) {
							alt20=2;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:273:12: ESC_SEQ
							{
							mESC_SEQ(); 

							}
							break;
						case 2 :
							// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:273:22: ~ ( '\\\\' | '\\'' )
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

						default :
							break loop20;
						}
					}

					match('\''); 
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
	// $ANTLR end "STRING"

	// $ANTLR start "ERROR_TK"
	public final void mERROR_TK() throws RecognitionException {
		try {
			int _type = ERROR_TK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:276:10: ( . )
			// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:276:12: .
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
		// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:8: ( DOCUMENT | ASSIGN | EQ | TEQ | NEQ | GT | GE | LT | LE | AT | CL | CM | DOT | SC | LP | RP | LB | RB | LBR | RBR | ADD | SUB | STAR | DIV | MOD | INC | DEC | EXP | NOT | AND | OR | XOR | AND_BIT | OR_BIT | AWAIT | BREAK | CASE | CATCH | CLASS | CONST | CONTINUE | DEBUGGER | DEFAULT | DELETE | DO | ELSE | ENUM | EXPORT | EXTENDS | FALSE | FINALLY | FOR | FUNCTION | IF | IMPLEMENTS | IMPORT | IN | INSTANCEOF | INTERFACE | LET | NEW | NULL | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | STATIC | SUPER | SWITCH | THIS | THROW | TRY | TRUE | TYPEOF | VAR | VOID | WHILE | WITH | YIELD | UNDEFINED | ID | INTEGER | FLOAT | COMMENT | WS | STRING | ERROR_TK )
		int alt22=88;
		alt22 = dfa22.predict(input);
		switch (alt22) {
			case 1 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:10: DOCUMENT
				{
				mDOCUMENT(); 

				}
				break;
			case 2 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:19: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 3 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:26: EQ
				{
				mEQ(); 

				}
				break;
			case 4 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:29: TEQ
				{
				mTEQ(); 

				}
				break;
			case 5 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:33: NEQ
				{
				mNEQ(); 

				}
				break;
			case 6 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:37: GT
				{
				mGT(); 

				}
				break;
			case 7 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:40: GE
				{
				mGE(); 

				}
				break;
			case 8 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:43: LT
				{
				mLT(); 

				}
				break;
			case 9 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:46: LE
				{
				mLE(); 

				}
				break;
			case 10 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:49: AT
				{
				mAT(); 

				}
				break;
			case 11 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:52: CL
				{
				mCL(); 

				}
				break;
			case 12 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:55: CM
				{
				mCM(); 

				}
				break;
			case 13 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:58: DOT
				{
				mDOT(); 

				}
				break;
			case 14 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:62: SC
				{
				mSC(); 

				}
				break;
			case 15 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:65: LP
				{
				mLP(); 

				}
				break;
			case 16 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:68: RP
				{
				mRP(); 

				}
				break;
			case 17 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:71: LB
				{
				mLB(); 

				}
				break;
			case 18 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:74: RB
				{
				mRB(); 

				}
				break;
			case 19 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:77: LBR
				{
				mLBR(); 

				}
				break;
			case 20 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:81: RBR
				{
				mRBR(); 

				}
				break;
			case 21 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:85: ADD
				{
				mADD(); 

				}
				break;
			case 22 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:89: SUB
				{
				mSUB(); 

				}
				break;
			case 23 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:93: STAR
				{
				mSTAR(); 

				}
				break;
			case 24 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:98: DIV
				{
				mDIV(); 

				}
				break;
			case 25 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:102: MOD
				{
				mMOD(); 

				}
				break;
			case 26 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:106: INC
				{
				mINC(); 

				}
				break;
			case 27 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:110: DEC
				{
				mDEC(); 

				}
				break;
			case 28 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:114: EXP
				{
				mEXP(); 

				}
				break;
			case 29 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:118: NOT
				{
				mNOT(); 

				}
				break;
			case 30 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:122: AND
				{
				mAND(); 

				}
				break;
			case 31 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:126: OR
				{
				mOR(); 

				}
				break;
			case 32 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:129: XOR
				{
				mXOR(); 

				}
				break;
			case 33 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:133: AND_BIT
				{
				mAND_BIT(); 

				}
				break;
			case 34 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:141: OR_BIT
				{
				mOR_BIT(); 

				}
				break;
			case 35 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:148: AWAIT
				{
				mAWAIT(); 

				}
				break;
			case 36 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:154: BREAK
				{
				mBREAK(); 

				}
				break;
			case 37 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:160: CASE
				{
				mCASE(); 

				}
				break;
			case 38 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:165: CATCH
				{
				mCATCH(); 

				}
				break;
			case 39 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:171: CLASS
				{
				mCLASS(); 

				}
				break;
			case 40 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:177: CONST
				{
				mCONST(); 

				}
				break;
			case 41 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:183: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 42 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:192: DEBUGGER
				{
				mDEBUGGER(); 

				}
				break;
			case 43 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:201: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 44 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:209: DELETE
				{
				mDELETE(); 

				}
				break;
			case 45 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:216: DO
				{
				mDO(); 

				}
				break;
			case 46 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:219: ELSE
				{
				mELSE(); 

				}
				break;
			case 47 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:224: ENUM
				{
				mENUM(); 

				}
				break;
			case 48 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:229: EXPORT
				{
				mEXPORT(); 

				}
				break;
			case 49 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:236: EXTENDS
				{
				mEXTENDS(); 

				}
				break;
			case 50 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:244: FALSE
				{
				mFALSE(); 

				}
				break;
			case 51 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:250: FINALLY
				{
				mFINALLY(); 

				}
				break;
			case 52 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:258: FOR
				{
				mFOR(); 

				}
				break;
			case 53 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:262: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 54 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:271: IF
				{
				mIF(); 

				}
				break;
			case 55 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:274: IMPLEMENTS
				{
				mIMPLEMENTS(); 

				}
				break;
			case 56 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:285: IMPORT
				{
				mIMPORT(); 

				}
				break;
			case 57 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:292: IN
				{
				mIN(); 

				}
				break;
			case 58 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:295: INSTANCEOF
				{
				mINSTANCEOF(); 

				}
				break;
			case 59 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:306: INTERFACE
				{
				mINTERFACE(); 

				}
				break;
			case 60 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:316: LET
				{
				mLET(); 

				}
				break;
			case 61 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:320: NEW
				{
				mNEW(); 

				}
				break;
			case 62 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:324: NULL
				{
				mNULL(); 

				}
				break;
			case 63 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:329: PACKAGE
				{
				mPACKAGE(); 

				}
				break;
			case 64 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:337: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 65 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:345: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 66 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:355: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 67 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:362: RETURN
				{
				mRETURN(); 

				}
				break;
			case 68 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:369: STATIC
				{
				mSTATIC(); 

				}
				break;
			case 69 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:376: SUPER
				{
				mSUPER(); 

				}
				break;
			case 70 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:382: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 71 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:389: THIS
				{
				mTHIS(); 

				}
				break;
			case 72 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:394: THROW
				{
				mTHROW(); 

				}
				break;
			case 73 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:400: TRY
				{
				mTRY(); 

				}
				break;
			case 74 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:404: TRUE
				{
				mTRUE(); 

				}
				break;
			case 75 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:409: TYPEOF
				{
				mTYPEOF(); 

				}
				break;
			case 76 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:416: VAR
				{
				mVAR(); 

				}
				break;
			case 77 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:420: VOID
				{
				mVOID(); 

				}
				break;
			case 78 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:425: WHILE
				{
				mWHILE(); 

				}
				break;
			case 79 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:431: WITH
				{
				mWITH(); 

				}
				break;
			case 80 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:436: YIELD
				{
				mYIELD(); 

				}
				break;
			case 81 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:442: UNDEFINED
				{
				mUNDEFINED(); 

				}
				break;
			case 82 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:452: ID
				{
				mID(); 

				}
				break;
			case 83 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:455: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 84 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:463: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 85 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:469: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 86 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:477: WS
				{
				mWS(); 

				}
				break;
			case 87 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:480: STRING
				{
				mSTRING(); 

				}
				break;
			case 88 :
				// C:\\Users\\mauro\\Desktop\\Eclipse\\JavaScriptToJQueryConverter\\JS2JQ\\src\\JS2JQConverter\\JavaScriptToJQueryConverter.g:1:487: ERROR_TK
				{
				mERROR_TK(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	protected DFA22 dfa22 = new DFA22(this);
	static final String DFA13_eotS =
		"\5\uffff";
	static final String DFA13_eofS =
		"\5\uffff";
	static final String DFA13_minS =
		"\2\56\3\uffff";
	static final String DFA13_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA13_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA13_specialS =
		"\5\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "254:1: FLOAT : ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT );";
		}
	}

	static final String DFA22_eotS =
		"\1\uffff\1\61\1\63\1\65\1\67\1\71\3\uffff\1\75\7\uffff\1\107\1\111\1\113"+
		"\1\115\1\uffff\1\120\1\122\1\uffff\20\61\1\uffff\1\166\1\uffff\2\56\1"+
		"\uffff\1\173\1\61\1\uffff\1\u0080\41\uffff\14\61\1\u008f\1\61\1\u0093"+
		"\23\61\1\uffff\1\166\2\uffff\1\61\1\uffff\3\61\2\uffff\14\61\1\u00bb\1"+
		"\61\1\uffff\3\61\1\uffff\1\u00c1\1\u00c2\13\61\1\u00ce\2\61\1\u00d1\13"+
		"\61\1\u00dd\4\61\1\u00e2\1\u00e3\4\61\1\uffff\5\61\2\uffff\1\u00ed\10"+
		"\61\1\u00f6\1\61\1\uffff\1\u00f8\1\61\1\uffff\1\u00fa\1\61\1\u00fc\6\61"+
		"\1\u0103\1\u0104\1\uffff\1\u0105\1\u0106\1\u0107\1\61\2\uffff\2\61\1\u010b"+
		"\6\61\1\uffff\6\61\1\u0118\1\61\1\uffff\1\u011a\1\uffff\1\61\1\uffff\1"+
		"\u011c\1\uffff\1\u011d\4\61\1\u0122\5\uffff\1\61\1\u0124\1\61\1\uffff"+
		"\3\61\1\u0129\5\61\1\u012f\1\u0130\1\u0131\1\uffff\1\u0132\1\uffff\1\u0133"+
		"\2\uffff\3\61\1\u0137\1\uffff\1\61\1\uffff\1\u0139\1\u013a\2\61\1\uffff"+
		"\2\61\1\u013f\1\u0140\1\61\5\uffff\1\61\1\u0143\1\u0144\1\uffff\1\u0145"+
		"\2\uffff\1\u0146\3\61\2\uffff\2\61\4\uffff\2\61\1\u014e\1\u014f\1\u0150"+
		"\1\u0151\1\u0152\5\uffff";
	static final String DFA22_eofS =
		"\u0153\uffff";
	static final String DFA22_minS =
		"\1\0\1\145\4\75\3\uffff\1\60\7\uffff\1\53\1\55\2\52\1\uffff\1\46\1\174"+
		"\1\uffff\1\167\1\162\1\141\1\154\1\141\1\146\2\145\1\141\1\145\1\164\1"+
		"\150\1\141\1\150\1\151\1\156\1\uffff\1\56\1\uffff\2\0\1\uffff\1\44\1\142"+
		"\1\uffff\1\75\41\uffff\1\141\1\145\1\163\1\141\1\156\1\163\1\165\1\160"+
		"\1\154\1\156\1\162\1\156\1\44\1\160\1\44\1\164\1\167\1\154\1\143\1\151"+
		"\1\142\1\164\1\141\1\160\2\151\1\165\1\160\1\162\2\151\1\164\1\145\1\144"+
		"\1\uffff\1\56\2\uffff\1\165\1\uffff\1\165\1\141\1\145\2\uffff\1\151\1"+
		"\141\1\145\1\143\2\163\1\145\1\155\1\157\1\145\1\163\1\141\1\44\1\143"+
		"\1\uffff\1\154\1\164\1\145\1\uffff\2\44\1\154\1\153\1\166\1\164\1\154"+
		"\1\165\1\164\1\145\1\164\1\163\1\157\1\44\2\145\1\44\1\144\1\154\1\150"+
		"\1\154\1\145\1\155\1\147\1\165\2\164\1\153\1\44\1\150\1\163\1\164\1\151"+
		"\2\44\1\162\1\156\1\145\1\154\1\uffff\1\164\1\145\1\162\1\141\1\162\2"+
		"\uffff\1\44\2\141\1\145\1\151\1\162\1\151\1\162\1\143\1\44\1\167\1\uffff"+
		"\1\44\1\157\1\uffff\1\44\1\145\1\44\1\144\1\146\1\145\1\147\1\154\1\145"+
		"\2\44\1\uffff\3\44\1\156\2\uffff\1\164\1\144\1\44\1\154\1\151\1\155\1"+
		"\164\1\156\1\146\1\uffff\1\147\1\164\2\143\1\156\1\143\1\44\1\150\1\uffff"+
		"\1\44\1\uffff\1\146\1\uffff\1\44\1\uffff\1\44\1\151\1\156\1\145\1\164"+
		"\1\44\5\uffff\1\165\1\44\1\163\1\uffff\1\171\1\157\1\145\1\44\1\143\1"+
		"\141\2\145\1\164\3\44\1\uffff\1\44\1\uffff\1\44\2\uffff\1\156\1\164\1"+
		"\162\1\44\1\uffff\1\145\1\uffff\2\44\2\156\1\uffff\1\145\1\143\2\44\1"+
		"\145\5\uffff\1\145\2\44\1\uffff\1\44\2\uffff\1\44\1\164\1\157\1\145\2"+
		"\uffff\2\144\4\uffff\1\163\1\146\5\44\5\uffff";
	static final String DFA22_maxS =
		"\1\uffff\1\157\4\75\3\uffff\1\71\7\uffff\1\53\1\55\1\52\1\57\1\uffff\1"+
		"\46\1\174\1\uffff\1\167\1\162\1\157\1\170\1\165\1\156\1\145\2\165\1\145"+
		"\1\167\1\171\1\157\2\151\1\156\1\uffff\1\145\1\uffff\2\uffff\1\uffff\1"+
		"\172\1\154\1\uffff\1\75\41\uffff\1\141\1\145\1\164\1\141\1\156\1\163\1"+
		"\165\1\164\1\154\1\156\1\162\1\156\1\172\1\160\1\172\1\164\1\167\1\154"+
		"\1\143\1\157\1\142\1\164\1\141\1\160\1\151\1\162\1\171\1\160\1\162\2\151"+
		"\1\164\1\145\1\144\1\uffff\1\145\2\uffff\1\165\1\uffff\1\165\1\141\1\145"+
		"\2\uffff\1\151\1\141\1\145\1\143\1\163\1\164\1\145\1\155\1\157\1\145\1"+
		"\163\1\141\1\172\1\143\1\uffff\1\157\1\164\1\145\1\uffff\2\172\1\154\1"+
		"\153\1\166\1\164\1\154\1\165\1\164\1\145\1\164\1\163\1\157\1\172\2\145"+
		"\1\172\1\144\1\154\1\150\1\154\1\145\1\155\1\147\1\165\2\164\1\153\1\172"+
		"\1\150\1\163\1\164\1\151\2\172\1\162\1\156\1\145\1\154\1\uffff\1\164\1"+
		"\145\1\162\1\141\1\162\2\uffff\1\172\2\141\1\145\1\151\1\162\1\151\1\162"+
		"\1\143\1\172\1\167\1\uffff\1\172\1\157\1\uffff\1\172\1\145\1\172\1\144"+
		"\1\146\1\145\1\147\1\154\1\145\2\172\1\uffff\3\172\1\156\2\uffff\1\164"+
		"\1\144\1\172\1\154\1\151\1\155\1\164\1\156\1\146\1\uffff\1\147\1\164\2"+
		"\143\1\156\1\143\1\172\1\150\1\uffff\1\172\1\uffff\1\146\1\uffff\1\172"+
		"\1\uffff\1\172\1\151\1\156\1\145\1\164\1\172\5\uffff\1\165\1\172\1\163"+
		"\1\uffff\1\171\1\157\1\145\1\172\1\143\1\141\2\145\1\164\3\172\1\uffff"+
		"\1\172\1\uffff\1\172\2\uffff\1\156\1\164\1\162\1\172\1\uffff\1\145\1\uffff"+
		"\2\172\2\156\1\uffff\1\145\1\143\2\172\1\145\5\uffff\1\145\2\172\1\uffff"+
		"\1\172\2\uffff\1\172\1\164\1\157\1\145\2\uffff\2\144\4\uffff\1\163\1\146"+
		"\5\172\5\uffff";
	static final String DFA22_acceptS =
		"\6\uffff\1\12\1\13\1\14\1\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\4\uffff"+
		"\1\31\2\uffff\1\40\20\uffff\1\122\1\uffff\1\126\2\uffff\1\130\2\uffff"+
		"\1\122\1\uffff\1\2\1\5\1\35\1\7\1\6\1\11\1\10\1\12\1\13\1\14\1\15\1\124"+
		"\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\32\1\25\1\33\1\26\1\34\1\27\1\125"+
		"\1\30\1\31\1\36\1\41\1\37\1\42\1\40\42\uffff\1\123\1\uffff\1\126\1\127"+
		"\1\uffff\1\55\3\uffff\1\4\1\3\16\uffff\1\66\3\uffff\1\71\47\uffff\1\64"+
		"\5\uffff\1\74\1\75\13\uffff\1\111\2\uffff\1\114\13\uffff\1\45\4\uffff"+
		"\1\56\1\57\11\uffff\1\76\10\uffff\1\107\1\uffff\1\112\1\uffff\1\115\1"+
		"\uffff\1\117\6\uffff\1\43\1\44\1\46\1\47\1\50\3\uffff\1\62\14\uffff\1"+
		"\105\1\uffff\1\110\1\uffff\1\116\1\120\4\uffff\1\54\1\uffff\1\60\4\uffff"+
		"\1\70\5\uffff\1\102\1\103\1\104\1\106\1\113\3\uffff\1\53\1\uffff\1\61"+
		"\1\63\4\uffff\1\77\1\100\2\uffff\1\1\1\52\1\51\1\65\7\uffff\1\73\1\101"+
		"\1\121\1\67\1\72";
	static final String DFA22_specialS =
		"\1\2\53\uffff\1\0\1\1\u0125\uffff}>";
	static final String[] DFA22_transitionS = {
			"\11\56\2\53\2\56\1\53\22\56\1\53\1\3\1\54\1\56\1\51\1\25\1\26\1\55\1"+
			"\13\1\14\1\23\1\21\1\10\1\22\1\11\1\24\12\52\1\7\1\12\1\5\1\2\1\4\1\56"+
			"\1\6\32\51\1\15\1\56\1\16\1\30\1\51\1\56\1\31\1\32\1\33\1\1\1\34\1\35"+
			"\2\51\1\36\2\51\1\37\1\51\1\40\1\51\1\41\1\51\1\42\1\43\1\44\1\50\1\45"+
			"\1\46\1\51\1\47\1\51\1\17\1\27\1\20\uff82\56",
			"\1\60\11\uffff\1\57",
			"\1\62",
			"\1\64",
			"\1\66",
			"\1\70",
			"",
			"",
			"",
			"\12\76",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\106",
			"\1\110",
			"\1\112",
			"\1\114\4\uffff\1\114",
			"",
			"\1\117",
			"\1\121",
			"",
			"\1\124",
			"\1\125",
			"\1\126\12\uffff\1\127\2\uffff\1\130",
			"\1\131\1\uffff\1\132\11\uffff\1\133",
			"\1\134\7\uffff\1\135\5\uffff\1\136\5\uffff\1\137",
			"\1\140\6\uffff\1\141\1\142",
			"\1\143",
			"\1\144\17\uffff\1\145",
			"\1\146\20\uffff\1\147\2\uffff\1\150",
			"\1\151",
			"\1\152\1\153\1\uffff\1\154",
			"\1\155\11\uffff\1\156\6\uffff\1\157",
			"\1\160\15\uffff\1\161",
			"\1\162\1\163",
			"\1\164",
			"\1\165",
			"",
			"\1\76\1\uffff\12\167\13\uffff\1\76\37\uffff\1\76",
			"",
			"\0\171",
			"\0\171",
			"",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\172\27"+
			"\61",
			"\1\174\3\uffff\1\175\5\uffff\1\176",
			"",
			"\1\177",
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
			"\1\u0081",
			"\1\u0082",
			"\1\u0083\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089\3\uffff\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0090",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u0091"+
			"\1\u0092\6\61",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098\5\uffff\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f\10\uffff\1\u00a0",
			"\1\u00a2\3\uffff\1\u00a1",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"",
			"\1\76\1\uffff\12\167\13\uffff\1\76\37\uffff\1\76",
			"",
			"",
			"\1\u00aa",
			"",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"",
			"",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00bc",
			"",
			"\1\u00bd\2\uffff\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
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
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00cf",
			"\1\u00d0",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec",
			"",
			"",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00f7",
			"",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00f9",
			"",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00fb",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0108",
			"",
			"",
			"\1\u0109",
			"\1\u010a",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"\1\u0117",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0119",
			"",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\u011b",
			"",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"",
			"",
			"",
			"",
			"\1\u0123",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0125",
			"",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\u0138",
			"",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u013b",
			"\1\u013c",
			"",
			"\1\u013d",
			"\1\u013e",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0141",
			"",
			"",
			"",
			"",
			"",
			"\1\u0142",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"",
			"",
			"\1\u014a",
			"\1\u014b",
			"",
			"",
			"",
			"",
			"\1\u014c",
			"\1\u014d",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"",
			"",
			"",
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
			return "1:1: Tokens : ( DOCUMENT | ASSIGN | EQ | TEQ | NEQ | GT | GE | LT | LE | AT | CL | CM | DOT | SC | LP | RP | LB | RB | LBR | RBR | ADD | SUB | STAR | DIV | MOD | INC | DEC | EXP | NOT | AND | OR | XOR | AND_BIT | OR_BIT | AWAIT | BREAK | CASE | CATCH | CLASS | CONST | CONTINUE | DEBUGGER | DEFAULT | DELETE | DO | ELSE | ENUM | EXPORT | EXTENDS | FALSE | FINALLY | FOR | FUNCTION | IF | IMPLEMENTS | IMPORT | IN | INSTANCEOF | INTERFACE | LET | NEW | NULL | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | STATIC | SUPER | SWITCH | THIS | THROW | TRY | TRUE | TYPEOF | VAR | VOID | WHILE | WITH | YIELD | UNDEFINED | ID | INTEGER | FLOAT | COMMENT | WS | STRING | ERROR_TK );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA22_44 = input.LA(1);
						s = -1;
						if ( ((LA22_44 >= '\u0000' && LA22_44 <= '\uFFFF')) ) {s = 121;}
						else s = 46;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA22_45 = input.LA(1);
						s = -1;
						if ( ((LA22_45 >= '\u0000' && LA22_45 <= '\uFFFF')) ) {s = 121;}
						else s = 46;
						if ( s>=0 ) return s;
						break;

					case 2 : 
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
						else if ( (LA22_0=='a') ) {s = 25;}
						else if ( (LA22_0=='b') ) {s = 26;}
						else if ( (LA22_0=='c') ) {s = 27;}
						else if ( (LA22_0=='e') ) {s = 28;}
						else if ( (LA22_0=='f') ) {s = 29;}
						else if ( (LA22_0=='i') ) {s = 30;}
						else if ( (LA22_0=='l') ) {s = 31;}
						else if ( (LA22_0=='n') ) {s = 32;}
						else if ( (LA22_0=='p') ) {s = 33;}
						else if ( (LA22_0=='r') ) {s = 34;}
						else if ( (LA22_0=='s') ) {s = 35;}
						else if ( (LA22_0=='t') ) {s = 36;}
						else if ( (LA22_0=='v') ) {s = 37;}
						else if ( (LA22_0=='w') ) {s = 38;}
						else if ( (LA22_0=='y') ) {s = 39;}
						else if ( (LA22_0=='u') ) {s = 40;}
						else if ( (LA22_0=='$'||(LA22_0 >= 'A' && LA22_0 <= 'Z')||LA22_0=='_'||(LA22_0 >= 'g' && LA22_0 <= 'h')||(LA22_0 >= 'j' && LA22_0 <= 'k')||LA22_0=='m'||LA22_0=='o'||LA22_0=='q'||LA22_0=='x'||LA22_0=='z') ) {s = 41;}
						else if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {s = 42;}
						else if ( ((LA22_0 >= '\t' && LA22_0 <= '\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 43;}
						else if ( (LA22_0=='\"') ) {s = 44;}
						else if ( (LA22_0=='\'') ) {s = 45;}
						else if ( ((LA22_0 >= '\u0000' && LA22_0 <= '\b')||(LA22_0 >= '\u000B' && LA22_0 <= '\f')||(LA22_0 >= '\u000E' && LA22_0 <= '\u001F')||LA22_0=='#'||LA22_0=='?'||LA22_0=='\\'||LA22_0=='`'||(LA22_0 >= '~' && LA22_0 <= '\uFFFF')) ) {s = 46;}
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
