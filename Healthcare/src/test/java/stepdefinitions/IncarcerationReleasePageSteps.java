package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.IncarcerationReleasePageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class IncarcerationReleasePageSteps {
	static WebDriver webDriver;
	private IncarcerationReleasePageActions IncarcerationReleasePageActions;

	public IncarcerationReleasePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		IncarcerationReleasePageActions = new IncarcerationReleasePageActions(webDriver);
	}

	@Then("I should be on Incarceration release Page")
	public void i_should_be_on_Incarceration_release_Page() {
		IncarcerationReleasePageActions.verifyPageTitle("Incarceration release");
	}

	@When("I select option as {string} on Incarceration release Page")
	public void i_select_option_as_on_Incarceration_release_Page(String text) {
		IncarcerationReleasePageActions.selectOptions(text);
	}

	@When("I click Save button on Incarceration release Page")
	public void i_click_Save_button_on_Incarceration_release_Page() {
		IncarcerationReleasePageActions.clickSave();
	}

}
