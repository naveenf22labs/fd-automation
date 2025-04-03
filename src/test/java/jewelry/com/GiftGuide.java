package jewelry.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class GiftGuide extends FDUtils
{
	@Test
	public void giftGuideFlow() throws InterruptedException
	{
          FDPageObjectData gift= new FDPageObjectData((ChromeDriver) driver);
    	
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
