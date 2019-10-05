package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.UpcomingCoverageChangesPageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class UpcomingCoverageChangesPageSteps {

	static WebDriver webDriver;
	private UpcomingCoverageChangesPageActions UpcomingCoverageChangesPageActions;

	public UpcomingCoverageChangesPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		UpcomingCoverageChangesPageActions = new UpcomingCoverageChangesPageActions(webDriver);
	}

	@Then("I should be on Upcoming coverage changes Page")
	public void i_should_be_on_Upcoming_coverage_changes_Page() {
		UpcomingCoverageChangesPageActions.verifyPageTitle("Upcoming coverage changes");
	}

	@When("I click Save button on Upcoming coverage changes Page")
	public void i_click_Save_button_on_Upcoming_coverage_changes_Page() {
		UpcomingCoverageChangesPageActions.clickSave();
	}

}
