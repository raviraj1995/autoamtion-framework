package TestBase;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	private DriverFactory() {
		
	}
	private static DriverFactory instance=new DriverFactory();
	
	public static DriverFactory getInstance() {
		return instance;
	}
	
	ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	
	public void setDriver(WebDriver driverParameter) {
		driver.set(driverParameter);
	}
	public WebDriver getDriver() {
		return driver.get();
	}
	public void tearDown() {
		driver.get().quit();
		driver.remove();
	}
	
	

}
