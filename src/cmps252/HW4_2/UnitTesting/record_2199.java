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

@Tag("23")
class Record_2199 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2199: FirstName is Mason")
	void FirstNameOfRecord2199() {
		assertEquals("Mason", customers.get(2198).getFirstName());
	}

	@Test
	@DisplayName("Record 2199: LastName is Okada")
	void LastNameOfRecord2199() {
		assertEquals("Okada", customers.get(2198).getLastName());
	}

	@Test
	@DisplayName("Record 2199: Company is Seufert Electrical Co Inc")
	void CompanyOfRecord2199() {
		assertEquals("Seufert Electrical Co Inc", customers.get(2198).getCompany());
	}

	@Test
	@DisplayName("Record 2199: Address is 2829 W 21st St")
	void AddressOfRecord2199() {
		assertEquals("2829 W 21st St", customers.get(2198).getAddress());
	}

	@Test
	@DisplayName("Record 2199: City is Brooklyn")
	void CityOfRecord2199() {
		assertEquals("Brooklyn", customers.get(2198).getCity());
	}

	@Test
	@DisplayName("Record 2199: County is Kings")
	void CountyOfRecord2199() {
		assertEquals("Kings", customers.get(2198).getCounty());
	}

	@Test
	@DisplayName("Record 2199: State is NY")
	void StateOfRecord2199() {
		assertEquals("NY", customers.get(2198).getState());
	}

	@Test
	@DisplayName("Record 2199: ZIP is 11224")
	void ZIPOfRecord2199() {
		assertEquals("11224", customers.get(2198).getZIP());
	}

	@Test
	@DisplayName("Record 2199: Phone is 718-265-5545")
	void PhoneOfRecord2199() {
		assertEquals("718-265-5545", customers.get(2198).getPhone());
	}

	@Test
	@DisplayName("Record 2199: Fax is 718-265-4024")
	void FaxOfRecord2199() {
		assertEquals("718-265-4024", customers.get(2198).getFax());
	}

	@Test
	@DisplayName("Record 2199: Email is mason@okada.com")
	void EmailOfRecord2199() {
		assertEquals("mason@okada.com", customers.get(2198).getEmail());
	}

	@Test
	@DisplayName("Record 2199: Web is http://www.masonokada.com")
	void WebOfRecord2199() {
		assertEquals("http://www.masonokada.com", customers.get(2198).getWeb());
	}
}
