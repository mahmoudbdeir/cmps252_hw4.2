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

@Tag("21")
class Record_4337 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4337: FirstName is Nora")
	void FirstNameOfRecord4337() {
		assertEquals("Nora", customers.get(4336).getFirstName());
	}

	@Test
	@DisplayName("Record 4337: LastName is Eager")
	void LastNameOfRecord4337() {
		assertEquals("Eager", customers.get(4336).getLastName());
	}

	@Test
	@DisplayName("Record 4337: Company is T Roe Candace & Associates")
	void CompanyOfRecord4337() {
		assertEquals("T Roe Candace & Associates", customers.get(4336).getCompany());
	}

	@Test
	@DisplayName("Record 4337: Address is 444 Court St")
	void AddressOfRecord4337() {
		assertEquals("444 Court St", customers.get(4336).getAddress());
	}

	@Test
	@DisplayName("Record 4337: City is Muskogee")
	void CityOfRecord4337() {
		assertEquals("Muskogee", customers.get(4336).getCity());
	}

	@Test
	@DisplayName("Record 4337: County is Muskogee")
	void CountyOfRecord4337() {
		assertEquals("Muskogee", customers.get(4336).getCounty());
	}

	@Test
	@DisplayName("Record 4337: State is OK")
	void StateOfRecord4337() {
		assertEquals("OK", customers.get(4336).getState());
	}

	@Test
	@DisplayName("Record 4337: ZIP is 74401")
	void ZIPOfRecord4337() {
		assertEquals("74401", customers.get(4336).getZIP());
	}

	@Test
	@DisplayName("Record 4337: Phone is 918-687-3640")
	void PhoneOfRecord4337() {
		assertEquals("918-687-3640", customers.get(4336).getPhone());
	}

	@Test
	@DisplayName("Record 4337: Fax is 918-687-8765")
	void FaxOfRecord4337() {
		assertEquals("918-687-8765", customers.get(4336).getFax());
	}

	@Test
	@DisplayName("Record 4337: Email is nora@eager.com")
	void EmailOfRecord4337() {
		assertEquals("nora@eager.com", customers.get(4336).getEmail());
	}

	@Test
	@DisplayName("Record 4337: Web is http://www.noraeager.com")
	void WebOfRecord4337() {
		assertEquals("http://www.noraeager.com", customers.get(4336).getWeb());
	}
}
