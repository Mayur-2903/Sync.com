package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilePage extends BasePage {
	public FilePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = Const.btnCreateFile)
	WebElement btnCreateFile;

	@FindBy(id = Const.btnWordDocument)
	WebElement btnWordDocument;

	@FindBy(id = Const.btnPowerpointPresentation)
	WebElement btnPowerpointPresentation;

	@FindBy(id = Const.btnExcelWorksheet)
	WebElement btnExcelWorksheet;

	@FindBy(id = Const.btnTextFile)
	WebElement btnTextFile;

	@FindBy(id = Const.txtCreateDocument)
	WebElement txtCreateDocument;

	@FindBy(id = Const.btnCreate)
	WebElement btnCreate;

	@FindBy(id = Const.toggleDropdown)
	WebElement toggleDropdown;

	@FindBy(xpath = Const.btnSelectAll)
	WebElement btnSelectAll;

	@FindBy(id = Const.btnDelete)
	WebElement btnDelete;

	@FindBy(xpath = Const.btnDeleteItems)
	WebElement btnDeleteItems;

	public void clickCreateFile() {
		btnCreateFile.click();
	}

	public void clickWordDocument(String WordFile) {
		btnWordDocument.click();
		txtCreateDocument.clear();
		txtCreateDocument.sendKeys(WordFile);
		btnCreate.click();
	}

	public void clickPowerpointPresentation(String Powerpoint) {
		btnPowerpointPresentation.click();
		txtCreateDocument.clear();
		txtCreateDocument.sendKeys(Powerpoint);
		btnCreate.click();
	}

	public void clickExcelWorksheet(String ExcleFile) {
		btnExcelWorksheet.click();
		txtCreateDocument.clear();
		txtCreateDocument.sendKeys(ExcleFile);
		btnCreate.click();
	}

	public void clickTextFile(String TextFile) {
		btnTextFile.click();
		txtCreateDocument.clear();
		txtCreateDocument.sendKeys(TextFile);
		btnCreate.click();
	}

	public void clickDropdown() {
		toggleDropdown.click();
	}

	public void clickSelectAll() {
		btnSelectAll.click();
	}

	public void clickDelete() {
		btnDelete.click();
	}

	public void clickDeleteAll() {
		btnDeleteItems.click();
	}

}
