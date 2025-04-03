package weddings.library.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class EternityBand extends FDUtils
{
	
	@Test
	public void eternityBandFlow() throws InterruptedException
	{
    	FDPageObjectData eternityBand= new FDPageObjectData((ChromeDriver) driver);

    	eternityBand.clickWeddingLink();
    	eternityBand.selectEternityBand();
   	    eternityBand.closePopUp();
   	 eternityBand.doubleClickReamazeWidget();
   	     eternityBand.clickRandomProduct();
    //	eternityBand.selectDiamondBandProduct();
    	
    	eternityBand.addToCartButton();
    	eternityBand.proceedToCheckout();
    	eternityBand.checkoutValidation();
    	
    	
    	
	}

}
