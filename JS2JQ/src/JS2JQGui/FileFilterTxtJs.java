package JS2JQGui;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FileFilterTxtJs extends FileFilter{

	@Override 
	public boolean accept(File f) {
		
		if(f.isDirectory())
			return true;
		
		String extension = Utils.getExtension(f);
		
		if(extension == null)
			return false;
		
		if(extension.equals("js") || extension.equals("txt"))
			return true;
		
		return false;
	}

	@Override
	public String getDescription() {
		return "File TXT o JS (*.txt or *.js)";
	}

}
