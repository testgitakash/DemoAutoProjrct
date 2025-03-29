package PageObjectclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
WebDriver ldriver;
WebDriverWait wait = new WebDriverWait(ldriver,Duration.ofSeconds(1));
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//*[@alt=\"company-branding\"]") WebElement Header;
	@FindBy(xpath="(//*[@alt=\"orangehrm-logo\"])[2]") WebElement BrandLogo;
	@FindBy(xpath="//*[@name=\"username\"]") WebElement UserName;
	@FindBy(xpath="//*[@name=\"password\"]") WebElement password;
	@FindBy(xpath="//*[@type=\"submit\"]")WebElement Button;
	@FindBy(xpath="//p[text()=\"OrangeHRM OS 5.7\"]") WebElement OS;
	
	public void head() {
		boolean Op = Header.isDisplayed();
		System.out.println(Op);
	}
	
	public void logo() {
		boolean Logo = BrandLogo.isDisplayed();
		System.out.println(Logo);
	}
	
	public void OSversion() {
		String os = OS.getText();
		System.out.println(os);
	}
	
	public void username() {
		wait.until(ExpectedConditions.visibilityOf(UserName));
		UserName.sendKeys("Admin");
	}
	
	public void pasword() {
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("admin123");
	}
	
	public void Btn() {
		boolean Bt = Button.isEnabled();
		System.out.println(Bt);
		Button.click();
	}
}
