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

@Tag("48")
class Record_1938 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1938: FirstName is Alvina")
	void FirstNameOfRecord1938() {
		assertEquals("Alvina", customers.get(1937).getFirstName());
	}

	@Test
	@DisplayName("Record 1938: LastName is Every")
	void LastNameOfRecord1938() {
		assertEquals("Every", customers.get(1937).getLastName());
	}

	@Test
	@DisplayName("Record 1938: Company is Henry Construction Co")
	void CompanyOfRecord1938() {
		assertEquals("Henry Construction Co", customers.get(1937).getCompany());
	}

	@Test
	@DisplayName("Record 1938: Address is 339 Greenwich St")
	void AddressOfRecord1938() {
		assertEquals("339 Greenwich St", customers.get(1937).getAddress());
	}

	@Test
	@DisplayName("Record 1938: City is New York")
	void CityOfRecord1938() {
		assertEquals("New York", customers.get(1937).getCity());
	}

	@Test
	@DisplayName("Record 1938: County is New York")
	void CountyOfRecord1938() {
		assertEquals("New York", customers.get(1937).getCounty());
	}

	@Test
	@DisplayName("Record 1938: State is NY")
	void StateOfRecord1938() {
		assertEquals("NY", customers.get(1937).getState());
	}

	@Test
	@DisplayName("Record 1938: ZIP is 10013")
	void ZIPOfRecord1938() {
		assertEquals("10013", customers.get(1937).getZIP());
	}

	@Test
	@DisplayName("Record 1938: Phone is 212-941-0055")
	void PhoneOfRecord1938() {
		assertEquals("212-941-0055", customers.get(1937).getPhone());
	}

	@Test
	@DisplayName("Record 1938: Fax is 212-941-0696")
	void FaxOfRecord1938() {
		assertEquals("212-941-0696", customers.get(1937).getFax());
	}

	@Test
	@DisplayName("Record 1938: Email is alvina@every.com")
	void EmailOfRecord1938() {
		assertEquals("alvina@every.com", customers.get(1937).getEmail());
	}

	@Test
	@DisplayName("Record 1938: Web is http://www.alvinaevery.com")
	void WebOfRecord1938() {
		assertEquals("http://www.alvinaevery.com", customers.get(1937).getWeb());
	}
}
