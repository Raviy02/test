package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.MaritalStatusActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class MaritalStatusPageSteps {

	static WebDriver webDriver;
	private MaritalStatusActions MaritalStatusActions;

	public MaritalStatusPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		MaritalStatusActions = new MaritalStatusActions(webDriver);
	}

	@Then("I Should be on Marital status Page")
	public void i_Should_be_on_Marital_status_Page() {
		MaritalStatusActions.verifyPageTitle("Marital status");
	}

	@When("I select Maritial status as {string} on Marital status Page")
	public void i_select_Maritial_status_as_on_Marital_status_Page(String text) {
		MaritalStatusActions.selectMaritialStatue(text);
	}

	@When("I click Save button on Marital status Page")
	public void i_click_Save_button_on_Marital_status_Page() {
		MaritalStatusActions.clickSave();
	}
}
