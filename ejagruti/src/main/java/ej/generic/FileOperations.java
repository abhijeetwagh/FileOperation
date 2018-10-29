	package ej.generic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
 
public class FileOperations {
	
	public static  void childfolders(String parentfoldername, String childfoldername)throws IOException
	{
		File file = new File(parentfoldername, childfoldername);
		boolean b = file.mkdirs();
		if(b){
			System.out.println("Directory has been created successfuly");
		}
		else{
			
			System.out.println("directory has not been created successfully");
		}
		   
	}
	    
	    public static  void createtextfile(String fillfilepathname) throws IOException
	    {
	    	File file1 = new File(fillfilepathname);
	    	boolean b1 = file1.createNewFile();
			System.out.println("directory was created successfully" + b1);
	    	
	    }IOException e;
	    {
	    	e.printStackTrace();
	    }
	    
	    public static void createtextfile(String filepath, String appendtext) throws IOException
	    {
	    	try(
	    			FileWriter fw = new FileWriter(filepath, true);
	    			
	    			//BufferedWriter bw = new BufferedWriter(fw);
	    			
	    			PrintWriter out = new PrintWriter(fw)	
	    			
	    		)
	    	{
	    		out.println("Content to be appended to file");
	    	}
	    	
	    	catch(IOException e){
	    		
	    	}
	    }
	    
	    
		/*public static String GetCurrentDateAsPerGivenFormat(String dateformat) throws ParseException
	    {
			Date mydate = new Date();
			
						
			SimpleDateFormat dmyformat = new SimpleDateFormat("YY-DD-MM HH:MM");
			
			String mdy = dmyformat.format(mydate);
			
			System.out.println(mdy);
			
			
			return dateformat;				    	
	    }*/
	    
	    public static String GetCurrentDateAsPerGivenFormat(String dateformat)
	    {
	    	Date datefm = new Date();
	    	SimpleDateFormat sdf = new SimpleDateFormat(dateformat);
	    	System.out.println("Current date: " + sdf.format(datefm));
			return dateformat;
	    }
	
	public static void main(String[] args) throws IOException
	{
		childfolders("E:\\FILEOPERATION","abhi");
		createtextfile("E:\\FILEOPERATION\\abhi\\text.txt");
		createtextfile("E:\\FILEOPERATION\\abhi\\text.txt", "Content to be appended to file");
		GetCurrentDateAsPerGivenFormat("yy-dd-MM HH-mm");
		
		   

	}
}
