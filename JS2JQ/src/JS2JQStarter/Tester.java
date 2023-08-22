package JS2JQStarter;

import java.io.FileReader;
import java.io.IOException;

import JS2JQConverter.Handler;
import JS2JQConverter.JavaScriptToJQueryConverterLexer;
import JS2JQConverter.JavaScriptToJQueryConverterParser;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;


public class Tester {
	
	static JavaScriptToJQueryConverterParser parser;

	public static void main(String[] args) throws IOException {
		
		//SCANNER
		// inserire il path-name del file di input
	  	String fileIn = ".\\resources\\input.file";
	
	  	Token tk;
	  	int i;

		try {
			System.out.println ("Test ANTLR lexer");
			// istanzio lo scanner passandogli un stream di ingresso
			JavaScriptToJQueryConverterLexer lexer = new JavaScriptToJQueryConverterLexer (
											new ANTLRReaderStream(
													new FileReader(fileIn)	)	); 
			
			i = 1;
			// attivo un ciclo che scandisce lo stream dall'inizio alla fine
			// richiedendo ogni volta allo scanner di fornire il token successivo (metodo nextToken)
			// fino ad incontrare l' End Of File EOF
			while ((tk = lexer.nextToken()).getType() != JavaScriptToJQueryConverterLexer.EOF) {
				// recuper le informazioni relative ai token rilevati
				int line = tk.getLine();
				int col = tk.getCharPositionInLine()+1;
				int type = tk.getType();
				String text = tk.getText();

				// attivo questo controllo se voglio scartare i token nascosti
			if (tk.getChannel() !=  JavaScriptToJQueryConverterLexer.HIDDEN)
					if (tk.getType() !=  JavaScriptToJQueryConverterLexer.ERROR_TK)
						// stampo le informazioni del token corrente
						System.out.println("Token " + i++ + ": "
								+ "(" + line + "," + col + ")\t\t" 
								+ "TokenType: " + type + "\t" + text);
					else
						// stampo le informazioni del token di errore sullo standard error
						System.err.println("Token " + i++ + ": "
								+ "(" + line + "," + col + ")\t\t" 
								+ "TokenType: " + type + "\t" + text + " ERRORE!");
						
			} 

		} catch (Exception e) {
			System.out.println ("Test ANTLR abortito");
			e.printStackTrace();
		}
		
		//PARSER
		CommonTokenStream tokens;

		try {
			System.out.println ("Parsing con ANTLR lexer");
			System.out.println ("-----------------------");

			// 1.Istanzio il lexer passandogli il documento da analizzare
			JavaScriptToJQueryConverterLexer lexer = new JavaScriptToJQueryConverterLexer(
											new ANTLRReaderStream(
												new FileReader(fileIn))); 

			// 2.Creo uno stream (canale) di token per la comunicazione tra lexer e parser
		    tokens = new CommonTokenStream(lexer);

		    // 3.Istanzio il parser
			parser = new JavaScriptToJQueryConverterParser(tokens);

			// 4.Lancio l'analisi sintattica del documento di ingresso
			parser.parseJava();
		
			// 5.controllo i risultati
			Handler h = parser.getHandler();
			if (h.getErrorList().size() == 0)
				System.out.println ("Parsing terminato con successo");
			else
				for (int i1=0; i1<h.getErrorList().size(); i1++)
					System.err.println ("Errore " + (i1+1) + 
							":\t" + h.getErrorList().get(i1)+"");
					
		} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}

	}
  	
}
