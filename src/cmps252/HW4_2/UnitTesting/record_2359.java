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

@Tag("5")
class Record_2359 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2359: FirstName is Lona")
	void FirstNameOfRecord2359() {
		assertEquals("Lona", customers.get(2358).getFirstName());
	}

	@Test
	@DisplayName("Record 2359: LastName is Skepple")
	void LastNameOfRecord2359() {
		assertEquals("Skepple", customers.get(2358).getLastName());
	}

	@Test
	@DisplayName("Record 2359: Company is Goldman Allan A Inc")
	void CompanyOfRecord2359() {
		assertEquals("Goldman Allan A Inc", customers.get(2358).getCompany());
	}

	@Test
	@DisplayName("Record 2359: Address is 236 Dukes Pky E")
	void AddressOfRecord2359() {
		assertEquals("236 Dukes Pky E", customers.get(2358).getAddress());
	}

	@Test
	@DisplayName("Record 2359: City is Somerville")
	void CityOfRecord2359() {
		assertEquals("Somerville", customers.get(2358).getCity());
	}

	@Test
	@DisplayName("Record 2359: County is Somerset")
	void CountyOfRecord2359() {
		assertEquals("Somerset", customers.get(2358).getCounty());
	}

	@Test
	@DisplayName("Record 2359: State is NJ")
	void StateOfRecord2359() {
		assertEquals("NJ", customers.get(2358).getState());
	}

	@Test
	@DisplayName("Record 2359: ZIP is 8876")
	void ZIPOfRecord2359() {
		assertEquals("8876", customers.get(2358).getZIP());
	}

	@Test
	@DisplayName("Record 2359: Phone is 908-707-2998")
	void PhoneOfRecord2359() {
		assertEquals("908-707-2998", customers.get(2358).getPhone());
	}

	@Test
	@DisplayName("Record 2359: Fax is 908-707-7043")
	void FaxOfRecord2359() {
		assertEquals("908-707-7043", customers.get(2358).getFax());
	}

	@Test
	@DisplayName("Record 2359: Email is lona@skepple.com")
	void EmailOfRecord2359() {
		assertEquals("lona@skepple.com", customers.get(2358).getEmail());
	}

	@Test
	@DisplayName("Record 2359: Web is http://www.lonaskepple.com")
	void WebOfRecord2359() {
		assertEquals("http://www.lonaskepple.com", customers.get(2358).getWeb());
	}
}
