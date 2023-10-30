package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookPage {
	public WebDriver driver;

	public BookPage(WebDriver driver) {

		this.driver = driver;

	}

	public By bookTheForest = By.cssSelector("a[href='the-forest']");
	public By reviews = By.cssSelector("a[href='#tab-reviews']");
	public By submitButton = By.cssSelector("input[id='submit']");
	public By insertReviewMessage = By.cssSelector("textarea[id='comment']");
	public By insertReviewName = By.cssSelector("input[id='author']");
	public By insertEmailName = By.cssSelector("input[id='email']");
	public By fiveStarRarting = By.cssSelector("a[class='star-5']");
	public By awaitingApprovalMessage = By.className("woocommerce-review__awaiting-approval");

public void clickSubmit(By locator) {
	driver.findElement(locator).click();
}
}