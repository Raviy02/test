package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;
import runner.SharedDriver;

public class HouseholdExpensesActions {
	static WebDriver driver;

	public HouseholdExpensesActions(SharedDriver driver) {
		this.driver = driver;
	}

	public boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public void clickSave() {
		CUtil.click(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']"));
	}

}
