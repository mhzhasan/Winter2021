package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAllChackBox {
	
WebDriver driver;
	
	public RemoveAllChackBox(WebDriver driver) {
	 this.driver = driver;
	}
	@FindBy(how = How.NAME,using="submit")   WebElement TOGGLE_REMOVE_LOCATOR;
	
	public void RemoveAllChackedBox() {
		TOGGLE_REMOVE_LOCATOR.click();
		
	}
	
	}

