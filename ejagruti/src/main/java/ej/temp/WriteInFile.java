package ej.temp;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

	public static void main(String[] args) {
		try{
			
			FileWriter writer = new FileWriter("C:\\Demofile\\abhi.txt", true);
			writer.write("Hi ");
			writer.write("Hello");
			writer.close();
			System.out.println("Writing is Done");
		}catch (IOException a){
			a.printStackTrace();
		}

	}

}
