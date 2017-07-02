package report;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReportSumaGodzin {
	
	@SuppressWarnings("resource")
	public void createReportSumaGodzin(App data) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Tworzenie raportu Suma Godzin...");
		System.out.println("Podaj imiê nazwisko pracownika: (* - wszyscy) ");
		String filterEmployeeName = sc.next().trim();
		
		System.out.println("Podaj nazwê projektu: (* - wszystkie) ");
		String filterProject = sc.next().trim();
		
		ArrayList<String> titleLine = new ArrayList<String>();
		titleLine.add("Miesi¹c/Rok");
		titleLine.add("I/N Pracownika");
		titleLine.add("Projekt");
		titleLine.add("Suma h");
		titleLine.add("%");
		ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
		results.add(titleLine);
		
		List<DataEntry> reportList = data.getFilteredList(filterEmployeeName, filterProject);
		
		for (DataEntry dataEntry: reportList) {
			ArrayList<String> entryLine = new ArrayList<String>();
			entryLine.add(dataEntry.getWorkDay().toString());
			entryLine.add(dataEntry.getEmployeeName());
			entryLine.add(dataEntry.getProjectName());
			entryLine.add(dataEntry.getWorkTime() + "h");
			entryLine.add("");
			results.add(entryLine);
		}
		
		System.out.println("Zapis do pliku .csv - podaj nazwê pliku ze œcie¿k¹: ");
		String path = sc.next().trim();
		try {
			new CsvWrite().printCsv(results, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
