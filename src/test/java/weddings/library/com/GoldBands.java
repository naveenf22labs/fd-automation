package weddings.library.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class GoldBands  extends FDUtils
{

	@Test
	public void goldBands() throws InterruptedException
	{
		  FDPageObjectData goldBandPage= new FDPageObjectData((ChromeDriver) driver);
		  
		  goldBandPage.clickWeddingLink();
		  goldBandPage.selectGoldBand();
		  goldBandPage.closePopUp();
		  goldBandPage.doubleClickReamazeWidget();
		  goldBandPage.clickRandomProduct();
		  // reusing diamond id locator in plp bcz id is same for all the plp 
	    //  goldBandPage.selectDiamondBandProduct();
	      //Thread.sleep(2000);
	      goldBandPage.addToCartButton();
	      goldBandPage.proceedToCheckout();
	      goldBandPage.checkoutValidation();

		  

	}

}
