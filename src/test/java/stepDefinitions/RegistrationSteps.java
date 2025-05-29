package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.IndexPage;
import pages.RegistrationPage;

public class RegistrationSteps  {
	
	WebDriver driver;
	
	IndexPage index;
	RegistrationPage register;
	

	@Given("User is on Parabank Registration page")
	public void user_is_on_parabank_registration_page() {
	   driver=DriverManager.getDriver();
	   driver.get("https://parabank.parasoft.com/parabank/index.htm");
	   index=new IndexPage(driver);
	   index.clickOnRegister();
	   
	   register=new RegistrationPage(driver);
	  
	}

	@When("User enters valid details")
	public void user_enters_valid_details(io.cucumber.datatable.DataTable dataTable) {
		
		Map<String,String> data=dataTable.asMaps().get(0);
		register.registerUser(
	            data.get("firstname"),
	            data.get("lastname"),
	            data.get("address"),
	            data.get("city"),
	            data.get("state"),
	            data.get("zipcode"),
	            data.get("phone"),
	            data.get("ssn"),
	            data.get("username"),
	            data.get("password"),
	            data.get("confirmPassword")
	        );

	}

	@Then("User should be successfully registered")
	public void user_should_be_successfully_registered() {
	   Assert.assertTrue(register.isRegistrationSuccessful(), "Registration Failed");
	   DriverManager.tearDown();
	}

}
