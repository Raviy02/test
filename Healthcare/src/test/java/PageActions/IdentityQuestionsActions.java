package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class IdentityQuestionsActions {
	static WebDriver driver;

	public IdentityQuestionsActions(WebDriver driver) {
		this.driver = driver;
	}

	public static boolean verifyPageTitle(String text) {
		return CUtil.waitUtilAtNextPage(text);
	}

	public static void answerAllQuestions(String text) {
		CUtil.waitForElementDisappear(By.xpath("//div[@id='saveBlocker']"));
		CUtil.waitForPageLoad();
		CUtil.selectMultipleAnswers(By.xpath("//label[text()='" + text + "']/preceding-sibling::input"));
	}

	public static void clickContinueButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CUtil.click(By.xpath("//button[contains(@class,'goToIDProofResults')]"));
	}

}
