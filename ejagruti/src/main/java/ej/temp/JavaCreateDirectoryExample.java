package ej.temp;

import java.io.File;

public class JavaCreateDirectoryExample {

	public static void main(String[] args)
	{
		File dir = new File("E:\\Demofile\\Abhi");
	    
	    // attempt to create the directory here
	    boolean successful = dir.mkdir();
	    if (successful)
	    {
	      // creating the directory succeeded
	      System.out.println("directory was created successfully");
	    }
	    else
	    {
	      // creating the directory failed
	      System.out.println("failed trying to create the directory");
	    }	
	}
	
}
