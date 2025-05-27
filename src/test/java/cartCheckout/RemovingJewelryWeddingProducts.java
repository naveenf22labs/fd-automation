package cartCheckout;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class RemovingJewelryWeddingProducts extends FDUtils {

    @Test(groups = "CartCheckoutTestCases", description = "Adding and removing the jewelry and wedding products from the cart.")
    public void RemovingTheProductsFromTheCart() throws InterruptedException
    {
    	// Initialize ExtentTest for this test
        ExtentTest logger = getExtentInstance().createTest("Removing jewelry and wedding products flow Test");
        test.set(logger);
        FDPageObjectData cart = new FDPageObjectData(driver);

        // Adding Jewelry Products

        test.get().info("Navigating to Jewelry section to add Earrings.");
        cart.jewelryNav();

        test.get().info("Selecting Earrings option.");
        cart.earRingsOption();

        test.get().info("Closing popup if present.");
        cart.closePopUp();

        test.get().info("Navigating to Jewelry PLP.");
        cart.jewleryPlp();

        test.get().info("Interacting with Reamaze widget.");
        cart.doubleClickReamazeWidget();

        test.get().info("Selecting random band material for Earrings.");
        cart.selectRandomBandMaterial();

        test.get().info("Adding Earrings to cart.");
        cart.addToCartButton();

        test.get().info("Navigating to Jewelry section to add Tennis Necklace.");
        cart.jewelryNav();

        test.get().info("Selecting Tennis Necklace option.");
        cart.selectTennisNecklace();

        test.get().info("Clicking a random Tennis Necklace product.");
        cart.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);

        test.get().info("Selecting band material for Tennis Necklace.");
        cart.selectRandomBandMaterial();

        test.get().info("Adding Tennis Necklace to cart.");
        cart.addToCartButton();

        // Adding Necklace + Diamond Combo

        test.get().info("Navigating to Jewelry section to add Necklace + Diamond combo.");
        cart.jewelryNav();

        test.get().info("Selecting Necklace option.");
        cart.selectnecklesOption();

        Thread.sleep(2000); // Replace with WebDriverWait for reliability

        test.get().info("Clicking a random Necklace product.");
        cart.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);

        test.get().info("Selecting band material for Necklace.");
        cart.selectRandomBandMaterial();

        test.get().info("Selecting this Necklace.");
        cart.selectThisNecklaceButton();

        test.get().info("Searching for a diamond for the Necklace.");
        cart.searchSettingForThisDiamond();

        test.get().info("Selecting a diamond from the Necklaces PLP.");
        cart.selectDiamondFromNecklacesPlp();

        Thread.sleep(2000); // Consider replacing

        test.get().info("Adding selected diamond to the Necklace.");
        cart.addDiamondToNecklaceButton();

        // Adding Wedding Products

        test.get().info("Navigating to Wedding section to add Anniversary Band.");
        cart.clickWeddingLink();

        test.get().info("Selecting Anniversary Band option.");
        cart.selectAnniversaryOption();

        test.get().info("Clicking a random Anniversary Band product.");
        cart.clickRandomProduct(FDPageObjectData.weddingProductPLP);

        test.get().info("Selecting band material for Anniversary Band.");
        cart.selectRandomBandMaterial();

        test.get().info("Adding Anniversary Band to cart.");
        cart.addToCartButton();

        test.get().info("Navigating to Wedding section to add Gold Band.");
        cart.clickWeddingLink();

        test.get().info("Selecting Gold Band option.");
        cart.selectGoldBand();

        test.get().info("Clicking a random Gold Band product.");
        cart.clickRandomProduct(FDPageObjectData.weddingProductPLP);

        test.get().info("Selecting band material for Gold Band.");
        cart.selectRandomBandMaterial();

        test.get().info("Adding Gold Band to cart.");
        cart.addToCartButton();

        Thread.sleep(3000); // Replace with WebDriverWait if needed

        // Removing All Products

        test.get().info("Focusing on cart.");
        cart.cartFocusUp();

        test.get().info("Removing all products from the cart.");
        cart.removeAllProductsFromCart();

        // Uncomment below to test individual item removal
        // cart.removeProductFromCart(1);
        // Thread.sleep(3000);
    }
}
