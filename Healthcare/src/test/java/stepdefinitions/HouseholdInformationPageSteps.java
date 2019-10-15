package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.HouseholdInformationActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class HouseholdInformationPageSteps {
	static WebDriver webDriver;
	private HouseholdInformationActions HouseholdInformationActions;

	public HouseholdInformationPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		HouseholdInformationActions = new HouseholdInformationActions(webDriver);
	}

	@Then("I Should be on Household information")
	public void i_Should_be_on_Household_information() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Household information";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Información del hogar";
		}
		Assert.assertTrue(HouseholdInformationActions.verifyPageTitle(text));
		// HouseholdInformationActions.verifyPageTitle("Household information");
	}

	@When("I select option as {string} on Household information")
	public void i_select_option_as_on_Household_information(String text) {
		HouseholdInformationActions.selectOption(text);
	}

	@When("I click Save button on Household information")
	public void i_click_Save_button_on_Household_information() {
		HouseholdInformationActions.clickSave();
	}

}
