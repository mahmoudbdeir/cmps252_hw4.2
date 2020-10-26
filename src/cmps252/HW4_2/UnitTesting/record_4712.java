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

@Tag("13")
class Record_4712 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4712: FirstName is Chuck")
	void FirstNameOfRecord4712() {
		assertEquals("Chuck", customers.get(4711).getFirstName());
	}

	@Test
	@DisplayName("Record 4712: LastName is Turnquist")
	void LastNameOfRecord4712() {
		assertEquals("Turnquist", customers.get(4711).getLastName());
	}

	@Test
	@DisplayName("Record 4712: Company is Herald Publishing Co")
	void CompanyOfRecord4712() {
		assertEquals("Herald Publishing Co", customers.get(4711).getCompany());
	}

	@Test
	@DisplayName("Record 4712: Address is 4448 Highway 92")
	void AddressOfRecord4712() {
		assertEquals("4448 Highway 92", customers.get(4711).getAddress());
	}

	@Test
	@DisplayName("Record 4712: City is Douglasville")
	void CityOfRecord4712() {
		assertEquals("Douglasville", customers.get(4711).getCity());
	}

	@Test
	@DisplayName("Record 4712: County is Douglas")
	void CountyOfRecord4712() {
		assertEquals("Douglas", customers.get(4711).getCounty());
	}

	@Test
	@DisplayName("Record 4712: State is GA")
	void StateOfRecord4712() {
		assertEquals("GA", customers.get(4711).getState());
	}

	@Test
	@DisplayName("Record 4712: ZIP is 30135")
	void ZIPOfRecord4712() {
		assertEquals("30135", customers.get(4711).getZIP());
	}

	@Test
	@DisplayName("Record 4712: Phone is 770-949-3477")
	void PhoneOfRecord4712() {
		assertEquals("770-949-3477", customers.get(4711).getPhone());
	}

	@Test
	@DisplayName("Record 4712: Fax is 770-949-9695")
	void FaxOfRecord4712() {
		assertEquals("770-949-9695", customers.get(4711).getFax());
	}

	@Test
	@DisplayName("Record 4712: Email is chuck@turnquist.com")
	void EmailOfRecord4712() {
		assertEquals("chuck@turnquist.com", customers.get(4711).getEmail());
	}

	@Test
	@DisplayName("Record 4712: Web is http://www.chuckturnquist.com")
	void WebOfRecord4712() {
		assertEquals("http://www.chuckturnquist.com", customers.get(4711).getWeb());
	}
}
