package ej.temp;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		// Create a java.io.File object, specify the name of the folder
		 File f=new File("C:\\Demofile");

		 // Create directory with specified name, true is returned if created.
		 boolean flag=f.mkdir();

		 // Print whether true/false
		 System.out.println("Directory created (T/F)? "+flag);


	}

}
