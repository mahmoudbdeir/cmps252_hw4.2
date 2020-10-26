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

@Tag("0")
class Record_461 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 461: FirstName is Hunter")
	void FirstNameOfRecord461() {
		assertEquals("Hunter", customers.get(460).getFirstName());
	}

	@Test
	@DisplayName("Record 461: LastName is Eurbin")
	void LastNameOfRecord461() {
		assertEquals("Eurbin", customers.get(460).getLastName());
	}

	@Test
	@DisplayName("Record 461: Company is Boston Insurance Center")
	void CompanyOfRecord461() {
		assertEquals("Boston Insurance Center", customers.get(460).getCompany());
	}

	@Test
	@DisplayName("Record 461: Address is 4275 S Navajo St")
	void AddressOfRecord461() {
		assertEquals("4275 S Navajo St", customers.get(460).getAddress());
	}

	@Test
	@DisplayName("Record 461: City is Englewood")
	void CityOfRecord461() {
		assertEquals("Englewood", customers.get(460).getCity());
	}

	@Test
	@DisplayName("Record 461: County is Arapahoe")
	void CountyOfRecord461() {
		assertEquals("Arapahoe", customers.get(460).getCounty());
	}

	@Test
	@DisplayName("Record 461: State is CO")
	void StateOfRecord461() {
		assertEquals("CO", customers.get(460).getState());
	}

	@Test
	@DisplayName("Record 461: ZIP is 80110")
	void ZIPOfRecord461() {
		assertEquals("80110", customers.get(460).getZIP());
	}

	@Test
	@DisplayName("Record 461: Phone is 303-789-8189")
	void PhoneOfRecord461() {
		assertEquals("303-789-8189", customers.get(460).getPhone());
	}

	@Test
	@DisplayName("Record 461: Fax is 303-789-8562")
	void FaxOfRecord461() {
		assertEquals("303-789-8562", customers.get(460).getFax());
	}

	@Test
	@DisplayName("Record 461: Email is hunter@eurbin.com")
	void EmailOfRecord461() {
		assertEquals("hunter@eurbin.com", customers.get(460).getEmail());
	}

	@Test
	@DisplayName("Record 461: Web is http://www.huntereurbin.com")
	void WebOfRecord461() {
		assertEquals("http://www.huntereurbin.com", customers.get(460).getWeb());
	}
}
