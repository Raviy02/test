package PageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonUtils.CUtil;

public class AddDependentPageActions {

	static WebDriver driver;

	public AddDependentPageActions(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public void clickSave() {
		CUtil.waitForPageLoad();
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

	public void typeFirstName(String text) {
		CUtil.type(By.xpath("//input[@name='firstName']"), text);
	}

	public void typeLastName(String text) {
		CUtil.type(By.xpath("//input[@name='lastName']"), text);
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

	public void selectGender(String text) {
		switch (text) {
		case "Male":
			CUtil.click(By.xpath("//input[@value='MALE']"));
			break;
		case "Female":
			CUtil.click(By.xpath("//input[@value='FEMALE']"));
			break;
		default:
			break;
		}
	}

	public void selectRelationship(String option) {
		CUtil.selectDropdown(By.xpath("//*[contains(@name,'familyRelationship')]"), option);
	}

	public void selectRelationshipWithSpouse(String option) {
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(@name,'familyRelationship')]"));
		WebElement element = list.get(list.size() - 1);
		CUtil.selectDropdown(element, option);
	}

}
