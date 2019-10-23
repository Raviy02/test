package PageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonUtils.CUtil;

public class IndividualApplicationEligibilityDeterminationActions {

	static WebDriver driver;

	public IndividualApplicationEligibilityDeterminationActions(WebDriver driver) {
		this.driver = driver;
	}

	public boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public void clickViewEligibility() {
		CUtil.waitForPageLoad();
		CUtil.click(By.xpath("//button[@id='viewEligibility']"));

	}

	public boolean isContinueToEnrollmentButtonPresent() {
		CUtil.waitForElementDisappear(By.xpath("//button[@id='proceedToEnrollBtn'][@disabled]"));
		return CUtil.isDisplayed(By.xpath("//button[@id='proceedToEnrollBtn']"));
	}

	public void clickContinueToEnrollmentButton() {
		CUtil.click(By.xpath("//button[@id='proceedToEnrollBtn']"));
		// System.out.println(driver.getCurrentUrl());
		// String url =
		// "https://:PCTest@2020@test3.healthcare.gov/marketplace/auth/enroll/consumers/?a=2074178&cache=true&t=DE";
		// System.out.println(url);
		// driver.navigate().to(url);
	}

	public boolean isStatusDisplayed(String text) {
		boolean flag = false;
		char[] arr = text.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '\'') {
				flag = true;
			}
		}
		if (flag) {
			text = "\"" + text + "\"";
		} else {
			text = "\'" + text + "\'";
		}
		CUtil.waitForElement(By.xpath("//*[text()=" + text + "]"));
		return CUtil.isDisplayed(By.xpath("//*[text()=" + text + "]"));
	}

	public void clickStartButton() {
		CUtil.click(By.xpath("//a[@class='ds-c-button ds-c-button--primary']"));
	}

	public void clickSaveButton() {
		CUtil.click(By.xpath("//button[contains(@class,'ds-c-button--success')]"));

	}

	public void selectOption(String text) {
		switch (text) {
		case "TODO el crédito fiscal cada mes.":
		case "ALL of the tax credit each month.":
			CUtil.click(By.xpath("//input[@value='ALL']"));
			break;

		default:
			break;
		}
	}

	public void selectTobaccoUse(String text) {
		switch (text) {
		case "No":
			CUtil.click(By.xpath("//input[@value='false']"));
			break;
		case "None":
			CUtil.click(By.xpath("//input[@value='NONE']"));
			break;

		default:
			break;
		}
	}

	public void clickSkipButton() {
		CUtil.click(By.xpath("//button[@class='ds-c-button ds-c-button--secondary ds-u-margin-top--5']"));
	}

	public boolean isModalDisplayed() {
		try {
			CUtil.waitForElement(By.xpath("//div[@id='react-aria-modal-dialog']"));
		} catch (Exception e) {
			return false;
		}
		return CUtil.isDisplayed(By.xpath("//div[@id='react-aria-modal-dialog']"));
	}

	public void clickCloseButton() {
		CUtil.click(By.xpath("//button[@aria-label='Close modal dialog']"));

	}

	public void clickFilterPlansButton() {
		CUtil.click(By.xpath(
				"//button[@class='ds-c-button ds-c-button--primary ds-u-margin-right--2 ds-u-margin-bottom--1 ds-u-lg-margin-bottom--0']"));
	}

	public void typeMinimumMonthlyPremium(String text) {
		CUtil.type(By.xpath("//input[@name='premium-start']"), text);
		CUtil.type(By.xpath("//input[@name='premium-start']"), Keys.TAB);
	}

	public void clickApplyFiltersButton() {
		CUtil.waitForVisibleElement(By.xpath(
				"//button[@class='ds-c-button ds-c-button--secondary ds-c-button--small pet-c-range-field__button']"));
		CUtil.click(By.xpath(
				"//button[@class='ds-c-button ds-c-button--secondary ds-c-button--small pet-c-range-field__button']"));
		CUtil.waitForVisibleElement(By.xpath("//*[@id='premium-filter-tag']"));
		CUtil.click(By.xpath("//button[@aria-label='apply_selected_filters']"));
	}

	public void clickEnrollButton() {
		CUtil.waitForVisibleElement(
				By.xpath("//a[@class='ds-c-button ds-c-button--primary pet-c-plan-card__action-button']"));
		CUtil.click(By.xpath("//a[@class='ds-c-button ds-c-button--primary pet-c-plan-card__action-button']"));
	}

	public void clickSelectThisPlanButton() {
		CUtil.click(By.xpath("//button[@class='ds-c-button ds-c-button--success ds-l-col--12 ds-l-sm-col--auto']"));
	}

	public void selectDentalPlan(String text) {

		switch (text) {
		case "No, termine la inscripción al plan de salud.":
		case "No, complete health plan enrollment.":
			CUtil.click(By.xpath("//input[@value='no']"));
			break;

		default:
			break;
		}

	}

	public void clickContinueButton() {
		CUtil.click(By.xpath("//button[contains(@class,'continue')]"));
	}

	public void acceptAgreementForSelectedPlan() {
		CUtil.click(By.xpath("//input[@value='agree']"));
	}

	public void typeFullName(String text) {
		CUtil.type(By.xpath("//input[@name='signature']"), text);
	}

	public void clickChangeGroupButton() {
		CUtil.click(By.xpath("//button[text()='Change Groups']"));
	}

	public void selectGroup(String option) {
		CUtil.waitForVisibleElement(By.xpath("//*[contains(@name,'select-enrollment-group')]"));
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(@name,'select-enrollment-group')]"));
		CUtil.selectDropdown(list.get(list.size() - 1), option);

	}

	public void clickViewPlanButton() {
		CUtil.waitForVisibleElement(By.xpath("//button[text()='View Plans']"));
		CUtil.click(By.xpath("//button[text()='View Plans']"));
	}

	public void choosePlans() {
		List<WebElement> list = driver.findElements(
				By.xpath("//div[@class='ds-u-text-align--right']//button[contains(@class,'check-button')]"));
		CUtil.click(list.get(0));
		CUtil.click(list.get(1));

	}

	public void clicComparePlan() {
		CUtil.waitForVisibleElement(By.xpath("//button[text()='Compare 2 plans']"));
		CUtil.click(By.xpath("//button[text()='Compare 2 plans']"));
	}

	public void clickEnrollButtonComparePlan() {
		CUtil.click(By.xpath("//*[contains(@class,'qa-details')]"));
	}

	public void selectLevelOfCare(String text) {
		switch (text) {
		case "Expect low use":
			CUtil.click(By.xpath("//input[@value='Low']"));
			break;

		default:
			break;
		}

	}

	public void clickNextPersonButton() {
		CUtil.click(By.xpath("//*[text()='Next person']"));

	}

	public void clickMenuButton() {
		CUtil.click(By.xpath("//button[text()='Menu']"));
	}

	public void clickMyApplicationAndCoverage() {
		CUtil.click(By.xpath("//*[text()='My Applications & Coverage']"));
	}

	public void clickCancelAndGoBackToPlans() {
		CUtil.click(By.xpath("//*[text()='Cancel and go back to plans']"));
	}

	public void clickContinueButtonAgreementPage() {
		CUtil.click(By.xpath("//button[@class='ds-c-button ds-c-button--primary']"));
	}

}
