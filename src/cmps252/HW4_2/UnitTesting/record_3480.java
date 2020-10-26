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

@Tag("41")
class Record_3480 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3480: FirstName is Rachel")
	void FirstNameOfRecord3480() {
		assertEquals("Rachel", customers.get(3479).getFirstName());
	}

	@Test
	@DisplayName("Record 3480: LastName is Spane")
	void LastNameOfRecord3480() {
		assertEquals("Spane", customers.get(3479).getLastName());
	}

	@Test
	@DisplayName("Record 3480: Company is Stenson, James S Cpa")
	void CompanyOfRecord3480() {
		assertEquals("Stenson, James S Cpa", customers.get(3479).getCompany());
	}

	@Test
	@DisplayName("Record 3480: Address is 855 Waterman Ave")
	void AddressOfRecord3480() {
		assertEquals("855 Waterman Ave", customers.get(3479).getAddress());
	}

	@Test
	@DisplayName("Record 3480: City is East Providence")
	void CityOfRecord3480() {
		assertEquals("East Providence", customers.get(3479).getCity());
	}

	@Test
	@DisplayName("Record 3480: County is Providence")
	void CountyOfRecord3480() {
		assertEquals("Providence", customers.get(3479).getCounty());
	}

	@Test
	@DisplayName("Record 3480: State is RI")
	void StateOfRecord3480() {
		assertEquals("RI", customers.get(3479).getState());
	}

	@Test
	@DisplayName("Record 3480: ZIP is 2914")
	void ZIPOfRecord3480() {
		assertEquals("2914", customers.get(3479).getZIP());
	}

	@Test
	@DisplayName("Record 3480: Phone is 401-434-8877")
	void PhoneOfRecord3480() {
		assertEquals("401-434-8877", customers.get(3479).getPhone());
	}

	@Test
	@DisplayName("Record 3480: Fax is 401-434-4602")
	void FaxOfRecord3480() {
		assertEquals("401-434-4602", customers.get(3479).getFax());
	}

	@Test
	@DisplayName("Record 3480: Email is rachel@spane.com")
	void EmailOfRecord3480() {
		assertEquals("rachel@spane.com", customers.get(3479).getEmail());
	}

	@Test
	@DisplayName("Record 3480: Web is http://www.rachelspane.com")
	void WebOfRecord3480() {
		assertEquals("http://www.rachelspane.com", customers.get(3479).getWeb());
	}
}
