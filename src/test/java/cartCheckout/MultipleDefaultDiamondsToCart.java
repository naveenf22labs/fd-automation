package cartCheckout;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class MultipleDefaultDiamondsToCart extends FDUtils
{
     @Test	
	public void defaultDiamondCombinations()
	{
		 FDPageObjectData  cart= new FDPageObjectData((ChromeDriver) driver);
		 
		 cart.clickEngagementLink();
    	 cart.startWithSetting();
         cart.selectHarperRing();
         cart.selectThisSetting();
         
	}

}
