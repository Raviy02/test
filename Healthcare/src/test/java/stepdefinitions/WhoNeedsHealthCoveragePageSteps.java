package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.WhoNeedsHealthCoverageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class WhoNeedsHealthCoveragePageSteps {

	static WebDriver webDriver;
	private WhoNeedsHealthCoverageActions WhoNeedsHealthCoverageActions;

	public WhoNeedsHealthCoveragePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		WhoNeedsHealthCoverageActions = new WhoNeedsHealthCoverageActions(webDriver);
	}

	@Then("I should be on Who needs health coverage? Page")
	public void i_should_be_on_Who_needs_health_coverage_Page() {
		WhoNeedsHealthCoverageActions.verifyPageTitle("Who needs health coverage?");
	}

	@When("I click Save button on Who needs health coverage? Page")
	public void i_click_Save_button_on_Who_needs_health_coverage_Page() {
		WhoNeedsHealthCoverageActions.clickSave();
	}

	@When("I click Add a person who needs coverage button")
	public void i_click_Add_a_person_who_needs_coverage_button() {
		WhoNeedsHealthCoverageActions.clickAddPersonButton();
	}

}
