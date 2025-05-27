package weddings.library.com;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class StackingRings extends FDUtils {

    @Test(groups = "Wedding", description = "Tested the flow of Stacking Rings. Selecting the Stacking ring, adding to the cart and completing the checkout.")
    public void stackingRingsFlow() throws InterruptedException {
        
        // Initialize ExtentTest logger for this test
        ExtentTest logger = getExtentInstance().createTest("Stacking Rings Flow Test");
        test.set(logger);
        
        FDPageObjectData stacking = new FDPageObjectData(driver);

        test.get().info("Started Stacking Rings flow test");

        stacking.clickWeddingLink();
        test.get().info("Clicked Wedding link");

        stacking.stackingRings();
        test.get().info("Selected Stacking Rings option");

        stacking.closePopUp();
        test.get().info("Closed any popup if present");

        stacking.doubleClickReamazeWidget();
        test.get().info("Interacted with Reamaze widget");

        stacking.clickRandomProduct(FDPageObjectData.weddingProductPLP);
        test.get().info("Clicked random Stacking Ring product");

        stacking.selectRandomBandMaterial();
        test.get().info("Selected random band material");

        stacking.ringSizer();
        test.get().info("Used ring sizer");

        stacking.addToCartButton();
        test.get().info("Added product to cart");

        stacking.proceedToCheckout();
        test.get().info("Proceeded to checkout");

        stacking.checkoutValidation();
        test.get().pass("Stacking Rings flow test completed successfully");
    }
}
