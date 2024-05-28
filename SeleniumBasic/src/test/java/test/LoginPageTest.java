package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import Automationcore.Base;
import dataprovider.DataProviders;
import utilites.ExelUtilites;

public class LoginPageTest extends Base {
	@Test
 public void verifyLoginpagetitle() throws IOException
 {
		driver.get("https://demowebshop.tricentis.com/login");
		String actualresult=driver.getTitle();
		System.out.println(actualresult);
		String exceptedtitle=ExelUtilites.readStringData(0, 0,"Sheet2");
		Assert.assertEquals(actualresult, exceptedtitle,"invalid title"); 
 }
 @Test
 public void verifyUserLogin()
 {
	 driver.get("https://demowebshop.tricentis.com/login");
	 WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
	 email.sendKeys("sreeponnu1996@gmail.com");
	 WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
	 password.sendKeys("sree123@");
	 WebElement login= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	 login.click();
	 WebElement loginverify= driver.findElement(By.xpath("//a[@class='account'and text()='sreeponnu1996@gmail.com']"));
	 String actualresult=loginverify.getText();
	 String excptedresult="sreeponnu1996@gmail.com";
	 Assert.assertEquals(actualresult, excptedresult,"invalid");
	 
	 
 }
 @Test(dataProvider="invaliduserCredentials",dataProviderClass=DataProviders.class)
 
 public void verifyLogininvalidUser(String username,String password) throws IOException 
 {
	 driver.get("https://demowebshop.tricentis.com/login");
		WebElement emailid_field = driver.findElement(By.id("Email"));
		emailid_field.sendKeys(username);
		WebElement password_field = driver.findElement(By.id("Password"));
		password_field.sendKeys(password);
		WebElement login_button = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		login_button.click();
		WebElement textloginmessage = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
		String textloginmessage_actual = textloginmessage.getText();
		String textloginmssage_expected = ExelUtilites.readStringData(1, 0,"Sheet2");
		Assert.assertEquals(textloginmessage_actual, textloginmssage_expected, "Login failed warning message not found");
}
}