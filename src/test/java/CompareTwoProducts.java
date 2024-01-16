import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Reusable.Utlity;
import Reusable.listen;
import TestBase.TestBase;
@Listeners(listen.class)
public class CompareTwoProducts extends TestBase {
	
	@Test
	public void verifyUserShouldBeAbleToCompareToProducts() {
		hPage.clickOnMobileLink();
		String testForIphoneOnMobilePage=mPage.textForIphoneOnMobilePage();
		String textForSonyXperiaOnMobilePage=mPage.textForSonyXperiaOnMobilePage();
		mPage.clickOnAddToCompareBtnForIphone();
		mPage.clickOnAddToCompareBtnForSonyXperia();
		mPage.clickOnCompareBtn();
		Utlity.windowHandle();
		String actaulText=mPage.textForPopUpWindowOpens();
		String expectedText="COMPARE PRODUCTS";
		Assert.assertEquals(actaulText, expectedText);
		Assert.assertEquals(testForIphoneOnMobilePage, mPage.textForIphoneOnPopupWindow());
		Assert.assertEquals(textForSonyXperiaOnMobilePage, mPage.textForSonyXperiaOnPopupWindow());
		mPage.clickOnCloseWindowBtn();
	}

}
