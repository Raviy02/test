package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.ReviewUserIncomeExpensesActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class ReviewUserIncomeExpensesPageSteps {

	static WebDriver webDriver;
	private ReviewUserIncomeExpensesActions ReviewUserIncomeExpensesActions;

	public ReviewUserIncomeExpensesPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		ReviewUserIncomeExpensesActions = new ReviewUserIncomeExpensesActions(webDriver);
	}

	@Then("I should be on Review User Income & Expenses Page")
	public void i_should_be_on_Review_User_Income_Expenses_Page() {
		ReviewUserIncomeExpensesActions.verifyPageTitle("Review Susan's income & expenses");
	}

	@Then("I should be on Review Spouse Income & Expenses Page")
	public void i_should_be_on_Review_Spouse_Income_Expenses_Page() {
		ReviewUserIncomeExpensesActions.verifyPageTitle("Review Spouse's income & expenses");
	}

	@Then("I should be on Review Baby Income & Expenses Page")
	public void i_should_be_on_Review_Baby_Income_Expenses_Page() {
		ReviewUserIncomeExpensesActions.verifyPageTitle("Review Baby's income & expenses");
	}

	@When("I accept User's expected income on Review User Income & Expenses Page")
	public void i_accept_User_s_expected_income_on_Review_User_Income_Expenses_Page() {
		ReviewUserIncomeExpensesActions.acceptIncome();
	}

	@When("I click Save button on Review User Income & Expenses Page")
	public void i_click_Save_button_on_Review_User_Income_Expenses_Page() {
		ReviewUserIncomeExpensesActions.clickSave();
	}
}
