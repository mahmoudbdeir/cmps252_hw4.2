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

@Tag("40")
class Record_2579 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2579: FirstName is Lucy")
	void FirstNameOfRecord2579() {
		assertEquals("Lucy", customers.get(2578).getFirstName());
	}

	@Test
	@DisplayName("Record 2579: LastName is Zwolak")
	void LastNameOfRecord2579() {
		assertEquals("Zwolak", customers.get(2578).getLastName());
	}

	@Test
	@DisplayName("Record 2579: Company is Universal Bellows Co Inc")
	void CompanyOfRecord2579() {
		assertEquals("Universal Bellows Co Inc", customers.get(2578).getCompany());
	}

	@Test
	@DisplayName("Record 2579: Address is 505 N French Rd")
	void AddressOfRecord2579() {
		assertEquals("505 N French Rd", customers.get(2578).getAddress());
	}

	@Test
	@DisplayName("Record 2579: City is Buffalo")
	void CityOfRecord2579() {
		assertEquals("Buffalo", customers.get(2578).getCity());
	}

	@Test
	@DisplayName("Record 2579: County is Erie")
	void CountyOfRecord2579() {
		assertEquals("Erie", customers.get(2578).getCounty());
	}

	@Test
	@DisplayName("Record 2579: State is NY")
	void StateOfRecord2579() {
		assertEquals("NY", customers.get(2578).getState());
	}

	@Test
	@DisplayName("Record 2579: ZIP is 14228")
	void ZIPOfRecord2579() {
		assertEquals("14228", customers.get(2578).getZIP());
	}

	@Test
	@DisplayName("Record 2579: Phone is 716-641-8660")
	void PhoneOfRecord2579() {
		assertEquals("716-641-8660", customers.get(2578).getPhone());
	}

	@Test
	@DisplayName("Record 2579: Fax is 716-641-9239")
	void FaxOfRecord2579() {
		assertEquals("716-641-9239", customers.get(2578).getFax());
	}

	@Test
	@DisplayName("Record 2579: Email is lucy@zwolak.com")
	void EmailOfRecord2579() {
		assertEquals("lucy@zwolak.com", customers.get(2578).getEmail());
	}

	@Test
	@DisplayName("Record 2579: Web is http://www.lucyzwolak.com")
	void WebOfRecord2579() {
		assertEquals("http://www.lucyzwolak.com", customers.get(2578).getWeb());
	}
}
