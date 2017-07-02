package report;

import java.util.Scanner;

public class RemoveAllData {
	
	public void removeAllData(App data) {
		
		if(getUserInput("Czy jeste� pewien/pewna? tak/nie ").contains("tak")) {
			if(!data.getReportList().isEmpty()) {
				if(getUserInput("Czy jeste� pewien/pewna �e jeste� pewien/pewna? tak/nie ").contains("tak")) {
					data.clearReportList();
					data.clearEmployeeList();
					data.clearProjectList();
				} 
				else {
					System.out.println("To dobrze �e nie jeste� pewien/pewna �e jeste� pewien/pewna");
				}
			}
			else {
				System.out.println("Nie by�o danych");
			}
		}
		else {
			System.out.println("Anulowano usuwanie danych");
		}
	}
	
	@SuppressWarnings("resource")
	String getUserInput(String question) {
		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		String answer = sc.next();
		return answer;
	}

}
