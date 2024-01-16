package PageObjects;

import org.openqa.selenium.By;

import TestBase.DriverFactory;

public class HomePage {
	By mobileLink=By.xpath("//a[text()=\"Mobile\"]");
	By myAccountLink=By.xpath("(//a[text()=\"My Account\"])[2]");
	
	
	
	
	
	
	public void clickOnMobileLink() {
		DriverFactory.getInstance().getDriver().findElement(mobileLink).click();
	}
	public void clickOnMyAccountLink() {
		DriverFactory.getInstance().getDriver().findElement(myAccountLink).click();
	}

}
