package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Utils.BaseTest;
import pages.ContactPage;
import pages.MenuPage;

public class ContactTest extends BaseTest{

	
	@Test(priority=1)
	
	public void submitValidMessage() throws InterruptedException {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactsLink);
		ContactPage contact = new ContactPage(driver);
		contact.sendMessage("Andreea Tarata", "deea@gmail.com", "test", "Buna");
		Thread.sleep(1000);
		
		
		assertTrue(contact.checkTextIsDispayed(contact.validationText));
	
	}
}
