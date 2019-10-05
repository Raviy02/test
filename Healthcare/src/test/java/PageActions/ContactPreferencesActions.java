package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class ContactPreferencesActions {

	static WebDriver driver;

	public ContactPreferencesActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.waitForPageLoad();
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

	public static void selectPreference(String text) {
		switch (text) {
		case "Paper":
			CUtil.waitForPageLoad();
			CUtil.click(By.xpath("//*[@value='PAPER']"));
			break;

		default:
			break;
		}
	}

}
