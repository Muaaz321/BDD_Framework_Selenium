package stepDefinition;

import java.util.List;
import java.util.Map;

import com.factory.Driverfactory;
import com.pages.HomePage;
import com.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomePageSteps {

	private LoginPage loginPage = new LoginPage(Driverfactory.getDriver());
	private HomePage homePage;
	
	
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) {

		List<Map<String,String>> credList= credTable.asMaps();
		String username=credList.get(0).get("username");
		String password = credList.get(0).get("password");
		
		Driverfactory.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		homePage = loginPage.doLogin(username, password);
		
	}

	@Given("user is on Home page")
	public void user_is_on_home_page() {

		String title = homePage.getHomePageTitle();
		System.out.println("Home page title is " + title);
	}



	@Then("user gets accounts section")
	public void user_gets_accounts_section(DataTable sectionTable) {

		List<String> expHomeSectionList = sectionTable.asList();
	    System.out.println("Expected accounts section List : "+ expHomeSectionList);
	    
	    
		List<String> actualHomeSectionList =   homePage.getHomeSectionList();
		System.out.println("Actual accounts section List : "+ actualHomeSectionList);
		
		Assert.assertTrue(expHomeSectionList.containsAll(actualHomeSectionList));
	}

	@Then("home section count should be {int}")
	public void home_section_count_should_be(Integer expectedSectionCount) {

		Assert.assertTrue(homePage.getHomesectioncount() == expectedSectionCount);
		
	}

	
}
