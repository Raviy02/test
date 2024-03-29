package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class IdentityVerifiedActions {

	static WebDriver driver;

	public IdentityVerifiedActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickContinueButton() {
		CUtil.click(By.xpath("//button[contains(@class,'checkForCCRApplication')]"));
	}

}
