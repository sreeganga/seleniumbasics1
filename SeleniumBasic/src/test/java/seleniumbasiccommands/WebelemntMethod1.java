package seleniumbasiccommands;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebelemntMethod1 extends Browserlaunch {
private int j;
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
@Test
public void verifySimpleAlert()
{
	driver.get("https://demoqa.com/alerts");
	WebElement clickme = driver.findElement(By.xpath("//button[@id='alertButton']"));
	clickme.click();
	Alert alert= driver.switchTo().alert();
	alert.accept();;
}
@Test
public void validateconfirmation()
{
	driver.get("https://demoqa.com/alerts");
	WebElement confirm = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	confirm.click();
	Alert alert= driver.switchTo().alert();
	String text=alert.getText();
	System.out.println(text);
	alert.dismiss();
	WebElement clickcancel = driver.findElement(By.xpath("//span[@id='confirmResult']"));
	String actualresult=clickcancel.getText();
	String expectedresult="You selected Cancel";
	Assert.assertEquals(actualresult, expectedresult,"You selected ok");
	
	
	
}
@Test
public void validatePromptAlert() 
{
	 driver.get("https://demoqa.com/alerts");  
	 WebElement prompt_button = driver.findElement(By.xpath("//button[@id='promtButton']"));
	 prompt_button.click();
	 Alert alert = driver.switchTo().alert();
	 String alert_text = alert.getText();
	 System.out.println(alert_text);
	 alert.sendKeys("The name is test");
	 alert.accept();
	 WebElement textmessage_name = driver.findElement(By.xpath("//span[@id='promptResult']"));
	 String actualresult = textmessage_name.getText();
	 String expectedresult = "You entered The name is test";
	 Assert.assertEquals(actualresult, expectedresult,"You have not entered a text");
	 
}
@Test
public void verifymultiplewindowhandling()
{
    driver.get("https://demo.guru99.com/popup.php");
    String parentwindow_handleid = 	driver.getWindowHandle();
    System.out.println(parentwindow_handleid);
    WebElement click_button = driver.findElement(By.xpath("//a[@target='_blank'and text()='Click Here']"));
    click_button.click();
    Set<String> windowshandlesid = driver.getWindowHandles();
    System.out.println(windowshandlesid);
    Iterator <String> values = windowshandlesid.iterator();// 
    while(values.hasNext())// return type boolean
    {
 	String handleid = values.next();
 	if(!handleid.equals(parentwindow_handleid)) 
 	 {
 		driver.switchTo().window(handleid);
 		WebElement emailid = driver.findElement(By.xpath("//input[@name='emailid']"));
 		emailid.sendKeys("abc@gmail.com");
 		WebElement submit_button = driver.findElement(By.xpath("//input[@name='btnLogin']"));
 		submit_button.click();
 		driver.close();
 		
 	 }
   }
    driver.switchTo().window(parentwindow_handleid);
 }
@Test
public void verifyfileupload()
{
	driver.get("https://demo.guru99.com/test/upload/");
	WebElement file = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
	file.sendKeys("C:\\Users\\user\\git\\seleniumbasics1\\SeleniumBasic\\src\\main\\resources");//resourse file nte path
	WebElement checkbox = driver.findElement(By.xpath("//input[@id='terms']"));
	checkbox.click();
	WebElement submit_button = driver.findElement(By.xpath("//button[@id='submitbutton']"));
	submit_button.click();
	
}
@Test
public void verifyframes()
{
	driver.get("https://demoqa.com/frames");
	List<WebElement>iframe_tags=driver.findElements(By.tagName("iframe"));
	int size=iframe_tags.size();
	System.out.println("total no of frame"+""+size);
	//driver.switchTo().frame(3);
	//driver.switchTo().frame("frame1");
	WebElement frame= driver.findElement(By.id("frame1"));
	driver.switchTo().frame(frame);
	WebElement frame1_text = driver.findElement(By.id("sampleHeading"));
    String frame_text = frame1_text.getText();
    System.out.println(frame_text);
    driver.switchTo().defaultContent();// to home page from a frame
}
@Test
public void assignmentVerifyFrames() {

	 driver.get("https://www.hyrtutorials.com/p/frames-practice.html");	
     List <WebElement> iframe_tags = driver.findElements(By.tagName("iframe"));
     int numberoftags =  iframe_tags.size();
     System.out.println("The total number of frames in the Webpage  "+ numberoftags);
     WebElement text_field = driver.findElement(By.xpath("//input[@id='name']"));
     text_field.sendKeys("sree");
     driver.switchTo().frame("frm1");
     WebElement menu1 = driver.findElement(By.xpath("//select[@id='course']"));
     Select select = new Select(menu1);
     select.selectByVisibleText("Java");
     driver.switchTo().defaultContent();
     driver.switchTo().frame("frm2");
     WebElement frame1_text = driver.findElement(By.xpath("//select[@id='selectnav1']"));
     Select select1 = new Select(frame1_text);
     select1.selectByVisibleText("-- Selenium");
	  driver.switchTo().defaultContent();// to home page from a frame
}
@Test
public void dynamicwebtable()
{
	driver.get("https://money.rediff.com/indices");
	WebElement showmore = driver.findElement(By.xpath("//a[@id='showMoreLess']"));
	showmore.click();
	WebElement webtable = driver.findElement(By.xpath("//table[@id='dataTable']//tbody"));
	List<WebElement> rows = webtable.findElements(By.tagName("tr"));
	int rowsize = rows.size();
	for (int i = 0; i < rowsize; i++) {
		List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
		int columnsize = columns.size();
		for (int j = 0; j < columnsize; j++) {
			String celltext = columns.get(j).getText();
			if (celltext.equals("S&P BSE 200")) {
				System.out.println("Pre Close value is" + " " + columns.get(1).getText());
			}
		}
	}
	
}
}
