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

@Tag("14")
class Record_488 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 488: FirstName is Karl")
	void FirstNameOfRecord488() {
		assertEquals("Karl", customers.get(487).getFirstName());
	}

	@Test
	@DisplayName("Record 488: LastName is Kercheff")
	void LastNameOfRecord488() {
		assertEquals("Kercheff", customers.get(487).getLastName());
	}

	@Test
	@DisplayName("Record 488: Company is Fremont Tribune Daily")
	void CompanyOfRecord488() {
		assertEquals("Fremont Tribune Daily", customers.get(487).getCompany());
	}

	@Test
	@DisplayName("Record 488: Address is 655 Waterman Ave")
	void AddressOfRecord488() {
		assertEquals("655 Waterman Ave", customers.get(487).getAddress());
	}

	@Test
	@DisplayName("Record 488: City is East Providence")
	void CityOfRecord488() {
		assertEquals("East Providence", customers.get(487).getCity());
	}

	@Test
	@DisplayName("Record 488: County is Providence")
	void CountyOfRecord488() {
		assertEquals("Providence", customers.get(487).getCounty());
	}

	@Test
	@DisplayName("Record 488: State is RI")
	void StateOfRecord488() {
		assertEquals("RI", customers.get(487).getState());
	}

	@Test
	@DisplayName("Record 488: ZIP is 2914")
	void ZIPOfRecord488() {
		assertEquals("2914", customers.get(487).getZIP());
	}

	@Test
	@DisplayName("Record 488: Phone is 401-438-8800")
	void PhoneOfRecord488() {
		assertEquals("401-438-8800", customers.get(487).getPhone());
	}

	@Test
	@DisplayName("Record 488: Fax is 401-438-3965")
	void FaxOfRecord488() {
		assertEquals("401-438-3965", customers.get(487).getFax());
	}

	@Test
	@DisplayName("Record 488: Email is karl@kercheff.com")
	void EmailOfRecord488() {
		assertEquals("karl@kercheff.com", customers.get(487).getEmail());
	}

	@Test
	@DisplayName("Record 488: Web is http://www.karlkercheff.com")
	void WebOfRecord488() {
		assertEquals("http://www.karlkercheff.com", customers.get(487).getWeb());
	}
}
