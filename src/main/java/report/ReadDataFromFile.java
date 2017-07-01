package report;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

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
	//	ArrayList<DataEntry> entryList = new ArrayList<DataEntry>();
        String fileName = "Kowalski_Jan.xls";
		InputStream inp = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(inp);

;
        for (Sheet sheet : wb ) {
            for (Row row : sheet) {


                try {
                    String employeeName = fileName.substring(0, fileName.indexOf('.')).replace("_"," ");
                    String projectName = sheet.getSheetName();
                    Date data = row.getCell(0).getDateCellValue();
                    String zadanie = row.getCell(1).getStringCellValue();
                    double czas  = row.getCell(2).getNumericCellValue();
                    System.out.println("Pracownik: "+employeeName+  "\nNazwa projektu: "+ projectName + "\nData: "+data +"\nZadanie: "+zadanie + "\nCzas:" + czas+"\n\n");
                } catch (Exception e) {
                    continue;
                }

            }
        }



	}
	// cell.setCellType(CellType.STRING);
	// cell.setCellValue("a test");
	//
	// // Write the output to a file
	// FileOutputStream fileOut = new FileOutputStream("Kowalski_Jan_out.xls");
	// wb.write(fileOut);
	// fileOut.close();

}
