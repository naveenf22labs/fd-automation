package cartCheckout;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class SWADJewelry extends FDUtils
{
	
	 FDPageObjectData cart1;

	@Test
	//Start with a diamond along with jewelry product i.e, earings, wedding flow.
	public void scenario1() throws InterruptedException
	{
		
        cart1= new FDPageObjectData((ChromeDriver) driver);

        cart1.clickEngagementLink();
        cart1.startWithDiamond();
        cart1.searchDiamonds(); 
        cart1.closePopUp();
        Thread.sleep(3000);
        cart1.doubleClickReamazeWidget();
        cart1.selectDiamond1();
        cart1.selectThisStone();
        cart1.searchSettingForThisDiamond();
        cart1.selectHarperRing();
        cart1.addSettingToStone();
        cart1.closeCart();
        cart1.jewelryNav();
    	cart1.earRingsOption();
    	//cart1.closePopUp();
    	cart1.jewleryPlp();
    	//cart1.doubleClickReamazeWidget();
    	cart1.addToCartButton();
        cart1.closeCart();
            // Adding wedding product
        
        cart1.clickWeddingLink();
    	cart1.selectAnniversaryOption();
    	cart1.selectAnniversaryPlp();
    	//cart1.doubleClickReamazeWidget();
    	cart1.addToCartButton();
        
   
        Thread.sleep(4000);
    	cart1.removeProductFromCart(2);
        
        	
	}
	
	  
}
