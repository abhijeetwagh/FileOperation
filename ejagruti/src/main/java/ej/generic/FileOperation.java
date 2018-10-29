package ej.generic;

import java.io.File;

public class FileOperation {
	
	private static final String parentfoldername = "E:\\FileOperations\\parentfoldername\\childfoldername";

	public static void main(String[] args) {
		
        File childfolder = new File(parentfoldername) ;
		
		boolean created = childfolder.mkdirs();
		
		if(created)
		{
			System.out.println("Folder Was Created");
		}
		else
		{
			System.out.println("Unable to create folder");
		}


	}

}
