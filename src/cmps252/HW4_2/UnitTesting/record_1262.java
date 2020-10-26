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

@Tag("37")
class Record_1262 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1262: FirstName is Cecile")
	void FirstNameOfRecord1262() {
		assertEquals("Cecile", customers.get(1261).getFirstName());
	}

	@Test
	@DisplayName("Record 1262: LastName is Lorey")
	void LastNameOfRecord1262() {
		assertEquals("Lorey", customers.get(1261).getLastName());
	}

	@Test
	@DisplayName("Record 1262: Company is Capitol Publishing Co")
	void CompanyOfRecord1262() {
		assertEquals("Capitol Publishing Co", customers.get(1261).getCompany());
	}

	@Test
	@DisplayName("Record 1262: Address is 24 E 81st St")
	void AddressOfRecord1262() {
		assertEquals("24 E 81st St", customers.get(1261).getAddress());
	}

	@Test
	@DisplayName("Record 1262: City is New York")
	void CityOfRecord1262() {
		assertEquals("New York", customers.get(1261).getCity());
	}

	@Test
	@DisplayName("Record 1262: County is New York")
	void CountyOfRecord1262() {
		assertEquals("New York", customers.get(1261).getCounty());
	}

	@Test
	@DisplayName("Record 1262: State is NY")
	void StateOfRecord1262() {
		assertEquals("NY", customers.get(1261).getState());
	}

	@Test
	@DisplayName("Record 1262: ZIP is 10028")
	void ZIPOfRecord1262() {
		assertEquals("10028", customers.get(1261).getZIP());
	}

	@Test
	@DisplayName("Record 1262: Phone is 212-288-7268")
	void PhoneOfRecord1262() {
		assertEquals("212-288-7268", customers.get(1261).getPhone());
	}

	@Test
	@DisplayName("Record 1262: Fax is 212-288-9684")
	void FaxOfRecord1262() {
		assertEquals("212-288-9684", customers.get(1261).getFax());
	}

	@Test
	@DisplayName("Record 1262: Email is cecile@lorey.com")
	void EmailOfRecord1262() {
		assertEquals("cecile@lorey.com", customers.get(1261).getEmail());
	}

	@Test
	@DisplayName("Record 1262: Web is http://www.cecilelorey.com")
	void WebOfRecord1262() {
		assertEquals("http://www.cecilelorey.com", customers.get(1261).getWeb());
	}
}
