package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class MailingAddressActions {

	static WebDriver driver;

	public MailingAddressActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.waitForPageLoad();
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

	public static void acceptMailingAddress() {
		CUtil.click(By.xpath("//*[@value='true']"));
	}

}
