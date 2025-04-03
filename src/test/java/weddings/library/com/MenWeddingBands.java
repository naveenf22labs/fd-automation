package weddings.library.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;


public class MenWeddingBands  extends FDUtils
{

	
	@Test
	public void menWeddingBands() throws InterruptedException
	{
		  FDPageObjectData weddingPage= new FDPageObjectData((ChromeDriver) driver);
		  
		  //Selecting wedding from nav
		  weddingPage.clickWeddingLink();  
		  weddingPage.selectMenWeddingoption(); 
		  //Selecting man wedding product from the plp.
		  
		//  weddingPage.SelectingMenWeddingPlp();
		  weddingPage.clickRandomProduct();
		//  weddingPage.closePopUp();
		  //clicking on add to cart button in pdp
		  weddingPage.doubleClickReamazeWidget();
		  weddingPage.addToCartButton();
		  weddingPage.proceedToCheckout();
		  weddingPage.checkoutValidation();
		
	}
}
