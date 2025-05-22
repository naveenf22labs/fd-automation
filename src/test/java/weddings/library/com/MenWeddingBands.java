package weddings.library.com;

import org.testng.annotations.Test;
import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;


public class MenWeddingBands  extends FDUtils
{

	
    @Test(groups = "Wedding", description = "Tested the flow of Men Wedding bands. Selecting the Men Wedding Band, adding the product to cart and completing the checkout flow.")
	public void menWeddingBands() throws InterruptedException
	{
		  FDPageObjectData weddingPage= new FDPageObjectData(driver);
		  
		  //Selecting wedding from Nav Bar
		  weddingPage.clickWeddingLink();  
		  weddingPage.selectMenWeddingoption(); 
		  weddingPage.clickRandomProduct(FDPageObjectData.weddingProductPLP);
		  //clicking on add to cart button in pdp
		  weddingPage.doubleClickReamazeWidget();
		  weddingPage.selectRandomBandMaterial();
		  weddingPage.ringSizer();
		  weddingPage.addToCartButton();
		  weddingPage.proceedToCheckout();
		  weddingPage.checkoutValidation();
		
	}
}
