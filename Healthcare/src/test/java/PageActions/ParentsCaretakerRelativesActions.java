package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class ParentsCaretakerRelativesActions {
	static WebDriver driver;

	public ParentsCaretakerRelativesActions(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.click(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']"));
	}

	public static void selectDependent(String text) {
		switch (text) {
		case "None of these people":
		case "Ninguna de estas personas es el cuidador principal de un niño":
			CUtil.waitForPageLoad();
			CUtil.click(By.xpath("//*[@value='none']"));
			break;

		default:
			break;
		}
	}

}
