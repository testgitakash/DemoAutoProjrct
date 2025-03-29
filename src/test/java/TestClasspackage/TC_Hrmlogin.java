package TestClasspackage;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectclass.LoginPage;

public class TC_Hrmlogin extends BaseClass {
	
	@Test(priority = 2)
	public void Homepage() {
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage Lp = new LoginPage(driver);
		Lp.username();
		Lp.pasword();
		Lp.Btn();
	}
	
	@Test(priority = 0)
	public void VerifyUI() {
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage lp = new LoginPage(driver);
		lp.head();
		lp.logo();
		lp.OSversion();
	}
}
