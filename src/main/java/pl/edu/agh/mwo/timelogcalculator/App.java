package pl.edu.agh.mwo.timelogcalculator;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	List<DataEntry> reportList = new ArrayList<DataEntry>();
	
    public static void main(String[] args) {
        System.out.println("Witamy w systemie analizy czasu pracy!");
        do {
        	System.out.println("Wybierz opcjê:");
        	System.out.println("0. Wczytaj dane z pliku");
        	System.out.println("1. Wczytaj dane z katalogu");
        	System.out.println("2. Prosty wydruk danych");
        	System.out.println("3a. Raport - Ile pracowników œrednio pracuje na dobê/miesi¹c/rok");
        	System.out.println("3b. Raport - Suma godzin");
        	System.out.println("3c. Raport - Ile kosztuje projekt miesiêcznie");
        	System.out.println("3d. Raport - Jaki jest % udzia³u pracowników w projekcie");
        	System.out.println("3e. Raport - Iloœæ godzin spêdzonych przez pracownika w projekcie(dni tygodnia)");
        	System.out.println("9. Koniec");
        	String yourChoice = "";
        	//Scanner scanner = new Scanner(System.in)
        	//Switch case {
        	//
        	//}
        	
        } while(true);
    }
}
