package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class ReadAgreeStatementsActions {
	static WebDriver driver;

	public ReadAgreeStatementsActions(WebDriver driver) {
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
		CUtil.javaScrollIntoView(driver.findElement(By.xpath("//*[text()='Save & continue']")));
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

	public static void acceptAgreement() {
		CUtil.selectMultipleAnswersNormal(By.xpath("//*[@value='true']"));
	}

}
