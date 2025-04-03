package utils.com;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    // Method to capture screenshot
    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        // Take screenshot as File
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Set the path to save the screenshot in the 'screenshots' folder
        String screenshotFolder = "screenshots/";

        // Create the folder if it doesn't exist
        File folder = new File(screenshotFolder);
        if (!folder.exists()) {
            folder.mkdir();  // Create the folder if it doesn't exist
        }

        // Generate a timestamped filename for the screenshot
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File destination = new File(screenshotFolder + screenshotName + "_" + timestamp + ".png");

        try {
            // Save the screenshot to the destination file
            FileUtils.copyFile(screenshot, destination);
            System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error while taking screenshot: " + e.getMessage());
        }
    }
}
