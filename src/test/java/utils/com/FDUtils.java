package utils.com;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class FDUtils
{
	
	public static WebDriver driver;

	@BeforeTest
	public void launchUrl()
	{
		
		 driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://frankdarling.com");
	}
	
	
	 @AfterMethod
	    public void tearDown(ITestResult result) {
	        if (ITestResult.FAILURE == result.getStatus()) {
	            // Capture screenshot on failure
	            ScreenshotUtil.captureScreenshot(driver, result.getName());
	        }
	    }
	@AfterTest
	public void closeUrl()
	{
		 if(driver != null) {
	            driver.quit();  // Close the browser after all tests are executed
	        }
	}
	
	
}
