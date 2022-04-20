package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;



public class ExecuteAction {
	
	public ExecuteAction() 
	{
		
	}
	public static void Action(Action action, WebElement element, String value, ExtentTest test) 
	{
		WebDriver driver = DriverHandler.driver;
		if(driver != null) {
		switch(action) 
		{
		case click:
			try {
				element.click();
				System.out.println("=============>Succesfully clicked<=============");
				test.pass("Succesfully clicked");
			} catch (Exception e) {
				System.out.println("=============>Failed: "+ e.getMessage()+"<=============");
				test.fail("=============>Failed: "+ e.getMessage()+"<=============");
			}	
			break;
		case type:
			try {
				element.sendKeys(value);
				System.out.println("=============>Succesfully Typed: "+ value+"<=============");
				test.pass("Succesfully Typed:"+ value);
			} catch (Exception e) {
				System.out.println("=============>Failed: "+ e.getMessage()+"<=============");
				test.fail("=============>Failed: "+ e.getMessage()+"<=============");
			}
			break;
		case navigate:
			try {
				driver.navigate().to(value);
				System.out.println("=============>Succesfully Navigated to: "+ value+"<=============");
				test.pass("Succesfully Navigated to: "+ value);
			} catch (Exception e) {
				System.out.println("=============>Failed: "+ e.getMessage()+"<=============");
				test.fail("=============>Failed: "+ e.getMessage()+"<=============");
			}
			break;
		case implicitWait:
			try {
				driver.manage().timeouts().implicitlyWait(Long.parseLong(value), TimeUnit.SECONDS);		
				System.out.println("=============>Succesfully Waited for: "+ value+" seconds<=============");
			} catch (NumberFormatException e) {
				System.out.println("=============>Failed: "+ e.getMessage()+"<=============");
				test.fail("=============>Failed: "+ e.getMessage()+"<=============");
			}			
			break;
		case quit:
			try {
				driver.quit();
				driver = null;
				System.out.println("=============>Succesfully Closed<=============");
			} catch (Exception e) {
				System.out.println("=============>Failed: "+ e.getMessage()+"<=============");
				test.fail("=============>Failed: "+ e.getMessage()+"<=============");
			}
			break;
		}
		}else 
		{
			System.out.println("=============>Driver was not succesfully initiaded, skipping step.<=============");
			test.fail("Driver was not succesfully initiaded, skipping step.");
		}
	}

}
