package report;

import java.util.Scanner;

public class RemoveAllData {
	
	public static void removeAllData() {
		
		if(getUserInput("Czy jeste� pewien/pewna? tak/nie ").contains("tak")) {
			if(!App.getReportList().isEmpty()) {
				if(getUserInput("Czy jeste� pewien/pewna �e jeste� pewien/pewna? tak/nie ").contains("tak")) {
					App.clearReportList();
				} 
				else {
					System.out.println("To dobrze �e nie jeste� pewien/pewna �e jeste� pewien/pewna");
				}
			}
			else {
				System.out.println("There is no data");
			}
		}
		else {
			System.out.println("Data removal - aborting");
		}
	}
	
	private static String getUserInput(String question) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(question);
		return scanner.next();
	}

}
