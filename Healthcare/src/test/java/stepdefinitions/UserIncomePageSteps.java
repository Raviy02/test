package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.UserIncomeActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class UserIncomePageSteps {

	static WebDriver webDriver;
	private UserIncomeActions UserIncomeActions;

	public UserIncomePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		UserIncomeActions = new UserIncomeActions(webDriver);
	}

	@Then("I should be on User Income Page")
	public void i_should_be_on_User_Income_Page() {
		UserIncomeActions.verifyPageTitle("Susan’s income");
	}

	@Then("I should be on Spouse Income Page")
	public void i_should_be_on_Spouse_Income_Page() {
		UserIncomeActions.verifyPageTitle("Spouse’s income");
	}

	@When("I select type of income as {string} on User Income Page")
	public void i_select_type_of_income_as_on_User_Income_Page(String text) {
		UserIncomeActions.selectIncomeType(text);
	}

	@When("I type Employer Name as {string} on User Income Page")
	public void i_type_Employer_Name_as_on_User_Income_Page(String text) {
		UserIncomeActions.typeEmployerName(text);
	}

	@When("I select salary cycle as {string} on User Income Page")
	public void i_select_salary_cycle_as_on_User_Income_Page(String text) {
		UserIncomeActions.selectSalaryCycle(text);
	}

	@When("I type salary as {string} on User Income Page")
	public void i_type_salary_as_on_User_Income_Page(String text) {
		UserIncomeActions.typeSalary(text);
	}

	@When("I type phone number as {string} on User Income Page")
	public void i_type_phone_number_as_on_User_Income_Page(String text) {
		UserIncomeActions.typePhoneNumber(text);
	}

	@When("I click Save button on User Income Page")
	public void i_click_Save_button_on_User_Income_Page() {
		UserIncomeActions.clickSave();
	}

}
