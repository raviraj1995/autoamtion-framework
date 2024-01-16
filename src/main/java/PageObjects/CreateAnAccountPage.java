package PageObjects;

import org.openqa.selenium.By;

import TestBase.DriverFactory;

public class CreateAnAccountPage {
	By firstNameTextbox=By.id("firstname");
	By middleNameTextbox=By.id("middlename");
	By lastNameTextbox=By.id("lastname");
	By emailIdTextbox=By.id("email_address");
	By passwordTextbox=By.id("password");
	By confirmPassTextbox=By.id("confirmation");
	By registerBtn=By.xpath("//span[text()=\"Register\"]");
	
	
	public void createAnAccount(String firstName,String middleName,String lastName,String emailId,String password,String confirmPass) {
		DriverFactory.getInstance().getDriver().findElement(firstNameTextbox).sendKeys(firstName);
		DriverFactory.getInstance().getDriver().findElement(middleNameTextbox).sendKeys(middleName);
		DriverFactory.getInstance().getDriver().findElement(lastNameTextbox).sendKeys(lastName);
		DriverFactory.getInstance().getDriver().findElement(emailIdTextbox).sendKeys(emailId);
		DriverFactory.getInstance().getDriver().findElement(passwordTextbox).sendKeys(password);
		DriverFactory.getInstance().getDriver().findElement(confirmPassTextbox).sendKeys(confirmPass);
	}
	public void clickOnRegisterBtn() {
		DriverFactory.getInstance().getDriver().findElement(registerBtn).click();
	}

}
ravirak
