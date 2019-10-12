package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class MyProfileActions {

	static WebDriver driver;

	public MyProfileActions(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public static void clickVerifyNow() throws InterruptedException {
		CUtil.waitForElementDisappear(By.xpath("//div[@id='saveBlocker']"));
		CUtil.waitForClickableElement(By.xpath("//a[@class='idProofNow']"));
		CUtil.clickException(By.xpath("//a[@class='idProofNow']"));
	}

	public static void clickMyApplicationsAndCoverage() {
		CUtil.waitForElementDisappear(By.xpath("//div[@id='saveBlocker']"));
		CUtil.waitForClickableElement(By.xpath("//li[@id='myAppCoverageIcon']//a"));
		CUtil.click(By.xpath("//li[@id='myAppCoverageIcon']//a"));
	}

}
