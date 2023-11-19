package tests;

import org.testng.annotations.Test;

import Utils.BaseTest;

public class MusicHandleHomework extends BaseTest{

		@Test
		public void hoverTest() throws InterruptedException {

			app.hoverElement(app.menu.blog);
			app.waitForElementToBeVisible(app.dragAndDropBlogPage.postFormatOption);
			app.click(app.dragAndDropBlogPage.postFormatOption);
			app.scrollPge(600);
			app.click(app.dragAndDropBlogPage.audioPost);
			app.click(app.dragAndDropBlogPage.playButton);
			Thread.sleep(5000);
			app.dragAndDrop(app.dragAndDropBlogPage.soundHandle, 100, 0);
			//app.click(app.dragAndDropBlogPage.soundButton);
			app.dragAndDrop(app.dragAndDropBlogPage.soundButton, 10, 0);
			Thread.sleep(9000);
		}
}