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

@Tag("5")
class Record_180 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 180: FirstName is Mitch")
	void FirstNameOfRecord180() {
		assertEquals("Mitch", customers.get(179).getFirstName());
	}

	@Test
	@DisplayName("Record 180: LastName is Larason")
	void LastNameOfRecord180() {
		assertEquals("Larason", customers.get(179).getLastName());
	}

	@Test
	@DisplayName("Record 180: Company is Main Library")
	void CompanyOfRecord180() {
		assertEquals("Main Library", customers.get(179).getCompany());
	}

	@Test
	@DisplayName("Record 180: Address is 2718 Uwharrie Rd")
	void AddressOfRecord180() {
		assertEquals("2718 Uwharrie Rd", customers.get(179).getAddress());
	}

	@Test
	@DisplayName("Record 180: City is High Point")
	void CityOfRecord180() {
		assertEquals("High Point", customers.get(179).getCity());
	}

	@Test
	@DisplayName("Record 180: County is Guilford")
	void CountyOfRecord180() {
		assertEquals("Guilford", customers.get(179).getCounty());
	}

	@Test
	@DisplayName("Record 180: State is NC")
	void StateOfRecord180() {
		assertEquals("NC", customers.get(179).getState());
	}

	@Test
	@DisplayName("Record 180: ZIP is 27263")
	void ZIPOfRecord180() {
		assertEquals("27263", customers.get(179).getZIP());
	}

	@Test
	@DisplayName("Record 180: Phone is 336-434-6444")
	void PhoneOfRecord180() {
		assertEquals("336-434-6444", customers.get(179).getPhone());
	}

	@Test
	@DisplayName("Record 180: Fax is 336-434-5929")
	void FaxOfRecord180() {
		assertEquals("336-434-5929", customers.get(179).getFax());
	}

	@Test
	@DisplayName("Record 180: Email is mitch@larason.com")
	void EmailOfRecord180() {
		assertEquals("mitch@larason.com", customers.get(179).getEmail());
	}

	@Test
	@DisplayName("Record 180: Web is http://www.mitchlarason.com")
	void WebOfRecord180() {
		assertEquals("http://www.mitchlarason.com", customers.get(179).getWeb());
	}
}
