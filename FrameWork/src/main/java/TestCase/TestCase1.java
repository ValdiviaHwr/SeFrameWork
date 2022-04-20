package TestCase;


import Utilities.Action;
import Utilities.Browser;
import Utilities.DriverHandler;
import Utilities.ExecuteAction;
import Utilities.LocatorType;
import Utilities.Locators;
import Utilities.Report;
import Utilities.print;
import freemarker.ext.jsp._FreeMarkerPageContext1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;





public class TestCase1 {
	
	public TestCase1(){
		
	}
	public static void Execute(Browser browser,String website, String searchword) throws InterruptedException 
	{

		//ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
		//ExtentReports extent = new ExtentReports();
		//extent.attachReporter(htmlReporter);
		
		
			ExtentReports extent = Report.createReport("TestCase1");
			ExtentTest test1 = extent.createTest("Report of TestCase1", "First extent Report");
			ExtentTest test2 = extent.createTest("Report of TestCase1", "First extent Report");
			test1.log(Status.INFO, "Starting TestCase1");
			//al final debe ir un extent.flush();
			
			
			print.TestCaseStart();
			DriverHandler.Start(browser);
			test1.pass("Open Browser");
			
			
			ExecuteAction.Action(Action.navigate, null, website,test1);
		
		
			Locators Woman = new Locators(LocatorType.xpath , "//a[text()='Women']");
			ExecuteAction.Action(Action.click, Woman.element, "",test1);
			
			
			//DriverHandler.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			Locators Dress = new Locators(LocatorType.xpath ,"//*[@id=\"categories_block_left\"]/div/ul/li[2]/a");
			ExecuteAction.Action(Action.click, Dress.element, "",test1);
			
			Locators EDress = new Locators(LocatorType.xpath , "//*[@id=\"categories_block_left\"]/div/ul/li[2]/a");
			ExecuteAction.Action(Action.click, EDress.element, "",test1);
			
			Locators More = new Locators(LocatorType.xpath , "//span[text()='More']"); 
			ExecuteAction.Action(Action.click, More.element, "",test1);
			
			
			Locators Price= new Locators(LocatorType.xpath,"//*[@id=\"our_price_display\"]");
			String cost = Price.element.getText();
			System.out.println("El precios es= "+ cost);	        
			//cost = cost.replaceAll("[^-?0-9]+", " ");
			cost= cost.replace("$", "");
			float cost2= Float.parseFloat(cost);
	        System.out.println("El precios es= "+ cost2);
	        
	        if(cost2<60.00) {
	        	Locators AdCart = new Locators(LocatorType.xpath , "//span[text()='Add to cart']");
				ExecuteAction.Action(Action.click, AdCart.element, "",test1);
				
		
				Locators COut = new Locators(LocatorType.xpath , "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span/i");
				ExecuteAction.Action(Action.click, COut.element, "",test2);
				
				
	          } else {
	        	  ExecuteAction.Action(Action.quit, null, "",test1);
	        	  System.out.println("The cost is over 60.00");
	          }
			
		
			
			Thread.sleep(10);
			//DriverHandler.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			ExecuteAction.Action(Action.quit, null, "",test1);
			
			print.TestCaseEnd();
			
			
			
			
			
			
			test1.pass("Open Browser1");
			test1.pass("Open Browser2");
			test1.pass("Open Browser3");
			test1.pass("Open Browser4");
			test1.fail("Open Browser5");
			test1.fail("Open Browser6");
			test1.info("End TestCase1");
			extent.flush();
			


	}
	}