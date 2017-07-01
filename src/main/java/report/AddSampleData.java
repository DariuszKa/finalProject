package report;

import java.time.LocalDate;

public class AddSampleData {
	
	public static void addSampleData() {
		System.out.println("addSampleData() started");
		App.addReportListEntry(new DataEntry("Jeff Kowalski", "czytanie maili", LocalDate.parse("2005-11-12", App.getDF()), 4.0));
		App.addReportListEntry(new DataEntry("Jeff Kowalski", "meetingi", LocalDate.parse("2017-06-30", App.getDF()), 6.0));
		App.addReportListEntry(new DataEntry("Agata G�sienica", "programowanie", LocalDate.now(), 1.5));
		App.addReportListEntry(new DataEntry("Andrzej Ma�ecki", "meetingi", LocalDate.parse("2017-06-30", App.getDF()), 3.0));
		App.addReportListEntry(new DataEntry("Abraham Lincoln", "zarz�dzanie zasobami ludzkimi", LocalDate.parse("2017-07-02", App.getDF()), 11.0));
		App.addReportListEntry(new DataEntry("Agata G�sienica", "czytanie maili", LocalDate.now(), 3.25));
		App.addReportListEntry(new DataEntry("Stan Tymi�ski", "pisanie maili", LocalDate.parse("2016-10-03", App.getDF()), 5.5));
		App.addReportListEntry(new DataEntry("Janusz Zawodny", "czytanie maili", LocalDate.now(), 7.75));
		App.addReportListEntry(new DataEntry("Stan Tymi�ski", "zarz�dzanie zasobami ludzkimi", LocalDate.parse("2018-01-01", App.getDF()), 15.0));
		App.addReportListEntry(new DataEntry("Jan Kodzi�ski", "programowanie", LocalDate.parse("2017-07-01", App.getDF()), 2.5));
		App.addReportListEntry(new DataEntry("Janusz Zawodny", "zaliczenie", LocalDate.now(), 8.0));
		App.addReportListEntry(new DataEntry("Agata G�sienica", "zarz�dzanie zasobami ludzkimi", LocalDate.now(), 30));
		App.addReportListEntry(new DataEntry("Agata G�sienica", "wprowadzanie metodologi Kanban", LocalDate.now(), 12));
		System.out.println("addSampleData() finished");
	}
}
