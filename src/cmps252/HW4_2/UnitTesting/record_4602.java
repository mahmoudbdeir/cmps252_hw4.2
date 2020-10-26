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

@Tag("41")
class Record_4602 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4602: FirstName is Allyson")
	void FirstNameOfRecord4602() {
		assertEquals("Allyson", customers.get(4601).getFirstName());
	}

	@Test
	@DisplayName("Record 4602: LastName is Mylott")
	void LastNameOfRecord4602() {
		assertEquals("Mylott", customers.get(4601).getLastName());
	}

	@Test
	@DisplayName("Record 4602: Company is Cash Register Systems")
	void CompanyOfRecord4602() {
		assertEquals("Cash Register Systems", customers.get(4601).getCompany());
	}

	@Test
	@DisplayName("Record 4602: Address is 19th")
	void AddressOfRecord4602() {
		assertEquals("19th", customers.get(4601).getAddress());
	}

	@Test
	@DisplayName("Record 4602: City is Philadelphia")
	void CityOfRecord4602() {
		assertEquals("Philadelphia", customers.get(4601).getCity());
	}

	@Test
	@DisplayName("Record 4602: County is Philadelphia")
	void CountyOfRecord4602() {
		assertEquals("Philadelphia", customers.get(4601).getCounty());
	}

	@Test
	@DisplayName("Record 4602: State is PA")
	void StateOfRecord4602() {
		assertEquals("PA", customers.get(4601).getState());
	}

	@Test
	@DisplayName("Record 4602: ZIP is 19103")
	void ZIPOfRecord4602() {
		assertEquals("19103", customers.get(4601).getZIP());
	}

	@Test
	@DisplayName("Record 4602: Phone is 215-299-1830")
	void PhoneOfRecord4602() {
		assertEquals("215-299-1830", customers.get(4601).getPhone());
	}

	@Test
	@DisplayName("Record 4602: Fax is 215-299-6197")
	void FaxOfRecord4602() {
		assertEquals("215-299-6197", customers.get(4601).getFax());
	}

	@Test
	@DisplayName("Record 4602: Email is allyson@mylott.com")
	void EmailOfRecord4602() {
		assertEquals("allyson@mylott.com", customers.get(4601).getEmail());
	}

	@Test
	@DisplayName("Record 4602: Web is http://www.allysonmylott.com")
	void WebOfRecord4602() {
		assertEquals("http://www.allysonmylott.com", customers.get(4601).getWeb());
	}
}
