package report;

import java.io.IOException;
import java.util.ArrayList;

public class ReportIlePracownikow {
	
	public void createReportIlePracownikow(App data) throws IOException {
		ArrayList<ArrayList<String>> lista;
		Report3B testReport = new Report3B(data.getReportList());
		testReport.prepareReport3B();
		lista = testReport.returnReport3B();
		testReport.printReport3B();
		String path = "test2.csv";
		String pathHtml = "test2.html";
		CsvWrite csWrite = new CsvWrite();
		csWrite.printCsv(lista, path);
		HtmlWrite.printHtml(lista, pathHtml);
	}

}
