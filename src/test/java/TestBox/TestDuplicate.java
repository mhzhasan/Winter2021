package TestBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Util.BrowserFactory;

public class TestDuplicate {

	WebDriver driver;

	@Test
	public void DuplicatedCategory() throws InterruptedException {
		driver = BrowserFactory.launchBrowser();

		Page.DuplicatedCategory duplicatedcategory = PageFactory.initElements(driver, Page.DuplicatedCategory.class);
		duplicatedcategory.PutDuplicateCategory("HASAN");
		Page.DuplicatedCategory ClickCategoryButton = PageFactory.initElements(driver, Page.DuplicatedCategory.class);
		ClickCategoryButton.ClickCategoryButton();

	}
}