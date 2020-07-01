package TestBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.ChackAllChackBox;
import Page.ChackBoxPage;
import Util.BrowserFactory;

public class TestRemoveAllChackBox {
	
	WebDriver driver;

	@Test
	public void  RemoveAllChackBox() throws InterruptedException {
         driver = BrowserFactory.launchBrowser();
         Page.RemoveAllChackBox removeallchackbox = PageFactory.initElements(driver, Page.RemoveAllChackBox.class); 
          removeallchackbox.RemoveAllChackedBox();
        

}
}