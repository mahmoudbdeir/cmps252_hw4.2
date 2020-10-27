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
            int Count = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(Count++ == 0) continue;
                
                String[] fields  = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                if( fields == null ) {
                    continue ;
                }
                
                Customer s = new Customer(fieldName(fields[0]),fieldName(fields[1])
                        ,fieldName(fields[2]),fieldName(fields[3]),fieldName(fields[4])
                        ,fieldName(fields[5]),fieldName(fields[6]),fieldName(fields[7])
                        ,fieldName(fields[8]),fieldName(fields[9]),fieldName(fields[10])
                        ,fieldName(fields[11]));
                
                Customers.add(s);
            }
        }
        return Customers;
        
    }
    
    private static String fieldName(String s) {
        return s.substring(1, s.length()-1);
    }
}
