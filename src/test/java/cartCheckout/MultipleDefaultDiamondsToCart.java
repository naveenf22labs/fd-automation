package cartCheckout;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class MultipleDefaultDiamondsToCart extends FDUtils {

    @Test(groups = "CartCheckoutTestCases", description = "Verifying the functionality of adding the multiple default diamonds to the cart and completing the checkout flow.")
    public void defaultDiamondCombinations() throws InterruptedException 
    {
        // Initialize ExtentTest for this test
        ExtentTest logger = getExtentInstance().createTest("Multiple default diamonds to cart Flow Test");
        test.set(logger);
    	
        FDPageObjectData cart = new FDPageObjectData(driver);

        test.get().info("Navigating to Engagement section.");
        cart.clickEngagementLink();

        test.get().info("Starting with setting.");
        cart.startWithSetting();

        test.get().info("Interacting with Reamaze widget.");
        cart.doubleClickReamazeWidget();

        test.get().info("Closing any visible popup.");
        cart.closePopUp();

        test.get().info("Clicking a random product from jewelry products PLP.");
        cart.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);

        Thread.sleep(2000); // Consider replacing with an explicit wait.

        test.get().info("Selecting a random band material.");
        cart.selectRandomBandMaterial();

        test.get().info("Selecting this setting.");
        cart.selectThisSetting();

        test.get().info("Adding default diamond to the setting.");
        cart.defaultDiamond();

        test.get().info("Repeating process for a second default diamond.");

        cart.clickEngagementLink();
        cart.startWithSetting();
        cart.doubleClickReamazeWidget();
        cart.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);
        cart.selectRandomBandMaterial();
        cart.selectThisSetting();
        cart.defaultDiamond();

        test.get().info("Proceeding to checkout.");
        cart.proceedToCheckout();

        test.get().info("Validating checkout.");
        cart.checkoutValidation();
    }
}
