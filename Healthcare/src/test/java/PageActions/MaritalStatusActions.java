package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class MaritalStatusActions {
	static WebDriver driver;

	public MaritalStatusActions(WebDriver driver) {
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

	public static void selectMaritialStatue(String text) {
		switch (text) {
		case "single":
			CUtil.waitForPageLoad();
			CUtil.click(By.xpath("//*[@value='UNMARRIED']"));
			break;
		case "Married to":
			CUtil.waitForPageLoad();
			CUtil.click(By.xpath("//*[@value='MARRIED']"));
			CUtil.selectDropdown(By.xpath("//*[contains(@name,'marriedTo')]"), "Spouse");
			break;

		default:
			break;
		}
	}

}
