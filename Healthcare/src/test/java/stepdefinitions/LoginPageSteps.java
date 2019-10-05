package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;
import PageActions.LandingPageActions;
import PageActions.RandonEmailActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class LoginPageSteps {

	private LandingPageActions LandingPageActions;
	private RandonEmailActions RandonEmailActions;
	private WebDriver webDriver;

	public LoginPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		LandingPageActions = new LandingPageActions(webDriver);
		RandonEmailActions = new RandonEmailActions(webDriver);
	}

	@Given("I navigate to Login Page")
	public void i_navigate_to_Login_Page() {
		LandingPageActions.openLandingPage();
		LandingPageActions.verifyPageTitle("Health Insurance Marketplace for Individuals | HealthCare.gov");
		RandonEmailActions.generateRandomEmailId();
		CUtil.email = RandonEmailActions.recordEmailId();
		System.out.println(CUtil.email + " " + "//////////");
	}

	@When("I click on Create One link")
	public void i_click_on_Create_One_link() {
		LandingPageActions.clickCreateOne();
	}

	@Then("I should be on Login Page")
	public void i_should_be_on_Login_Page() {
		Assert.assertTrue(LandingPageActions.isAtThisPage());
	}

	@When("I type UserName")
	public void i_type_UserName() {
		// LandingPageActions.enterUserName("kaqehelo-8590@yopmail.com");
		LandingPageActions.enterUserName(CUtil.email);
	}

	@When("I type Password as {string} on Login Page")
	public void i_type_Password_as_on_Login_Page(String text) {
		LandingPageActions.enterPassword(text);
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() {
		LandingPageActions.clickLoginButton();
	}

}
