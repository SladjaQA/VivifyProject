package tests;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcellReader {
		File fajl;
		FileInputStream fis;
		XSSFWorkbook wb;
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;
		String value;
		
		public ExcellReader(String filePath) throws IOException {
			this.fajl = new File(filePath);
			this.fis = new FileInputStream(fajl);
			this.wb = new XSSFWorkbook(fis);
		}
		public String getCellData(String sheetName, int rowNumber, int cellNumber) {
			sheet = wb.getSheet(sheetName);
			row = sheet.getRow(rowNumber-1);
			cell = row.getCell(cellNumber-1);
			
			if (cell.getCellType() == CellType.NUMERIC) {
				value = String.valueOf((int) cell.getNumericCellValue());
			}else {
				value = cell.getStringCellValue();
			}
			return value;
		}

	}