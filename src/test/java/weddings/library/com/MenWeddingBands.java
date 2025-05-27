package weddings.library.com;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class MenWeddingBands extends FDUtils {

    @Test(groups = "Wedding", description = "Tested the flow of Men Wedding bands. Selecting the Men Wedding Band, adding the product to cart and completing the checkout flow.")
    public void menWeddingBands() throws InterruptedException {
        
        // Initialize ExtentTest logger for this test
        ExtentTest logger = getExtentInstance().createTest("Men Wedding Bands Flow Test");
        test.set(logger);
        
        FDPageObjectData weddingPage = new FDPageObjectData(driver);

        test.get().info("Started Men Wedding Bands flow test");

        // Selecting wedding from Nav Bar
        weddingPage.clickWeddingLink();
        test.get().info("Clicked Wedding link");

        weddingPage.selectMenWeddingoption();
        test.get().info("Selected Men Wedding Bands option");

        weddingPage.clickRandomProduct(FDPageObjectData.weddingProductPLP);
        test.get().info("Clicked a random Men Wedding Band product");

        weddingPage.doubleClickReamazeWidget();
        test.get().info("Interacted with Reamaze widget");

        weddingPage.selectRandomBandMaterial();
        test.get().info("Selected random band material");

        weddingPage.ringSizer();
        test.get().info("Used ring sizer");

        weddingPage.addToCartButton();
        test.get().info("Added product to cart");

        weddingPage.proceedToCheckout();
        test.get().info("Proceeded to checkout");

        weddingPage.checkoutValidation();
        test.get().pass("Men Wedding Bands flow test completed and validated successfully");
    }
}
