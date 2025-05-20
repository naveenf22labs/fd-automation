package weddings.library.com;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class AnniversaryRings extends FDUtils

{
    @Test(groups = "Wedding", description = "Tested the flow Anniversay Ring. Selecting the anniversary Ring, adding to the cart, and completing the checkout flow.")
	public void anniversaryRingFlow() throws InterruptedException
	{
    	FDPageObjectData anniversary= new FDPageObjectData(driver);
    	
    	anniversary.clickWeddingLink();
    	anniversary.selectAnniversaryOption();
    	anniversary.closePopUp();
    	//anniversary.scrollToEndOfPage();
    	anniversary.clickRandomProduct(FDPageObjectData.weddingProductPLP);
    	//anniversary.selectAnniversaryPlp();
    	anniversary.doubleClickReamazeWidget();
     anniversary.selectRandomBandMaterial();
    	anniversary.addToCartButton();
    	anniversary.proceedToCheckout();
    	anniversary.checkoutValidation();
    	

	}
}
