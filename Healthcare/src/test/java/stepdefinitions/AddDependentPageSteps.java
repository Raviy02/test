package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.AddDependentPageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class AddDependentPageSteps {
	static WebDriver webDriver;
	private AddDependentPageActions AddDependentPageActions;

	public AddDependentPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		AddDependentPageActions = new AddDependentPageActions(webDriver);
	}

	@Then("I should be on Add a person who needs health coverage Page")
	public void i_should_be_on_Add_a_person_who_needs_health_coverage_Page() {
		AddDependentPageActions.verifyPageTitle("Add a person who needs health coverage");
	}

	@When("I type First Name as {string} on Add Dependent Page")
	public void i_type_First_Name_as_on_Add_Dependent_Page(String text) {
		AddDependentPageActions.typeFirstName(text);
	}

	@When("I type Last Name as {string} on Add Dependent Page")
	public void i_type_Last_Name_as_on_Add_Dependent_Page(String text) {
		AddDependentPageActions.typeLastName(text);
	}

	@When("I type month as {string} on Add Dependent Page")
	public void i_type_month_as_on_Add_Dependent_Page(String text) {
		AddDependentPageActions.typeMonth(text);
	}

	@When("I type day as {string} on Add Dependent Page")
	public void i_type_day_as_on_Add_Dependent_Page(String text) {
		AddDependentPageActions.typeDay(text);
	}

	@When("I type year as {string} on Add Dependent Page")
	public void i_type_year_as_on_Add_Dependent_Page(String text) {
		AddDependentPageActions.typeYear(text);
	}

	@When("I select gender as {string} on Add Dependent Page")
	public void i_select_gender_as_on_Add_Dependent_Page(String text) {
		AddDependentPageActions.selectGender(text);
	}

	@When("I select option as {string} for relationship drop down on Add Dependent Page")
	public void i_select_option_as_for_relationship_drop_down_on_Add_Dependent_Page(String text) {
		AddDependentPageActions.selectRelationship(text);
	}

	@When("I click Save button on Add Dependent Page")
	public void i_click_Save_button_on_Add_Dependent_Page() {
		AddDependentPageActions.clickSave();
	}

	@When("I select option as {string} for relationship with spouse drop down on Add Dependent Page")
	public void i_select_option_as_for_relationship_with_spouse_drop_down_on_Add_Dependent_Page(String text) {
		AddDependentPageActions.selectRelationshipWithSpouse(text);
	}

}
