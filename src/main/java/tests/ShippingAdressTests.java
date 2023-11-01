package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;
import pages.LoginPage;
import pages.ShippingAdress;

public class ShippingAdressTests extends BaseTest {

	@Test(priority = 1)
	public void loginToShippingAdressTest() {

		app.menu.navigateTo(app.menu.loginLink);
		app.login.loginInApp("TestUser", "12345@67890");
		app.shippingAdress.navigateToShippingAdress();
		// By usernameShipping = By.id("username");
		// By passwordShipping = By.cssSelector("input[id=\"password\"]");
		// By loginButton = By.className("woocommerce-button button
		// woocommerce-form-login__submit");
		WebElement usernameShipping = driver.findElement(By.name("username"));
		usernameShipping.sendKeys("TestUser");
		WebElement passwordShipping = driver.findElement(By.cssSelector("span input[id='password']"));
		passwordShipping.sendKeys("12345@67890");
		WebElement loginButton = driver.findElement(
				By.cssSelector("button[class='woocommerce-button button woocommerce-form-login__submit']"));
		loginButton.click();
		//app.waitForElementToBeVisible(app.shippingAdress.countryDropDown);
		app.shippingAdress.filterByIndex(41);

		assertEquals(app.shippingAdress.getCountryCurrentSelectedOption(), "Canada");
		app.scrollPge(400);
		app.shippingAdress.filterByValue("NL");
	
		assertEquals(app.shippingAdress.getProvinceCurrentSelectedOption(), "Newfoundland and Labrador");

	}
	}

	/*
	 * public void selectByIndexTest() { app.click(app.menu.shopLink);
	 * app.shopPage.filterByIndex(4);
	 * assertEquals(app.shopPage.getCurrentSelectedOption(),
	 * "Sort by price: low to high"); }
	 */


