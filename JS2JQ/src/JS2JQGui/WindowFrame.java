package JS2JQGui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class WindowFrame extends JFrame{
	
	//public JFileChooser fileChooser;
	public static JTextArea textArea;
	private JButton btnTranslate;
	//private JButton buttonFileChooser; //
	private ChooserPanel chooserButtons;
	
	public WindowFrame() {
		
		super("JavaScript to JQuery Converter");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\boffe\\Downloads\\2793765piccola.png"));
		getContentPane().setLayout(new BorderLayout());
		
		chooserButtons = new ChooserPanel();
		//fileChooser = new JFileChooser();
		//buttonFileChooser = new JButton("Upload File"); //
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		btnTranslate = new JButton("TRANSLATE ");
		btnTranslate.setBackground(SystemColor.textHighlight);
		btnTranslate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTranslate.setIcon(new ImageIcon("C:\\Users\\boffe\\Downloads\\2793765piccola.png"));
		
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
				textArea.append("*************************\nCONSOLE OUTPUT: \n");
				JS2JQTester.ParserTester.main(null);
			}
		});
		
		PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
		System.setOut(printStream);
		System.setErr(printStream);
		
		//getContentPane().add(buttonFileChooser, BorderLayout.PAGE_START);
		getContentPane().add(chooserButtons, BorderLayout.PAGE_START);
		getContentPane().add(textArea, BorderLayout.CENTER);
		getContentPane().add(btnTranslate, BorderLayout.PAGE_END);
		
		setSize(800, 700);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
}
