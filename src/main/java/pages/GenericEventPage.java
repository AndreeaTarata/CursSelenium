package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumWrappers;

public class GenericEventPage extends SeleniumWrappers {

	public GenericEventPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

public By mapLink = By.partialLinkText("map");
public By iframe = By.tagName("iframe");



public void clickOnMap() {
	driver.switchTo().frame(returnWebElement(iframe));
	click(mapLink);
	
}
	

}
