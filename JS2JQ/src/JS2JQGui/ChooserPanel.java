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
	private static String resourcePath;
	private static String fileName;
	
	public ChooserPanel() {
		buttonFileChooser = new JButton("Upload File");
		buttonPathTranslation = new JButton("Select the path for translation");
		fileChooser = new JFileChooser();
		fileChooser.addChoosableFileFilter(new FileFilterTxtJs());
		//se non voglio proprio visualizzare Tutti i File nel selettore ma solo i filtrati aggiungo questa
		fileChooser.setAcceptAllFileFilterUsed(false);
		
		setLayout(new FlowLayout());
		add(buttonFileChooser);
		add(buttonPathTranslation);
	
		buttonFileChooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fileChooser.showOpenDialog(ChooserPanel.this)==JFileChooser.APPROVE_OPTION) {
						if(path==null)
							TextAreaPanel.textArea.setText(""); //Pulisco da eventuali errori segnalati
						WindowFrame.textAreaPanel.appendText("File selected for translation to JQuery: \n" + fileChooser.getSelectedFile().toString() + "\n");
						resourcePath = fileChooser.getSelectedFile().toString();
						/*//copia file in resources - non serve
						File source = new File(fileChooser.getSelectedFile().toString());
						File dest = new File("resources\\input.file");
						try {
							Files.deleteIfExists(dest.toPath());
						    Files.copy(source.toPath(), dest.toPath());
						} catch (IOException e1) {
						    e1.printStackTrace();
						}*/
						
				}
			}
		});
		
		buttonPathTranslation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fileChooser.showSaveDialog(ChooserPanel.this)==JFileChooser.APPROVE_OPTION) {
						path = fileChooser.getSelectedFile().toString();
						fileName = path;
						int index = path.lastIndexOf("\\");
						path = path.substring(0, index);
						fileName = fileName.substring(index+1, fileName.length());
						if(resourcePath==null)
							TextAreaPanel.textArea.setText(""); //Pulisco da eventuali errori segnalati
						WindowFrame.textAreaPanel.appendText("Path selected for translation download: \n" + path + "\n");
					
				}
			}
		});
	}
	
	public static String getPath() {
		return path;
	}
	public static void resetPath() {
		path = null;
	}
	
	public static String getResourcePath() {
		return resourcePath;
	}
	public static void resetResourcePath() {
		resourcePath = null;
	}
	
	public static String getFileName() {
		return fileName;
	}
}
