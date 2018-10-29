package ej.temp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		// We need to provide file path as the parameter: 
		  // double backquote is to avoid compiler interpret words 
		  // like \test as \t (ie. as a escape sequence) 
		  File file = new File("C:\\Demofile\\Newfile.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  try {
			while ((st = br.readLine()) != null)   
			    System.out.println(st);
		} catch (IOException e) {
		  e.printStackTrace();
		}
	}

}
