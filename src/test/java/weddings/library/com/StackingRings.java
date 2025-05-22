package weddings.library.com;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class StackingRings extends FDUtils
{

    @Test(groups = "Wedding", description = "Tested the flow of Stacking Rings. Selecting the Stacking ring, adding to the cart and completing the checkout.")
	public void stackingRingsFlow() throws InterruptedException
	{
    	FDPageObjectData stacking= new FDPageObjectData(driver);
    	
    	stacking.clickWeddingLink();
    	stacking.stackingRings();
    	stacking.closePopUp();
    	stacking.doubleClickReamazeWidget();
    	stacking.clickRandomProduct(FDPageObjectData.weddingProductPLP);
    	//stacking.stackingRingsplp();
    	stacking.selectRandomBandMaterial();
    	stacking.ringSizer();
    	stacking.addToCartButton();
    	stacking.proceedToCheckout();
    	stacking.checkoutValidation();
    	
	}
}
