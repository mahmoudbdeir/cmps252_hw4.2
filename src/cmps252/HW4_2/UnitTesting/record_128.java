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

@Tag("27")
class Record_128 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 128: FirstName is Flossie")
	void FirstNameOfRecord128() {
		assertEquals("Flossie", customers.get(127).getFirstName());
	}

	@Test
	@DisplayName("Record 128: LastName is Stangel")
	void LastNameOfRecord128() {
		assertEquals("Stangel", customers.get(127).getLastName());
	}

	@Test
	@DisplayName("Record 128: Company is Simaga, Mark A Md")
	void CompanyOfRecord128() {
		assertEquals("Simaga, Mark A Md", customers.get(127).getCompany());
	}

	@Test
	@DisplayName("Record 128: Address is 279 Franklin Ave")
	void AddressOfRecord128() {
		assertEquals("279 Franklin Ave", customers.get(127).getAddress());
	}

	@Test
	@DisplayName("Record 128: City is Wyckoff")
	void CityOfRecord128() {
		assertEquals("Wyckoff", customers.get(127).getCity());
	}

	@Test
	@DisplayName("Record 128: County is Bergen")
	void CountyOfRecord128() {
		assertEquals("Bergen", customers.get(127).getCounty());
	}

	@Test
	@DisplayName("Record 128: State is NJ")
	void StateOfRecord128() {
		assertEquals("NJ", customers.get(127).getState());
	}

	@Test
	@DisplayName("Record 128: ZIP is 7481")
	void ZIPOfRecord128() {
		assertEquals("7481", customers.get(127).getZIP());
	}

	@Test
	@DisplayName("Record 128: Phone is 201-891-9046")
	void PhoneOfRecord128() {
		assertEquals("201-891-9046", customers.get(127).getPhone());
	}

	@Test
	@DisplayName("Record 128: Fax is 201-891-0995")
	void FaxOfRecord128() {
		assertEquals("201-891-0995", customers.get(127).getFax());
	}

	@Test
	@DisplayName("Record 128: Email is flossie@stangel.com")
	void EmailOfRecord128() {
		assertEquals("flossie@stangel.com", customers.get(127).getEmail());
	}

	@Test
	@DisplayName("Record 128: Web is http://www.flossiestangel.com")
	void WebOfRecord128() {
		assertEquals("http://www.flossiestangel.com", customers.get(127).getWeb());
	}
}
