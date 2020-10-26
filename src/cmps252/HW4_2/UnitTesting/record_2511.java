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

@Tag("38")
class Record_2511 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2511: FirstName is Tammy")
	void FirstNameOfRecord2511() {
		assertEquals("Tammy", customers.get(2510).getFirstName());
	}

	@Test
	@DisplayName("Record 2511: LastName is Tuite")
	void LastNameOfRecord2511() {
		assertEquals("Tuite", customers.get(2510).getLastName());
	}

	@Test
	@DisplayName("Record 2511: Company is Fort Bend Chamber Of Commerce")
	void CompanyOfRecord2511() {
		assertEquals("Fort Bend Chamber Of Commerce", customers.get(2510).getCompany());
	}

	@Test
	@DisplayName("Record 2511: Address is 2750 Bergey Rd")
	void AddressOfRecord2511() {
		assertEquals("2750 Bergey Rd", customers.get(2510).getAddress());
	}

	@Test
	@DisplayName("Record 2511: City is Hatfield")
	void CityOfRecord2511() {
		assertEquals("Hatfield", customers.get(2510).getCity());
	}

	@Test
	@DisplayName("Record 2511: County is Montgomery")
	void CountyOfRecord2511() {
		assertEquals("Montgomery", customers.get(2510).getCounty());
	}

	@Test
	@DisplayName("Record 2511: State is PA")
	void StateOfRecord2511() {
		assertEquals("PA", customers.get(2510).getState());
	}

	@Test
	@DisplayName("Record 2511: ZIP is 19440")
	void ZIPOfRecord2511() {
		assertEquals("19440", customers.get(2510).getZIP());
	}

	@Test
	@DisplayName("Record 2511: Phone is 215-997-9299")
	void PhoneOfRecord2511() {
		assertEquals("215-997-9299", customers.get(2510).getPhone());
	}

	@Test
	@DisplayName("Record 2511: Fax is 215-997-4012")
	void FaxOfRecord2511() {
		assertEquals("215-997-4012", customers.get(2510).getFax());
	}

	@Test
	@DisplayName("Record 2511: Email is tammy@tuite.com")
	void EmailOfRecord2511() {
		assertEquals("tammy@tuite.com", customers.get(2510).getEmail());
	}

	@Test
	@DisplayName("Record 2511: Web is http://www.tammytuite.com")
	void WebOfRecord2511() {
		assertEquals("http://www.tammytuite.com", customers.get(2510).getWeb());
	}
}
