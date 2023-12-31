package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	//locatori sau webelemente
	public By usernameField = By.id("log");
	public By passField = By.id("password");
	public By submitButton = By.className("submit_button");
	public By succesMessage = By.cssSelector("div[class*='sc_infobox_style_success']");
	public By checkBoxSelector = By.cssSelector("li input[type='checkbox']");
	public By closeLoginPopun = By.cssSelector("[class='popup_close']");
	
	public By logoutButton = By.linkText("Logout");
	public By errorLoginMsg = By.cssSelector("div[class*='sc_infobox_style_error']");
	// metode specifice paginii sau functionalitatii pe care o reprezinta
	
	public void loginInApp(String user, String pass) {
		driver.findElement(usernameField).clear();
		driver.findElement(passField).clear();
		driver.findElement(usernameField).sendKeys(user);
		driver.findElement(passField).sendKeys(pass);
		driver.findElement(submitButton).click();
	}	
	
	
	public boolean checkLoginMsgIsDispayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
}
