package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.ParentsCaretakerRelativesActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class ParentsCaretakerRelativesPageSteps {
	static WebDriver webDriver;
	private ParentsCaretakerRelativesActions ParentsCaretakerRelativesActions;

	public ParentsCaretakerRelativesPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		ParentsCaretakerRelativesActions = new ParentsCaretakerRelativesActions(webDriver);
	}

	@Then("I Should be on Parents & caretaker relatives Page")
	public void i_Should_be_on_Parents_caretaker_relatives_Page() {
		ParentsCaretakerRelativesActions.verifyPageTitle("Parents & caretaker relatives");
	}

	@When("I select dependents as {string}")
	public void i_select_dependents_as(String text) {
		ParentsCaretakerRelativesActions.selectDependent(text);
	}

	@When("I click Save button on Parents & caretaker relatives Page")
	public void i_click_Save_button_on_Parents_caretaker_relatives_Page() {
		ParentsCaretakerRelativesActions.clickSave();
	}

}
