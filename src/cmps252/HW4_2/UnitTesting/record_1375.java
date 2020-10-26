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

@Tag("1")
class Record_1375 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1375: FirstName is Willy")
	void FirstNameOfRecord1375() {
		assertEquals("Willy", customers.get(1374).getFirstName());
	}

	@Test
	@DisplayName("Record 1375: LastName is Skartvedt")
	void LastNameOfRecord1375() {
		assertEquals("Skartvedt", customers.get(1374).getLastName());
	}

	@Test
	@DisplayName("Record 1375: Company is Anderson Industrial Engines Co")
	void CompanyOfRecord1375() {
		assertEquals("Anderson Industrial Engines Co", customers.get(1374).getCompany());
	}

	@Test
	@DisplayName("Record 1375: Address is 2322 New Rd")
	void AddressOfRecord1375() {
		assertEquals("2322 New Rd", customers.get(1374).getAddress());
	}

	@Test
	@DisplayName("Record 1375: City is Northfield")
	void CityOfRecord1375() {
		assertEquals("Northfield", customers.get(1374).getCity());
	}

	@Test
	@DisplayName("Record 1375: County is Atlantic")
	void CountyOfRecord1375() {
		assertEquals("Atlantic", customers.get(1374).getCounty());
	}

	@Test
	@DisplayName("Record 1375: State is NJ")
	void StateOfRecord1375() {
		assertEquals("NJ", customers.get(1374).getState());
	}

	@Test
	@DisplayName("Record 1375: ZIP is 8225")
	void ZIPOfRecord1375() {
		assertEquals("8225", customers.get(1374).getZIP());
	}

	@Test
	@DisplayName("Record 1375: Phone is 609-641-3232")
	void PhoneOfRecord1375() {
		assertEquals("609-641-3232", customers.get(1374).getPhone());
	}

	@Test
	@DisplayName("Record 1375: Fax is 609-641-5334")
	void FaxOfRecord1375() {
		assertEquals("609-641-5334", customers.get(1374).getFax());
	}

	@Test
	@DisplayName("Record 1375: Email is willy@skartvedt.com")
	void EmailOfRecord1375() {
		assertEquals("willy@skartvedt.com", customers.get(1374).getEmail());
	}

	@Test
	@DisplayName("Record 1375: Web is http://www.willyskartvedt.com")
	void WebOfRecord1375() {
		assertEquals("http://www.willyskartvedt.com", customers.get(1374).getWeb());
	}
}
