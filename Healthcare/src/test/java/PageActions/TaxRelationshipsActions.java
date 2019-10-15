package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class TaxRelationshipsActions {
	static WebDriver driver;

	public TaxRelationshipsActions(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.waitForPageLoad();
		CUtil.click(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']"));
	}

	public static void answerFirstQuestion(String text) {
		switch (text) {
		case "Yes":
		case "Sí":
			CUtil.waitForPageLoad();
			CUtil.click(By.xpath("//*[contains(@name,'filing')][@value='true']"));
			break;

		default:
			break;
		}

	}

	public static void answerSecondQuestion(String text) {
		switch (text) {
		case "No":
			CUtil.waitForPageLoad();
			CUtil.click(By.xpath("//*[@name='claimsDependent'][@value='false']"));
			break;
		case "Yes":
			CUtil.waitForPageLoad();
			CUtil.click(By.xpath("//*[@name='claimsDependent'][@value='true']"));
			break;

		default:
			break;
		}
	}

	public static void answerThirdQuestion(String text) {
		switch (text) {
		case "No":
			CUtil.waitForPageLoad();
			CUtil.click(By.xpath("//*[@name='claimedAsADependent'][@value='false']"));
			break;

		case "Baby":
			CUtil.waitForPageLoad();
			CUtil.click(By.xpath("//*[@name='dependents']"));
			break;

		default:
			break;
		}
	}

	public void isQuestionPresent(String text) {
		switch (text) {
		case "Will Susan file a 2019 federal income tax return?":
			CUtil.isDisplayed(By.xpath("//*[text()='Will Susan file a 2019 federal income tax return?']"));
			break;
		case "Will Susan claim any dependents on their 2019 federal tax return?":
			CUtil.isDisplayed(
					By.xpath("//*[text()='Will Susan claim any dependents on their 2019 federal tax return?']"));
			break;
		case "Will someone else claim Susan as a dependent on their 2019 federal tax return?":
			CUtil.isDisplayed(By.xpath(
					"//*[text()='Will someone else claim Susan as a dependent on their 2019 federal tax return?']"));
			break;
		case "Will Susan and Spouse claim any dependents on their 2019 federal tax return?":
			CUtil.isDisplayed(By
					.xpath("//*[text()='Will Susan and Spouse claim any dependents on their 2019 federal tax return?"));
			break;
		case "Who will Susan and Spouse claim as a dependent on their 2019 federal tax return?":
			CUtil.isDisplayed(By.xpath(
					"//*[text()='Who will Susan and Spouse claim as a dependent on their 2019 federal tax return?']"));
			break;
		case "Will Susan file a 2019 joint federal income tax return with Spouse?":
			CUtil.isDisplayed(
					By.xpath("//*[text()='Will Susan file a 2019 joint federal income tax return with Spouse?']"));
			break;
		case "¿Susan presentará una declaración federal de impuestos de 2019?":
			CUtil.isDisplayed(
					By.xpath("//*[text()='¿Susan presentará una declaración federal de impuestos de 2019?']"));
			break;
		case "¿Susan reclamará algún dependiente en su declaración federal de impuestos para 2019?":
			CUtil.isDisplayed(By.xpath(
					"//*[text()='¿Susan reclamará algún dependiente en su declaración federal de impuestos para 2019?']"));
			break;
		case "¿Alguien más reclamará a Susan como dependiente en su declaración federal de impuestos de 2019?":
			CUtil.isDisplayed(By.xpath(
					"//*[text()='¿Alguien más reclamará a Susan como dependiente en su declaración federal de impuestos de 2019?']"));
			break;

		default:
			break;
		}

	}

}
