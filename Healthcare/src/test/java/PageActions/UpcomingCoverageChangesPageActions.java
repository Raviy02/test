package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class UpcomingCoverageChangesPageActions {

	static WebDriver driver;
	static int count = 0;

	public UpcomingCoverageChangesPageActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.waitForVisibleElement(By.xpath("//*[text()='Save & continue']"));

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		CUtil.clickSelenium(By.xpath("//*[text()='Save & continue']"));
		if (!driver.getTitle().equals("Life changes") && count > 0) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			CUtil.clickSelenium(By.xpath("//*[text()='Save & continue']"));
		}
		count++;

	}

}
