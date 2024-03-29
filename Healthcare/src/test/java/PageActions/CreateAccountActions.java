package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class CreateAccountActions {

	static WebDriver driver;
	static String url = "http://www.yopmail.com";

	public CreateAccountActions(WebDriver driver) {
		this.driver = driver;
	}

	public void selectState(String text) {
		CUtil.waitForElement(By.xpath("//*[contains(@id,'homeState')]"));
		CUtil.selectDropdown(By.xpath("//*[contains(@id,'homeState')]"), text);
	}

	public void enterFirstName(String text) {
		CUtil.type(By.xpath("//*[contains(@id,'First-name')]"), text);
	}

	public void enterLastName(String text) {
		CUtil.type(By.xpath("//*[contains(@id,'Last-name')]"), text);
	}

	public void enterEmailId(String text) {
		CUtil.type(By.xpath("//*[contains(@id,'Email-address')]"), text);
	}

	public void enterPassword(String text) {
		CUtil.type(By.xpath("//*[contains(@id,'Password')]"), text);
	}

	public void reEnterPassword(String text) {
		CUtil.type(By.xpath("//*[contains(@id,'Retype-password')]"), text);
	}

	public void pickFirstQuestion(String text) {
		CUtil.selectDropdown(By.xpath("//*[contains(@id,'securityQuestions[0]')]"), text);
	}

	public void enterFirstAnswer(String text) {
		CUtil.type(By.xpath("//*[contains(@name,'securityAnswers[0]')]"), text);
	}

	public void pickSecondQuestion(String text) {
		CUtil.selectDropdown(By.xpath("//*[contains(@id,'securityQuestions[1]')]"), text);
	}

	public void enterSecondAnswer(String text) {
		CUtil.type(By.xpath("//*[contains(@name,'securityAnswers[1]')]"), text);
	}

	public void pickThirdQuestion(String text) {
		CUtil.selectDropdown(By.xpath("//*[contains(@id,'securityQuestions[2]')]"), text);
	}

	public void enterThirdAnswer(String text) {
		CUtil.type(By.xpath("//*[contains(@name,'securityAnswers[2]')]"), text);
	}

	public void acceptAgreement() {
		CUtil.click(By.xpath("//*[contains(@name,'privacy')]"));
	}

	public void clickCreateAccount() {
		CUtil.clickSelenium(By.xpath("//*[contains(text(),'Create account')]"));
		CUtil.waitForElement(By.xpath("//div[@class='click-cover']"));
	}

	public boolean isAtThisPage() {
		return CUtil.isDisplayed(By.xpath("//h1[text()='Create an account']"));
	}

}
