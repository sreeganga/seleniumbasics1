package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Automationcore.Base;

public class RegistractionPage extends Base {

	@Test
	public void verifyregisterpagetitle()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		String actualresult=driver.getTitle();
		System.out.println(actualresult);
		String exceptedtitle=("Demo Web Shop. Register");
		Assert.assertEquals(actualresult, exceptedtitle,"invalid title");
	  }
	@Test
	public void verifyuserRegistraction()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		boolean ismaleselected;
		WebElement malebutton=driver.findElement(By.xpath("//input[@id='gender-male']"));
		malebutton.click();
		ismaleselected=malebutton.isSelected();
		WebElement firstName=driver.findElement(By.xpath("//input[@id='FirstName']"));
		firstName.sendKeys("manu");
		WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
		lastname.sendKeys("N G");
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("manu@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("manu123@");
		WebElement cpassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		cpassword.sendKeys("manu123@");
		WebElement register=driver.findElement(By.xpath("//input[@id='register-button']"));
		register.click();
	}
}
