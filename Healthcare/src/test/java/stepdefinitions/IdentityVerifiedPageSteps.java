package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.IdentityVerifiedActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class IdentityVerifiedPageSteps {

	static WebDriver webDriver;
	private IdentityVerifiedActions IdentityVerifiedActions;

	public IdentityVerifiedPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		IdentityVerifiedActions = new IdentityVerifiedActions(webDriver);
	}

	@Then("I should be on Identity Verified Page")
	public void i_should_be_on_Identity_Verified_Page() {
		IdentityVerifiedActions.verifyPageTitle("Identity Verified");
	}

	@When("I click on Continue button Identity Verified Page")
	public void i_click_on_Continue_button_Identity_Verified_Page() {
		IdentityVerifiedActions.clickContinueButton();
	}
}
