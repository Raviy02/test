package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.WhereDoesEveryoneLivePageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class WhereDoesEveryoneLivePageSteps {

	static WebDriver webDriver;
	private WhereDoesEveryoneLivePageActions WhereDoesEveryoneLivePageActions;

	public WhereDoesEveryoneLivePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		WhereDoesEveryoneLivePageActions = new WhereDoesEveryoneLivePageActions(webDriver);
	}

	@Then("I should be on Where does everyone live? Page")
	public void i_should_be_on_Where_does_everyone_live_Page() {
		WhereDoesEveryoneLivePageActions.verifyPageTitle("Where does everyone live?");
	}

	@When("I select option as {string} on Where does everyone live? Page")
	public void i_select_option_as_on_Where_does_everyone_live_Page(String text) {
		WhereDoesEveryoneLivePageActions.selectOption(text);
	}

	@When("I click Save button on Where does everyone live? Page")
	public void i_click_Save_button_on_Where_does_everyone_live_Page() {
		WhereDoesEveryoneLivePageActions.clickSave();
	}

}
