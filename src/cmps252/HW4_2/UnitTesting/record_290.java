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

@Tag("45")
class Record_290 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 290: FirstName is Wallace")
	void FirstNameOfRecord290() {
		assertEquals("Wallace", customers.get(289).getFirstName());
	}

	@Test
	@DisplayName("Record 290: LastName is Duerkson")
	void LastNameOfRecord290() {
		assertEquals("Duerkson", customers.get(289).getLastName());
	}

	@Test
	@DisplayName("Record 290: Company is Le Bon Bread")
	void CompanyOfRecord290() {
		assertEquals("Le Bon Bread", customers.get(289).getCompany());
	}

	@Test
	@DisplayName("Record 290: Address is 1677 Pacific Coast Hwy")
	void AddressOfRecord290() {
		assertEquals("1677 Pacific Coast Hwy", customers.get(289).getAddress());
	}

	@Test
	@DisplayName("Record 290: City is Harbor City")
	void CityOfRecord290() {
		assertEquals("Harbor City", customers.get(289).getCity());
	}

	@Test
	@DisplayName("Record 290: County is Los Angeles")
	void CountyOfRecord290() {
		assertEquals("Los Angeles", customers.get(289).getCounty());
	}

	@Test
	@DisplayName("Record 290: State is CA")
	void StateOfRecord290() {
		assertEquals("CA", customers.get(289).getState());
	}

	@Test
	@DisplayName("Record 290: ZIP is 90710")
	void ZIPOfRecord290() {
		assertEquals("90710", customers.get(289).getZIP());
	}

	@Test
	@DisplayName("Record 290: Phone is 310-325-5305")
	void PhoneOfRecord290() {
		assertEquals("310-325-5305", customers.get(289).getPhone());
	}

	@Test
	@DisplayName("Record 290: Fax is 310-325-4211")
	void FaxOfRecord290() {
		assertEquals("310-325-4211", customers.get(289).getFax());
	}

	@Test
	@DisplayName("Record 290: Email is wallace@duerkson.com")
	void EmailOfRecord290() {
		assertEquals("wallace@duerkson.com", customers.get(289).getEmail());
	}

	@Test
	@DisplayName("Record 290: Web is http://www.wallaceduerkson.com")
	void WebOfRecord290() {
		assertEquals("http://www.wallaceduerkson.com", customers.get(289).getWeb());
	}
}
