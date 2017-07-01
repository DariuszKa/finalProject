package report;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReportSimple {
	
	public static void createReport() {
		System.out.println("Simple report started:");
		List<DataEntry> reportList = App.getReportList();
		for (DataEntry dataEntry: reportList) {
			System.out.println(dataEntry.getId() + "\tdate='" + dateToStr(dataEntry.getWorkDay()) + "'\thours=" + dataEntry.getWorkTime() + "\temployee='" + dataEntry.getEmployeeName() + "'\tproject='" + dataEntry.getProjectName() + "'");
		}
		System.out.println("Simple report finished.");
	}
	
	public static String dateToStr(LocalDate date) {
		//DateTimeFormatter dateTimeFormatter = new DateTimeFormatter(null, null, null, null, null, null, null);
		return date.toString();
	}

}
