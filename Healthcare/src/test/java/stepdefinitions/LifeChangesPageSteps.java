package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.LifeChangesPageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class LifeChangesPageSteps {

	static WebDriver webDriver;
	private LifeChangesPageActions LifeChangesPageActions;

	public LifeChangesPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		LifeChangesPageActions = new LifeChangesPageActions(webDriver);
	}

	@Then("I should be on Life changes Page")
	public void i_should_be_on_Life_changes_Page() {
		LifeChangesPageActions.verifyPageTitle("Life changes");
	}

	@When("I select option as {string} on Life changes Page")
	public void i_select_option_as_on_Life_changes_Page(String text) {
		LifeChangesPageActions.selectOptions(text);
	}

	@When("I click Save button on Life changes Page")
	public void i_click_Save_button_on_Life_changes_Page() {
		LifeChangesPageActions.clickSave();
	}

}
