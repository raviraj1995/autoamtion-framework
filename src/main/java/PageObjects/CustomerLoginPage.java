package PageObjects;

import org.openqa.selenium.By;

import TestBase.DriverFactory;

public class CustomerLoginPage {
	By createAnAccountLink=By.xpath("//span[text()=\"Create an Account\"]");
	
	
	
	public void clickOnCreateAnAccountLink() {
		DriverFactory.getInstance().getDriver().findElement(createAnAccountLink).click();
	}
	
	

}
