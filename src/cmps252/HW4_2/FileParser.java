package cmps252.HW4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileParser {
	public static ArrayList<Customer> getCustomers(String fileName) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		Scanner scanner;
		try {
			scanner = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			return customers;
		}
		
		int lineNumber = 0;
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			if (lineNumber++ == 0) continue;
			
			String[] fields = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
			if (fields == null) continue;
			
			Customer c = new Customer(clean(fields[0]), clean(fields[1]), clean(fields[2]), clean(fields[3]), clean(fields[4]), clean(fields[5]), clean(fields[6]),
					clean(fields[7]), clean(fields[8]), clean(fields[9]), clean(fields[10]), clean(fields[11]));
			
			customers.add(c);
		}
		
		return customers;
	}
	
	private static String clean(String s) {
		return s.substring(1, s.length() - 1);
	}
}