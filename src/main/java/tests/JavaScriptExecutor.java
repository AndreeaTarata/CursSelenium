package tests;

import javax.swing.plaf.synth.SynthStyleFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class JavaScriptExecutor extends BaseTest{
	
	@Test
	public void example1() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement searchIcon = app.simpleReturnWebElement(app.menu.searchIcon);
		WebElement searchInput = app.simpleReturnWebElement(app.menu.searchInput);
		
		/*//alternativa pt click
		jse.executeScript("arguments[0].click()", searchIcon);
		Thread.sleep(4000);
		
		//alternativa pt SendKeys();
		jse.executeScript("arguments[0].value='cooking'", searchInput);
		jse.executeScript("arguments[0].click()", searchInput);
		*/
		
		//alternativa pt click
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");
		//alternativa pt SendKeys();
		jse.executeScript("document.getElementsByClassName('search_field')[0].value = 'cooking' ");
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");
		
		//alternativa pt getText()
		String bookTitle = jse.executeScript("return document.getElementsByClassName('post_title')[0].childNodes[0].innerText").toString();
		System.out.println(bookTitle);
		
		//alternativa pentru isDispayed()
		 //--> checkVisibility
		
		String isDisplayed = jse.executeScript("return document.getElementsByClassName('post_title')[0].checkVisibility()").toString();
		System.out.println(isDisplayed);
		Boolean.valueOf(isDisplayed);//daca vreau sa transform stringul in boolean
		
		// alternativa pentru getCurrentURL()
		String currentUrl = jse.executeScript("return document.URL").toString();
		System.out.println(currentUrl);
		//alternativa pt getttitle
		String title = jse.executeScript("return document.title").toString();
		System.out.println(title);
		
		jse.executeScript("document.getElementsByClassName('menu_user_login')[0].childNodes[0].click()");
		//alternativa pt isSelected();
		
		String isSelected = jse.executeScript("return document.getElementsByName('rememberme')[0].checked").toString();
		System.out.println(isSelected);
		
		//alternativa pt isEnabled;
		String isEnabled = jse.executeScript("return document.getElementsByName('pwd')[0].disabled").toString();
		System.out.println(isEnabled);
		
		//custom function
		jse.executeScript("window.schimbTitlulPaginii = function(){ document.title ='Alt Titlu'};"
				+"window.schimbTitlulPaginii.call()");
		System.out.println(driver.getTitle());
		
		 
		
		
		
	}

}
