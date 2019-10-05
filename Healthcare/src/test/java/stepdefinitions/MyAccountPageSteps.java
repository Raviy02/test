package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.MyAccountPageStepsActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class MyAccountPageSteps {

	static WebDriver webDriver;
	private MyAccountPageStepsActions MyAccountPageStepsActions;

	public MyAccountPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		MyAccountPageStepsActions = new MyAccountPageStepsActions(webDriver);
	}

	@Then("I should be on My Account Page")
	public void i_should_be_on_My_Account_Page() {
		MyAccountPageStepsActions.verifyPageTitle("My Account");
	}

	@When("I click on Report a life change option")
	public void i_click_on_Report_a_life_change_option() {
		MyAccountPageStepsActions.clickReportLifeChangeOption();
	}

}
