package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.MyProfileActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class MyProfilePageSteps {

	static WebDriver webDriver;
	private MyProfileActions MyProfileActions;

	public MyProfilePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		MyProfileActions = new MyProfileActions(webDriver);
	}

	@Then("I should be on My Profile Page")
	public void i_should_be_on_My_Profile_Page() {
		MyProfileActions.verifyPageTitle("My Profile");
	}

	@When("I click on Verify My Profile")
	public void i_click_on_Verify_My_Profile() throws InterruptedException {
		MyProfileActions.clickVerifyNow();
	}
	
	@When("I click on My Applications & Coverage option")
	public void i_click_on_My_Applications_Coverage_option() {
		MyProfileActions.clickMyApplicationsAndCoverage();
	}


}
