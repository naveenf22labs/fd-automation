package jewelry.com;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class GiftGuide extends FDUtils
{
    @Test(groups = "jewelry", description ="Tested the flow of Gift guide. Selecting the gift guide product, adding to cart, and completing checkout flow.")
	public void giftGuideFlow() throws InterruptedException
	{
          FDPageObjectData gift= new FDPageObjectData(driver);
    	
    	gift.jewelryNav();
    	gift.giftGuide();
    	gift.closePopUp();
    	gift.doubleClickReamazeWidget();
    	gift.selectGiftGuidePlp();
    	gift.addToCartButton();
        Thread.sleep(3000);
        gift.proceedToCheckout();
        gift.checkoutValidation();
    	
	}

}
