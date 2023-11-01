package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Utils.SeleniumWrappers;

public class ShippingAdress extends SeleniumWrappers {
	public ShippingAdress(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//public By usernameShipping = By.id("username");
	//public By passwordShipping = By.cssSelector("input[id=\"password\"]");
	//public By loginButton = By.className("woocommerce-button button woocommerce-form-login__submit");

	public void navigateToShippingAdress() {
		driver.get("https://keybooks.ro/account/edit-address/shipping/");
	}

	/*public void logInShippigAdress(String username, String password) {

		driver.findElement(usernameShipping).sendKeys(username);
		driver.findElement(passwordShipping).sendKeys(password);
		driver.findElement(loginButton).click();
	}*/

	public By countryDropDown = By.cssSelector("select[id='shipping_country']");
	public By provinceDropDown = By.cssSelector("select[id='shipping_state']");
	public void filterByValue(String value) {

		Select selectProvince = new Select(returnWebElement(provinceDropDown));
		selectProvince.selectByValue(value);
	}
	public void filterByIndex(int index) {

		Select selectCountry = new Select(returnWebElement(countryDropDown));
		
		selectCountry.selectByIndex(index);
	}
	public String getCountryCurrentSelectedOption() {
		Select selectObj = new Select(returnWebElement(countryDropDown));
		return selectObj.getFirstSelectedOption().getText();

	}
	public String getProvinceCurrentSelectedOption() {
		Select selectObj = new Select(returnWebElement(provinceDropDown));
		return selectObj.getFirstSelectedOption().getText();

	}
}