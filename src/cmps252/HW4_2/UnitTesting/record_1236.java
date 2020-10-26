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

@Tag("17")
class Record_1236 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1236: FirstName is Luella")
	void FirstNameOfRecord1236() {
		assertEquals("Luella", customers.get(1235).getFirstName());
	}

	@Test
	@DisplayName("Record 1236: LastName is Leser")
	void LastNameOfRecord1236() {
		assertEquals("Leser", customers.get(1235).getLastName());
	}

	@Test
	@DisplayName("Record 1236: Company is Martime Marine Construction")
	void CompanyOfRecord1236() {
		assertEquals("Martime Marine Construction", customers.get(1235).getCompany());
	}

	@Test
	@DisplayName("Record 1236: Address is 1 E Greenway Plz")
	void AddressOfRecord1236() {
		assertEquals("1 E Greenway Plz", customers.get(1235).getAddress());
	}

	@Test
	@DisplayName("Record 1236: City is Houston")
	void CityOfRecord1236() {
		assertEquals("Houston", customers.get(1235).getCity());
	}

	@Test
	@DisplayName("Record 1236: County is Harris")
	void CountyOfRecord1236() {
		assertEquals("Harris", customers.get(1235).getCounty());
	}

	@Test
	@DisplayName("Record 1236: State is TX")
	void StateOfRecord1236() {
		assertEquals("TX", customers.get(1235).getState());
	}

	@Test
	@DisplayName("Record 1236: ZIP is 77046")
	void ZIPOfRecord1236() {
		assertEquals("77046", customers.get(1235).getZIP());
	}

	@Test
	@DisplayName("Record 1236: Phone is 713-622-0442")
	void PhoneOfRecord1236() {
		assertEquals("713-622-0442", customers.get(1235).getPhone());
	}

	@Test
	@DisplayName("Record 1236: Fax is 713-622-6122")
	void FaxOfRecord1236() {
		assertEquals("713-622-6122", customers.get(1235).getFax());
	}

	@Test
	@DisplayName("Record 1236: Email is luella@leser.com")
	void EmailOfRecord1236() {
		assertEquals("luella@leser.com", customers.get(1235).getEmail());
	}

	@Test
	@DisplayName("Record 1236: Web is http://www.luellaleser.com")
	void WebOfRecord1236() {
		assertEquals("http://www.luellaleser.com", customers.get(1235).getWeb());
	}
}
