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

@Tag("18")
class Record_1168 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1168: FirstName is Lewis")
	void FirstNameOfRecord1168() {
		assertEquals("Lewis", customers.get(1167).getFirstName());
	}

	@Test
	@DisplayName("Record 1168: LastName is Medez")
	void LastNameOfRecord1168() {
		assertEquals("Medez", customers.get(1167).getLastName());
	}

	@Test
	@DisplayName("Record 1168: Company is Sleep Inn")
	void CompanyOfRecord1168() {
		assertEquals("Sleep Inn", customers.get(1167).getCompany());
	}

	@Test
	@DisplayName("Record 1168: Address is 408 Middle Ave")
	void AddressOfRecord1168() {
		assertEquals("408 Middle Ave", customers.get(1167).getAddress());
	}

	@Test
	@DisplayName("Record 1168: City is Elyria")
	void CityOfRecord1168() {
		assertEquals("Elyria", customers.get(1167).getCity());
	}

	@Test
	@DisplayName("Record 1168: County is Lorain")
	void CountyOfRecord1168() {
		assertEquals("Lorain", customers.get(1167).getCounty());
	}

	@Test
	@DisplayName("Record 1168: State is OH")
	void StateOfRecord1168() {
		assertEquals("OH", customers.get(1167).getState());
	}

	@Test
	@DisplayName("Record 1168: ZIP is 44035")
	void ZIPOfRecord1168() {
		assertEquals("44035", customers.get(1167).getZIP());
	}

	@Test
	@DisplayName("Record 1168: Phone is 440-323-0402")
	void PhoneOfRecord1168() {
		assertEquals("440-323-0402", customers.get(1167).getPhone());
	}

	@Test
	@DisplayName("Record 1168: Fax is 440-323-7852")
	void FaxOfRecord1168() {
		assertEquals("440-323-7852", customers.get(1167).getFax());
	}

	@Test
	@DisplayName("Record 1168: Email is lewis@medez.com")
	void EmailOfRecord1168() {
		assertEquals("lewis@medez.com", customers.get(1167).getEmail());
	}

	@Test
	@DisplayName("Record 1168: Web is http://www.lewismedez.com")
	void WebOfRecord1168() {
		assertEquals("http://www.lewismedez.com", customers.get(1167).getWeb());
	}
}
