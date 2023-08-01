package JS2JQConverter;

import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.Token;

public class TokensNotHidden {

	public Token [] prec;
	public Token [] succ;
	
	public TokensNotHidden(int p, int s, int index, TokenStream input) {
		if(p>0) {
			prec = new Token[p];
			calculatePrec(index, p, input);
		}
		if(s>0) {
			succ = new Token[s];
			calculateSucc(index, s, input);
		}
	}
	
	public void calculatePrec(int index, int p, TokenStream input) {
		int counter=0;
		for(int i = 0; i< p; i++) {
			prec[i]=input.get(index);
		}
		while(counter<p) {
			if(index-1<0)
				break;
			index--;
			if(input.get(index).getChannel()!=JavaScriptToJQueryConverterLexer.HIDDEN) {
				prec[counter] = input.get(index);
				counter++;
			}
		}
	}
	
	public void calculateSucc(int index, int s, TokenStream input) {
		int counter=0;
		for(int i = 0; i< s; i++) {
			succ[i]=input.get(index);
		}

		while(counter<s) {
			if(index+1>=input.size())  //controllo oltre alla regola 
				break;
			index++;
			if(input.get(index).getChannel()!=JavaScriptToJQueryConverterLexer.HIDDEN) {
				succ[counter] = input.get(index);
				counter++;
			}
		}
	}
	
}
