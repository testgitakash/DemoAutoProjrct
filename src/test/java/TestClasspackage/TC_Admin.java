package TestClasspackage;

import java.time.Duration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageObjectclass.AdminPage;
import PageObjectclass.Homepage;
import PageObjectclass.LoginPage;

public class TC_Admin  extends BaseClass{
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");
	
	@BeforeTest
	public void beforeClass() {
		extent.attachReporter(spark);
	}
	
	@Test (priority = 1 , description ="Test1")
	public void Homepage() {
		extent.createTest("Homepage").assignAuthor("Vrushabh");
		
		LoginPage Lp = new LoginPage(driver);
		Lp.username();
		Lp.pasword();
		Lp.Btn();
		Homepage obj = new Homepage(driver);
		obj.admin();
		AdminPage Ap = new AdminPage(driver);
		Ap.add();
		Ap.Role();
		Ap.Role_Type1();
		Ap.Status();
		Ap.s_type();
		Ap.pass();
		Ap.create();			
	}

	@Test (priority = 2 , description ="Test2")
	public void Search(){
//		driver.get(Url);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		LoginPage p = new LoginPage(driver);
		p.username();
		p.pasword();
		p.Btn();
		Homepage obj = new Homepage(driver);
		obj.admin();
		AdminPage Ap = new AdminPage(driver);
		Ap.searchRec();
		Ap.Emp();
		Ap.search();
		Ap.result();
		driver.quit();
	}
	
	@AfterTest
	public void afterClass() {
		extent.flush();
	}
	
}
