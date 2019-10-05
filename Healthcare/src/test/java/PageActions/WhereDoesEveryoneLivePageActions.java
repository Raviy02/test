package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class WhereDoesEveryoneLivePageActions {
	static WebDriver driver;

	public WhereDoesEveryoneLivePageActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.waitForPageLoad();
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

	public void selectOption(String text) {
		switch (text) {
		case "Yes":
			CUtil.click(By.xpath("//*[@name='usePrimary'][@value='true']"));
			break;

		default:
			break;
		}

	}
}
