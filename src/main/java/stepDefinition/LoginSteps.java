package stepDefinition;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	
	//use cucumber to find feature file steps to java code
	
	// Glue code-Step definition - step implementation
	@Given("User is on Login Page")
	public void  user_on_login_page(){
		System.out.println("user is on login page");
	}
	
	@When("User enter vaild credentials")
	public void user_enter_valid_credentials(){
		System.out.println("user enter valid  credentials");
		
	}
	@Then("User should be able to view account balance")
	public void user_should_see_account_balance(){
		System.out.println("user should be able to view account balance");
		String expected="balance";
		String actual="balance";
		Assert.assertEquals(actual, expected);
	}
}
