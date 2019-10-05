package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class ReviewUserIncomeExpensesActions {
	static WebDriver driver;

	public ReviewUserIncomeExpensesActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.waitForVisibleElement(By.xpath("//p[contains(text(),'$')][2]"));
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

	public static void acceptIncome() {
		CUtil.waitForVisibleElement(By.xpath("//p[contains(text(),'$')][2]"));
		CUtil.click(By.xpath("//*[@value='true']"));
	}

}
