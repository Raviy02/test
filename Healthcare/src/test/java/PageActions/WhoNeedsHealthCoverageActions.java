package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class WhoNeedsHealthCoverageActions {
	static WebDriver driver;

	public WhoNeedsHealthCoverageActions(WebDriver driver) {
		this.driver = driver;
	}

	public boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public void clickSave() {
		CUtil.waitForVisibleElement(By.xpath("//button[@class='ds-c-button ds-u-margin-top--2']"));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CUtil.actionClickNew(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']"));
	}

	public void clickAddPersonButton() {
		CUtil.click(By.xpath("//button[@class='ds-c-button ds-u-margin-top--2']"));
	}

}
