package report;

import java.time.LocalDate;

public class DataEntry {
	private long id;
	private String employeeName;
	private String projectName;
	private LocalDate workDay;
	private double workTime;
	private static long entryNo = 0;
	
	public DataEntry(String employeeName, String projectName, LocalDate workDay, double workTime) throws WrongDataEntryValueException {
		this.id = entryNo++;
		if(employeeName.trim().length()<3) throw new WrongDataEntryValueException("Za krótka nazwa pracownika!");
		this.employeeName = employeeName.trim();
		if(employeeName.trim().length()<3) throw new WrongDataEntryValueException("Za krótka nazwa projektu!");
		this.projectName = projectName.trim();
		if(workDay.isAfter(LocalDate.now())) throw new WrongDataEntryValueException("Nie mo¿na raportowaæ pracy której jeszcze nie wykonano!");
		if(workDay.isBefore(LocalDate.now().minusYears(10))) throw new WrongDataEntryValueException("Nie mo¿na raportowaæ pracy o której nikt nie pamiêta!");
		this.workDay = workDay;
		if(workTime<=0.0) throw new WrongDataEntryValueException("Czas pracy musi byæ wiêkszy od zera!");
		if(workTime>24.0) throw new WrongDataEntryValueException("Nie mo¿na pracowaæ wiêcej ni¿ 24h na dobê!");
		this.workTime = workTime;
	}
	
	public long getId(){
		return id;
	}
	
	public String getEmployeeName(){
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getProjectName(){
		return projectName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public LocalDate getWorkDay(){
		return workDay;
	}
	
	public void setWorkDay(LocalDate workDay) {
		this.workDay = workDay;
	}
	
	public double getWorkTime(){
		return workTime;
	}
	
	public void setWorkTime(long workTime) {
		this.workTime = workTime;
	}
}
