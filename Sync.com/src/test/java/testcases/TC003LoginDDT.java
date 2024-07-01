package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountRegistrationPage;
import pageobjects.LoginPage;
import pageobjects.SyncPage;
import testbase.BaseClass;
import utilities.DataProviders;

public class TC003LoginDDT extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void verifyLoginDDT(String email, String password, String exp) {
		try {
			AccountRegistrationPage ap = new AccountRegistrationPage(driver);
			ap.clickSignIn();

			LoginPage lp = new LoginPage(driver);
			lp.setUserId(email);
			lp.setUserPassword(password);
			lp.clickLogin();

			SyncPage sp = new SyncPage(driver);
			boolean targetPage = sp.isSyncPageExists();

			if (exp.equalsIgnoreCase("Valid")) {
				if (targetPage == true) {
					sp.clickSignOutLink();
					sp.clickSignOutbtn();
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

			if (exp.equalsIgnoreCase("Invalid")) {
				if (targetPage == true) {
					sp.clickSignOutLink();
					sp.clickSignOutbtn();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}
		} catch (Exception e) {
			Assert.fail("An exception occurred: " + e.getMessage());
		}

	}

}
