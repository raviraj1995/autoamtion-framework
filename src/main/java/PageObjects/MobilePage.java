package PageObjects;

import org.openqa.selenium.By;

import TestBase.DriverFactory;

public class MobilePage {
	By costOfSonyXperia=By.xpath("//span[text()=\"$100.00\"]");
	By sonyXperiaLink=By.xpath("//a[text()=\"Sony Xperia\"]");
	By addToCartBtnForSonyXperia=By.xpath("//a[text()=\"Sony Xperia\"]//following::div[3]//following::span[1]/following::div[1]/button/span");
	By addToCompareBtnForIphone=By.xpath("(//a[text()=\"IPhone\"]//following::button[1]//following-sibling::ul/li/following::li/a)[1]");
	By addToCompareForSonyXperia=By.xpath("(//a[text()=\"Sony Xperia\"]//following::button[1]//following-sibling::ul/li/following::li/a)[1]");
	By compareBtn=By.xpath("//span[text()=\"Compare\"]");
	By popUpWindowText=By.xpath("//h1[text()=\"Compare Products\"]");
	By textForSonyXperiaOnPopUpWindow=By.xpath("//a[text()=\"Sony Xperia\"]");
	By textForIphoneOnPopupWindow=By.xpath("//a[text()=\"IPhone\"]");
	By textForIphoneOnMobilePage=By.xpath("(//a[text()=\"IPhone\"])[1]");
	By textForSonyXperiaOnMobilePage=By.xpath("(//a[text()=\"Sony Xperia\"])[1]");
	By closeWindowBtn=By.xpath("//span[text()=\"Close Window\"]");
	
	
	
	
	public String costOfSonyXperiaOnMobilePage() {
		String costOfSonyXperiaa=DriverFactory.getInstance().getDriver().findElement(costOfSonyXperia).getText();
		return costOfSonyXperiaa;
	}
	public void clickOnSonyXperiaMobileLink() {
		DriverFactory.getInstance().getDriver().findElement(sonyXperiaLink).click();
	}
	public void clickOnAddToCartForSonyXperiaBtn() {
		DriverFactory.getInstance().getDriver().findElement(addToCartBtnForSonyXperia).click();
	}
	public void clickOnAddToCartBtnForIphone() {
		DriverFactory.getInstance().getDriver().findElement(addToCompareBtnForIphone).click();
	}
	public void clickOnAddToCartBtnForSonyXperia() {
		DriverFactory.getInstance().getDriver().findElement(addToCompareForSonyXperia).click();
	}
	public void clickOnCompareBtn() {
		DriverFactory.getInstance().getDriver().findElement(compareBtn).click();
	}
	public String textForPopUpWindowOpens() {
		String text=DriverFactory.getInstance().getDriver().findElement(popUpWindowText).getText();
		return text;
	}
	public String textForSonyXperiaOnPopupWindow() {
		String text=DriverFactory.getInstance().getDriver().findElement(textForSonyXperiaOnPopUpWindow).getText();
		return text;
	}
	public String textForIphoneOnPopupWindow() {
		String text=DriverFactory.getInstance().getDriver().findElement(textForIphoneOnPopupWindow).getText();
		return text;
	}
	public String textForIphoneOnMobilePage() {
		String text=DriverFactory.getInstance().getDriver().findElement(textForIphoneOnMobilePage).getText();
		return text;
	}
	public String textForSonyXperiaOnMobilePage() {
		String text=DriverFactory.getInstance().getDriver().findElement(textForSonyXperiaOnMobilePage).getText();
		return text;
	}
	public void clickOnCloseWindowBtn() {
		DriverFactory.getInstance().getDriver().findElement(closeWindowBtn).click();
	}
	public void clickOnAddToCompareBtnForIphone() {
		DriverFactory.getInstance().getDriver().findElement(addToCompareBtnForIphone).click();
	}
	public void clickOnAddToCompareBtnForSonyXperia() {
		DriverFactory.getInstance().getDriver().findElement(addToCompareForSonyXperia).click();
	}
	

}
