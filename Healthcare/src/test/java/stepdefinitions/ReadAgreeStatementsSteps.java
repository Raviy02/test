package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.ReadAgreeStatementsActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class ReadAgreeStatementsSteps {

	static WebDriver webDriver;
	private ReadAgreeStatementsActions ReadAgreeStatementsActions;

	public ReadAgreeStatementsSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		ReadAgreeStatementsActions = new ReadAgreeStatementsActions(webDriver);
	}

	@Then("I should be on Read & agree to these statements Page")
	public void i_should_be_on_Read_agree_to_these_statements_Page() {
		ReadAgreeStatementsActions.verifyPageTitle("Read & agree to these statements");
	}

	@When("I accepct All Agreement on Read & agree to these statements Page")
	public void i_accepct_All_Agreement_on_Read_agree_to_these_statements_Page() {
		ReadAgreeStatementsActions.acceptAgreement();
	}

	@When("I click Save button on Read & agree to these statements Page")
	public void i_click_Save_button_on_Read_agree_to_these_statements_Page() {
		ReadAgreeStatementsActions.clickSave();
	}

}
