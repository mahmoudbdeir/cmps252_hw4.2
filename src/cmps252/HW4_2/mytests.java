package cmps252.HW4_2;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class tester {
	private static List<Customer> customers;
	@BeforeAll
	public static void init() throws FileNotFoundException {
	customers = FileParser.getCustomers("C:\\Users\\janae\\eclipse-workspace\\HW04.2\\src\\500.txt");
	}
	@Test
	void testGetCustomers(){
		assertEquals("Portia",customers.get(0).getFirstName());
	}
	@Test
	void testGetCustomers2() {
		assertEquals("Mcfann",customers.get(0).getLastName());
	}
	@Test
	void testGetCustomers3() {
		assertEquals("Beachcomber Realty",customers.get(0).getCompany());
	}
	@Test
	void testGetCustomers4() {
		assertEquals("4891 Pacific Hwy",customers.get(0).getAddress());
	}
	@Test
	void testGetCustomers5()  {
		assertEquals("San Diego",customers.get(0).getCity());
	}
	@Test
	void testGetCustomers6()  {
		assertEquals("San Diego",customers.get(0).getCounty());
	}
	@Test
	void testGetCustomers7()  {
		assertEquals("CA",customers.get(0).getState());
	}
	@Test
	void testGetCustomers8(){
		assertEquals("92110",customers.get(0).getZIP());
	}
	@Test
	void testGetCustomers12()  {
		assertEquals("858-294-0682",customers.get(0).getPhone());
	}
	@Test
	void testGetCustomers9()  {
		assertEquals("858-294-1695",customers.get(0).getPhone());
	}
	@Test
	void testGetCustomers10()  {
		assertEquals("portia@mcfann.com",customers.get(0).getEmail());
	}
	@Test
	void testGetCustomers11()  {
		assertEquals("http://www.portiamcfann.com",customers.get(0).getWeb());
	}
}
