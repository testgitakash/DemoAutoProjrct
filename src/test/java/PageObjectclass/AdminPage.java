package PageObjectclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {
	
	WebDriver ldriver;
	WebDriverWait wait = new WebDriverWait(ldriver,Duration.ofSeconds(1));
	
	public AdminPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="(//*[@type=\"button\"])[6]") WebElement add;
	@FindBy(xpath="(//*[@class=\"oxd-select-text oxd-select-text--active\"])[1]") WebElement role;
	@FindBy(xpath="(//*[text()=\"Admin\"])[3]") WebElement role_admin;
	@FindBy(xpath="//*[text()=\"ESS\"]") WebElement role_ess;
	@FindBy(xpath="///*[@placeholder=\"Type for hints...\"]") WebElement Ename;
	@FindBy(xpath="(//*[@class=\"oxd-select-text oxd-select-text--active\"])[2]") WebElement status;
	@FindBy(xpath="//*[text()=\"Enabled\"]") WebElement s_type1;
	@FindBy(xpath="//*[text()=\"Disabled\"]") WebElement s_type2;
	@FindBy(xpath="(//*[@type=\"password\"])[2]") WebElement pass2;
	@FindBy(xpath="//*[@type=\"submit\"]") WebElement save;
	@FindBy(xpath="(//div[@class='oxd-table-filter-header'])[1]") WebElement Searchrec;
	@FindBy(xpath="//*[@placeholder=\"Type for hints...\"]") WebElement Employee;
	@FindBy(xpath="//*[@type=\"submit\"]") WebElement search;
	@FindBy(xpath="//*[@class=\"oxd-text oxd-text--span\"]") WebElement result;
	
	public void add() {
		add.click();
	}
	
	public void Role() {
		role.click();
		
	}
	public void Role_Type1() {
		wait.until(ExpectedConditions.visibilityOf(role_admin));
		role_admin.click();
	}
	
	public void eName() {
		Ename.sendKeys("Sarang P");
	}
	
	public void Status() {
		status.click();
	}
	public void s_type() {
		wait.until(ExpectedConditions.visibilityOf(s_type1));
		s_type1.click();
	}
	
	public void pass() {
		
		pass2.sendKeys("admin123");
	}
	public void create() {
		save.click();
	}
	
	public void searchRec() {
		Searchrec.click();
	}
	
	public void Emp() {
		Employee.sendKeys("Harry James Potter");
	}
	public void search() {
		search.click();
	}
	public void result() {
	String ob = result.getText();
	System.out.println(ob);
	}
	
	
	
	
}
