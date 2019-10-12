package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class MailingAddressActions {

	static WebDriver driver;

	public MailingAddressActions(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.waitForPageLoad();
		CUtil.click(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']"));
	}

	public static void acceptMailingAddress() {
		CUtil.click(By.xpath("//*[@value='true']"));
	}

}
