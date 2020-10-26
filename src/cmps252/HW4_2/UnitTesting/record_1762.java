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

@Tag("9")
class Record_1762 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1762: FirstName is Christa")
	void FirstNameOfRecord1762() {
		assertEquals("Christa", customers.get(1761).getFirstName());
	}

	@Test
	@DisplayName("Record 1762: LastName is Florido")
	void LastNameOfRecord1762() {
		assertEquals("Florido", customers.get(1761).getLastName());
	}

	@Test
	@DisplayName("Record 1762: Company is Mallard Press")
	void CompanyOfRecord1762() {
		assertEquals("Mallard Press", customers.get(1761).getCompany());
	}

	@Test
	@DisplayName("Record 1762: Address is 7986 Nw 14th St")
	void AddressOfRecord1762() {
		assertEquals("7986 Nw 14th St", customers.get(1761).getAddress());
	}

	@Test
	@DisplayName("Record 1762: City is Miami")
	void CityOfRecord1762() {
		assertEquals("Miami", customers.get(1761).getCity());
	}

	@Test
	@DisplayName("Record 1762: County is Miami-Dade")
	void CountyOfRecord1762() {
		assertEquals("Miami-Dade", customers.get(1761).getCounty());
	}

	@Test
	@DisplayName("Record 1762: State is FL")
	void StateOfRecord1762() {
		assertEquals("FL", customers.get(1761).getState());
	}

	@Test
	@DisplayName("Record 1762: ZIP is 33126")
	void ZIPOfRecord1762() {
		assertEquals("33126", customers.get(1761).getZIP());
	}

	@Test
	@DisplayName("Record 1762: Phone is 305-599-8484")
	void PhoneOfRecord1762() {
		assertEquals("305-599-8484", customers.get(1761).getPhone());
	}

	@Test
	@DisplayName("Record 1762: Fax is 305-599-0941")
	void FaxOfRecord1762() {
		assertEquals("305-599-0941", customers.get(1761).getFax());
	}

	@Test
	@DisplayName("Record 1762: Email is christa@florido.com")
	void EmailOfRecord1762() {
		assertEquals("christa@florido.com", customers.get(1761).getEmail());
	}

	@Test
	@DisplayName("Record 1762: Web is http://www.christaflorido.com")
	void WebOfRecord1762() {
		assertEquals("http://www.christaflorido.com", customers.get(1761).getWeb());
	}
}
