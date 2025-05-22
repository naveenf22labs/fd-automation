package pageobjects.com;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FDPageObjectData
{

    public WebDriver driver;
    
    public By engagementLink = By.xpath("//span[text()='Engagement']");
    
    public By startWithDiamondOption = By.xpath("//span[text()='Start with a diamond']");
    
    public By startWithSettingOption = By.xpath("//span[text()='Start with a setting']");
    private By defaultDiamondXpath = By.xpath("//div[text()='Continue with the default diamond stone']");
 
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
    
    private By earRingsPlp=By.xpath("//div[contains(@class,'w-vw-1/2 h') and contains(@id,'engagement-rings')]");
    
    private By necklesXpath=By.xpath("//span[text()='Necklaces']");
    private By necklaceButtonXpath=By.xpath("(//button[text()='Select this necklace'])[2]");
    
    private By selectDiamondForNecklace=By.xpath("(//div[starts-with(@name, 'diamond-row')])[1]");
    
        
    private By  addDiamondToNecklaceButtonXpath= By.xpath("(//button[text()='Add diamond to necklace'])[1]");
    private By tennisNecklaceXpath=By.xpath("(//span[text()='Tennis Bracelets'])[1]");
    private By giftGuideXpath=By.xpath("//span[text()='Gift Guide']");
    private By  giftGuidePlp=By.xpath("(//button[@value='Continue'])[2]");
    
    //Cart                  
    private By  closeCartXpath= By.xpath("//button[@aria-label='Close cart']");
    
    private By globalPlp=By.id("engagement-rings-1");
    private By cartFocus= By.xpath("(//div[@role='dialog'])[4]");
   
    // driver.findElement(By.tagName("a"));
    
    public void cartFocusUp() throws InterruptedException
    {
    	WebElement cartElement = driver.findElement(cartFocus);

    	// Create an instance of JavascriptExecutor
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	
    	js.executeScript("arguments[0].scrollTop = 0;", cartElement);
    	js.executeScript("arguments[0].scrollIntoView(true);", cartElement); 
    
    }
  
    private By cartProductRemoval(int index) 
    {
        return By.xpath("(//span[@class='mr-1.5 cursor-pointer']//*[name()='svg'])[" + index + "]");
    }
// New Removal code
    private By allCartRemoveIcons=By.xpath("(//span[@class='mr-1.5 cursor-pointer']//*[name()='svg'])");
    public void removeAllProductsFromCart()
    {
    	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        int removedCount = 0;
        List<WebElement> removeIcons = driver.findElements(allCartRemoveIcons);

        while (!removeIcons.isEmpty()) {
            try {
                removeIcons.get(0).click();
                removedCount++;
                Thread.sleep(1000);
                removeIcons = driver.findElements(allCartRemoveIcons);
            } catch (Exception e) {
                System.out.println("Error after removing " + removedCount + " items: " + e.getMessage());
                break;
            }
        }

        System.out.println("Total products removed from cart: " + removedCount);
    }

    
    //New Removal code
    
   public void removeProductFromCart(int index) throws InterruptedException 
    {
    	for (int i=1; i<=3;  i++)
    	{
    		  driver.findElement(cartProductRemoval(index)).click();
    		 //Thread.sleep(2000);

    	}
              
    }
  
  // public WebDriver driver;
   public FDPageObjectData(WebDriver driver) {
       this.driver = driver;
   }

   
   
//    public FDPageObjectData(WebDriver driver) {
//        this.driver = (ChromeDriver) driver;
//    }

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
 
    public void selectThisStone()
    {
    	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement selectingStone = wait1.until(ExpectedConditions.elementToBeClickable(selectThisStoneButton));
        selectingStone.click();
       // driver.findElement(selectThisStoneButton).click();
    }
    //select this setting button 
    public void selectThisSetting() {
    	driver.findElement(selectThisSettingButton).click();
    }
            //can use this method  to entire project bcz i developed with unique xpath
    public void searchSettingForThisDiamond() {
        driver.findElement(searchSettingButton).click();
    }
    
    public void defaultDiamond()
    {
    	driver.findElement(defaultDiamondXpath).click();
    }

    public void selectHarperRing() {
        driver.findElement(harperRingLink).click();
    }
        // Diamond flow
    public void addSettingToStone() {
        driver.findElement(addSettingToStoneButton).click();
    }
    //Setting flow
    public void addStoneToSetting() 
    {
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
    	/* WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
         WebElement earRing = wait1.until(ExpectedConditions.elementToBeClickable(earRingsPlp));
         earRing.click();*/
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

   	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement diamondTonecklace = wait1.until(ExpectedConditions.elementToBeClickable(addDiamondToNecklaceButtonXpath));
        diamondTonecklace.click();
    	//driver.findElement(addDiamondToNecklaceButtonXpath).click();
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
    	
    	
    	// Initialize WebDriverWait
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    	// Wait for the element to be visible
    	WebElement cart = wait.until(ExpectedConditions.visibilityOfElementLocated(closeCartXpath));

    	// Scroll the element into view to ensure it's visible in the viewport
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	// Wait for the element to be clickable
    	wait.until(ExpectedConditions.elementToBeClickable(cart));

    	// Now click the element
    	//cart.click();
    	js.executeScript("arguments[0].click();", cart);

    	
    }
    public void globalPLPRing()
    {
    	driver.findElement(globalPlp).click();
    }
          
    
    // random product selection code for weddings
  //  private By productItems=By.xpath("//div[@id='ring-container']");
  public static  By weddingProductPLP=By.xpath("//div[contains(@class,'w-vw-1/2 h') and contains(@id,'wedding-rings')]");
  
  public static By jewelryProductsPLP = By.xpath("//div[contains(@class,'w-vw-1/2 h') and contains(@id,'engagement-rings')]");
   
  
  //Diamond setting PLP
  public static By diamondSettingPLP = By.xpath("//div[contains(@class,'w-vw-1/2 h')]");


      //Method to get the list of product items
    public List<WebElement> getProductList(By productLocator) 
    {
     return driver.findElements(productLocator);
     
    }

//Method to scroll to the bottom of the page until all products are loaded
  public void scrollToEndOfPage(By productLocator) throws InterruptedException
  {
   JavascriptExecutor js = (JavascriptExecutor) driver;
   long lastHeight = (long) js.executeScript("return document.body.scrollHeight");

   while (true) 
   {
       // Scroll to the bottom of the page
       js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
       Thread.sleep(3000); // Adjust based on page load speed

       // Wait for new products to load (Optional - depending on page behavior)
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(productLocator)); // Ensure products are visible

       // Check if new products are loaded by comparing scroll height
       long newHeight = (long) js.executeScript("return document.body.scrollHeight");
       if (newHeight == lastHeight) 
       {
           break; // Exit the loop when no new products are loaded
       }
       lastHeight = newHeight;
   }
}

      //Method to select a random product from the PLP
      public WebElement selectRandomProduct(By productLocator)
      {
          List<WebElement> products = getProductList(productLocator);
           Random rand = new Random();
           int randomIndex = rand.nextInt(products.size());
             return products.get(randomIndex);
     }

     //Method to click on a random product
    public void clickRandomProduct(By productLocator) throws InterruptedException
    {
      // Scroll to the end of the page first
       scrollToEndOfPage(productLocator);

       // Select and click a random product
       WebElement randomProduct = selectRandomProduct(productLocator);
         randomProduct.click();
   }
   

//    public void clickRandomJewelryProduct() throws InterruptedException
//    {
//    	 scrollToEndOfPage();
//        selectRandomProduct();
//    }
//
//    public By weddingRingLocator = By.xpath("//div[contains(@class,'w-vw-1/2 h') and contains(@id,'wedding-rings')]");
//
//    public void clickRandomWeddingRing(By locator) throws InterruptedException {
//        clickRandomProduct(weddingRingLocator);
//    }

    //booking dropdowns
    private By appointmentsXpath=By.xpath("//span[text()='Showrooms']");
    
    public void showrooms()
    {
    	driver.findElement(appointmentsXpath).click();
    	
    }
    private By virtualAppointment=By.xpath("//span[text()='Book a Virtual Appointment']");
    public void virtualAppointments()
    {
    	driver.findElement(virtualAppointment).click();
    	
    }
    
    // selecting random dropdown elements for products in pdp.
    private By bandMaterialDropdownSelector=By.xpath("(//select[@name='bandSelector'])[2]");
    private By tennisLength=By.xpath("(//select[@name='braceletLength'])[2]");
    private By ringSize=By.xpath("(//select[@name='sizeSelector'])[2]");

    public void selectRandomOption(By dropdownLocator, String dropdownName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownLocator));
        Select dropdown = new Select(dropdownElement);
        List<WebElement> options = dropdown.getOptions();

        if (options.size() > 0) {
            int randomIndex = new Random().nextInt(options.size());  // skip placeholder
            WebElement randomOption = options.get(randomIndex);
            dropdown.selectByVisibleText(randomOption.getText());
            System.out.println("Selected random option for " + dropdownName + ": " + randomOption.getText());
        } else {
            System.out.println("No valid options found for " + dropdownName);
        }
    }
    
    public void selectRandomBandMaterial() {
        selectRandomOption(bandMaterialDropdownSelector, "Band Material");
    }

    public void ringSizer() {
        selectRandomOption(ringSize, "Ring Size");
    }

    public void tennisTotalLength() {
        selectRandomOption(tennisLength, "Tennis Length");
    }

  /*  public void selectRandomBandMaterial() throws InterruptedException
    {
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       // Wait until dropdown is visible
        WebElement dropdownElement = wait.until(
           ExpectedConditions.visibilityOfElementLocated(bandMaterialDropdownSelector));
 
    	//WebElement dropdownElement = driver.findElement(bandMaterialDropdownSelector);
        Select dropdown = new Select(dropdownElement);
        List<WebElement> options = dropdown.getOptions();

        int startIndex = 0; 
        int randomIndex = new Random().nextInt(options.size() - startIndex) + startIndex;
        WebElement randomOption = options.get(randomIndex);

        String optionText = randomOption.getText();
        dropdown.selectByVisibleText(optionText);

        System.out.println("Randomly selected dropdown option: " + optionText);    	
    }
    
       
       public void ringSizer() 
       {
    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	       // Wait until dropdown is visible
    	        WebElement dropdownElement = wait.until(
    	           ExpectedConditions.visibilityOfElementLocated(ringSize));
    	 
    	    	//WebElement dropdownElement = driver.findElement(bandMaterialDropdownSelector);
    	        Select dropdown = new Select(dropdownElement);
    	        List<WebElement> options = dropdown.getOptions();

    	        int startIndex = 0; 
    	        int randomIndex = new Random().nextInt(options.size() - startIndex) + startIndex;
    	        WebElement randomOption = options.get(randomIndex);

    	        String optionText = randomOption.getText();
    	        dropdown.selectByVisibleText(optionText);

    	        System.out.println("Randomly selected ring size is: " + optionText);   
       }
       
      
       public void tennisTotalLength() 
       {
    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    	       // Wait until dropdown is visible
    	        WebElement dropdownElement = wait.until(
    	           ExpectedConditions.visibilityOfElementLocated(tennisLength));
    	 
    	    	//WebElement dropdownElement = driver.findElement(bandMaterialDropdownSelector);
    	        Select dropdown = new Select(dropdownElement);
    	        List<WebElement> options = dropdown.getOptions();

    	        int startIndex = 0; 
    	        int randomIndex = new Random().nextInt(options.size() - startIndex) + startIndex;
    	        WebElement randomOption = options.get(randomIndex);

    	        String optionText = randomOption.getText();
    	        dropdown.selectByVisibleText(optionText);

    	        System.out.println("Randomly selected ring size is: " + optionText);   
       } */
       
    
  
}
