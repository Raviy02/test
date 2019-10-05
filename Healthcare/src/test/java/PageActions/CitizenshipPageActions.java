package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class CitizenshipPageActions {

	static WebDriver driver;

	public CitizenshipPageActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		// CUtil.waitForPageLoad();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CUtil.actionClickNew(By.xpath("//*[text()='Save & continue']"));
	}

	public void selectOption(String text) {
		switch (text) {
		case "None of these people":
			CUtil.click(By.xpath("//*[@name='naturalizedDerivedChoice'][@value='']"));
			break;

		default:
			break;
		}

	}

}
