package cmps252.HW4_2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import cmps252.HW4_2.UnitTesting.Configuration;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileParser fp = new FileParser("5000.csv");
		ArrayList<Customer> c = FileParser.getCustomers(Configuration.CSV_File);
		System.out.println(c.get(4999).getFirstName());
	}
}
