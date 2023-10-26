package Utils;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;
import pages.MenuPage;

public class BasePage extends SeleniumWrappers {

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public LoginPage login = new LoginPage(driver);
	public MenuPage menu = new MenuPage(driver);
	
	

}
