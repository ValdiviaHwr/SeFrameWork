package TestCase;


import Utilities.Action;
import Utilities.Browser;
import Utilities.DriverHandler;
import Utilities.ExecuteAction;
import Utilities.LocatorType;
import Utilities.Locators;
import Utilities.print;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;




public class TestCase1 {
	
	public TestCase1(){
		
	}
	public static void Execute(Browser browser,String website, String searchword) throws InterruptedException 
	{
		
		
			print.TestCaseStart();
			DriverHandler.Start(browser);
			
			
			ExecuteAction.Action(Action.navigate, null, website);
		
		
			Locators Woman = new Locators(LocatorType.xpath , "//a[text()='Women']");
			ExecuteAction.Action(Action.click, Woman.element, "");
			
			
			DriverHandler.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			Locators Dress = new Locators(LocatorType.xpath ,"//*[@id=\"categories_block_left\"]/div/ul/li[2]/a");
			ExecuteAction.Action(Action.click, Dress.element, "");
			
			Locators EDress = new Locators(LocatorType.xpath , "//*[@id=\"categories_block_left\"]/div/ul/li[2]/a");
			ExecuteAction.Action(Action.click, EDress.element, "");
			
			Locators More = new Locators(LocatorType.xpath , "//span[text()='More']");
			ExecuteAction.Action(Action.click, More.element, "");
			
			
			Locators Price= new Locators(LocatorType.xpath,"//*[@id=\"our_price_display\"]");
			String cost = Price.element.getText();
			System.out.println("El precios es= "+ cost);	        
			//cost = cost.replaceAll("[^-?0-9]+", " ");
			cost= cost.replace("$", "");
			float cost2= Float.parseFloat(cost);
	        System.out.println("El precios es= "+ cost2);
	        
	        if(cost2<60.00) {
	        	Locators AdCart = new Locators(LocatorType.xpath , "//span[text()='Add to cart']");
				ExecuteAction.Action(Action.click, AdCart.element, "");
				
				Locators COut = new Locators(LocatorType.xpath , "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
				ExecuteAction.Action(Action.click, COut.element, "");
				
				
				Locators order = new Locators(LocatorType.xpath , "//*[@id=\"center_column\"]/p[2]/a[1]/span");
				ExecuteAction.Action(Action.click, order.element, "");
				
				
				Locators email = new Locators(LocatorType.xpath , "//*[@id=\"email_create\"]");
				ExecuteAction.Action(Action.type , email.element, "robertov02@gmail.com");
				
				Locators submit = new Locators(LocatorType.xpath , "//*[@id=\"SubmitCreate\"]/span");
				ExecuteAction.Action(Action.click, submit.element, "");
				
				Locators gender = new Locators(LocatorType.xpath , "//*[@id=\"id_gender1\"]");
				ExecuteAction.Action(Action.click, gender.element, "");
				
				Locators fname = new Locators(LocatorType.xpath , "//*[@id=\"customer_firstname\"]");
				ExecuteAction.Action(Action.type , fname.element, "Roberto");
				
				Locators lname = new Locators(LocatorType.xpath , "//*[@id=\"customer_lastname\"]");
				ExecuteAction.Action(Action.type , lname.element, "Valdivia");
				
				Locators pwd = new Locators(LocatorType.xpath , "//*[@id=\"passwd\"]");
				ExecuteAction.Action(Action.type , pwd.element, "Valdivia");
				
				Locators dayb = new Locators(LocatorType.xpath , "//*[@id=\"days\"]/option[6]");
				ExecuteAction.Action(Action.click, dayb.element, "");
				
				
				Locators monthb = new Locators(LocatorType.xpath , "//*[@id=\"months\"]/option[3]");
				ExecuteAction.Action(Action.click, monthb.element, "");
				
				Locators yearb = new Locators(LocatorType.xpath , "//*[@id=\"years\"]/option[26]");
				ExecuteAction.Action(Action.click, yearb.element, "");
				
				Locators fname2 = new Locators(LocatorType.xpath , "//*[@id=\"firstname\"]");
				ExecuteAction.Action(Action.type , fname2.element, "Valdivia");
				
				Locators lname2 = new Locators(LocatorType.xpath , "//*[@id=\"customer_lastname\"]");
				ExecuteAction.Action(Action.type , lname2.element, "Valdivia");
				
				
				Locators comp = new Locators(LocatorType.xpath , "//*[@id=\"company\"]");
				ExecuteAction.Action(Action.type , comp.element, "Hexaware");
				
				Locators adress = new Locators(LocatorType.xpath , "//*[@id=\"address1\"]");
				ExecuteAction.Action(Action.type , adress.element, "Mar Carpio, 210, col. infonavit Guanajuato");
				
				Locators city = new Locators(LocatorType.xpath , "//*[@id=\"city\"]");
				ExecuteAction.Action(Action.type , city.element, "Leon");
				
				
				Locators state = new Locators(LocatorType.xpath , "//*[@id=\"id_state\"]/option[6]");
				ExecuteAction.Action(Action.click, state.element, "");
				
				
				Locators cp = new Locators(LocatorType.xpath , "//*[@id=\"postcode\"]");
				ExecuteAction.Action(Action.type , cp.element, "37309");
				
				
				Locators comm = new Locators(LocatorType.xpath , "//*[@id=\"other\"]");
				ExecuteAction.Action(Action.type , comm.element, "Hi!");
				
				Locators cell = new Locators(LocatorType.xpath , "//*[@id=\"phone_mobile\"]");
				ExecuteAction.Action(Action.type , cell.element, "5555555555");
				
				Locators cell2 = new Locators(LocatorType.xpath , "//*[@id=\"authentication\"]");
				ExecuteAction.Action(Action.type , cell2.element, "5555555555");
				
				
				Locators alias = new Locators(LocatorType.xpath , "//*[@id=\"alias\"]");
				ExecuteAction.Action(Action.type , alias.element, "Home");
				
				Locators reg = new Locators(LocatorType.xpath , "//*[@id=\"submitAccount\"]/span");
				ExecuteAction.Action(Action.click, reg.element, "");
				
	          } else {
	        	  ExecuteAction.Action(Action.quit, null, "");
	        	  System.out.println("The cost is over 60.00");
	          }
			
		
			
			Thread.sleep(1000000);
			DriverHandler.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			ExecuteAction.Action(Action.quit, null, "");
			
			print.TestCaseEnd();
			
			


	}
	}