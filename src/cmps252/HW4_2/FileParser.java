package cmps252.HW4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileParser {

	public static List<Customer> getCustomers(String file) throws FileNotFoundException {
		List<Customer> customers = new ArrayList<Customer>();

		try (Scanner scanner = new Scanner(new File(file));) {
			int LineCount = 0;
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				if (LineCount++ == 0)
					continue;

				String[] fields = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
				if (fields == null) {
					continue;
				}

				Customer c = new Customer(clean(fields[0]), clean(fields[1]), clean(fields[2]), clean(fields[3]),
						clean(fields[4]), clean(fields[5]), clean(fields[6]), clean(fields[7]), clean(fields[8]),
						clean(fields[9]), clean(fields[10]), clean(fields[11]));
				customers.add(c);
			}
		}
		return customers;
	}

	private static String clean(String f) {
		return f.substring(1, f.length() - 1);
	}
}
