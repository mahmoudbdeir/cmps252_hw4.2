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

@Tag("46")
class Record_3750 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3750: FirstName is Noah")
	void FirstNameOfRecord3750() {
		assertEquals("Noah", customers.get(3749).getFirstName());
	}

	@Test
	@DisplayName("Record 3750: LastName is Pontarelli")
	void LastNameOfRecord3750() {
		assertEquals("Pontarelli", customers.get(3749).getLastName());
	}

	@Test
	@DisplayName("Record 3750: Company is Hurst, Bruce H Esq")
	void CompanyOfRecord3750() {
		assertEquals("Hurst, Bruce H Esq", customers.get(3749).getCompany());
	}

	@Test
	@DisplayName("Record 3750: Address is 6427 Roswell Rd Ne")
	void AddressOfRecord3750() {
		assertEquals("6427 Roswell Rd Ne", customers.get(3749).getAddress());
	}

	@Test
	@DisplayName("Record 3750: City is Atlanta")
	void CityOfRecord3750() {
		assertEquals("Atlanta", customers.get(3749).getCity());
	}

	@Test
	@DisplayName("Record 3750: County is Fulton")
	void CountyOfRecord3750() {
		assertEquals("Fulton", customers.get(3749).getCounty());
	}

	@Test
	@DisplayName("Record 3750: State is GA")
	void StateOfRecord3750() {
		assertEquals("GA", customers.get(3749).getState());
	}

	@Test
	@DisplayName("Record 3750: ZIP is 30328")
	void ZIPOfRecord3750() {
		assertEquals("30328", customers.get(3749).getZIP());
	}

	@Test
	@DisplayName("Record 3750: Phone is 770-255-4626")
	void PhoneOfRecord3750() {
		assertEquals("770-255-4626", customers.get(3749).getPhone());
	}

	@Test
	@DisplayName("Record 3750: Fax is 770-255-7461")
	void FaxOfRecord3750() {
		assertEquals("770-255-7461", customers.get(3749).getFax());
	}

	@Test
	@DisplayName("Record 3750: Email is noah@pontarelli.com")
	void EmailOfRecord3750() {
		assertEquals("noah@pontarelli.com", customers.get(3749).getEmail());
	}

	@Test
	@DisplayName("Record 3750: Web is http://www.noahpontarelli.com")
	void WebOfRecord3750() {
		assertEquals("http://www.noahpontarelli.com", customers.get(3749).getWeb());
	}
}
