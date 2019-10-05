package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.ChangesInCoverageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class ChangesInCoveragePageSteps {

	static WebDriver webDriver;
	private ChangesInCoverageActions ChangesInCoverageActions;

	public ChangesInCoveragePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		ChangesInCoverageActions = new ChangesInCoverageActions(webDriver);
	}

	@Then("I Should be on Changes in coverage Page")
	public void i_Should_be_on_Changes_in_coverage_Page() {
		ChangesInCoverageActions.verifyPageTitle("Changes in coverage");
	}

	@When("I click Save button on Changes in coverage Page")
	public void i_click_Save_button_on_Changes_in_coverage_Page() {
		ChangesInCoverageActions.clickSave();
	}

}
