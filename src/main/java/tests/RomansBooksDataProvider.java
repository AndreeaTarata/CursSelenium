package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class RomansBooksDataProvider extends BaseTest {

	@DataProvider(name = "romanBooksDataProvider")
	public Object[][] romanBooksDataProvider() {

		Object[][] data = new Object[3][2];

		data[0][0] = "A banquet of mouse";
		data[0][1] = "a-banquet-of-mouse/";
		//data[0][2] = true;

		data[1][0] = "Life in the garden";
		data[1][1] = "life-in-the-garden/";
		//data[1][2] = true;

		data[2][0] = "Lonely man in white hat";
		data[2][1] = "lonely-man-in-white-hat/";
		//data[2][2] = true;

		//data[3][0] = "The son";
		//data[3][1] = "the-son/";
		//data[3][2] = true;

		return data;

	}

	//@Parameters({String books, String url})
	@Test(dataProvider = "romanBooksDataProvider")
	public void urlCheckFromRomansBooks(String bookName, String url){
		app.click(app.menu.shopLink);
		app.scrollPge(300);
		app.romanBooks.openRomanBooks();
		app.scrollPge(600);
		app.romanBooks.openRomansBooksUrl(bookName);
		
		//if (sucess) {
		//assertTrue(app.romanBooks.curentUrl(app.romanBooks.curentRomanBooksUrl));
		String urlCarte = ("https://keybooks.ro/shop/"+url);
		System.out.println(urlCarte);
		//assertTrue(urlCarte)
		

		//} else if (!sucess) {
		//System.out.println("gresit");

	}
	}
