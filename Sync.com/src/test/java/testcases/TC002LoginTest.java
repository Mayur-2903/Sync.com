package testcases; // Retained original package name

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountRegistrationPage;
import pageobjects.LoginPage;
import pageobjects.SyncPage;
import testbase.BaseClass;

public class TC002LoginTest extends BaseClass {
	
	@Test
	public void verify_login() {
		logger.info("**** Starting TC_002_LoginTest ****");
		logger.debug("Capturing application debug logs...");
		
		try {
			AccountRegistrationPage ap = new AccountRegistrationPage(driver);
			ap.clickSignIn();
			
			LoginPage lp = new LoginPage(driver);
			logger.info("Entering valid email and password..");
			lp.setUserId(p.getProperty("userId"));
			lp.setUserPassword(p.getProperty("userPassword"));
			lp.clickLogin();
			logger.info("Clicked on login button..");
			
			SyncPage sp = new SyncPage(driver);
			boolean targetPage = sp.isSyncPageExists();
			
			Assert.assertTrue(targetPage, "Login failed: Sync page not found");
			logger.info("Login successful");
			
		} catch(Exception e) {
			logger.error("Exception occurred: " + e.getMessage());
			Assert.fail("Login failed due to exception: " + e.getMessage());
		}
		
		logger.info("**** Finished TC_002_LoginTest ****");
	}
}
