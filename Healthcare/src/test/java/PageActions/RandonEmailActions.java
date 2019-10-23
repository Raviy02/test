package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class RandonEmailActions {
	static WebDriver driver;
	static String url = "http://www.yopmail.com";

	public RandonEmailActions(WebDriver driver) {
		this.driver = driver;
	}

	public void generateRandomEmailId() {
		CUtil.openNewTab();
		CUtil.switchToWindow("window1");
		CUtil.OpenBrowser(url);
		CUtil.click(By.xpath("//*[contains(text(),'Random Email Address')]"));
	}

	public String recordEmailId() {
		CUtil.waitForElement(By.xpath("//input[@id='login']"));
		return CUtil.getAttribute(By.xpath("//input[@id='login']"), "value");
	}

	public void clickCheckMails() {
		CUtil.switchToWindow("window1");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CUtil.click(By.xpath("//input[@value='Check mails']"));
	}

	public void clickCheckForNewMails() {
		int count = 4;
		for (int i = 0; i <= count; i++) {
			CUtil.click(By.xpath("//span[@class='slientext']"));
			if (isEmailReceived()) {
				break;
			}
		}

	}

	public void clickVerificationLink() {
		String language = System.getProperty("language");
		try {
			CUtil.switchFrame("ifmail");
			if (language.equalsIgnoreCase("English")) {
				CUtil.click(By.xpath("//*[text()='HealthCare.gov']"));
			} else if (language.equalsIgnoreCase("spanish")) {
				CUtil.click(By.xpath("//*[text()='CuidadoDeSalud.gov']"));
			}

		} finally {
			CUtil.switchToTopFrame();
			System.out.println("main window");
		}

	}

	public static boolean isEmailReceived() {
		boolean result = false;
		CUtil.switchFrame("ifinbox");
		result = CUtil.isDisplayed(By.xpath("//span[text()='marketplace@healthcare.gov']"));
		CUtil.switchToTopFrame();
		return result;

	}

}
