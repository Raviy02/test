package PageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonUtils.CUtil;

public class HouseholdIncomeActions {
	static WebDriver driver;

	public HouseholdIncomeActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

	public void selectOption(String text) {
		List<WebElement> list = driver.findElements(By.xpath("//*[@type='checkbox']"));
		switch (text) {
		case "User":
			CUtil.waitForPageLoad();
			CUtil.click(list.get(0));
			break;
		case "Spouse":
			CUtil.waitForPageLoad();
			CUtil.click(list.get(1));
			break;

		default:
			break;
		}
	}

}
