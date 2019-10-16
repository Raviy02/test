package stepdefinitions;

import org.junit.Assert;
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
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Medicaid or CHIP denial";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Díganos sobre su hogar";
		}
		Assert.assertTrue(MedicaidCHIPDenialActions.verifyPageTitle(text));
		// MedicaidCHIPDenialActions.verifyPageTitle("Medicaid or CHIP denial");
	}

	@When("I click Save button on Medicaid or CHIP denial Page")
	public void i_click_Save_button_on_Medicaid_or_CHIP_denial_Page() {
		MedicaidCHIPDenialActions.clickSave();
	}

}
