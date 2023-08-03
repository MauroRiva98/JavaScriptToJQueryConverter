package JS2JQGui;
import java.awt.BorderLayout;

import javax.swing.*;
public class TextAreaPanel extends JPanel{

	static JTextArea textArea;
	
	public TextAreaPanel() {
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
				
		setLayout(new BorderLayout());
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	}
	
	public void appendText(String testo) {
		textArea.append(testo);
	}
	
}
