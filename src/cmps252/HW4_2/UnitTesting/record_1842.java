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

@Tag("13")
class Record_1842 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1842: FirstName is Cruz")
	void FirstNameOfRecord1842() {
		assertEquals("Cruz", customers.get(1841).getFirstName());
	}

	@Test
	@DisplayName("Record 1842: LastName is Jaurequi")
	void LastNameOfRecord1842() {
		assertEquals("Jaurequi", customers.get(1841).getLastName());
	}

	@Test
	@DisplayName("Record 1842: Company is Alga Lampshade Co")
	void CompanyOfRecord1842() {
		assertEquals("Alga Lampshade Co", customers.get(1841).getCompany());
	}

	@Test
	@DisplayName("Record 1842: Address is 4431 Us Highway 9")
	void AddressOfRecord1842() {
		assertEquals("4431 Us Highway 9", customers.get(1841).getAddress());
	}

	@Test
	@DisplayName("Record 1842: City is Howell")
	void CityOfRecord1842() {
		assertEquals("Howell", customers.get(1841).getCity());
	}

	@Test
	@DisplayName("Record 1842: County is Monmouth")
	void CountyOfRecord1842() {
		assertEquals("Monmouth", customers.get(1841).getCounty());
	}

	@Test
	@DisplayName("Record 1842: State is NJ")
	void StateOfRecord1842() {
		assertEquals("NJ", customers.get(1841).getState());
	}

	@Test
	@DisplayName("Record 1842: ZIP is 7731")
	void ZIPOfRecord1842() {
		assertEquals("7731", customers.get(1841).getZIP());
	}

	@Test
	@DisplayName("Record 1842: Phone is 732-363-2959")
	void PhoneOfRecord1842() {
		assertEquals("732-363-2959", customers.get(1841).getPhone());
	}

	@Test
	@DisplayName("Record 1842: Fax is 732-363-9066")
	void FaxOfRecord1842() {
		assertEquals("732-363-9066", customers.get(1841).getFax());
	}

	@Test
	@DisplayName("Record 1842: Email is cruz@jaurequi.com")
	void EmailOfRecord1842() {
		assertEquals("cruz@jaurequi.com", customers.get(1841).getEmail());
	}

	@Test
	@DisplayName("Record 1842: Web is http://www.cruzjaurequi.com")
	void WebOfRecord1842() {
		assertEquals("http://www.cruzjaurequi.com", customers.get(1841).getWeb());
	}
}
