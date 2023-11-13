package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
	
	private static final String Thred = null;
	public WebDriver driver;
	public BasePage app;
	
	@BeforeClass (alwaysRun = true)
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://keybooks.ro");
		
		app = new BasePage(driver);
	}

	@AfterClass (alwaysRun = true)
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(1000); //bad practice
		driver.quit(); //inchide toate ferestrele/ browserul indif de cate ferestre 
		//driver.close(); // inchide tabul curent
		
	}
	
}
