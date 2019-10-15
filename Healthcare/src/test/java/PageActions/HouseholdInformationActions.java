package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class HouseholdInformationActions {
	static WebDriver driver;

	public HouseholdInformationActions(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.click(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']"));
	}

	public static void selectOption(String text) {
		switch (text) {
		case "None of these apply to the people in the household":
		case "Ninguna de estas le aplica a las personas en el hogar":
			CUtil.click(By.xpath("//*[@value='none']"));
			break;
		case "Is currently incarcerated (detained or jailed)":
		case "Está actualmente encarcelado (detenido o en prisión)":
			CUtil.click(By.xpath("//*[@value='currentlyIncarcerated']"));
			break;

		default:
			break;
		}
	}

}
