package Homework14;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class BeforeAfterAction extends BaseTest{
	
	@Test(priority = 1)
	public void loginBeforeClick() {
		
		WebElement login = driver.findElement(By.linkText("Login"));
		WebElement insertEmail = driver.findElement(By.id("log"));
		WebElement insertPass = driver.findElement(By.cssSelector("input[name='pwd'"));
		
		assertTrue(!insertEmail.isDisplayed());
		assertTrue(!insertPass.isDisplayed());
	
		login.click();
		assertTrue(insertEmail.isDisplayed());
		assertTrue(insertPass.isDisplayed());
			
		
	}
}
