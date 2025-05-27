package cartCheckout;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class SettingsJewelryWeddingItems extends FDUtils {

    @Test(groups = "CartCheckoutTestCases", description = "Removing the added products from the cart i.e., setting-Diamond flow, Jewelry products, Anniversary ring.")
    public void cancelProductsFromCart() throws InterruptedException 
    {
    	// Initialize ExtentTest for this test
        ExtentTest logger = getExtentInstance().createTest("Removing settings flow , jewelry products, anniversaryr= rings flow Test");
        test.set(logger);
        FDPageObjectData cart = new FDPageObjectData(driver);

        // Setting + Diamond Flow
        test.get().info("Navigating to Engagement section to start with a setting.");
        cart.clickEngagementLink();

        test.get().info("Starting with a setting.");
        cart.startWithSetting();

        test.get().info("Clicking a random setting product.");
        cart.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);

        test.get().info("Selecting a random band material.");
        cart.selectRandomBandMaterial();

        test.get().info("Selecting the setting.");
        cart.selectThisSetting();

        test.get().info("Searching for a diamond for the selected setting.");
        cart.searchSettingForThisDiamond();

        test.get().info("Closing any popup that appears.");
        cart.closePopUp();

        test.get().info("Interacting with Reamaze widget.");
        cart.doubleClickReamazeWidget();

        test.get().info("Selecting a second diamond.");
        cart.selectDiamond2();

        test.get().info("Adding selected diamond to the setting.");
        cart.addStoneToSetting();

        test.get().info("Focusing on the cart.");
        cart.cartFocusUp();

        Thread.sleep(3000);  // Consider replacing with WebDriverWait

        test.get().info("Closing cart.");
        cart.closeCart();

        // Adding Jewelry Item - Earrings
        test.get().info("Navigating to Jewelry section to add earrings.");
        cart.jewelryNav();

        test.get().info("Selecting Earrings option.");
        cart.earRingsOption();

        test.get().info("Clicking a random earrings product.");
        cart.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);

        test.get().info("Selecting band material for earrings.");
        cart.selectRandomBandMaterial();

        test.get().info("Adding earrings to cart.");
        cart.addToCartButton();

        test.get().info("Closing cart.");
        cart.closeCart();

        // Adding Wedding Product - Anniversary Ring
        test.get().info("Navigating to Wedding section to add Anniversary ring.");
        cart.clickWeddingLink();

        test.get().info("Selecting Anniversary option.");
        cart.selectAnniversaryOption();

        test.get().info("Clicking a random Anniversary ring.");
        cart.clickRandomProduct(FDPageObjectData.weddingProductPLP);

        test.get().info("Selecting band material for Anniversary ring.");
        cart.selectRandomBandMaterial();

        test.get().info("Adding Anniversary ring to cart.");
        cart.addToCartButton();

        Thread.sleep(3000); // Optional: replace with wait

        // Remove All from Cart
        test.get().info("Focusing on the cart.");
        cart.cartFocusUp();

        test.get().info("Removing all products from the cart.");
        cart.removeAllProductsFromCart();

        // Optional: For removing a single item
        // cart.removeProductFromCart(1);
    }
}
