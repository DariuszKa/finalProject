package report;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App implements ReportSimple, ReportIloscGodzin, ReportIleKosztuje, ReportJakiUdzial, ReportIlePracownikow, ReportSumaGodzin, RemoveAllData, AddSampleData, ReadDataFromFolder, ReadDataFromFile {
	
	private List<DataEntry> reportList = new ArrayList<DataEntry>();
	
	private List<String> employeeList = new ArrayList<String>();
	
	private List<String> projectList = new ArrayList<String>();
	
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	
    public static void main(String[] args) throws WrongDataEntryValueException, IOException {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	String yourChoice = "";
    	
    	App data = new App();
    	
        System.out.println("Witamy w systemie analizy czasu pracy!\n");
        do {
        	System.out.println("Wybierz opcjê:");
        	System.out.println("0. Wczytaj dane z pliku");
        	System.out.println("1. Wczytaj dane z katalogu");
        	System.out.println("2. Prosty wydruk danych");
        	System.out.println("3a. Raport - Suma godzin");
        	System.out.println("3b. Raport - Ile pracowników œrednio pracuje na dobê/miesi¹c/rok");
        	System.out.println("3c. Raport - Ile kosztuje projekt miesiêcznie");
        	System.out.println("3d. Raport - Jaki jest % udzia³u pracowników w projekcie");
        	System.out.println("3e. Raport - Iloœæ godzin spêdzonych przez pracownika w projekcie(dni tygodnia)");
        	System.out.println("7. Add sample data");
        	System.out.println("8. Delete all data");
        	System.out.println("9. Koniec\n");
        	
        	yourChoice = scanner.next();
        	switch (yourChoice) {
        	case "0":
        		data.readDataFromFile(data);
        		break;
        	case "1":
        		data.readDataFromFolder(data);
        		break;
        	case "2":
        		data.createReportSimple(data);
        		break;
        	case "3a":
        		data.createReportSumaGodzin(data);
        		break;
        	case "3b":
        		data.createReportIlePracownikow(data);
        		break;
        	case "3c":
        		data.createReportIleKosztuje(data);
        		break;
        	case "3d":
        		data.createReportJakiUdzial(data);
        		break;
        	case "3e":
        		data.createReportIloscGodzin(data);
        		break;
        	case "7":
        		data.addSampleData(data);
        		break;
        	case "8":
        		data.removeAllData(data);
        		break;
        	case "9":
        		System.out.println("Do widzenia...");
        		break;
    		default:
    			System.out.println("B³êdny wybór, spróbuj ponownie...\n");
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
    
    
    public List<String> getEmployeeList(){
		return employeeList;
    }
    
    public void addEmployee(String employee) {
    	employeeList.add(employee);
    }
    
    public void clearEmployeeList(){
    	employeeList.clear();
    }
    
    
    public List<String> getProjectList(){
		return projectList;
    }
    
    public void addProject(String project) {
    	employeeList.add(project);
    }
    
    public void clearProjectList(){
    	projectList.clear();
    }
    
    
    public static DateTimeFormatter getDF() {
    	return formatter;
    }
}
