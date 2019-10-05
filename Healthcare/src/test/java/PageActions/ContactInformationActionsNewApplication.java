package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class ContactInformationActionsNewApplication {

	static WebDriver driver;

	public ContactInformationActionsNewApplication(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.waitForPageLoad();
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

	public static void enterPhoneNumber(String text) {
		CUtil.type(By.xpath("//*[@name='primaryPhoneNumber']"), text);
	}

	public static void selectPhoneType(String text) {
		switch (text) {
		case "Home":
			CUtil.click(By.xpath("//*[@value='HOME']"));
			break;

		default:
			break;
		}
	}

}
