package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.SignSubmitActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class SignSubmitSteps {

	static WebDriver webDriver;
	private SignSubmitActions SignSubmitActions;

	public SignSubmitSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		SignSubmitActions = new SignSubmitActions(webDriver);
	}

	@Then("I should be on Sign & submit Page")
	public void i_should_be_on_Sign_submit_Page() {
		SignSubmitActions.verifyPageTitle("Sign & submit");
	}

	@When("I accept agreement on Sign & submit Page")
	public void i_accept_agreement_on_Sign_submit_Page() {
		SignSubmitActions.acceptAgreement();
	}

	@When("I type Name as {string} on Sign & submit Page")
	public void i_type_Name_as_on_Sign_submit_Page(String text) {
		SignSubmitActions.enterName(text);
	}

	@When("I click Save button on Sign & submit Page")
	public void i_click_Save_button_on_Sign_submit_Page() {
		SignSubmitActions.clickSave();
	}

}
