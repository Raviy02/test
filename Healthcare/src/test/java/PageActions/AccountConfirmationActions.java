package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class AccountConfirmationActions {

	static WebDriver driver;

	public AccountConfirmationActions(WebDriver driver) {
		this.driver = driver;
	}

	public void clickContinueToLogin() {
		CUtil.click(By.xpath("//a[@class='btn btn-lg btn-success']"));
	}

	public boolean isAtThisPage() {
		CUtil.switchToWindow("window2");
		String lang = System.getProperty("language");
		if (lang.equalsIgnoreCase("english")) {
			return CUtil.isDisplayed(By.xpath("//h1[text()='Your account is ready']"));
		} else if (lang.equalsIgnoreCase("spanish")) {
			return CUtil.isDisplayed(By.xpath("//h1[text()='Su cuenta está lista']"));
		}
		return false;

	}

}
