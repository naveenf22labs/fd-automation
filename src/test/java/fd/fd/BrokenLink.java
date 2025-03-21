package fd.fd;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args)
	{
	
		WebDriver driver=new ChromeDriver();
	      driver.manage().deleteAllCookies();
	     // driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     try {
	          
	            driver.get("https://www.frankdarling.com"); 

	            // Find all anchor tags on the page
	            List<WebElement> links = driver.findElements(By.tagName("a"));

	            // Loop through each link and check if it is broken
	            System.out.println("Checking for broken links on the homepage...");
	            for (WebElement link : links) {
	                @SuppressWarnings("deprecation")
					String url = link.getAttribute("href");
	                if (url != null && !url.isEmpty()) {
	                    checkLinkStatus(url);
	                }
	            }
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	}
	
	// Method to check the link status by sending an HTTP request
    public static void checkLinkStatus(String url) {
        try {
            // Create a URL object from the link
            URL link = new URL(url);

            // Open an HTTP connection to the link
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setRequestMethod("HEAD"); // Use HEAD method to get only the status code

            // Connect to the URL
            httpURLConnection.connect();

            // Get the HTTP response code
            int responseCode = httpURLConnection.getResponseCode();

            // Check if the link is broken (anything other than 200 OK is considered broken)
            if (responseCode != 200) {
                System.out.println("Broken link: " + url + " | Response Code: " + responseCode);
            }
        } catch (IOException e) {
            // If the link cannot be reached, it's considered broken
            System.out.println("Broken link: " + url + " | Error: " + e.getMessage());
        }
    }
	
}
