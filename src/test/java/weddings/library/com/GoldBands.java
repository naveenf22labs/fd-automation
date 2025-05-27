package weddings.library.com;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class GoldBands extends FDUtils {

    @Test(groups = "Wedding", description = "Tested the flow of Gold Bands. Selecting the gold band ring, adding to the cart and completing checkout flow.")
    public void goldBands() throws InterruptedException {
        
        ExtentTest logger = getExtentInstance().createTest("Gold Bands Flow Test");
        test.set(logger);

        FDPageObjectData goldBandPage = new FDPageObjectData(driver);

        test.get().info("Started Gold Bands flow test");

        goldBandPage.clickWeddingLink();
        test.get().info("Clicked Wedding link");

        goldBandPage.selectGoldBand();
        test.get().info("Selected Gold Band option");

        goldBandPage.closePopUp();
        test.get().info("Closed any popup");

        goldBandPage.doubleClickReamazeWidget();
        test.get().info("Interacted with Reamaze widget");

        goldBandPage.clickRandomProduct(FDPageObjectData.weddingProductPLP);
        test.get().info("Clicked random Gold Band product");

        // reusing diamond id locator in plp because id is same for all PLP products
        // goldBandPage.selectDiamondBandProduct();
        // Thread.sleep(2000);

        goldBandPage.selectRandomBandMaterial();
        test.get().info("Selected random band material");

        goldBandPage.ringSizer();
        test.get().info("Used ring sizer");

        goldBandPage.addToCartButton();
        test.get().info("Added product to cart");

        goldBandPage.proceedToCheckout();
        test.get().info("Proceeded to checkout");

        goldBandPage.checkoutValidation();
        test.get().pass("Gold Bands flow test completed and validated successfully");
    }
}
