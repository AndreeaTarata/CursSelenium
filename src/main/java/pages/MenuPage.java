package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		
		this.driver = driver;
		
		
	}
	public By loginLink = By.cssSelector("li>a[href='#popup_login']");
	public By contactsLink = By.linkText("CONTACTS");
	public By singleAuthor = By.cssSelector("a[href='/margaret-robins/']");
	public By home = By.cssSelector("a[href='https://keybooks.ro/home-3/']");
	public By shopLink = By.linkText("BOOKS");
	public By evetsLink = By.linkText("EVENTS");
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
		
	}
	

}
