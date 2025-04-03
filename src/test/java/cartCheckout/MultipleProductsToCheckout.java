package cartCheckout;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class MultipleProductsToCheckout extends FDUtils

{
	@Test
	public void multipleProducts() throws InterruptedException
	{
		
		 FDPageObjectData  cart1= new FDPageObjectData((ChromeDriver) driver);

        cart1.clickEngagementLink();
        cart1.startWithDiamond();
        cart1.searchDiamonds(); 
        cart1.closePopUp();
        cart1.doubleClickReamazeWidget();
        cart1.selectDiamond1();
        cart1.selectThisStone();
        cart1.searchSettingForThisDiamond();
        cart1.selectHarperRing();
        cart1.addSettingToStone();
     Thread.sleep(3000);
     //Adding jewelry product
        cart1.jewelryNav();
    	cart1.earRingsOption();
    	cart1.jewleryPlp();
    	cart1.addToCartButton();
         // Adding wedding product
        cart1.clickWeddingLink();
    	cart1.selectAnniversaryOption();
    	cart1.selectAnniversaryPlp();
    	 cart1.clickWeddingLink();
		  cart1.selectGoldBand();
		  cart1.clickRandomProduct();
	    //  cart1.selectDiamondBandProduct();
    	cart1.addToCartButton();
       cart1.proceedToCheckout();
       cart1.checkoutValidation();
    	
    	
        
        	
	}
	

}
