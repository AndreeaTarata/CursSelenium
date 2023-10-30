package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthorPage {
	public WebDriver driver;

	public AuthorPage(WebDriver driver) {

		this.driver = driver;

	}

	public By drama = By.cssSelector("div[class='sc_skills_label']");
	public By biography = By.cssSelector("div[class='sc_skills_label']");

	public By cookbooks = By.cssSelector("div[class='sc_skills_label']");

	// public List<WebElement> percentages = driver.findElements(By.cssSelector("div[class='sc_skills_total']"));
	
}
