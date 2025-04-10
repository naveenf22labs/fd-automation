package weddings.library.com;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class GoldBands  extends FDUtils
{

    @Test(groups = "Wedding", description = "Tested the flow of Gold Bands. Selecting the gold band ring, adding to the cart and completing checkout flow.")
	public void goldBands() throws InterruptedException
	{
		  FDPageObjectData goldBandPage= new FDPageObjectData(driver);
		  
		  goldBandPage.clickWeddingLink();
		  goldBandPage.selectGoldBand();
		  goldBandPage.closePopUp();
		  goldBandPage.doubleClickReamazeWidget();
		  goldBandPage.clickRandomProduct(FDPageObjectData.weddingProductPLP);
		  // reusing diamond id locator in plp bcz id is same for all the plp 
	    //  goldBandPage.selectDiamondBandProduct();
	      //Thread.sleep(2000);
	      goldBandPage.addToCartButton();
	      goldBandPage.proceedToCheckout();
	      goldBandPage.checkoutValidation();

		  

	}

}
