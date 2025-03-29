package Utility;

import java.io.FileInputStream;

import java.util.Properties;

public class ReadconfigClass {
	
	Properties properties; // create object of property class to read configuration property
	String path = "C:\\Users\\User\\eclipse-workspace\\DemoAutoProjrct\\Configuration\\config.properties";
	// configuration file path from configuration folder.
	
	//create constuctor of class
	public ReadconfigClass()  {
		try {
		properties = new Properties(); // inttialize in properties class.
			FileInputStream fis = new FileInputStream(path); // create object of FileInputStream and provide the Path of file
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String getBaseUrl() {
		String Value =properties.getProperty("baseUrl");
		if (Value!=null)
		return Value;
		else throw new RuntimeException("Value not found for the specied Url");
	}
	
	public String getbrowser() {
		String Value1 =properties.getProperty("browser");
		if (Value1!=null)
		return Value1;
		else throw new RuntimeException("Value not found for Browser class");
	}
}
