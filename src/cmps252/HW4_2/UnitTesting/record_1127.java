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

@Tag("34")
class Record_1127 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1127: FirstName is Angie")
	void FirstNameOfRecord1127() {
		assertEquals("Angie", customers.get(1126).getFirstName());
	}

	@Test
	@DisplayName("Record 1127: LastName is Easley")
	void LastNameOfRecord1127() {
		assertEquals("Easley", customers.get(1126).getLastName());
	}

	@Test
	@DisplayName("Record 1127: Company is Lewis, John D Esq")
	void CompanyOfRecord1127() {
		assertEquals("Lewis, John D Esq", customers.get(1126).getCompany());
	}

	@Test
	@DisplayName("Record 1127: Address is 271 Wheeler Ave")
	void AddressOfRecord1127() {
		assertEquals("271 Wheeler Ave", customers.get(1126).getAddress());
	}

	@Test
	@DisplayName("Record 1127: City is Bridgeport")
	void CityOfRecord1127() {
		assertEquals("Bridgeport", customers.get(1126).getCity());
	}

	@Test
	@DisplayName("Record 1127: County is Fairfield")
	void CountyOfRecord1127() {
		assertEquals("Fairfield", customers.get(1126).getCounty());
	}

	@Test
	@DisplayName("Record 1127: State is CT")
	void StateOfRecord1127() {
		assertEquals("CT", customers.get(1126).getState());
	}

	@Test
	@DisplayName("Record 1127: ZIP is 6606")
	void ZIPOfRecord1127() {
		assertEquals("6606", customers.get(1126).getZIP());
	}

	@Test
	@DisplayName("Record 1127: Phone is 203-333-3022")
	void PhoneOfRecord1127() {
		assertEquals("203-333-3022", customers.get(1126).getPhone());
	}

	@Test
	@DisplayName("Record 1127: Fax is 203-333-4461")
	void FaxOfRecord1127() {
		assertEquals("203-333-4461", customers.get(1126).getFax());
	}

	@Test
	@DisplayName("Record 1127: Email is angie@easley.com")
	void EmailOfRecord1127() {
		assertEquals("angie@easley.com", customers.get(1126).getEmail());
	}

	@Test
	@DisplayName("Record 1127: Web is http://www.angieeasley.com")
	void WebOfRecord1127() {
		assertEquals("http://www.angieeasley.com", customers.get(1126).getWeb());
	}
}
