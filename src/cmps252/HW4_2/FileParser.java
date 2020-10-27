package cmps252.HW4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileParser {
	private String name;

	public FileParser(String file_name) {
		name = file_name;
	}

	public static List<Customer> getCustomers(String file) throws FileNotFoundException {
		List<Customer> Customers = new ArrayList<Customer>();

		try (Scanner scan = new Scanner(new File(file));) {
			int lineCount = 0;
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				if (lineCount++ == 0)
					continue;

				String[] fields = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
				if (fields == null) {
					continue;
				}
				Customer s = new Customer(clean(fields[0]), clean(fields[1]), clean(fields[02]), clean(fields[3]),
						clean(fields[4]), clean(fields[5]), clean(fields[6]), clean(fields[7]), clean(fields[8]),
						clean(fields[9]), clean(fields[10]), clean(fields[11]));
				Customers.add(s);
			}
		}
		return Customers;
	}

	private static String clean(String s) {
		return s.substring(1, s.length() - 1);
	}
}
