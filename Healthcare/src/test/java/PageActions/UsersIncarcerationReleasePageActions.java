package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class UsersIncarcerationReleasePageActions {
	static WebDriver driver;

	public UsersIncarcerationReleasePageActions(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public static void clickSave() {
		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		CUtil.click(By.xpath("//button[@class='ds-c-button ds-c-button--primary ds-u-margin-top--4']"));
	}

	public void typeMonth(String text) {
		CUtil.type(By.xpath("//input[@name='month']"), text);
	}

	public void typeDay(String text) {
		CUtil.type(By.xpath("//input[@name='day']"), text);
	}

	public void typeYear(String text) {
		CUtil.type(By.xpath("//input[@name='year']"), text);
	}

}
