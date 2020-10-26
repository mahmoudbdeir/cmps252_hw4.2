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

@Tag("2")
class Record_1083 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1083: FirstName is Tod")
	void FirstNameOfRecord1083() {
		assertEquals("Tod", customers.get(1082).getFirstName());
	}

	@Test
	@DisplayName("Record 1083: LastName is Hardebeck")
	void LastNameOfRecord1083() {
		assertEquals("Hardebeck", customers.get(1082).getLastName());
	}

	@Test
	@DisplayName("Record 1083: Company is Scranton Surgery Center")
	void CompanyOfRecord1083() {
		assertEquals("Scranton Surgery Center", customers.get(1082).getCompany());
	}

	@Test
	@DisplayName("Record 1083: Address is 2633 S Shirlington Rd")
	void AddressOfRecord1083() {
		assertEquals("2633 S Shirlington Rd", customers.get(1082).getAddress());
	}

	@Test
	@DisplayName("Record 1083: City is Arlington")
	void CityOfRecord1083() {
		assertEquals("Arlington", customers.get(1082).getCity());
	}

	@Test
	@DisplayName("Record 1083: County is Arlington")
	void CountyOfRecord1083() {
		assertEquals("Arlington", customers.get(1082).getCounty());
	}

	@Test
	@DisplayName("Record 1083: State is VA")
	void StateOfRecord1083() {
		assertEquals("VA", customers.get(1082).getState());
	}

	@Test
	@DisplayName("Record 1083: ZIP is 22206")
	void ZIPOfRecord1083() {
		assertEquals("22206", customers.get(1082).getZIP());
	}

	@Test
	@DisplayName("Record 1083: Phone is 703-979-9422")
	void PhoneOfRecord1083() {
		assertEquals("703-979-9422", customers.get(1082).getPhone());
	}

	@Test
	@DisplayName("Record 1083: Fax is 703-979-4952")
	void FaxOfRecord1083() {
		assertEquals("703-979-4952", customers.get(1082).getFax());
	}

	@Test
	@DisplayName("Record 1083: Email is tod@hardebeck.com")
	void EmailOfRecord1083() {
		assertEquals("tod@hardebeck.com", customers.get(1082).getEmail());
	}

	@Test
	@DisplayName("Record 1083: Web is http://www.todhardebeck.com")
	void WebOfRecord1083() {
		assertEquals("http://www.todhardebeck.com", customers.get(1082).getWeb());
	}
}
