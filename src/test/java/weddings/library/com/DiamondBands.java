package weddings.library.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class DiamondBands extends FDUtils

{
	@Test
	public void diamondBandFlow() throws InterruptedException 
	{
    	FDPageObjectData diamondBand= new FDPageObjectData((ChromeDriver) driver);
             
    	 diamondBand.clickWeddingLink();
    	 diamondBand.selectDiamondBand();
    	 diamondBand.closePopUp();
    	 diamondBand.selectDiamondBandProduct();
    	 diamondBand.doubleClickReamazeWidget();

    	 diamondBand.addToCartButton();
    	 diamondBand.proceedToCheckout();
    	 diamondBand.checkoutValidation();
		
	}

}
