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
		String url = "file:///" + System.getProperty("user.dir") + "/src/test/resources/HTML files/Environments.html";
		System.out.println(url);
		CUtil.OpenBrowser(url);
		if (!flag) {
			CUtil.setMainWindow(driver.getWindowHandle());
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
			e.printStackTrace();
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

	public static void initCCR() {
		String url = "file:///" + System.getProperty("user.dir") + "/src/test/resources/HTML files/Environments.html";
		System.out.println(url);
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
		String SAML = "PHNhbWxwMjpSZXNwb25zZSBJRD0iUmVzcG9uc2VJZF9lMjI4MDhjZGNhYzg4ZGI2YWM3YWQwOThmMzIzZTNhNCIgSXNzdWVJbnN0YW50PSIyMDE5LTA5LTA5VDE0OjU0OjEwLjQ3NFoiIFZlcnNpb249IjIuMCIgeG1sbnM6c2FtbDI9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphc3NlcnRpb24iIHhtbG5zOnNhbWxwMj0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6Mi4wOnByb3RvY29sIj48c2FtbDI6SXNzdWVyPmUxdGFyZGVhY2FnMDE8L3NhbWwyOklzc3Vlcj48ZHM6U2lnbmF0dXJlIHhtbG5zOmRzPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjIj48ZHM6U2lnbmVkSW5mbz48ZHM6Q2Fub25pY2FsaXphdGlvbk1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMTAveG1sLWV4Yy1jMTRuIyIvPjxkczpTaWduYXR1cmVNZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjcnNhLXNoYTEiLz48ZHM6UmVmZXJlbmNlIFVSST0iI1Jlc3BvbnNlSWRfZTIyODA4Y2RjYWM4OGRiNmFjN2FkMDk4ZjMyM2UzYTQiPjxkczpUcmFuc2Zvcm1zPjxkczpUcmFuc2Zvcm0gQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjZW52ZWxvcGVkLXNpZ25hdHVyZSIvPjxkczpUcmFuc2Zvcm0gQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzEwL3htbC1leGMtYzE0biMiLz48L2RzOlRyYW5zZm9ybXM+PGRzOkRpZ2VzdE1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyNzaGExIi8+PGRzOkRpZ2VzdFZhbHVlPlplOXdRNXZhR2RyYkZuUGNzYWFBeDBoQ0R3QT08L2RzOkRpZ2VzdFZhbHVlPjwvZHM6UmVmZXJlbmNlPjwvZHM6U2lnbmVkSW5mbz48ZHM6U2lnbmF0dXJlVmFsdWU+SmNmeGVQVFhzdFdSbHFFWWUvU3QzVnA2N2hkK3lrRkFiQ0dhSUs2RVc4ZTI5K0YyTnZxbHRNVVh4c0dwaFVGMEUrVWxzcVBsa0ZGUXdSSVNXRGhrTmlUdVc4a0NMSWtDN0dPK2pWdHJXL0xVOEl4VVZEc3hQcHc3ZUpCanpnaUZncVhZYktOajRzYWNFam5RR1U4bkhOVjNEZTJ3RTlYN1FJNVZ4VG9WVHd3cE15dWsvbUhWd0JMazBmTVdVQmc0bU53bldXZlBLR0NKNURJOFRqRU5IaDlnR2NjelVidGR0U1gybHZoNFhtdzc0NTRlN3o3OXZKaCtwVDFyZUVUTkJXUnl0ai9MSnE2TjBpUmZETTRaVTREZXhTS3JxSEJvSGdTZjVwSzVFU1NQMHcyTFJFT1BXWllSeXVhdW1QTnlsUktuUDVFRXJoMnNnTkhnYVc3dERBPT08L2RzOlNpZ25hdHVyZVZhbHVlPjxkczpLZXlJbmZvPjxkczpYNTA5RGF0YT48ZHM6WDUwOUNlcnRpZmljYXRlPk1JSUM5RENDQWR5Z0F3SUJBZ0lJYm5IbHlSQ05uNUV3RFFZSktvWklodmNOQVFFTUJRQXdHREVXTUJRR0ExVUVBeE1OWlRGMFlYSmtaV0ZqWVdjd01UQWVGdzB4T1RBek1EVXhOVE0xTkRGYUZ3MHlPVEF6TURJeE5UTTFOREZhTUJneEZqQVVCZ05WQkFNVERXVXhkR0Z5WkdWaFkyRm5NREV3Z2dFaU1BMEdDU3FHU0liM0RRRUJBUVVBQTRJQkR3QXdnZ0VLQW9JQkFRQ0dlUjd5dXpoK2w4RXBzcWJ4dGltVldzcmdrNnBQTUExUVZraXZGMTcxb0QxazMzQnlqYm10bVIrM3pWa1FGTWxENWI1cjNlakRRYUVVMnc4N3pINXRUOEdxZ2M0V1cxc3g4cytXRWJzMFpaRzVtcUh1YTZtdnd2N2s3d005ZFJ1OU1tUGJpWGg3SlN6c3lYVHdCRHp2ZFlIbkhobDdvWUs3WDZLTCsxYWZ5UlVsN29yc3oxY3VJbncyK25XRk9TazBUbFE3ZDJxTVhvY1dGQk5RM01kVjZQNy9USkk0VFpjYUhPTUZGcGd6a2N5d2F6QTJmTEo0OHFoM1M3MC9RdXhUalRybll2Q0llZHA3eG5VRmdvNHVZM1dEMVp4SXU3MzFuRm5uZnE4SmN4Y0hJNkM4eWh0d2dYMy9NT3E1T213UXg1eFN1dFZ3SlNrQjRVZ3M2OG5KQWdNQkFBR2pRakJBTUIwR0ExVWREZ1FXQkJUSGJZNWRmTEtUeHRSOTBLc2JPQ1U4ZCt3Y3NUQWZCZ05WSFNNRUdEQVdnQlRIYlk1ZGZMS1R4dFI5MEtzYk9DVThkK3djc1RBTkJna3Foa2lHOXcwQkFRd0ZBQU9DQVFFQVRiT20rMFZWdW5xck5tdGU1NjJ2bDhVQlJ3OWNGV0t3ZmsyU3IwQ1RvZW9UUnFwNmZLL0c2dWp2bnVkdnBmcVFIQmdVYXB6QnFNRjRnNHhWSGREZlRnd203N2lReEdBL3RmdnBYZTZud0VZZkZ5YjFteUFjc0RzRVVxTE5mRnVwTE5UY3l3Ui9hVEVCQVFob0VUcGdlZERXOVJveTRubXZPL2I2ZzJNeWZMYjkvZ3ZwZUwxVS9zSnE1bkMyQk5pUytVVkRzT3JHOGJPeXVvUjNFenV4OFVCRUtSTHQyUFczdlBIbW4xcEhoc1RkY3B0bDJ5b0R6VGk1RmozMU1Kb1lic2JtdnFITEVGODcwOUV2WXU0eWJNRFQxOXpXazlERkJvbzZ2L0V0emVBZFhVb3A1S2VhOTZIQS91S3N2d1QrcVJVUHQ4Zk11cTNvQ2gyL1MxMnBTUT09PC9kczpYNTA5Q2VydGlmaWNhdGU+PC9kczpYNTA5RGF0YT48L2RzOktleUluZm8+PC9kczpTaWduYXR1cmU+PHNhbWxwMjpTdGF0dXM+PHNhbWxwMjpTdGF0dXNDb2RlIFZhbHVlPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6c3RhdHVzOlN1Y2Nlc3MiLz48c2FtbHAyOlN0YXR1c01lc3NhZ2U+U3VjY2Vzczwvc2FtbHAyOlN0YXR1c01lc3NhZ2U+PC9zYW1scDI6U3RhdHVzPjxzYW1sMjpBc3NlcnRpb24gSUQ9IlNhbWxBc3NlcnRpb24tODZlZGFlNjhhMDA0NGQyYmQwZTM2MDFkMmI3YzBjNzkiIElzc3VlSW5zdGFudD0iMjAxOS0wOS0wOVQxNDo1NDoxMC40NjVaIiBWZXJzaW9uPSIyLjAiIHhtbG5zOnNhbWwyPSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YXNzZXJ0aW9uIj48c2FtbDI6SXNzdWVyIEZvcm1hdD0idXJuOm9hc2lzOm5hbWVzOnRjOlNBTUw6MS4xOm5hbWVpZC1mb3JtYXQ6dW5zcGVjaWZpZWQiPmZmeC1mZmUtdzctMTUuY2dpZmVkZXJhbC5jb208L3NhbWwyOklzc3Vlcj48ZHM6U2lnbmF0dXJlIHhtbG5zOmRzPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjIj48ZHM6U2lnbmVkSW5mbz48ZHM6Q2Fub25pY2FsaXphdGlvbk1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMTAveG1sLWV4Yy1jMTRuIyIvPjxkczpTaWduYXR1cmVNZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjcnNhLXNoYTEiLz48ZHM6UmVmZXJlbmNlIFVSST0iI1NhbWxBc3NlcnRpb24tODZlZGFlNjhhMDA0NGQyYmQwZTM2MDFkMmI3YzBjNzkiPjxkczpUcmFuc2Zvcm1zPjxkczpUcmFuc2Zvcm0gQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjZW52ZWxvcGVkLXNpZ25hdHVyZSIvPjxkczpUcmFuc2Zvcm0gQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzEwL3htbC1leGMtYzE0biMiLz48L2RzOlRyYW5zZm9ybXM+PGRzOkRpZ2VzdE1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvMDkveG1sZHNpZyNzaGExIi8+PGRzOkRpZ2VzdFZhbHVlPmlzVmJ0Wmp1SnRFSm5SSkxHcnFLaVF1OUoyZz08L2RzOkRpZ2VzdFZhbHVlPjwvZHM6UmVmZXJlbmNlPjwvZHM6U2lnbmVkSW5mbz48ZHM6U2lnbmF0dXJlVmFsdWU+SHk4MW5KYWg5dm1zOWdaM1greU42UCt5M3kvZW81WGo0aU5KeGt0RXdTcFdLYlNIZmthalpNOGtxdVlkMGMwSGpiNDN1d0swcnVIYlVnRzlDY2JmTEh0MGZYekx6STB6UytPdTRlUlNVMXJ4Y1FWTXZQT3dhMWZoVDFoUDdSbTBFdTFaTkFvVTVOaFU2RlNFR2FtZitZeUJYZmZ6dExWV3pLeEV0azRORTdleWVvZTRQcWFiUHNQTTFUSGFNblN3VWxWUUtFd3ViTnZNYThWRFpzc1RvSUxpcFVyWDIxUjE2NVExK2JVNEM5cmhCY09vQlVqUk9VUUp2SnZpL3pvOGpxeFFjLzJOdEtqa01OSDR6cDc2ZzJKOTBGdmVrcjJRWHQ0L3M4WU9DQWkwWG1pTy82dE1oZWp5TzNhVzdibDYwaWZSWFJ5aUZ6UzZOSHFTOWMyd2ZBPT08L2RzOlNpZ25hdHVyZVZhbHVlPjxLZXlJbmZvIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjIj48WDUwOURhdGE+PFg1MDlTdWJqZWN0TmFtZT5DTj1mZngtZmZlLXc3LTE1LmNnaWZlZGVyYWwuY29tLE9VPWZmeCxPVT1mZmUsTz1jZ2lmZWRlcmFsLEw9SGVybmRvbixTVD1WQSxDPVVTPC9YNTA5U3ViamVjdE5hbWU+PFg1MDlDZXJ0aWZpY2F0ZT5NSUlEcVRDQ0FwR2dBd0lCQWdJRVJmWGhhekFOQmdrcWhraUc5dzBCQVFzRkFEQ0JoREVMTUFrR0ExVUVCaE1DVlZNeEN6QUpCZ05WQkFnVEFsWkJNUkF3RGdZRFZRUUhFd2RJWlhKdVpHOXVNUk13RVFZRFZRUUtFd3BqWjJsbVpXUmxjbUZzTVF3d0NnWURWUVFMRXdObVptVXhEREFLQmdOVkJBc1RBMlptZURFbE1DTUdBMVVFQXhNY1ptWjRMV1ptWlMxM055MHhOUzVqWjJsbVpXUmxjbUZzTG1OdmJUQWVGdzB4TXpBME1UZ3hPREEwTkRoYUZ3MHlNekF5TWpVeE9EQTBORGhhTUlHRU1Rc3dDUVlEVlFRR0V3SlZVekVMTUFrR0ExVUVDQk1DVmtFeEVEQU9CZ05WQkFjVEIwaGxjbTVrYjI0eEV6QVJCZ05WQkFvVENtTm5hV1psWkdWeVlXd3hEREFLQmdOVkJBc1RBMlptWlRFTU1Bb0dBMVVFQ3hNRFptWjRNU1V3SXdZRFZRUURFeHhtWm5ndFptWmxMWGMzTFRFMUxtTm5hV1psWkdWeVlXd3VZMjl0TUlJQklqQU5CZ2txaGtpRzl3MEJBUUVGQUFPQ0FROEFNSUlCQ2dLQ0FRRUF1WGlYaGJTNE5iOW5JS0F4QzVyc1VrL2JpdnB2c0NjYzRRUWJxTkcrQ0ZGSVBuWmkxUVVBT21VbTdjbS9QY24ybnZtWGY2UFRMZmkzc1ZncnB4ZnNOLzNUcENLeFlUTjg3ZktiRTBmUUxMbUxqVkZ1NnBVc1U3WnNBY0tiNjYvUHlua293ZVViQmhBTWdSMWgzUTAxU25FY042ZUQwRDc1MU83MjBZbFYvcGNaRnpUZEFqVTJIMkVGUkFVeE8zOTUrL2lNQ2ttOWlEK1BsYjg0aHkzSGhCcUpVdU1yMktsQ0Rna0xIWWJrZlVXWmFiYk5La1pXcDUxcSs1b2VSQ0tYaENZaldRR2J3eGZRZW8wT0RWOTVJSmRXcnlGSkI4RTVDVmt3SGJvN2d1Tmg1QkF6Tkd0WWl4MFZyS0prdlhkL2wwQ1JpOGQ1eXllUjU2YmRoU29PR1FJREFRQUJveUV3SHpBZEJnTlZIUTRFRmdRVWVkYS83cHE2aSsxaVJ2R0tNbkp1UDBGZVgva3dEUVlKS29aSWh2Y05BUUVMQlFBRGdnRUJBQm4yLzAwM3dQb25mR1grZ0FqU2FRQ2R0bnFzMEZBWkNjN05MRUUzdEpTbW1oSEYyTXI0NVBraUEwMWZzeFRxVjlycmRmeUl1N0p0bDBZMy9yVkxCdVp5VWZ0QVd4cEFaeUZUNjhOdzAvS3pjMU55eU0zVE42ZVlSU3ZmT1pIQmxyd0tDRzFpRXhxbUczdWNRdGFyRUp2WS9JdDZQTWRXYjNXTHFMekQvLzJKYklJano5U3E4N1RrU1B2RnlEenJTN09sbWVPZ2ZPSFY2eVZqWER6QjlYUFJNSG05Ym8wcUpaRzFhcEkyTTZTcGgwaW1HOFdvL2ZtWXMxaFdkTXI5ejV1VHZCOWc1QUxML0FRT3Z3SkJ2ZFZvK3Fzek9BeTJ3djR1dXkwZUlvSlJNWU83S0hFYVVxUmM1a2JlS3dydzRJMmhVeXNJUXdueFo1TDBNYVRwbzhRPTwvWDUwOUNlcnRpZmljYXRlPjwvWDUwOURhdGE+PC9LZXlJbmZvPjwvZHM6U2lnbmF0dXJlPjxzYW1sMjpTdWJqZWN0PjxzYW1sMjpOYW1lSUQgRm9ybWF0PSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoxLjE6bmFtZWlkLWZvcm1hdDp1bnNwZWNpZmllZCIgTmFtZVF1YWxpZmllcj0iIj5mZm08L3NhbWwyOk5hbWVJRD48c2FtbDI6U3ViamVjdENvbmZpcm1hdGlvbiBNZXRob2Q9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDpjbTpzZW5kZXItdm91Y2hlcyI+PHNhbWwyOk5hbWVJRD5DTj1mZngtZmZlLXc3LTE1LmNnaWZlZGVyYWwuY29tLCBPVT1mZngsIE9VPWZmZSwgTz1jZ2lmZWRlcmFsLCBMPUhlcm5kb24sIFNUPVZBLCBDPVVTPC9zYW1sMjpOYW1lSUQ+PC9zYW1sMjpTdWJqZWN0Q29uZmlybWF0aW9uPjwvc2FtbDI6U3ViamVjdD48c2FtbDI6Q29uZGl0aW9ucyBOb3RCZWZvcmU9IjIwMTktMDktMDlUMTQ6NTI6MTAuNDY1WiIgTm90T25PckFmdGVyPSIyMDE5LTEwLTEwVDAwOjU0OjEwLjQ2NVoiLz48c2FtbDI6QXR0cmlidXRlU3RhdGVtZW50PjxzYW1sMjpBdHRyaWJ1dGUgTmFtZT0iRklSU1ROQU1FIiBOYW1lRm9ybWF0PSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YXR0cm5hbWUtZm9ybWF0OnVuc3BlY2lmaWVkIj48c2FtbDI6QXR0cmlidXRlVmFsdWU+TWljaGFlbDwvc2FtbDI6QXR0cmlidXRlVmFsdWU+PC9zYW1sMjpBdHRyaWJ1dGU+PHNhbWwyOkF0dHJpYnV0ZSBOYW1lPSJDU1JVU0VSSUQiIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6dW5zcGVjaWZpZWQiPjxzYW1sMjpBdHRyaWJ1dGVWYWx1ZT5tamFja3Nvbjwvc2FtbDI6QXR0cmlidXRlVmFsdWU+PC9zYW1sMjpBdHRyaWJ1dGU+PHNhbWwyOkF0dHJpYnV0ZSBOYW1lPSJNSURETEVOQU1FIiBOYW1lRm9ybWF0PSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YXR0cm5hbWUtZm9ybWF0OnVuc3BlY2lmaWVkIj48c2FtbDI6QXR0cmlidXRlVmFsdWU+U01JVEg8L3NhbWwyOkF0dHJpYnV0ZVZhbHVlPjwvc2FtbDI6QXR0cmlidXRlPjxzYW1sMjpBdHRyaWJ1dGUgTmFtZT0iTEFTVE5BTUUiIE5hbWVGb3JtYXQ9InVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphdHRybmFtZS1mb3JtYXQ6dW5zcGVjaWZpZWQiPjxzYW1sMjpBdHRyaWJ1dGVWYWx1ZT5KYWNrc29uPC9zYW1sMjpBdHRyaWJ1dGVWYWx1ZT48L3NhbWwyOkF0dHJpYnV0ZT48c2FtbDI6QXR0cmlidXRlIE5hbWU9IlVTRVJST0xFIiBOYW1lRm9ybWF0PSJ1cm46b2FzaXM6bmFtZXM6dGM6U0FNTDoyLjA6YXR0cm5hbWUtZm9ybWF0OnVuc3BlY2lmaWVkIj48c2FtbDI6QXR0cmlidXRlVmFsdWU+TkdEPC9zYW1sMjpBdHRyaWJ1dGVWYWx1ZT48L3NhbWwyOkF0dHJpYnV0ZT48L3NhbWwyOkF0dHJpYnV0ZVN0YXRlbWVudD48c2FtbDI6QXV0aG5TdGF0ZW1lbnQgQXV0aG5JbnN0YW50PSIyMDE5LTA5LTA5VDE0OjU0OjEwLjQ2NVoiPjxzYW1sMjpTdWJqZWN0TG9jYWxpdHkgQWRkcmVzcz0iMTAuMjMyLjMzLjE3MCIvPjxzYW1sMjpBdXRobkNvbnRleHQ+PHNhbWwyOkF1dGhuQ29udGV4dENsYXNzUmVmPnVybjpvYXNpczpuYW1lczp0YzpTQU1MOjIuMDphYzpjbGFzc2VzOlBhc3N3b3JkPC9zYW1sMjpBdXRobkNvbnRleHRDbGFzc1JlZj48L3NhbWwyOkF1dGhuQ29udGV4dD48L3NhbWwyOkF1dGhuU3RhdGVtZW50Pjwvc2FtbDI6QXNzZXJ0aW9uPjwvc2FtbHAyOlJlc3BvbnNlPg==";
		CUtil.type(By.xpath("//*[@id='samlCCR']"), SAML);

	}

	public void clickSubmit() {
		CUtil.click(By.xpath("//form[@id='ccrForm']//input[@value='Submit'][contains(@class,'btn-success')]"));
		CUtil.switchToWindow("window1");
	}

}
