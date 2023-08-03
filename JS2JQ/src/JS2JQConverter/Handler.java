package JS2JQConverter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
			errMsg = "Lexical Error ";
		else 
			errMsg = "Syntax Error ";

		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]: " +
					" on token '" + tk.getText() + "'";
//		errMsg += "\n" + hdr + "\n**********\n" + msg;
		errorList.add(errMsg +"\n");
	}

	// ***** gestione errori semantici
	void myErrorHandler(int code, Token tk) {
		String errMsg;
		// i primi due casi non dovrebbero mai avvenire... ma giusto in caso...
		if (code == LEXICAL_ERROR)
			errMsg = "Fake Lexical Error ";
		else if (code == SYNTAX_ERROR)
			errMsg = "Fake Syntax Error ";
		else
			errMsg = "Semantic Error "; 
	
		if (tk == null)
			tk = input.LT(-1);
		errMsg += " at [" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]: ";
		
		if (code == FUNCTION_NAME_ERROR)
			errMsg += "The function declaration must have a name in this context";
		else if (code == LAST_DOT_ERROR)
			errMsg += "An instruction cannot ends with a dot";
		else if(code == GET_ERROR)
			errMsg += "Document get Type not recognized";
		else if(code == DUPLICATE_INC_DEC)
			errMsg += "Cannot use '++' or '--' before and after the variable";
		else if(code == MISS_INC_DEC)
			errMsg += "Missing '++' or '--' before or after the variable ";

		errorList.add(errMsg +"\n");
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
					if(prec != getTokenNumber("ASSIGN") && prec != getTokenNumber("CL") && prec != getTokenNumber("LP"))
						myErrorHandler(FUNCTION_NAME_ERROR, func);
					break;
				}
			}
		}
	}
	
	public void checkLastDot(Token last) {
		if (last.getType()==getTokenNumber("DOT")) {
			myErrorHandler(LAST_DOT_ERROR, last);
		}
	}
	
	
	public void translateGet(Token typeGet, Token start, Token end) {
		String type = typeGet.getText();
		String param = "";
		int index = typeGet.getTokenIndex();
		index+=2;
		Vector<Token> parameters = new Vector<Token>();
		while(input.get(index).getType() != getTokenNumber("RP") && index < input.size()) {
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
			
		if(parameters.get(0).getType() == getTokenNumber("STRING") && parameters.size()==1) {
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
	
	
	public void translateId(Token start, Token stop) { //funzione chiamata da IdDotArrayRule
		int index = start.getTokenIndex();
		while(index <= stop.getTokenIndex()) {
			
			if (input.get(index).getType()==getTokenNumber("ID")){
				Token id = input.get(index);
				
				TokensNotHidden tnh = new TokensNotHidden(2, 3, index, input);	
				
				if(index > 0 && tnh.prec[0].getType() == getTokenNumber("DOT")){
					if(id.getText().equals("getAttribute") && index<stop.getTokenIndex() && tnh.succ[0].getType()==getTokenNumber("LP")) {
						((TokenRewriteStream) input).replace(index, "attr");
					}	
					else if(id.getText().equals("add") && index>1 && tnh.prec[1].getText().equals("classList") && tnh.succ[0].getType()==getTokenNumber("LP")) {
						((TokenRewriteStream) input).replace(tnh.prec[1].getTokenIndex(), index, "addClass");
					}
					else if(tnh.succ[0].getType()!=getTokenNumber("DOT") && tnh.succ[0].getType()!=getTokenNumber("ASSIGN") && tnh.succ[0].getType()!=getTokenNumber("PLUSEQ")) { //caso: x=document.getElementById("myText").value
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
					else if(id.getText().equals("style") && tnh.succ[0].getType()==getTokenNumber("DOT") && tnh.succ[2].getType()!=getTokenNumber("ASSIGN") && tnh.succ[2].getType()!=getTokenNumber("PLUSEQ")) {
						Token param = tnh.succ[1];
						((TokenRewriteStream) input).replace(index, tnh.succ[1].getTokenIndex(), "css(\"" + param.getText() + "\")");
					}
				}
			}
			index++;
		}
	}
	
	public void translateIdWithAssign(Token start, Token stop) {
		int index = start.getTokenIndex();
		while(index <= stop.getTokenIndex()) {
			
			TokensNotHidden tnh = new TokensNotHidden(1, 4, index, input);
			
			if (input.get(index).getType()==getTokenNumber("ID") && (tnh.succ[0].getType()==getTokenNumber("ASSIGN") || tnh.succ[0].getType()==getTokenNumber("PLUSEQ"))){ 
				Token id = input.get(index);
				
				String output = "";
				
				int end = stop.getTokenIndex();
				if(stop.getType()==getTokenNumber("SC"))
					end--;
				output = ((TokenRewriteStream) input).toString(tnh.succ[1].getTokenIndex(), end);
				String prefix = "";
				if(tnh.succ[0].getType()==getTokenNumber("PLUSEQ")) {
					prefix = input.toString(start.getTokenIndex(), tnh.prec[0].getTokenIndex());
				}
				if(index > 0 && tnh.prec[0].getType() == getTokenNumber("DOT")){
					if(id.getText().equals("value")) {
						if(tnh.succ[0].getType()==getTokenNumber("PLUSEQ")) {
							prefix += "val() + ";
							output=prefix+output;
						}
						((TokenRewriteStream) input).replace(index, end, "val("+ output +")");
					}
					else if(id.getText().equals("innerHTML")) {
						if(tnh.succ[0].getType()==getTokenNumber("PLUSEQ")) {
							prefix += "html() + ";
							output=prefix+output;
						}
						((TokenRewriteStream) input).replace(index, end, "html(" + output + ")");
					}
					else if(id.getText().equals("textContent")){
						if(tnh.succ[0].getType()==getTokenNumber("PLUSEQ")) {
							prefix += "text() + ";
							output=prefix+output;
						}
						((TokenRewriteStream) input).replace(index, end, "text(" + output + ")");
					}
				}
				
			}
			else if(input.get(index).getType()==getTokenNumber("ID") && input.get(index).getText().equals("style") && tnh.succ[0].getType()==getTokenNumber("DOT")) {
				String output = "";
				int end = stop.getTokenIndex();
				if(stop.getType()==getTokenNumber("SC"))
					end--;
				if(tnh.succ[1].getText().equals("display") && tnh.succ[2].getType()==getTokenNumber("ASSIGN")) {
					if(tnh.succ[3].getText().equals("\"none\"")) {
						output = "hide()";
						((TokenRewriteStream) input).replace(index, end, output);
					}
					else if(tnh.succ[3].getText().equals("\"block\"")) {
						output = "show()";
						((TokenRewriteStream) input).replace(index, end, output);
					}
					else {
						output = ((TokenRewriteStream) input).toString(tnh.succ[3].getTokenIndex(), end);
						((TokenRewriteStream) input).replace(index, end, "css("+ "\"" + tnh.succ[1].getText() +"\", " + output + ")");
					}	
				}
				else {
					output = ((TokenRewriteStream) input).toString(tnh.succ[3].getTokenIndex(), end);
					((TokenRewriteStream) input).replace(index, end, "css("+ "\"" + tnh.succ[1].getText() +"\", " + output + ")");
				}
			}
			index++;
		}
	}
	
	public void searchXMLHttpRequest(Token start, Token stop) {
		int index = start.getTokenIndex();
		Boolean findNew = false;
		while(index<=stop.getTokenIndex()) {
			if(input.get(index).getType()==getTokenNumber("NEW")) { 
				findNew=true;
			}
			if(findNew && input.get(index).getType()==getTokenNumber("ID") && input.get(index).getText().equals("XMLHttpRequest")) { 
				AjaxInformation x = new AjaxInformation(lastId, start.getTokenIndex(), stop.getTokenIndex());
				ajax.add(x);
			}
			index++;
		}
	}
	
	public void saveVariable(String text, Token start, Token stop, Token o1, Token o2) {
		int index = start.getTokenIndex();
		while(input.get(index).getType()!=getTokenNumber("ID"))
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
		if(start.getType()==getTokenNumber("ID")) {
			int index=start.getTokenIndex();
			TokensNotHidden tnh = new TokensNotHidden(0, 4, index, input);
			AjaxInformation block = null;
			for(int i=0; i<ajax.size(); i++) {
				if(start.getText().equals(ajax.get(i).getVariableName())) {
					block = ajax.get(i);
					break;
				}
			}
			if(block==null) return;
			
			if(tnh.succ[0].getType()==getTokenNumber("DOT") && tnh.succ[1].getType()==getTokenNumber("ID") && tnh.succ[2].getType()==getTokenNumber("ASSIGN")) { 
				int end = stop.getTokenIndex();
				if(stop.getType()==getTokenNumber("SC")) { 
					end--;
				}
				String value = input.toString(tnh.succ[3].getTokenIndex(), end);
				if(tnh.succ[1].getText().equals("onload") || tnh.succ[1].getText().equals("onreadystatechange")) {
					String[] arrOfStr = value.split("\\(", 2);
					String in = "(data, textStaus, jqXHR";
					if(!arrOfStr[1].startsWith(")"))
						in += ", ";
					value = value.replaceFirst("\\(", in);
					value = value.replaceAll(block.getVariableName(), "jqXHR");
				}
				block.propertyMap.put(tnh.succ[1].getText(), value);
			}
		}
	}
	
	public void getAjaxMethod(Token start, Token stop) {
		if(start.getType()==getTokenNumber("ID")) {
			
			int idx=start.getTokenIndex();
			TokensNotHidden tnh = new TokensNotHidden(0, 4, idx, input);
			
			AjaxInformation block = null;
			for(int i=0; i<ajax.size(); i++) {
				if(start.getText().equals(ajax.get(i).getVariableName())) {
					block = ajax.get(i);
					break;
				}
			}
			if(block==null) return;
			if(tnh.succ[0].getType()==getTokenNumber("DOT") && tnh.succ[1].getType()==getTokenNumber("ID") && tnh.succ[2].getType()==getTokenNumber("LP")) { 
				int index = tnh.succ[3].getTokenIndex();
				if(tnh.succ[1].getText().equals("open")) {
					int c = 0;
					while(input.get(index).getType()!=getTokenNumber("RP")) {
						while(input.get(index).getType()==getTokenNumber("CM") || input.get(index).getChannel() == JavaScriptToJQueryConverterLexer.HIDDEN) 
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
				else if(tnh.succ[1].getText().equals("send")){
					if(tnh.succ[3].getType()!=getTokenNumber("RP")) {
						int i = tnh.succ[3].getTokenIndex();
						while(input.get(i).getType()!=getTokenNumber("RP"))
							i++;
						String s = input.toString(tnh.succ[3].getTokenIndex(), i-1);
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
			block.errorMessage = "Cannot translate the ajax call because some mandatory parameters are missing" + block.getVariableName(); 
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
			
			if(input.get(block.indexAjax[1]+1).getType()!=getTokenNumber("SC"))
				output += ";";
			
			if(input.get(block.indexVariableInizialization[1]+1).getType()==getTokenNumber("SC"))
				block.indexVariableInizialization[1] += 1;
				
			((TokenRewriteStream) input).delete(block.indexVariableInizialization[0], block.indexVariableInizialization[1]);
			((TokenRewriteStream) input).replace(block.indexAjax[0], block.indexAjax[1], output);
			
		}
		else {
			//System.err.println(block.errorMessage);
			ParserTester.consoleOutput+="Ajax Error at [" + input.get(block.indexAjax[0]).getLine() + ", "+ input.get(block.indexAjax[0]).getCharPositionInLine()+ "]: " + block.errorMessage +"\n";
		}
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
			if(input.get(index).getType()==getTokenNumber("THIS") && tnh.succ[1].getText().equals("status")) {
				if(tnh.succ[0].getType()==getTokenNumber("DOT") && (tnh.succ[2].getType()==getTokenNumber("TEQ") || tnh.succ[2].getType()==getTokenNumber("EQ")) && tnh.prec[0].getType()==getTokenNumber("LP") && tnh.succ[3].getType()==getTokenNumber("INTEGER") && tnh.succ[4].getType()==getTokenNumber("RP")) {
					flagStatus = true;
					Integer status = Integer.parseInt(tnh.succ[3].getText()); 
					int begin;
					int end;
					if(tnh.succ[5].getType()==getTokenNumber("LBR")) {
						begin = tnh.succ[6].getTokenIndex(); 
						int idx = begin;
						int lbr = 1;
						int rbr = 0;
						while(lbr-rbr!=0) {
							if(input.get(idx).getType()==getTokenNumber("LBR"))
								lbr++;
							else if(input.get(idx).getType()==getTokenNumber("RBR")) //RBR
								rbr++;
							if(lbr-rbr!=0)
								idx++;
						}
						end = idx-1;
					}
					else {
						begin = tnh.succ[5].getTokenIndex();
						int idx = begin;
						while(input.get(idx).getType()!=getTokenNumber("ELSE") && idx<=stop.getTokenIndex()) {
							idx++;
						}
						end = idx-1;
					}
					String code = input.toString(begin, end);
					if(block.statusMap.get(status)!=null) {
						block.translateFlag = false;
						block.errorMessage = "Cannot translate the ajax call because a status has two functions assigned"; 
					}else
						block.statusMap.put(status, code);
				}
				else {
					block.translateFlag = false;
					block.errorMessage = "Cannot translate the ajax call because an if statement has more conditions other than the status one"; 
				}
			}
			if(input.get(index).getType()==getTokenNumber("ELSE") && tnh.succ[0].getType()!=getTokenNumber("IF") && flagStatus) { 
				block.translateFlag = false;
				block.errorMessage = "Cannot translate the ajax call because an if statement with the status condition contains an else"; 
			}
			index++;
		}
	}
	
	public void checkDuplicateIncDec(Token before, Token after, Token id) {
		if(before != null && after != null)
			myErrorHandler(DUPLICATE_INC_DEC, id);
	}
	
	public int getTokenNumber(String token) {
		File tokenFile = new File("src/JS2JQConverter/JavaScriptToJQueryConverter.tokens");
		try {
			FileReader fr = new FileReader(tokenFile);
			BufferedReader br=new BufferedReader(fr); 
			String line;
			String [] array;
			while((line=br.readLine())!=null) {
				array = line.split("=");
				if(array[0].equals(token))
					return Integer.parseInt(array[1]);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}
