package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.HouseholdIncomeActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class HouseholdIncomePageSteps {

	static WebDriver webDriver;
	private HouseholdIncomeActions HouseholdIncomeActions;

	public HouseholdIncomePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		HouseholdIncomeActions = new HouseholdIncomeActions(webDriver);
	}

	@Then("I Should be on Household income Page")
	public void i_Should_be_on_Household_income_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Household income";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Díganos sobre los ingresos de su hogar";
		}
		Assert.assertTrue(HouseholdIncomeActions.verifyPageTitle(text));
		// HouseholdIncomeActions.verifyPageTitle("Household income");
	}

	@When("I select option as {string}")
	public void i_select_option_as(String text) {
		HouseholdIncomeActions.selectOption(text);
	}

	@When("I click Save button on Household income Page")
	public void i_click_Save_button_on_Household_income_Page() {
		HouseholdIncomeActions.clickSave();
	}

}
