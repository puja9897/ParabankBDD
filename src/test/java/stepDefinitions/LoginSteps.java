package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

	WebDriver driver;
	LoginPage login;
	
	@Given("User is in login page")
	public void user_is_in_login_page() {
		   driver=DriverManager.getDriver();
		   driver.get("https://parabank.parasoft.com/parabank/index.htm");
		login=new LoginPage(driver);
		
	
	}

	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
		login.loginUserDetails("user", "user");
	}

	@And("click on log in button")
	public void click_on_log_in_button() {
		login.clickLogin();
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	Assert.assertTrue(login.isloginSuccess(),"Login Failed");
	DriverManager.tearDown();
	}

}
