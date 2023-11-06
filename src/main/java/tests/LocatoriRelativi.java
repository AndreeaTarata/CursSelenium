package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class LocatoriRelativi extends BaseTest {
	
	/*
	 * toLeftOf
	 * toRightOf
	 * below
	 * above
	 * near
	 */
	
	@Test
	public void locatoriRelativi() {
		//to left of
		WebElement price = driver.findElement(RelativeLocator.with(By.xpath("//h5[contains(@class, 'sc_title')]")).
				toLeftOf(By.xpath("//a[@href= 'life-in-the-garden']")));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", price );
		
		
		// to right of
		WebElement price2 = driver.findElement(RelativeLocator.with
				(By.xpath("//h5[contains(@class, 'sc_title')]"))
				.toRightOf(By.xpath("//a[@href= 'life-in-the-garden']")));
		
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", price2 );

	}
	

}
