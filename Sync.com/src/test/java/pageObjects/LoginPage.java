package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id=Const.userid)
	WebElement txtUserID;
	
	@FindBy(id=Const.userpassword)
	WebElement txtUserPassword;
	
	@FindBy(id=Const.loginbtn)
	WebElement btnLogin;
	
	public void setUserId(String Id) {
		txtUserID.sendKeys(Id);
	}
	
	public void setUserPassword(String pass) {
		txtUserPassword.sendKeys(pass);
	}
	
	public void clickLogin() {
		btnLogin.click();
		
	}

}
