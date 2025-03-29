package TestClasspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException; 
import org.testng.TestNG;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestClasspackage.ListenerClass.class)

public class Listner_Test extends BaseClass {
	
	@Test
	public void test1() throws InterruptedException {
		driver.get(Url);
		driver.manage().window().maximize();
		//logger.info("url opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@placeholder=\"Username\"]")).sendKeys("Admin");
 	
		driver.findElement(By.xpath("//*[@placeholder=\"Password\"]")).sendKeys("admin123");
 	
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test
	public void testfail() {
		System.out.println("Failed test case");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testSkipped() {
		System.out.println("Skipped Test Case");
		throw new SkipException("Skip Exception thrown ... ");
	}
}
