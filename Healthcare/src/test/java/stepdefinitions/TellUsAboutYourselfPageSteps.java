package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.TellUsAboutYoutSelfActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class TellUsAboutYourselfPageSteps {

	static WebDriver webDriver;
	private TellUsAboutYoutSelfActions TellUsAboutYoutSelfActions;

	public TellUsAboutYourselfPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		TellUsAboutYoutSelfActions = new TellUsAboutYoutSelfActions(webDriver);
	}

	@Then("I should be on Tell us about yourself Page")
	public void i_should_be_on_Tell_us_about_yourself_Page() {
		TellUsAboutYoutSelfActions.verifyPageTitle("Tell us about yourself");
	}

	@When("I type month as {string}")
	public void i_type_month_as(String text) {
		TellUsAboutYoutSelfActions.typeMonth(text);
	}

	@When("I type Day as {string}")
	public void i_type_Day_as(String text) {
		TellUsAboutYoutSelfActions.typeDay(text);
	}

	@When("I type year as {string}")
	public void i_type_year_as(String text) {
		TellUsAboutYoutSelfActions.typeYear(text);
	}

	@When("I select sex as {string}")
	public void i_select_sex_as(String text) {
		TellUsAboutYoutSelfActions.selectSex(text);
	}

	@When("I click Save button on Tell us about yourself Page")
	public void i_click_Save_button_on_Tell_us_about_yourself_Page() {
		TellUsAboutYoutSelfActions.clickSave();
	}

	@When("I type FirstName as {string}")
	public void i_type_FirstName_as(String text) {
		TellUsAboutYoutSelfActions.typeFirstName(text);
	}

	@When("I type Last Name as {string} on Tell us about yourself Page")
	public void i_type_Last_Name_as_on_Tell_us_about_yourself_Page(String text) {
		TellUsAboutYoutSelfActions.typeLastName(text);
	}

}
