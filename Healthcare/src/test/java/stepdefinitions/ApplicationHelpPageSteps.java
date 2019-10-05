package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.ApplicationHelpActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class ApplicationHelpPageSteps {
	static WebDriver webDriver;
	private ApplicationHelpActions ApplicationHelpActions;

	public ApplicationHelpPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		ApplicationHelpActions = new ApplicationHelpActions(webDriver);
	}

	@Then("I should be on Application help Page")
	public void i_should_be_on_Application_help_Page() {
		ApplicationHelpActions.verifyPageTitle("Application help");
	}

	@When("I select the option as {string}")
	public void i_select_the_option_as(String text) {
		ApplicationHelpActions.selectOption(text);
	}

	@When("I click Save button on Application help Page")
	public void i_click_Save_button_on_Application_help_Page() {
		ApplicationHelpActions.clickSave();
	}

}
