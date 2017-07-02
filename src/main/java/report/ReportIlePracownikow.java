package report;

import java.io.IOException;
import java.util.ArrayList;

public interface ReportIlePracownikow {
	
	public default void createReportIlePracownikow(App data) throws IOException {
		ArrayList<ArrayList<String>> lista;
		Report3B testReport = new Report3B(data.getReportList());
		testReport.prepareReport3B();
		lista = testReport.returnReport3B();
		testReport.printReport3B();
		String path = "test2.csv";
		CsvWrite.printCsv(lista, path);
	}

}
