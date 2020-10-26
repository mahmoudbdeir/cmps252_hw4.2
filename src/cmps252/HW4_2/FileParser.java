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
				if (fields==null) continue;
				Customer s = new Customer(sub_String(fields[0]), sub_String(fields[1]),sub_String(fields[2]),sub_String(fields[3]),sub_String(fields[4]),sub_String(fields[5]), sub_String(fields[6]), sub_String(fields[7]), sub_String(fields[8]), sub_String(fields[9]), sub_String(fields[10]), sub_String(fields[11]));
				Customers.add(s);
			}
		}
		return Customers;
	}
	private static String sub_String(String s) {
		return s.substring(1,s.length()-1);
	}
}