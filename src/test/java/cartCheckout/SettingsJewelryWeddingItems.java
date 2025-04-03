package cartCheckout;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class SettingsJewelryWeddingItems  extends FDUtils
{
	@Test
	public void cancelProductsFromCart() throws InterruptedException
	{
		 FDPageObjectData  cart= new FDPageObjectData((ChromeDriver) driver);

	         cart.clickEngagementLink();
	    	 cart.startWithSetting();
	         cart.selectHarperRing();
	         cart.selectThisSetting();
	         //reusing diamond button properties only  its mentioned diamond but it works for setting as well
	         cart.searchSettingForThisDiamond(); 
	        // engagementPage.doubleClickReamazeWidget();
	         cart.closePopUp();
	         cart.doubleClickReamazeWidget();
	         cart.selectDiamond2();
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
	     	 cart.removeProductFromCart(1);
	     

	       
	}

}
