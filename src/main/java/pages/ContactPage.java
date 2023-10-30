package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumWrappers;

public class ContactPage extends SeleniumWrappers {

	// public WebDriver driver;

	public ContactPage(WebDriver driver) {

		super(driver);

	}

	// locatori sau webelemente
	public By contactLink = By.cssSelector("header a[href*='contacts']");
	public By nameField = By.cssSelector("input[class*='control'][name='your-name']");
	public By emailField = By.cssSelector("input[class*='control'][type='email']");
	public By subjectField = By.cssSelector("input[name='your-s']");
	public By messageField = By.cssSelector("textarea[name='your-message']");
	public By sendMessageButton = By.cssSelector("input[value='Send Message']");
	public By validationText = By.cssSelector("div[class='wpcf7-response-output']");
	public By zoomInButton = By.cssSelector("button[title='Zoom in']");
	public By zoomOutButton = By.cssSelector("button[title='Zoom out']");
	public By iframe = By.tagName("iframe");

	public void sendMessage(String name, String email, String subject, String message) {

		driver.findElement(nameField).sendKeys(name);
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(subjectField).sendKeys(subject);
		driver.findElement(messageField).sendKeys(message);
		// driver.findElement(validationText).isDisplayed();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)", "");
		driver.findElement(sendMessageButton).click();
	}

	public boolean checkTextIsDispayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}

	public void zoomMap(By locator) {
		driver.switchTo().frame(returnWebElement(iframe));
		click(locator);

	}
}