package jewelry.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class NecklacesFlow extends FDUtils {
	
	
	@Test
	 public void jewelryEarRingFlow() throws InterruptedException
	    {
	    	FDPageObjectData necklaces= new FDPageObjectData((ChromeDriver) driver);
	    	
	    	necklaces.jewelryNav();
	        necklaces.selectnecklesOption();
	    	necklaces.closePopUp();
	    	necklaces.jewleryPlp();
	    	necklaces.doubleClickReamazeWidget();
	    	necklaces.selectThisNecklaceButton();
	    	// using diamond flow method only bcz we created unique xpath for reusability.
	    	necklaces.searchSettingForThisDiamond();
	    	necklaces.selectDiamondFromNecklacesPlp();
	    	Thread.sleep(2000);
	    	necklaces.addDiamondToNecklaceButton();
	    	Thread.sleep(2000);
	    	necklaces.proceedToCheckout();
	    	necklaces.checkoutValidation();

	    	
	    }


}
