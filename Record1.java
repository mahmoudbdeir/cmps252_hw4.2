package hw_4_2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Record1 {

	@Test
	void FirstName() {
		List<Customer> customers= FileParser.getCustomers(file)
		assertEquals("portia",customers.get(0).getFirstName());
	}
	@Test
	void LastName() {
		List<Customer> customers= FileParser.getCustomers(file)
		assertEquals("Mcfann",customers.get(0).getLastName());
	}
	@Test
	void Company() {
		List<Customer> customers= FileParser.getCustomers(file)
		assertEquals("Beachcomber Realty",customers.get(0).getCompany());
	}
	@Test
	void Adress() {
		List<Customer> customers= FileParser.getCustomers(file)
		assertEquals("4891 Pacific Hwy",customers.get(0).getAdress());
	}@Test
	void City() {
		List<Customer> customers= FileParser.getCustomers(file)
		assertEquals("San Diego",customers.get(0).getCity());
	}@Test
	void Country() {
		List<Customer> customers= FileParser.getCustomers(file)
		assertEquals("San Diego",customers.get(0).getCountry());
	}@Test
	void State() {
		List<Customer> customers= FileParser.getCustomers(file)
		assertEquals("CA",customers.get(0).getState());
	}@Test
	void ZIP() {
		List<Customer> customers= FileParser.getCustomers(file)
		assertEquals("92110",customers.get(0).getZIP());
	}@Test
	void Phone() {
		List<Customer> customers= FileParser.getCustomers(file)
		assertEquals("858-294-\r\n" + 
				"0682",customers.get(0).getPhone());
	}@Test
	void Fax() {
		List<Customer> customers= FileParser.getCustomers(file)
		assertEquals("858-294-1695",customers.get(0).getFax());
	}@Test
	void Email() {
		List<Customer> customers= FileParser.getCustomers(file)
		assertEquals("portia@mcfann.com",customers.get(0).getEmail());
	}@Test
	void Web() {
		List<Customer> customers= FileParser.getCustomers(file)
		assertEquals("http://www.portiamcfann.com",customers.get(0).getWeb());
	}
}
