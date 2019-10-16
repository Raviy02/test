package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageActions.IndividualApplicationEligibilityDeterminationActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class EligibilityDeterminationPageSteps {

	static WebDriver webDriver;
	private IndividualApplicationEligibilityDeterminationActions IndividualApplicationEligibilityDeterminationActions;

	public EligibilityDeterminationPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		IndividualApplicationEligibilityDeterminationActions = new IndividualApplicationEligibilityDeterminationActions(
				webDriver);
	}

	@Then("I should be on Individual Application - Eligibility determination Page")
	public void i_should_be_on_Individual_Application_Eligibility_determination_Page() {
		String lang = System.getProperty("language");
		String text = "";
		if (lang.equalsIgnoreCase("english")) {
			text = "Individual Application - Eligibility determination";
		} else if (lang.equalsIgnoreCase("spanish")) {
			text = "Solicitud Individual - Determinación de elegibilidad";
		}
		Assert.assertTrue(IndividualApplicationEligibilityDeterminationActions.verifyPageTitle(text));
		// IndividualApplicationEligibilityDeterminationActions
		// .verifyPageTitle("Individual Application - Eligibility determination");
	}

	@When("I click VIEW ELIGIBILITY NOTICE \\(PDF) button")
	public void i_click_VIEW_ELIGIBILITY_NOTICE_PDF_button() {
		IndividualApplicationEligibilityDeterminationActions.clickViewEligibility();
	}

	@Then("I should see Continue to enrollment button")
	public void i_should_see_Continue_to_enrollment_button() {
		Assert.assertTrue(IndividualApplicationEligibilityDeterminationActions.isContinueToEnrollmentButtonPresent());
	}

	@When("I click Continue to enrollment button")
	public void i_click_Continue_to_enrollment_button() {
		IndividualApplicationEligibilityDeterminationActions.clickContinueToEnrollmentButton();
	}

	@Then("I should see the Status as {string}")
	public void i_should_see_the_Status_as(String text) {
		boolean out = IndividualApplicationEligibilityDeterminationActions.isStatusDisplayed(text);
		if (!out) {
			IndividualApplicationEligibilityDeterminationActions.clickCancelAndGoBackToPlans();
			Assert.assertTrue(IndividualApplicationEligibilityDeterminationActions.isStatusDisplayed(text));
		}
	}

	@When("I should click on Start Button")
	public void i_should_click_on_Start_Button() {
		IndividualApplicationEligibilityDeterminationActions.clickStartButton();
	}

	@When("I select option as {string} for monthly premium")
	public void i_select_option_as_for_monthly_premium(String text) {
		IndividualApplicationEligibilityDeterminationActions.selectOption(text);
	}

	@When("I click Save button")
	public void i_click_Save_button() {
		IndividualApplicationEligibilityDeterminationActions.clickSaveButton();
	}

	@When("I select option as {string} for tobacco use")
	public void i_select_option_as_for_tobacco_use(String text) {
		IndividualApplicationEligibilityDeterminationActions.selectTobaccoUse(text);
	}

	@When("I click on Skip button")
	public void i_click_on_Skip_button() {
		IndividualApplicationEligibilityDeterminationActions.clickSkipButton();
	}

	@Then("I should see Help comparing plans modal")
	public void i_should_see_Help_comparing_plans_modal() {
		boolean out = IndividualApplicationEligibilityDeterminationActions.isModalDisplayed();
		if (!out) {
			IndividualApplicationEligibilityDeterminationActions.clickCancelAndGoBackToPlans();
			Assert.assertTrue(IndividualApplicationEligibilityDeterminationActions.isModalDisplayed());
		}
	}

	@When("I click on Close button")
	public void i_click_on_Close_button() {
		IndividualApplicationEligibilityDeterminationActions.clickCloseButton();
	}

	@When("I click on filter Plans button")
	public void i_click_on_filter_Plans_button() {
		IndividualApplicationEligibilityDeterminationActions.clickFilterPlansButton();
	}

	@When("I type minimum monthly premium as {string}")
	public void i_type_minimum_monthly_premium_as(String text) {
		IndividualApplicationEligibilityDeterminationActions.typeMinimumMonthlyPremium(text);
	}

	@When("I click on Apply filters button")
	public void i_click_on_Apply_filters_button() {
		IndividualApplicationEligibilityDeterminationActions.clickApplyFiltersButton();
	}

	@When("I click on Enroll button for First plan")
	public void i_click_on_Enroll_button_for_First_plan() {
		IndividualApplicationEligibilityDeterminationActions.clickEnrollButton();
	}

	@Then("I click on Enroll button for First plan on Compare plan")
	public void i_click_on_Enroll_button_for_First_plan_on_Compare_plan() {
		IndividualApplicationEligibilityDeterminationActions.clickEnrollButtonComparePlan();
	}

	@When("I click on Select this plan button")
	public void i_click_on_Select_this_plan_button() {
		IndividualApplicationEligibilityDeterminationActions.clickSelectThisPlanButton();
	}

	@When("I select option as {string} for dentail plan")
	public void i_select_option_as_for_dentail_plan(String text) {
		IndividualApplicationEligibilityDeterminationActions.selectDentalPlan(text);
	}

	@When("I click on Continue button")
	public void i_click_on_Continue_button() {
		IndividualApplicationEligibilityDeterminationActions.clickContinueButton();
	}

	@When("I Accept agreement for selected plan")
	public void i_Accept_agreement_for_selected_plan() {
		IndividualApplicationEligibilityDeterminationActions.acceptAgreementForSelectedPlan();
	}

	@When("I type Tax filer's signature \\(full name) as {string}")
	public void i_type_Tax_filer_s_signature_full_name_as(String text) {
		IndividualApplicationEligibilityDeterminationActions.typeFullName(text);
	}

	@When("I click on Change Groups button")
	public void i_click_on_Change_Groups_button() {
		IndividualApplicationEligibilityDeterminationActions.clickChangeGroupButton();
	}

	@When("I select {string} for Spouse")
	public void i_select_for_Spouse(String text) {
		IndividualApplicationEligibilityDeterminationActions.selectGroup(text);
	}

	@When("I click View Plans Button")
	public void i_click_View_Plans_Button() {
		IndividualApplicationEligibilityDeterminationActions.clickViewPlanButton();
	}

	@When("I choose Initial two plans to compare")
	public void i_choose_Initial_two_plans_to_compare() {
		IndividualApplicationEligibilityDeterminationActions.choosePlans();
	}

	@Then("I click Compare {int} Plans button")
	public void i_click_Compare_Plans_button(Integer int1) {
		IndividualApplicationEligibilityDeterminationActions.clicComparePlan();
	}

	@When("I select option as {string} for Select the level of care")
	public void i_select_option_as_for_Select_the_level_of_care(String text) {
		IndividualApplicationEligibilityDeterminationActions.selectLevelOfCare(text);
	}

	@When("I click on Next person button")
	public void i_click_on_Next_person_button() {
		IndividualApplicationEligibilityDeterminationActions.clickNextPersonButton();
	}

	@When("I click on Menu button")
	public void i_click_on_Menu_button() {
		IndividualApplicationEligibilityDeterminationActions.clickMenuButton();
	}

	@When("I click on My Applications & Coverage menu option")
	public void i_click_on_My_Applications_Coverage_menu_option() {
		IndividualApplicationEligibilityDeterminationActions.clickMyApplicationAndCoverage();
	}

}
