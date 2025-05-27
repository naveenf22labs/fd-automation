package cartCheckout;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class RemovingJewelryProducts extends FDUtils {

    @Test(groups = "CartCheckoutTestCases", description = "Verified removal of all jewelry products from the cart.")
    public void removingJewelryProductsFromCart() throws InterruptedException
    {
    	// Initialize ExtentTest for this test
        ExtentTest logger = getExtentInstance().createTest("Removing jewelry products flow Test");
        test.set(logger);
        FDPageObjectData cart = new FDPageObjectData(driver);

        // Adding EarRings to cart
        test.get().info("Navigating to Jewelry section to add Earrings.");
        cart.jewelryNav();

        test.get().info("Selecting Earrings option.");
        cart.earRingsOption();

        test.get().info("Closing popup if present.");
        cart.closePopUp();

        test.get().info("Clicking on a random Earrings product.");
        cart.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);

        test.get().info("Interacting with Reamaze widget.");
        cart.doubleClickReamazeWidget();

        test.get().info("Selecting random band material for Earrings.");
        cart.selectRandomBandMaterial();

        test.get().info("Adding Earrings to cart.");
        cart.addToCartButton();

        // Adding Tennis Necklace to cart
        test.get().info("Navigating to Jewelry section to add Tennis Necklace.");
        cart.jewelryNav();

        test.get().info("Selecting Tennis Necklace option.");
        cart.selectTennisNecklace();

        test.get().info("Clicking on a random Tennis Necklace product.");
        cart.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);

        test.get().info("Selecting random band material for Tennis Necklace.");
        cart.selectRandomBandMaterial();

        test.get().info("Adding Tennis Necklace to cart.");
        cart.addToCartButton();

        // Adding Necklace + Diamond Combo
        test.get().info("Navigating to Jewelry section to add Necklace + Diamond combo.");
        cart.jewelryNav();

        test.get().info("Selecting Necklace option.");
        cart.selectnecklesOption();

        Thread.sleep(2000); // Replace with WebDriverWait if possible

        test.get().info("Clicking on a random Necklace product.");
        cart.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);

        test.get().info("Selecting random band material for Necklace.");
        cart.selectRandomBandMaterial();

        test.get().info("Clicking 'Select This Necklace' button.");
        cart.selectThisNecklaceButton();

        test.get().info("Searching for a diamond to pair with the necklace.");
        cart.searchSettingForThisDiamond();

        test.get().info("Selecting a diamond from Necklace PLP.");
        cart.selectDiamondFromNecklacesPlp();

        Thread.sleep(2000); // Replace with WebDriverWait if needed

        test.get().info("Adding selected diamond to Necklace.");
        cart.addDiamondToNecklaceButton();

        Thread.sleep(3000); // For UI stability, consider explicit wait

        // Removing all jewelry products from cart
        test.get().info("Focusing on cart.");
        cart.cartFocusUp();

        test.get().info("Removing all products from cart.");
        cart.removeAllProductsFromCart();

        // Uncomment this if you want to test single item removal
        // cart.removeProductFromCart(1);
    }
}
