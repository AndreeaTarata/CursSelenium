package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumWrappers;

public class BookDetailsDisplayed extends SeleniumWrappers{

	public BookDetailsDisplayed(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public By bookRaiting = By.xpath("//div[@aria-label='Rated 5.00 out of 5']");
	public By viewBook = By.xpath("//a[@class='woocommerce-product-gallery__trigger']");
	public By priceBook = By.xpath("//p[@class='price']/ins");
	public By aHundredOneReceipesBook = By.xpath("//a[contains(text(), 'receipes')]");
	public By shortBookDescription = By.xpath("//div[@class='woocommerce-product-details__short-description']");
	public By inputQuantity = By.xpath("//input[@id='quantity_6547ddb9acf91']");
	public By addToCart = By.xpath("//button[@class='single_add_to_cart_button button alt']");
	public By category = By.xpath("//span[@class='posted_in']");
	
	
	public void viewBookDetails(By locator) {
		driver.findElement(locator).click();
		
	}
	
		
	
	
}

