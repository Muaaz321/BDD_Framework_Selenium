package stepDefinition;

import com.factory.Driverfactory;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps {

	private static String title;
	private LoginPage loginpage = new LoginPage(Driverfactory.getDriver());
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		Driverfactory.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {

		title = loginpage.getTitle();
		System.out.println("Login page title " + title);
		
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedtitle) {
	   
		Assert.assertTrue(title.contains(expectedtitle));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {

	   Assert.assertTrue(loginpage.isForgotPwdLinkExist());
		
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {

		loginpage.enterPassword(username);
		
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		
		loginpage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {

		loginpage.clickonLogin();
	}

	
	
}
