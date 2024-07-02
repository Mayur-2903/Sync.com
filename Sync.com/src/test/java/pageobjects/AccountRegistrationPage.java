package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	@FindBy(id = Const.txtEmail)
	private WebElement txtUserEmail;

	@FindBy(id = Const.txtPassword)
	private WebElement txtPassword;

	@FindBy(id = Const.txtConfirmPassword)
	private WebElement txtConfirmPassword;

	@FindBy(id = Const.chkForgetPassword)
	private WebElement chkForgetPassPolicy;

	@FindBy(id = Const.chkPolicy)
	private WebElement chkPolicy;

	@FindBy(id = Const.btnCreateAccount)
	private WebElement btnCreateFreeAccount;

	@FindBy(xpath = Const.msgConfirmation)
	private WebElement msgConfirmation;

	@FindBy(xpath = Const.btnSignIn)
	private WebElement btnSignIn;

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	public void setUserEmail(String email) {
		txtUserEmail.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void setConfirmPassword(String pwd) {
		txtConfirmPassword.sendKeys(pwd);
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
		return msgConfirmation.isDisplayed();
	}

	public void clickSignIn() {
		btnSignIn.click();
	}
}
