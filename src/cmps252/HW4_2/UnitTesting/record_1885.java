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

@Tag("31")
class Record_1885 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1885: FirstName is Luciano")
	void FirstNameOfRecord1885() {
		assertEquals("Luciano", customers.get(1884).getFirstName());
	}

	@Test
	@DisplayName("Record 1885: LastName is Benack")
	void LastNameOfRecord1885() {
		assertEquals("Benack", customers.get(1884).getLastName());
	}

	@Test
	@DisplayName("Record 1885: Company is Kahler, Stephen D")
	void CompanyOfRecord1885() {
		assertEquals("Kahler, Stephen D", customers.get(1884).getCompany());
	}

	@Test
	@DisplayName("Record 1885: Address is 1327 Ashton Rd")
	void AddressOfRecord1885() {
		assertEquals("1327 Ashton Rd", customers.get(1884).getAddress());
	}

	@Test
	@DisplayName("Record 1885: City is Hanover")
	void CityOfRecord1885() {
		assertEquals("Hanover", customers.get(1884).getCity());
	}

	@Test
	@DisplayName("Record 1885: County is Anne Arundel")
	void CountyOfRecord1885() {
		assertEquals("Anne Arundel", customers.get(1884).getCounty());
	}

	@Test
	@DisplayName("Record 1885: State is MD")
	void StateOfRecord1885() {
		assertEquals("MD", customers.get(1884).getState());
	}

	@Test
	@DisplayName("Record 1885: ZIP is 21076")
	void ZIPOfRecord1885() {
		assertEquals("21076", customers.get(1884).getZIP());
	}

	@Test
	@DisplayName("Record 1885: Phone is 410-684-1728")
	void PhoneOfRecord1885() {
		assertEquals("410-684-1728", customers.get(1884).getPhone());
	}

	@Test
	@DisplayName("Record 1885: Fax is 410-684-3128")
	void FaxOfRecord1885() {
		assertEquals("410-684-3128", customers.get(1884).getFax());
	}

	@Test
	@DisplayName("Record 1885: Email is luciano@benack.com")
	void EmailOfRecord1885() {
		assertEquals("luciano@benack.com", customers.get(1884).getEmail());
	}

	@Test
	@DisplayName("Record 1885: Web is http://www.lucianobenack.com")
	void WebOfRecord1885() {
		assertEquals("http://www.lucianobenack.com", customers.get(1884).getWeb());
	}
}
