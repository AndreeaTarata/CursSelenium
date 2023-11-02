package tests;

import org.testng.annotations.Test;

import Utils.BaseTest;

public class IframeExample extends BaseTest{
	@Test
	public void iFrameTest() {
		app.click(app.menu.contactsLink);
		app.contact.zoomMap(app.contact.zoomInButton);
		driver.switchTo().defaultContent();
		app.returnWebElement(app.contact.nameField).sendKeys("Text");
	}
	

}
