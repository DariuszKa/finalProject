package report;

import java.time.LocalDate;

public class DataEntry {
	private long id;
	private String employeeName;
	private String projectName;
	private LocalDate workDay;
	private double workTime;
	private static long entryNo = 0;
	
	public DataEntry(String employeeName, String projectName, LocalDate workDay, double workTime) {
		this.id = entryNo++;
		this.employeeName = employeeName.trim();
		this.projectName = projectName.trim();
		this.workDay = workDay;
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
