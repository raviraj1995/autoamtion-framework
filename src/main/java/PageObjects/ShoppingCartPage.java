package PageObjects;

import org.openqa.selenium.By;

import TestBase.DriverFactory;

public class ShoppingCartPage {
	By quantityTextbox=By.xpath("(//input[@type=\"text\"])[1]");
	By updateBtn=By.xpath("//span[text()=\"Update\"]");
	By errorMsg=By.xpath("//p[@class=\"item-msg error\"]");
	By emptyCartLink=By.xpath("//span[text()=\"Empty Cart\"]");
	By emptyShoppingCartText=By.xpath("//h1[text()=\"Shopping Cart is Empty\"]");
	
	public void sendInputToQuantityTextbox(String quantity) {
		DriverFactory.getInstance().getDriver().findElement(quantityTextbox).clear();
		DriverFactory.getInstance().getDriver().findElement(quantityTextbox).sendKeys(quantity);
	}
	public void clickOnUpdateBtn() {
		DriverFactory.getInstance().getDriver().findElement(updateBtn).click();
	}
	public String getErrorMsg() {
		String errorMssg=DriverFactory.getInstance().getDriver().findElement(errorMsg).getText();
		return errorMssg;
	}
	public void clickOnEmptyCartLink() {
		DriverFactory.getInstance().getDriver().findElement(emptyCartLink).click();
	}
	public String getEmptyShoppingCartMsg() {
		String text=DriverFactory.getInstance().getDriver().findElement(emptyShoppingCartText).getText();
		return text;
	}

}
