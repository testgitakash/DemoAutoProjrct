package TestClasspackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JavaScript {
	
	WebDriver driver;
	
	
	@Test
	public void test() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,100)");  // used to perform the scroll down action
		
		js.executeScript("argument[0].scrollIntoView();",""); // used to perform the action on particular webelement
		
	//	js.executeScript("document.getElementById(" ")".Value=""); // its used to access the hidden element
	}

	@Test
	public void test1() {
		
		Actions action = new Actions(driver);
		
//		action.moveToElement().click().Build().perform();
//	//	
//		action.s
//		
//		
	}
	
}
