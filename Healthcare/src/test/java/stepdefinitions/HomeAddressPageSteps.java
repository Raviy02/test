package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.HomeAddressActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class HomeAddressPageSteps {

	static WebDriver webDriver;
	private HomeAddressActions HomeAddressActions;

	public HomeAddressPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		HomeAddressActions = new HomeAddressActions(webDriver);
	}

	@Then("I should be on Home address Page")
	public void i_should_be_on_Home_address_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Home address";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "¿Cual es su dirección residencial?";
		}
		Assert.assertTrue(HomeAddressActions.verifyPageTitle(text));
		// HomeAddressActions.verifyPageTitle("Home address");
	}

	@When("I enter Street Address as {string}")
	public void i_enter_Street_Address_as(String text) {
		HomeAddressActions.enterStreetAddress(text);
	}

	@When("I enter City as {string}")
	public void i_enter_City_as(String text) {
		HomeAddressActions.enterCity(text);
	}

	@When("I enter ZipCode as {string}")
	public void i_enter_ZipCode_as(String text) {
		HomeAddressActions.enterZipCode(text);
	}

	@When("I click Save button on Home address Page")
	public void i_click_Save_button_on_Home_address_Page() {
		HomeAddressActions.clickSave();
	}

	@When("I select USPS Address")
	public void i_select_USPS_Address() {
		HomeAddressActions.selectUSPSAddress();
	}

}
