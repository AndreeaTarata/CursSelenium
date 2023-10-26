package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class ImplicitWaitExample extends BaseTest {

	
	@Test
	public void ImplicitWait() {
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		//implicit se aplica pe instanta de dribver - are o legatura cu toate eleme, daca el nu exista in DOM asteapta 10 sec
		
		driver.findElement(By.cssSelector("div[id='start']>button")).click();
		WebElement finish = driver.findElement(By.id("finish"));
		assertEquals(finish.getText(), "Hello World!");
	}
}
