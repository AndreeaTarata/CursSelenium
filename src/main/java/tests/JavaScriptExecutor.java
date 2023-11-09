package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class JavaScriptExecutor extends BaseTest{
	
	@Test
	public void example1() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement searchIcon = app.simpleReturnWebElement(app.menu.searchIcon);
		WebElement searchInput = app.simpleReturnWebElement(app.menu.searchInput);
		
		//alternativa pt click
		jse.executeScript("arguments[0].click()", searchIcon);
		Thread.sleep(4000);
		
		//alternativa pt SendKeys();
		jse.executeScript("arguments[0].value='cooking'", searchInput);
		jse.executeScript("arguments[0].click()", searchInput);
		
	}

}
