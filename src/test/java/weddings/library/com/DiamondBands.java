package weddings.library.com;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class DiamondBands extends FDUtils {

    @Test(groups = "Wedding", description = "Tested the flow of Diamond bands. Selecting the Diamond, adding to the cart and completing the checkout flow.")
    public void diamondBandFlow() throws InterruptedException {

        // Initialize ExtentTest logger
        ExtentTest logger = getExtentInstance().createTest("Diamond Bands Flow Test");
        test.set(logger);

        FDPageObjectData diamondBand = new FDPageObjectData(driver);

        test.get().info("Started Diamond Bands flow test");

        diamondBand.clickWeddingLink();
        test.get().info("Clicked Wedding link");

        diamondBand.selectDiamondBand();
        test.get().info("Selected Diamond Band option");

        diamondBand.closePopUp();
        test.get().info("Closed any popup");

        diamondBand.doubleClickReamazeWidget();
        test.get().info("Interacted with Reamaze widget");

        diamondBand.clickRandomProduct(FDPageObjectData.weddingProductPLP);
        test.get().info("Clicked random diamond band product");

        // diamondBand.selectDiamondBandProduct();

        diamondBand.selectRandomBandMaterial();
        test.get().info("Selected random band material");

        diamondBand.ringSizer();
        test.get().info("Used ring sizer");

        diamondBand.addToCartButton();
        test.get().info("Added product to cart");

        diamondBand.proceedToCheckout();
        test.get().info("Proceeded to checkout");

        diamondBand.checkoutValidation();
        test.get().pass("Diamond Bands flow test completed and validated successfully");
    }
}
