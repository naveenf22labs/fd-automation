package weddings.library.com;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class DiamondBands extends FDUtils

{
    @Test(groups = "Wedding", description = "Tested the flow of Diamond bands. Selecting the Diamond, adding to the cart and completing the checkout flow.")
	public void diamondBandFlow() throws InterruptedException 
	{
    	FDPageObjectData diamondBand= new FDPageObjectData(driver);
             
    	 diamondBand.clickWeddingLink();
    	 diamondBand.selectDiamondBand();
    	 diamondBand.closePopUp();
    	 diamondBand.doubleClickReamazeWidget();
    	 diamondBand.clickRandomProduct(FDPageObjectData.weddingProductPLP);
    	// diamondBand.selectDiamondBandProduct();
    	 diamondBand.selectRandomBandMaterial();
    	 diamondBand.ringSizer();
    	 diamondBand.addToCartButton();
    	 diamondBand.proceedToCheckout();
    	 diamondBand.checkoutValidation();
		
	}

}
