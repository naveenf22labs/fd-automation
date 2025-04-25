package cartCheckout;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class MultipleProductsToCheckout extends FDUtils

{
    @Test(groups="CartCheckoutTestCases", description ="Verifing the functionality of adding multiple product combinations to the cart and completing the checkout flow.")
	public void addingMultipleProductsToCheckout() throws InterruptedException
	{
		
		 FDPageObjectData  cart1= new FDPageObjectData(driver);

        cart1.clickEngagementLink();
        cart1.startWithDiamond();
        cart1.searchDiamonds(); 
        cart1.closePopUp();
        cart1.doubleClickReamazeWidget();
        cart1.selectDiamond1();
        cart1.selectThisStone();
        cart1.searchSettingForThisDiamond();
        cart1.clickRandomProduct(FDPageObjectData.diamondSettingPLP);
        //cart1.selectHarperRing();
        cart1.addSettingToStone();
        // Thread.sleep(3000);
     //Adding jewelry product
        cart1.jewelryNav();
    	cart1.earRingsOption();
    	cart1.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);
    	//cart1.jewleryPlp();
    	cart1.addToCartButton();
         // Adding wedding products i.e., Anniversary and Gold bands.
    	cart1.clickWeddingLink();
    	cart1.selectAnniversaryOption();
    	cart1.clickRandomProduct(FDPageObjectData.weddingProductPLP);
    	cart1.addToCartButton();
    	// Adding Gold Band 
    	 cart1.clickWeddingLink();
		  cart1.selectGoldBand();
		  cart1.clickRandomProduct(FDPageObjectData.weddingProductPLP);
    	cart1.addToCartButton();
    	 Thread.sleep(2000);
       cart1.proceedToCheckout();
       cart1.checkoutValidation();
        	
	}
	

}
