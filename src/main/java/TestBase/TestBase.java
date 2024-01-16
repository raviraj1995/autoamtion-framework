package TestBase;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Reusable.GetProperties;
import Reusable.PageInstances;

public class TestBase extends PageInstances{
	
	@BeforeMethod()
	public void launchApplication() {
		String browser=GetProperties.getProperty("browser");
		String url=GetProperties.getProperty("url");
		DriverFactory.getInstance().setDriver(BrowserFactory.getBrowser(browser));
		DriverFactory.getInstance().getDriver();
		DriverFactory.getInstance().getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		DriverFactory.getInstance().getDriver().manage().window().maximize();
		DriverFactory.getInstance().getDriver().get(url);
	}
	@AfterMethod()
	public void closeBrowser() {
		DriverFactory.getInstance().tearDown();
	}

}
