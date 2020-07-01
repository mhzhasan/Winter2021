package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DuplicatedCategory {

	WebDriver driver;
	
	   public void UsertrytouseDuplicatevalue(WebDriver driver) {
		   
		   this.driver = driver;
	   }
	   
	   @FindBy(how = How.NAME, using = "categorydata")WebElement DUPLICATE_VALUE_LOCATOR;
		
		@FindBy(how = How.CSS, using = "input[value='Add category']") WebElement DUPLICATE_VALUE_BUTTON;
		
		

		public void PutDuplicateCategory(String categorydata) {

			DUPLICATE_VALUE_LOCATOR.sendKeys("HASAN");

		}
		
		

		public void ClickCategoryButton() {

			DUPLICATE_VALUE_BUTTON.click();
			

		}
}


