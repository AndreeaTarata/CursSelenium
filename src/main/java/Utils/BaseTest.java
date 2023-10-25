package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
	
	private static final String Thred = null;
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://keybooks.ro");
		
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(4000); //bad practice
		driver.quit(); //inchide toate ferestrele/ browserul indif de cate ferestre 
		//driver.close(); // inchide tabul curent
		
	}
	
}
