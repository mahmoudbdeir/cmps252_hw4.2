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

@Tag("7")
class Record_1948 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1948: FirstName is Casandra")
	void FirstNameOfRecord1948() {
		assertEquals("Casandra", customers.get(1947).getFirstName());
	}

	@Test
	@DisplayName("Record 1948: LastName is Mountjoy")
	void LastNameOfRecord1948() {
		assertEquals("Mountjoy", customers.get(1947).getLastName());
	}

	@Test
	@DisplayName("Record 1948: Company is Hyatt Hotels & Resorts")
	void CompanyOfRecord1948() {
		assertEquals("Hyatt Hotels & Resorts", customers.get(1947).getCompany());
	}

	@Test
	@DisplayName("Record 1948: Address is 278 Court St")
	void AddressOfRecord1948() {
		assertEquals("278 Court St", customers.get(1947).getAddress());
	}

	@Test
	@DisplayName("Record 1948: City is Plymouth")
	void CityOfRecord1948() {
		assertEquals("Plymouth", customers.get(1947).getCity());
	}

	@Test
	@DisplayName("Record 1948: County is Plymouth")
	void CountyOfRecord1948() {
		assertEquals("Plymouth", customers.get(1947).getCounty());
	}

	@Test
	@DisplayName("Record 1948: State is MA")
	void StateOfRecord1948() {
		assertEquals("MA", customers.get(1947).getState());
	}

	@Test
	@DisplayName("Record 1948: ZIP is 2360")
	void ZIPOfRecord1948() {
		assertEquals("2360", customers.get(1947).getZIP());
	}

	@Test
	@DisplayName("Record 1948: Phone is 508-746-1301")
	void PhoneOfRecord1948() {
		assertEquals("508-746-1301", customers.get(1947).getPhone());
	}

	@Test
	@DisplayName("Record 1948: Fax is 508-746-5855")
	void FaxOfRecord1948() {
		assertEquals("508-746-5855", customers.get(1947).getFax());
	}

	@Test
	@DisplayName("Record 1948: Email is casandra@mountjoy.com")
	void EmailOfRecord1948() {
		assertEquals("casandra@mountjoy.com", customers.get(1947).getEmail());
	}

	@Test
	@DisplayName("Record 1948: Web is http://www.casandramountjoy.com")
	void WebOfRecord1948() {
		assertEquals("http://www.casandramountjoy.com", customers.get(1947).getWeb());
	}
}
