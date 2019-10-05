package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class ContactInformationActions {
	static WebDriver driver;

	public ContactInformationActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void enterLastName(String text) {
		CUtil.type(By.xpath("//*[@id='iDProofLastName']"), text);
	}

	public static void enterDOB(String text) {
		CUtil.type(By.xpath("//*[@id='iDProofDOB']"), text);
	}

	public static void enterStreetAddress(String text) {
		CUtil.type(By.xpath("//*[@id='iDProofAddressLine1']"), text);
	}

	public static void enterCity(String text) {
		CUtil.type(By.xpath("//*[@id='iDProofCity']"), text);
	}

	public static void enterZipCode(String text) {
		CUtil.typeSlowly(By.xpath("//*[@id='iDProofZipCode']"), text);
	}

	public static void enterPhoneNumber(String text) {
		CUtil.typeSlowly(By.xpath("//*[@id='iDProofPhone']"), text);
	}

	public static void selectPhoneType(String text) {
		CUtil.selectDropdown(By.xpath("//*[@id='iDProofPhoneType']"), text);
	}

	public static void clickContinueButton() {
		CUtil.click(By.xpath("//*[@id='goToIDProofIdentityQuestions']"));
	}

}
