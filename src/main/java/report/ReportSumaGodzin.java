package report;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReportSumaGodzin {
	
	@SuppressWarnings("resource")
	public void createReportSumaGodzin(App data) throws IOException {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Tworzenie raportu Suma Godzin...");
		System.out.println("Podaj imi� nazwisko pracownika: (* - wszyscy) ");
		String filterEmployeeName = sc.next().trim();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Podaj nazw� projektu: (* - wszystkie) ");
		String filterProject = sc2.next().trim();
		
		ArrayList<String> titleLine = new ArrayList<String>();
		titleLine.add("Miesi�c/Rok");
		titleLine.add("I/N Pracownika");
		titleLine.add("Projekt");
		titleLine.add("Suma h");
		titleLine.add("%");
		ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
		results.add(titleLine);
		
		List<DataEntry> filteredList = data.getFilteredList(filterEmployeeName, filterProject, data);
		
		for (DataEntry dataEntry: filteredList) {
			ArrayList<String> entryLine = new ArrayList<String>();
			entryLine.add(dataEntry.getWorkDay().toString());
			entryLine.add(dataEntry.getEmployeeName());
			entryLine.add(dataEntry.getProjectName());
			entryLine.add(dataEntry.getWorkTime() + "h");
			entryLine.add("");
			results.add(entryLine);
		}
		
		System.out.println("Zapis do pliku .csv - podaj nazw� pliku ze �cie�k�: ");
		String path = sc.next().trim();
		new CsvWrite().printCsv(results, path);
		
	}
	
}
