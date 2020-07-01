package TestBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Page.AddCategory;
import Page.BackgroundSkyblue;
import Util.BrowserFactory;

public class TestSkyBlue {

	WebDriver driver;
	@Test
	public void  Backgroundcolorskybule() throws InterruptedException {
		driver = BrowserFactory.launchBrowser();
		Thread.sleep(3000);
		
		BackgroundSkyblue skybluebachground = PageFactory.initElements(driver, BackgroundSkyblue.class);
		skybluebachground.bluebackground();
}
	
	@AfterTest
	public void  BackgroundcolorWhite() throws InterruptedException {
		driver = BrowserFactory.launchBrowser();
		Thread.sleep(3000);
		
		BackgroundSkyblue backgroundwhite = PageFactory.initElements(driver, BackgroundSkyblue.class);
		backgroundwhite.Whitebackground();
}
}