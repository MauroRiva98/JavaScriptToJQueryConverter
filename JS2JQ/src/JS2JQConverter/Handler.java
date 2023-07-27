package JS2JQConverter;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.TokenStream;

import JS2JQConverter.JavaScriptToJQueryConverterLexer;

public class Handler {
	public static int LEXICAL_ERROR = 0;
	public static int SYNTAX_ERROR = 1;
	public static int UNDECLARED_VAR_ERROR = 2;
	public static int DECLARED_VAR_ERROR = 3;
	public static int INC_ERROR = 4;
	public static int MISS_INC_ERROR = 5;
	public static int DIV_BY_ZERO_ERROR	= 6;
	public static int FUNCTION_NAME_ERROR = 7;
	public static int LAST_DOT_ERROR = 8;
	public static int GET_ERROR = 9;
	public static int DUPLICATE_INC_DEC = 10;
	public static int MISS_INC_DEC = 11;
	
	//Hashtable<String, VarDescriptor> symbolTable;
	// ******
	List<String> errorList;
	TokenStream input;
	//TokenRewriteStream input;
	
	// ******
	public Handler (TokenStream input) {
		this.input = input;
		//symbolTable = new Hashtable<String, VarDescriptor>(101);
		errorList = new ArrayList<String>();
	}
	
	// ******
	public List<String> getErrorList(){
		return  errorList;
	}

	// ***** gestione errori lessicali e sintattici
	public void handleError(Token tk, String hdr, String msg) {
		String errMsg;
		if (tk == null)
			tk = input.LT(-1);

		if (tk.getType() == JavaScriptToJQueryConverterLexer.ERROR_TK)
			errMsg = "Lexical Error " + LEXICAL_ERROR;
		else 
			errMsg = "Syntax Error " + SYNTAX_ERROR;

		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]: " +
					" on token '" + tk.getText() + "'";
//		errMsg += "\n" + hdr + "\n**********\n" + msg;
		errorList.add(errMsg);
	}

	// ***** gestione errori semantici
	void myErrorHandler(int code, Token tk) {
		String errMsg;
		// i primi due casi non dovrebbero mai avvenire... ma giusto in caso...
		if (code == LEXICAL_ERROR)
			errMsg = "Fake Lexical Error " + code;
		else if (code == SYNTAX_ERROR)
			errMsg = "Fake Syntax Error " + code;
		else
			errMsg = "Semantic Error " + code; 
	
		if (tk == null)
			tk = input.LT(-1);
		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]: ";
		
		if (code == UNDECLARED_VAR_ERROR)
			errMsg += "The variable '" + tk.getText() + "' is undeclared";
		else if (code == DECLARED_VAR_ERROR)
			errMsg += "The variable '" + tk.getText() + "' has been already declared";
		else if (code == INC_ERROR)
			errMsg += "Cannot use '++' or '--' before and after the variable '" + tk.getText() + "'";
		else if (code == MISS_INC_ERROR)
			errMsg += "Missing '++' or '--' before or after the variable '" + tk.getText() + "'";
		else if (code == DIV_BY_ZERO_ERROR)
			errMsg += "Division by 0";
		else if (code == FUNCTION_NAME_ERROR)
			errMsg += "The function declaration must have a name in this context";
		else if (code == LAST_DOT_ERROR)
			errMsg += "An instruction cannot ends with a dot";
		else if(code == GET_ERROR)
			errMsg += "Document get Type not recognized";
		else if(code == DUPLICATE_INC_DEC)
			errMsg += "Cannot use '++' or '--' before and after the variable";
		else if(code == MISS_INC_DEC)
			errMsg += "Missing '++' or '--' before or after the variable ";

		
		errorList.add(errMsg);
	}
	
	public void test(String rule, Token start) {
		//System.out.println("$(\"#" + i.getText().substring(1, i.getText().length()-1) + "\");");
		int index = start.getTokenIndex();
		System.out.println(input.get(index).getText());
	}
	
	public void checkFunctionName (Token name, Token func) {
		if (name == null) {
			int index = func.getTokenIndex();
			if(index == 0)
				myErrorHandler(FUNCTION_NAME_ERROR, func);
			while(index > 0) {
				index--;
				if(input.get(index).getChannel() != JavaScriptToJQueryConverterLexer.HIDDEN) {
					int prec = input.get(index).getType();
					if(prec != 7 && prec != 13 && prec != 61)
						myErrorHandler(FUNCTION_NAME_ERROR, func);
					break;
				}
			}
		}
	}
	
	public void checkLastDot(Token last) {
		if (last.getType()==28) {
			myErrorHandler(LAST_DOT_ERROR, last);
		}
	}
	
	public void prova(Token first) {
		((TokenRewriteStream) input).replace(first.getTokenIndex(), "Prova");
	}
	
	public void translateGet(Token typeGet, Token start, Token end) {
		String type = typeGet.getText();
		String param = "";
		int index = typeGet.getTokenIndex();
		index+=2;
		Vector<Token> parameters = new Vector<Token>();
		while(input.get(index).getType() != 84 && index < input.size()) { //84 --> RP
			parameters.add(input.get(index));
			index++;
		}
		Boolean endString = false;
		if(type.equals("getElementById")) 
			param+="\"#";
		else if(type.equals("getElementsByClassName"))
			param+="\".";
		else if(type.equals("getElementsByName")) {
			param+="\"[name=";
			endString = true;
		}
		else if (type.equals("getElementsByTagName"))
			param += "\"";
		else{
			myErrorHandler(GET_ERROR, typeGet);
			return;
		}
			
		if(parameters.get(0).getType() == 90 && parameters.size()==1) {
			param += parameters.get(0).getText().substring(1, parameters.get(0).getText().length()-1);
			if(endString)
				param += "]\"";
			else
				param += "\"";
		}
		else {
			if(!param.equals(""))
				param += "\" + ";
			for(int i = 0; i<parameters.size();i++) {
				param += parameters.get(i).getText();
			}
			if(endString)
				param += " + \"]\"";
		}
		
		
		String output = "$(" + param + ")";
		((TokenRewriteStream) input).replace(start.getTokenIndex(),end.getTokenIndex(), output);
		
	}
	
	/*TOKENS usati: 
	 * 28 --> Punto
	 * 61 --> LP
	 * 7  --> Assign
	 * 76 --> PlusEq
	 * 47 --> ID
	 * */
	public void translateId(Token start, Token stop) { //funzione chiamata da IdDotArrayRule
		int index = start.getTokenIndex();
		while(index <= stop.getTokenIndex()) {
			if (input.get(index).getType()==47){
				Token id = input.get(index);
				int idx = index;
				Token prec=input.get(index);;
				Token doublePrec = input.get(index);;
				int find = 0;
				while(find<2) {
					if(idx-1<0) 
						break;
					idx--;
					if(input.get(idx).getChannel()!=JavaScriptToJQueryConverterLexer.HIDDEN) {
						if(find==0)
							prec = input.get(idx);
						else
							doublePrec = input.get(idx);
						find++;
					}
				}
				idx = index;
				
				find=0;
				Token succ= input.get(index);;
				Token doubleSucc = input.get(index);;
	
				while(find<2) {
					if(idx+1>=input.size())  //controllo oltre alla regola 
						break;
					idx++;
					if(input.get(idx).getChannel()!=JavaScriptToJQueryConverterLexer.HIDDEN) {
						if(find==0)
							succ = input.get(idx);
						else
							doubleSucc = input.get(idx);
						find++;
					}
				}
				idx = index;
				
				if(index > 0 && prec.getType() == 28){
					if(id.getText().equals("getAttribute") && index<stop.getTokenIndex() && succ.getType()==61) {
						((TokenRewriteStream) input).replace(index, "attr");
					}	
					else if(id.getText().equals("add") && index>1 && doublePrec.getText().equals("classList") && succ.getType()==61) {
						((TokenRewriteStream) input).replace(doublePrec.getTokenIndex(), index, "addClass");
					}
					else if(succ.getType()!=28 && succ.getType()!=7 && succ.getType()!=76) { //caso: x=document.getElementById("myText").value
						if(id.getText().equals("value")) {
							((TokenRewriteStream) input).replace(index, "val()");
						}
						else if(id.getText().equals("innerHTML")) {
							((TokenRewriteStream) input).replace(index, "html()");
						}
						else if(id.getText().equals("textContent")){
							((TokenRewriteStream) input).replace(index, "text()");
						}
					}
					else if(id.getText().equals("style") && succ.getType()==28 && succ.getType()!=7 && succ.getType()!=76) {
						Token param = doubleSucc;
						((TokenRewriteStream) input).replace(index, doubleSucc.getTokenIndex(), "css(\"" + param.getText() + "\")");
					}
				}
			}
			index++;
		}
	}
	
	public void translateIdWithAssign(Token start, Token stop) {
		int index = start.getTokenIndex();
		while(index <= stop.getTokenIndex()) {
			if (input.get(index).getType()==47 && (input.get(index+1).getType()==7 || input.get(index+1).getType()==76)){
				System.out.println("IF translateIdWithAssign");
				Token id = input.get(index);
				Vector<Token> params = new Vector<Token>();
				String output = "";
				for(int i = index+1; i<= stop.getTokenIndex(); i++){
					if(i != stop.getTokenIndex() || input.get(i).getType()!=86) 
							params.add(input.get(i));
				}
				output = ((TokenRewriteStream) input).toString(params.get(0).getTokenIndex(), params.get(params.size()-1).getTokenIndex());
				if(index > 0 && input.get(index-1).getType() == 28){
					if(id.getText().equals("value")) {
						((TokenRewriteStream) input).replace(index, "val("+ output +")");
					}
					else if(id.getText().equals("innerHTML")) {
						((TokenRewriteStream) input).replace(index, "html(" + output + ")");
					}
					else if(id.getText().equals("textContent")){
						((TokenRewriteStream) input).replace(index, "text(" + output + ")");
					}
				}
				
			}
			index++;
		}
	}
	
	/*public void checkIncDec(Token before, Token after, Token id) {
		System.out.println("CHECKINCDEC FOR");
		if(before != null && after != null)
			myErrorHandler(DUPLICATE_INC_DEC, id);
		else if(before == null && after == null)
			myErrorHandler(MISS_INC_DEC, id);
	}*/
	
	public void checkDuplicateIncDec(Token before, Token after, Token id) {
		if(before != null && after != null)
			myErrorHandler(DUPLICATE_INC_DEC, id);
	}
	
	
	/*
	public void declareVar (Token t, Token v) {
		if (t!=null && v!=null) {
			String name = v.getText();
			//VarDescriptor vd = new VarDescriptor(name, t.getText());
			if (symbolTable.containsKey(name))
				myErrorHandler(DECLARED_VAR_ERROR, v);
			else {
				symbolTable.putIfAbsent(name, vd);
				System.out.println("Hai appena dichiarato:" + name + 
										" di tipo "+t.getText());
			}
		}
	}
	*/


	// ****
	
	/*public boolean checkReference(Token var) {
		if (var!=null) {
			String name = var.getText();
			if (!symbolTable.containsKey(name))
				myErrorHandler(UNDECLARED_VAR_ERROR, var);
			else return true;
		}
		return false;		
	}
	*/

	/*
	public void assignValue(Token n, float v) {
		if (n != null && checkReference(n)) {
			String name = n.getText();
			VarDescriptor vd = symbolTable.get(name);
			if (vd != null)
				vd.value = v;
			System.out.println("Hai assegnato il valore " + v + " alla variabile " + name);
		}
	}

	// *****
	public float getVarValue(Token x) {
		if (x != null && checkReference(x)) {
			String name = x.getText();
			VarDescriptor vd = symbolTable.get(name);
			if (vd != null)
				return vd.value;
		}
		return 0;
	}
	*/

	public float convertToFloat(Token n) {
		if (n != null)
			return Float.parseFloat(n.getText());
		return 0;
	}

	public float calculateAdd(float t1, Token op, float t2) {
		float res = t1;
		if (op != null) {
			if (op.getText().equals("+"))
				res = t1+t2;
			else
				res = t1-t2;
		}
			
		return res;
	}


	public float calculateMul(float f1, Token op, float f2) {
		float res = f1;
		if (op != null) {
			if (op.getText().equals("*"))
				res = f1*f2;
			else if (f2 != 0)
				res = f1/f2;
			else 
				myErrorHandler(DIV_BY_ZERO_ERROR, op);
		}
			
		return res;
	}
}
