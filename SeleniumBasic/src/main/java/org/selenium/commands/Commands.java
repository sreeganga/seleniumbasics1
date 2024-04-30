package org.selenium.commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Commands {
	
	public static void verifyCommunityPool()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		List<WebElement>communitypoolelements=driver.findElements(By.xpath("//li[@class='answer']//input[@name='pollanswers-1']//following-sibling::label"));
		for(int i=0; i<communitypoolelements.size();i++)
		{
			//System.out.println(communitypoolelements.get(i).getText());
			String pollElementText=communitypoolelements.get(i).getText();
			if(pollElementText.equals("good"));
			communitypoolelements.get(i).click();
			
		}
	}
public static  void  verifyValuesFromDropdown()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	WebElement countrydropdown=driver.findElement(By.xpath("//select[@name='country']"));
	Select select=new Select(countrydropdown); 
	//select.selectByVisibleText("INDIA");
	//select.selectByIndex(7);
	select.selectByValue("ANGOLA");
	WebElement getCountryName=select.getFirstSelectedOption();
	System.out.println(getCountryName.getText());
	List<WebElement>getEelment=select.getOptions();
	for(int i=0; i<getEelment.size();i++)
	{
		System.out.println(getEelment.get(i).getText());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//verifyCommunityPool();
		verifyValuesFromDropdown();
	}

}
