package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.ContactInformationActionsNewApplication;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class ContactInformationNewPageSteps {

	static WebDriver webDriver;
	private ContactInformationActionsNewApplication ContactInformationActionsNewApplication;

	public ContactInformationNewPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		ContactInformationActionsNewApplication = new ContactInformationActionsNewApplication(webDriver);
	}

	@Then("I should be on Contact information Page")
	public void i_should_be_on_Contact_information_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Contact information";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "¿Cuál es su información de contacto?";
		}
		Assert.assertTrue(ContactInformationActionsNewApplication.verifyPageTitle(text));
		// ContactInformationActionsNewApplication.verifyPageTitle("Contact
		// information");
	}

	@When("I select Phone type as {string}")
	public void i_select_Phone_type_as(String text) {
		ContactInformationActionsNewApplication.selectPhoneType("Home");
	}

	@When("I click Save button on Contact information Page")
	public void i_click_Save_button_on_Contact_information_Page() {
		ContactInformationActionsNewApplication.clickSave();
	}

	@When("I type Phone Number as {string} on Contact information Page")
	public void i_type_Phone_Number_as_on_Contact_information_Page(String text) {
		ContactInformationActionsNewApplication.enterPhoneNumber(text);
	}

}
