package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.CurrentCoverageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class CurrentCoveragePageSteps {

	static WebDriver webDriver;
	private CurrentCoverageActions CurrentCoverageActions;

	public CurrentCoveragePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		CurrentCoverageActions = new CurrentCoverageActions(webDriver);
	}

	@Then("I should be on Current coverage Page")
	public void i_should_be_on_Current_coverage_Page() {
		CurrentCoverageActions.verifyPageTitle("Current coverage");
	}

	@When("I click Save button on Current coverage Page")
	public void i_click_Save_button_on_Current_coverage_Page() {
		CurrentCoverageActions.clickSave();
	}

}
