package runner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import CommonUtils.CUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;

public class SharedDriver extends EventFiringWebDriver {

	private static WebDriver REAL_DRIVER;
	private static boolean takenScreenshot = false;

	private static final Thread CLOSE_THREAD = new Thread() {

		@Override
		public void run() {
			REAL_DRIVER.quit();
		}
	};

	static {
		String browser = System.getProperty("browser");
		if (browser == null) {
			browser = "chrome";
		}
		switch (browser) {
		case "firefox":
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", "src/test/resources/Driver/geckodriver_Win.exe");
			ProfilesIni prof = new ProfilesIni();
			FirefoxProfile ffProfile = prof.getProfile("default");
			FirefoxOptions ffoptions = new FirefoxOptions();
			ffoptions.setProfile(ffProfile);
			ffoptions.setAcceptInsecureCerts(true);
			ffoptions.setCapability("marionette", true);
			ffoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			REAL_DRIVER = new FirefoxDriver(ffoptions);
			break;
		case "chrome":
		case "CHROME":
		default:
			ChromeOptions chromeoptions = new ChromeOptions();
			// System.setProperty("webdriver.chrome.driver",
			// "src/test/resources/drivers/chromedriver_Win.exe");
			chromeoptions.addArguments("--start-maximized");
			chromeoptions.setPageLoadStrategy(PageLoadStrategy.NONE);
			chromeoptions.addArguments("--incognito");
			chromeoptions.addArguments("enable-automation");
			chromeoptions.addArguments("--no-sandbox");
			chromeoptions.addArguments("--disable-infobars");
			chromeoptions.addArguments("--disable-dev-shm-usage");
			chromeoptions.addArguments("--disable-browser-side-navigation");
			chromeoptions.addArguments("--disable-gpu");
			chromeoptions.setAcceptInsecureCerts(true);
			chromeoptions.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			DesiredCapabilities capability = DesiredCapabilities.chrome();
			capability.setBrowserName("chrome");
			capability.setPlatform(Platform.WINDOWS);
			chromeoptions.merge(capability);

			try {
				REAL_DRIVER = new RemoteWebDriver(new URL("http://172.31.0.209:4444/wd/hub"), chromeoptions);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// REAL_DRIVER = new ChromeDriver(chromeoptions);
			break;
		}
		// implicit wait set up
		REAL_DRIVER.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
	}

	public SharedDriver() {
		super(REAL_DRIVER);
		// setter method call to get webdriver instance
		CUtil.setWebDriver(REAL_DRIVER);
	}

	@Override
	public void close() {
		if (Thread.currentThread() != CLOSE_THREAD) {
			throw new UnsupportedOperationException(
					"You shouldn't close this WebDriver. It's shared and will close when the JVM exits.");
		}
		super.close();
	}

	@Before
	/**
	 * Delete all cookies at the start of each scenario to avoid shared state
	 * between tests
	 */
	public void deleteAllCookies() {
		manage().deleteAllCookies();
	}

	@AfterStep
	public void embedScreenshotOnFailuer(Scenario scenario) {
		scenario.write("Current Page URL is " + getCurrentUrl());
		if (scenario.isFailed()) {
			try {
				byte[] screenshot = getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
				takenScreenshot = true;
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			}
		}
	}

	@After
	/**
	 * Embed a screenshot in test report if test is marked as failed
	 */
	public void embedScreenshot(Scenario scenario) {
		if (!takenScreenshot) {
			scenario.write("Current Page URL is " + getCurrentUrl());
			try {
				byte[] screenshot = getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			}
		}
	}

}
