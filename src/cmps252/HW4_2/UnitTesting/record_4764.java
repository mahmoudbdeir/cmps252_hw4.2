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
class Record_4764 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4764: FirstName is Brain")
	void FirstNameOfRecord4764() {
		assertEquals("Brain", customers.get(4763).getFirstName());
	}

	@Test
	@DisplayName("Record 4764: LastName is Ptaschinski")
	void LastNameOfRecord4764() {
		assertEquals("Ptaschinski", customers.get(4763).getLastName());
	}

	@Test
	@DisplayName("Record 4764: Company is National Society Archl Engrs")
	void CompanyOfRecord4764() {
		assertEquals("National Society Archl Engrs", customers.get(4763).getCompany());
	}

	@Test
	@DisplayName("Record 4764: Address is 2943 Daylight Way")
	void AddressOfRecord4764() {
		assertEquals("2943 Daylight Way", customers.get(4763).getAddress());
	}

	@Test
	@DisplayName("Record 4764: City is San Jose")
	void CityOfRecord4764() {
		assertEquals("San Jose", customers.get(4763).getCity());
	}

	@Test
	@DisplayName("Record 4764: County is Santa Clara")
	void CountyOfRecord4764() {
		assertEquals("Santa Clara", customers.get(4763).getCounty());
	}

	@Test
	@DisplayName("Record 4764: State is CA")
	void StateOfRecord4764() {
		assertEquals("CA", customers.get(4763).getState());
	}

	@Test
	@DisplayName("Record 4764: ZIP is 95111")
	void ZIPOfRecord4764() {
		assertEquals("95111", customers.get(4763).getZIP());
	}

	@Test
	@DisplayName("Record 4764: Phone is 408-227-8418")
	void PhoneOfRecord4764() {
		assertEquals("408-227-8418", customers.get(4763).getPhone());
	}

	@Test
	@DisplayName("Record 4764: Fax is 408-227-5751")
	void FaxOfRecord4764() {
		assertEquals("408-227-5751", customers.get(4763).getFax());
	}

	@Test
	@DisplayName("Record 4764: Email is brain@ptaschinski.com")
	void EmailOfRecord4764() {
		assertEquals("brain@ptaschinski.com", customers.get(4763).getEmail());
	}

	@Test
	@DisplayName("Record 4764: Web is http://www.brainptaschinski.com")
	void WebOfRecord4764() {
		assertEquals("http://www.brainptaschinski.com", customers.get(4763).getWeb());
	}
}
