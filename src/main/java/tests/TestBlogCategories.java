package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Utils.BaseTest;

public class TestBlogCategories extends BaseTest{
	
	@Test(priority=1)
	public void blogCategoryTests() {
		
		
		app.menu.navigateTo(app.menu.blog);
		app.waitForElementToBeVisible(app.blogPage.classic);
		app.simpleReturnWebElement(app.blogPage.classic).click();
		app.scrollPge(1300);
		app.returnWebElement(app.blogPage.search).sendKeys("Why");
		app.returnWebElement(app.blogPage.searchButton).click();
		app.scrollPge(400);
		app.returnWebElement(app.blogPage.readMore).click();
		app.scrollPge(300);
		app.waitForElementToBeVisible(app.blogPage.news);
		assertTrue(app.isDispayed(app.blogPage.news));
		assertTrue(app.isDispayed(app.blogPage.recommend));
		assertTrue(app.isDispayed(app.blogPage.category));
	}

}
