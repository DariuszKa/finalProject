package report;

import java.time.LocalDate;

public interface AddSampleData {
	
	public default void addSampleData(App data) {
		System.out.println("addSampleData() started");
		data.addReportListEntry(new DataEntry("Jeff Kowalski", "czytanie maili", LocalDate.parse("2005-11-12", App.getDF()), 4.0));
		data.addReportListEntry(new DataEntry("Jeff Kowalski", "meetingi", LocalDate.parse("2017-06-30", App.getDF()), 6.0));
		data.addReportListEntry(new DataEntry("Agata G¹sienica", "programowanie", LocalDate.now(), 1.5));
		data.addReportListEntry(new DataEntry("Andrzej Ma³ecki", "meetingi", LocalDate.parse("2017-06-30", App.getDF()), 3.0));
		data.addReportListEntry(new DataEntry("Abraham Lincoln", "zarz¹dzanie zasobami ludzkimi", LocalDate.parse("2017-07-02", App.getDF()), 11.0));
		data.addReportListEntry(new DataEntry("Agata G¹sienica", "czytanie maili", LocalDate.now(), 3.25));
		data.addReportListEntry(new DataEntry("Stan Tymiñski", "pisanie maili", LocalDate.parse("2016-10-03", App.getDF()), 5.5));
		data.addReportListEntry(new DataEntry("Janusz Zawodny", "czytanie maili", LocalDate.now(), 7.75));
		data.addReportListEntry(new DataEntry("Stan Tymiñski", "zarz¹dzanie zasobami ludzkimi", LocalDate.parse("2018-01-01", App.getDF()), 15.0));
		data.addReportListEntry(new DataEntry("Jan Kodziñski", "programowanie", LocalDate.parse("2017-07-01", App.getDF()), 2.5));
		data.addReportListEntry(new DataEntry("Janusz Zawodny", "zaliczenie", LocalDate.now(), 8.0));
		data.addReportListEntry(new DataEntry("Agata G¹sienica", "zarz¹dzanie zasobami ludzkimi", LocalDate.now(), 30));
		data.addReportListEntry(new DataEntry("Agata G¹sienica", "wprowadzanie metodologi Kanban", LocalDate.now(), 12));
		System.out.println("addSampleData() finished");
	}
}
