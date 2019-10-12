package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class TellUsAboutYoutSelfActions {

	static WebDriver driver;

	public TellUsAboutYoutSelfActions(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public static void typeMonth(String text) {
		CUtil.type(By.xpath("//input[@name='month']"), text);
	}

	public static void typeDay(String text) {
		CUtil.type(By.xpath("//input[@name='day']"), text);
	}

	public static void typeYear(String text) {
		CUtil.type(By.xpath("//input[@name='year']"), text);
	}

	public static void selectSex(String text) {
		switch (text) {
		case "Female":
			CUtil.click(By.xpath("//input[@value='FEMALE']"));
			break;

		default:
			break;
		}
	}

	public static void clickSave() {
		CUtil.waitForPageLoad();
		CUtil.click(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']"));
	}

	public void typeFirstName(String text) {
		CUtil.type(By.xpath("//*[@name='firstName']"), text);

	}

	public void typeLastName(String text) {
		CUtil.type(By.xpath("//*[@name='lastName']"), text);
	}

}
