package JS2JQGui;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FileFilterTxtJs extends FileFilter{

	@Override //cosa accetta nel menu
	public boolean accept(File f) {
		// TODO Auto-generated method stub
		
		if(f.isDirectory())
			return true;
		
		String extension = Utils.getExtension(f);
		
		if(extension == null)
			return false;
		
		if(extension.equals("js") || extension.equals("txt"))
			return true;
		
		return false;
	}

	@Override //da la descrizione visualizzata nel riquadro
	public String getDescription() {
		// TODO Auto-generated method stub
		return "File TXT o JS (*.txt or *.js)";
	}

}
