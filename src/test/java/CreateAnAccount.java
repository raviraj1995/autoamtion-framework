import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Reusable.Utlity;
import Reusable.listen;
import TestBase.TestBase;
@Listeners(listen.class)
public class CreateAnAccount extends TestBase {
	
	@DataProvider()
	public Object[][] getTestData(){
		Object [][] data=null;
		try{ data =Utlity.getTestData("Sheet1");
		
		}catch(NullPointerException e) {
			
		}return data;
	}
	
	@Test(dataProvider="getTestData")
	public void verifyUserIsAbleToCreateAnAccountandShareTheWishList(String firstName,String middleName,String lastName,String emailId,String password,String confirmPass) {
		hPage.clickOnMyAccountLink();
		customerLoginPage.clickOnCreateAnAccountLink();
		createAnAccountPage.createAnAccount(firstName, middleName, lastName, emailId, password, confirmPass);
		createAnAccountPage.clickOnRegisterBtn();
		String actualText=myAccountPage.getTextForAccountRegistrationCompleted();
		String expected="Thank you for registering with Main Website Store.";
		Assert.assertEquals(actualText, expected);
		myAccountPage.clickOnTvLink();
		tvPage.clickOnAddToWishlistForLgTv();
		myWishListPage.clickOnShareWishListBtn();
		myWishListPage.enterEmail("ravirajdarshale582@gmail.com");
		myWishListPage.enterMsg("wishlist has been shared.");
		myWishListPage.clickOnShareWishListBtn1();
		String actualText1=myWishListPage.getTextForWishListHasBeenSharedSucessfully();
		String expectedText="Your Wishlist has been shared.";
		Assert.assertEquals(actualText1, expectedText);
		
		
	}
	

}
