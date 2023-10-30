package Utils;

import org.openqa.selenium.WebDriver;

import pages.AuthorPage;
import pages.BookPage;
import pages.ContactPage;
import pages.LoginPage;
import pages.MenuPage;
import pages.ShopPage;


public class BasePage extends SeleniumWrappers {

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public LoginPage login = new LoginPage(driver);
	public MenuPage menu = new MenuPage(driver);
	
	public BookPage bookPage = new BookPage(driver);
	public AuthorPage authorPage = new AuthorPage(driver);
	public ShopPage shopPage = new ShopPage(driver);
	public ContactPage contact = new ContactPage(driver);

}
