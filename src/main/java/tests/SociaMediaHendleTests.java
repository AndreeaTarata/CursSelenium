package tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class SociaMediaHendleTests extends BaseTest{

	@Test
	public void socialLinksWindowHandle() {
		
		app.click(app.socialMediaLinks.facebook);
		System.out.println("Current window before click on map:" + driver.getWindowHandle());
		System.out.println("All windows:" + driver.getWindowHandles());
		
		List<String> browserTabs1 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs1.get(1));
		System.out.println("Current window after switch on map:" + driver.getWindowHandle());
		//driver.findElement(By.xpath("//span[contains(text(), \"Accept all\")]")).click();
		driver.close();
		driver.switchTo().window(browserTabs1.get(0));//switch de fereastra noua
		app.click(app.socialMediaLinks.twitter);
		List<String> browserTabs2 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs2.get(1));
		System.out.println("Current window after switch on map:" + driver.getWindowHandle());
		//driver.findElement(By.xpath("//span[contains(text(), \"Accept all\")]")).click();
		driver.close();
		driver.switchTo().window(browserTabs2.get(0));//switch de fereastra noua
		app.click(app.socialMediaLinks.instagram);
		List<String> browserTabs3 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs3.get(1));
		System.out.println("Current window after switch on map:" + driver.getWindowHandle());
		//driver.findElement(By.xpath("//span[contains(text(), \"Accept all\")]")).click();
		driver.close();
		driver.switchTo().window(browserTabs3.get(0));
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/");
				
		
	}
	
}
