package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.ReportALifeChangePageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class ReportALifeChangePageSteps {

	static WebDriver webDriver;
	private ReportALifeChangePageActions ReportALifeChangePageActions;

	public ReportALifeChangePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		ReportALifeChangePageActions = new ReportALifeChangePageActions(webDriver);
	}

	@Then("I should be on Report a life change Page")
	public void i_should_be_on_Report_a_life_change_Page() {
		ReportALifeChangePageActions.verifyPageTitle("My Account");
	}

	@When("I click on Report a life change button")
	public void i_click_on_Report_a_life_change_button() {
		ReportALifeChangePageActions.clickReportLifeChangeButton();
	}

	@Then("I should see Have you had any changes like these? modal")
	public void i_should_see_Have_you_had_any_changes_like_these_modal() {
		Assert.assertTrue(ReportALifeChangePageActions.isModalPresent());
	}

	@When("I select Report a change in my household's income, size, address, or other information option")
	public void i_select_Report_a_change_in_my_household_s_income_size_address_or_other_information_option() {
		ReportALifeChangePageActions.clickChangeInMyHouseholdOption();
	}

	@When("I click Continue button on Have you had any changes like these? modal")
	public void i_click_Continue_button_on_Have_you_had_any_changes_like_these_modal() {
		ReportALifeChangePageActions.clickContinue();
	}

}
