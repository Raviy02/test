package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.VerifyYourIdentitityActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class VerifyYourIdentityPageSteps {

	static WebDriver webDriver;
	private VerifyYourIdentitityActions VerifyYourIdentitityActions;

	public VerifyYourIdentityPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		VerifyYourIdentitityActions = new VerifyYourIdentitityActions(webDriver);
	}

	@Then("I should be on Verify Your Identity Page")
	public void i_should_be_on_Verify_Your_Identity_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Verify Your Identity";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Verifique su identidad";
		}
		Assert.assertTrue(VerifyYourIdentitityActions.verifyPageTitle(text));
		// VerifyYourIdentitityActions.verifyPageTitle("Verify Your Identity");
	}

	@When("I click on Get Started button")
	public void i_click_on_Get_Started_button() {
		VerifyYourIdentitityActions.clickGetStarted();
	}

}
