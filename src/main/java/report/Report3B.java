package report;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Report3B {
	HashMap<String, HashMap<String, Double>> reportData;
	List<DataEntry> reportListLocal;

	// konstruktor
	Report3B(List<DataEntry> reportList) {
		reportListLocal = reportList;
		reportData = new HashMap<String, HashMap<String, Double>>();
	}

	public void prepareReport3B() {
		int listLength = reportListLocal.size();
		for(int a=0;a<listLength;a++) {
			String nameTemp = reportListLocal.get(a).getEmployeeName();
			String dateTemp = reportListLocal.get(a).getWorkDay().toString();
			Double hours = reportListLocal.get(a).getWorkTime();
			addNewWorkDateHours(nameTemp, dateTemp, hours);
		}
	}


	private void addNewWorkDateHours(String employeeName, String date, double hours) {
		String monthDate = date.substring(0, 7);
		if (reportData.containsKey(employeeName)) {
			
			HashMap<String, Double> workDateTemp = reportData.get(employeeName);
			if(workDateTemp.containsKey(monthDate)) {
				Double tempHours = workDateTemp.get(monthDate);
				tempHours += hours;
				workDateTemp.put(monthDate, tempHours);
			}
			else {
				workDateTemp.put(monthDate, hours);	
			}
			reportData.put(employeeName, workDateTemp);
			

		}
		else {
			HashMap<String, Double> workDateTemp = new HashMap<String, Double>();
			workDateTemp.put(monthDate, hours);
			reportData.put(employeeName, workDateTemp);
		}
	}

	public ArrayList<ArrayList<String>> returnReport3B() {
		ArrayList<ArrayList<String>> lista = new ArrayList<>();
		ArrayList<String> elementListyTemp = new ArrayList<String>();
		elementListyTemp.add("Data");
		elementListyTemp.add("Imie Nazwisko");
		elementListyTemp.add("Ilosc godzin");
		lista.add(elementListyTemp);
		for(Map.Entry<String, HashMap<String, Double>>entryEmployee : reportData.entrySet()) {
			String name = entryEmployee.getKey();
			HashMap<String, Double> valueHaspMap = entryEmployee.getValue();
			for (Map.Entry<String, Double> entryWorkDay : valueHaspMap.entrySet()) {
				ArrayList<String> elementListy = new ArrayList<String>();
				elementListy.add(entryWorkDay.getKey());
				elementListy.add(name);
				double wynik = entryWorkDay.getValue()/20;
				elementListy.add(String.valueOf(wynik));
				lista.add(elementListy);		
			}
		}
		return lista;
	}
	
	public void printReport3B() {
		for(Map.Entry<String, HashMap<String, Double>>entryEmployee : reportData.entrySet()) {
			String name = entryEmployee.getKey();
			HashMap<String, Double> valueHaspMap = entryEmployee.getValue();
			for (Map.Entry<String, Double> entryWorkDay : valueHaspMap.entrySet()) {
				double wynik = entryWorkDay.getValue()/20;
				System.out.println(entryWorkDay.getKey()+", "+name+", "+wynik);
			}
		}
		
	}
	
	
	
	
	

	
	
	
}
