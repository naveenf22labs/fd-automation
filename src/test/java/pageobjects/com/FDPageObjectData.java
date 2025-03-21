package pageobjects.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FDPageObjectData
{

    public ChromeDriver driver;
    
    public By engagementLink = By.xpath("//span[text()='Engagement']");
    public By startWithDiamondOption = By.xpath("//span[text()='Start with a diamond']");
    public By startWithSettingOption = By.xpath("//span[text()='Start with a setting']");

    public By searchDiamondsOption = By.xpath("//span[text()='SEARCH DIAMONDS']");
    public By reamazeWidgetIcon = By.id("reamaze-widget-icon");
    public By closePopUpButton = By.className("klaviyo-close-form");
    public By diamondRow = By.xpath("(//div[starts-with(@name, 'diamond-row')])[1]"); //start with a flow diamond
    public By diamondRowForSetting=By.xpath("(//div[starts-with(@name, 'diamond-row')])[1]");// Start with a setting flow
    public By selectThisStoneButton = By.xpath("(//button[text()='Select this stone'])[1]");
    public By searchSettingButton = By.xpath("//button[@type='button' and @variant='primary']");
    public By harperRingLink = By.xpath("//a[text()='The Harper ']");
    public By addSettingToStoneButton = By.xpath("(//button[text()='Add Setting to stone'])[2]");
    public By addStoneToSettingButton = By.xpath("(//button[text()='Add stone to setting'])[1]");

    public By selectThisSettingButton = By.xpath("(//button[text()='Select this setting'])[2]");

    public By checkoutButton = By.xpath("//button[text()='Checkout']");
    //----------------------------------- Wedding properties------------------
    private By weddingtLink = By.xpath("//span[text()='Wedding']");
    private By menWeddingbandXPath = By.xpath("//span[text()='Mens Wedding Bands']");
    private By menWeddingPlp= By.xpath("//a[text()='The Rigatoni']");

    private By addToCartXpath=By.xpath("(//button[text()='Add to Cart'])[2]");
    
    private By anniversaryXpath=By.xpath("//span[text()='Anniversary Rings']");
    private By  anniversaryPlpXpath=By.xpath("//a[text()='The Round Scallop Eternity 3mm']");
    
    private By stackingRingsXpath=By.xpath("//span[text()='Stacking Rings']");
    private By stackingPlpXpath=By.xpath("//a[text()='The Skinny Eternity']");

    private By  diamondBandXpath=By.xpath("//span[text()='Diamond Bands']");
    
    private By diamondBandPlp=By.id("wedding-rings-1");
    
    private By eternityBandXpath=By.xpath("//span[text()='Eternity Bands']");
    private By goldBandXpath=By.xpath("//span[text()='Gold Bands']");
    //---------------------Jewelry--------------------
    
    private By jewelryXpath=By.xpath("//span[text()='Jewelry']");
    private By earRingsXpath=By.xpath("//span[text()='Earrings']");
    
    private By earRingsPlp=By.id("engagement-rings-1");
    
    private By necklesXpath=By.xpath("//span[text()='Necklaces']");
    private By necklaceButtonXpath=By.xpath("(//button[text()='Select this necklace'])[2]");
    
    private By selectDiamondForNecklace=By.name("diamond-row-746984FD");
    
        
    private By  addDiamondToNecklaceButtonXpath= By.xpath("(//button[text()='Add diamond to necklace'])[1]");
    private By tennisNecklaceXpath=By.xpath("(//span[text()='Tennis Bracelets'])[1]");
    private By giftGuideXpath=By.xpath("//span[text()='Gift Guide']");
    private By  giftGuidePlp=By.xpath("(//button[@value='Continue'])[2]");
    
    //Cart                  
    private By  closeCartXpath= By.xpath("//button[@aria-label='Close cart']");
    
    private By globalPlp=By.id("engagement-rings-1");
  //  private By cartProduct1Removal=By.xpath("(//span[@class='mr-1.5 cursor-pointer']//*[name()='svg'])[1]");
   // private By cartProduct2Removal=By.xpath("(//span[@class='mr-1.5 cursor-pointer']//*[name()='svg'])[2]");
 /*
    private By cartProductRemoval(int index) 
    {
        return By.xpath("(//span[@class='mr-1.5 cursor-pointer']//*[name()='svg'])[" + index + "]");
    }

    public void removeProductFromCart(int index) 
    {
        driver.findElement(cartProductRemoval(index)).click();
    }

   */
    //----------

    private By cartProductRemoval(int index) {
        return By.xpath("(//span[@class='mr-1.5 cursor-pointer']//*[name()='svg'])[" + index + "]");
    }



    // Method to scroll the page to the top
    public void scrollToTop() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // Scroll the page to the top using JavaScript
        jsExecutor.executeScript("window.scrollTo(0, -800);");
    }

    // Method to remove a product from the cart using JavaScript to click
    public void removeProductFromCart(int index) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Get the element for the product removal button
        By productRemovalElement = cartProductRemoval(index);

        // Wait until the element is clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(productRemovalElement));

        // Scroll the page to the top before interacting with the element
        scrollToTop();

        // Optional: wait a bit for smooth scrolling (adjust if needed)
        try {
            Thread.sleep(1000); // You can remove or adjust the sleep time based on your needs
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Use JavaScript to trigger the click event
        jsExecutor.executeScript("arguments[0].dispatchEvent(new MouseEvent('click', { bubbles: true, cancelable: true }))", element);

        // Wait for the cart to update after the removal
        wait.until(ExpectedConditions.invisibilityOfElementLocated(productRemovalElement)); // Wait until the element is no longer visible
    }

    // Example method to loop through indices and remove products
    public void removeMultipleProductsFromCart(int totalProducts) {
        // Start from index 1 and remove products until the cart is empty or the specified number of products are removed
        for (int i = 1; i <= totalProducts; i++) {
            try {
                removeProductFromCart(i); // This will call the removeProductFromCart method with different indices
                Thread.sleep(2000); // Optional: wait for the cart to update (you can adjust the wait time)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }   //---------
    public FDPageObjectData(ChromeDriver driver) {
        this.driver = driver;
    }

    public void clickEngagementLink() {
        driver.findElement(engagementLink).click();
    }

    public void startWithDiamond() {
        driver.findElement(startWithDiamondOption).click();
    }

    public void searchDiamonds() {
        driver.findElement(searchDiamondsOption).click();
    }

    public void doubleClickReamazeWidget() throws InterruptedException {
        WebElement element = driver.findElement(reamazeWidgetIcon);
        Actions act = new Actions(driver);
        act.click(element).perform();
        Thread.sleep(2000);
       act.click().build().perform();
       //Thread.sleep(2000);

       
    }

    public void closePopUp() {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement closePopUp = wait1.until(ExpectedConditions.elementToBeClickable(closePopUpButton));
        closePopUp.click();
    }
    //Start with a Diamond flow
    public void selectDiamond1() {
        driver.findElement(diamondRow).click();
    }
    
    public void selectDiamond2() {
        driver.findElement(diamondRowForSetting).click();
    }
 
    public void selectThisStone() {
        driver.findElement(selectThisStoneButton).click();
    }
    //select this setting button 
    public void selectThisSetting() {
    	driver.findElement(selectThisSettingButton).click();
    }
            //can use this method  to entire project bcz i developed with unique xpath
    public void searchSettingForThisDiamond() {
        driver.findElement(searchSettingButton).click();
    }

    public void selectHarperRing() {
        driver.findElement(harperRingLink).click();
    }
        // Diamond flow
    public void addSettingToStone() {
        driver.findElement(addSettingToStoneButton).click();
    }
    //Setting flow
    public void addStoneToSetting() {
        driver.findElement(addStoneToSettingButton).click();
    }
    public void proceedToCheckout() {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
         WebElement checkout = wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
         checkout.click();
       // driver.findElement(checkoutButton).click();     
        
    }
    
    public void startWithSetting()
    {
    	driver.findElement(startWithSettingOption).click();
    }
    
    public void checkoutValidation() throws InterruptedException
    {
        Thread.sleep(3000);

    	System.out.println(driver.getTitle());
    	String expectedTitle="Checkout - FD";
    	String currentTitle=driver.getTitle();
        Assert.assertEquals(currentTitle, expectedTitle);
       // Assert.assertTrue(currentTitle.contains("Checkout - FD"));


    }
    //-------------------Wedding properties-----------------
	  //Selecting wedding from nav
    public void clickWeddingLink()
    {
    	driver.findElement(weddingtLink).click();
    }
	  //Selecting Men Wedding bands option from Wedding
    public void selectMenWeddingoption()
    {
    	driver.findElement(menWeddingbandXPath).click();
    }
    
    public void SelectingMenWeddingPlp()
    {
    	driver.findElement(menWeddingPlp).click();
    }
    
    public void addToCartButton()
    {
    	driver.findElement(addToCartXpath).click();
    }
    //Anniversary option clicking from wedding navigation
    public void selectAnniversaryOption()
    {
    	driver.findElement(anniversaryXpath).click();
    }

    public void selectAnniversaryPlp()
    {
    	driver.findElement(anniversaryPlpXpath).click();
    }
    
    public void stackingRings() 
    {
    	driver.findElement(stackingRingsXpath).click();
    	
    }
    public void stackingRingsplp()
    {
    	driver.findElement(stackingPlpXpath).click();
    }
    public void selectDiamondBand() 
    {
    	driver.findElement(diamondBandXpath).click();
    	
    }
    //can use same id locator to enternity plp as well bcz both are same.
    public void selectDiamondBandProduct()
    {
    	driver.findElement(diamondBandPlp).click();
    }
    public void selectEternityBand() 
    {
    	driver.findElement(eternityBandXpath).click();
    }
    public void  selectGoldBand()
    {
    	driver.findElement(goldBandXpath).click();
    }
    //-----------------------------------------------Jewelry--------------------------
    
    public void jewelryNav()
    {
    	driver.findElement(jewelryXpath).click();
    }
    
    public void earRingsOption()
    {
    	driver.findElement(earRingsXpath).click();
    }
    public void jewleryPlp()
    {
    	driver.findElement(earRingsPlp).click();
    }
    public void selectnecklesOption()
    {
    	driver.findElement(necklesXpath).click();
    }
    public void selectThisNecklaceButton()
    {
    driver.findElement(necklaceButtonXpath).click();
    }
    public void selectDiamondFromNecklacesPlp() 
    {
    	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
         WebElement necklacePlp = wait1.until(ExpectedConditions.elementToBeClickable(selectDiamondForNecklace));
         necklacePlp.click();
    	//driver.findElement(selectDiamondForNecklace).click();
    }
    
    public void addDiamondToNecklaceButton()
    {
    	driver.findElement(addDiamondToNecklaceButtonXpath).click();
    }
    
    public void selectTennisNecklace()
    {
    	driver.findElement(tennisNecklaceXpath).click();
    }
    
    public void giftGuide() 
    {
    	driver.findElement(giftGuideXpath).click();
    	
    }
    public void selectGiftGuidePlp() 
    {
    driver.findElement(giftGuidePlp).click();	
    }

    
    public void closeCart() throws InterruptedException
    {

    	  // Create WebDriverWait to wait for the element to become visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Locate the element
        WebElement cart = wait.until(ExpectedConditions.visibilityOfElementLocated(closeCartXpath));

        // Scroll the element into view
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", cart);

        // Use JavascriptExecutor to click the element directly
        js.executeScript("arguments[0].click();", cart);
    	//driver.findElement(closeCartXpath).click();
    }
    public void globalPLPRing()
    {
    	driver.findElement(globalPlp).click();
    }
}
