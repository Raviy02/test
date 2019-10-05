package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageActions.Stub;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import runner.SharedDriver;

public class ESDLoginPageSteps {

	private Stub Stub;
	private WebDriver webDriver;

	public ESDLoginPageSteps(SharedDriver webDriver) {
		this.webDriver = webDriver;
		Stub = new Stub(webDriver);
	}

	@Given("I login to ESD")
	public void i_login_to_ESD() {
		Stub.initESD();
	}

	@Given("I am on CCR landing page")
	public void i_am_on_CCR_landing_page() {
		Stub.initCCR();
	}

	@When("I type SAML Response")
	public void i_type_SAML_Response() {
		Stub.typeSAML();
	}

	@When("I click on Submit button")
	public void i_click_on_Submit_button() {
		Stub.clickSubmit();
	}

}
