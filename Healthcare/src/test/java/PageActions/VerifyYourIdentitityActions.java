package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class VerifyYourIdentitityActions {
	static WebDriver driver;

	public VerifyYourIdentitityActions(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public static void clickGetStarted() {
		CUtil.click(By.xpath("//button[contains(@class,'goToIDProofContactInfo')]"));
	}

}
