package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.UserCitizenshipActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class UserCitizenshipPageSteps {

	static WebDriver webDriver;
	private UserCitizenshipActions UserCitizenshipActions;

	public UserCitizenshipPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		UserCitizenshipActions = new UserCitizenshipActions(webDriver);
	}

	@Then("I Should be on User Citizenship Page")
	public void i_Should_be_on_User_Citizenship_Page() {
		UserCitizenshipActions.verifyPageTitle("Susan's citizenship");
	}

	@When("I select option as {string} on User Citizenship Page")
	public void i_select_option_as_on_User_Citizenship_Page(String text) {
		UserCitizenshipActions.selectOption(text);
	}

	@When("I click Save button on User Citizenship Page")
	public void i_click_Save_button_on_User_Citizenship_Page() {
		UserCitizenshipActions.clickSave();
	}

}
