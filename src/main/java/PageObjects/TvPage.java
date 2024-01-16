package PageObjects;

import org.openqa.selenium.By;

import TestBase.DriverFactory;

public class TvPage {
	By addToWishlistBtnForLgTv=By.xpath("((//a[@title=\"LG LCD\"])[2]/following::div[5]/button//following::ul[1]/li/a)[1]");
	
	public void clickOnAddToWishlistForLgTv() {
		DriverFactory.getInstance().getDriver().findElement(addToWishlistBtnForLgTv).click();
	}
	

}
