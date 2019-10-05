package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.ApplicationForIndividualsAndFamiliesPageActions;
import PageActions.MyApplicationsAndCoverageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class ApplicationForIndividualsAndFamiliesPageSteps {

	static WebDriver webDriver;
	private ApplicationForIndividualsAndFamiliesPageActions ApplicationForIndividualsAndFamiliesPageActions;

	public ApplicationForIndividualsAndFamiliesPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		ApplicationForIndividualsAndFamiliesPageActions = new ApplicationForIndividualsAndFamiliesPageActions(
				webDriver);
	}

	@Then("I should be on Application For Individuals & Families Page")
	public void i_should_be_on_Application_For_Individuals_Families_Page() {
		ApplicationForIndividualsAndFamiliesPageActions.verifyPageTitle("Application For Individuals & Families");
	}

	@When("I select year as {string} on Application For Individuals & Families Page")
	public void i_select_year_as_on_Application_For_Individuals_Families_Page(String text) throws InterruptedException {
		ApplicationForIndividualsAndFamiliesPageActions.selectYear(text);
	}

	@When("I select state as {string} on Application For Individuals & Families Page")
	public void i_select_state_as_on_Application_For_Individuals_Families_Page(String text)
			throws InterruptedException {
		ApplicationForIndividualsAndFamiliesPageActions.selectState(text);
	}

	@When("I click on Apply or Renew Button on Application For Individuals & Families Page")
	public void i_click_on_Apply_or_Renew_Button_on_Application_For_Individuals_Families_Page() {
		MyApplicationsAndCoverageActions.clickApplyOrRenewButton();
	}

}
