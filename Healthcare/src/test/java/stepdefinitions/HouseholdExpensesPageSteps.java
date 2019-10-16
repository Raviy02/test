package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.HouseholdExpensesActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class HouseholdExpensesPageSteps {

	static WebDriver webDriver;
	private HouseholdExpensesActions HouseholdExpensesActions;

	public HouseholdExpensesPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		HouseholdExpensesActions = new HouseholdExpensesActions(webDriver);
	}

	@Then("I should be on Household expenses Page")
	public void i_should_be_on_Household_expenses_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Household expenses";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Díganos sobre los gastos de su vivienda";
		}
		Assert.assertTrue(HouseholdExpensesActions.verifyPageTitle(text));
		// HouseholdExpensesActions.verifyPageTitle("Household expenses");
	}

	@When("I click Save button on Household expenses Page")
	public void i_click_Save_button_on_Household_expenses_Page() {
		HouseholdExpensesActions.clickSave();
	}

}
