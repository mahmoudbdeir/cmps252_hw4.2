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
class Record_206 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 206: FirstName is Ada")
	void FirstNameOfRecord206() {
		assertEquals("Ada", customers.get(205).getFirstName());
	}

	@Test
	@DisplayName("Record 206: LastName is Tschache")
	void LastNameOfRecord206() {
		assertEquals("Tschache", customers.get(205).getLastName());
	}

	@Test
	@DisplayName("Record 206: Company is Kerrin Graphics & Printing Inc")
	void CompanyOfRecord206() {
		assertEquals("Kerrin Graphics & Printing Inc", customers.get(205).getCompany());
	}

	@Test
	@DisplayName("Record 206: Address is 2753 E Broadway")
	void AddressOfRecord206() {
		assertEquals("2753 E Broadway", customers.get(205).getAddress());
	}

	@Test
	@DisplayName("Record 206: City is Mesa")
	void CityOfRecord206() {
		assertEquals("Mesa", customers.get(205).getCity());
	}

	@Test
	@DisplayName("Record 206: County is Maricopa")
	void CountyOfRecord206() {
		assertEquals("Maricopa", customers.get(205).getCounty());
	}

	@Test
	@DisplayName("Record 206: State is AZ")
	void StateOfRecord206() {
		assertEquals("AZ", customers.get(205).getState());
	}

	@Test
	@DisplayName("Record 206: ZIP is 85204")
	void ZIPOfRecord206() {
		assertEquals("85204", customers.get(205).getZIP());
	}

	@Test
	@DisplayName("Record 206: Phone is 480-649-6597")
	void PhoneOfRecord206() {
		assertEquals("480-649-6597", customers.get(205).getPhone());
	}

	@Test
	@DisplayName("Record 206: Fax is 480-649-7104")
	void FaxOfRecord206() {
		assertEquals("480-649-7104", customers.get(205).getFax());
	}

	@Test
	@DisplayName("Record 206: Email is ada@tschache.com")
	void EmailOfRecord206() {
		assertEquals("ada@tschache.com", customers.get(205).getEmail());
	}

	@Test
	@DisplayName("Record 206: Web is http://www.adatschache.com")
	void WebOfRecord206() {
		assertEquals("http://www.adatschache.com", customers.get(205).getWeb());
	}
}
