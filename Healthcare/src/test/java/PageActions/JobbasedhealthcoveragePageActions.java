package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class JobbasedhealthcoveragePageActions {
	static WebDriver driver;

	public JobbasedhealthcoveragePageActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

	public void selecctOption(String text) {
		switch (text) {
		case "Yes":
			CUtil.click(By.xpath("//input[@value='true']"));
			break;
		case "No":
			CUtil.click(By.xpath("//input[@value='false']"));
			break;

		default:
			break;
		}

	}

}
