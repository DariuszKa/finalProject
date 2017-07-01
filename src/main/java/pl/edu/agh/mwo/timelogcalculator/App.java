package pl.edu.agh.mwo.timelogcalculator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import report.DataEntry;
import report.ReadDataFromFile;

public class App {
	
	List<DataEntry> reportList = new ArrayList<DataEntry>();
	
    public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
        System.out.println("Witamy w systemie analizy czasu pracy!");
        ReadDataFromFile rd = new ReadDataFromFile();
        rd.readXls();
        do {
        	System.out.println("Wybierz opcj�:");
        	System.out.println("0. Wczytaj dane z pliku");
        	System.out.println("1. Wczytaj dane z katalogu");
        	System.out.println("2. Prosty wydruk danych");
        	System.out.println("3a. Raport - Ile pracownik�w �rednio pracuje na dob�/miesi�c/rok");
        	System.out.println("3b. Raport - Suma godzin");
        	System.out.println("3c. Raport - Ile kosztuje projekt miesi�cznie");
        	System.out.println("3d. Raport - Jaki jest % udzia�u pracownik�w w projekcie");
        	System.out.println("3e. Raport - Ilo�� godzin sp�dzonych przez pracownika w projekcie(dni tygodnia)");
        	System.out.println("9. Koniec");
        	String yourChoice = "";
        	//Scanner scanner = new Scanner(System.in)
        	//Switch case {
        	//
        	//}
        	
        } while(true);
    }
}
