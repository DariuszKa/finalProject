package report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvWrite {
	
	
	
	public static void main(String[] args) throws IOException {
	ArrayList<ArrayList<String>> lista = new ArrayList<>();

		String text = "Hello world";
        BufferedWriter output = null;
        try {
            File file = new File("example.txt");
            output = new BufferedWriter(new FileWriter(file));
            
            for (String string : lista) {
				
			}
            
            output.write(text);
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
          if ( output != null ) {
            output.close();
          }
        }
	}

}
