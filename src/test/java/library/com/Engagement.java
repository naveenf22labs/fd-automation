package library.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.com.FDUtils;

public class Engagement extends FDUtils
{
	@Test
	public void startWithADiamond() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Engagement']")).click();
		
		  // Selecting start with a diamond option in engagement flow
		
		driver.findElement(By.xpath("//span[text()='Start with a diamond']")).click();
		// selecting search diamonds option
		driver.findElement(By.xpath("//span[text()='SEARCH DIAMONDS']")).click();
		
			
		//Closing pop-up
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement closePopUp=wait1.until(ExpectedConditions.elementToBeClickable(By.className("klaviyo-close-form")));
		closePopUp.click();
		// Locate the element by its ID
		
		// selecting the princess diamond from diamonds PLp
		driver.findElement(By.name("diamond-row-271100360FD")).click();
		WebElement element = driver.findElement(By.id("reamaze-widget-icon"));

		// Create an Actions object
		Actions act = new Actions(driver);

		// Perform double-click on the located element
		act.click(element).perform();
		Thread.sleep(2000);

		act.click().build().perform();
		//Thread.sleep(2000);

		//Clicking on select this stone button
	driver.findElement(By.xpath("(//button[text()='Select this stone'])[1]")).click();
	
	//Clicking on Search setting for this diamond button in popup.
	driver.findElement(By.xpath("//button[@type='button' and @variant='primary']")).click();
	//Selecting the ring from plp page
	driver.findElement(By.xpath("//a[text()='The Harper ']")).click();
	
	// Clicking on "Add Setting to this stone" button in PDP
	driver.findElement(By.xpath("(//button[text()='Add Setting to stone'])[2]")).click();
	
	//Thread.sleep(2000);
	
	
	WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement checkout=wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Checkout']")));
	checkout.click();
	
	

	//driver.findElement(By.xpath("//button[text()='Checkout']")).click();
	
		
		
	
	}

}
