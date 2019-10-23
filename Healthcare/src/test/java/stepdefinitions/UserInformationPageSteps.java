package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.UserInformationActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class UserInformationPageSteps {

	static WebDriver webDriver;
	private UserInformationActions UserInformationActions;

	public UserInformationPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		UserInformationActions = new UserInformationActions(webDriver);
	}

	@Then("I Should be on User Information Page")
	public void i_Should_be_on_User_Information_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Susan's information";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Información de Susan";
		}
		Assert.assertTrue(UserInformationActions.verifyPageTitle(text));
		// UserInformationActions.verifyPageTitle("Susan's information");
	}

	@Then("I Should be on User Information Page after name update")
	public void i_Should_be_on_User_Information_Page_after_name_update() {
		UserInformationActions.verifyPageTitle("Susan Change of Name's information");
	}

	@Then("I Should be on Spouse Information Page")
	public void i_Should_be_on_Spouse_Information_Page() {
		UserInformationActions.verifyPageTitle("Spouse's information");
	}

	@Then("I Should be on Baby Information Page")
	public void i_Should_be_on_Baby_Information_Page() {
		UserInformationActions.verifyPageTitle("Baby's information");
	}

	@When("I click Save button on User Information Page")
	public void i_click_Save_button_on_User_Information_Page() {
		UserInformationActions.clickSave();
	}

	@When("I select Susan doesn't have an SSN option")
	public void i_select_Susan_doesn_t_have_an_SSN_option() {
		UserInformationActions.selectNoSSN();
	}

	@Then("I select Spouse doesn't have an SSN option")
	public void i_select_Spouse_doesn_t_have_an_SSN_option() {
		UserInformationActions.selectNoSSN();
	}

	@Then("I select Baby doesn't have an SSN option")
	public void i_select_Baby_doesn_t_have_an_SSN_option() {
		UserInformationActions.selectNoSSN();
	}

}
