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
		CUtil.click(By.xpath("//*[text()='Continue to login']"));
	}

	public boolean isAtThisPage() {
		CUtil.switchToWindow("window2");
		return CUtil.isDisplayed(By.xpath("//h1[text()='Your account is ready']"));
	}

}
