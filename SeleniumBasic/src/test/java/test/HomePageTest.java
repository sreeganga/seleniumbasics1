package test;

import java.io.IOException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Automationcore.Base;
import utilites.ExelUtilites;

public class HomePageTest extends Base 
{

@Test
public void verifyhomepgetitle() throws IOException
  {
	driver.get("https://demowebshop.tricentis.com");
	String actualresult=driver.getTitle();
	System.out.println(actualresult);
	String exceptedtitle=ExelUtilites.readStringData(0, 0,"Sheet1");
	Assert.assertEquals(actualresult, exceptedtitle,"invalid title");
  }
@Test
public void verifyCommunityPoolSelection()
{
	driver.get("https://demowebshop.tricentis.com");
	List<WebElement>poolselection_button= driver.findElements(By.xpath("//li[@class='answer']//input[@name='pollanswers-1']//following-sibling::label"));
	for(int i=0; i<poolselection_button.size();i++)
	{
		String pollElementText=poolselection_button.get(i).getText();
		if(pollElementText.equals("good"));
		poolselection_button.get(i).click();
		
	}
	WebElement button=driver.findElement(By.xpath("//label[@for='pollanswers-2']"));
	String actaultitle=button.getText();
	String exceptedtitle=("Good");
	Assert.assertEquals(actaultitle, exceptedtitle,"invalid title");
	
	
}
}
