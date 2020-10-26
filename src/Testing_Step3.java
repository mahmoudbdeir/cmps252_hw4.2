
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

public class Testing_Step3 {
	private static List<Customer> customers;

	@BeforeAll
	public static void init () throws FileNotFoundException {
		customers = FileParser.getCustomers("C:\\temp\\hw4.2\\cmps252_hw4.2\\5000.csv");
	}
	
	@Test
	void FirstName() {
		assertEquals("Portia",customers.get(0).getFirstName());
	}
	
	@Test
	void LastName() {
		assertEquals("Mcfann",customers.get(0).getLastName());
	}
	
	@Test
	void Company() {
		assertEquals("Beachcomber Realty",customers.get(0).getCompany());
	}
	
	@Test
	void Address() {
		assertEquals("4891 Pacific Hwy",customers.get(0).getAddress());
	}
	
	@Test
	void City() {
		assertEquals("San Diego",customers.get(0).getCity());
	}
	
	@Test
	void County() {
		assertEquals("San Diego",customers.get(0).getCounty());
	}
	
	@Test
	void State() {
		assertEquals("CA",customers.get(0).getState());
	}
	
	@Test
	void ZIP() {
		assertEquals("92110",customers.get(0).getZIP());
	}
	
	@Test
	void Phone() {
		assertEquals("858-294-0682",customers.get(0).getPhone());
	}
	
	@Test
	void Fax() {
		assertEquals("858-294-1695",customers.get(0).getFax());
	}
	
	@Test
	void Email() {
		assertEquals("portia@mcfann.com",customers.get(0).getEmail());
	}
	
	@Test
	void Web() {
		assertEquals("http://www.portiamcfann.com",customers.get(0).getWeb());
	}
}


