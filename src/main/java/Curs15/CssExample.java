package Curs15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class CssExample extends BaseTest{
	
	@Test
	public void cssExample() {
		WebElement loginLink = driver.findElement(By.cssSelector("a[href='#popup_login']"));
		loginLink.click();
		
		//Logical AND
		WebElement usernameFiled = driver.findElement(By.cssSelector("input[id=\"log\"][name='log']"));
	usernameFiled.sendKeys("TestUser");
	
	//logical OR
	WebElement psdFiled = driver.findElement(By.cssSelector("input[type='password'],[name='pwd']"));
	psdFiled.sendKeys("TestUser");
	
	
	// direct child div>input[type='submit']
	WebElement submitButton = driver.findElement(By.cssSelector("div>input[type='submit']"));
	submitButton.click();
	}
	
	@Test
	public void cssExample2() {
		
		// * --> se identifica cu contains
		WebElement book1 = driver.findElement(By.cssSelector("a[href*='deep']"));
		System.out.println(book1.getText());
		// ^ --> starts with
		
		WebElement book2 = driver.findElement(By.cssSelector("a[href^='life']"));
		System.out.println(book2.getText());
		
		// $ --> ends with
		WebElement book3 = driver.findElement(By.cssSelector("a[href$='story']"));
		System.out.println(book3.getText());
		
		
		
	}

}
