package jewelry.com;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class NecklacesFlow extends FDUtils {
	
	
    @Test(groups = "jewelry", description = "Tested the flow of Necklace. Selecting the necklace, Adding diamond to the neckalce,then add to the cart and completing the checkout flow.")
	 public void jewelryNecklaceFlow() throws InterruptedException
	    {
	    	FDPageObjectData necklaces= new FDPageObjectData(driver);
	    	
	    	necklaces.jewelryNav();
	        necklaces.selectnecklesOption();
	    	necklaces.closePopUp();
	    	Thread.sleep(2000);
	    	necklaces.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);
	    	//necklaces.jewleryPlp();
	    	necklaces.doubleClickReamazeWidget();
	    	necklaces.selectRandomBandMaterial();
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
