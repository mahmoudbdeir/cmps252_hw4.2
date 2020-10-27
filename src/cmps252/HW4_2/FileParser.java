package cmps252.HW4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileParser {

	
	public static List<Customer> getCustomers(String fileName) throws FileNotFoundException  
	{
		List<Customer> l = new ArrayList<Customer>() ; 
		Scanner s = new Scanner( new File(fileName) ) ; 
		int c = 0 ; 
		while(s.hasNextLine())
		{
			String line = s.nextLine() ; 
			if(c++==0) continue ; 
			
			String[] fields = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
			//split on the comma only if that comma has zero, or an even number of quotes ahead of it
			
			if(fields==null) continue ; 
			Customer customer = new Customer(removeQuotes(fields[0]),removeQuotes(fields[1]),removeQuotes(fields[2]),removeQuotes(fields[3]),removeQuotes(fields[4]),removeQuotes(fields[5]),removeQuotes(fields[6]),removeQuotes(fields[7]),removeQuotes(fields[8]),removeQuotes(fields[9]),removeQuotes(fields[10]),removeQuotes(fields[11]));
			l.add(customer) ; 
		}
		return(l) ; 
	}
	
	private static String removeQuotes(String s)
	{
		return(s.substring(1, s.length()-1)) ; 
	}
}
