package report;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromFile {

	public static void readData() {
		System.out.println("Read data from file:");
		System.out.println("...to be implemented by YOU!");
	}
	
	
	public void readXls() throws EncryptedDocumentException, InvalidFormatException, IOException {
		// System.out.println("Hello Worlds!");
	//	ArrayList<DataEntry> entryList = new ArrayList<DataEntry>();
		InputStream inp = new FileInputStream("Kowalski_Jan.xls");
		// InputStream inp = new FileInputStream("workbook.xlsx");

		Workbook wb = WorkbookFactory.create(inp);

		Sheet sheet = wb.getSheetAt(0);

		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		// if (cell == null)
		// cell = row.createCell(3);

		System.out.println(cell.getStringCellValue());
	}
	// cell.setCellType(CellType.STRING);
	// cell.setCellValue("a test");
	//
	// // Write the output to a file
	// FileOutputStream fileOut = new FileOutputStream("Kowalski_Jan_out.xls");
	// wb.write(fileOut);
	// fileOut.close();

}
