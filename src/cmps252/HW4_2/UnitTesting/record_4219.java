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

@Tag("46")
class Record_4219 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4219: FirstName is Stewart")
	void FirstNameOfRecord4219() {
		assertEquals("Stewart", customers.get(4218).getFirstName());
	}

	@Test
	@DisplayName("Record 4219: LastName is Nolder")
	void LastNameOfRecord4219() {
		assertEquals("Nolder", customers.get(4218).getLastName());
	}

	@Test
	@DisplayName("Record 4219: Company is Garden Complements Inc")
	void CompanyOfRecord4219() {
		assertEquals("Garden Complements Inc", customers.get(4218).getCompany());
	}

	@Test
	@DisplayName("Record 4219: Address is 6661 Arapahoe Rd")
	void AddressOfRecord4219() {
		assertEquals("6661 Arapahoe Rd", customers.get(4218).getAddress());
	}

	@Test
	@DisplayName("Record 4219: City is Boulder")
	void CityOfRecord4219() {
		assertEquals("Boulder", customers.get(4218).getCity());
	}

	@Test
	@DisplayName("Record 4219: County is Boulder")
	void CountyOfRecord4219() {
		assertEquals("Boulder", customers.get(4218).getCounty());
	}

	@Test
	@DisplayName("Record 4219: State is CO")
	void StateOfRecord4219() {
		assertEquals("CO", customers.get(4218).getState());
	}

	@Test
	@DisplayName("Record 4219: ZIP is 80303")
	void ZIPOfRecord4219() {
		assertEquals("80303", customers.get(4218).getZIP());
	}

	@Test
	@DisplayName("Record 4219: Phone is 303-449-4725")
	void PhoneOfRecord4219() {
		assertEquals("303-449-4725", customers.get(4218).getPhone());
	}

	@Test
	@DisplayName("Record 4219: Fax is 303-449-1526")
	void FaxOfRecord4219() {
		assertEquals("303-449-1526", customers.get(4218).getFax());
	}

	@Test
	@DisplayName("Record 4219: Email is stewart@nolder.com")
	void EmailOfRecord4219() {
		assertEquals("stewart@nolder.com", customers.get(4218).getEmail());
	}

	@Test
	@DisplayName("Record 4219: Web is http://www.stewartnolder.com")
	void WebOfRecord4219() {
		assertEquals("http://www.stewartnolder.com", customers.get(4218).getWeb());
	}
}
