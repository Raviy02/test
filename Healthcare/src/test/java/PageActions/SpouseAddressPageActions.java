package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class SpouseAddressPageActions {
	static WebDriver driver;

	public SpouseAddressPageActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

	public void selectAddress() {
		CUtil.click(By.xpath("//input[@value='0']"));

	}
}
