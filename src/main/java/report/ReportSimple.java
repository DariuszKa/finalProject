package report;

import java.util.List;

public interface ReportSimple {
	
	public default void createReportSimple(App data) {
		System.out.println("Rozpoczêto tworzenie prostego wydruku danych...");
		List<DataEntry> reportList = data.getReportList();
		long noRecords = 0;
		for (DataEntry dataEntry: reportList) {
			System.out.println(dataEntry.getId() + "\tdate='" + dataEntry.getWorkDay().toString() + "'\thours=" + dataEntry.getWorkTime() + "\temployee='" + dataEntry.getEmployeeName() + "'\tproject='" + dataEntry.getProjectName() + "'");
			noRecords++;
		}
		System.out.println("Znaleziono " + noRecords + " rekordów. Wydruk danych skoñczony.");
	}

}
