package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class ScrollExample extends BaseTest{
	
	//@Test(priority=1)
	public void scrollByPixel() {
		
		
		//JS scroll
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)");
		//Action class scroll
		Actions action = new Actions(driver);
		//action.scrollByAmount(0, 2000).perform();
	}
		@Test(priority=2)
		public void scrollToElement() throws InterruptedException {
			
			//js scroll
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView()", app.returnWebElement(app.menu.signUpButton));
			
			// jse il pozitiona sus s il duce sub meniu - iar java il duce in jos
			//Action class scroll
			Actions action = new Actions(driver);
			//action.scrollToElement(app.returnWebElement(app.menu.signUpButton)).perform();
			Thread.sleep(4000);
		}
		
		@Test
		public void scrollTopOrDown() throws InterruptedException {
			
			//js scroll
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(3000);
			jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
			
			// action class scroll
			
			Actions action = new Actions(driver);
			action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
			Thread.sleep(3000);
			action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
			
		}
		
	}


