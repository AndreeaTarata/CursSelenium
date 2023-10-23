package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Utils.BaseTest;
import pages.LoginPage;
import pages.MenuPage;

public class LoginTest extends BaseTest{
	
	@Test(priority=1)
	public void validLogin() throws InterruptedException {
		
		//open login popup
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		
		
		//insert valid username
		
		// insert valid pass
		
		// press submit button
		
		LoginPage login = new LoginPage(driver);
		login.loginInApp("TestUser", "12345@67890");
		
		//verify success login
		Thread.sleep(1000);
		assertTrue(login.checkLoginMsgIsDispayed(login.succesMessage));
		
		
		
		//clase din pachetele pages sunt page objects
		//asserturi sunt doar pe clasele de test
		
	}

	
	
}
