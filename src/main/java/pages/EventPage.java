package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumWrappers;

public class EventPage extends SeleniumWrappers {

	public EventPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public By festivalOfOldFimsLink = By.linkText("Festival of Old Films");
	
}
