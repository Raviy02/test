package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class MyProfileActions {

	static WebDriver driver;

	public MyProfileActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickVerifyNow() throws InterruptedException {
		CUtil.waitForElementDisappear(By.xpath("//div[@id='saveBlocker']"));
		CUtil.waitForClickableElement(By.xpath("//a[text()='Verify now']"));
		CUtil.clickException(By.xpath("//a[text()='Verify now']"));
	}

	public static void clickMyApplicationsAndCoverage() {
		CUtil.waitForElementDisappear(By.xpath("//div[@id='saveBlocker']"));
		CUtil.waitForClickableElement(By.xpath("//li[@id='myAppCoverageIcon']//*[text()='My Applications & Coverage']"));
		CUtil.click(By.xpath("//li[@id='myAppCoverageIcon']//*[text()='My Applications & Coverage']"));
	}

}
