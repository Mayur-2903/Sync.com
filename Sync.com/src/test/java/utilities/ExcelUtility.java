package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelUtility {

	private String path;
	private XSSFSheet sheet;
	private CellStyle style;

	public ExcelUtility(String path) {
		this.path = path;
	}

	public int getRowCount(String sheetName) throws IOException {
		try (FileInputStream fi = new FileInputStream(path); XSSFWorkbook workbook = new XSSFWorkbook(fi)) {
			sheet = workbook.getSheet(sheetName);
			return sheet.getLastRowNum();
		}
	}

	public int getCellCount(String sheetName, int rownum) throws IOException {
		try (FileInputStream fi = new FileInputStream(path); XSSFWorkbook workbook = new XSSFWorkbook(fi)) {
			sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			return (row == null) ? 0 : row.getLastCellNum();
		}
	}

	public String getCellData(String sheetName, int rownum, int colnum) throws IOException {
		try (FileInputStream fi = new FileInputStream(path); XSSFWorkbook workbook = new XSSFWorkbook(fi)) {
			sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			if (row == null)
				return "";

			Cell cell = row.getCell(colnum);
			if (cell == null)
				return "";

			return cell.toString();
		}
	}

	public void setCellData(String sheetName, int rownum, int colnum, String data) throws IOException {
		File xlfile = new File(path);
		try (FileInputStream fi = new FileInputStream(path);
				XSSFWorkbook workbook = xlfile.exists() ? new XSSFWorkbook(fi) : new XSSFWorkbook();
				FileOutputStream fo = new FileOutputStream(path)) {

			sheet = workbook.getSheet(sheetName);
			if (sheet == null)
				sheet = workbook.createSheet(sheetName);

			Row row = sheet.getRow(rownum);
			if (row == null)
				row = sheet.createRow(rownum);

			Cell cell = row.createCell(colnum);
			cell.setCellValue(data);

			workbook.write(fo);
		}
	}

	public void fillGreenColor(String sheetName, int rownum, int colnum) throws IOException {
		try (FileInputStream fi = new FileInputStream(path);
				XSSFWorkbook workbook = new XSSFWorkbook(fi);
				FileOutputStream fo = new FileOutputStream(path)) {

			sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(colnum);

			style = workbook.createCellStyle();
			style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

			cell.setCellStyle(style);

			workbook.write(fo);
		}
	}

	public void fillRedColor(String sheetName, int rownum, int colnum) throws IOException {
		try (FileInputStream fi = new FileInputStream(path);
				XSSFWorkbook workbook = new XSSFWorkbook(fi);
				FileOutputStream fo = new FileOutputStream(path)) {

			sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(colnum);

			style = workbook.createCellStyle();
			style.setFillForegroundColor(IndexedColors.RED.getIndex());
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

			cell.setCellStyle(style);

			workbook.write(fo);
		}
	}
}
