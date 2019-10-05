package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;
import runner.SharedDriver;

public class UserIncomeActions {

	static WebDriver driver;

	public UserIncomeActions(SharedDriver driver) {
		this.driver = driver;
	}

	public void verifyPageTitle(String text) {
		CUtil.waitUtilAtNextPage(text);
	}

	public void clickSave() {
		CUtil.click(By.xpath("//*[text()='Save & continue']"));
	}

	public void selectIncomeType(String option) {
		CUtil.selectDropdown(By.xpath("//*[@id='incomeSource-select']"), option);
	}

	public void typeEmployerName(String text) {
		CUtil.type(By.xpath("//*[@name='employerName']"), text);
	}

	public void selectSalaryCycle(String text) {
		switch (text) {
		case "Yearly":
			CUtil.click(By.xpath("//input[@value='ANNUALLY']"));
			break;
		default:
			break;
		}

	}

	public void typeSalary(String text) {
		CUtil.type(By.xpath("//input[@name='incomeAmount']"), text);
	}

	public void typePhoneNumber(String text) {
		CUtil.type(By.xpath("//input[@name='employerPhoneNumber']"), text);
	}

}
