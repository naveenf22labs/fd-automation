package cartCheckout;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class RemovingJewelryWeddingProducts extends FDUtils
{
	@Test(groups="CartCheckoutTestCases", description="Adding and removing the jewelry and wedding products from the cart.")
	public void RemovingTheProductsFromTheCart() throws InterruptedException
	{
		FDPageObjectData cart=new FDPageObjectData(driver);
		//Adding jewelry products to the cart i.e, EarRings, TennisBracelets,Necklace+Diamond Combo
		cart.jewelryNav();
    	cart.earRingsOption();
    	cart.closePopUp();
    	cart.jewleryPlp();
    	cart.doubleClickReamazeWidget();
    	cart.addToCartButton();
    	cart.jewelryNav();
		cart.selectTennisNecklace();
        cart.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);
		
		cart.addToCartButton();
		//adding Necklace+diamond combo
		cart.jewelryNav();
        cart.selectnecklesOption();
        Thread.sleep(2000);
        cart.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);
    	//cart.jewleryPlp();
    	cart.selectThisNecklaceButton();
    	// using diamond flow method only bcz we created unique xpath for reusability.
    	cart.searchSettingForThisDiamond();
    	cart.selectDiamondFromNecklacesPlp();
    	Thread.sleep(2000);
    	cart.addDiamondToNecklaceButton();
    	//adding wedding products to the cart.
    	cart.clickWeddingLink();
    	cart.selectAnniversaryOption();
    	cart.clickRandomProduct(FDPageObjectData.weddingProductPLP);
    	cart.addToCartButton();
    	//Adding goldBand product to the cart.
    	cart.clickWeddingLink();
		cart.selectGoldBand();	
		cart.clickRandomProduct(FDPageObjectData.weddingProductPLP);
	    cart.addToCartButton();
    	Thread.sleep(3000);
    	cart.cartFocusUp();
    	cart.removeAllProductsFromCart();
		//cart.removeProductFromCart(1);
		//Thread.sleep(3000);
	}

}
