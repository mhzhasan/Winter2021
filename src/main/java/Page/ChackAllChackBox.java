package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import bsh.This;

public class ChackAllChackBox {
	WebDriver driver;
	public ChackAllChackBox(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how=How.NAME,using="allbox")   WebElement CHACKBOX_FIELD_LOCATOR;
	
	//Method to interact with the element
		public void ClickToggleAll( ) {
			CHACKBOX_FIELD_LOCATOR.click();
			
		}
	
}
