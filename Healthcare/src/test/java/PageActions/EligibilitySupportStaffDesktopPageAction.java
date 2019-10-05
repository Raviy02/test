package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class EligibilitySupportStaffDesktopPageAction {

	static WebDriver driver;

	public EligibilitySupportStaffDesktopPageAction(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyPageTitle(String text) {
		String url = "https://" + System.getProperty("environment")
				+ ".healthcare.gov/marketplace/auth/global/en_US/eligibilitySupportStaffDesktop";
		boolean out = CUtil.waitUtilAtNextPage(text);
		if (!out) {
			driver.navigate().to(url);
		}
	}

	public void typeDOB(String text) {
		CUtil.waitForElementDisappear(By.xpath("//div[text()='Loading the page ...']"));
		CUtil.waitForVisibleElement(By.xpath("//*[@name='personSearchDOB']"));
		CUtil.typeSlowly(By.xpath("//*[@name='personSearchDOB']"), text);
	}

	public void typeFirstName(String text) {
		CUtil.type(By.xpath("//*[@id='personSearchFirstName']"), text);
	}

	public void typeLastName(String text) {
		CUtil.type(By.xpath("//*[@id='personSearchLastName']"), text);
	}

	public void clickSearchButton() {
		CUtil.click(By.xpath("//*[@id='searchByCriteriaButton']"));
	}

	public void clickFirstResult() {
		CUtil.waitForElementDisappear(By.xpath("//div[text()='Searching for applications']"));
		CUtil.click(By.xpath("//tbody//tr/td//a"));
	}

	public void openNoticesTab() {
		CUtil.waitForElementDisappear(By.xpath("//div[text()='Fetching Person Information']"));
		CUtil.waitForVisibleElement(By.xpath("//*[text()='Individual Eligibility Determination']"));
		CUtil.click(By.xpath("//a[text()='Notices']"));
	}

	public void clickCreateNoticeButton() {
		CUtil.waitForElementDisappear(By.xpath("//div[text()='Fetching custom notices...']"));
		CUtil.click(By.xpath("//*[@id='createNoticeButton']"));
	}

	public boolean isCutomeNoticeModalDisplayed() {
		CUtil.waitForVisibleElement(By.xpath("//*[@id='customNoticesCreateModalContainer']"));
		return CUtil.isDisplayed(By.xpath("//*[@id='customNoticesCreateModalContainer']"));
	}

	public void typeNoticeName(String text) {
		CUtil.type(By.xpath("//*[@id='noticeName']"), text);
	}

	public void typeNoticeContent(String text) {
		CUtil.switchFrame("noticeContent_ifr");
		CUtil.type(By.xpath("//*[@id='tinymce']"), text);
		CUtil.switchToTopFrame();
	}

	public void selectAddBarcode(String option) {
		CUtil.selectDropdown(By.xpath("//*[@id='barcodeSelect']"), option);

	}

	public void typeComment(String text) {
		CUtil.type(By.xpath("//*[@id='noticeComment']"), text);
	}

	public void clickSendButton() {
		CUtil.click(By.xpath("//*[@id='sendNotice']"));
		driver.switchTo().alert().accept();

	}

	public void verificationIssuesTab() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CUtil.waitForElementDisappear(By.xpath("//div[text()='Fetching Person Information']"));
		CUtil.waitForVisibleElement(By.xpath("//*[text()='Individual Eligibility Determination']"));
		CUtil.click(By.xpath("//a[text()='Verification Issues']"));
	}

	public void openIndividual_Verification_issue_accordion() {
		CUtil.waitForVisibleElement(By.xpath("//*[text()='Individual Verification Issue']"));
		CUtil.javaScrollIntoView(By.xpath("//*[text()='Individual Verification Issue']"));
		CUtil.click(By.xpath("//*[text()='Individual Verification Issue']"));
	}

	public void openFirstNotice(String text) {
		String locator = "//td[text()='" + text + "']/preceding-sibling::td//a[@class='selectInconsistency']";
		CUtil.waitForVisibleElement(By.xpath(locator));
		CUtil.storedText = driver.findElement(By.xpath(locator)).getText();
		System.out.println(CUtil.storedText);
		CUtil.click(By.xpath(locator));
	}

	public void openVerification_issue_accordion() {
		CUtil.waitForVisibleElement(By.xpath("//*[text()=' Verification Issue ']"));
		CUtil.javaScrollIntoView(By.xpath("//*[text()=' Verification Issue ']"));
		CUtil.click(By.xpath("//*[text()=' Verification Issue ']"));
	}

	public void click_Resolve_Verification_Issue_Button() {
		CUtil.click(By.xpath("//*[text()='Resolve Verification Issue']"));
		CUtil.switchToAlert("Accept");
		CUtil.switchToAlert("Accept");
	}

	public void clickHomeButton() {
		CUtil.click(By.xpath("//a[text()='Home']"));
	}

	public void typeApplicationID(String applicationID) {
		CUtil.waitForVisibleElement(By.xpath("//input[@id='appIDSearch']"));
		CUtil.type(By.xpath("//input[@id='appIDSearch']"), applicationID);
	}

	public void selectTenantID(String option) {
		CUtil.selectDropdown(By.xpath("//select[@id='tenantIDSearch']"), option);
	}

	public void clickSearchByApplicationID() {
		CUtil.click(By.xpath("//button[@id='personSearchByApplicationId']"));
	}

	public boolean isStatusUpdated(String text) {
		String locator = "//td/a[text()='" + CUtil.applicationID.trim() + "']/parent::td/following-sibling::td[5]";
		System.out.println(CUtil.getText(By.xpath("By.xpath(locator)")));
		return CUtil.isContainsText(By.xpath(locator), text);
	}

}
