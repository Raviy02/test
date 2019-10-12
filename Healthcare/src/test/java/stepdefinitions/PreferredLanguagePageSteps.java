package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.PreferredLanguageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class PreferredLanguagePageSteps {
	static WebDriver webDriver;
	private PreferredLanguageActions PreferredLanguageActions;

	public PreferredLanguagePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		PreferredLanguageActions = new PreferredLanguageActions(webDriver);
	}

	@Then("I should be on Preferred Language Page")
	public void i_should_be_on_Preferred_Language_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Preferred language";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "¿Cuál es su idioma preferido?";
		}
		Assert.assertTrue(PreferredLanguageActions.verifyPageTitle(text));
		// PreferredLanguageActions.verifyPageTitle("Contact information");
	}

	@When("I select Preferred written language as {string}")
	public void i_select_Preferred_written_language_as(String text) {
		PreferredLanguageActions.selectPreferredWrittenLanguage(text);
	}

	@When("I select Preferred spoken language as {string}")
	public void i_select_Preferred_spoken_language_as(String text) {
		PreferredLanguageActions.selectPreferredSpokenLanguage(text);
	}

	@When("I click Save button on Preferred Language Page")
	public void i_click_Save_button_on_Preferred_Language_Page() {
		PreferredLanguageActions.clickSave();
	}
}
