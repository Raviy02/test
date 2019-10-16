package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.JobbasedhealthcoveragePageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class JobbasedhealthcoveragePageSteps {

	static WebDriver webDriver;
	private JobbasedhealthcoveragePageActions JobbasedhealthcoveragePageActions;

	public JobbasedhealthcoveragePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		JobbasedhealthcoveragePageActions = new JobbasedhealthcoveragePageActions(webDriver);
	}

	@Then("I should be on Job-based health coverage Page")
	public void i_should_be_on_Job_based_health_coverage_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Current coverage";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Cobertura basada en el empleo";
		}
		Assert.assertTrue(JobbasedhealthcoveragePageActions.verifyPageTitle(text));
		// JobbasedhealthcoveragePageActions.verifyPageTitle("Current coverage");
	}

	@When("I select option as {string} on Job-based health coverage page")
	public void i_select_option_as_on_Job_based_health_coverage_page(String text) {
		JobbasedhealthcoveragePageActions.selecctOption(text);
	}

	@When("I click Save button on Job-based health coverage page")
	public void i_click_Save_button_on_Job_based_health_coverage_page() {
		JobbasedhealthcoveragePageActions.clickSave();
	}

}
