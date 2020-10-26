package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("22")
class Record_1918 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1918: FirstName is Elliot")
	void FirstNameOfRecord1918() {
		assertEquals("Elliot", customers.get(1917).getFirstName());
	}

	@Test
	@DisplayName("Record 1918: LastName is Mcquinn")
	void LastNameOfRecord1918() {
		assertEquals("Mcquinn", customers.get(1917).getLastName());
	}

	@Test
	@DisplayName("Record 1918: Company is Cobb, Ralph F Esq")
	void CompanyOfRecord1918() {
		assertEquals("Cobb, Ralph F Esq", customers.get(1917).getCompany());
	}

	@Test
	@DisplayName("Record 1918: Address is 117 E 29th St")
	void AddressOfRecord1918() {
		assertEquals("117 E 29th St", customers.get(1917).getAddress());
	}

	@Test
	@DisplayName("Record 1918: City is New York")
	void CityOfRecord1918() {
		assertEquals("New York", customers.get(1917).getCity());
	}

	@Test
	@DisplayName("Record 1918: County is New York")
	void CountyOfRecord1918() {
		assertEquals("New York", customers.get(1917).getCounty());
	}

	@Test
	@DisplayName("Record 1918: State is NY")
	void StateOfRecord1918() {
		assertEquals("NY", customers.get(1917).getState());
	}

	@Test
	@DisplayName("Record 1918: ZIP is 10016")
	void ZIPOfRecord1918() {
		assertEquals("10016", customers.get(1917).getZIP());
	}

	@Test
	@DisplayName("Record 1918: Phone is 212-447-6576")
	void PhoneOfRecord1918() {
		assertEquals("212-447-6576", customers.get(1917).getPhone());
	}

	@Test
	@DisplayName("Record 1918: Fax is 212-447-9245")
	void FaxOfRecord1918() {
		assertEquals("212-447-9245", customers.get(1917).getFax());
	}

	@Test
	@DisplayName("Record 1918: Email is elliot@mcquinn.com")
	void EmailOfRecord1918() {
		assertEquals("elliot@mcquinn.com", customers.get(1917).getEmail());
	}

	@Test
	@DisplayName("Record 1918: Web is http://www.elliotmcquinn.com")
	void WebOfRecord1918() {
		assertEquals("http://www.elliotmcquinn.com", customers.get(1917).getWeb());
	}
}
