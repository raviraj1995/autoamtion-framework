package PageObjects;

import org.openqa.selenium.By;

import TestBase.DriverFactory;

public class SonyXperiaMobilePage {
     By costOfSonyXperiaOnDetailsPage=By.xpath("//span[text()=\"$100.00\"]");
     
     public String getCostOfSonyXperiaOnDetailsPage() {
    	 String cost=DriverFactory.getInstance().getDriver().findElement(costOfSonyXperiaOnDetailsPage).getText();
    	 return cost;
     }
}
