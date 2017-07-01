package report;

import java.util.Scanner;

public interface RemoveAllData {
	
	public default void removeAllData(App data) {
		
		if(getUserInput("Czy jesteœ pewien/pewna? tak/nie ").contains("tak")) {
			if(!data.getReportList().isEmpty()) {
				if(getUserInput("Czy jesteœ pewien/pewna ¿e jesteœ pewien/pewna? tak/nie ").contains("tak")) {
					data.clearReportList();
				} 
				else {
					System.out.println("To dobrze ¿e nie jesteœ pewien/pewna ¿e jesteœ pewien/pewna");
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
	
	@SuppressWarnings("resource")
	default String getUserInput(String question) {
		Scanner sc = new Scanner(System.in);
		System.out.println(question);
		String answer = sc.next();
		//sc.close();
		return answer;
	}

}
