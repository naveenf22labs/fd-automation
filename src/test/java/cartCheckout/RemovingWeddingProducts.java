package cartCheckout;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class RemovingWeddingProducts extends FDUtils {

    @Test(groups = "CartCheckoutTestCases", description = "Verified removal of wedding products from the cart.")
    public void removingWeddingProductsFromCart() throws InterruptedException
    {
    	// Initialize ExtentTest for this test
        ExtentTest logger = getExtentInstance().createTest("Removing wedding products flow Test");
        test.set(logger);
        FDPageObjectData cart = new FDPageObjectData(driver);

        // Adding Anniversary Band
        test.get().info("Navigating to Wedding section to add Anniversary Band.");
        cart.clickWeddingLink();

        test.get().info("Selecting Anniversary Band option.");
        cart.selectAnniversaryOption();

        test.get().info("Closing popup if present.");
        cart.closePopUp();

        test.get().info("Interacting with Reamaze widget.");
        cart.doubleClickReamazeWidget();

        test.get().info("Clicking a random Anniversary Band product.");
        cart.clickRandomProduct(FDPageObjectData.weddingProductPLP);

        test.get().info("Selecting random band material for Anniversary Band.");
        cart.selectRandomBandMaterial();

        test.get().info("Adding Anniversary Band to cart.");
        cart.addToCartButton();

        // Adding Gold Band
        test.get().info("Navigating back to Wedding section to add Gold Band.");
        cart.clickWeddingLink();

        test.get().info("Selecting Gold Band option.");
        cart.selectGoldBand();

        test.get().info("Clicking a random Gold Band product.");
        cart.clickRandomProduct(FDPageObjectData.weddingProductPLP);

        test.get().info("Selecting random band material for Gold Band.");
        cart.selectRandomBandMaterial();

        test.get().info("Adding Gold Band to cart.");
        cart.addToCartButton();

        // Adding Diamond Band
        test.get().info("Navigating to Wedding section to add Diamond Band.");
        cart.clickWeddingLink();

        test.get().info("Selecting Diamond Band option.");
        cart.selectDiamondBand();

        test.get().info("Clicking a random Diamond Band product.");
        cart.clickRandomProduct(FDPageObjectData.weddingProductPLP);

        test.get().info("Selecting random band material for Diamond Band.");
        cart.selectRandomBandMaterial();

        test.get().info("Adding Diamond Band to cart.");
        cart.addToCartButton();

        // Adding Men's Wedding Band
        test.get().info("Navigating to Wedding section to add Men's Wedding Band.");
        cart.clickWeddingLink();

        test.get().info("Selecting Men's Wedding Band option.");
        cart.selectMenWeddingoption();

        test.get().info("Clicking a random Men's Wedding Band product.");
        cart.clickRandomProduct(FDPageObjectData.weddingProductPLP);

        // Optional Reamaze Widget interaction
        // cart.doubleClickReamazeWidget();

        test.get().info("Selecting random band material for Men's Wedding Band.");
        cart.selectRandomBandMaterial();

        test.get().info("Adding Men's Wedding Band to cart.");
        cart.addToCartButton();

        Thread.sleep(3000); // Consider replacing with WebDriverWait for better stability

        // Removing all products from the cart
        test.get().info("Focusing on the cart.");
        cart.cartFocusUp();

        test.get().info("Removing all wedding products from the cart.");
        cart.removeAllProductsFromCart();

        // Uncomment for selective removal
        // cart.removeProductFromCart(1);
    }
}
