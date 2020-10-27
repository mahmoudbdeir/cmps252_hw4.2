package cmps252.HW4_2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class record_1 {
	
	public static List<Customer> customers;
	
	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers("C:\\Users\\JAD\\Downloads\\cmps252_hw4.2\\5000.csv");
	}
	
	@Test
	void FirstNameofFirstRecord() {
		assertEquals("Portia", customers.get(0).getFirstName());
	}
	
	@Test
	void LastNameofFirstRecord() {
		assertEquals("Mcfann", customers.get(0).getLastName());
	}
	
	@Test
	void AddressofFirstRecord() {
		assertEquals("4891 Pacific Hwy", customers.get(0).getAddress());
	}
	
	@Test
	void CityofFirstRecord() {
		assertEquals("San Diego", customers.get(0).getCity());
	}
	
	@Test
	void CountyofFirstRecord() {
		assertEquals("San Diego", customers.get(0).getCounty());
	}
	
	@Test
	void StateofFirstRecord() {
		assertEquals("CA", customers.get(0).getState());
	}
	
	@Test
	void ZIPofFirstRecord() {
		assertEquals("92110", customers.get(0).getZIP());
	}
	
	@Test
	void PhoneofFirstRecord() {
		assertEquals("858-294-0682", customers.get(0).getPhone());
	}
	
	@Test
	void FaxofFirstRecord() {
		assertEquals("858-294-1695", customers.get(0).getFax());
	}
	
	@Test
	void EmailofFirstRecord() {
		assertEquals("portia@mcfann.com", customers.get(0).getEmail());
	}
	
	@Test
	void WebofFirstRecord() {
		assertEquals("http://www.portiamcfann.com", customers.get(0).getWeb());
	}
}
