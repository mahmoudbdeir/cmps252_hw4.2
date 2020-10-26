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

@Tag("48")
class Record_1638 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1638: FirstName is Harlan")
	void FirstNameOfRecord1638() {
		assertEquals("Harlan", customers.get(1637).getFirstName());
	}

	@Test
	@DisplayName("Record 1638: LastName is Horowits")
	void LastNameOfRecord1638() {
		assertEquals("Horowits", customers.get(1637).getLastName());
	}

	@Test
	@DisplayName("Record 1638: Company is Jays Marina")
	void CompanyOfRecord1638() {
		assertEquals("Jays Marina", customers.get(1637).getCompany());
	}

	@Test
	@DisplayName("Record 1638: Address is 2500 Chandler Ave")
	void AddressOfRecord1638() {
		assertEquals("2500 Chandler Ave", customers.get(1637).getAddress());
	}

	@Test
	@DisplayName("Record 1638: City is Las Vegas")
	void CityOfRecord1638() {
		assertEquals("Las Vegas", customers.get(1637).getCity());
	}

	@Test
	@DisplayName("Record 1638: County is Clark")
	void CountyOfRecord1638() {
		assertEquals("Clark", customers.get(1637).getCounty());
	}

	@Test
	@DisplayName("Record 1638: State is NV")
	void StateOfRecord1638() {
		assertEquals("NV", customers.get(1637).getState());
	}

	@Test
	@DisplayName("Record 1638: ZIP is 89120")
	void ZIPOfRecord1638() {
		assertEquals("89120", customers.get(1637).getZIP());
	}

	@Test
	@DisplayName("Record 1638: Phone is 702-736-6050")
	void PhoneOfRecord1638() {
		assertEquals("702-736-6050", customers.get(1637).getPhone());
	}

	@Test
	@DisplayName("Record 1638: Fax is 702-736-5015")
	void FaxOfRecord1638() {
		assertEquals("702-736-5015", customers.get(1637).getFax());
	}

	@Test
	@DisplayName("Record 1638: Email is harlan@horowits.com")
	void EmailOfRecord1638() {
		assertEquals("harlan@horowits.com", customers.get(1637).getEmail());
	}

	@Test
	@DisplayName("Record 1638: Web is http://www.harlanhorowits.com")
	void WebOfRecord1638() {
		assertEquals("http://www.harlanhorowits.com", customers.get(1637).getWeb());
	}
}
