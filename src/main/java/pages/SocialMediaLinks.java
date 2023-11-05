package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumWrappers;

public class SocialMediaLinks extends SeleniumWrappers{

	public SocialMediaLinks(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public By facebook = By.className("icon-facebook");
	public By twitter = By.className("icon-twitter");
	public By instagram = By.className("icon-instagramm");
	
	
	
}
