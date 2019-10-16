package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.UsersIncarcerationReleasePageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class UsersIncarcerationReleasePageSteps {
	static WebDriver webDriver;
	private UsersIncarcerationReleasePageActions UsersIncarcerationReleasePageActions;

	public UsersIncarcerationReleasePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		UsersIncarcerationReleasePageActions = new UsersIncarcerationReleasePageActions(webDriver);
	}

	@Then("I should be on User's incarceration release Page")
	public void i_should_be_on_User_s_incarceration_release_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Susan's incarceration release";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Díganos sobre la liberación de la cárcel de Susan";
		}
		Assert.assertTrue(UsersIncarcerationReleasePageActions.verifyPageTitle(text));
		// UsersIncarcerationReleasePageActions.verifyPageTitle("Susan's incarceration
		// release");
	}

	@Then("I should be on User's incarceration release Page after name change")
	public void i_should_be_on_User_s_incarceration_release_Page_after_name_change() {
		UsersIncarcerationReleasePageActions.verifyPageTitle("Susan Change of Name's incarceration release");
	}

	@Then("I should be on Spouse's incarceration release Page")
	public void i_should_be_on_Spouse_s_incarceration_release_Page() {
		UsersIncarcerationReleasePageActions.verifyPageTitle("Spouse's incarceration release");
	}

	@When("I type month as {string} on User's incarceration release Page")
	public void i_type_month_as_on_User_s_incarceration_release_Page(String text) {
		UsersIncarcerationReleasePageActions.typeMonth(text);
	}

	@When("I type day as {string} on User's incarceration release Page")
	public void i_type_day_as_on_User_s_incarceration_release_Page(String text) {
		UsersIncarcerationReleasePageActions.typeDay(text);
	}

	@When("I type year as {string} on User's incarceration release Page")
	public void i_type_year_as_on_User_s_incarceration_release_Page(String text) {
		UsersIncarcerationReleasePageActions.typeYear(text);
	}

	@When("I click Save button on User's incarceration release Page")
	public void i_click_Save_button_on_User_s_incarceration_release_Page() {
		UsersIncarcerationReleasePageActions.clickSave();
	}

}
