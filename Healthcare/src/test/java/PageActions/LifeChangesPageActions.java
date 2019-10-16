package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class LifeChangesPageActions {

	static WebDriver driver;

	public LifeChangesPageActions(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		CUtil.click(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']"));
	}

	public void selectOptions(String text) {
		switch (text) {
		case "Was released from incarceration (detention or jail)":
		case "Fue liberado de su encarcelamiento (detención o cárcel)":
			CUtil.waitForPageLoad();
			CUtil.click(By.xpath("//input[@value='releasedFromJailOrPrison']"));
			break;

		default:
			break;
		}

	}

}
