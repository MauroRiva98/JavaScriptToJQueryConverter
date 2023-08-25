package JS2JQStarter;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenRewriteStream;

import JS2JQConverter.JavaScriptToJQueryConverterLexer;
import JS2JQConverter.JavaScriptToJQueryConverterParser;
import JS2JQConverter.Handler;

import JS2JQGui.*;


public class JS2JQParserStarter {

	static JavaScriptToJQueryConverterParser parser;
	public static String consoleOutput = ""; //output on TextArea in JS2JQ Gui
	
	public static void main(String[] args) {
		TokenRewriteStream tokens;
	  	//String fileIn = ".\\resources\\input.file";
		String fileIn = ChooserPanel.getResourcePath();
		
		try {

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
				//System.out.println ("Parsing terminato con successo");
				//consoleOutput += "\nParsing terminato con successo\n\n";
			}
			else
				for (int i=0; i<h.getErrorList().size(); i++) {
					//System.err.println ("Errore " + (i+1) + 
					//		":\t" + h.getErrorList().get(i)+"");
					consoleOutput += h.getErrorList().get(i)+"";
				}
			
			String path=ChooserPanel.getPath();
			
			if(path!=null) {
				FileWriter writer = new FileWriter(path+"\\" + ChooserPanel.getFileName() + "." + ChooserPanel.getExtension());
				writer.write(tokens.toString());
				writer.close();
			}
			else {
				Path pathAttuale = Paths.get("");
				String directoryName = pathAttuale.toAbsolutePath().toString();
				//System.out.println(directoryName);
				FileWriter writer = new FileWriter(directoryName+"\\translated.txt");
				writer.write(tokens.toString());
				writer.close();
			}
			
			ChooserPanel.resetPath();
			ChooserPanel.resetResourcePath();
			
			//System.out.println("Successfully wrote to the file.");
			consoleOutput += "\nSuccessfully wrote to the file. \n";
			
			
			
		} catch (Exception e) {
			//System.out.println ("Parsing con ANTLR abortito\n\n");
			//consoleOutput += "Parsing con ANTLR abortito\n\n";
			e.printStackTrace();
		}

		System.out.println(consoleOutput);
		
  }

}
