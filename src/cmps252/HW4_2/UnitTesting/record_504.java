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

@Tag("27")
class Record_504 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 504: FirstName is Adeline")
	void FirstNameOfRecord504() {
		assertEquals("Adeline", customers.get(503).getFirstName());
	}

	@Test
	@DisplayName("Record 504: LastName is Kilimnik")
	void LastNameOfRecord504() {
		assertEquals("Kilimnik", customers.get(503).getLastName());
	}

	@Test
	@DisplayName("Record 504: Company is Parks County")
	void CompanyOfRecord504() {
		assertEquals("Parks County", customers.get(503).getCompany());
	}

	@Test
	@DisplayName("Record 504: Address is 1300 E 9th St")
	void AddressOfRecord504() {
		assertEquals("1300 E 9th St", customers.get(503).getAddress());
	}

	@Test
	@DisplayName("Record 504: City is Little Rock")
	void CityOfRecord504() {
		assertEquals("Little Rock", customers.get(503).getCity());
	}

	@Test
	@DisplayName("Record 504: County is Pulaski")
	void CountyOfRecord504() {
		assertEquals("Pulaski", customers.get(503).getCounty());
	}

	@Test
	@DisplayName("Record 504: State is AR")
	void StateOfRecord504() {
		assertEquals("AR", customers.get(503).getState());
	}

	@Test
	@DisplayName("Record 504: ZIP is 72202")
	void ZIPOfRecord504() {
		assertEquals("72202", customers.get(503).getZIP());
	}

	@Test
	@DisplayName("Record 504: Phone is 501-372-2176")
	void PhoneOfRecord504() {
		assertEquals("501-372-2176", customers.get(503).getPhone());
	}

	@Test
	@DisplayName("Record 504: Fax is 501-372-7439")
	void FaxOfRecord504() {
		assertEquals("501-372-7439", customers.get(503).getFax());
	}

	@Test
	@DisplayName("Record 504: Email is adeline@kilimnik.com")
	void EmailOfRecord504() {
		assertEquals("adeline@kilimnik.com", customers.get(503).getEmail());
	}

	@Test
	@DisplayName("Record 504: Web is http://www.adelinekilimnik.com")
	void WebOfRecord504() {
		assertEquals("http://www.adelinekilimnik.com", customers.get(503).getWeb());
	}
}
