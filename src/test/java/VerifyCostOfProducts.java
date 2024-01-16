import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Reusable.listen;
import TestBase.TestBase;
@Listeners(listen.class)
public class VerifyCostOfProducts extends TestBase {
	
	@Test
	public void verifyCostOfProductOnListPageAndDetalisPageIsEqual() {
		hPage.clickOnMobileLink();
		String actaulCost=mPage.costOfSonyXperiaOnMobilePage();
		mPage.clickOnSonyXperiaMobileLink();
		String expectedCost="$100.000";
		Assert.assertEquals(actaulCost, expectedCost);
		
	}

}
