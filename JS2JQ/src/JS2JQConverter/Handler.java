package JS2JQConverter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

import org.antlr.grammar.v3.ANTLRParser.block_return;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.TokenStream;

import JS2JQConverter.JavaScriptToJQueryConverterLexer;
import JS2JQTester.ParserTester;

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
	String lastId;
	Vector<AjaxInformation> ajax;
	
	// ******
	public Handler (TokenStream input) {
		this.input = input;
		this.ajax = new Vector<AjaxInformation>();
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
				Token succ= input.get(index);
				Token doubleSucc = input.get(index);
				Token tripleSucc = input.get(index);
	
				while(find<3) {
					if(idx+1>=input.size())  //controllo oltre alla regola 
						break;
					idx++;
					if(input.get(idx).getChannel()!=JavaScriptToJQueryConverterLexer.HIDDEN) {
						if(find==0)
							succ = input.get(idx);
						else if (find==1)
							doubleSucc = input.get(idx);
						else if (find==2)
							tripleSucc = input.get(idx);
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
					else if(id.getText().equals("style") && succ.getType()==28 && tripleSucc.getType()!=7 && tripleSucc.getType()!=76) {
						Token param = doubleSucc;
						((TokenRewriteStream) input).replace(index, doubleSucc.getTokenIndex(), "css(\"" + param.getText() + "\")");
					}
				}
			}
			index++;
		}
	}
	
	/*TOKENS usati: 
	 * 28 --> Punto
	 * 61 --> LP
	 * 7  --> Assign
	 * 76 --> PlusEq
	 * 47 --> ID
	 * 86 --> SC
	 * */
	public void translateIdWithAssign(Token start, Token stop) {
		int index = start.getTokenIndex();
		while(index <= stop.getTokenIndex()) {
			
			int idx = index;
			Token prec=input.get(index);
			Boolean find = false;
			while(!find) {
				if(idx-1<0) 
					break;
				idx--;
				if(input.get(idx).getChannel()!=JavaScriptToJQueryConverterLexer.HIDDEN) {
					prec = input.get(idx);
					find=true;
				}
			}
			idx = index;
			
			int counter=0;
			Token succ= input.get(index);
			Token doubleSucc = input.get(index);
			Token quadSucc = input.get(index);

			while(counter<4) {
				if(idx+1>=input.size())  //controllo oltre alla regola 
					break;
				idx++;
				if(input.get(idx).getChannel()!=JavaScriptToJQueryConverterLexer.HIDDEN) {
					if(counter==0)
						succ = input.get(idx);
					else if (counter==1)
						doubleSucc = input.get(idx);
					else if (counter==3)
						quadSucc = input.get(idx);
					counter++;
				}
			}
			idx = index;
			
			if (input.get(index).getType()==47 && (succ.getType()==7 || succ.getType()==76)){ 
				Token id = input.get(index);
				
				String output = "";
				
				int end = stop.getTokenIndex();
				if(stop.getType()==86)
					end--;
				output = ((TokenRewriteStream) input).toString(doubleSucc.getTokenIndex(), end);
				String prefix = "";
				if(succ.getType()==76) {
					prefix = input.toString(start.getTokenIndex(), prec.getTokenIndex());
				}
				if(index > 0 && prec.getType() == 28){
					if(id.getText().equals("value")) {
						if(succ.getType()==76) {
							prefix += "val() + ";
							output=prefix+output;
						}
						((TokenRewriteStream) input).replace(index, end, "val("+ output +")");
					}
					else if(id.getText().equals("innerHTML")) {
						if(succ.getType()==76) {
							prefix += "html() + ";
							output=prefix+output;
						}
						((TokenRewriteStream) input).replace(index, end, "html(" + output + ")");
					}
					else if(id.getText().equals("textContent")){
						if(succ.getType()==76) {
							prefix += "text() + ";
							output=prefix+output;
						}
						((TokenRewriteStream) input).replace(index, end, "text(" + output + ")");
					}
				}
				
			}
			else if(input.get(index).getType()==47 && input.get(index).getText().equals("style") && succ.getType()==28) {
				String output = "";
				int end = stop.getTokenIndex();
				if(stop.getType()==86)
					end--;
				output = ((TokenRewriteStream) input).toString(quadSucc.getTokenIndex(), end);
				((TokenRewriteStream) input).replace(index, end, "css("+ "\"" + doubleSucc.getText() +"\", " + output + ")");
			}
			index++;
		}
	}
	
	public void searchXMLHttpRequest(Token start, Token stop) {
		int index = start.getTokenIndex();
		Boolean findNew = false;
		while(index<=stop.getTokenIndex()) {
			if(input.get(index).getType()==68) { // 68 --> new
				findNew=true;
			}
			if(findNew && input.get(index).getType()==47 && input.get(index).getText().equals("XMLHttpRequest")) { //47 --> ID
				AjaxInformation x = new AjaxInformation(lastId, start.getTokenIndex(), stop.getTokenIndex());
				ajax.add(x);
			}
			index++;
		}
	}
	
	public void saveVariable(String text, Token start, Token stop, Token o1, Token o2) {
		int index = start.getTokenIndex();
		while(input.get(index).getType()!=47)
			index++;
		text = input.get(index).getText();
		//mancherebbe controllo su ++/-- dopo la variabile
		if(!text.equals("XMLHttpRequest")) {
			lastId = text;
			for(int i=0; i<ajax.size(); i++) {
				if(lastId.equals(ajax.get(i).getVariableName())) {
					ajaxCall(ajax.get(i), start, stop);
					break;
				}
			}
		}
		
	}
	
	
	private void ajaxCall(AjaxInformation ajax, Token start, Token stop) {
		if(ajax.indexAjax[0] == -1)
			ajax.indexAjax[0] = start.getTokenIndex();
		ajax.indexAjax[1] = stop.getTokenIndex();
	}

	
	public void getAjaxAttribute(Token start, Token stop) {
		if(start.getType()==47) {
			int idx=start.getTokenIndex();
			int counter=0;
			Token succ= input.get(idx);
			Token doubleSucc = input.get(idx);
			Token tripleSucc = input.get(idx);
			Token quadSucc = input.get(idx);

			while(counter<4) {
				if(idx+1>=input.size())  //controllo oltre alla regola 
					break;
				idx++;
				if(input.get(idx).getChannel()!=JavaScriptToJQueryConverterLexer.HIDDEN) {
					if(counter==0)
						succ = input.get(idx);
					else if (counter==1)
						doubleSucc = input.get(idx);
					else if (counter==2)
						tripleSucc = input.get(idx);
					else if (counter==3)
						quadSucc = input.get(idx);
					counter++;
				}
			}
			AjaxInformation block = null;
			for(int i=0; i<ajax.size(); i++) {
				if(start.getText().equals(ajax.get(i).getVariableName())) {
					block = ajax.get(i);
					break;
				}
			}
			if(block==null) return;
			
			if(succ.getType()==28 && doubleSucc.getType()==47 && tripleSucc.getType()==7) { //DOT, ID, ASSIGN
				int end = stop.getTokenIndex();
				if(stop.getType()==86) { //SC
					end--;
				}
				String value = input.toString(quadSucc.getTokenIndex(), end);
				if(doubleSucc.getText().equals("onload") || doubleSucc.getText().equals("onreadystatechange")) {
					String[] arrOfStr = value.split("\\(", 2);
					String in = "(data, textStaus, jqXHR";
					if(!arrOfStr[1].startsWith(")"))
						in += ", ";
					value = value.replaceFirst("\\(", in);
					value = value.replaceAll(block.getVariableName(), "jqXHR");
				}
				block.propertyMap.put(doubleSucc.getText(), value);
			}
		}
	}
	
	public void getAjaxMethod(Token start, Token stop) {
		if(start.getType()==47) {
			
			int idx=start.getTokenIndex();
			int counter=0;
			Token succ= input.get(idx);
			Token doubleSucc = input.get(idx);
			Token tripleSucc = input.get(idx);
			Token quadSucc = input.get(idx);

			while(counter<4) {
				if(idx+1>=input.size())  //controllo oltre alla regola 
					break;
				idx++;
				if(input.get(idx).getChannel()!=JavaScriptToJQueryConverterLexer.HIDDEN) {
					if(counter==0)
						succ = input.get(idx);
					else if (counter==1)
						doubleSucc = input.get(idx);
					else if (counter==2)
						tripleSucc = input.get(idx);
					else if (counter==3)
						quadSucc = input.get(idx);
					counter++;
				}
			}
			
			AjaxInformation block = null;
			for(int i=0; i<ajax.size(); i++) {
				if(start.getText().equals(ajax.get(i).getVariableName())) {
					block = ajax.get(i);
					break;
				}
			}
			if(block==null) return;
			if(succ.getType()==28 && doubleSucc.getType()==47 && tripleSucc.getType()==61) { //DOT, ID, LP
				int index = quadSucc.getTokenIndex();
				if(doubleSucc.getText().equals("open")) {
					int c = 0;
					while(input.get(index).getType()!=84) { //RP
						while(input.get(index).getType()==15 || input.get(index).getChannel() == JavaScriptToJQueryConverterLexer.HIDDEN) //CM
							index++;
						if(c==0)
							block.propertyMap.put("method", input.get(index).getText());
						else if(c==1)
							block.propertyMap.put("url", input.get(index).getText());
						else if(c==2)
							block.propertyMap.put("async", input.get(index).getText());
						else if(c==3)
							block.propertyMap.put("user", input.get(index).getText());
						else if(c==4)
							block.propertyMap.put("psw", input.get(index).getText());
						else
							break;
						index++;
						c++;
					}
					
				}
				else if(doubleSucc.getText().equals("send")){
					if(quadSucc.getType()!=84) {
						int i = quadSucc.getTokenIndex();
						while(input.get(i).getType()!=84)
							i++;
						String s = input.toString(quadSucc.getTokenIndex(), i-1);
						block.propertyMap.put("data", s);
						translateAjax(block);
					}
				}
			}
		}
	}
	
	private void translateAjax(AjaxInformation block) {
		block.sendReached = true;
		if(block.propertyMap.get("url")==null || block.propertyMap.get("method")==null || (block.propertyMap.get("onload")==null && block.propertyMap.get("onreadystatechange")==null)) {
			block.translateFlag = false;
			block.errorMessage = "Cannot translate ajax request, missing parameters on variable" + block.getVariableName();  //TODO migliorare segnalazione errore
		}
		if(block.translateFlag) {
			String output = "$.ajax({url:" + block.propertyMap.get("url") + ", type: " + block.propertyMap.get("method") + ", ";
			if(block.statusMap.size()==0) {
				output += "success: ";
				if(block.propertyMap.get("onload")!=null)
					output += block.propertyMap.get("onload");
				else 
					output += block.propertyMap.get("onreadystatechange");
			}
			else {
				output += "statusCode: {";
				for(HashMap.Entry<Integer, String> entry: block.statusMap.entrySet()) {
					output += entry.getKey() + ": function(data, textStatus, jqXHR) {" + entry.getValue() + "}, "; 
				}
				output = output.substring(0, output.length()-2);
				output += "}";
			}
				
			if(block.propertyMap.get("user") != null && block.propertyMap.get("psw") != null) {
				output += ", username: " + block.propertyMap.get("user");
				output += ", password: " + block.propertyMap.get("psw");
			}
			
			if(block.propertyMap.get("async")!=null) {
				output += ", async: " + block.propertyMap.get("async");
			}
			
			if(block.propertyMap.get("method").equals("POST") && block.propertyMap.get("data")!=null) {
				output += ", data: " + block.propertyMap.get("data");
			}
			
			output += "})";
			
			if(input.get(block.indexAjax[1]+1).getType()!=86)
				output += ";";
			
			if(input.get(block.indexVariableInizialization[1]+1).getType()==86)
				block.indexVariableInizialization[1] += 1;
				
			((TokenRewriteStream) input).delete(block.indexVariableInizialization[0], block.indexVariableInizialization[1]);
			((TokenRewriteStream) input).replace(block.indexAjax[0], block.indexAjax[1], output);
			
		}
		else
			System.err.println(block.errorMessage);
			ParserTester.consoleOutput+=block.errorMessage;
	}

	public void searchStatus(Token start, Token stop) {
		int index = start.getTokenIndex();
		Boolean flagStatus = false;
		AjaxInformation block = null;
		for(int i=0; i<ajax.size(); i++) {
			if(ajax.get(i).indexAjax[0] < start.getTokenIndex() && !ajax.get(i).sendReached)
				block = ajax.get(i);
		}
		if(block == null)
			return;
		
		while(index<=stop.getTokenIndex()) { 
			TokensNotHidden tnh = new TokensNotHidden(1, 7, index, input);
			if(input.get(index).getType()==95 && tnh.succ[1].getText().equals("status")) {
				if(tnh.succ[0].getType()==28 && (tnh.succ[2].getType()==94 || tnh.succ[2].getType()==31) && tnh.prec[0].getType()==61 && tnh.succ[3].getType()==54 && tnh.succ[4].getType()==84) { //31 --> EQ, 94 --> TEQ, 61--> LP, 54 --> INT, 84 --> RP
					flagStatus = true;
					Integer status = Integer.parseInt(tnh.succ[3].getText()); 
					int begin;
					int end;
					if(tnh.succ[5].getType()==57) { //LBR
						begin = tnh.succ[6].getTokenIndex(); 
						int idx = begin;
						int lbr = 1;
						int rbr = 0;
						while(lbr-rbr!=0) {
							if(input.get(idx).getType()==57)
								lbr++;
							else if(input.get(idx).getType()==82) //RBR
								rbr++;
							if(lbr-rbr!=0)
								idx++;
						}
						end = idx-1;
					}
					else {
						begin = tnh.succ[5].getTokenIndex();
						int idx = begin;
						while(input.get(idx).getType()!=29 && idx<=stop.getTokenIndex()) {
							idx++;
						}
						end = idx-1;
					}
					String code = input.toString(begin, end);
					if(block.statusMap.get(status)!=null) {
						block.translateFlag = false;
						block.errorMessage = "Duplicated status"; //SISTEMARE SEGNALAZIONE ERRORE
					}else
						block.statusMap.put(status, code);
				}
				else {
					block.translateFlag = false;
					block.errorMessage = "intraducibile (if)"; //SISTEMARE MESSAGGIO
				}
			}
			if(input.get(index).getType()==29 && tnh.succ[0].getType()!=48 && flagStatus) { //29 --> ELSE, 48 --> IF
				block.translateFlag = false;
				block.errorMessage = "Intraducibile (else)"; //SISTEMARE MESSAGGIO
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
