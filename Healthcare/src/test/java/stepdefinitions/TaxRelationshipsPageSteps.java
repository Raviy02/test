package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.TaxRelationshipsActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class TaxRelationshipsPageSteps {

	static WebDriver webDriver;
	private TaxRelationshipsActions TaxRelationshipsActions;

	public TaxRelationshipsPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		TaxRelationshipsActions = new TaxRelationshipsActions(webDriver);
	}

	@Then("I Should be on Tax relationships")
	public void i_Should_be_on_Tax_relationships() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Tax relationships";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Relaciones fiscales";
		}
		Assert.assertTrue(TaxRelationshipsActions.verifyPageTitle(text));
		// TaxRelationshipsActions.verifyPageTitle("Tax relationships");
	}

	@Then("I should see First Question as {string}")
	public void i_should_see_First_Question_as(String text) {
		TaxRelationshipsActions.isQuestionPresent(text);
	}

	@When("I answer First question as {string}")
	public void i_answer_First_question_as(String text) {
		TaxRelationshipsActions.answerFirstQuestion(text);
	}

	@Then("I should see Second Question as {string}")
	public void i_should_see_Second_Question_as(String text) {
		TaxRelationshipsActions.isQuestionPresent(text);
	}

	@When("I answer Second question as {string}")
	public void i_answer_Second_question_as(String text) {
		TaxRelationshipsActions.answerSecondQuestion(text);
	}

	@Then("I should see Third Question as {string}")
	public void i_should_see_Third_Question_as(String text) {
		TaxRelationshipsActions.isQuestionPresent(text);
	}

	@When("I answer Third question as {string}")
	public void i_answer_Third_question_as(String text) {
		TaxRelationshipsActions.answerThirdQuestion(text);
	}

	@When("I click Save button on Tax relationships")
	public void i_click_Save_button_on_Tax_relationships() {
		TaxRelationshipsActions.clickSave();
	}
}
