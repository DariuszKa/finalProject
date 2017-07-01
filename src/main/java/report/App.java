package report;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
	
	private static List<DataEntry> reportList = new ArrayList<DataEntry>();
	
	static String yourChoice = "";
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
        System.out.println("Witamy w systemie analizy czasu pracy!\n");
        do {
        	System.out.println("Wybierz opcjê:");
        	System.out.println("0. Wczytaj dane z pliku");
        	System.out.println("1. Wczytaj dane z katalogu");
        	System.out.println("2. Prosty wydruk danych");
        	System.out.println("3a. Raport - Ile pracowników œrednio pracuje na dobê/miesi¹c/rok");
        	System.out.println("3b. Raport - Suma godzin");
        	System.out.println("3c. Raport - Ile kosztuje projekt miesiêcznie");
        	System.out.println("3d. Raport - Jaki jest % udzia³u pracowników w projekcie");
        	System.out.println("3e. Raport - Iloœæ godzin spêdzonych przez pracownika w projekcie(dni tygodnia)");
        	System.out.println("9. Koniec\n");
        	yourChoice = scanner.next();
        	switch (yourChoice) {
        	case "0":
        		ReadDataFromFile.readData();
        		break;
        	case "1":
        		ReadDataFromFolder.readData();
        		break;
        	case "2":
        		ReportSimple.createReport();
        		break;
        	case "3a":
        		ReportIlePracownikow.createReport();
        		break;
        	case "3b":
        		ReportSumaGodzin.createReport();
        		break;
        	case "3c":
        		ReportIleKosztuje.createReport();
        		break;
        	case "3d":
        		ReportJakiUdzial.createReport();
        		break;
        	case "3e":
        		ReportIloscGodzin.createReport();
        		break;
        	case "9":
        		System.out.println("Good bye...");
        		break;
    		default:
    			System.out.println("Z³y wybór, spróbuj ponownie...\n");
    			break;
        	}
        	System.out.println();
        	
        } while(!yourChoice.equals("9"));
        
        scanner.close();
    }
    
    public static List<DataEntry> getReportList(){
		return reportList;
    }
    
    public void addReportListEntry(DataEntry dataEntry) {
    	reportList.add(dataEntry);
    }
}
