package JS2JQGui;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JTextArea;

public class CustomOutputStream extends OutputStream{

	private JTextArea textArea;
	
	public CustomOutputStream(JTextArea textArea) {
		this.textArea = textArea;
	}
	
	@Override
	public void write(int b) throws IOException {
		
		//redirects data to text area
		textArea.append(String.valueOf((char)b));
		//scrolls the test area to the end of data
		textArea.setCaretPosition(textArea.getDocument().getLength());
		//keeps the textArea up to date
		textArea.update(textArea.getGraphics());
		
	}

}
