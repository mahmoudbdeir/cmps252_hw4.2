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

@Tag("11")
class Record_3880 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3880: FirstName is Noah")
	void FirstNameOfRecord3880() {
		assertEquals("Noah", customers.get(3879).getFirstName());
	}

	@Test
	@DisplayName("Record 3880: LastName is Doxbeck")
	void LastNameOfRecord3880() {
		assertEquals("Doxbeck", customers.get(3879).getLastName());
	}

	@Test
	@DisplayName("Record 3880: Company is Chemical Dependency Services")
	void CompanyOfRecord3880() {
		assertEquals("Chemical Dependency Services", customers.get(3879).getCompany());
	}

	@Test
	@DisplayName("Record 3880: Address is 315 Harbor Way")
	void AddressOfRecord3880() {
		assertEquals("315 Harbor Way", customers.get(3879).getAddress());
	}

	@Test
	@DisplayName("Record 3880: City is South San Francisco")
	void CityOfRecord3880() {
		assertEquals("South San Francisco", customers.get(3879).getCity());
	}

	@Test
	@DisplayName("Record 3880: County is San Mateo")
	void CountyOfRecord3880() {
		assertEquals("San Mateo", customers.get(3879).getCounty());
	}

	@Test
	@DisplayName("Record 3880: State is CA")
	void StateOfRecord3880() {
		assertEquals("CA", customers.get(3879).getState());
	}

	@Test
	@DisplayName("Record 3880: ZIP is 94080")
	void ZIPOfRecord3880() {
		assertEquals("94080", customers.get(3879).getZIP());
	}

	@Test
	@DisplayName("Record 3880: Phone is 650-589-9205")
	void PhoneOfRecord3880() {
		assertEquals("650-589-9205", customers.get(3879).getPhone());
	}

	@Test
	@DisplayName("Record 3880: Fax is 650-589-4777")
	void FaxOfRecord3880() {
		assertEquals("650-589-4777", customers.get(3879).getFax());
	}

	@Test
	@DisplayName("Record 3880: Email is noah@doxbeck.com")
	void EmailOfRecord3880() {
		assertEquals("noah@doxbeck.com", customers.get(3879).getEmail());
	}

	@Test
	@DisplayName("Record 3880: Web is http://www.noahdoxbeck.com")
	void WebOfRecord3880() {
		assertEquals("http://www.noahdoxbeck.com", customers.get(3879).getWeb());
	}
}
