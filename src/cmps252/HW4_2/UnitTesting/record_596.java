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

@Tag("35")
class Record_596 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 596: FirstName is Germaine")
	void FirstNameOfRecord596() {
		assertEquals("Germaine", customers.get(595).getFirstName());
	}

	@Test
	@DisplayName("Record 596: LastName is Zeme")
	void LastNameOfRecord596() {
		assertEquals("Zeme", customers.get(595).getLastName());
	}

	@Test
	@DisplayName("Record 596: Company is Bessettes Bumping & Paint Inc")
	void CompanyOfRecord596() {
		assertEquals("Bessettes Bumping & Paint Inc", customers.get(595).getCompany());
	}

	@Test
	@DisplayName("Record 596: Address is 2217 Lincoln Way W")
	void AddressOfRecord596() {
		assertEquals("2217 Lincoln Way W", customers.get(595).getAddress());
	}

	@Test
	@DisplayName("Record 596: City is South Bend")
	void CityOfRecord596() {
		assertEquals("South Bend", customers.get(595).getCity());
	}

	@Test
	@DisplayName("Record 596: County is St Joseph")
	void CountyOfRecord596() {
		assertEquals("St Joseph", customers.get(595).getCounty());
	}

	@Test
	@DisplayName("Record 596: State is IN")
	void StateOfRecord596() {
		assertEquals("IN", customers.get(595).getState());
	}

	@Test
	@DisplayName("Record 596: ZIP is 46628")
	void ZIPOfRecord596() {
		assertEquals("46628", customers.get(595).getZIP());
	}

	@Test
	@DisplayName("Record 596: Phone is 574-234-2619")
	void PhoneOfRecord596() {
		assertEquals("574-234-2619", customers.get(595).getPhone());
	}

	@Test
	@DisplayName("Record 596: Fax is 574-234-3045")
	void FaxOfRecord596() {
		assertEquals("574-234-3045", customers.get(595).getFax());
	}

	@Test
	@DisplayName("Record 596: Email is germaine@zeme.com")
	void EmailOfRecord596() {
		assertEquals("germaine@zeme.com", customers.get(595).getEmail());
	}

	@Test
	@DisplayName("Record 596: Web is http://www.germainezeme.com")
	void WebOfRecord596() {
		assertEquals("http://www.germainezeme.com", customers.get(595).getWeb());
	}
}
