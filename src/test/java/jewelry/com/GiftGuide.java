package jewelry.com;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class GiftGuide extends FDUtils
{
    @Test(groups = "jewelry", description ="Tested the flow of Gift guide. Selecting the gift guide product, adding to cart, and completing checkout flow.")
	public void giftGuideFlow() throws InterruptedException
	{
          FDPageObjectData gift= new FDPageObjectData(driver);
       // Initialize ExtentTest for this test
          ExtentTest logger = getExtentInstance().createTest("Gift guide flow Test");
          test.set(logger);

    	
          test.get().info("Tested the flow of Gift guide. Selecting the gift guide product, adding to cart, and completing checkout flow.");

          gift.jewelryNav();
          test.get().info("Navigated to Jewelry section");

          gift.giftGuide();
          test.get().info("Opened Gift Guide");

          gift.closePopUp();
          test.get().info("Closed any popup");

          gift.doubleClickReamazeWidget();
          test.get().info("Interacted with Reamaze widget");

          gift.selectGiftGuidePlp();
          test.get().info("Selected Gift Guide PLP");

          gift.selectRandomBandMaterial();
          test.get().info("Selected random band material");

          gift.addToCartButton();
          test.get().info("Added product to cart");

          Thread.sleep(3000);

          gift.proceedToCheckout();
          test.get().info("Proceeded to checkout");

          gift.checkoutValidation();
          test.get().info("Validated checkout page");

          test.get().pass("Gift Guide flow test completed successfully");
	}

}
