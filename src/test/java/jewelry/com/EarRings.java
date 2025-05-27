package jewelry.com;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class EarRings extends FDUtils
{

    @Test(groups = "jewelry", description = "Verifying the functionality of Earring. Selecting the studd, adding to the cart and completing checkout flow.")
    public void jewelryEarRingFlow() throws InterruptedException {
        
        // ✅ Initialize ExtentTest for this test
        ExtentTest logger = getExtentInstance().createTest("Jewelry Earring Flow Test");
        test.set(logger);

        FDPageObjectData earRings = new FDPageObjectData(driver);

        test.get().info("Starting Earring flow test");

        earRings.jewelryNav();
        test.get().info("Navigated to Jewelry section");

        earRings.earRingsOption();
        test.get().info("Selected the Earring category");

        earRings.closePopUp();
        test.get().info("Closed any pop-up that appeared");

        earRings.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);
        test.get().info("Clicked a random product from Product Listing Page");

        earRings.doubleClickReamazeWidget();
        test.get().info("Double-clicked Reamaze widget");

        earRings.selectRandomBandMaterial();
        test.get().info("Selected random band material for earring");

        earRings.totalCaratWeight();
        test.get().info("Selected total carat weight");

        earRings.stoneType();
        test.get().info("Selected stone type");

        earRings.addToCartButton();
        test.get().info("Clicked on Add to Cart");

        earRings.proceedToCheckout();
        test.get().info("Proceeded to Checkout");

        earRings.checkoutValidation();
        test.get().pass("Checkout validation completed successfully");
    }
}
