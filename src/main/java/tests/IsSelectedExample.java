package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;
import Utils.SeleniumWrappers;
import pages.LoginPage;
import pages.MenuPage;

public class IsSelectedExample extends BaseTest{
	
	/* metoda is selected se aplica doar pe elemente care au atributul: 
	 * type = checkbox si ssau type = radio button si verifica daca elementul este selectat sau nu
	 * intoarce o valoare boolean 
	 */
	@Test
	public void isSelectedTest() {
		
		app.menu.navigateTo(app.menu.loginLink);
		
		app.simpleReturnWebElement(app.login.checkBoxSelector).click();
		assertTrue(app.simpleReturnWebElement(app.login.checkBoxSelector).isSelected());
		//inlocuieste cele 2 linii de mai jos
		/*MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		
		
		
		LoginPage login = new LoginPage(driver);
		SeleniumWrappers seleniumErappers = new SeleniumWrappers();
		System.out.println(seleniumErappers.returnWebElement(login.checkBoxSelector));
		seleniumErappers.returnWebElement(login.checkBoxSelector).click();
		System.out.println(seleniumErappers.returnWebElement(login.checkBoxSelector));*/
		
		
		/*WebElement remberMe = driver.findElement(login.checkBoxSelector);
		
		*System.out.println(remberMe.isSelected());
		*remberMe.click();
		
		System.out.println(remberMe.isSelected());
		*/
	}

}
