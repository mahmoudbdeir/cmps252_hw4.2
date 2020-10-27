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
				if (lineNumber++ == 0)
					continue;

				String[] fields = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
				//System.out.print(Arrays.toString(fields));
				if (fields == null ) {
					continue;
				}

				Customer s = new Customer(rmv(fields[0]), rmv(fields[1]), rmv(fields[2]), rmv(fields[3]), rmv(fields[4]),
						rmv(fields[5]), rmv(fields[6]), rmv(fields[7]), rmv(fields[8]), rmv(fields[9]),
						rmv(fields[10]), rmv(fields[11]));
				Customers.add(s);
			}
		}
		return Customers;
	}
	
	private static String rmv(String s) {
		return s.substring(1,s.length()-1);
	}

}



