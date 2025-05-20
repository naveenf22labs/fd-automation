package cartCheckout;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class DiamondsCombinationToCart  extends FDUtils
{

    @Test(groups="CartCheckoutTestCases", description = "Removing added diamonds i.e, normal and default diamond from the cart.")
	public void  defaultDiamondAndNormalDiamonds() throws InterruptedException
	{
		FDPageObjectData cart=new FDPageObjectData(driver);
		
       // Adding normal diamond to the cart.
        cart.clickEngagementLink();
        cart.startWithDiamond();
        cart.searchDiamonds(); 
        cart.closePopUp();
        Thread.sleep(3000);
        cart.doubleClickReamazeWidget();
        cart.selectDiamond1();
        cart.selectThisStone();
        cart.searchSettingForThisDiamond();
        cart.clickRandomProduct(FDPageObjectData.diamondSettingPLP);
       // cart.selectHarperRing();
        cart.selectRandomBandMaterial();
        cart.addSettingToStone();
        // Adding default diamond to the cart
        cart.clickEngagementLink();
   	    cart.startWithSetting();
   	    cart.clickRandomProduct(FDPageObjectData.diamondSettingPLP);
      //  cart.selectHarperRing();
   	    cart.selectRandomBandMaterial();
        cart.selectThisSetting();
        cart.defaultDiamond();
    	Thread.sleep(3000);
    	cart.cartFocusUp();
    	cart.removeAllProductsFromCart();
		//cart.removeProductFromCart(1);
        
        
	}
}
