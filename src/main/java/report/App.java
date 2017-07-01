package report;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App implements ReportSimple, ReportIloscGodzin, ReportIleKosztuje, ReportJakiUdzial, ReportIlePracownikow, ReportSumaGodzin, RemoveAllData, AddSampleData, ReadDataFromFolder {
	
	private List<DataEntry> reportList = new ArrayList<DataEntry>();
	
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	String yourChoice = "";
    	
    	App data = new App();
    	
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
        	System.out.println("7. Add sample data");
        	System.out.println("8. Delete all data");
        	System.out.println("9. Koniec\n");
        	
        	yourChoice = scanner.next();
        	switch (yourChoice) {
        	case "0":
        		ReadDataFromFile.readData();
        		break;
        	case "1":
        		//ReadDataFromFolder.readData();
        		data.readDataFromFolder(data);
        		break;
        	case "2":
        		//ReportSimple.createReport();
        		data.createReportSimple(data);
        		break;
        	case "3a":
        		//ReportIlePracownikow.createReport();
        		data.createReportIlePracownikow(data);
        		break;
        	case "3b":
        		//ReportSumaGodzin.createReport();
        		data.createReportSumaGodzin(data);
        		break;
        	case "3c":
        		//ReportIleKosztuje.createReport();
        		data.createReportIleKosztuje(data);
        		break;
        	case "3d":
        		//ReportJakiUdzial.createReport();
        		data.createReportJakiUdzial(data);
        		break;
        	case "3e":
        		//ReportIloscGodzin.createReport();
        		data.createReportIloscGodzin(data);
        		break;
        	case "7":
        		//AddSampleData.addSampleData();
        		data.addSampleData(data);
        		break;
        	case "8":
        		//RemoveAllData.removeAllData();
        		data.removeAllData(data);
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
    
    
    public List<DataEntry> getReportList(){
		return reportList;
    }
    
    public void addReportListEntry(DataEntry dataEntry) {
    	reportList.add(dataEntry);
    }
    
    public void clearReportList(){
    	reportList.clear();
    }
    
    public static DateTimeFormatter getDF() {
    	return formatter;
    }
}
