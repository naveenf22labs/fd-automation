package weddings.library.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class AnniversaryRings extends FDUtils

{
 
	@Test
	public void anniversaryRingFlow() throws InterruptedException
	{
    	FDPageObjectData anniversary= new FDPageObjectData((ChromeDriver) driver);
    	
    	anniversary.clickWeddingLink();
    	anniversary.selectAnniversaryOption();
    	//anniversary.scrollToEndOfPage();
    	anniversary.clickRandomProduct();
    	//anniversary.selectAnniversaryPlp();
    	anniversary.doubleClickReamazeWidget();
    	anniversary.addToCartButton();
    	anniversary.proceedToCheckout();
    	anniversary.checkoutValidation();
    	

	}
}
