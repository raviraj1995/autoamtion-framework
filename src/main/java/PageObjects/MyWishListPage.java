package PageObjects;

import org.openqa.selenium.By;

import TestBase.DriverFactory;

public class MyWishListPage {
	By shareWishListBtn=By.name("save_and_share");
	By emailAddressTextbox=By.id("email_address");
	By msgTextbox=By.id("message");
	By shareWishListBtn1=By.xpath("//span[text()=\"Share Wishlist\"]");
	By textForWishListSharedSucessfully=By.xpath("//span[text()=\"Your Wishlist has been shared.\"]");
	
	public void clickOnShareWishListBtn() {
		DriverFactory.getInstance().getDriver().findElement(shareWishListBtn).click();
	}
	public void enterEmail(String email) {
		DriverFactory.getInstance().getDriver().findElement(emailAddressTextbox).sendKeys(email);
	}
	public void enterMsg(String msg) {
		DriverFactory.getInstance().getDriver().findElement(msgTextbox).sendKeys(msg);
	}
	public void clickOnShareWishListBtn1() {
		DriverFactory.getInstance().getDriver().findElement(shareWishListBtn1).click();
	}
	public String getTextForWishListHasBeenSharedSucessfully() {
		String text=DriverFactory.getInstance().getDriver().findElement(textForWishListSharedSucessfully).getText();
		return text;
	}

}
