package Utils;

import org.openqa.selenium.WebDriver;

import pages.AuthorPage;
import pages.BlogPage;
import pages.BookDetailsDisplayed;
import pages.BookPage;
import pages.ContactPage;
import pages.EventPage;
import pages.GenericEventPage;
import pages.LoginPage;
import pages.MenuPage;
import pages.ShippingAdress;
import pages.ShopPage;
import pages.SocialMediaLinks;

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
	public ShippingAdress shippingAdress = new ShippingAdress(driver);
	public EventPage events = new EventPage(driver);
	public GenericEventPage genericEvent = new GenericEventPage(driver);
	public BookDetailsDisplayed bookDetailsDisplayed = new BookDetailsDisplayed(driver);
	public SocialMediaLinks socialMediaLinks = new SocialMediaLinks(driver);
	public BlogPage blogPage = new BlogPage(driver);
}
