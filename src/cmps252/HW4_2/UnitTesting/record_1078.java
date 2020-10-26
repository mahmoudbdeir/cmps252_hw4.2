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

@Tag("24")
class Record_1078 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1078: FirstName is Fernando")
	void FirstNameOfRecord1078() {
		assertEquals("Fernando", customers.get(1077).getFirstName());
	}

	@Test
	@DisplayName("Record 1078: LastName is Schmydler")
	void LastNameOfRecord1078() {
		assertEquals("Schmydler", customers.get(1077).getLastName());
	}

	@Test
	@DisplayName("Record 1078: Company is Pacific Highway Inn Best Wstrn")
	void CompanyOfRecord1078() {
		assertEquals("Pacific Highway Inn Best Wstrn", customers.get(1077).getCompany());
	}

	@Test
	@DisplayName("Record 1078: Address is 6950 S Tucson Way  #-c")
	void AddressOfRecord1078() {
		assertEquals("6950 S Tucson Way  #-c", customers.get(1077).getAddress());
	}

	@Test
	@DisplayName("Record 1078: City is Englewood")
	void CityOfRecord1078() {
		assertEquals("Englewood", customers.get(1077).getCity());
	}

	@Test
	@DisplayName("Record 1078: County is Arapahoe")
	void CountyOfRecord1078() {
		assertEquals("Arapahoe", customers.get(1077).getCounty());
	}

	@Test
	@DisplayName("Record 1078: State is CO")
	void StateOfRecord1078() {
		assertEquals("CO", customers.get(1077).getState());
	}

	@Test
	@DisplayName("Record 1078: ZIP is 80112")
	void ZIPOfRecord1078() {
		assertEquals("80112", customers.get(1077).getZIP());
	}

	@Test
	@DisplayName("Record 1078: Phone is 303-290-5086")
	void PhoneOfRecord1078() {
		assertEquals("303-290-5086", customers.get(1077).getPhone());
	}

	@Test
	@DisplayName("Record 1078: Fax is 303-290-8688")
	void FaxOfRecord1078() {
		assertEquals("303-290-8688", customers.get(1077).getFax());
	}

	@Test
	@DisplayName("Record 1078: Email is fernando@schmydler.com")
	void EmailOfRecord1078() {
		assertEquals("fernando@schmydler.com", customers.get(1077).getEmail());
	}

	@Test
	@DisplayName("Record 1078: Web is http://www.fernandoschmydler.com")
	void WebOfRecord1078() {
		assertEquals("http://www.fernandoschmydler.com", customers.get(1077).getWeb());
	}
}
