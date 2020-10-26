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

@Tag("10")
class Record_1534 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1534: FirstName is Camilla")
	void FirstNameOfRecord1534() {
		assertEquals("Camilla", customers.get(1533).getFirstName());
	}

	@Test
	@DisplayName("Record 1534: LastName is Guadian")
	void LastNameOfRecord1534() {
		assertEquals("Guadian", customers.get(1533).getLastName());
	}

	@Test
	@DisplayName("Record 1534: Company is Tilley Chemical Co")
	void CompanyOfRecord1534() {
		assertEquals("Tilley Chemical Co", customers.get(1533).getCompany());
	}

	@Test
	@DisplayName("Record 1534: Address is 2471 E Bayshore Rd")
	void AddressOfRecord1534() {
		assertEquals("2471 E Bayshore Rd", customers.get(1533).getAddress());
	}

	@Test
	@DisplayName("Record 1534: City is Palo Alto")
	void CityOfRecord1534() {
		assertEquals("Palo Alto", customers.get(1533).getCity());
	}

	@Test
	@DisplayName("Record 1534: County is Santa Clara")
	void CountyOfRecord1534() {
		assertEquals("Santa Clara", customers.get(1533).getCounty());
	}

	@Test
	@DisplayName("Record 1534: State is CA")
	void StateOfRecord1534() {
		assertEquals("CA", customers.get(1533).getState());
	}

	@Test
	@DisplayName("Record 1534: ZIP is 94303")
	void ZIPOfRecord1534() {
		assertEquals("94303", customers.get(1533).getZIP());
	}

	@Test
	@DisplayName("Record 1534: Phone is 650-494-3620")
	void PhoneOfRecord1534() {
		assertEquals("650-494-3620", customers.get(1533).getPhone());
	}

	@Test
	@DisplayName("Record 1534: Fax is 650-494-7299")
	void FaxOfRecord1534() {
		assertEquals("650-494-7299", customers.get(1533).getFax());
	}

	@Test
	@DisplayName("Record 1534: Email is camilla@guadian.com")
	void EmailOfRecord1534() {
		assertEquals("camilla@guadian.com", customers.get(1533).getEmail());
	}

	@Test
	@DisplayName("Record 1534: Web is http://www.camillaguadian.com")
	void WebOfRecord1534() {
		assertEquals("http://www.camillaguadian.com", customers.get(1533).getWeb());
	}
}
