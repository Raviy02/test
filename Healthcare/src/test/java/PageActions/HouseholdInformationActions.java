package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class HouseholdInformationActions {
	static WebDriver driver;

	public HouseholdInformationActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

	public static void selectOption(String text) {
		switch (text) {
		case "None of these apply to the people in the household":
			CUtil.click(By.xpath("//*[@value='none']"));
			break;
		case "Is currently incarcerated (detained or jailed)":
			CUtil.click(By.xpath("//*[@value='currentlyIncarcerated']"));
			break;

		default:
			break;
		}
	}

}
