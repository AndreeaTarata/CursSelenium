package pages;

import javax.swing.text.html.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Utils.SeleniumWrappers;

public class ShopPage extends SeleniumWrappers {

	public ShopPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public By orderDropDown = By.name("orderby");
	public By sliderInitialPosition = By.cssSelector("span[style='left: 0%;']");
	public By sliderFinalPosition = By.cssSelector("span[style='left: 100%;']");
	

	public void filterByValue(String value) {

		Select selectObj = new Select(returnWebElement(orderDropDown));
		selectObj.selectByValue(value);
	}

	public String getCurrentSelectedOption() {
		Select selectObj = new Select(returnWebElement(orderDropDown));
		return selectObj.getFirstSelectedOption().getText();

	}

	public void filterByVisibleText(String text) {

		Select selectObj = new Select(returnWebElement(orderDropDown));
		selectObj.selectByVisibleText(text);
	}

public void filterByIndex(int index) {
	
	Select selectObj = new Select(returnWebElement(orderDropDown));
	selectObj.selectByIndex(index);
}
}