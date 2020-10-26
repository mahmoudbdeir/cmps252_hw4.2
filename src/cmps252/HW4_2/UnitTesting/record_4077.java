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

@Tag("37")
class Record_4077 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4077: FirstName is Della")
	void FirstNameOfRecord4077() {
		assertEquals("Della", customers.get(4076).getFirstName());
	}

	@Test
	@DisplayName("Record 4077: LastName is Kitagawa")
	void LastNameOfRecord4077() {
		assertEquals("Kitagawa", customers.get(4076).getLastName());
	}

	@Test
	@DisplayName("Record 4077: Company is Forestry Sciences Laboratory")
	void CompanyOfRecord4077() {
		assertEquals("Forestry Sciences Laboratory", customers.get(4076).getCompany());
	}

	@Test
	@DisplayName("Record 4077: Address is 7451 Nw 63rd St")
	void AddressOfRecord4077() {
		assertEquals("7451 Nw 63rd St", customers.get(4076).getAddress());
	}

	@Test
	@DisplayName("Record 4077: City is Miami")
	void CityOfRecord4077() {
		assertEquals("Miami", customers.get(4076).getCity());
	}

	@Test
	@DisplayName("Record 4077: County is Miami-Dade")
	void CountyOfRecord4077() {
		assertEquals("Miami-Dade", customers.get(4076).getCounty());
	}

	@Test
	@DisplayName("Record 4077: State is FL")
	void StateOfRecord4077() {
		assertEquals("FL", customers.get(4076).getState());
	}

	@Test
	@DisplayName("Record 4077: ZIP is 33166")
	void ZIPOfRecord4077() {
		assertEquals("33166", customers.get(4076).getZIP());
	}

	@Test
	@DisplayName("Record 4077: Phone is 305-592-5305")
	void PhoneOfRecord4077() {
		assertEquals("305-592-5305", customers.get(4076).getPhone());
	}

	@Test
	@DisplayName("Record 4077: Fax is 305-592-2629")
	void FaxOfRecord4077() {
		assertEquals("305-592-2629", customers.get(4076).getFax());
	}

	@Test
	@DisplayName("Record 4077: Email is della@kitagawa.com")
	void EmailOfRecord4077() {
		assertEquals("della@kitagawa.com", customers.get(4076).getEmail());
	}

	@Test
	@DisplayName("Record 4077: Web is http://www.dellakitagawa.com")
	void WebOfRecord4077() {
		assertEquals("http://www.dellakitagawa.com", customers.get(4076).getWeb());
	}
}
