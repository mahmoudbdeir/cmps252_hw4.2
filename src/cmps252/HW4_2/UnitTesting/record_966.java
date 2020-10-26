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

@Tag("21")
class Record_966 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 966: FirstName is Conrad")
	void FirstNameOfRecord966() {
		assertEquals("Conrad", customers.get(965).getFirstName());
	}

	@Test
	@DisplayName("Record 966: LastName is Rosu")
	void LastNameOfRecord966() {
		assertEquals("Rosu", customers.get(965).getLastName());
	}

	@Test
	@DisplayName("Record 966: Company is Bens Iron Works")
	void CompanyOfRecord966() {
		assertEquals("Bens Iron Works", customers.get(965).getCompany());
	}

	@Test
	@DisplayName("Record 966: Address is 9625 E Arapahoe Rd  #-l")
	void AddressOfRecord966() {
		assertEquals("9625 E Arapahoe Rd  #-l", customers.get(965).getAddress());
	}

	@Test
	@DisplayName("Record 966: City is Englewood")
	void CityOfRecord966() {
		assertEquals("Englewood", customers.get(965).getCity());
	}

	@Test
	@DisplayName("Record 966: County is Arapahoe")
	void CountyOfRecord966() {
		assertEquals("Arapahoe", customers.get(965).getCounty());
	}

	@Test
	@DisplayName("Record 966: State is CO")
	void StateOfRecord966() {
		assertEquals("CO", customers.get(965).getState());
	}

	@Test
	@DisplayName("Record 966: ZIP is 80112")
	void ZIPOfRecord966() {
		assertEquals("80112", customers.get(965).getZIP());
	}

	@Test
	@DisplayName("Record 966: Phone is 303-649-0525")
	void PhoneOfRecord966() {
		assertEquals("303-649-0525", customers.get(965).getPhone());
	}

	@Test
	@DisplayName("Record 966: Fax is 303-649-5773")
	void FaxOfRecord966() {
		assertEquals("303-649-5773", customers.get(965).getFax());
	}

	@Test
	@DisplayName("Record 966: Email is conrad@rosu.com")
	void EmailOfRecord966() {
		assertEquals("conrad@rosu.com", customers.get(965).getEmail());
	}

	@Test
	@DisplayName("Record 966: Web is http://www.conradrosu.com")
	void WebOfRecord966() {
		assertEquals("http://www.conradrosu.com", customers.get(965).getWeb());
	}
}
