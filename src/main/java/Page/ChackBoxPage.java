package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChackBoxPage {
	
	WebDriver driver;
	
	public ChackBoxPage(WebDriver driver) {
	 this.driver = driver;
	}
	
	@FindBy(how = How.NAME,using="todo[1]") WebElement REMOVE_BUTTON_LOCATOR;
	
	//Method to interact with the element
	
	public void SingleChackBoxToRemove() {
		REMOVE_BUTTON_LOCATOR.click();
		driver.findElement(By.name("submit")).click();
	}
	
	
	
	
	
		
	
	
	
}





