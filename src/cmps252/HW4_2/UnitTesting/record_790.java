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

@Tag("22")
class Record_790 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 790: FirstName is Cari")
	void FirstNameOfRecord790() {
		assertEquals("Cari", customers.get(789).getFirstName());
	}

	@Test
	@DisplayName("Record 790: LastName is Reddic")
	void LastNameOfRecord790() {
		assertEquals("Reddic", customers.get(789).getLastName());
	}

	@Test
	@DisplayName("Record 790: Company is Johnson Holler Trees")
	void CompanyOfRecord790() {
		assertEquals("Johnson Holler Trees", customers.get(789).getCompany());
	}

	@Test
	@DisplayName("Record 790: Address is 351030 Scotts Ln")
	void AddressOfRecord790() {
		assertEquals("351030 Scotts Ln", customers.get(789).getAddress());
	}

	@Test
	@DisplayName("Record 790: City is Philadelphia")
	void CityOfRecord790() {
		assertEquals("Philadelphia", customers.get(789).getCity());
	}

	@Test
	@DisplayName("Record 790: County is Philadelphia")
	void CountyOfRecord790() {
		assertEquals("Philadelphia", customers.get(789).getCounty());
	}

	@Test
	@DisplayName("Record 790: State is PA")
	void StateOfRecord790() {
		assertEquals("PA", customers.get(789).getState());
	}

	@Test
	@DisplayName("Record 790: ZIP is 19129")
	void ZIPOfRecord790() {
		assertEquals("19129", customers.get(789).getZIP());
	}

	@Test
	@DisplayName("Record 790: Phone is 215-438-9264")
	void PhoneOfRecord790() {
		assertEquals("215-438-9264", customers.get(789).getPhone());
	}

	@Test
	@DisplayName("Record 790: Fax is 215-438-2891")
	void FaxOfRecord790() {
		assertEquals("215-438-2891", customers.get(789).getFax());
	}

	@Test
	@DisplayName("Record 790: Email is cari@reddic.com")
	void EmailOfRecord790() {
		assertEquals("cari@reddic.com", customers.get(789).getEmail());
	}

	@Test
	@DisplayName("Record 790: Web is http://www.carireddic.com")
	void WebOfRecord790() {
		assertEquals("http://www.carireddic.com", customers.get(789).getWeb());
	}
}
