package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.ContactPreferencesActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class ContactPreferencesPageSteps {

	static WebDriver webDriver;
	private ContactPreferencesActions ContactPreferencesActions;

	public ContactPreferencesPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		ContactPreferencesActions = new ContactPreferencesActions(webDriver);
	}

	@Then("I should be on Contact preferences Page")
	public void i_should_be_on_Contact_preferences_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Contact preferences";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Díganos cómo le gustaría ser contactado";
		}
		Assert.assertTrue(ContactPreferencesActions.verifyPageTitle(text));
		// ContactPreferencesActions.verifyPageTitle("Contact preferences");
	}

	@When("I Select Contact preference as {string}")
	public void i_Select_Contact_preference_as(String text) {
		ContactPreferencesActions.selectPreference(text);
	}

	@When("I click Save button on Contact preferences Page")
	public void i_click_Save_button_on_Contact_preferences_Page() {
		ContactPreferencesActions.clickSave();
	}

}
