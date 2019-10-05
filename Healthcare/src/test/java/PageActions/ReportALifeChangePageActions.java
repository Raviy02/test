package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class ReportALifeChangePageActions {

	static WebDriver driver;

	public ReportALifeChangePageActions(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);

	}

	public void clickReportLifeChangeButton() {
		CUtil.click(By.xpath("//button[text()='Report a life change']"));
	}

	public boolean isModalPresent() {
		return CUtil.isDisplayed(By.xpath("//h1[text()='Have you had any changes like these?']"));
	}

	public void clickChangeInMyHouseholdOption() {
		CUtil.actionClickNew(By.xpath("//input[@name='lifeChangeOptions'][@value='household']"));
	}

	public void clickContinue() {
		CUtil.click(By.xpath("//span[text()='CONTINUE']"));
	}

}
