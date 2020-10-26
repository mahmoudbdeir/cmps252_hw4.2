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

@Tag("21")
class Record_630 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 630: FirstName is Jacquelyn")
	void FirstNameOfRecord630() {
		assertEquals("Jacquelyn", customers.get(629).getFirstName());
	}

	@Test
	@DisplayName("Record 630: LastName is Jafari")
	void LastNameOfRecord630() {
		assertEquals("Jafari", customers.get(629).getLastName());
	}

	@Test
	@DisplayName("Record 630: Company is American Record Guide")
	void CompanyOfRecord630() {
		assertEquals("American Record Guide", customers.get(629).getCompany());
	}

	@Test
	@DisplayName("Record 630: Address is 6904 Miramar Rd")
	void AddressOfRecord630() {
		assertEquals("6904 Miramar Rd", customers.get(629).getAddress());
	}

	@Test
	@DisplayName("Record 630: City is San Diego")
	void CityOfRecord630() {
		assertEquals("San Diego", customers.get(629).getCity());
	}

	@Test
	@DisplayName("Record 630: County is San Diego")
	void CountyOfRecord630() {
		assertEquals("San Diego", customers.get(629).getCounty());
	}

	@Test
	@DisplayName("Record 630: State is CA")
	void StateOfRecord630() {
		assertEquals("CA", customers.get(629).getState());
	}

	@Test
	@DisplayName("Record 630: ZIP is 92121")
	void ZIPOfRecord630() {
		assertEquals("92121", customers.get(629).getZIP());
	}

	@Test
	@DisplayName("Record 630: Phone is 858-549-2252")
	void PhoneOfRecord630() {
		assertEquals("858-549-2252", customers.get(629).getPhone());
	}

	@Test
	@DisplayName("Record 630: Fax is 858-549-4423")
	void FaxOfRecord630() {
		assertEquals("858-549-4423", customers.get(629).getFax());
	}

	@Test
	@DisplayName("Record 630: Email is jacquelyn@jafari.com")
	void EmailOfRecord630() {
		assertEquals("jacquelyn@jafari.com", customers.get(629).getEmail());
	}

	@Test
	@DisplayName("Record 630: Web is http://www.jacquelynjafari.com")
	void WebOfRecord630() {
		assertEquals("http://www.jacquelynjafari.com", customers.get(629).getWeb());
	}
}
