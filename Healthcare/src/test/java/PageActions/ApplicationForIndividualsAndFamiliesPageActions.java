package PageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonUtils.CUtil;

public class ApplicationForIndividualsAndFamiliesPageActions {

	static WebDriver driver;

	public ApplicationForIndividualsAndFamiliesPageActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public static void selectYear(String text) throws InterruptedException {
		CUtil.waitForElementDisappear(By.xpath("//div[@id='saveBlocker']"));
		CUtil.selectDropdown(By.xpath("//select[contains(@id,'yearDropdownview')]"), text);
	}

	public static void selectState(String text) throws InterruptedException {
		List<WebElement> pageElements = driver.findElements(By.xpath("//select[contains(@id,'stateDropdownview')]"));
		WebElement pageElement = pageElements.get(pageElements.size() - 1);
		CUtil.selectDropdown(pageElement, text);
	}

	public static void clickApplyOrRenewButton() {
		CUtil.click(By.xpath("//*[@id='landingPage_Apply']"));
	}

}
