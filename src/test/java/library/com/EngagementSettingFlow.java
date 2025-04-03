package library.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class EngagementSettingFlow extends FDUtils

{

	
	      @Test  
	     public void startWithASetting( ) throws InterruptedException
	     {
		  FDPageObjectData engagementPage= new FDPageObjectData((ChromeDriver) driver); 
	         engagementPage.clickEngagementLink();
	    	 engagementPage.startWithSetting();
	         engagementPage.selectHarperRing();
	         engagementPage.selectThisSetting();
	         //reusing diamond button properties only  its mentioned diamond but it works for setting as well
	         engagementPage.searchSettingForThisDiamond(); 
	        // engagementPage.doubleClickReamazeWidget();
	         engagementPage.closePopUp();
	        engagementPage.doubleClickReamazeWidget();
	        engagementPage.selectDiamond2();
	         engagementPage.addStoneToSetting();
	         Thread.sleep(3000);
	         engagementPage.proceedToCheckout();
	         engagementPage.checkoutValidation();

	    	 
	     }

}
