package report;

import java.util.List;

public interface ReportSimple {
	
	public default void createReportSimple(App data) {
		System.out.println("Simple report started:");
		List<DataEntry> reportList = data.getReportList();
		for (DataEntry dataEntry: reportList) {
			System.out.println(dataEntry.getId() + "\tdate='" + dataEntry.getWorkDay().toString() + "'\thours=" + dataEntry.getWorkTime() + "\temployee='" + dataEntry.getEmployeeName() + "'\tproject='" + dataEntry.getProjectName() + "'");
		}
		System.out.println("Simple report finished.");
	}

}
