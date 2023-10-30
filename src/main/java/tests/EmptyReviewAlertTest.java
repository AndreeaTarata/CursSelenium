package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Utils.BaseTest;

public class EmptyReviewAlertTest extends BaseTest{
	
	@Test
	public void emptyReviewTest() throws InterruptedException {

		app.menu.navigateTo(app.bookPage.bookTheForest);
		app.scrollPge(250);

		app.returnWebElement(app.bookPage.reviews).click();
		app.bookPage.clickSubmit(app.bookPage.submitButton);
		app.confirmJsAlert();
		assertTrue(app.returnWebElement(app.bookPage.submitButton).isDisplayed());
	}

	

}
