package weddings.library.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class StackingRings extends FDUtils
{

	@Test
	public void stackingRingsFlow() throws InterruptedException
	{
    	FDPageObjectData stacking= new FDPageObjectData((ChromeDriver) driver);
    	
    	stacking.clickWeddingLink();
    	stacking.stackingRings();
    	stacking.closePopUp();
    	stacking.doubleClickReamazeWidget();
    	stacking.clickRandomProduct();
    	//stacking.stackingRingsplp();
    	stacking.addToCartButton();
    	stacking.proceedToCheckout();
    	stacking.checkoutValidation();
    	
	}
}
