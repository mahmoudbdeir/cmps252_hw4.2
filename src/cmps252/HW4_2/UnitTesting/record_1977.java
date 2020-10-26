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

@Tag("32")
class Record_1977 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1977: FirstName is Riley")
	void FirstNameOfRecord1977() {
		assertEquals("Riley", customers.get(1976).getFirstName());
	}

	@Test
	@DisplayName("Record 1977: LastName is Foulk")
	void LastNameOfRecord1977() {
		assertEquals("Foulk", customers.get(1976).getLastName());
	}

	@Test
	@DisplayName("Record 1977: Company is Freeburger, Sandra D Esq")
	void CompanyOfRecord1977() {
		assertEquals("Freeburger, Sandra D Esq", customers.get(1976).getCompany());
	}

	@Test
	@DisplayName("Record 1977: Address is 6001 San Mateo Blvd Ne")
	void AddressOfRecord1977() {
		assertEquals("6001 San Mateo Blvd Ne", customers.get(1976).getAddress());
	}

	@Test
	@DisplayName("Record 1977: City is Albuquerque")
	void CityOfRecord1977() {
		assertEquals("Albuquerque", customers.get(1976).getCity());
	}

	@Test
	@DisplayName("Record 1977: County is Bernalillo")
	void CountyOfRecord1977() {
		assertEquals("Bernalillo", customers.get(1976).getCounty());
	}

	@Test
	@DisplayName("Record 1977: State is NM")
	void StateOfRecord1977() {
		assertEquals("NM", customers.get(1976).getState());
	}

	@Test
	@DisplayName("Record 1977: ZIP is 87109")
	void ZIPOfRecord1977() {
		assertEquals("87109", customers.get(1976).getZIP());
	}

	@Test
	@DisplayName("Record 1977: Phone is 505-889-5883")
	void PhoneOfRecord1977() {
		assertEquals("505-889-5883", customers.get(1976).getPhone());
	}

	@Test
	@DisplayName("Record 1977: Fax is 505-889-8929")
	void FaxOfRecord1977() {
		assertEquals("505-889-8929", customers.get(1976).getFax());
	}

	@Test
	@DisplayName("Record 1977: Email is riley@foulk.com")
	void EmailOfRecord1977() {
		assertEquals("riley@foulk.com", customers.get(1976).getEmail());
	}

	@Test
	@DisplayName("Record 1977: Web is http://www.rileyfoulk.com")
	void WebOfRecord1977() {
		assertEquals("http://www.rileyfoulk.com", customers.get(1976).getWeb());
	}
}
