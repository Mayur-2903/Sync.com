package utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders {

	@DataProvider(name = "LoginData")
	public Object[][] getData() {
		String path = ".\\testData\\Sync_LoginData.xlsx";

		ExcelUtility xlutil = new ExcelUtility(path);

		String[][] logindata = null;
		try {
			int totalrows = xlutil.getRowCount("Sheet1");
			int totalcols = xlutil.getCellCount("Sheet1", 0);

			logindata = new String[totalrows][totalcols];

			for (int i = 0; i < totalrows; i++) {
				for (int j = 0; j < totalcols; j++) {
					logindata[i][j] = xlutil.getCellData("Sheet1", i + 1, j);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return logindata;
	}

}
