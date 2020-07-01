package TestBox;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import Page.AddCategory;
import Page.ValidateDropDown;
import Util.BrowserFactory;

public class TestValidateDropDown {
	WebDriver driver;
	@Test
	public void ValidMonth() throws InterruptedException {
		driver = BrowserFactory.launchBrowser();
		
		Thread.sleep(3000);
		
		ValidateDropDown validatedropdown = PageFactory.initElements(driver, ValidateDropDown.class);
		validatedropdown.ValidMonthJAN("JAN");
		
		ValidateDropDown ValidMonthFEB = PageFactory.initElements(driver, ValidateDropDown.class);
		ValidMonthFEB.ValidMonthFEB("FEB");
		
		ValidateDropDown ValidMonthMAR = PageFactory.initElements(driver, ValidateDropDown.class);
		ValidMonthMAR.ValidMontMar("MAR");
		


}
}
