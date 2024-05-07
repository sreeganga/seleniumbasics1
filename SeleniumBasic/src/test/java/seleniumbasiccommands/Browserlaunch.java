package seleniumbasiccommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Browserlaunch {
	WebDriver driver;
	public  void intialiseBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(browser.equals("edge"))
		{
			driver =new EdgeDriver();
			
		}
		else if(browser.equals("Firefox"))
		{
			driver =new FirefoxDriver();
			
		}
		else {
			throw new RuntimeException("invalid browser received");
		}
		driver.manage().window().maximize();;
		
		
	}
@BeforeMethod//first
	public void setup()
	{
		intialiseBrowser("chrome");
	}
@AfterMethod
   public void closeBrowser()
   {
	driver.quit();
   }
}
