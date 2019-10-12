package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class ApplicationHelpActions {
	static WebDriver driver;

	public ApplicationHelpActions(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.waitForPageLoad();
		CUtil.click(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']"));
	}

	public static void selectOption(String text) {
		switch (text) {
		case "No":
			CUtil.waitForPageLoad();
			CUtil.click(By.xpath("//*[@value='false']"));
			break;

		default:
			break;
		}

	}

}
