package jewelry.com;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class TennisBraceletsFlow  extends FDUtils
{
    @Test(groups = "jewelry",  description = "Tested the flow of TennisBraceletsFlow. Selecting the Bracelet, adding to the cart, and completing the checkout flow.")
	public void tennisBracelets() throws InterruptedException
	{
		FDPageObjectData tennis=new FDPageObjectData(driver);
		
		tennis.jewelryNav();
		tennis.selectTennisNecklace();
		tennis.closePopUp();
		tennis.doubleClickReamazeWidget();
		tennis.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);
		tennis.selectRandomBandMaterial();
		tennis.tennisTotalLength();
		tennis.addToCartButton();
		tennis.proceedToCheckout();
		tennis.checkoutValidation();
		
	}

}
