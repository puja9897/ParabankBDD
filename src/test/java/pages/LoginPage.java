package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement pwd;
	@FindBy(xpath="//input[@class='button']") WebElement loginBtn;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginUserDetails(String uname,String password)
	{
		username.sendKeys(uname);
		pwd.sendKeys(password);
		
	}
	public void clickLogin() {
		loginBtn.click();
	}
	
	@FindBy(id="headerPanel") WebElement header;
	
	public boolean isloginSuccess() {
		return header.isDisplayed();
	}
}
