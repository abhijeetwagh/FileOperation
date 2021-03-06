package ej.temp;

import java.io.File;

public class JavaCreateMultipleDirectoriesExample {
    
	// shows how to create multiple directories in java
	// (multiple directory levels)
	
	public static void main(String[] args)
	{
		
		    // the folders "000/111/222" don't exist initially
		    File dir = new File("E:\\Demofile\\000\\111\\222");
		    
		    // create multiple directories at one time
		    boolean successful = dir.mkdirs();
		    if (successful)
		    {
		      // created the directories successfully
		      System.out.println("directories were created successfully");
		    }
		    else
		    {
		      // something failed trying to create the directories
		      System.out.println("failed trying to create the directories");
		    }		

	}

}
