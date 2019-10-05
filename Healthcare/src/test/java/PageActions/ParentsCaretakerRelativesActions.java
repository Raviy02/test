package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class ParentsCaretakerRelativesActions {
	static WebDriver driver;

	public ParentsCaretakerRelativesActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

	public static void selectDependent(String text) {
		switch (text) {
		case "None of these people":
			CUtil.waitForPageLoad();
			CUtil.click(By.xpath("//*[@value='none']"));
			break;

		default:
			break;
		}
	}

}
