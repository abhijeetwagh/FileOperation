package ej.configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
  
	//public static WebDriver driver=null;
	//public static WebDriverWait wait=null;
	
  private String getParameterValue_child(String parametername)throws IOException
  {
	  InputStream input = null;
	  Properties prop = new Properties();
	  
	  input=getClass().getClassLoader().getResourceAsStream("SETTINGS.properties");
	  prop.load(input);
	  
	  String parameterValue=prop.getProperty(parametername);
	  
	  return parameterValue;
	  
  }
  
  public static String getParameterValue(String parametername)throws IOException
  {
	Config pf = new Config();
	
	return pf.getParameterValue_child(parametername);
	
  }
}

