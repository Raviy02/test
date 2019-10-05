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

	public void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public void clickSave() {
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

}
