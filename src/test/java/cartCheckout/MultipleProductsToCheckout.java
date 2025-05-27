package cartCheckout;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class MultipleProductsToCheckout extends FDUtils {

    @Test(groups = "CartCheckoutTestCases", description = "Verifying the functionality of adding multiple product combinations to the cart and completing the checkout flow.")
    public void addingMultipleProductsToCheckout() throws InterruptedException 
    {
    	// Initialize ExtentTest for this test
        ExtentTest logger = getExtentInstance().createTest("Multiple products to cart till checkout flow Test");
        test.set(logger);

        FDPageObjectData cart1 = new FDPageObjectData(driver);

        // Engagement Ring with Custom Diamond
        test.get().info("Navigating to Engagement section.");
        cart1.clickEngagementLink();

        test.get().info("Starting with a diamond.");
        cart1.startWithDiamond();

        test.get().info("Searching for diamonds.");
        cart1.searchDiamonds();

        test.get().info("Closing any popup that appears.");
        cart1.closePopUp();

        test.get().info("Interacting with Reamaze widget.");
        cart1.doubleClickReamazeWidget();

        test.get().info("Selecting the first diamond.");
        cart1.selectDiamond1();

        test.get().info("Confirming selected diamond.");
        cart1.selectThisStone();

        test.get().info("Searching for a setting for the selected diamond.");
        cart1.searchSettingForThisDiamond();

        test.get().info("Selecting a random product from diamond setting PLP.");
        cart1.clickRandomProduct(FDPageObjectData.diamondSettingPLP);

        test.get().info("Selecting a random band material.");
        cart1.selectRandomBandMaterial();

        test.get().info("Adding setting to the selected stone.");
        cart1.addSettingToStone();

        // Adding Jewelry Product (Earrings)
        test.get().info("Navigating to Jewelry section for earrings.");
        cart1.jewelryNav();

        test.get().info("Selecting earrings option.");
        cart1.earRingsOption();

        test.get().info("Clicking a random earrings product.");
        cart1.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);

        test.get().info("Selecting random band material for earrings.");
        cart1.selectRandomBandMaterial();

        test.get().info("Adding earrings to cart.");
        cart1.addToCartButton();

        // Adding Wedding Products (Anniversary Band)
        test.get().info("Navigating to Wedding section.");
        cart1.clickWeddingLink();

        test.get().info("Selecting Anniversary option.");
        cart1.selectAnniversaryOption();

        test.get().info("Clicking a random anniversary product.");
        cart1.clickRandomProduct(FDPageObjectData.weddingProductPLP);

        test.get().info("Selecting random band material for anniversary band.");
        cart1.selectRandomBandMaterial();

        test.get().info("Adding anniversary band to cart.");
        cart1.addToCartButton();

        // Adding Gold Band
        test.get().info("Navigating back to Wedding section to add Gold Band.");
        cart1.clickWeddingLink();

        test.get().info("Selecting Gold Band option.");
        cart1.selectGoldBand();

        test.get().info("Clicking a random gold band product.");
        cart1.clickRandomProduct(FDPageObjectData.weddingProductPLP);

        test.get().info("Selecting random band material for gold band.");
        cart1.selectRandomBandMaterial();

        test.get().info("Adding gold band to cart.");
        cart1.addToCartButton();

        Thread.sleep(2000); // Consider replacing with WebDriver wait.

        // Proceed to Checkout
        test.get().info("Proceeding to checkout with all added products.");
        cart1.proceedToCheckout();

        test.get().info("Validating the checkout process.");
        cart1.checkoutValidation();
    }
}
