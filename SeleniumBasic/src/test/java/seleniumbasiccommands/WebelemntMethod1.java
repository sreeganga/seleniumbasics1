package seleniumbasiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebelemntMethod1 extends Browserlaunch {
@Test
	public void validataeisSelected()
	{
   driver.get("https://demowebshop.tricentis.com/register");
   boolean ismaleselected;
	driver.manage().window().maximize();
	WebElement malebutton=driver.findElement(By.xpath("//input[@id='gender-male']"));
	ismaleselected=malebutton.isSelected();
	Assert.assertFalse(ismaleselected,"radio button selected");
	System.out.println("Male element before selected"+""+ismaleselected);
	malebutton.click();
	ismaleselected=malebutton.isSelected();
	Assert.assertTrue(ismaleselected, "radio button not selected");
	System.out.println("Male element after selected"+""+ismaleselected);
	
	}
@Test
public void validateEnable()
{
	boolean isenable;
	 driver.get("https://demowebshop.tricentis.com/register");
	 driver.manage().window().maximize();
		WebElement subscribebutton=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
		isenable=subscribebutton.isEnabled();
		Assert.assertTrue(isenable, "button not enable");
		System.out.println("subscribe butto is enable"+""+isenable);
		
	   
}
@Test
public void validateButtonIsDisplayed() {
	boolean isvotebuttondisplayed;
	driver.get("https://demowebshop.tricentis.com/");
	WebElement votebutton = driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
	isvotebuttondisplayed = votebutton.isDisplayed();
	Assert.assertTrue(isvotebuttondisplayed, "Vote button is not displayed");
	System.out.println("Vote button is displayed"+" "+isvotebuttondisplayed);
	
}
}
