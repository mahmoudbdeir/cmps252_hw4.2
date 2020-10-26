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

@Tag("38")
class Record_4610 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4610: FirstName is Darrel")
	void FirstNameOfRecord4610() {
		assertEquals("Darrel", customers.get(4609).getFirstName());
	}

	@Test
	@DisplayName("Record 4610: LastName is Navarrette")
	void LastNameOfRecord4610() {
		assertEquals("Navarrette", customers.get(4609).getLastName());
	}

	@Test
	@DisplayName("Record 4610: Company is New Jersey Symphony Orchestra")
	void CompanyOfRecord4610() {
		assertEquals("New Jersey Symphony Orchestra", customers.get(4609).getCompany());
	}

	@Test
	@DisplayName("Record 4610: Address is 913 Alewa Dr")
	void AddressOfRecord4610() {
		assertEquals("913 Alewa Dr", customers.get(4609).getAddress());
	}

	@Test
	@DisplayName("Record 4610: City is Honolulu")
	void CityOfRecord4610() {
		assertEquals("Honolulu", customers.get(4609).getCity());
	}

	@Test
	@DisplayName("Record 4610: County is Honolulu")
	void CountyOfRecord4610() {
		assertEquals("Honolulu", customers.get(4609).getCounty());
	}

	@Test
	@DisplayName("Record 4610: State is HI")
	void StateOfRecord4610() {
		assertEquals("HI", customers.get(4609).getState());
	}

	@Test
	@DisplayName("Record 4610: ZIP is 96817")
	void ZIPOfRecord4610() {
		assertEquals("96817", customers.get(4609).getZIP());
	}

	@Test
	@DisplayName("Record 4610: Phone is 808-595-3616")
	void PhoneOfRecord4610() {
		assertEquals("808-595-3616", customers.get(4609).getPhone());
	}

	@Test
	@DisplayName("Record 4610: Fax is 808-595-3398")
	void FaxOfRecord4610() {
		assertEquals("808-595-3398", customers.get(4609).getFax());
	}

	@Test
	@DisplayName("Record 4610: Email is darrel@navarrette.com")
	void EmailOfRecord4610() {
		assertEquals("darrel@navarrette.com", customers.get(4609).getEmail());
	}

	@Test
	@DisplayName("Record 4610: Web is http://www.darrelnavarrette.com")
	void WebOfRecord4610() {
		assertEquals("http://www.darrelnavarrette.com", customers.get(4609).getWeb());
	}
}
