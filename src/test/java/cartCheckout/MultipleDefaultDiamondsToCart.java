package cartCheckout;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class MultipleDefaultDiamondsToCart extends FDUtils
{
    @Test(groups="CartCheckoutTestCases", description = "Verifying the functionality of adding the multiple default diamonds to the cart and completing the checkout flow.")
	public void defaultDiamondCombinations() throws InterruptedException
	{
		 FDPageObjectData  cart= new FDPageObjectData(driver);
		 
		 cart.clickEngagementLink();
    	 cart.startWithSetting();
    	 cart.doubleClickReamazeWidget();
         cart.closePopUp();
         cart.selectHarperRing();
         cart.selectThisSetting();
         cart.defaultDiamond();
         cart.clickEngagementLink();
    	 cart.startWithSetting();
    	// cart.doubleClickReamazeWidget();
        // cart.closePopUp();
         cart.selectHarperRing();
         cart.selectThisSetting();
         cart.defaultDiamond();
     	cart.proceedToCheckout();
     	cart.checkoutValidation(); 
         
	}

}
