package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumWrappers;

public class BlogPage extends SeleniumWrappers {

	public BlogPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public By classic = By.xpath("//a[contains(text(), 'Classic')]/parent::li[@id='menu-item-114']");
	public By search = By.xpath("(//input[@class='search_field'])[3]");
	public By readMore = By.className("post_readmore_label");
	public By category = By.xpath("(//a[@href='https://keybooks.ro/category/classic/'])[4]");
	public By news = By.xpath("//a[@class='category_link'][@href='https://keybooks.ro/category/classic/']");
	public By recommend = By.xpath("//a[@class='category_link'][@href='https://keybooks.ro/category/recommend/']");
	public By searchButton = By.xpath("//button[@class='search_button icon-search']");
	
}
