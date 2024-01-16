package PageObjects;

import org.openqa.selenium.By;

import TestBase.DriverFactory;

public class MyAccountPage {
	By accountRegistrationMsg=By.xpath("//span[text()=\"Thank you for registering with Main Website Store.\"]");
	By tvLink=By.xpath("//a[text()=\"TV\"]");
	
	
	public String getTextForAccountRegistrationCompleted() {
		String text=DriverFactory.getInstance().getDriver().findElement(accountRegistrationMsg).getText();
		return text;
	}
	
	public void clickOnTvLink() {
		DriverFactory.getInstance().getDriver().findElement(tvLink).click();
	}

}
