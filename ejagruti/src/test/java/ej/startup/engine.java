package ej.startup;

import java.io.IOException;
import ej.configuration.Config;

public class engine {
	
	

	public static void main(String[] args) throws IOException 
	{
		Config pf = new Config();
		
		String val= pf.getParameterValue("PORT_NUMBER");
		System.out.println(val);
           
		String val1 = pf.getParameterValue("MAX_TIMEOUT_IN_SECONDS");
		System.out.println(val1);

		String val2=pf.getParameterValue("IS_LOG_ENABLED");
		System.out.println(val2);
 		
		String val3 = pf.getParameterValue("IS_SCREEN_CAPTURE_ENABLED");
		System.out.println(val3);
		
		String val4 = pf.getParameterValue("ROOT_FOLDER_PATH");
		System.out.println(val4);
		
		String val5 = pf.getParameterValue("RESULT_FOLDER");
		System.out.println(val5);
		
		String val6 = pf.getParameterValue("LOG_FOLDER");
		System.out.println(val6);
		
		String val7 = pf.getParameterValue("TEST_SUITE_FOLDER");
		System.out.println(val7);
		
		String val8 = pf.getParameterValue("TETS_CASE_FOLDER");
		System.out.println(val8);
		
		String val9 = pf.getParameterValue("TEST_DATA_LOCATION");
		System.out.println(val9);
		
		String val10 = pf.getParameterValue("DB_NAME");
		System.out.println(val10);
		
		String val11 = pf.getParameterValue("DB_USERNAME");
		System.out.println(val1);
		
		String val12 = pf.getParameterValue("DB_PASSWORD");
		System.out.println(val2);

		
		
		}

}
