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

@Tag("32")
class Record_2331 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2331: FirstName is Wm")
	void FirstNameOfRecord2331() {
		assertEquals("Wm", customers.get(2330).getFirstName());
	}

	@Test
	@DisplayName("Record 2331: LastName is Oldfield")
	void LastNameOfRecord2331() {
		assertEquals("Oldfield", customers.get(2330).getLastName());
	}

	@Test
	@DisplayName("Record 2331: Company is Sir Speedy Printing Centers")
	void CompanyOfRecord2331() {
		assertEquals("Sir Speedy Printing Centers", customers.get(2330).getCompany());
	}

	@Test
	@DisplayName("Record 2331: Address is 1801 Century Park E")
	void AddressOfRecord2331() {
		assertEquals("1801 Century Park E", customers.get(2330).getAddress());
	}

	@Test
	@DisplayName("Record 2331: City is Los Angeles")
	void CityOfRecord2331() {
		assertEquals("Los Angeles", customers.get(2330).getCity());
	}

	@Test
	@DisplayName("Record 2331: County is Los Angeles")
	void CountyOfRecord2331() {
		assertEquals("Los Angeles", customers.get(2330).getCounty());
	}

	@Test
	@DisplayName("Record 2331: State is CA")
	void StateOfRecord2331() {
		assertEquals("CA", customers.get(2330).getState());
	}

	@Test
	@DisplayName("Record 2331: ZIP is 90067")
	void ZIPOfRecord2331() {
		assertEquals("90067", customers.get(2330).getZIP());
	}

	@Test
	@DisplayName("Record 2331: Phone is 310-201-2516")
	void PhoneOfRecord2331() {
		assertEquals("310-201-2516", customers.get(2330).getPhone());
	}

	@Test
	@DisplayName("Record 2331: Fax is 310-201-9772")
	void FaxOfRecord2331() {
		assertEquals("310-201-9772", customers.get(2330).getFax());
	}

	@Test
	@DisplayName("Record 2331: Email is wm@oldfield.com")
	void EmailOfRecord2331() {
		assertEquals("wm@oldfield.com", customers.get(2330).getEmail());
	}

	@Test
	@DisplayName("Record 2331: Web is http://www.wmoldfield.com")
	void WebOfRecord2331() {
		assertEquals("http://www.wmoldfield.com", customers.get(2330).getWeb());
	}
}
