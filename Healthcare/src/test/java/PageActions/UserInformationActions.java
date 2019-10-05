package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class UserInformationActions {
	static WebDriver driver;

	public UserInformationActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

	public static void selectNoSSN() {
		CUtil.waitForPageLoad();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CUtil.click(By.xpath("//*[@value='none']"));
	}

}
