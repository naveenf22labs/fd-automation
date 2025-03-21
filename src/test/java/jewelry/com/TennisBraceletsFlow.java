package jewelry.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class TennisBraceletsFlow  extends FDUtils
{
	@Test
	public void tennisBracelets() throws InterruptedException
	{
		FDPageObjectData tennis=new FDPageObjectData((ChromeDriver) driver);
		
		tennis.jewelryNav();
		tennis.selectTennisNecklace();
		tennis.closePopUp();
		tennis.doubleClickReamazeWidget();

		tennis.jewleryPlp();
		tennis.addToCartButton();
		tennis.proceedToCheckout();
		tennis.checkoutValidation();
		
	}

}
