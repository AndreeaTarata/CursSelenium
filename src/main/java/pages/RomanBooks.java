package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumWrappers;

public class RomanBooks extends SeleniumWrappers {

	public RomanBooks(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public By romansProductCategory = By.cssSelector("a[href='https://keybooks.ro/product-category/romans/']");
	public By aBanketOfMouse = By.xpath("(//a[@href='https://keybooks.ro/shop/a-banquet-of-mouse/'])[6]");
	public By lifeInTheGarden = By.xpath("(//a[@href='https://keybooks.ro/shop/life-in-the-garden/'])[6]");
	public By lonelyManInWhiteHat = By.xpath("(//a[@href='https://keybooks.ro/shop/lonely-man-in-white-hat/'])[6]");
	public By theSon = By.xpath("(//a[@href='https://keybooks.ro/shop/the-son/'])[6]");
	public String curentRomanBooksUrl = "https://keybooks.ro/product-category/romans/";

	public boolean curentUrl(String curentRomanBooksUrl2) {
		return true;
	}

	public void openRomanBooks() {

		click(romansProductCategory);
	}

	public void openRomansBooksUrl(String book){

		
		waitForTheElementToBeClickable(aBanketOfMouse);
		driver.findElement(aBanketOfMouse).click();
		
		// windowHandle();
		// scrollPge(500);
		waitForTheElementToBeClickable(lifeInTheGarden);
		driver.findElement(lifeInTheGarden).click();
		// Thread.sleep(3000);
		// scrollPge(500);
		// windowHandle();
		waitForTheElementToBeClickable(lonelyManInWhiteHat);
		driver.findElement(lonelyManInWhiteHat).click();
		// Thread.sleep(3000);
		// scrollPge(500);
		// windowHandle();
		//waitForTheElementToBeClickable(theSon);
		//waitForTheElementToBeClickable(theSon);
		//driver.findElement(theSon).click();
		// windowHandle();
		// scrollPge(500);*/

	}

}
