package library.com;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class EngagementSettingFlow extends FDUtils

{

	
    @Test( groups = "diamond", description = "Tested the flow of selecting a Setting. Select the setting, adding diamond, adding to the cart, and completing the checkout flow.")  
	     public void startWithASetting( ) throws InterruptedException
	     {
		  FDPageObjectData engagementPage= new FDPageObjectData(driver); 
	         engagementPage.clickEngagementLink();
	    	 engagementPage.startWithSetting();
	    	 engagementPage.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);
	        // engagementPage.selectHarperRing();
	         engagementPage.selectThisSetting();
	         //reusing diamond button properties only  its mentioned diamond but it works for setting as well
	         engagementPage.searchSettingForThisDiamond(); 
	        // engagementPage.doubleClickReamazeWidget();
	         engagementPage.closePopUp();
	        engagementPage.doubleClickReamazeWidget();
	        engagementPage.selectDiamond2();
	        Thread.sleep(2000);
	        engagementPage.addStoneToSetting();
	         Thread.sleep(3000);
	         engagementPage.proceedToCheckout();
	         engagementPage.checkoutValidation();

	    	 
	     }

}
