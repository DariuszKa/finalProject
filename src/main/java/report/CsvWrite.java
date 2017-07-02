package report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvWrite {
	
	
	
	public static void printCsv(ArrayList<ArrayList<String>> lista, String path) throws IOException {
//	ArrayList<ArrayList<String>> lista = new ArrayList<>();
//	ArrayList<String> elementListy = new ArrayList<String>();
//	elementListy.add("Maj");
//	elementListy.add("Jan Kowalski");
//	elementListy.add("200");
//	lista.add(elementListy);
//	lista.add(elementListy);

		String text = "Hello world";
        BufferedWriter output = null;
        FileWriter writer = null;
        try {
        	 File file =new File(path);
             file.createNewFile();
             System.out.println("File is created");
             writer = new FileWriter(file);
             
            for (ArrayList<String> li : lista) {
            	 writer.write(String.join(", ", li)+"\n"); 
            	 
			}
            
     
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
          if ( writer != null ) {
        	  writer.flush();
            writer.close();
          }
        }
	}

}
