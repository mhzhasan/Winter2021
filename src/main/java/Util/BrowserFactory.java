package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	  static WebDriver driver;
	  
	public static WebDriver launchBrowser() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		// Thread.sleep(3000);
		 
		 driver.get("http://techfios.com/test/101/");
		 driver.manage().window().maximize();
		// Thread.sleep(3000);
		
		return driver;
		
		
		
		
	}
	
}



