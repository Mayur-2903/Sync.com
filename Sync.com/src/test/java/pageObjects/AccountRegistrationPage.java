package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = Const.email_auth)
	WebElement txtUserEmail;

	@FindBy(id = Const.password_auth)
	WebElement txtPassword;

	@FindBy(id = Const.confirm_password_auth)
	WebElement txtConfirmPassword;

	@FindBy(id = Const.forget_password_chk)
	WebElement chkForgetPassPolicy;

	@FindBy(id = Const.policy_chk)
	WebElement chkPolicy;

	@FindBy(id = Const.create_account_btn)
	WebElement btnCreateFreeAccount;

	@FindBy(xpath = Const.msgConfirmation)
	WebElement msgConfirmation;
	
	@FindBy(xpath=Const.btnSignIn)
	WebElement btnSignIn;
	

	public void setUserEmail(String Email) {
		txtUserEmail.sendKeys(Email);
	}

	public void setPassword(String Pwd) {
		txtPassword.sendKeys(Pwd);
	}

	public void setConfirmPassword(String Pwd) {
		txtConfirmPassword.sendKeys(Pwd);
	}

	public void setForgetPassPolicy() {
		chkForgetPassPolicy.click();
	}

	public void setPolicy() {
		chkPolicy.click();
	}

	public void clickContinue() {
		btnCreateFreeAccount.click();
	}

	public boolean getConfirmationMsg() {

		return (msgConfirmation.isDisplayed());

	}
	
	public void clickSignIn() {
		btnSignIn.click();
	}

}
