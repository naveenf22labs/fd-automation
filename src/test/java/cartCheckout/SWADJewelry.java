package cartCheckout;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class SWADJewelry extends FDUtils
{
	
	

    @Test(groups="CartCheckoutTestCases", description ="Removing the added products from the cart i.e., Diamond-Setting flow,Jewelry products, Anniversary ring.")
	//Start with a diamond along with jewelry product i.e, earings, wedding flow.
	public void removingProductsfromCart() throws InterruptedException
	{
		
		 FDPageObjectData  cart1= new FDPageObjectData(driver);

        cart1.clickEngagementLink();
        cart1.startWithDiamond();
        cart1.searchDiamonds(); 
        cart1.closePopUp();
       // Thread.sleep(3000);
        cart1.doubleClickReamazeWidget();
        cart1.selectDiamond1();
        cart1.selectThisStone();
        cart1.searchSettingForThisDiamond();
       // cart1.plpList1();
        cart1.clickRandomProduct(FDPageObjectData.diamondSettingPLP);
        //cart1.selectHarperRing();
        cart1.selectRandomBandMaterial();
        cart1.addSettingToStone();
        cart1.cartFocusUp();
     Thread.sleep(3000);
        cart1.closeCart();
        cart1.jewelryNav();
    	cart1.earRingsOption();
    	//cart1.closePopUp();
    	cart1.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);
    	//cart1.jewleryPlp();
    	//cart1.doubleClickReamazeWidget();
    	cart1.selectRandomBandMaterial();
    	cart1.addToCartButton();
        cart1.closeCart();
            // Adding wedding product
        cart1.clickWeddingLink();
    	cart1.selectAnniversaryOption();
    	cart1.clickRandomProduct(FDPageObjectData.weddingProductPLP);
    	//cart1.selectAnniversaryPlp();
    	//cart1.doubleClickReamazeWidget();
    	cart1.selectRandomBandMaterial();
    	cart1.addToCartButton();
        Thread.sleep(3000);
    	cart1.cartFocusUp();
    	cart1.removeAllProductsFromCart();
    //	cart1.removeProductFromCart(1);
    	
    	
        
        	
	}
	
	  
}
