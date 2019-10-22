package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.CUtil;

public class Stub {

	static WebDriver driver;
	static boolean flag = false;

	public Stub(WebDriver driver) {
		this.driver = driver;
	}

	public static void init() {
		String url = "file:///" + System.getProperty("user.dir") + "/src/test/resources/HTML files/Environments.html";
		System.out.println(url);
		CUtil.OpenBrowser(url);
		CUtil.waitForClickableElement(By.xpath("//a[contains(@href,'" + System.getProperty("environment") + "')]"));
		CUtil.click(By.xpath("//a[contains(@href,'" + System.getProperty("environment") + "')]"));
		CUtil.waitForVisibleElement(By.xpath("//a[text()='Log in']"));
		CUtil.click(By.xpath("//a[text()='Log in']"));
		flag = true;
	}

	public static void initESD() {
		String url = "file:///" + System.getProperty("user.dir") + "/src/test/resources/HTML files/Roles.html";
		System.out.println(url);
		CUtil.OpenBrowser(url);
		if (!flag) {
			CUtil.setMainWindow(driver.getWindowHandle());
			flag = false;
		}
		CUtil.waitForClickableElement(By.xpath("//*[@id='esdRole']"));
		CUtil.click(By.xpath("//*[@id='esdRole']"));
		CUtil.waitForVisibleElement(By.xpath("//input[@value='" + System.getProperty("environment") + "']"));
		CUtil.click(By.xpath("//input[@value='" + System.getProperty("environment") + "']"));
		String userName = CUtil.getText(By.xpath("//*[@id='esdTable']//tbody//tr[2]//td"));
		String passWord = CUtil.getText(By.xpath("//*[@id='esdTable']//tbody//tr[2]//td[2]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		CUtil.click(By.xpath("//a[text()='Go to ESD']"));
		CUtil.switchToWindow("window1");
		CUtil.waitForVisibleElement(By.xpath("//*[@id='acceptButton']"));
		CUtil.click(By.xpath("//*[@id='acceptButton']"));
		CUtil.waitForVisibleElement(By.xpath("//*[@name='username']"));
		CUtil.type(By.xpath("//*[@name='username']"), userName);
		CUtil.click(By.xpath("//*[@id='buttonUserID']"));
		CUtil.waitForVisibleElement(By.xpath("//*[@name='password']"));
		CUtil.type(By.xpath("//*[@name='password']"), passWord);
		CUtil.click(By.xpath("//*[@id='buttonUserID']"));

	}

	public static void initCCR() {
		String url = "file:///" + System.getProperty("user.dir") + "/src/test/resources/HTML files/Roles.html";
		CUtil.OpenBrowser(url);
		if (!flag) {
			CUtil.setMainWindow(driver.getWindowHandle());
		}
		CUtil.waitForClickableElement(By.xpath("//*[@id='ccrRole']"));
		CUtil.click(By.xpath("//*[@id='ccrRole']"));
		CUtil.waitForVisibleElement(By.xpath("//input[@value='" + System.getProperty("environment") + "']"));
		CUtil.click(By.xpath("//input[@value='" + System.getProperty("environment") + "']"));

	}

	public void typeSAML() {
		String SAML = "PHNhbWxwMjpSZXNwb25zZSBJRD0iUmVzcG9uc2VJZF8zM2ExYzUxOTZkNTUwNzg0NTkzZGVlNGU1NTNhYzczOCIgSXNzdWVJbnN0YW50PSIyMDE5LTEwLTEwVDE0OjU1OjA0LjM5NVoiIFZlcnNpb249IjIuMCIgeG1sbnM6c2FtbDI9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphc3NlcnRpb24iIHhtbG5zOnNhbWxwMj0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOnByb3RvY29sIj48c2FtbDI6SXNzdWVyPmxvY2FsaG9zdDwvc2FtbDI6SXNzdWVyPjxkczpTaWduYXR1cmUgeG1sbnM6ZHM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyMiPjxkczpTaWduZWRJbmZvPjxkczpDYW5vbmljYWxpemF0aW9uTWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8xMC94bWwtZXhjLWMxNG4jIi8+PGRzOlNpZ25hdHVyZU1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyNyc2Etc2hhMSIvPjxkczpSZWZlcmVuY2UgVVJJPSIjUmVzcG9uc2VJZF8zM2ExYzUxOTZkNTUwNzg0NTkzZGVlNGU1NTNhYzczOCI+PGRzOlRyYW5zZm9ybXM+PGRzOlRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyNlbnZlbG9wZWQtc2lnbmF0dXJlIi8+PGRzOlRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMTAveG1sLWV4Yy1jMTRuIyIvPjwvZHM6VHJhbnNmb3Jtcz48ZHM6RGlnZXN0TWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnI3NoYTEiLz48ZHM6RGlnZXN0VmFsdWU+VFgrcDN4YkNzbld6WkdLYlBEVDhVdVhvZE9ZPTwvZHM6RGlnZXN0VmFsdWU+PC9kczpSZWZlcmVuY2U+PC9kczpTaWduZWRJbmZvPjxkczpTaWduYXR1cmVWYWx1ZT5VS0kxQ2NYbHpTcGdib1dHbDlsTUswRmZ5WVBzaEVuZVI3VEwzMm5xUjZaZ21JaEFVSGErL0lNSmljRFlHa2ZscUR5dTdxMkxnQnlmVHdzUVRLL2s3TE91d0RaN1R1WHF2RUtGSXF1MXhaUE9GWDc4TFlXK3c3Y1FJeE5QNUFrZHp5OG90UlQ4Q1U5akxWL2ZENWwyUTJ0VHZ6cDdSdm90d1F0ZzM3Z3Q0RjFaTkxXSGpIUGF1Z2p0QmJjVVUwMXVjWW9ON0Y0R1NNcHZXbEgvMmRuYXlCOUdtL2M2dHd5aCtDOFFGWHhIQmZISlFKSy9Ec1cwOW0vOXIvT1VESGthQ1JOS0lsK1NSKzJPa01CSlFQS2lCdlVaT01QUWpUU1U2UjRocU4ydXBvT0taekJYSW1FT3oxdExxWXlnSktObEgxTk1oZk5KK2RManVrMStVSXdoMEE9PTwvZHM6U2lnbmF0dXJlVmFsdWU+PGRzOktleUluZm8+PGRzOlg1MDlEYXRhPjxkczpYNTA5Q2VydGlmaWNhdGU+TUlJQzdEQ0NBZFNnQXdJQkFnSUlGSG5IZTRmOWRsb3dEUVlKS29aSWh2Y05BUUVNQlFBd0ZERVNNQkFHQTFVRUF4TUpiRzlqWVd4b2IzTjBNQjRYRFRFNU1EWXdNekUzTlRnek1Wb1hEVEk1TURVek1URTNOVGd6TVZvd0ZERVNNQkFHQTFVRUF4TUpiRzlqWVd4b2IzTjBNSUlCSWpBTkJna3Foa2lHOXcwQkFRRUZBQU9DQVE4QU1JSUJDZ0tDQVFFQW1STk95YzhhK3ZqQjBEZkVyUFAybmUyYlhUbTZIZnJqV0swdnRRSG5OSkpqdG93c3lrcmE1MGZ4Wjc4eU5NWllOTzNCNnp2YlRXcStkcnd1dFVMSTVtRnMxYXdZMU9oNXlYSER0QlIxQTRiUUJvRFNyVWI1NVJFUXZYQmNxYkF3V1lYUWxvRTh4NDFEenQ1MDhvTTd0aGJMRG83L283ZXRuL2ZMNmxEd0QwMzBvSThnUTdFaURpVGdjV1M1R0VJOHpMd0gxcmNFNDlxV3RuZTRscHY0Z2ZsRzd5blR4c2Rkb2hoRnpMb01uMHR1ZGUzTDc4UmdQcmhlL2lKWks3Sjl5K0s0aG1mT0tNZEFySWZOVDlld1JZc3I2TWJiK3JTWjhBL3NaSTNSS1VNMWJsNStXejNzdnBiMHkzRVRkc0lyUE9pbE5GbkppVzdoelVmYUVZeURtUUlEQVFBQm8wSXdRREFkQmdOVkhRNEVGZ1FVR3o0bXhWU2hleGp6MktLeUZDT0VYT3FlODFFd0h3WURWUjBqQkJnd0ZvQVVHejRteFZTaGV4anoyS0t5RkNPRVhPcWU4MUV3RFFZSktvWklodmNOQVFFTUJRQURnZ0VCQUpoY0xtTDkzWER4RHkrU1U4MzJra3IvYUF4Q1JBa0xQUmNhVlAraGtqaXhPQWlkR3VOVTVZdzFDdzBTRy9IbG00dzM2cFZXdmVSOWUzSGsvbHJRT1FxUks5Q3NsSGpHUVhCY3YvM21OUG9KV2tuT2RXeUZQNGkxYU5EWWlqRmdsRHFyb1ZyUkswSWFXdUdkenkzZndodDhTNXNOYXR3ZC9NYjJLb0g4UVVQQ09XS01TbXFZOExBbEhqMGZiamlEblFoTlFjeTNkZ1VCVFBLU2Z5TGp6NEtPZ09LVE5kRzZUL2h2M0xWSjhySGJLVzZrd3R4eGlBUWZKdUk5eGhVM1JINnV2ZU81N1Zna0x1ZkszNWRIc1lFWWwrWjhZK29uRkdkbVh2d1lHZzF4c05qSzRMbEcxMnl0a01OQ0pKampoTnZWU3VWMFBSb3AxSWNmRmgxQjVqcz08L2RzOlg1MDlDZXJ0aWZpY2F0ZT48L2RzOlg1MDlEYXRhPjwvZHM6S2V5SW5mbz48L2RzOlNpZ25hdHVyZT48c2FtbHAyOlN0YXR1cz48c2FtbHAyOlN0YXR1c0NvZGUgVmFsdWU9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDpzdGF0dXM6U3VjY2VzcyIvPjxzYW1scDI6U3RhdHVzTWVzc2FnZT5TdWNjZXNzPC9zYW1scDI6U3RhdHVzTWVzc2FnZT48L3NhbWxwMjpTdGF0dXM+PHNhbWwyOkFzc2VydGlvbiBJRD0iU2FtbEFzc2VydGlvbi1kYTVhYzhmYmVkY2JmNzBiYTRmMjU4NzFkNTdlODE2MyIgSXNzdWVJbnN0YW50PSIyMDE5LTEwLTEwVDE0OjU1OjA0LjM0OFoiIFZlcnNpb249IjIuMCIgeG1sbnM6c2FtbDI9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphc3NlcnRpb24iPjxzYW1sMjpJc3N1ZXIgRm9ybWF0PSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoxLjE6bmFtZWlkLWZvcm1hdDp1bnNwZWNpZmllZCI+ZmZ4LWZmZS13Ny0xNS5jZ2lmZWRlcmFsLmNvbTwvc2FtbDI6SXNzdWVyPjxkczpTaWduYXR1cmUgeG1sbnM6ZHM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyMiPjxkczpTaWduZWRJbmZvPjxkczpDYW5vbmljYWxpemF0aW9uTWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMS8xMC94bWwtZXhjLWMxNG4jIi8+PGRzOlNpZ25hdHVyZU1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyNyc2Etc2hhMSIvPjxkczpSZWZlcmVuY2UgVVJJPSIjU2FtbEFzc2VydGlvbi1kYTVhYzhmYmVkY2JmNzBiYTRmMjU4NzFkNTdlODE2MyI+PGRzOlRyYW5zZm9ybXM+PGRzOlRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyNlbnZlbG9wZWQtc2lnbmF0dXJlIi8+PGRzOlRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMTAveG1sLWV4Yy1jMTRuIyIvPjwvZHM6VHJhbnNmb3Jtcz48ZHM6RGlnZXN0TWV0aG9kIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnI3NoYTEiLz48ZHM6RGlnZXN0VmFsdWU+dC9KUm85NEdrcXQ5bWs3TzE4Z0xObXV4elRnPTwvZHM6RGlnZXN0VmFsdWU+PC9kczpSZWZlcmVuY2U+PC9kczpTaWduZWRJbmZvPjxkczpTaWduYXR1cmVWYWx1ZT5uOVBwZzNYME9DYWJxWjA0ZUM2QkFqU25Pd3pSVWNHRHJ4SzVtcmVKd1Y4enE1YUF1UlFiem5tVWJmK1owLzZwNkc0RlpSQUxUWXlYY0MzV0ZkK244VS9JYnZMYVRJK2M5cEdSTzY5eDF0bjRINkV0SWlycWVWQ3M4LzV6K3RNdGlLNlNVQXFZVW9NTThtWTJQWHMyTUFpSXZFaHpWcDA1SmdUTHd1RDlYSDNSa2Q1dFFpeEVtWlRSNW9QNVVDWHJzTlBGNWZ2VGZVb2RhTk9jeDA3TWJCYzNRc25ldVZ2YTJYdmhMYjA4cS9NSXN0R1I2NHFWcUtQL3FQbnRteTA5UXMvK3VXSjNPQzZtVGZnTERTaWhYK3FiT0NValA2ZUV1eS84YUZCWTMxbU8rQVUyV3VyTXB3NG16OTJSWWo0UkxHSDZUZkhrZjFhLzJyaGhuaVFWM0E9PTwvZHM6U2lnbmF0dXJlVmFsdWU+PEtleUluZm8geG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyMiPjxYNTA5RGF0YT48WDUwOVN1YmplY3ROYW1lPkNOPWZmeC1mZmUtdzctMTUuY2dpZmVkZXJhbC5jb20sT1U9ZmZ4LE9VPWZmZSxPPWNnaWZlZGVyYWwsTD1IZXJuZG9uLFNUPVZBLEM9VVM8L1g1MDlTdWJqZWN0TmFtZT48WDUwOUNlcnRpZmljYXRlPk1JSURxVENDQXBHZ0F3SUJBZ0lFUmZYaGF6QU5CZ2txaGtpRzl3MEJBUXNGQURDQmhERUxNQWtHQTFVRUJoTUNWVk14Q3pBSkJnTlZCQWdUQWxaQk1SQXdEZ1lEVlFRSEV3ZElaWEp1Wkc5dU1STXdFUVlEVlFRS0V3cGpaMmxtWldSbGNtRnNNUXd3Q2dZRFZRUUxFd05tWm1VeEREQUtCZ05WQkFzVEEyWm1lREVsTUNNR0ExVUVBeE1jWm1aNExXWm1aUzEzTnkweE5TNWpaMmxtWldSbGNtRnNMbU52YlRBZUZ3MHhNekEwTVRneE9EQTBORGhhRncweU16QXlNalV4T0RBME5EaGFNSUdFTVFzd0NRWURWUVFHRXdKVlV6RUxNQWtHQTFVRUNCTUNWa0V4RURBT0JnTlZCQWNUQjBobGNtNWtiMjR4RXpBUkJnTlZCQW9UQ21ObmFXWmxaR1Z5WVd3eEREQUtCZ05WQkFzVEEyWm1aVEVNTUFvR0ExVUVDeE1EWm1aNE1TVXdJd1lEVlFRREV4eG1abmd0Wm1abExYYzNMVEUxTG1ObmFXWmxaR1Z5WVd3dVkyOXRNSUlCSWpBTkJna3Foa2lHOXcwQkFRRUZBQU9DQVE4QU1JSUJDZ0tDQVFFQXVYaVhoYlM0TmI5bklLQXhDNXJzVWsvYml2cHZzQ2NjNFFRYnFORytDRkZJUG5aaTFRVUFPbVVtN2NtL1BjbjJudm1YZjZQVExmaTNzVmdycHhmc04vM1RwQ0t4WVROODdmS2JFMGZRTExtTGpWRnU2cFVzVTdac0FjS2I2Ni9QeW5rb3dlVWJCaEFNZ1IxaDNRMDFTbkVjTjZlRDBENzUxTzcyMFlsVi9wY1pGelRkQWpVMkgyRUZSQVV4TzM5NSsvaU1Da205aUQrUGxiODRoeTNIaEJxSlV1TXIyS2xDRGdrTEhZYmtmVVdaYWJiTktrWldwNTFxKzVvZVJDS1hoQ1lqV1FHYnd4ZlFlbzBPRFY5NUlKZFdyeUZKQjhFNUNWa3dIYm83Z3VOaDVCQXpOR3RZaXgwVnJLSmt2WGQvbDBDUmk4ZDV5eWVSNTZiZGhTb09HUUlEQVFBQm95RXdIekFkQmdOVkhRNEVGZ1FVZWRhLzdwcTZpKzFpUnZHS01uSnVQMEZlWC9rd0RRWUpLb1pJaHZjTkFRRUxCUUFEZ2dFQkFCbjIvMDAzd1BvbmZHWCtnQWpTYVFDZHRucXMwRkFaQ2M3TkxFRTN0SlNtbWhIRjJNcjQ1UGtpQTAxZnN4VHFWOXJyZGZ5SXU3SnRsMFkzL3JWTEJ1WnlVZnRBV3hwQVp5RlQ2OE53MC9LemMxTnl5TTNUTjZlWVJTdmZPWkhCbHJ3S0NHMWlFeHFtRzN1Y1F0YXJFSnZZL0l0NlBNZFdiM1dMcUx6RC8vMkpiSUlqejlTcTg3VGtTUHZGeUR6clM3T2xtZU9nZk9IVjZ5VmpYRHpCOVhQUk1IbTlibzBxSlpHMWFwSTJNNlNwaDBpbUc4V28vZm1ZczFoV2RNcjl6NXVUdkI5ZzVBTEwvQVFPdndKQnZkVm8rcXN6T0F5Mnd2NHV1eTBlSW9KUk1ZTzdLSEVhVXFSYzVrYmVLd3J3NEkyaFV5c0lRd254WjVMME1hVHBvOFE9PC9YNTA5Q2VydGlmaWNhdGU+PC9YNTA5RGF0YT48L0tleUluZm8+PC9kczpTaWduYXR1cmU+PHNhbWwyOlN1YmplY3Q+PHNhbWwyOk5hbWVJRCBGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjEuMTpuYW1laWQtZm9ybWF0OnVuc3BlY2lmaWVkIiBOYW1lUXVhbGlmaWVyPSIiPmZmbTwvc2FtbDI6TmFtZUlEPjxzYW1sMjpTdWJqZWN0Q29uZmlybWF0aW9uIE1ldGhvZD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmNtOnNlbmRlci12b3VjaGVzIj48c2FtbDI6TmFtZUlEPkNOPWZmeC1mZmUtdzctMTUuY2dpZmVkZXJhbC5jb20sIE9VPWZmeCwgT1U9ZmZlLCBPPWNnaWZlZGVyYWwsIEw9SGVybmRvbiwgU1Q9VkEsIEM9VVM8L3NhbWwyOk5hbWVJRD48L3NhbWwyOlN1YmplY3RDb25maXJtYXRpb24+PC9zYW1sMjpTdWJqZWN0PjxzYW1sMjpDb25kaXRpb25zIE5vdEJlZm9yZT0iMjAxOS0xMC0xMFQxNDo1MzowNC4zNDlaIiBOb3RPbk9yQWZ0ZXI9IjIwMTktMTEtMTBUMDA6NTU6MDQuMzUwWiIvPjxzYW1sMjpBdHRyaWJ1dGVTdGF0ZW1lbnQ+PHNhbWwyOkF0dHJpYnV0ZSBOYW1lPSJGSVJTVE5BTUUiIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6dW5zcGVjaWZpZWQiPjxzYW1sMjpBdHRyaWJ1dGVWYWx1ZT5NaWNoYWVsPC9zYW1sMjpBdHRyaWJ1dGVWYWx1ZT48L3NhbWwyOkF0dHJpYnV0ZT48c2FtbDI6QXR0cmlidXRlIE5hbWU9IkNTUlVTRVJJRCIgTmFtZUZvcm1hdD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmF0dHJuYW1lLWZvcm1hdDp1bnNwZWNpZmllZCI+PHNhbWwyOkF0dHJpYnV0ZVZhbHVlPm1qYWNrc29uPC9zYW1sMjpBdHRyaWJ1dGVWYWx1ZT48L3NhbWwyOkF0dHJpYnV0ZT48c2FtbDI6QXR0cmlidXRlIE5hbWU9Ik1JRERMRU5BTUUiIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6dW5zcGVjaWZpZWQiPjxzYW1sMjpBdHRyaWJ1dGVWYWx1ZT5TTUlUSDwvc2FtbDI6QXR0cmlidXRlVmFsdWU+PC9zYW1sMjpBdHRyaWJ1dGU+PHNhbWwyOkF0dHJpYnV0ZSBOYW1lPSJMQVNUTkFNRSIgTmFtZUZvcm1hdD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOmF0dHJuYW1lLWZvcm1hdDp1bnNwZWNpZmllZCI+PHNhbWwyOkF0dHJpYnV0ZVZhbHVlPkphY2tzb248L3NhbWwyOkF0dHJpYnV0ZVZhbHVlPjwvc2FtbDI6QXR0cmlidXRlPjxzYW1sMjpBdHRyaWJ1dGUgTmFtZT0iVVNFUlJPTEUiIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6dW5zcGVjaWZpZWQiPjxzYW1sMjpBdHRyaWJ1dGVWYWx1ZT5OR0Q8L3NhbWwyOkF0dHJpYnV0ZVZhbHVlPjwvc2FtbDI6QXR0cmlidXRlPjwvc2FtbDI6QXR0cmlidXRlU3RhdGVtZW50PjxzYW1sMjpBdXRoblN0YXRlbWVudCBBdXRobkluc3RhbnQ9IjIwMTktMTAtMTBUMTQ6NTU6MDQuMzQ4WiI+PHNhbWwyOlN1YmplY3RMb2NhbGl0eSBBZGRyZXNzPSIxMjcuMC4wLjEiLz48c2FtbDI6QXV0aG5Db250ZXh0PjxzYW1sMjpBdXRobkNvbnRleHRDbGFzc1JlZj51cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YWM6Y2xhc3NlczpQYXNzd29yZDwvc2FtbDI6QXV0aG5Db250ZXh0Q2xhc3NSZWY+PC9zYW1sMjpBdXRobkNvbnRleHQ+PC9zYW1sMjpBdXRoblN0YXRlbWVudD48L3NhbWwyOkFzc2VydGlvbj48L3NhbWxwMjpSZXNwb25zZT4=";
		CUtil.type(By.xpath("//*[@id='samlCCR']"), SAML);

	}

	public void clickSubmit() {
		CUtil.click(By.xpath("//form[@id='ccrForm']//input[@value='Submit'][contains(@class,'btn-success')]"));
		CUtil.switchToWindow("window1");
	}

	public void initESD2() {
		String url = "file:///" + System.getProperty("user.dir") + "/src/test/resources/HTML files/Roles.html";
		System.out.println(url);
		CUtil.OpenBrowser(url);
		if (!flag) {
			CUtil.setMainWindow(driver.getWindowHandle());
			flag = false;
		}
		CUtil.waitForClickableElement(By.xpath("//*[@id='esdRole']"));
		CUtil.click(By.xpath("//*[@id='esdRole']"));
		CUtil.waitForVisibleElement(By.xpath("//input[@value='" + System.getProperty("environment") + "']"));
		CUtil.click(By.xpath("//input[@value='" + System.getProperty("environment") + "']"));
		String userName = CUtil.getText(By.xpath("//*[@id='esdTable']//tbody//tr[2]//td"));
		String passWord = CUtil.getText(By.xpath("//*[@id='esdTable']//tbody//tr[2]//td[2]"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		CUtil.click(By.xpath("//a[text()='Go to ESD']"));
		CUtil.switchToWindow("window3");
		CUtil.waitForVisibleElement(By.xpath("//*[@id='acceptButton']"));
		CUtil.click(By.xpath("//*[@id='acceptButton']"));
		CUtil.waitForVisibleElement(By.xpath("//*[@name='username']"));
		CUtil.type(By.xpath("//*[@name='username']"), userName);
		CUtil.click(By.xpath("//*[@id='buttonUserID']"));
		CUtil.waitForVisibleElement(By.xpath("//*[@name='password']"));
		CUtil.type(By.xpath("//*[@name='password']"), passWord);
		CUtil.click(By.xpath("//*[@id='buttonUserID']"));

	}

}
