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
class Record_1401 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1401: FirstName is Hal")
	void FirstNameOfRecord1401() {
		assertEquals("Hal", customers.get(1400).getFirstName());
	}

	@Test
	@DisplayName("Record 1401: LastName is Dziduch")
	void LastNameOfRecord1401() {
		assertEquals("Dziduch", customers.get(1400).getLastName());
	}

	@Test
	@DisplayName("Record 1401: Company is Ayers Saint Gross Inc")
	void CompanyOfRecord1401() {
		assertEquals("Ayers Saint Gross Inc", customers.get(1400).getCompany());
	}

	@Test
	@DisplayName("Record 1401: Address is 3255 Scott Blvd")
	void AddressOfRecord1401() {
		assertEquals("3255 Scott Blvd", customers.get(1400).getAddress());
	}

	@Test
	@DisplayName("Record 1401: City is Santa Clara")
	void CityOfRecord1401() {
		assertEquals("Santa Clara", customers.get(1400).getCity());
	}

	@Test
	@DisplayName("Record 1401: County is Santa Clara")
	void CountyOfRecord1401() {
		assertEquals("Santa Clara", customers.get(1400).getCounty());
	}

	@Test
	@DisplayName("Record 1401: State is CA")
	void StateOfRecord1401() {
		assertEquals("CA", customers.get(1400).getState());
	}

	@Test
	@DisplayName("Record 1401: ZIP is 95054")
	void ZIPOfRecord1401() {
		assertEquals("95054", customers.get(1400).getZIP());
	}

	@Test
	@DisplayName("Record 1401: Phone is 408-727-7529")
	void PhoneOfRecord1401() {
		assertEquals("408-727-7529", customers.get(1400).getPhone());
	}

	@Test
	@DisplayName("Record 1401: Fax is 408-727-1774")
	void FaxOfRecord1401() {
		assertEquals("408-727-1774", customers.get(1400).getFax());
	}

	@Test
	@DisplayName("Record 1401: Email is hal@dziduch.com")
	void EmailOfRecord1401() {
		assertEquals("hal@dziduch.com", customers.get(1400).getEmail());
	}

	@Test
	@DisplayName("Record 1401: Web is http://www.haldziduch.com")
	void WebOfRecord1401() {
		assertEquals("http://www.haldziduch.com", customers.get(1400).getWeb());
	}
}
