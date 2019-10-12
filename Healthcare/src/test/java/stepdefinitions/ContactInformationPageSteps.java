package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.ContactInformationActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class ContactInformationPageSteps {
	static WebDriver webDriver;
	private ContactInformationActions ContactInformationActions;

	public ContactInformationPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		ContactInformationActions = new ContactInformationActions(webDriver);
	}

	@Then("I should be on Contact Information Page")
	public void i_should_be_on_Contact_Information_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Contact Information";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Información de contacto";
		}
		Assert.assertTrue(ContactInformationActions.verifyPageTitle(text));
		// ContactInformationActions.verifyPageTitle("Contact Information");
	}

	@When("I type Date of Birth as {string}")
	public void i_type_Date_of_Birth_as(String text) {
		ContactInformationActions.enterDOB(text);
	}

	@When("I type Street Address as {string}")
	public void i_type_Street_Address_as(String text) {
		ContactInformationActions.enterStreetAddress("34 Elsmere Blvd");
	}

	@When("I type City as {string}")
	public void i_type_City_as(String text) {
		ContactInformationActions.enterCity(text);
	}

	@When("I type Zip Code as {string}")
	public void i_type_Zip_Code_as(String text) {
		ContactInformationActions.enterZipCode(text);
	}

	@When("I type Phone Number as {string}")
	public void i_type_Phone_Number_as(String text) {
		ContactInformationActions.enterPhoneNumber(text);
	}

	@When("I select Type of Phone as {string}")
	public void i_select_Type_of_Phone_as(String text) {
		ContactInformationActions.selectPhoneType(text);
	}

	@When("I click on Continue Button")
	public void i_click_on_Continue_Button() {
		ContactInformationActions.clickContinueButton();
	}

}
