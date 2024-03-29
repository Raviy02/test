package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class PreferredLanguageActions {
	static WebDriver driver;

	public PreferredLanguageActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.waitForPageLoad();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

	public void selectPreferredWrittenLanguage(String text) {
		CUtil.selectDropdown(By.xpath("//*[@name='writtenLanguageType']"), text);
	}

	public void selectPreferredSpokenLanguage(String text) {
		CUtil.selectDropdown(By.xpath("//*[@name='spokenLanguageType']"), text);
	}
}
