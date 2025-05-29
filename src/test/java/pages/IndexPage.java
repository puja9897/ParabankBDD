package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage{

	WebDriver driver;
	
	public IndexPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Register") WebElement registrationLink;
	
	public void clickOnRegister() {
		
		registrationLink.click();
	}
}
