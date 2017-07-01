package report;

import java.util.Date;

public class DataEntry {
	private int id;
	private String employeeName;
	private String projectName;
	private Date workDay;
	private long workTime;
	
	public int getId(){
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
	
	public long getWorkTime(){
		return workTime;
	}
	
	public void setWorkTime(long workTime) {
		this.workTime = workTime;
	}
}
