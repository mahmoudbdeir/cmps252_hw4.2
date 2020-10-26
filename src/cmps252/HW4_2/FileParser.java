package cmps252.HW4_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileParser {
	private String fname;
	
	public FileParser(String fname) {
		this.fname = fname;
	}
	
	public static ArrayList<Customer> getCustomers(String fname) throws FileNotFoundException {
		ArrayList<Customer> customers = new ArrayList<>();
		BufferedReader buffReader;
		buffReader = new BufferedReader(new FileReader(fname));
		String line;
		try {
			buffReader.readLine(); // Skip first line, they are column headings
			while((line = buffReader.readLine()) != null) {
				customers.add(parseCustomer(line));
			}
			buffReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return customers;
	}
	
	private static Customer parseCustomer(String line) {
		List<String> fields = new ArrayList<>();
		for(String field: line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)")) {
			field = field.substring(1, field.length()-1); // Strip leading and trailing double quote
			fields.add(field);
		}
		
		String firstName = fields.get(0);
		String lastName = fields.get(1);
		String company = fields.get(2);
		String address = fields.get(3);
		String city = fields.get(4);
		String county = fields.get(5);
		String state = fields.get(6);
		String zip = fields.get(7);
		String phone = fields.get(8);
		String fax = fields.get(9);
		String email = fields.get(10);
		String web = fields.get(11);
		
		Customer customer = new Customer(firstName, lastName, company, address, city, county, state, zip, phone, fax, email, web);
		return customer;
	}
}