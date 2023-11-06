package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class XpathExampple2 extends BaseTest {

	//@Test
	public void xpathTest() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// find parent
		WebElement popupLink = driver
				.findElement(By.xpath("//a[contains(@class, 'link')]/parent::li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", popupLink);
		popupLink.click();

		// descendant (//) si child cu un singur /
		WebElement username = driver
				.findElement(By.xpath("//ul[@id='menu_user']/descendant::form/child::div/child::input[@id='log']"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", username);
		username.sendKeys("Test");

		// descendant
		WebElement password = driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::input[@id='password']"));
		password.sendKeys("Test");

		// following care nu are legatura pe diagonala in jos
		WebElement rememberMe = driver
				.findElement(By.xpath("//div[@class='contact_phone_in_top']/following::input[@id='rememberme']"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", rememberMe);
		rememberMe.click(); // is selected pt radiobutton
		// preceding care nu are legatura pe diagonala in sus
		WebElement submit = driver.findElement(
				By.xpath("//div[@class='top_panel_top_socials']/preceding::input[@class='submit_button']"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", submit);
		submit.click();

	}
	@Test
	public void xpathTest2() {
		
		// //h5[contains(text(), '$15.99')]/../..  --> urca pe parintele elementului
		
		
		// ne referim la pahinatia din  shop(adica click pe books)
		//
		/*
		 * xpath:  //*[contains(@class, 'page-numbers')] --> gaeste 4 elemente (parintele UL si 3 copii un tag name span si 2 tag nameuri a
		 * a care au aceeasi clasa
		 * vreau sa elimin ul din locatorul de mai sus :
		 * sa nu mai gaseasca * all ci doar unul
		 * xpath : //*[self::span or self::a][contains(@class, 'page-numbers')]
		 * mai departe vreau sa elimin elementul care contine 1 si elementul care contine -> (sageata)
		 * 
		 * //*[self::span or self::a][contains(@class, 'page-numbers') and not(contains(text(), '1') or contains(text(), '→'))]
		 */
		
		
	}
}
