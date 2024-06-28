package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(id = Const.userid)
    private WebElement txtUserID;
    
    @FindBy(id = Const.userpassword)
    private WebElement txtUserPassword;
    
    @FindBy(id = Const.loginbtn)
    private WebElement btnLogin;
    
    public void setUserId(String userId) {
        txtUserID.sendKeys(userId);
    }
    
    public void setUserPassword(String password) {
        txtUserPassword.sendKeys(password);
    }
    
    public void clickLogin() {
        btnLogin.click();
    }
    
}
