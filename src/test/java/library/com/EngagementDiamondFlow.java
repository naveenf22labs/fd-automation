package library.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class EngagementDiamondFlow extends FDUtils
{
    

    @Test
    public void startWithADiamond() throws InterruptedException 
    {
    	FDPageObjectData engagementPage= new FDPageObjectData((ChromeDriver) driver);

        
        engagementPage.clickEngagementLink();
        engagementPage.startWithDiamond();
        engagementPage.searchDiamonds(); 
        engagementPage.closePopUp();
        Thread.sleep(3000);
        engagementPage.doubleClickReamazeWidget();
        engagementPage.selectDiamond1();
        engagementPage.selectThisStone();
        engagementPage.searchSettingForThisDiamond();
        engagementPage.selectHarperRing();
        engagementPage.addSettingToStone();
        engagementPage.proceedToCheckout();
        engagementPage.checkoutValidation();

    }
    
       
     
}
