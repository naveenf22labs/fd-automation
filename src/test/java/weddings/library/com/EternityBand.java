package weddings.library.com;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class EternityBand extends FDUtils
{
	
    @Test(groups = "Wedding", description = "Tested the flow of Eternity band. Selecting the Eternity Ring, adding to the cart and completing the checkout flow.")
	public void eternityBandFlow() throws InterruptedException
	{
    	FDPageObjectData eternityBand= new FDPageObjectData(driver);

    	eternityBand.clickWeddingLink();
    	eternityBand.selectEternityBand();
   	    eternityBand.closePopUp();
   	    eternityBand.doubleClickReamazeWidget();
   	    eternityBand.clickRandomProduct(FDPageObjectData.weddingProductPLP);
    //	eternityBand.selectDiamondBandProduct();
   	    eternityBand.selectRandomBandMaterial();
   	    eternityBand.ringSizer();
    	eternityBand.addToCartButton();
    	eternityBand.proceedToCheckout();
    	eternityBand.checkoutValidation();
    	
    	
    	
	}

}
