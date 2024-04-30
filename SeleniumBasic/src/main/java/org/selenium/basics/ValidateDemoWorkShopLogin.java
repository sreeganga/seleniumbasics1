package org.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ValidateDemoWorkShopLogin {
	WebDriver driver;

	public void commands()
	{
		driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginField=driver.findElement(By.className("ico-login"));
		loginField.click();
		
		driver.manage().window().maximize();
		WebElement emailField=driver.findElement(By.id("Email"));
	    emailField.sendKeys("sreeponnu1996@gmail.com");
	    WebElement passwordField=driver.findElement(By.id("Password"));
		passwordField.sendKeys("sree123@");
		WebElement loginButton=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		loginButton.click();
        driver.close();
		
	}
public void validateTotalNumberofTagIntheApllication()
{
	driver=new EdgeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	List<WebElement>divtag=driver.findElements(By.tagName("div"));
      int divtags=divtag.size();
      System.out.println(divtags);
      
	
	
}
public void cssLocator()
{
	driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement loginField=driver.findElement(By.className("ico-login"));
	loginField.click();
	driver.manage().window().maximize();
	WebElement emailField=driver.findElement(By.cssSelector("#Email"));
    emailField.sendKeys("sreeponnu1996@gmail.com");
    WebElement passwordField=driver.findElement(By.cssSelector("#Password"));
	passwordField.sendKeys("sree123@");
	WebElement loginButton=driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input"));
	loginButton.click();
    driver.close();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidateDemoWorkShopLogin obj=new ValidateDemoWorkShopLogin();
		obj.validateTotalNumberofTagIntheApllication();
	}

}
