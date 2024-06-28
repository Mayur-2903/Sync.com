package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SyncPage extends BasePage {
	public SyncPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id=Const.txtSync)
	WebElement txtSync;
	
	public boolean isSyncPageExists()   // MyAccount Page heading display status
	{
		try {
			return (txtSync.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	

}
