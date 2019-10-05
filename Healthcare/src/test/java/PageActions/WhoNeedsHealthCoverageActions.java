package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class WhoNeedsHealthCoverageActions {
	static WebDriver driver;

	public WhoNeedsHealthCoverageActions(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public void clickSave() {
		CUtil.waitForVisibleElement(By.xpath("//button[text()='Add a person who needs coverage']"));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CUtil.actionClickNew(By.xpath("//*[text()='Save & continue']"));
	}

	public void clickAddPersonButton() {
		CUtil.click(By.xpath("//button[text()='Add a person who needs coverage']"));
	}

}
