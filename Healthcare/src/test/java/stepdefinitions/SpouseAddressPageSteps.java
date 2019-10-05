package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.SpouseAddressPageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class SpouseAddressPageSteps {

	static WebDriver webDriver;
	private SpouseAddressPageActions SpouseAddressPageActions;

	public SpouseAddressPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		SpouseAddressPageActions = new SpouseAddressPageActions(webDriver);
	}

	@Then("I should be on Spouse's address page")
	public void i_should_be_on_Spouse_s_address_page() {
		SpouseAddressPageActions.verifyPageTitle("Spouse's address");
	}

	@When("I select address same as user")
	public void i_select_address_same_as_user() {
		SpouseAddressPageActions.selectAddress();
	}

	@When("I click Save button on Spouse's address page")
	public void i_click_Save_button_on_Spouse_s_address_page() {
		SpouseAddressPageActions.clickSave();
	}

}
