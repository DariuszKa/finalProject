package report;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public interface ReadDataFromFolder {
	
	@SuppressWarnings("resource")
	public default void readDataFromFolder(App data) throws IOException {
		boolean recursive = false;
		boolean others = false;
		System.out.println("Czytanie danych z katalogu...");
		System.out.println("Podaj nazwê katalogu: ");
		Scanner sc = new Scanner(System.in);
		String dirPathname = sc.next();
		if(!dirPathname.endsWith("\\") &&  !dirPathname.endsWith("/")) dirPathname += "/";
		File directory = new File(dirPathname);

		if(!directory.isDirectory()){
			System.out.println("B³¹d - '" + dirPathname + "' to nie jest katalog!");
		}
		else {
			System.out.println("OK - '" + dirPathname + "' jest katalogiem");
			System.out.println("Czy przeszukiwaæ równie¿ podkatalogi? tak/nie");
			String searchRecursive = sc.next();
			if(searchRecursive.contains("tak")) recursive = true;
			System.out.println("Czy podawaæ informacje o plikach innego typu? tak/nie");
			String informAboutOthers = sc.next();
			if(informAboutOthers.contains("tak")) others = true;
			printContentOfFilesInDirectory(directory, recursive, others, data);
		}
	}

	static void printContentOfFilesInDirectory(File directory, boolean recursive, boolean others, App data) throws IOException {
		File[] files = directory.listFiles();
		String filePath = "";		
		
		try {
			for (File file : files) {
				filePath = file.getPath();
				if(file.isFile()){
					if(filePath.endsWith(".xls")) {
						System.out.println("Plik '" + filePath + "' - poprawny typ pliku");
						data.readDataFromFile(data, filePath);
					}
					else if(others) {
						System.out.println("Plik '" + filePath + "' - inny plik");
					}
				} 
				else if(file.isDirectory() && recursive){
					printContentOfFilesInDirectory(file, recursive, others, data);
				}
			}
		}
		catch(NullPointerException e) {
			System.out.println("Koniec pliku '" + filePath + "'");
		}
				
	}
}
