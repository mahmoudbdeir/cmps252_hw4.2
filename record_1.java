import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class record_1 {
private static List<Customer> customers;
@BeforeAll
public static void init() throws FileNotFoundException {
	
	customers= FileParser.getCustomers("D:\\student\\CMPS 252\\homeworks\\hw4.2\\5000.csv");
}

	@Test
	void firstName() {
		assertEquals("Portia", customers.get(0).getFirstName());
	}
	@Test
	void lastName() {
		assertEquals("Mcfann", customers.get(0).getLastName());
	}

	@Test
	void company() {
		assertEquals("Beachcomber Realty", customers.get(0).getCompany());
	}
	@Test
	void address() {
		assertEquals("4891 Pacific Hwy", customers.get(0).getAddress());
	}
	@Test
	void city() {
		assertEquals("San Diego", customers.get(0).getCity());
	}
	@Test
	void county() {
		assertEquals("San Diego", customers.get(0).getCounty());
	}
	@Test
	void state() {
		assertEquals("CA", customers.get(0).getState());
	}
	@Test
	void ZIP() {
		assertEquals("92110", customers.get(0).getZIP());
	}
	@Test
	void phone() {
		assertEquals("858-294-0682", customers.get(0).getPhone());
	}
	@Test
	void fax() {
		assertEquals("858-294-1695", customers.get(0).getFax());
	}
	@Test
	void email() {
		assertEquals("portia@mcfann.com", customers.get(0).getEmail());
	}
	@Test
	void web() {
		assertEquals("http://www.portiamcfann.com", customers.get(0).getWeb());
	}

}
