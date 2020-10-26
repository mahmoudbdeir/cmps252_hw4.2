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

@Tag("33")
class Record_990 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 990: FirstName is Rosie")
	void FirstNameOfRecord990() {
		assertEquals("Rosie", customers.get(989).getFirstName());
	}

	@Test
	@DisplayName("Record 990: LastName is Petrella")
	void LastNameOfRecord990() {
		assertEquals("Petrella", customers.get(989).getLastName());
	}

	@Test
	@DisplayName("Record 990: Company is Robert M Parks Products Co")
	void CompanyOfRecord990() {
		assertEquals("Robert M Parks Products Co", customers.get(989).getCompany());
	}

	@Test
	@DisplayName("Record 990: Address is 220 Jacksonville Rd")
	void AddressOfRecord990() {
		assertEquals("220 Jacksonville Rd", customers.get(989).getAddress());
	}

	@Test
	@DisplayName("Record 990: City is Warminster")
	void CityOfRecord990() {
		assertEquals("Warminster", customers.get(989).getCity());
	}

	@Test
	@DisplayName("Record 990: County is Bucks")
	void CountyOfRecord990() {
		assertEquals("Bucks", customers.get(989).getCounty());
	}

	@Test
	@DisplayName("Record 990: State is PA")
	void StateOfRecord990() {
		assertEquals("PA", customers.get(989).getState());
	}

	@Test
	@DisplayName("Record 990: ZIP is 18974")
	void ZIPOfRecord990() {
		assertEquals("18974", customers.get(989).getZIP());
	}

	@Test
	@DisplayName("Record 990: Phone is 215-957-0063")
	void PhoneOfRecord990() {
		assertEquals("215-957-0063", customers.get(989).getPhone());
	}

	@Test
	@DisplayName("Record 990: Fax is 215-957-4747")
	void FaxOfRecord990() {
		assertEquals("215-957-4747", customers.get(989).getFax());
	}

	@Test
	@DisplayName("Record 990: Email is rosie@petrella.com")
	void EmailOfRecord990() {
		assertEquals("rosie@petrella.com", customers.get(989).getEmail());
	}

	@Test
	@DisplayName("Record 990: Web is http://www.rosiepetrella.com")
	void WebOfRecord990() {
		assertEquals("http://www.rosiepetrella.com", customers.get(989).getWeb());
	}
}
