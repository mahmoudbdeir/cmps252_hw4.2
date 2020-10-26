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
class Record_694 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 694: FirstName is Sylvia")
	void FirstNameOfRecord694() {
		assertEquals("Sylvia", customers.get(693).getFirstName());
	}

	@Test
	@DisplayName("Record 694: LastName is Graminski")
	void LastNameOfRecord694() {
		assertEquals("Graminski", customers.get(693).getLastName());
	}

	@Test
	@DisplayName("Record 694: Company is Sommers Buick Pontiac")
	void CompanyOfRecord694() {
		assertEquals("Sommers Buick Pontiac", customers.get(693).getCompany());
	}

	@Test
	@DisplayName("Record 694: Address is 2330 Nw Ralygh St")
	void AddressOfRecord694() {
		assertEquals("2330 Nw Ralygh St", customers.get(693).getAddress());
	}

	@Test
	@DisplayName("Record 694: City is Portland")
	void CityOfRecord694() {
		assertEquals("Portland", customers.get(693).getCity());
	}

	@Test
	@DisplayName("Record 694: County is Multnomah")
	void CountyOfRecord694() {
		assertEquals("Multnomah", customers.get(693).getCounty());
	}

	@Test
	@DisplayName("Record 694: State is OR")
	void StateOfRecord694() {
		assertEquals("OR", customers.get(693).getState());
	}

	@Test
	@DisplayName("Record 694: ZIP is 97210")
	void ZIPOfRecord694() {
		assertEquals("97210", customers.get(693).getZIP());
	}

	@Test
	@DisplayName("Record 694: Phone is 503-248-9837")
	void PhoneOfRecord694() {
		assertEquals("503-248-9837", customers.get(693).getPhone());
	}

	@Test
	@DisplayName("Record 694: Fax is 503-248-1529")
	void FaxOfRecord694() {
		assertEquals("503-248-1529", customers.get(693).getFax());
	}

	@Test
	@DisplayName("Record 694: Email is sylvia@graminski.com")
	void EmailOfRecord694() {
		assertEquals("sylvia@graminski.com", customers.get(693).getEmail());
	}

	@Test
	@DisplayName("Record 694: Web is http://www.sylviagraminski.com")
	void WebOfRecord694() {
		assertEquals("http://www.sylviagraminski.com", customers.get(693).getWeb());
	}
}
