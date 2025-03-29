package TestClasspackage;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Utility.ReadconfigClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 ReadconfigClass read = new  ReadconfigClass(); // create object of readconfigClass
	 
	 String Url = read.getBaseUrl(); // call the method for baseUrl
	 String browser = read.getbrowser(); // call the method for browser
	 
	 public static WebDriver driver;
	public static Logger logger;
	
	
	 @BeforeMethod // its execute before class execution start.
	 public void setup()
		{
			//launch browser
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				driver.get(Url);
			//implicit wait of 10Sec.
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	 //it will execute after the class execution done
	 @AfterMethod
	public void tearDown() {
		 if (driver != null) {
	            driver.quit();
	        }
	}
	 
}
