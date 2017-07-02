package report;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public interface ReadDataFromFile {
	
	@SuppressWarnings("resource")
	public default void readDataFromFile(App data) {
		System.out.println("Podaj œcie¿kê i nazwê pliku: ");
		Scanner sc = new Scanner(System.in);
		String dirPathname = sc.next();
		File directory = new File(dirPathname);
		if(!directory.isDirectory()){
			if(dirPathname.endsWith(".xls")) {
				System.out.println("OK - odczytywanie '" + dirPathname + "'");
				readDataFromFile(data, dirPathname);
			}
			else {
				System.out.println("B³ad - '" + dirPathname + "' jest z³ego typu");
			}
		}
		else {
			System.out.println("B³¹d! - '" + dirPathname + "' jest katalogiem!");
		}
	}
	
	public default void readDataFromFile(App data, String fileName) {
		int rowNo = -1;
		try {
			InputStream inp = new FileInputStream(fileName);
			Workbook wb = WorkbookFactory.create(inp);
			Sheet sheet = wb.getSheetAt(0);
			Row row0 = sheet.getRow(0);
			String cell0 = row0.getCell(0).toString().trim();
			String cell1 = row0.getCell(1).toString().trim();
			String cell2 = row0.getCell(2).toString().trim();
			if(!cell0.toString().contains("Data")) throw new WrongXlsDataException("cell0 content='" + cell0 + "'");
			if(!cell1.toString().contains("Zadanie")) throw new WrongXlsDataException("cell1 content='" + cell1 + "'");
			if(!cell2.toString().contains("Czas")) throw new WrongXlsDataException("cell2 content='" + cell2 + "'");
			for(rowNo = 1; rowNo>0; rowNo++) {
				Row row = sheet.getRow(rowNo);
				cell0 = row.getCell(0).toString().trim();
				//System.out.println(rowNo+ " cell0=" + cell0);
				if(!cell0.toString().trim().equals("")) {
					cell1 = row.getCell(1).toString().trim();
					cell2 = row.getCell(2).toString().trim();
					String sheetName = sheet.getSheetName();
					System.out.println(rowNo + " " + fileName + "  " + sheetName + "  cell0=" + cell0 + "  cell1=" + cell1 + "  cell2=" + cell2);
					String employeeName = fileName.trim().replace(".xls", "").replace("_", " ");
					int lastIndex = employeeName.lastIndexOf("\\");
					employeeName = employeeName.substring(lastIndex+1);
					lastIndex = employeeName.lastIndexOf("/");
					employeeName = employeeName.substring(lastIndex+1);
					//System.out.println("cell0 = " + cell0);
					LocalDate xlsDate1 = row.getCell(0).getDateCellValue().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
					data.addReportListEntry(new DataEntry(employeeName, cell1, xlsDate1, Double.parseDouble(cell2), data));
				}
				else {
					rowNo = Integer.MIN_VALUE;
					break;
				}
			}
		}
		catch(InvalidFormatException e) {
			System.out.println("InvalidFormatException! " + e.getMessage());
		}
		catch(IOException e) {
			System.out.println("IOException! " + e.getMessage());
		}
		catch(WrongXlsDataException e) {
			System.out.println("WrongXlsDataException! " + e.getMessage());
		}
		catch(WrongDataEntryValueException e) {
			System.out.println("WrongDataEntryValueException! " + e.getMessage());
		}
	}
	
	
	
	
	
	public default void readXls() throws EncryptedDocumentException, InvalidFormatException, IOException {
        String fileName = "Kowalski_Jan.xls";
		InputStream inp = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(inp);

        for (Sheet sheet : wb ) {
            for (Row row : sheet) {


                try {
                    String employeeName = fileName.substring(0, fileName.indexOf('.')).replace("_"," ");
                    String projectName = sheet.getSheetName();
                    LocalDate workdate = row.getCell(0).getDateCellValue().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    String zadanie = row.getCell(1).getStringCellValue();
                    double czas  = row.getCell(2).getNumericCellValue();
                    System.out.println("Pracownik: "+employeeName+  "\nNazwa projektu: "+ projectName + "\nData: "+workdate +"\nZadanie: "+zadanie + "\nCzas:" + czas+"\n\n");
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
