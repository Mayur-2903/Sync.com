package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SyncPage extends BasePage {
	public SyncPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = Const.txtSync)
	WebElement txtSync;

	@FindBy(xpath = Const.linkSignOut)
	WebElement linkSignOut;

	@FindBy(id = Const.btnSignOut)
	WebElement btnSignOut;

	public boolean isSyncPageExists() {
		try {
			return (txtSync.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	public void clickSignOutLink() {
		linkSignOut.click();
	}

	public void clickSignOutbtn() {
		btnSignOut.click();
	}

}
