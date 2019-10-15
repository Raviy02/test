package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.DisabilitiesHelpWithActivitiesActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class DisabilitiesHelpWithActivitiesPageSteps {

	static WebDriver webDriver;
	private DisabilitiesHelpWithActivitiesActions DisabilitiesHelpWithActivitiesActions;

	public DisabilitiesHelpWithActivitiesPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		DisabilitiesHelpWithActivitiesActions = new DisabilitiesHelpWithActivitiesActions(webDriver);
	}

	@Then("I Should be on Disabilities & help with activities Page")
	public void i_Should_be_on_Disabilities_help_with_activities_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Disabilities & help with activities";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Díganos sobre su hogar";
		}
		Assert.assertTrue(DisabilitiesHelpWithActivitiesActions.verifyPageTitle(text));
		// DisabilitiesHelpWithActivitiesActions.verifyPageTitle("Disabilities & help
		// with activities");
	}

	@When("I click Save button on Disabilities & help with activities Page")
	public void i_click_Save_button_on_Disabilities_help_with_activities_Page() {
		DisabilitiesHelpWithActivitiesActions.clickSave();
	}

}
