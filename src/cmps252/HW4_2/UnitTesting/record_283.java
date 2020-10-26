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

@Tag("19")
class Record_283 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 283: FirstName is Mac")
	void FirstNameOfRecord283() {
		assertEquals("Mac", customers.get(282).getFirstName());
	}

	@Test
	@DisplayName("Record 283: LastName is Speckman")
	void LastNameOfRecord283() {
		assertEquals("Speckman", customers.get(282).getLastName());
	}

	@Test
	@DisplayName("Record 283: Company is Southland Sales Co")
	void CompanyOfRecord283() {
		assertEquals("Southland Sales Co", customers.get(282).getCompany());
	}

	@Test
	@DisplayName("Record 283: Address is 613 S Main St  #-b")
	void AddressOfRecord283() {
		assertEquals("613 S Main St  #-b", customers.get(282).getAddress());
	}

	@Test
	@DisplayName("Record 283: City is De Forest")
	void CityOfRecord283() {
		assertEquals("De Forest", customers.get(282).getCity());
	}

	@Test
	@DisplayName("Record 283: County is Dane")
	void CountyOfRecord283() {
		assertEquals("Dane", customers.get(282).getCounty());
	}

	@Test
	@DisplayName("Record 283: State is WI")
	void StateOfRecord283() {
		assertEquals("WI", customers.get(282).getState());
	}

	@Test
	@DisplayName("Record 283: ZIP is 53532")
	void ZIPOfRecord283() {
		assertEquals("53532", customers.get(282).getZIP());
	}

	@Test
	@DisplayName("Record 283: Phone is 608-846-0894")
	void PhoneOfRecord283() {
		assertEquals("608-846-0894", customers.get(282).getPhone());
	}

	@Test
	@DisplayName("Record 283: Fax is 608-846-4215")
	void FaxOfRecord283() {
		assertEquals("608-846-4215", customers.get(282).getFax());
	}

	@Test
	@DisplayName("Record 283: Email is mac@speckman.com")
	void EmailOfRecord283() {
		assertEquals("mac@speckman.com", customers.get(282).getEmail());
	}

	@Test
	@DisplayName("Record 283: Web is http://www.macspeckman.com")
	void WebOfRecord283() {
		assertEquals("http://www.macspeckman.com", customers.get(282).getWeb());
	}
}
