package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class MyAccountPageStepsActions {

	static WebDriver driver;

	public MyAccountPageStepsActions(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);

	}

	public void clickReportLifeChangeOption() {
		CUtil.click(By.xpath("//a[text()='Report a life change']"));
	}

}
