package report;

import java.util.List;

public interface ReportSumaGodzin {
	
	public default void createReportSumaGodzin(App data) {
		System.out.println("Tworzenie raportu Suma Godzin:");
		
		double sumHours = 0.0;
		long noRecords = 0;
		List<DataEntry> reportList = data.getReportList();
		for (DataEntry dataEntry: reportList) {
			sumHours += dataEntry.getWorkTime();
			noRecords++;
		}
		
		System.out.println("Znaleziono " + noRecords + " rekordów. Suma godzin wynosi " + sumHours + " h");
	}
	
	default void calculateSumHours(App data) {


	}
}
