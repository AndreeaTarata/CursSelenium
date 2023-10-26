package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class JsAlertExample extends BaseTest{

	@Test(priority=1)
	public void simpleJsAlert() throws InterruptedException {
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
	}
	@Test(priority=2)
	public void confirmJsAlert() throws InterruptedException {
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		
	}
	@Test(priority=3)
	public void promptJsAlert() throws InterruptedException {
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("akjsKSJH");
		driver.switchTo().alert().accept();
		
		/* Alert alertaJS = driver.switchTo().alert();
		alertaJS.sendKeys("sssas");
		alertaJS.accept();*/
		
	}
	
}
//Tratarea alertei JS

