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

@Tag("19")
class Record_914 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 914: FirstName is Sherri")
	void FirstNameOfRecord914() {
		assertEquals("Sherri", customers.get(913).getFirstName());
	}

	@Test
	@DisplayName("Record 914: LastName is Romaine")
	void LastNameOfRecord914() {
		assertEquals("Romaine", customers.get(913).getLastName());
	}

	@Test
	@DisplayName("Record 914: Company is Varnum Armstrong Deeter Inc")
	void CompanyOfRecord914() {
		assertEquals("Varnum Armstrong Deeter Inc", customers.get(913).getCompany());
	}

	@Test
	@DisplayName("Record 914: Address is 11912 Mississippi Ave")
	void AddressOfRecord914() {
		assertEquals("11912 Mississippi Ave", customers.get(913).getAddress());
	}

	@Test
	@DisplayName("Record 914: City is Los Angeles")
	void CityOfRecord914() {
		assertEquals("Los Angeles", customers.get(913).getCity());
	}

	@Test
	@DisplayName("Record 914: County is Los Angeles")
	void CountyOfRecord914() {
		assertEquals("Los Angeles", customers.get(913).getCounty());
	}

	@Test
	@DisplayName("Record 914: State is CA")
	void StateOfRecord914() {
		assertEquals("CA", customers.get(913).getState());
	}

	@Test
	@DisplayName("Record 914: ZIP is 90025")
	void ZIPOfRecord914() {
		assertEquals("90025", customers.get(913).getZIP());
	}

	@Test
	@DisplayName("Record 914: Phone is 310-478-0210")
	void PhoneOfRecord914() {
		assertEquals("310-478-0210", customers.get(913).getPhone());
	}

	@Test
	@DisplayName("Record 914: Fax is 310-478-2173")
	void FaxOfRecord914() {
		assertEquals("310-478-2173", customers.get(913).getFax());
	}

	@Test
	@DisplayName("Record 914: Email is sherri@romaine.com")
	void EmailOfRecord914() {
		assertEquals("sherri@romaine.com", customers.get(913).getEmail());
	}

	@Test
	@DisplayName("Record 914: Web is http://www.sherriromaine.com")
	void WebOfRecord914() {
		assertEquals("http://www.sherriromaine.com", customers.get(913).getWeb());
	}
}
