package Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWrappers extends BaseTest {

	public SeleniumWrappers(WebDriver driver) {
		this.driver = driver;

	}
	public void click(By locator) {
		simpleReturnWebElement(locator).click();
	}
	

	public WebElement returnWebElement(By locator) {
		waitForElementToBeVisible(locator);// se declanseaza doar daca are nevoie
		return driver.findElement(locator);}
	
	public WebElement simpleReturnWebElement(By locator) {
		
		return driver.findElement(locator);
	}

	public void waitForElementToBeVisible(By locator) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void confirmJsAlert() throws InterruptedException {

		
		driver.switchTo().alert().accept();

	}
	
	public void scrollPge(int x) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0," +x+ ")");

}
	public boolean isDispayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
}
