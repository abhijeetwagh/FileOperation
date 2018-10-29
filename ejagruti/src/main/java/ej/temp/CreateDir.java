package ej.temp;

import java.io.File;

public class CreateDir {

	private static final String FOLDER = "C:\\Demofile\\newFolder";
	
	public static void main(String[] args) {
		
		File newfolder = new File(FOLDER);
		
		Boolean created = newfolder.mkdir();
		
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
