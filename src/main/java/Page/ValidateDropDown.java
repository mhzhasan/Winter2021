package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidateDropDown {
	WebDriver driver;

	public ValidateDropDown(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "select[name='due_month']")
	WebElement JAN_MONTH_BUTTON;
	@FindBy(how = How.CSS, using = "select[name='due_month']")
	WebElement FEB_MONTH_BUTTON;
	@FindBy(how = How.CSS, using = "select[name='due_month']")
	WebElement MAR_MONTH_BUTTON;
	// driver.findElement(By.cssSelector("select[name=‘due_month’]")).click(); //
	// WebElement DROPDOWN_LOCATOR =
	// driver.findElement(By.cssSelector("select[name='due_month']"));

	public void ValidMonthJAN(String Month) {

		JAN_MONTH_BUTTON.sendKeys("JAN");
	}

	public void ValidMonthFEB(String Month) {

		FEB_MONTH_BUTTON.sendKeys("FEB");
	}
public void ValidMontMar(String Month) {
		
		MAR_MONTH_BUTTON.sendKeys("MAR");
	}
}
