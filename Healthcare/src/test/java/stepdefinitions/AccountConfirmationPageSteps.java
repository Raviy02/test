package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.AccountConfirmationActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class AccountConfirmationPageSteps {

	static WebDriver webDriver;
	private AccountConfirmationActions AccountConfirmationActions;

	public AccountConfirmationPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		AccountConfirmationActions = new AccountConfirmationActions(webDriver);
	}

	@Then("I should be on Account Confirmation Page")
	public void i_should_be_on_Account_Confirmation_Page() {
		Assert.assertTrue(AccountConfirmationActions.isAtThisPage());
	}

	@When("I click on Continue to login button")
	public void i_click_on_Continue_to_login_button() {
		AccountConfirmationActions.clickContinueToLogin();
	}

}
