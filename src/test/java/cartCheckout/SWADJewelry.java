package cartCheckout;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class SWADJewelry extends FDUtils {

    @Test(groups = "CartCheckoutTestCases", description = "Removing the added products from the cart i.e., Diamond-Setting flow, Jewelry products, Anniversary ring.")
    public void removingProductsfromCart() throws InterruptedException 
    {
    	// Initialize ExtentTest for this test
        ExtentTest logger = getExtentInstance().createTest("Removing Diamond-Setting flow, Jewelry products, Anniversary ring flow Test");
        test.set(logger);

        FDPageObjectData cart1 = new FDPageObjectData(driver);

        // Diamond + Setting Flow
        test.get().info("Navigating to Engagement section to start with a diamond.");
        cart1.clickEngagementLink();

        test.get().info("Starting with a diamond.");
        cart1.startWithDiamond();

        test.get().info("Searching for diamonds.");
        cart1.searchDiamonds();

        test.get().info("Closing any popup.");
        cart1.closePopUp();

        test.get().info("Handling Reamaze widget.");
        cart1.doubleClickReamazeWidget();

        test.get().info("Selecting a diamond.");
        cart1.selectDiamond1();

        test.get().info("Confirming selection of the diamond.");
        cart1.selectThisStone();

        test.get().info("Searching for setting for selected diamond.");
        cart1.searchSettingForThisDiamond();

        test.get().info("Clicking a random product from diamond setting PLP.");
        cart1.clickRandomProduct(FDPageObjectData.diamondSettingPLP);

        test.get().info("Selecting random band material.");
        cart1.selectRandomBandMaterial();

        test.get().info("Adding selected setting to diamond.");
        cart1.addSettingToStone();

        test.get().info("Focusing on cart to validate items.");
        cart1.cartFocusUp();

        Thread.sleep(3000);  // Preferably use WebDriverWait

        test.get().info("Closing cart to continue shopping.");
        cart1.closeCart();

        // Adding Jewelry Item
        test.get().info("Navigating to Jewelry section.");
        cart1.jewelryNav();

        test.get().info("Selecting Earrings option.");
        cart1.earRingsOption();

        test.get().info("Clicking a random earrings product.");
        cart1.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);

        test.get().info("Selecting random band material for earrings.");
        cart1.selectRandomBandMaterial();

        test.get().info("Adding earrings to cart.");
        cart1.addToCartButton();

        test.get().info("Closing cart.");
        cart1.closeCart();

        // Adding Wedding Product - Anniversary Ring
        test.get().info("Navigating to Wedding section.");
        cart1.clickWeddingLink();

        test.get().info("Selecting Anniversary option.");
        cart1.selectAnniversaryOption();

        test.get().info("Clicking a random Anniversary ring product.");
        cart1.clickRandomProduct(FDPageObjectData.weddingProductPLP);

        test.get().info("Selecting random band material for Anniversary ring.");
        cart1.selectRandomBandMaterial();

        test.get().info("Adding Anniversary ring to cart.");
        cart1.addToCartButton();

        Thread.sleep(3000);

        // Removing All Products
        test.get().info("Focusing on cart before removal.");
        cart1.cartFocusUp();

        test.get().info("Removing all products from cart.");
        cart1.removeAllProductsFromCart();

        // Optional: Remove one by one
        // cart1.removeProductFromCart(1);
    }
}
