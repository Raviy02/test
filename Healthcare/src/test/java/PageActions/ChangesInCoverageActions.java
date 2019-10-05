package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class ChangesInCoverageActions {
	static WebDriver driver;

	public ChangesInCoverageActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

}
