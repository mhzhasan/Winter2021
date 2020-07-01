package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategory {

	WebDriver driver;

	public  AddCategory(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.NAME, using = "categorydata")WebElement ADD_CATEGORY_LOCATOR;
	
	@FindBy(how = How.CSS, using = "input[value='Add category']") WebElement ADD_CATEGORY_BUTTON;
	
	

	public void NeedAddCategory(String categorydata) {

		ADD_CATEGORY_LOCATOR.sendKeys("HASAN");

	}

	public void  AddCategoryButton() {

		ADD_CATEGORY_BUTTON.click();
		

	}
}