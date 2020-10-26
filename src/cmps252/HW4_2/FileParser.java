package cmps252.HW4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileParser {
	public static List<Customer> getCustomers(String file) throws FileNotFoundException{
		List<Customer> Customers = new ArrayList<Customer>();
		
		try (Scanner scanner = new Scanner(new File(file));){
			int counter = 0;
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (counter++ == 0) {
					continue;
				}
				String[] fields = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
				if (fields==null) {
					continue;
				}
				Customer c = new Customer(args(fields[0]), args(fields[1]), args(fields[2]), args(fields[3]), args(fields[4]), args(fields[5]), args(fields[6]), args(fields[7]), args(fields[8]), args(fields[9]), args(fields[10]), args(fields[11]));
				Customers.add(c);
			}
			
		}
		return Customers;
	}

	private static String args(String x) {
		return x.substring(1, x.length() - 1);
	}
}
