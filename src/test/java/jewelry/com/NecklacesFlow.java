package jewelry.com;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class NecklacesFlow extends FDUtils {

    @Test(groups = "jewelry", description = "Tested the flow of Necklace. Selecting the necklace, adding diamond to the necklace, then add to the cart and completing the checkout flow.")
    public void jewelryNecklaceFlow() throws InterruptedException {

        // ✅ Initialize ExtentTest for logging
        ExtentTest logger = getExtentInstance().createTest("Jewelry Necklace Flow Test");
        test.set(logger);

        FDPageObjectData necklaces = new FDPageObjectData(driver);

        test.get().info("Started Necklace flow test");

        necklaces.jewelryNav();
        test.get().info("Navigated to Jewelry section");

        necklaces.selectnecklesOption();
        test.get().info("Selected the Necklaces option");

        necklaces.closePopUp();
        test.get().info("Closed any pop-up if present");

        Thread.sleep(2000);

        necklaces.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);
        test.get().info("Clicked on a random necklace product");

        necklaces.doubleClickReamazeWidget();
        test.get().info("Interacted with Reamaze widget");

        necklaces.selectRandomBandMaterial();
        test.get().info("Selected a random band material");

        necklaces.selectThisNecklaceButton();
        test.get().info("Clicked on 'Select This Necklace'");

        necklaces.searchSettingForThisDiamond();
        test.get().info("Searched setting for selected diamond");

        necklaces.selectDiamondFromNecklacesPlp();
        test.get().info("Selected diamond from necklaces PLP");

        Thread.sleep(2000);

        necklaces.addDiamondToNecklaceButton();
        test.get().info("Added diamond to necklace");

        Thread.sleep(2000);

        necklaces.proceedToCheckout();
        test.get().info("Proceeded to checkout");

        necklaces.checkoutValidation();
        test.get().pass("Necklace flow test completed and validated successfully");
    }
}
