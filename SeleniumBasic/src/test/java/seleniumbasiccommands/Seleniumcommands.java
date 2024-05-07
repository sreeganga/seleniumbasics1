package seleniumbasiccommands;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Seleniumcommands extends Browserlaunch {
@Test//second
     public void Verifymultipleddropdown()
     {
	driver.get("https://selenium.qabible.in/select-input.php");
	WebElement multipleelements = driver.findElement(By.xpath("//select[@class='form-control'and@id='multi-select-field']"));
	Select select =new Select(multipleelements);
	select.selectByVisibleText("Red");
	select.selectByVisibleText("Yellow");
	Boolean selectedvalue=select.isMultiple();
	System.out.println(selectedvalue);
	List<WebElement>selectedvalues =select.getAllSelectedOptions();
	for(WebElement e:selectedvalues)
	{
		System.out.println(e.getText());
		
	}
	select.deselectByValue("Red");
	
     }
@Test
public void commands()
{
	
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
	WebElement auctualemailfield= driver.findElement(By.xpath("//a[@class='account'and text()='sreeponnu1996@gmail.com']"));
	String actualresult=auctualemailfield.getText();
	String expectedresult ="sreeponnu1996@gmail.com";
	Assert.assertEquals(actualresult,expectedresult,"Login not sucess");
	

}
@Test
public void RegisterPage()
{
	
	driver.get("https://demowebshop.tricentis.com/register");
	
	driver.manage().window().maximize();
	WebElement firstName=driver.findElement(By.xpath("//input[@id='FirstName']"));
	firstName.sendKeys("SREELAKSHMI");
	WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
	lastname.sendKeys("N G");
	WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
	email.sendKeys("sreeponnu1996@gmail.com");
	WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
	password.sendKeys("sree123@");
	WebElement cpassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
	cpassword.sendKeys("sree123@");
	WebElement register=driver.findElement(By.xpath("//input[@id='register-button']"));
	register.click();
	WebElement auctualemailfield= driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
	String actualresult=auctualemailfield.getText();
	String expectedresult ="The specified email already exists";
	Assert.assertEquals(actualresult,expectedresult,"The specified email already exists");
}
@Test
public void guru()
{
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	WebElement firstName=driver.findElement(By.xpath("//input[@name='firstName']"));
	firstName.sendKeys("SREELAKSHMI");
	WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
	lastname.sendKeys("N G");
	WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
	phone.sendKeys("9496864232");
	WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	email.sendKeys("sreeponnu1996@gmail.com");
	WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
	address.sendKeys("sreenilayam");
	WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
	city.sendKeys("Chirayinkeezhu");
	WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
	state.sendKeys("Kerala");
	WebElement postal=driver.findElement(By.xpath("//input[@name='postalCode']"));
	postal.sendKeys("695102");
	
	WebElement CountryDropdown=driver.findElement(By.xpath("//select[@name='country']"));
	Select select= new Select(CountryDropdown);
	select.selectByVisibleText("INDIA");
	WebElement userName=driver.findElement(By.xpath("//input[@name='email']"));
	userName.sendKeys("sreeponnu1996@gmail.com");
	WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("sree123@");
	WebElement cpassword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
	cpassword.sendKeys("sree@123");
	WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
	submit.click();
	
} 


}
