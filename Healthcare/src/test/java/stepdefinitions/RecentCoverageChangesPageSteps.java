package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.RecentCoverageChangesPageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class RecentCoverageChangesPageSteps {

	static WebDriver webDriver;
	private RecentCoverageChangesPageActions RecentCoverageChangesPageActions;

	public RecentCoverageChangesPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		RecentCoverageChangesPageActions = new RecentCoverageChangesPageActions(webDriver);
	}

	@Then("I should be on Recent coverage changes Page")
	public void i_should_be_on_Recent_coverage_changes_Page() {
		RecentCoverageChangesPageActions.verifyPageTitle("Recent coverage changes");
	}

	@When("I click Save button on Recent coverage changes Page")
	public void i_click_Save_button_on_Recent_coverage_changes_Page() {
		RecentCoverageChangesPageActions.clickSave();
	}
}
