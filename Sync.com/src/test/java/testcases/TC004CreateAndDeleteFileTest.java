package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.AccountRegistrationPage;
import pageobjects.FilePage;
import pageobjects.LoginPage;
import testbase.BaseClass;

public class TC004CreateAndDeleteFileTest extends BaseClass {
	@Test
	public void verifyCreateFile() {
		logger.info("**** Starting TC_004_CreateFileTest ****");
		logger.debug("Capturing application debug logs...");
		try {
			AccountRegistrationPage ap = new AccountRegistrationPage(driver);
			ap.clickSignIn();

			LoginPage lp = new LoginPage(driver);
			logger.info("Entering valid email and password..");
			lp.setUserId(p.getProperty("userId"));
			lp.setUserPassword(p.getProperty("userPassword"));
			lp.clickLogin();

			FilePage fp = new FilePage(driver);
			fp.clickCreateFile();
			fp.clickWordDocument("WordFile");
			fp.clickCreateFile();
			fp.clickPowerpointPresentation("PowerPoint");
			fp.clickCreateFile();
			fp.clickExcelWorksheet("ExcleFile");
			fp.clickCreateFile();
			fp.clickTextFile("TestFile");
			Thread.sleep(10000);
		} catch (Exception e) {
			logger.error("Exception occurred: " + e.getMessage());
			Assert.fail("Creating file failed due to exception: " + e.getMessage());
		}

		logger.info("**** Finished TC_004_CreateFileTest ****");
	}

	@Test
	public void verifyDeleteFile() {
		logger.info("**** Starting TC_004_DeleteFileTest ****");
		logger.debug("Capturing application debug logs...");
		try {
			FilePage fp = new FilePage(driver);
			fp.clickDropdown();
			fp.clickSelectAll();
			fp.clickDelete();
			fp.clickDeleteAll();
			Thread.sleep(10000);
		} catch (Exception e) {
			logger.error("Exception occurred: " + e.getMessage());
			Assert.fail("Deleting file failed due to exception: " + e.getMessage());
		}

		logger.info("**** Finished TC_004_DeleteFileTest ****");

	}

}
