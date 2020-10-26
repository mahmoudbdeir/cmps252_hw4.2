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
class Record_226 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 226: FirstName is Brock")
	void FirstNameOfRecord226() {
		assertEquals("Brock", customers.get(225).getFirstName());
	}

	@Test
	@DisplayName("Record 226: LastName is Rysenauer")
	void LastNameOfRecord226() {
		assertEquals("Rysenauer", customers.get(225).getLastName());
	}

	@Test
	@DisplayName("Record 226: Company is Chamisa Associates")
	void CompanyOfRecord226() {
		assertEquals("Chamisa Associates", customers.get(225).getCompany());
	}

	@Test
	@DisplayName("Record 226: Address is 14110 Aston St")
	void AddressOfRecord226() {
		assertEquals("14110 Aston St", customers.get(225).getAddress());
	}

	@Test
	@DisplayName("Record 226: City is Houston")
	void CityOfRecord226() {
		assertEquals("Houston", customers.get(225).getCity());
	}

	@Test
	@DisplayName("Record 226: County is Harris")
	void CountyOfRecord226() {
		assertEquals("Harris", customers.get(225).getCounty());
	}

	@Test
	@DisplayName("Record 226: State is TX")
	void StateOfRecord226() {
		assertEquals("TX", customers.get(225).getState());
	}

	@Test
	@DisplayName("Record 226: ZIP is 77040")
	void ZIPOfRecord226() {
		assertEquals("77040", customers.get(225).getZIP());
	}

	@Test
	@DisplayName("Record 226: Phone is 713-690-9305")
	void PhoneOfRecord226() {
		assertEquals("713-690-9305", customers.get(225).getPhone());
	}

	@Test
	@DisplayName("Record 226: Fax is 713-690-6534")
	void FaxOfRecord226() {
		assertEquals("713-690-6534", customers.get(225).getFax());
	}

	@Test
	@DisplayName("Record 226: Email is brock@rysenauer.com")
	void EmailOfRecord226() {
		assertEquals("brock@rysenauer.com", customers.get(225).getEmail());
	}

	@Test
	@DisplayName("Record 226: Web is http://www.brockrysenauer.com")
	void WebOfRecord226() {
		assertEquals("http://www.brockrysenauer.com", customers.get(225).getWeb());
	}
}
