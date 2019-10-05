package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.HelpPayingMedicalBillsPagesActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class HelpPayingMedicalBillsPageSteps {

	static WebDriver webDriver;
	private HelpPayingMedicalBillsPagesActions HelpPayingMedicalBillsPagesActions;

	public HelpPayingMedicalBillsPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		HelpPayingMedicalBillsPagesActions = new HelpPayingMedicalBillsPagesActions(webDriver);
	}

	@Then("I should be on Help paying medical bills Page")
	public void i_should_be_on_Help_paying_medical_bills_Page() {
		HelpPayingMedicalBillsPagesActions.verifyPageTitle("Help paying medical bills");
	}

	@When("I click Save button on Help paying medical bills Page")
	public void i_click_Save_button_on_Help_paying_medical_bills_Page() {
		HelpPayingMedicalBillsPagesActions.clickSave();
	}

}
