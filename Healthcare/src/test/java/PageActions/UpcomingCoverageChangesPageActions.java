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

	public static boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.waitForVisibleElement(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']"));

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}
		CUtil.clickSelenium(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']"));
		if (!driver.getTitle().equals("Life changes") && count > 0) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			CUtil.clickSelenium(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']"));
		}
		count++;

	}

}
