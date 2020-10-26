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
class Record_4070 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4070: FirstName is Darnell")
	void FirstNameOfRecord4070() {
		assertEquals("Darnell", customers.get(4069).getFirstName());
	}

	@Test
	@DisplayName("Record 4070: LastName is Larabell")
	void LastNameOfRecord4070() {
		assertEquals("Larabell", customers.get(4069).getLastName());
	}

	@Test
	@DisplayName("Record 4070: Company is Hill, Gordon")
	void CompanyOfRecord4070() {
		assertEquals("Hill, Gordon", customers.get(4069).getCompany());
	}

	@Test
	@DisplayName("Record 4070: Address is 6850 Elm St")
	void AddressOfRecord4070() {
		assertEquals("6850 Elm St", customers.get(4069).getAddress());
	}

	@Test
	@DisplayName("Record 4070: City is Mc Lean")
	void CityOfRecord4070() {
		assertEquals("Mc Lean", customers.get(4069).getCity());
	}

	@Test
	@DisplayName("Record 4070: County is Fairfax")
	void CountyOfRecord4070() {
		assertEquals("Fairfax", customers.get(4069).getCounty());
	}

	@Test
	@DisplayName("Record 4070: State is VA")
	void StateOfRecord4070() {
		assertEquals("VA", customers.get(4069).getState());
	}

	@Test
	@DisplayName("Record 4070: ZIP is 22101")
	void ZIPOfRecord4070() {
		assertEquals("22101", customers.get(4069).getZIP());
	}

	@Test
	@DisplayName("Record 4070: Phone is 703-827-0819")
	void PhoneOfRecord4070() {
		assertEquals("703-827-0819", customers.get(4069).getPhone());
	}

	@Test
	@DisplayName("Record 4070: Fax is 703-827-5335")
	void FaxOfRecord4070() {
		assertEquals("703-827-5335", customers.get(4069).getFax());
	}

	@Test
	@DisplayName("Record 4070: Email is darnell@larabell.com")
	void EmailOfRecord4070() {
		assertEquals("darnell@larabell.com", customers.get(4069).getEmail());
	}

	@Test
	@DisplayName("Record 4070: Web is http://www.darnelllarabell.com")
	void WebOfRecord4070() {
		assertEquals("http://www.darnelllarabell.com", customers.get(4069).getWeb());
	}
}
