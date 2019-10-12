package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class HomeAddressActions {

	static WebDriver driver;

	public HomeAddressActions(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		CUtil.waitForPageLoad();
		CUtil.click(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']"));
	}

	public static void enterStreetAddress(String text) {
		CUtil.type(By.xpath("//*[@name='streetName1']"), text);
	}

	public static void enterCity(String text) {
		CUtil.type(By.xpath("//*[@name='cityName']"), text);
	}

	public static void enterZipCode(String text) {
		CUtil.type(By.xpath("//*[@name='zipCode']"), text);
	}

	public static void selectUSPSAddress() {
		CUtil.waitForPageLoad();
		CUtil.click(By.xpath("//*[@name='geoAPIResult']"));
	}

}
