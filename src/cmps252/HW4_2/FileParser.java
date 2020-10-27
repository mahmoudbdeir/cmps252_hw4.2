package cmps252.HW4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileParser {
	
	public static List<Customer> getCustomers(String file) throws FileNotFoundException {
			List<Customer> Customers = new ArrayList<Customer>();
			
			try (Scanner scanner = new Scanner(new File(file));) {
				int lineNumber = 0;
				while (scanner.hasNextLine()) {
					String line = scanner.nextLine();
					if (lineNumber++ == 0) continue;
					
					String[] fields = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");					

					if (fields == null) {
						continue;
					}
					
					Customer s = new Customer(Clean(fields[0]), Clean(fields[1]), Clean(fields[2]), Clean(fields[3]), Clean(fields[4]), Clean(fields[5]),Clean(fields[6]),Clean(fields[7]), Clean(fields[8]), Clean(fields[9]), Clean(fields[10]), Clean(fields[11]));
					Customers.add(s);
				}
			}
			return Customers;
		}
		private static String Clean(String s) {
			return s.substring(1,s.length()-1);
		}
	
	
}
