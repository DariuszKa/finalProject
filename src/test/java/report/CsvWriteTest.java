package report;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

public class CsvWriteTest {
	public static ArrayList<ArrayList<String>> lista;
	String path = "test2.csv";
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		lista = new ArrayList<>();
		ArrayList<String> elementListy = new ArrayList<String>();
		elementListy.add("Maj");
		elementListy.add("Jan Kowalski");
		elementListy.add("200");
		lista.add(elementListy);
		lista.add(elementListy);
		
	}

	@Test
	public void test() throws IOException {
		//CsvWrite.printCsv(lista, path);
	}

}
