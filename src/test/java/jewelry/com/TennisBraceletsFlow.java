package jewelry.com;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class TennisBraceletsFlow extends FDUtils {

    @Test(groups = "jewelry", description = "Tested the flow of Tennis Bracelets. Selecting the bracelet, adding to the cart, and completing the checkout flow.")
    public void tennisBracelets() throws InterruptedException {

        // ✅ Initialize ExtentTest
        ExtentTest logger = getExtentInstance().createTest("Tennis Bracelets Flow Test");
        test.set(logger);

        FDPageObjectData tennis = new FDPageObjectData(driver);

        test.get().info("Started Tennis Bracelets flow test");

        tennis.jewelryNav();
        test.get().info("Navigated to Jewelry section");

        tennis.selectTennisNecklace();  // Assuming method is reused for Tennis Bracelet
        test.get().info("Selected Tennis Bracelet category");

        tennis.closePopUp();
        test.get().info("Closed any popup if present");

        tennis.doubleClickReamazeWidget();
        test.get().info("Interacted with Reamaze widget");

        tennis.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);
        test.get().info("Clicked a random bracelet product");

        tennis.selectRandomBandMaterial();
        test.get().info("Selected random band material");

        tennis.tennisTotalLength();
        test.get().info("Selected bracelet total length");

        tennis.addToCartButton();
        test.get().info("Clicked Add to Cart");

        tennis.proceedToCheckout();
        test.get().info("Proceeded to Checkout");

        tennis.checkoutValidation();
        test.get().pass("Tennis Bracelets flow test completed and validated successfully");
    }
}
