package cartCheckout;

import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class RemovingJewelryProducts extends FDUtils
{

	@Test(groups="CartCheckoutTestCases", description="Verified removal of all jewelry products from the cart.")
	public void removingJewelryProductsFromCart() throws InterruptedException
	{
	    	FDPageObjectData cart=new FDPageObjectData(driver);
	    	
	    	//Adding jewelry products to the cart i.e, EarRings, TennisBracelets,Necklace+Diamond Combo
			cart.jewelryNav();
	    	cart.earRingsOption();
	    	cart.closePopUp();
	    	cart.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);
	    	//cart.jewleryPlp();
	    	cart.doubleClickReamazeWidget();
	    	cart.addToCartButton();
	    	cart.jewelryNav();
			cart.selectTennisNecklace();
			cart.clickRandomProduct(FDPageObjectData.jewelryProductsPLP);
			//cart.jewleryPlp();
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
	    	Thread.sleep(3000);
	    	cart.cartFocusUp();
             cart.removeAllProductsFromCart();
             Thread.sleep(2000);
			//cart.removeProductFromCart(1);
		
	}
}
