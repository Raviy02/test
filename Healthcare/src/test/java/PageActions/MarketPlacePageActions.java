package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class MarketPlacePageActions {

	static WebDriver driver;

	public MarketPlacePageActions(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public void clickUserPorfile() throws InterruptedException {
		CUtil.waitForElementDisappear(By.xpath("//div[@id='saveBlocker']"));
		CUtil.clickException(By.xpath("//span[@id='headerUserName']"));
	}

	public void clickMyProfileOption() {
		CUtil.click(By.xpath("//a[@id='helpProfile']"));
	}

}
