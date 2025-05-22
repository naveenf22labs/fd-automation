package jewelry.com;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class NecklaceWithDefaultDiamond extends FDUtils
{
	 @Test(groups = "jewelry", description = "Tested the flow of Necklace. Selecting the necklace, Adding default diamond to the neckalce,then add to the cart and completing the checkout flow.")
	 public void NecklaceDefaultDiamondFlow() throws InterruptedException
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
	    	necklaces.defaultDiamond();
//	    	// using diamond flow method only bcz we created unique xpath for reusability.
//	    	necklaces.searchSettingForThisDiamond();
//	    	necklaces.selectDiamondFromNecklacesPlp();
//	    	Thread.sleep(2000);
//	    	necklaces.addDiamondToNecklaceButton();
	    	Thread.sleep(2000);
	    	necklaces.proceedToCheckout();
	    	necklaces.checkoutValidation();

	    	
	    }

}
