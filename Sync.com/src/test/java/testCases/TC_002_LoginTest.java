package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.LoginPage;
import pageObjects.SyncPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
	@Test
	public void verify_login()
	{
		
		logger.info("**** Starting TC_002_LoginTest  ****");
		logger.debug("capturing application debug logs....");
		try {
		AccountRegistrationPage ap = new AccountRegistrationPage(driver);
		ap.clickSignIn();
		
		LoginPage lp=new LoginPage(driver);
		logger.info("Entering valid email and password..");
		lp.setUserId(p.getProperty("userId"));
		lp.setUserPassword(p.getProperty("userPassword"));
		lp.clickLogin();
		logger.info("clicked on ligin button..");
		
		SyncPage sp = new SyncPage(driver);
        boolean targetPage=sp.isSyncPageExists();
		
		Assert.assertEquals(targetPage, true,"Login failed");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("**** Finished TC_002_LoginTest  ****");
		
	}

}
