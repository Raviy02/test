package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;
import PageActions.CreateAccountActions;
import PageActions.RandonEmailActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class CreateAccountPageSteps {

	private CreateAccountActions CreateAccountActions;
	private RandonEmailActions RandonEmailActions;
	private WebDriver webDriver;

	public CreateAccountPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		CreateAccountActions = new CreateAccountActions(webDriver);
		RandonEmailActions = new RandonEmailActions(webDriver);
	}

	@Then("I should be on Create an account Page")
	public void i_should_be_on_Create_an_account_Page() {
		Assert.assertTrue(CreateAccountActions.isAtThisPage());
	}

	@When("I select state as {string}")
	public void i_select_state_as(String text) {
		CreateAccountActions.selectState(text);
	}

	@When("I type First Name as {string}")
	public void i_type_First_Name_as(String text) {
		CreateAccountActions.enterFirstName(text);
	}

	@When("I type Last Name as {string}")
	public void i_tyep_Last_Nam_as(String text) {
		CreateAccountActions.enterLastName(text);
	}

	@When("I type Password as {string}")
	public void i_type_Password_as(String text) {
		CreateAccountActions.enterPassword(text);
	}

	@When("I Retype Password as {string}")
	public void i_Retype_Password_as(String text) {
		CreateAccountActions.reEnterPassword(text);
	}

	@When("I select First Question as {string}")
	public void i_select_First_Question_as(String text) {
		CreateAccountActions.pickFirstQuestion(text);
	}

	@When("I type First answer as {string}")
	public void i_type_First_answer_as(String text) {
		CreateAccountActions.enterFirstAnswer(text);
	}

	@When("I select Second Question as {string}")
	public void i_select_Second_Question_as(String text) {
		CreateAccountActions.pickSecondQuestion(text);
	}

	@When("I type Second answer as {string}")
	public void i_type_Second_answer_as(String text) {
		CreateAccountActions.enterSecondAnswer(text);
	}

	@When("I select Third Question as {string}")
	public void i_select_Third_Question_as(String text) {
		CreateAccountActions.pickThirdQuestion(text);
	}

	@When("I type Third answer as {string}")
	public void i_type_Third_answer_as(String text) {
		CreateAccountActions.enterThirdAnswer(text);
	}

	@When("I accecpt Privacy, Terms & Conditions")
	public void i_accecpt_Privacy_Terms_Conditions() {
		CreateAccountActions.acceptAgreement();
	}

	@When("I click on Create Account button")
	public void i_click_on_Create_Account_button() {
		CreateAccountActions.clickCreateAccount();
	}

	@When("I Verify tehe created account")
	public void i_Verify_tehe_created_account() {
		RandonEmailActions.clickCheckMails();
		RandonEmailActions.clickCheckForNewMails();
		RandonEmailActions.clickVerificationLink();
	}

	@When("I type email ID")
	public void i_type_email_ID() {
		CreateAccountActions.enterEmailId(CUtil.email);
	}

}
