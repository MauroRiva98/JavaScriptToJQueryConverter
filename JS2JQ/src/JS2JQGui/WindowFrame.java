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
	
	private JButton btnTranslate;
	static TextAreaPanel textAreaPanel;
	private ChooserPanel chooserButtons;
	
	public WindowFrame() {
		
		super("JavaScript to JQuery Converter");
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources\\logo.png"));
		getContentPane().setLayout(new BorderLayout());
		
		chooserButtons = new ChooserPanel();
		textAreaPanel = new TextAreaPanel();
		btnTranslate = new JButton("TRANSLATE ");
		btnTranslate.setBackground(SystemColor.textHighlight);
		btnTranslate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTranslate.setIcon(new ImageIcon("resources\\logo.png"));
		
		
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
