package Curs13;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium {
	
	@Test
	public void openBrowser() {
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("http://keybooks.ro");
		
		driver.findElement(By.linkText("Login")).click();
		
		//driver.quit();
		
	}

}
