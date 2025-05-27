package weddings.library.com;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class AnniversaryRings extends FDUtils {

    @Test(groups = "Wedding", description = "Tested the flow Anniversay Ring. Selecting the anniversary Ring, adding to the cart, and completing the checkout flow.")
    public void anniversaryRingFlow() throws InterruptedException {

        // Initialize ExtentTest logger for this test method
        ExtentTest logger = getExtentInstance().createTest("Anniversary Ring Flow Test");
        test.set(logger);

        FDPageObjectData anniversary = new FDPageObjectData(driver);

        test.get().info("Started Anniversary Ring flow test");

        anniversary.clickWeddingLink();
        test.get().info("Clicked Wedding link");

        anniversary.selectAnniversaryOption();
        test.get().info("Selected Anniversary Rings option");

        anniversary.closePopUp();
        test.get().info("Closed any pop-up");

        // anniversary.scrollToEndOfPage();
        anniversary.clickRandomProduct(FDPageObjectData.weddingProductPLP);
        test.get().info("Clicked random Anniversary ring product");

        // anniversary.selectAnniversaryPlp();

        anniversary.doubleClickReamazeWidget();
        test.get().info("Interacted with Reamaze widget");

        anniversary.selectRandomBandMaterial();
        test.get().info("Selected random band material");

        anniversary.ringSizer();
        test.get().info("Used ring sizer");

        anniversary.addToCartButton();
        test.get().info("Added product to cart");

        anniversary.proceedToCheckout();
        test.get().info("Proceeded to checkout");

        anniversary.checkoutValidation();
        test.get().pass("Anniversary Ring flow test completed and validated successfully");
    }
}
