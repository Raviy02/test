package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.MyApplicationsAndCoverageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class MyApplicationsAndCoveragePageSteps {

	static WebDriver webDriver;
	private MyApplicationsAndCoverageActions MyApplicationsAndCoverageActions;

	public MyApplicationsAndCoveragePageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		MyApplicationsAndCoverageActions = new MyApplicationsAndCoverageActions(webDriver);
	}

	@Then("I should be on My Applications & Coverage Page")
	public void i_should_be_on_My_Applications_Coverage_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "My Applications & Coverage";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Mis Solicitudes y Cobertura";
		}
		Assert.assertTrue(MyApplicationsAndCoverageActions.verifyPageTitle(text));
		// MyApplicationsAndCoverageActions.verifyPageTitle("My Applications &
		// Coverage");
	}

	@When("I select Year as {string} on My Applications & Coverage Page")
	public void i_select_Year_as_on_My_Applications_Coverage_Page(String text) throws InterruptedException {
		MyApplicationsAndCoverageActions.selectYear(text);
	}

	@When("I select state as {string} on My Applications & Coverage Page")
	public void i_select_state_as_on_My_Applications_Coverage_Page(String text) throws InterruptedException {
		MyApplicationsAndCoverageActions.selectState(text);
	}

	@When("I click on Apply & Review Button")
	public void i_click_on_Apply_Review_Button() {
		MyApplicationsAndCoverageActions.clickApplyOrRenewButton();
	}

	@When("I click on Individual & Family Coverage link")
	public void i_click_on_Individual_Family_Coverage_link() {
		MyApplicationsAndCoverageActions.clickIndividualFamilyLink();
	}

	@When("I record application id on My Applications & Coverage Page")
	public void i_record_application_id_on_My_Applications_Coverage_Page() {
		MyApplicationsAndCoverageActions.recordApplicationID();
	}

	@When("I click on Log Out button on My Applications & Coverage Page")
	public void i_click_on_Log_Out_button_on_My_Applications_Coverage_Page() {
		MyApplicationsAndCoverageActions.clickLogOut();
	}

}
