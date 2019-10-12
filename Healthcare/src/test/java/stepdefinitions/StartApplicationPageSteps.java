package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.StartApplicationActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class StartApplicationPageSteps {

	static WebDriver webDriver;
	private StartApplicationActions StartApplicationActions;

	public StartApplicationPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		StartApplicationActions = new StartApplicationActions(webDriver);
	}

	@Then("I should be on Start Application page")
	public void i_should_be_on_Start_Application_page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Start Application";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Empezar Solicitud";
		}
		Assert.assertTrue(StartApplicationActions.verifyPageTitle(text));
		// StartApplicationActions.verifyPageTitle("Start Application");
	}

	@When("I click on Next button on Start Application page")
	public void i_click_on_Next_button_on_Start_Application_page() {
		StartApplicationActions.clickNextButton();
	}

	@When("I accpect Terms & Agreement on Start Application page")
	public void i_accpect_Terms_Agreement_on_Start_Application_page() {
		StartApplicationActions.acceptTerms();
	}

	@When("I click Take Me To Application Button")
	public void i_click_Take_Me_To_Application_Button() {
		StartApplicationActions.clickTakeMeToApplicationButton();
	}

	@When("I select Maritial Status as {string}")
	public void i_select_Maritial_Status_as(String text) {
		StartApplicationActions.selectMaritialStatue(text);
	}

	@When("I select TaxDependents as {string}")
	public void i_select_TaxDependents_as(String text) {
		StartApplicationActions.selectTaxDependents(text);
	}

	@When("I select Income as {string}")
	public void i_select_Income_as(String text) {
		StartApplicationActions.selectIncome(text);
	}

	@When("I select Help for Coverage as {string}")
	public void i_select_Help_for_Coverage_as(String text) {
		StartApplicationActions.selectHelpforCoverage(text);
	}

	@When("I click Continue Button on Start Application page")
	public void i_click_Continue_Button_on_Start_Application_page() {
		StartApplicationActions.clickContinueButton();
	}

	@When("I select Apply Coverage for {string}")
	public void i_select_Apply_Coverage_for(String text) {
		StartApplicationActions.selectApplicant(text);
	}

	@When("I select Update a person's information or add a new person option")
	public void i_select_Update_a_person_s_information_or_add_a_new_person_option() {
		StartApplicationActions.selectUpdatePersonInformation();
	}

	@When("I click Update my application button")
	public void i_click_Update_my_application_button() {
		StartApplicationActions.clickUpdateMyApplicationButton();
	}

}
