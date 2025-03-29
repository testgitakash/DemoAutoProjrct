package PageObjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver ldriver;
	
	public Homepage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//*[@class=\"oxd-main-menu-item active\"]") WebElement dash;//*[@class="oxd-main-menu-item active"]
	@FindBy(xpath = "//*[text()=\"Admin\"]") WebElement admin;
	@FindBy(xpath = "(//*[@class=\"oxd-main-menu-item\"])[2]") WebElement Pim;
	@FindBy(xpath = "(//*[@class=\"oxd-main-menu-item\"])[3]") WebElement leave;
	@FindBy(xpath = "(//*[@class=\"oxd-main-menu-item\"])[4]") WebElement time;
	@FindBy(xpath = "(//*[@class=\"oxd-main-menu-item\"])[5]") WebElement recruit;
	@FindBy(xpath = "(//*[@class=\"oxd-main-menu-item\"])[6]") WebElement minfo;
	@FindBy(xpath = "(//*[@class=\"oxd-main-menu-item\"])[7]") WebElement perform;
	@FindBy(xpath = "(//*[@class=\"oxd-main-menu-item\"])[8]") WebElement Dir;
	@FindBy(xpath = "(//*[@class=\"oxd-main-menu-item\"])[9]") WebElement maint;
	@FindBy(xpath = "(//*[@class=\"oxd-main-menu-item\"])[10]") WebElement claim;
	@FindBy(xpath = "(//*[@class=\"oxd-main-menu-item\"])[11]") WebElement buzz;
	
	public void dashboard() {
		dash.click();
	}
	public void admin() {
		admin.click();
	}
	public void PIM() {
		Pim.click();
	}
	public void liv() {
		leave.click();
	}
	public void Time() {
		time.click();
	}
	public void recruit() {
		recruit.click();
	}
	public void myinfo() {
		minfo.click();
	}
	public void prfm() {
		perform.click();
	}
	public void dir() {
		Dir.click();
	}
	public void main() {
		maint.click();
	}
	public void Claim() {
		claim.click();
	}
	public void buz() {
		buzz.click();
	}

}
