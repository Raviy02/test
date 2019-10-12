package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.MailingAddressActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class MailingAddressPageSteps {

	static WebDriver webDriver;
	private MailingAddressActions MailingAddressActions;

	public MailingAddressPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		MailingAddressActions = new MailingAddressActions(webDriver);
	}

	@Then("I should be on Mailing Address Page")
	public void i_should_be_on_Mailing_Address_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Mailing address";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "¿Cuál es su dirección postal?";
		}
		Assert.assertTrue(MailingAddressActions.verifyPageTitle(text));
		// MailingAddressActions.verifyPageTitle("Mailing address");
	}

	@When("I Accept mailing address")
	public void i_Accept_mailing_address() {
		MailingAddressActions.acceptMailingAddress();
	}

	@When("I click Save button on Mailing Address Page")
	public void i_click_Save_button_on_Mailing_Address_Page() {
		MailingAddressActions.clickSave();
	}

}
