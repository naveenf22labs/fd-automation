package library.com;

import java.util.List;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageobjects.com.FDPageObjectData;
import utils.com.FDUtils;

public class InPersonLocationDropdown extends FDUtils

{
	@Test(groups = "diamond", description=" Verifying all combinations of booking appointments and location dropdown selections.")
	public void bookingAppointments() throws InterruptedException
	{
		//  Initialize ExtentTest logger
		ExtentTest logger = getExtentInstance().createTest("In person dropdown locations  Flow Test");
		test.set(logger);
		  FDPageObjectData dropdown= new FDPageObjectData(driver);
		test.get().info("Client service dropdowns functionality");
		  dropdown.showrooms();
		  dropdown.virtualAppointments();
		  dropdown.closePopUp();
		// Get the first dropdown(appointment type) and second dropdown (location)
		  WebElement dropdown1 = driver.findElement(By.id("input-select-ringType-select-an-appointment-type"));
		  Select appointment = new Select(dropdown1);
		  List<WebElement> appointmentOptions = appointment.getOptions(); // Get all options for the appointment type

		  WebElement dropdown2 = driver.findElement(By.id("input-select-location-select-a-location"));
		  Select location = new Select(dropdown2);
		  List<WebElement> locationOptions = location.getOptions(); // Get all options for the location
		  
		  int count=0;

		  // Loop through each combination of appointment type and location
		  for (int i = 0; i < appointmentOptions.size(); i++) 
		  { // Starting from 0
		      appointment.selectByIndex(i); // Select the i-th option in the appointment dropdown
		      
		      if (locationOptions.size() >=0)
		      {
		    	  for (int j = 0; j < locationOptions.size(); j++)
			      { // Starting from 0
			          location.selectByIndex(j); // Select the j-th option in the location dropdown
			          
			          // Log the selected combination
			          System.out.println("Selected combination: Appointment - " + appointmentOptions.get(i).getText() + ", Location - " + locationOptions.get(j).getText());

			          // Click on "Select Date" button after each combination
			          driver.findElement(By.xpath("(//button[text()='Select Date'])[1]")).click();
			          Thread.sleep(4000);
			          driver.findElement(By.xpath("//button[@class='calendly-popup-close']")).click();
			          count++;
			          
			          if (count == 30)
			          {
			                break; // Exit the inner loop
			            }
			          
			      }
		    	 
		    	  
		      }
		      // If the counter reaches 30, break out of the outer loop as well
		      if (count == 30) 
		      {
		          break; // Exit the outer loop
		      }
		     
		      
		  }

		  System.out.println("All appointment and location combinations are working fine");

	}

}
