package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class StartApplicationActions {
	static WebDriver driver;

	public StartApplicationActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickNextButton() {
		CUtil.click(By.xpath("//*[@id='indvLink']"));
	}

	public static void acceptTerms() {
		CUtil.waitForPageLoad();
		CUtil.waitForVisibleElement(By.xpath("//*[@type='checkbox']"));
		CUtil.selectMultipleAnswers(By.xpath("//*[@type='checkbox']"));
	}

	public static void clickTakeMeToApplicationButton() {
		CUtil.click(By.xpath("//*[text()='Take me to the application']"));
	}

	public static void selectMaritialStatue(String text) {
		switch (text) {
		case "single":
			CUtil.click(By.xpath("//input[@name='isMarried'][@value='false']"));
			break;
		case "married":
			CUtil.click(By.xpath("//input[@name='isMarried'][@value='true']"));
			break;
		default:
			break;
		}

	}

	public static void selectTaxDependents(String text) {
		CUtil.selectDropdown(By.xpath("//*[@name='tendon:numDependents']"), text);
	}

	public static void selectIncome(String text) {
		switch (text) {
		case "Below51000":
			CUtil.click(By.xpath("//*[@id='income-0']"));
			break;
		case "MoreThan69000":
		case "MoreThan87000":
			CUtil.click(By.xpath(
					"//div[@class='question']//a[contains(@class,'prefill-false')][not(@id='single-married-0')]"));
			break;

		default:
			break;
		}
	}

	public static void selectHelpforCoverage(String text) {
		switch (text) {
		case "Yes":
			CUtil.click(By.xpath("//*[@id='fa-choice-0']"));
			break;

		default:
			break;
		}

	}

	public static void clickContinueButton() {
		CUtil.click(By.xpath("//*[text()='Continue']"));
	}

	public void selectApplicant(String text) {
		switch (text) {
		case "Me":
			CUtil.click(By.xpath("//a[contains(@class,'me-applying')]"));
			break;
		case "My Spouse":
			CUtil.click(By.xpath("//a[contains(@class,'spouse-applying')]"));
			break;
		case "My Dependent":
			CUtil.click(By.xpath("//a[contains(@class,'dependent-applying')]"));
			break;

		default:
			break;
		}

	}

	public void selectUpdatePersonInformation() {
		CUtil.click(By.xpath("//*[@name='addOrEditPerson']"));
	}

	public void clickUpdateMyApplicationButton() {
		CUtil.click(By.xpath("//*[text()='Update my application']"));
	}
}
