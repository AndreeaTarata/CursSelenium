package tests;

import org.testng.annotations.Test;

import Utils.BaseTest;

public class IsEnabled extends BaseTest{
	
	@Test
	
	public void isEnabledTest() {
		
		app.menu.navigateTo(app.menu.loginLink);
		System.out.println(app.returnWebElement(app.login.usernameField).isEnabled());//pe el de tip imput
	}

}
