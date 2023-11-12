package tests;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Utils.BaseTest;

public class Homework16 extends BaseTest {

	@Test
	public void validReviewTest() throws InterruptedException {

		app.menu.navigateTo(app.menu.home);
		app.scrollPge(250);
		app.simpleReturnWebElement(app.bookPage.bookTheForest).click();

		app.returnWebElement(app.bookPage.reviews).click();
		app.simpleReturnWebElement(app.bookPage.fiveStarRarting).click();
		app.simpleReturnWebElement(app.bookPage.insertReviewMessage).sendKeys("Teste review5");
		app.simpleReturnWebElement(app.bookPage.insertReviewName).sendKeys("Andreea");
		app.simpleReturnWebElement(app.bookPage.insertEmailName).sendKeys("deea@gmail.com");
		app.simpleReturnWebElement(app.bookPage.submitButton).click();

		String awaitingMessage = "Your review is awaiting approval";
		System.out.println(app.simpleReturnWebElement(app.bookPage.awaitingApprovalMessage).getText());
		// assertEquals(app.returnWebElement(app.bookPage.awaitingApprovalMessage).getText(),
		// awaitingMessage);

	}

}
