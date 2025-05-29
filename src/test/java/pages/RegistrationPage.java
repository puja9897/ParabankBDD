package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver driver;
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="customer.firstName") WebElement fname;
	@FindBy(id="customer.lastName") WebElement lname;
	@FindBy(id="customer.address.street") WebElement address;
	@FindBy(id="customer.address.city") WebElement city;
	@FindBy(id="customer.address.state") WebElement state;
	@FindBy(id="customer.address.zipCode") WebElement zipCode;
	@FindBy(id="customer.phoneNumber") WebElement phoneno;
	@FindBy(id="customer.ssn") WebElement ssn;
	@FindBy(id="customer.username") WebElement username;
	@FindBy(id="customer.password") WebElement password;
	@FindBy(id="repeatedPassword") WebElement confirmPassword;
	@FindBy(xpath="//input[@value='Register']") WebElement registerBtn;
	
	public void registerUser(String firstname,String lastname,String addressdetails,String cityname,String statename,
			String zipcode,String phonenumber,String ssnnum,String uname,String pwd, String confirmpassword) {
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		address.sendKeys(addressdetails);
		city.sendKeys(cityname);
		state.sendKeys(statename);
		zipCode.sendKeys(zipcode);
		phoneno.sendKeys(phonenumber);
		ssn.sendKeys(ssnnum);
		username.sendKeys(uname);
		password.sendKeys(pwd);
		confirmPassword.sendKeys(confirmpassword);
		registerBtn.click();
		
	}
		// Optional: Check success message
	    @FindBy(xpath = "//h1[contains(text(),'Welcome')]")
	    WebElement successMessage;

	    public boolean isRegistrationSuccessful() {
	        return successMessage.isDisplayed();
	    }
	
	
		
	}



