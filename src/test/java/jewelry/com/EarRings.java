package jewelry.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class EarRings extends FDUtils
{
	@Test
    public void jewelryEarRingFlow() throws InterruptedException
    {
    	FDPageObjectData earRings= new FDPageObjectData((ChromeDriver) driver);
    	
    	earRings.jewelryNav();
    	earRings.earRingsOption();
    	earRings.closePopUp();
    	earRings.jewleryPlp();
    	earRings.doubleClickReamazeWidget();
    	earRings.addToCartButton();
    	earRings.proceedToCheckout();
    	earRings.checkoutValidation();
    	
    }
	


}
