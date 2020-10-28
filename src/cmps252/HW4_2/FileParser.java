package cmps252.HW4_2;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileParser {
	public static List<Customer>getCustomer(String file ) throws FileNotFoundException{
		List<Customer> customer = new ArrayList<Customer>();
		
		try (Scanner scanner = new Scanner(new File(file));){
			int lineCount = 0;
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if(lineCount++==0) continue;
				String[] fields = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
				if (fields == null) {
					continue;
				}
				Customer s = new Customer(clean(fields[0]),clean(fields[1]),clean(fields[2]),clean(fields[3]),clean(fields[4]),clean(fields[5]), line, line, line, line, line, line);
				customer.add(s);
				}
			}
			return customer;
		
		}
		private static String clean(String s ) {
			int l = 0;
			return s.substring(l, s.length()-1);
	}

}