package cartCheckout;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class SettingsJewelryWeddingItems  extends FDUtils
{
    @Test(groups="CartCheckoutTestCases", description ="Removing the added products from the cart i.e., setting-Diamond flow,Jewelry products, Anniversary ring.")
	public void cancelProductsFromCart() throws InterruptedException
	{
		 FDPageObjectData  cart= new FDPageObjectData(driver);

	         cart.clickEngagementLink();
	    	 cart.startWithSetting();
	    	 cart.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);
	        // cart.selectHarperRing();
	         cart.selectThisSetting();
	         //reusing diamond button properties only  its mentioned diamond but it works for setting as well
	         cart.searchSettingForThisDiamond(); 
	        // engagementPage.doubleClickReamazeWidget();
	         cart.closePopUp();
	         cart.doubleClickReamazeWidget();
	         cart.selectDiamond2();
	         cart.addStoneToSetting();
	        // Thread.sleep(2000);
	         cart.cartFocusUp();
	         Thread.sleep(3000);
	            cart.closeCart();
	         cart.jewelryNav();
	     	 cart.earRingsOption();
	     	Thread.sleep(3000);
	     	 cart.jewleryPlp();
	     	//cart1.doubleClickReamazeWidget();
	     	 cart.addToCartButton();
	         cart.closeCart();
	             // Adding wedding product
	         cart.clickWeddingLink();
	     	 cart.selectAnniversaryOption();
	     	 cart.selectAnniversaryPlp();
	     	 cart.addToCartButton();
	         Thread.sleep(3000);
	     	 cart.cartFocusUp();
	     	 cart.removeAllProductsFromCart();
	     	// cart.removeProductFromCart(1);
	     

	       
	}

}
