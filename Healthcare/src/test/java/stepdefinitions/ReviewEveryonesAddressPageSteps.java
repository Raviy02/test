package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.ReviewEveryonesAddressPageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class ReviewEveryonesAddressPageSteps {

	static WebDriver webDriver;
	private ReviewEveryonesAddressPageActions ReviewEveryonesAddressPageActions;

	public ReviewEveryonesAddressPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		ReviewEveryonesAddressPageActions = new ReviewEveryonesAddressPageActions(webDriver);
	}

	@Then("I should be on Review everyone's address Page")
	public void i_should_be_on_Review_everyone_s_address_Page() {
		ReviewEveryonesAddressPageActions.verifyPageTitle("Review everyone's address");
	}

	@When("I click Save button on Review everyone's address Page")
	public void i_click_Save_button_on_Review_everyone_s_address_Page() {
		ReviewEveryonesAddressPageActions.clickSave();
	}

}
