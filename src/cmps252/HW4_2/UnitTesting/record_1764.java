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

@Tag("9")
class Record_1764 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1764: FirstName is Gordon")
	void FirstNameOfRecord1764() {
		assertEquals("Gordon", customers.get(1763).getFirstName());
	}

	@Test
	@DisplayName("Record 1764: LastName is Tobiason")
	void LastNameOfRecord1764() {
		assertEquals("Tobiason", customers.get(1763).getLastName());
	}

	@Test
	@DisplayName("Record 1764: Company is Thinnes, Thomas A Pa")
	void CompanyOfRecord1764() {
		assertEquals("Thinnes, Thomas A Pa", customers.get(1763).getCompany());
	}

	@Test
	@DisplayName("Record 1764: Address is 460 W 34th St")
	void AddressOfRecord1764() {
		assertEquals("460 W 34th St", customers.get(1763).getAddress());
	}

	@Test
	@DisplayName("Record 1764: City is New York")
	void CityOfRecord1764() {
		assertEquals("New York", customers.get(1763).getCity());
	}

	@Test
	@DisplayName("Record 1764: County is New York")
	void CountyOfRecord1764() {
		assertEquals("New York", customers.get(1763).getCounty());
	}

	@Test
	@DisplayName("Record 1764: State is NY")
	void StateOfRecord1764() {
		assertEquals("NY", customers.get(1763).getState());
	}

	@Test
	@DisplayName("Record 1764: ZIP is 10001")
	void ZIPOfRecord1764() {
		assertEquals("10001", customers.get(1763).getZIP());
	}

	@Test
	@DisplayName("Record 1764: Phone is 212-564-6312")
	void PhoneOfRecord1764() {
		assertEquals("212-564-6312", customers.get(1763).getPhone());
	}

	@Test
	@DisplayName("Record 1764: Fax is 212-564-6321")
	void FaxOfRecord1764() {
		assertEquals("212-564-6321", customers.get(1763).getFax());
	}

	@Test
	@DisplayName("Record 1764: Email is gordon@tobiason.com")
	void EmailOfRecord1764() {
		assertEquals("gordon@tobiason.com", customers.get(1763).getEmail());
	}

	@Test
	@DisplayName("Record 1764: Web is http://www.gordontobiason.com")
	void WebOfRecord1764() {
		assertEquals("http://www.gordontobiason.com", customers.get(1763).getWeb());
	}
}
