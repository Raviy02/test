package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.MedicaidCHIPDenialActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class MedicaidCHIPDenialPageSteps {

	static WebDriver webDriver;
	private MedicaidCHIPDenialActions MedicaidCHIPDenialActions;

	public MedicaidCHIPDenialPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		MedicaidCHIPDenialActions = new MedicaidCHIPDenialActions(webDriver);
	}

	@Then("I Should be on Medicaid or CHIP denial Page")
	public void i_Should_be_on_Medicaid_or_CHIP_denial_Page() {
		MedicaidCHIPDenialActions.verifyPageTitle("Medicaid or CHIP denial");
	}

	@When("I click Save button on Medicaid or CHIP denial Page")
	public void i_click_Save_button_on_Medicaid_or_CHIP_denial_Page() {
		MedicaidCHIPDenialActions.clickSave();
	}

}
