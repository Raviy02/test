package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class ReviewYourApplicationActions {
	static WebDriver driver;

	public ReviewYourApplicationActions(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CUtil.waitForPageLoad();
		CUtil.javaScrollIntoView(
				driver.findElement(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']")));
		CUtil.actionClick(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']"));
	}

	public static void acceptIncome() {

		CUtil.click(By.xpath("//*[@value='true']"));
	}
}
