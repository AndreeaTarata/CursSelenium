package tests;

import Utils.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class XpathExample extends BaseTest {
	
	
	@Test(priority=1)
	public void xpathExample() {
		
		driver.findElement(By.xpath("//li[@class='menu_user_login']")).click();
		//logical or
		driver.findElement(By.xpath("//input[@id='log' or @name='log']")).sendKeys("TestUser");
		//logical and
		driver.findElement(By.xpath("//input[@type='password' and @name='pwd']")).sendKeys("12345@67890");
		driver.findElement(By.xpath("//input[@class='submit_button']")).click();
		
	}
	@Test(priority=2)
	public void xpathExample2() {
		
		driver.findElement(By.xpath("//span[@class='user_name']")).click();
		//text() -> citeste textul dintre taguri <a href="https://keybooks.ro/wp-admin/profile.php" class="icon icon-cog">Settings</a>
		driver.findElement(By.xpath("//a[text() = 'Settings']")).click();
		
		//contains
		//referinta catre textul dintre taguri cu text()
		driver.findElement(By.xpath("//a[contains(text(),'recent')]"));
		//referinta catre atributul href cu @href
		driver.findElement(By.xpath("//a[contains(@href , 'orders')]")).click();
		
		// direct child --> /
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement orderTbleHeader = driver.findElement(By.xpath("//th[contains(@class, 'woocommerce-orders-table__header')]/span[text()='Order']"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid red')", orderTbleHeader);
		
		// index
		WebElement totalTabHaeder = driver.findElement(By.xpath("(//th[contains(@class, 'woocommerce-orders-table__header')]/span)[4]"));
		jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid orange')", totalTabHaeder);
		
		WebElement order = driver.findElement(By.xpath("//td[contains(@class, 'woocommerce-orders-table__cell')][@data-title='Order']/a[not(contains(text(), '#172'))]"));
		order.click();
		
		
		
	}
	

}
