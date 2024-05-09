package seleniumbasiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

//mouse actions
@Test
public void verifyrightclick()

{
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	 driver.manage().window().maximize();
	 WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions action=new Actions(driver);
	 action.contextClick(rightclick).build().perform();
	 
}
@Test
public void doubleclick()
{
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	 driver.manage().window().maximize();
	 WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	 Actions action=new Actions(driver);
	 action.doubleClick(doubleclick).build().perform();
	 }
@Test
public void verifydraganddrop()
{
	driver.get("https://demoqa.com/droppable");
	 driver.manage().window().maximize();
	 WebElement dragelement = driver.findElement(By.xpath("//div[@id='draggable']"));
	 WebElement dropelement = driver.findElement(By.xpath("//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle'and@id='draggable']"));
	 Actions action=new Actions(driver);
	 action.dragAndDrop(dragelement, dropelement).build().perform();
	 
	
}
@Test
public void verifydarganddropoffset()
{
	driver.get("https://demoqa.com/dragabble");
	 driver.manage().window().maximize();
	 WebElement dragelement = driver.findElement(By.xpath("//div[@id='dragBox']"));
	 Actions action=new Actions(driver);
	 action.dragAndDropBy(dragelement, 50, 50).build().perform();//drag tharum drop kanilla apppo use chyanulath
	 
}
@Test
public void verifymouseover()
{
	driver.get("https://demoqa.com/menu/");
	 driver.manage().window().maximize();
	 WebElement mainelement = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
	 Actions action=new Actions(driver);
	 action.moveToElement(mainelement).build().perform();
	 WebElement subelement = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
	 action.moveToElement(subelement).build().perform();
	 
	 
}
}
