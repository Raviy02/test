package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class LandingPageActions {

	static WebDriver driver;

	public LandingPageActions(WebDriver driver) {
		this.driver = driver;
	}

	public void openLandingPage() {
		Stub.init();
		// CUtil.OpenBrowser(driver, url);
		CUtil.setMainWindow(driver.getWindowHandle());
	}

	public void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public void clickCreateOne() {
		CUtil.switchToMainWindow();
		CUtil.click(By.xpath("//a[@href='/create-account']"));
	}

	public void enterUserName(String text) {
		CUtil.type(By.xpath("//*[@name='username']"), text);
	}

	public void enterPassword(String text) {
		CUtil.type(By.xpath("//*[@name='password']"), text);
	}

	public void clickLoginButton() {
		CUtil.click(By.xpath("//button[@type='submit']"));
	}

	public boolean isAtThisPage() {
		String language = System.getProperty("language");
		if (language.equalsIgnoreCase("English")) {
			return CUtil.isDisplayed(By.xpath("//h1[text()='Log in']"));
		} else if (language.equalsIgnoreCase("spanish")) {
			return CUtil.isDisplayed(By.xpath("//h1[text()='Iniciar sesión']"));
		}
		return false;

	}

}
