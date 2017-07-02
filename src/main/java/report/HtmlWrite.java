package report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HtmlWrite {
	
	
	
	public static void printHtml(ArrayList<ArrayList<String>> lista, String path) throws IOException {

		
        BufferedWriter output = null;
        FileWriter writer = null;
        try {
        	 File file =new File(path);
             file.createNewFile();
             System.out.println("File is created");
             writer = new FileWriter(file);
             writer.write("<!doctype html>"
             		+ "<html lang=\"en\">\r\n" + 
             		"<head>\r\n" + 
             		"  <meta charset=\"utf-8\">\r\n" + 
             		"\r\n" + 
             		"  <title>Raport</title>\r\n" +            		
             		
             		
             		
             		"</head>\r\n" + 
             		"\r\n" + 
             		"<body>\r\n"  +
             		"<table  border=\"1\">"
             		);

             
             
             
             
             
            for (ArrayList<String> li : lista) {
            	writer.write("<tr>");
            	// writer.write(String.join(", ", li)+"\n");
            	for (String el : li) {
            		writer.write("<td>" +el+ "</td>");
            	}
            	
            	 writer.write("</tr>\n");
			}
            
            writer.write( "</table>" +          		
            		"</body>\r\n" + 
            		"</html>");

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
