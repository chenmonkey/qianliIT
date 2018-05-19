package Liu;

import java.io.File;
import java.io.FilenameFilter;

public class FileAccept implements FilenameFilter {

	 String extendName;
	public void setExtendName(String s) {
		extendName="."+s;
		
	}

	
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(extendName);
	}

}
