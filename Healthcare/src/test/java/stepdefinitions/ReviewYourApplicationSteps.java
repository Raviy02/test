package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.ReviewYourApplicationActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class ReviewYourApplicationSteps {
	static WebDriver webDriver;
	private ReviewYourApplicationActions ReviewYourApplicationActions;

	public ReviewYourApplicationSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		ReviewYourApplicationActions = new ReviewYourApplicationActions(webDriver);
	}

	@Then("I should be on Review your application Page")
	public void i_should_be_on_Review_your_application_Page() {
		ReviewYourApplicationActions.verifyPageTitle("Review your application");
	}

	@When("I click Save button on Review your application Page")
	public void i_click_Save_button_on_Review_your_application_Page() {
		ReviewYourApplicationActions.clickSave();
	}
}
