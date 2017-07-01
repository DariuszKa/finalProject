package report;

import java.util.Date;
import java.util.List;

public class ReportSimple {
	
	public static void createReport() {
		System.out.println("Creation of Simple report:");
		App.addReportListEntry(new DataEntry("Jan Nowak", "zaliczenie", new Date(), 8.0));
		List<DataEntry> reportList = App.getReportList();
		for (DataEntry dataEntry: reportList) {
			System.out.println(dataEntry.getId() + " employee=" + dataEntry.getEmployeeName() + " project=" + dataEntry.getProjectName() + " date=" + dataEntry.getWorkDay() + " hours=" + dataEntry.getWorkTime());
		}
	}

}
