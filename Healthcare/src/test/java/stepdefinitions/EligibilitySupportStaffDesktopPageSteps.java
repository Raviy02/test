package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;
import PageActions.EligibilitySupportStaffDesktopPageAction;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class EligibilitySupportStaffDesktopPageSteps {

	private EligibilitySupportStaffDesktopPageAction EligibilitySupportStaffDesktopPageAction;
	private WebDriver webDriver;

	public EligibilitySupportStaffDesktopPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		EligibilitySupportStaffDesktopPageAction = new EligibilitySupportStaffDesktopPageAction(webDriver);
	}

	@Then("I should be on Eligibility Support Staff Desktop Page")
	public void i_should_be_on_Eligibility_Support_Staff_Desktop_Page() {
		EligibilitySupportStaffDesktopPageAction.verifyPageTitle("Eligibility Support Staff Desktop");
	}

	@When("I type Birthdate as {string} on Eligibility Support Staff Desktop Page")
	public void i_type_Birthdate_as_on_Eligibility_Support_Staff_Desktop_Page(String text) {
		EligibilitySupportStaffDesktopPageAction.typeDOB(text);
	}

	@When("I type First Name as {string} on Eligibility Support Staff Desktop Page")
	public void i_type_First_Name_as_on_Eligibility_Support_Staff_Desktop_Page(String text) {
		EligibilitySupportStaffDesktopPageAction.typeFirstName(text);
	}

	@When("I type Last Name as {string} on Eligibility Support Staff Desktop Page")
	public void i_type_Last_Name_as_on_Eligibility_Support_Staff_Desktop_Page(String text) {
		EligibilitySupportStaffDesktopPageAction.typeLastName(text);
	}

	@When("I click Search button on Eligibility Support Staff Desktop Page")
	public void i_click_Search_button_on_Eligibility_Support_Staff_Desktop_Page() {
		EligibilitySupportStaffDesktopPageAction.clickSearchButton();
	}

	@When("I click on First result in table")
	public void i_click_on_First_result_in_table() {
		EligibilitySupportStaffDesktopPageAction.clickFirstResult();
	}

	@When("I click on Notices tab")
	public void i_click_on_Notices_tab() {
		EligibilitySupportStaffDesktopPageAction.openNoticesTab();
	}

	@When("I click on Verification Issues tab")
	public void i_click_on_Verification_Issues_tab() {
		EligibilitySupportStaffDesktopPageAction.verificationIssuesTab();
	}

	@When("I click on Create Notice button")
	public void i_click_on_Create_Notice_button() {
		EligibilitySupportStaffDesktopPageAction.clickCreateNoticeButton();
	}

	@Then("I should be on Custom Notice modal")
	public void i_should_be_on_Custom_Notice_modal() {
		Assert.assertTrue(EligibilitySupportStaffDesktopPageAction.isCutomeNoticeModalDisplayed());
	}

	@When("I type Notice Name as {string} on Custom Notice modal")
	public void i_type_Notice_Name_as_on_Custom_Notice_modal(String text) {
		EligibilitySupportStaffDesktopPageAction.typeNoticeName(text);
	}

	@When("I type Notice content as {string}")
	public void i_type_Notice_content_as(String text) {
		EligibilitySupportStaffDesktopPageAction.typeNoticeContent(text);
	}

	@When("I select option as {string} for Add Barcode Page to Notice dropdown")
	public void i_select_option_as_for_Add_Barcode_Page_to_Notice_dropdown(String text) {
		EligibilitySupportStaffDesktopPageAction.selectAddBarcode(text);
	}

	@When("I type Comment as {string}")
	public void i_type_Comment_as(String text) {
		EligibilitySupportStaffDesktopPageAction.typeComment(text);
	}

	@When("I click on Send button")
	public void i_click_on_Send_button() {
		EligibilitySupportStaffDesktopPageAction.clickSendButton();
	}

	@When("I click on Individual Verification Issue accordion")
	public void i_click_on_Individual_Verification_Issue_accordion() {
		EligibilitySupportStaffDesktopPageAction.openIndividual_Verification_issue_accordion();
	}

	@When("I click on First entry with Verification status as {string}")
	public void i_click_on_First_entry_with_Verification_status_as(String text) {
		EligibilitySupportStaffDesktopPageAction.openFirstNotice(text);
	}

	@When("I click on Verification Issue accordion")
	public void i_click_on_Verification_Issue_accordion() {
		EligibilitySupportStaffDesktopPageAction.openVerification_issue_accordion();
	}

	@When("I click on Resolve Verification Issue button")
	public void i_clic_on_Resolve_Verification_Issue_button() {
		EligibilitySupportStaffDesktopPageAction.click_Resolve_Verification_Issue_Button();
	}

	@When("I click on Home button")
	public void i_click_on_Home_button() {
		EligibilitySupportStaffDesktopPageAction.clickHomeButton();
	}

	@When("I type Application ID on Eligibility Support Staff Desktop Page")
	public void i_type_Application_ID_on_Eligibility_Support_Staff_Desktop_Page() {
		EligibilitySupportStaffDesktopPageAction.typeApplicationID(CUtil.applicationID);
	}

	@When("I select Tenant ID as {string} on Eligibility Support Staff Desktop Page")
	public void i_select_Tenant_ID_as_on_Eligibility_Support_Staff_Desktop_Page(String text) {
		EligibilitySupportStaffDesktopPageAction.selectTenantID(text);
	}

	@When("I click Search by application id button on Eligibility Support Staff Desktop Page")
	public void i_click_Search_by_application_id_button_on_Eligibility_Support_Staff_Desktop_Page() {
		EligibilitySupportStaffDesktopPageAction.clickSearchByApplicationID();
	}

	@Then("I should see Verification Issue Status as {string}")
	public void i_should_see_Verification_Issue_Status_as(String text) {
		Assert.assertTrue(EligibilitySupportStaffDesktopPageAction.isStatusUpdated(text));
	}

}
