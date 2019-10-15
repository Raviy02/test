package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.CitizenshipImmigrationStatusActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class CitizenshipImmigrationStatusPageSteps {

	static WebDriver webDriver;
	private CitizenshipImmigrationStatusActions CitizenshipImmigrationStatusActions;

	public CitizenshipImmigrationStatusPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		CitizenshipImmigrationStatusActions = new CitizenshipImmigrationStatusActions(webDriver);
	}

	@Then("I Should be on Citizenship & Immigration Status Page")
	public void i_Should_be_on_Citizenship_Immigration_Status_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Citizenship & Immigration Status";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Ciudadanía y Estatus Migratorio";
		}
		Assert.assertTrue(CitizenshipImmigrationStatusActions.verifyPageTitle(text));
		// CitizenshipImmigrationStatusActions.verifyPageTitle("Citizenship &
		// Immigration Status");
	}

	@When("I Select option as {string}")
	public void i_Select_option_as(String text) {
		CitizenshipImmigrationStatusActions.selectOption(text);
	}

	@When("I click Save button on Citizenship & Immigration Status Page")
	public void i_click_Save_button_on_Citizenship_Immigration_Status_Page() {
		CitizenshipImmigrationStatusActions.clickSave();
	}

}
