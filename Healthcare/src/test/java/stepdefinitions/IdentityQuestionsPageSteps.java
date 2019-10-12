package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.IdentityQuestionsActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class IdentityQuestionsPageSteps {

	static WebDriver webDriver;
	private IdentityQuestionsActions IdentityQuestionsActions;

	public IdentityQuestionsPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		IdentityQuestionsActions = new IdentityQuestionsActions(webDriver);
	}

	@Then("I should be on Identity Questions Page")
	public void i_should_be_on_Identity_Questions_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Identity Questions";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Preguntas de identidad";
		}
		Assert.assertTrue(IdentityQuestionsActions.verifyPageTitle(text));
		// IdentityQuestionsActions.verifyPageTitle("Identity Questions");
	}

	@When("I answer all questions with answer as {string}")
	public void i_answer_all_questions_with_answer_as(String text) {
		IdentityQuestionsActions.answerAllQuestions(text);
	}

	@When("I click on Continue button Identity Questions Page")
	public void i_click_on_Continue_button_Identity_Questions_Page() {
		IdentityQuestionsActions.clickContinueButton();
	}

}
