package cmps252.HW4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileParser {
	
	private String FileName ;
	
	public FileParser(String fileName) {
		FileName = fileName ;
	}
	
	public static List<Customer> getCustomers(String fileName) throws FileNotFoundException {
		
		List<Customer> customers = new ArrayList<Customer>() ;
		Scanner filereader = new Scanner(new File(fileName)) ;
		//int index = 0 ;
		filereader.nextLine() ;
		
		while(filereader.hasNextLine()) {
			String line = filereader.nextLine() ;
			String[] fields =  line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
			
			for(int i = 0 ; i < fields.length ; i++) {
				fields[i] = fields[i].substring(1, fields[i].length() - 1) ;
			}
			customers.add(new Customer(fields[0], fields[1], fields[2], fields[3],
										    fields[4], fields [5], fields[6], fields[7],
										    fields[8], fields[9], fields[10], fields[11])) ;	
			//index++ ;
		}
		return customers;
	}
}