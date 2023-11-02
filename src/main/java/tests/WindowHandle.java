package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class WindowHandle extends BaseTest{

	
	@Test
	public void windowHandleTest() {
		app.click(app.menu.evetsLink);
		app.click(app.events.festivalOfOldFimsLink);
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 1000).perform();
		
		System.out.println("Current window before click on map:" + driver.getWindowHandle());
		System.out.println("All windows:" + driver.getWindowHandles());
		app.genericEvent.clickOnMap();
		System.out.println("Current window after click on map:" + driver.getWindowHandle());
		System.out.println("All windows:" + driver.getWindowHandles());
		
		List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		System.out.println("Current window after switch on map:" + driver.getWindowHandle());
		driver.findElement(By.xpath("//span[contains(text(), \"Accept all\")]")).click();
		driver.close();
		driver.switchTo().window(browserTabs.get(0));//switch de fereastra noua
		app.genericEvent.clickOnMap();
	}
}
