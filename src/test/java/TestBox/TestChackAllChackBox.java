package TestBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.ChackAllChackBox;
import Page.ChackBoxPage;
import Util.BrowserFactory;

public class TestChackAllChackBox {
	WebDriver driver;

	 @Test
	public void  ChackonAllChackBox() throws InterruptedException {
        driver = BrowserFactory.launchBrowser();
        
       ChackAllChackBox chackallchackbox = PageFactory.initElements(driver, ChackAllChackBox.class);
       chackallchackbox.ClickToggleAll();
        
        
        
	 }     

}
