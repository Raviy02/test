package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class SignSubmitActions {
	static WebDriver driver;

	public SignSubmitActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CUtil.waitForPageLoad();
		CUtil.javaScrollIntoView(driver.findElement(By.xpath("//button[text()='Sign & submit']")));
		CUtil.click(By.xpath("//button[text()='Sign & submit']"));
	}

	public static void acceptAgreement() {
		CUtil.click(By.xpath("//*[@value='true']"));
	}

	public static void enterName(String text) {
		CUtil.type(By.xpath("//*[@name='applicationSignatureText']"), text);
	}

}
