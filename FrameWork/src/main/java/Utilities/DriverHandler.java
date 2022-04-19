package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverHandler {
	public static WebDriver driver;
	
	public static void  Start(Browser browserName) 
	{
		
		switch (browserName)
		{
		case Chrome:
			try {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\71993\\Desktop\\SeleniumProjects\\WebDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("===========> Chrome Succesfully Initiaded <============");
			} catch (Exception e) {
				driver = null;
				System.out.println("===========> Chrome Usuccesfully Initiaded <============" + e.getMessage());
			}
			break;
		case InternetExplorer:
			try {
				System.setProperty("webdriver.ie.driver", "C:\\\\Users\\\\71993\\\\Desktop\\\\SeleniumProjects\\\\WebDrivers\\\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				System.out.println("===========> IE Succesfully Initiaded <============");
			} catch (Exception e) {
				driver = null;
				System.out.println("===========> IE Usuccesfully Initiaded <============" + e.getMessage());
			}
        	break;
		case FireFox:
			try {
				System.setProperty("webdriver.ff.driver", "C:\\\\Users\\\\71993\\\\Desktop\\\\SeleniumProjects\\\\WebDrivers\\\\geckoserver.exe");
				driver = new FirefoxDriver();
				System.out.println("===========> FF Succesfully Initiaded <============");
			} catch (Exception e) {
				driver = null;
				System.out.println("===========> FF Usuccesfully Initiaded <============" + e.getMessage());
			}
        	break;
        default:
        	try {
				System.setProperty("webdriver.chrome.driver", "C:\\Temp\\JavaCABuild\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("===========> Chrome Succesfully Initiaded <============");
			} catch (Exception e) {
				driver = null;
				System.out.println("===========> Chrome Usuccesfully Initiaded <============" + e.getMessage());
			}
			break;
			
		}

	}
	public  DriverHandler() 
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Temp\\JavaCABuild\\Drivers\\chromedriver.exe");
        	driver = new ChromeDriver();
	}
}
