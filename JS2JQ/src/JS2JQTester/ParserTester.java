package JS2JQTester;

import java.io.FileReader;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenRewriteStream;

import JS2JQConverter.JavaScriptToJQueryConverterLexer;
import JS2JQConverter.JavaScriptToJQueryConverterParser;
import JS2JQConverter.Handler;



public class ParserTester {

	static JavaScriptToJQueryConverterParser parser;
  
	public static void main(String[] args) {
		TokenRewriteStream tokens;
	  	String fileIn = ".\\resources\\input.file";

		try {
			System.out.println ("Parsing con ANTLR lexer");
			System.out.println ("-----------------------");

			// 1.Istanzio il lexer passandogli il documento da analizzare
			JavaScriptToJQueryConverterLexer lexer = new JavaScriptToJQueryConverterLexer(
											new ANTLRReaderStream(
												new FileReader(fileIn))); 

			// 2.Creo uno stream (canale) di token per la comunicazione tra lexer e parser
		    tokens = new TokenRewriteStream(lexer);

		    // 3.Istanzio il parser
			parser = new JavaScriptToJQueryConverterParser(tokens);

			// 4.Lancio l'analisi sintattica del documento di ingresso
			parser.parseJava();
		
			// 5.controllo i risultati
			Handler h = parser.getHandler();
			if (h.getErrorList().size() == 0) {
				System.out.println ("Parsing terminato con successo");
			}
			else
				for (int i=0; i<h.getErrorList().size(); i++)
					System.err.println ("Errore " + (i+1) + 
							":\t" + h.getErrorList().get(i)+"");
			
			System.out.println(tokens.toString());
			
		} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}

  }

}
