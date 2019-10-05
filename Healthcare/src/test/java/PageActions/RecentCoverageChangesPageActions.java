package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class RecentCoverageChangesPageActions {

	static WebDriver driver;

	public RecentCoverageChangesPageActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		// CUtil.waitForPageLoad();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		CUtil.actionClickNew(By.xpath("//*[text()='Save & continue']"));
	}

}
