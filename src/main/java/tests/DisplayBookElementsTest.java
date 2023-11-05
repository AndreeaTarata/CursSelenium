package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Utils.BaseTest;

public class DisplayBookElementsTest extends BaseTest {
	
	@Test
	public void bookElementsAreDispayed() {
		
		app.menu.navigateTo(app.menu.shopLink);
		app.scrollPge(750);
		app.waitForElementToBeVisible(app.bookDetailsDisplayed.aHundredOneReceipesBook);
		app.bookDetailsDisplayed.viewBookDetails(app.bookDetailsDisplayed.aHundredOneReceipesBook);
		assertTrue(app.isDispayed(app.bookDetailsDisplayed.bookRaiting));
		assertTrue(app.isDispayed(app.bookDetailsDisplayed.addToCart));

		assertTrue(app.isDispayed(app.bookDetailsDisplayed.category));

		assertTrue(app.isDispayed(app.bookDetailsDisplayed.priceBook));

		assertTrue(app.isDispayed(app.bookDetailsDisplayed.viewBook));
		assertTrue(app.isDispayed(app.bookDetailsDisplayed.shortBookDescription));
		assertTrue(app.isDispayed(app.bookDetailsDisplayed.category));

		
		
		

	
		
	}
	
	

}
