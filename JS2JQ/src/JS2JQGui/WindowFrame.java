package JS2JQGui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.*;

import JS2JQStarter.JS2JQParserStarter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.TextArea;

public class WindowFrame extends JFrame{
	
	//public JFileChooser fileChooser;
	//public static JTextArea textArea;
	private JButton btnTranslate;
	static TextAreaPanel textAreaPanel;
	//private JButton buttonFileChooser; //
	private ChooserPanel chooserButtons;
	
	public WindowFrame() {
		
		super("JavaScript to JQuery Converter");
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources\\logo.png"));
		getContentPane().setLayout(new BorderLayout());
		
		chooserButtons = new ChooserPanel();
		//fileChooser = new JFileChooser();
		//buttonFileChooser = new JButton("Upload File"); //
		//textArea = new JTextArea();
		textAreaPanel = new TextAreaPanel();
		//textArea.setEditable(false);
		//textArea.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		btnTranslate = new JButton("TRANSLATE ");
		btnTranslate.setBackground(SystemColor.textHighlight);
		btnTranslate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTranslate.setIcon(new ImageIcon("resources\\logo.png"));
		
		/*buttonFileChooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fileChooser.showOpenDialog(WindowFrame.this)==JFileChooser.APPROVE_OPTION) {
					textArea.append("File selected for translation to JQuery: \n" + fileChooser.getSelectedFile().toString() + "\n");
					//
					File source = new File(fileChooser.getSelectedFile().toString());
					File dest = new File("resources\\input.file");
					try {
						Files.deleteIfExists(dest.toPath());
					    Files.copy(source.toPath(), dest.toPath());
					} catch (IOException e1) {
					    e1.printStackTrace();
					}
				}
			}
		});*/
		
		btnTranslate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ChooserPanel.getResourcePath() != null) {
					if(ChooserPanel.getPath()==null) {
						Path pathAttuale = Paths.get("");
						String directoryName = pathAttuale.toAbsolutePath().toString();
						textAreaPanel.appendText("No directory path selected!  Setted to default path and default file name: \n" + directoryName + "\n");
					}
					textAreaPanel.appendText("\n*****************************************\n\nCONSOLE OUTPUT: \n\n");
					JS2JQStarter.JS2JQParserStarter.main(null);
					textAreaPanel.appendText(JS2JQParserStarter.consoleOutput);
					JS2JQParserStarter.consoleOutput = "";
				}
				else 
					textAreaPanel.appendText("ATTENTION: No input file path selected!  \n");
			}
		});
		
		//Change output stream
		/*PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
		System.setOut(printStream);
		System.setErr(printStream); */
		
		
		//getContentPane().add(buttonFileChooser, BorderLayout.PAGE_START);
		getContentPane().add(chooserButtons, BorderLayout.PAGE_START);
		getContentPane().add(textAreaPanel, BorderLayout.CENTER);
		getContentPane().add(btnTranslate, BorderLayout.PAGE_END);
		
		setSize(800, 700);
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
}
