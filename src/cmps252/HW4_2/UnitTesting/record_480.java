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

@Tag("47")
class Record_480 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 480: FirstName is Wally")
	void FirstNameOfRecord480() {
		assertEquals("Wally", customers.get(479).getFirstName());
	}

	@Test
	@DisplayName("Record 480: LastName is Kartman")
	void LastNameOfRecord480() {
		assertEquals("Kartman", customers.get(479).getLastName());
	}

	@Test
	@DisplayName("Record 480: Company is Mckinnon, Robert S")
	void CompanyOfRecord480() {
		assertEquals("Mckinnon, Robert S", customers.get(479).getCompany());
	}

	@Test
	@DisplayName("Record 480: Address is 529 Ashland Ave")
	void AddressOfRecord480() {
		assertEquals("529 Ashland Ave", customers.get(479).getAddress());
	}

	@Test
	@DisplayName("Record 480: City is Southbridge")
	void CityOfRecord480() {
		assertEquals("Southbridge", customers.get(479).getCity());
	}

	@Test
	@DisplayName("Record 480: County is Worcester")
	void CountyOfRecord480() {
		assertEquals("Worcester", customers.get(479).getCounty());
	}

	@Test
	@DisplayName("Record 480: State is MA")
	void StateOfRecord480() {
		assertEquals("MA", customers.get(479).getState());
	}

	@Test
	@DisplayName("Record 480: ZIP is 1550")
	void ZIPOfRecord480() {
		assertEquals("1550", customers.get(479).getZIP());
	}

	@Test
	@DisplayName("Record 480: Phone is 508-765-6833")
	void PhoneOfRecord480() {
		assertEquals("508-765-6833", customers.get(479).getPhone());
	}

	@Test
	@DisplayName("Record 480: Fax is 508-765-8878")
	void FaxOfRecord480() {
		assertEquals("508-765-8878", customers.get(479).getFax());
	}

	@Test
	@DisplayName("Record 480: Email is wally@kartman.com")
	void EmailOfRecord480() {
		assertEquals("wally@kartman.com", customers.get(479).getEmail());
	}

	@Test
	@DisplayName("Record 480: Web is http://www.wallykartman.com")
	void WebOfRecord480() {
		assertEquals("http://www.wallykartman.com", customers.get(479).getWeb());
	}
}
