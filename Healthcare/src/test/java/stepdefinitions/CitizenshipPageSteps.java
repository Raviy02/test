package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.CitizenshipPageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class CitizenshipPageSteps {

	static WebDriver webDriver;
	private CitizenshipPageActions CitizenshipPageActions;

	public CitizenshipPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		CitizenshipPageActions = new CitizenshipPageActions(webDriver);
	}

	@Then("I Should be on Citizenship Page")
	public void i_Should_be_on_Citizenship_Page() {
		CitizenshipPageActions.verifyPageTitle("Citizenship");
	}

	@When("I Select option as {string} on Citizenship Page")
	public void i_Select_option_as_on_Citizenship_Page(String text) {
		CitizenshipPageActions.selectOption(text);
	}

	@When("I click Save button on Citizenship Page")
	public void i_click_Save_button_on_Citizenship_Page() {
		CitizenshipPageActions.clickSave();
	}

}
