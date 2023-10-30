package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class DropDownExample extends BaseTest {

	@Test(priority = 1)

	public void selectByValueTest() {
		app.click(app.menu.shopLink);
		app.shopPage.filterByValue("date");
		assertEquals(driver.getCurrentUrl(), ("https://keybooks.ro/shop/?orderby=date"));
		assertEquals(app.shopPage.getCurrentSelectedOption(), "Sort by latest");

	}

	@Test(priority = 2)
	public void selectByTextTest() {
		app.click(app.menu.shopLink);
		app.shopPage.filterByVisibleText("Sort by average rating");

		assertEquals(app.shopPage.getCurrentSelectedOption(), "Sort by average rating");
	}

	@Test(priority = 3)
	public void selectByIndexTest() {
		app.click(app.menu.shopLink);
		app.shopPage.filterByIndex(4);
		assertEquals(app.shopPage.getCurrentSelectedOption(), "Sort by price: low to high");
	}

	@Test(priority = 3)
	public void example() throws InterruptedException {
		
		app.click(app.menu.shopLink);
		//incarca in memorie un webelement pe un session id
		WebElement dropdown = driver.findElement(By.name("orderby"));
		Select select = new Select(dropdown);// primeste web elementul de mai sus
		select.selectByIndex(2);// se folosete de webelement si face refresh (ia alt id de seiune)
		Thread.sleep(2000);
		//start fix
		dropdown = driver.findElement(By.name("orderby"));
		select = new Select(dropdown);
		select.selectByValue("date");// se foloseste de elemtul care apartine de prima sesiune
	}
}