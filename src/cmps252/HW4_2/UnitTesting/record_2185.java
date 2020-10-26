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

@Tag("39")
class Record_2185 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2185: FirstName is Connie")
	void FirstNameOfRecord2185() {
		assertEquals("Connie", customers.get(2184).getFirstName());
	}

	@Test
	@DisplayName("Record 2185: LastName is Dihel")
	void LastNameOfRecord2185() {
		assertEquals("Dihel", customers.get(2184).getLastName());
	}

	@Test
	@DisplayName("Record 2185: Company is Mccarthy, Stephen P Esq")
	void CompanyOfRecord2185() {
		assertEquals("Mccarthy, Stephen P Esq", customers.get(2184).getCompany());
	}

	@Test
	@DisplayName("Record 2185: Address is 1928 E Irving Blvd")
	void AddressOfRecord2185() {
		assertEquals("1928 E Irving Blvd", customers.get(2184).getAddress());
	}

	@Test
	@DisplayName("Record 2185: City is Irving")
	void CityOfRecord2185() {
		assertEquals("Irving", customers.get(2184).getCity());
	}

	@Test
	@DisplayName("Record 2185: County is Dallas")
	void CountyOfRecord2185() {
		assertEquals("Dallas", customers.get(2184).getCounty());
	}

	@Test
	@DisplayName("Record 2185: State is TX")
	void StateOfRecord2185() {
		assertEquals("TX", customers.get(2184).getState());
	}

	@Test
	@DisplayName("Record 2185: ZIP is 75060")
	void ZIPOfRecord2185() {
		assertEquals("75060", customers.get(2184).getZIP());
	}

	@Test
	@DisplayName("Record 2185: Phone is 972-438-5831")
	void PhoneOfRecord2185() {
		assertEquals("972-438-5831", customers.get(2184).getPhone());
	}

	@Test
	@DisplayName("Record 2185: Fax is 972-438-5055")
	void FaxOfRecord2185() {
		assertEquals("972-438-5055", customers.get(2184).getFax());
	}

	@Test
	@DisplayName("Record 2185: Email is connie@dihel.com")
	void EmailOfRecord2185() {
		assertEquals("connie@dihel.com", customers.get(2184).getEmail());
	}

	@Test
	@DisplayName("Record 2185: Web is http://www.conniedihel.com")
	void WebOfRecord2185() {
		assertEquals("http://www.conniedihel.com", customers.get(2184).getWeb());
	}
}
