package jewelry.com;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class EarRings extends FDUtils
{
    @Test(groups = "jewelry", description = "Verifying the functionality of Earring. Selecting the studd, adding to the cart and completing checkout flow.")
    public void jewelryEarRingFlow() throws InterruptedException
    {
    	FDPageObjectData earRings= new FDPageObjectData(driver);
    	
    	earRings.jewelryNav();
    	earRings.earRingsOption();
    	earRings.closePopUp();
    	//earRings.jewleryPlp();
    	earRings.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);
    	earRings.doubleClickReamazeWidget();
    	earRings.selectRandomBandMaterial();
    	earRings.addToCartButton();
    	earRings.proceedToCheckout();
    	earRings.checkoutValidation();
    	
    }
	


}
