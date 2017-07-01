package report;

import java.util.Date;

public class DataEntry {
	private long id;
	private String employeeName;
	private String projectName;
	private Date workDay;
	private double workTime;
	private static long entryNo = 0;
	
	public DataEntry(String employeeName, String projectName, Date workDay, double workTime) {
		this.id = entryNo++;
		this.employeeName = employeeName;
		this.projectName = projectName;
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
	
	public Date getWorkDay(){
		return workDay;
	}
	
	public void setWorkDay(Date workDay) {
		this.workDay = workDay;
	}
	
	public double getWorkTime(){
		return workTime;
	}
	
	public void setWorkTime(long workTime) {
		this.workTime = workTime;
	}
}
