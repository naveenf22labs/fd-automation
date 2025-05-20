package library.com;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class EngagementDiamondFlow extends FDUtils
{
    

    @Test(groups = "diamond", description = "Tested the flow of selecting a diamond. Selecting the diamond, customizing the setting, adding to the cart, and completing the checkout flow.")
    public void startWithADiamond() throws InterruptedException 
    {
    	
    	FDPageObjectData engagementPage= new FDPageObjectData(driver);

        engagementPage.clickEngagementLink();
        engagementPage.startWithDiamond();
        engagementPage.searchDiamonds(); 
        engagementPage.closePopUp();
        Thread.sleep(3000);
        engagementPage.doubleClickReamazeWidget();
        engagementPage.selectDiamond1();
        engagementPage.selectThisStone();
        engagementPage.searchSettingForThisDiamond();
        engagementPage.clickRandomProduct(FDPageObjectData.diamondSettingPLP);
      //  engagementPage.selectHarperRing();
        engagementPage.selectRandomBandMaterial();
        engagementPage.addSettingToStone();
        engagementPage.proceedToCheckout();
        engagementPage.checkoutValidation();

    }
    
       
     
}
