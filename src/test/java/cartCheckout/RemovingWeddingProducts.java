package cartCheckout;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class RemovingWeddingProducts extends FDUtils
{
	@Test(groups="CartCheckoutTestCases", description="verified Removal of wedding products from the cart")
	public void  removingWeddingProductsFromCart() throws InterruptedException
	{
		FDPageObjectData cart=new FDPageObjectData(driver);
		
		//adding wedding products to the cart.
    	cart.clickWeddingLink();
    	cart.selectAnniversaryOption();
    	cart.closePopUp();
    	cart.doubleClickReamazeWidget();
    
    	//anniversary.scrollToEndOfPage();
    	cart.clickRandomProduct(FDPageObjectData.weddingProductPLP);
    	
    	cart.addToCartButton();
    	//Adding goldband product to the cart.
    	cart.clickWeddingLink();
		cart.selectGoldBand();	
		cart.clickRandomProduct(FDPageObjectData.weddingProductPLP);
	    cart.addToCartButton();
	    
	    // Adding Diamond Bands to the cart.
	    cart.clickWeddingLink();
   	    cart.selectDiamondBand();
   	    cart.clickRandomProduct(FDPageObjectData.weddingProductPLP);
   	    cart.addToCartButton();
   	    //Adding Men Wedding bands to the cart.
   	 cart.clickWeddingLink();  
	  cart.selectMenWeddingoption();
	  cart.clickRandomProduct(FDPageObjectData.weddingProductPLP);
	  //cart.doubleClickReamazeWidget();
	  cart.addToCartButton();
    	Thread.sleep(3000);
    	cart.cartFocusUp();
    	cart.removeAllProductsFromCart();
		//cart.removeProductFromCart(1);

		
	}

}
