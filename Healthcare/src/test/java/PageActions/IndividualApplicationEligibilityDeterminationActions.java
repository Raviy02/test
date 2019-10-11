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

	public void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
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
		// CUtil.waitForElement(By.xpath("//*[text()=" + text + "]"));
		return CUtil.isDisplayed(By.xpath("//*[text()=" + text + "]"));
	}

	public void clickStartButton() {
		CUtil.click(By.xpath("//a[text()='Start']"));
	}

	public void clickSaveButton() {
		CUtil.click(By.xpath("//*[text()='Save & Continue']"));
	}

	public void selectOption(String text) {
		switch (text) {
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
		CUtil.click(By.xpath("//*[text()='Skip']"));
	}

	public boolean isModalDisplayed() {
		try {
			CUtil.waitForElement(By.xpath("//*[text()='Help comparing plans']"));
		} catch (Exception e) {
			return false;
		}
		return CUtil.isDisplayed(By.xpath("//*[text()='Help comparing plans']"));
	}

	public void clickCloseButton() {
		CUtil.click(By.xpath("//*[text()='Close']"));

	}

	public void clickFilterPlansButton() {
		CUtil.click(By.xpath("//*[text()='Filter Plans']"));
	}

	public void typeMinimumMonthlyPremium(String text) {
		CUtil.type(By.xpath("//input[@name='premium-start']"), text);
		CUtil.type(By.xpath("//input[@name='premium-start']"), Keys.TAB);
	}

	public void clickApplyFiltersButton() {
		CUtil.waitForVisibleElement(By.xpath("//button[contains(@class,'pet-c-range-field__button')]"));
		CUtil.click(By.xpath("//button[contains(@class,'pet-c-range-field__button')]"));
	}

	public void clickEnrollButton() {
		// CUtil.waitForVisibleElement(By.xpath("//a[text()='Enroll']"));
		CUtil.click(By.xpath("//a[text()='Enroll']"));
	}

	public void clickSelectThisPlanButton() {
		CUtil.click(By.xpath("//*[text()='Select this plan']"));
	}

	public void selectDentalPlan(String text) {

		switch (text) {
		case "No, complete health plan enrollment.":
			CUtil.click(By.xpath("//input[@value='no']"));
			break;

		default:
			break;
		}

	}

	public void clickContinueButton() {
		CUtil.click(By.xpath("//*[text()='Continue']"));
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

}
