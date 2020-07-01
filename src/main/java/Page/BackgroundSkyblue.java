package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Util.BrowserFactory;

public class BackgroundSkyblue {

	WebDriver driver;

	public BackgroundSkyblue(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = ("//button[@onclick='myFunctionSky()']"))
	WebElement BLUE_COLOR_LOCATOR;
	@FindBy(how = How.XPATH, using = ("//button[@onclick='myFunctionWhite()']\""))
	WebElement WHITE_COLOR_LOCATOR;

	public void bluebackground() {
		
		BLUE_COLOR_LOCATOR.click();
	}
	public void Whitebackground() {

		WHITE_COLOR_LOCATOR.click();

	}

}
