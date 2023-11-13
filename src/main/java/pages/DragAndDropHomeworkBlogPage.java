package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.SeleniumWrappers;

public class DragAndDropHomeworkBlogPage extends SeleniumWrappers{

	public DragAndDropHomeworkBlogPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		public By postFormatOption = By.xpath("(//a[@href='https://keybooks.ro/category/post-formats/'])[1]");
		public By audioPost = By.xpath("(//a[@href='https://keybooks.ro/2016/02/02/audio-post/'])[1]");
		public By playButton = By.xpath("//div[@class='mejs-button mejs-playpause-button mejs-play']");
		public By soundButton = By.xpath("(//button[@type='button'])[2]");
		public By playHandle = By.xpath("//span[@class='mejs-time-handle']");
		public By soundHandle = By.xpath("//span[@class='mejs-time-current']");
		
}
// "span[class="
//+ "'mejs-time-total mejs-time-slider']");
//}