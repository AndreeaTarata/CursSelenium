package tests;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class AuthorTest extends BaseTest {
	@Test
	public void skillValue() {
		
		app.menu.navigateTo(app.menu.singleAuthor);
		
		System.out.println(app.authorPage.percentages.size());
		
		//books.get(2).click();
		//assertEquals(app.simpleReturnWebElement(app.authorPage.percetange).getText(), "95");
	}

}
