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

@Tag("49")
class Record_938 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 938: FirstName is Michael")
	void FirstNameOfRecord938() {
		assertEquals("Michael", customers.get(937).getFirstName());
	}

	@Test
	@DisplayName("Record 938: LastName is Bralley")
	void LastNameOfRecord938() {
		assertEquals("Bralley", customers.get(937).getLastName());
	}

	@Test
	@DisplayName("Record 938: Company is Davis Sign Company Inc")
	void CompanyOfRecord938() {
		assertEquals("Davis Sign Company Inc", customers.get(937).getCompany());
	}

	@Test
	@DisplayName("Record 938: Address is 2000 Will Ross Ct")
	void AddressOfRecord938() {
		assertEquals("2000 Will Ross Ct", customers.get(937).getAddress());
	}

	@Test
	@DisplayName("Record 938: City is Atlanta")
	void CityOfRecord938() {
		assertEquals("Atlanta", customers.get(937).getCity());
	}

	@Test
	@DisplayName("Record 938: County is Dekalb")
	void CountyOfRecord938() {
		assertEquals("Dekalb", customers.get(937).getCounty());
	}

	@Test
	@DisplayName("Record 938: State is GA")
	void StateOfRecord938() {
		assertEquals("GA", customers.get(937).getState());
	}

	@Test
	@DisplayName("Record 938: ZIP is 30341")
	void ZIPOfRecord938() {
		assertEquals("30341", customers.get(937).getZIP());
	}

	@Test
	@DisplayName("Record 938: Phone is 770-451-3309")
	void PhoneOfRecord938() {
		assertEquals("770-451-3309", customers.get(937).getPhone());
	}

	@Test
	@DisplayName("Record 938: Fax is 770-451-5029")
	void FaxOfRecord938() {
		assertEquals("770-451-5029", customers.get(937).getFax());
	}

	@Test
	@DisplayName("Record 938: Email is michael@bralley.com")
	void EmailOfRecord938() {
		assertEquals("michael@bralley.com", customers.get(937).getEmail());
	}

	@Test
	@DisplayName("Record 938: Web is http://www.michaelbralley.com")
	void WebOfRecord938() {
		assertEquals("http://www.michaelbralley.com", customers.get(937).getWeb());
	}
}
