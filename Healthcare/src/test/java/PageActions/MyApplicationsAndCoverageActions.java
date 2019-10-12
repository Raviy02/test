package PageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonUtils.CUtil;

public class MyApplicationsAndCoverageActions {

	static WebDriver driver;

	public MyApplicationsAndCoverageActions(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public static void selectYear(String text) throws InterruptedException {
		CUtil.waitForElementDisappear(By.xpath("//div[@id='saveBlocker']"));
		CUtil.selectDropdown(By.xpath("//select[contains(@id,'yearDropdownview')]"), text);
	}

	public static void selectState(String text) throws InterruptedException {
		CUtil.waitForElementDisappear(By.xpath("//select[@disabled]"));
		List<WebElement> pageElements = driver.findElements(By.xpath("//select[contains(@id,'stateDropdownview')]"));
		WebElement pageElement = pageElements.get(pageElements.size() - 1);
		CUtil.selectDropdown(pageElement, text);
	}

	public static void clickApplyOrRenewButton() {
		CUtil.click(By.xpath("//*[@id='landingPage_Apply']"));
	}

	public void clickIndividualFamilyLink() {
		CUtil.click(By.xpath("//*[text()='Individual & Family Coverage']"));
	}

	public void recordApplicationID() {
		CUtil.waitForVisibleElement(By.xpath("//span[contains(@id,'deleteApplicationFor')]"));
		CUtil.applicationID = CUtil.getText(By.xpath("//span[contains(@id,'deleteApplicationFor')]")).replace("ID#:",
				"");
		System.out.println(CUtil.applicationID);
	}

	public void clickLogOut() {
		CUtil.click(By.xpath("//*[@id='logout']"));
		CUtil.waitForVisibleElement(By.xpath("//*[text()='Log in again']"));
	}

}
