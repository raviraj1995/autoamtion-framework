import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Reusable.listen;
import TestBase.TestBase;
@Listeners(listen.class)
public class ErrorVerification extends TestBase{
	
	@Test
	public void verifyErrorMsg() {
		hPage.clickOnMobileLink();
		mPage.clickOnAddToCartForSonyXperiaBtn();
		shoppingCartPage.sendInputToQuantityTextbox("1000");
		shoppingCartPage.clickOnUpdateBtn();
		String actualMsg=shoppingCartPage.getErrorMsg();
		String expectedText="\r\n"
				+ "                * The maximum quantity allowed for purchase is 500.            ";
		Assert.assertEquals(actualMsg, expectedText);
		
	}
	@Test
	public void verifyCartIsEmpty() {
		hPage.clickOnMobileLink();
		mPage.clickOnAddToCartForSonyXperiaBtn();
		shoppingCartPage.sendInputToQuantityTextbox("1000");
		shoppingCartPage.clickOnUpdateBtn();
		shoppingCartPage.clickOnEmptyCartLink();
		String actualMsg=shoppingCartPage.getEmptyShoppingCartMsg();
		String expected="Shopping Cart is Empty";
		Assert.assertEquals(actualMsg, expected);

	}

}
