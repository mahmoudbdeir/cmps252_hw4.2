package cmps252.HW4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileParser {
	private static final String DELIMITER = ",";
	
	public static List<Customer> getCustomers(String file) throws FileNotFoundException {
		List<Customer> Customers = new ArrayList<Customer>();
		
		try (Scanner scanner = new Scanner(new File(file));) {
			int lineNumber = 0;
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (lineNumber++ == 0)
					continue;
				
				String[] fields = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)"); //split on the comma only if that comma has zero, or an even number of quotes ahead of it.
				if (fields == null) { //  || fields.length==0
					continue;
				}
				Customer s = new Customer(cleanString(fields[0]), cleanString(fields[1]), cleanString(fields[2]), cleanString(fields[3]), 
						cleanString(fields[4]), cleanString(fields[5]), cleanString(fields[6]), cleanString(fields[7]), 
						cleanString(fields[8]), cleanString(fields[9]), cleanString(fields[10]), cleanString(fields[11]));
				
				Customers.add(s);
			}
		}
		return Customers;
	}
	private static String cleanString(String s) {
		return s.substring(1, s.length()-1); 
	}
	
	public static void printCustomers(List <Customer> customers, int num) {
		
		int count = 1; 
		for (var c : customers) {
			System.out.println("#: " + count + " " + c.getFirstName() + " " + c.getLastName()); 
			count ++;
			if (count > num)
				break; 
		}
		
	}
	


}
