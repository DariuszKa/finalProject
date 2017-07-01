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
		if(employeeName.trim().length()<3) throw new WrongDataEntryValueException("Za kr�tka nazwa pracownika!");
		this.employeeName = employeeName.trim();
		if(employeeName.trim().length()<3) throw new WrongDataEntryValueException("Za kr�tka nazwa projektu!");
		this.projectName = projectName.trim();
		if(workDay.isAfter(LocalDate.now())) throw new WrongDataEntryValueException("Nie mo�na raportowa� pracy kt�rej jeszcze nie wykonano!");
		if(workDay.isBefore(LocalDate.now().minusYears(10))) throw new WrongDataEntryValueException("Nie mo�na raportowa� pracy o kt�rej nikt nie pami�ta!");
		this.workDay = workDay;
		if(workTime<=0.0) throw new WrongDataEntryValueException("Czas pracy musi by� wi�kszy od zera!");
		if(workTime>24.0) throw new WrongDataEntryValueException("Nie mo�na pracowa� wi�cej ni� 24h na dob�!");
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
