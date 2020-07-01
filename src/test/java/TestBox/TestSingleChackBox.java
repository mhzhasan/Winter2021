package TestBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Page.ChackBoxPage;
import Util.BrowserFactory;

public class TestSingleChackBox {
	
	WebDriver driver;

	 @Test
	public void  ChackonSingleChackBox() throws InterruptedException {
         driver = BrowserFactory.launchBrowser();
         
         // ChackBoxPage chackboxpage = new ChackBoxPage();
         ChackBoxPage chackboxpage = PageFactory.initElements(driver, ChackBoxPage.class);
         chackboxpage.SingleChackBoxToRemove();
         
         
	 }
         
         
}         

