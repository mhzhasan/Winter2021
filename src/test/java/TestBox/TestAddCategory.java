package TestBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.AddCategory;
import Util.BrowserFactory;

public class TestAddCategory {
	WebDriver driver;
	@Test
	public void  ValidAddCategory() throws InterruptedException {
		driver = BrowserFactory.launchBrowser();
		
		Thread.sleep(3000);
		
		AddCategory addcategory = PageFactory.initElements(driver, AddCategory.class);
		addcategory.NeedAddCategory("HASAN");

		AddCategory AddcategoryButton = PageFactory.initElements(driver, AddCategory.class);
		AddcategoryButton.AddCategoryButton();
		
		


}
}