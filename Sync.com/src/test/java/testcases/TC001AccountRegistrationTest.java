package testcases; // Retaining original package name

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountRegistrationPage;
import testbase.BaseClass;

public class TC001AccountRegistrationTest extends BaseClass {
	
	@Test
	public void verify_account_registration() {
		
		logger.info("***** Starting TC_001_AccountRegistrationTest *****");
		logger.debug("This is a debug log message");
		
		try {
			AccountRegistrationPage ap = new AccountRegistrationPage(driver);
			logger.info("Providing customer details...");
			
			ap.setUserEmail(randomeString() + "@gmail.com");
			
			String password = randomAlphaNumeric();
			ap.setPassword(password);
			ap.setConfirmPassword(password);
			ap.setForgetPassPolicy();
			ap.setPolicy();
			ap.clickContinue();
			
			System.out.println("User Successfully login:-" +ap.getConfirmationMsg());
			Assert.assertEquals(true, ap.getConfirmationMsg()); // Modify as per your actual requirement
			
			logger.info("Test passed");
		} catch (Exception e) {
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
		} finally {
			logger.info("***** Finished TC_001_AccountRegistrationTest *****");
		}
	}
}
