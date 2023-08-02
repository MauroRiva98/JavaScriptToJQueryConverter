package JS2JQGui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChooserPanel extends JPanel{
	private JButton buttonFileChooser;
	private JButton buttonPathTranslation;
	private JFileChooser fileChooser;
	private static String path;
	
	public ChooserPanel() {
		buttonFileChooser = new JButton("Upload File");
		buttonPathTranslation = new JButton("Select the path for translation");
		fileChooser = new JFileChooser();
		setLayout(new FlowLayout());
		add(buttonFileChooser);
		add(buttonPathTranslation);
	
	buttonFileChooser.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(fileChooser.showOpenDialog(ChooserPanel.this)==JFileChooser.APPROVE_OPTION) {
				WindowFrame.textArea.append(fileChooser.getSize().toString());
				if(fileChooser.getSelectedFile().toString().equals("")==false) {
					WindowFrame.textArea.append("File selected for translation to JQuery: \n" + fileChooser.getSelectedFile().toString() + "\n");
					//copia file in resources
					File source = new File(fileChooser.getSelectedFile().toString());
					File dest = new File("resources\\input.file");
					try {
						Files.deleteIfExists(dest.toPath());
					    Files.copy(source.toPath(), dest.toPath());
					} catch (IOException e1) {
					    e1.printStackTrace();
					}
				}
				else 
					WindowFrame.textArea.append("Seleziona un file!");
					
			}
		}
	});
	
	buttonPathTranslation.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(fileChooser.showOpenDialog(ChooserPanel.this)==JFileChooser.APPROVE_OPTION) {
				if(fileChooser.getSelectedFile().toString().equals("")==false) {
					path = fileChooser.getSelectedFile().toString();
					int index = path.lastIndexOf("\\");
					path = path.substring(0, index);
					WindowFrame.textArea.append("Path selected for translation download: \n" + path + "\n");
				}
				else
					WindowFrame.textArea.append("Seleziona una directory");
			}
		}
	});
	
	
	}
	
	public static String getPath() {
		return path;
	}
	
}
