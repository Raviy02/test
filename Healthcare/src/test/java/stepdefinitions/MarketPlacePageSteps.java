package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.MarketPlacePageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class MarketPlacePageSteps {

	static WebDriver webDriver;
	private MarketPlacePageActions MarketPlacePageActions;

	public MarketPlacePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		MarketPlacePageActions = new MarketPlacePageActions(webDriver);
	}

	@Then("I should be on MarketPlace Page")
	public void i_should_be_on_MarketPlace_Page() {
		MarketPlacePageActions.verifyPageTitle("Welcome to the Marketplace");
	}

	@When("I click on User Profile option")
	public void i_click_on_User_Profile_option() throws InterruptedException {
		MarketPlacePageActions.clickUserPorfile();
	}

	@When("I click on My Profile Option")
	public void i_click_on_My_Profile_Option() {
		MarketPlacePageActions.clickMyProfileOption();
	}

}
