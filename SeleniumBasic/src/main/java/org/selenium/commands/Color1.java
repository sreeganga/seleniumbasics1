package org.selenium.commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Color1 {
	public static void verifyColor()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement colorVerify=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(colorVerify);
		//select.selectByVisibleText("Red");
		//select.selectByIndex(1);
		select.selectByValue("Green");
		WebElement getColor=select.getFirstSelectedOption();
		System.out.println(getColor.getText());
		List<WebElement>getEelment=select.getOptions();
		for(int i=0; i<getEelment.size();i++)
		{
			System.out.println(getEelment.get(i).getText());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		verifyColor();
	}

}
