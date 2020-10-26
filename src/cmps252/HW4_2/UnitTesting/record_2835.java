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

@Tag("42")
class Record_2835 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2835: FirstName is Hollis")
	void FirstNameOfRecord2835() {
		assertEquals("Hollis", customers.get(2834).getFirstName());
	}

	@Test
	@DisplayName("Record 2835: LastName is Sondles")
	void LastNameOfRecord2835() {
		assertEquals("Sondles", customers.get(2834).getLastName());
	}

	@Test
	@DisplayName("Record 2835: Company is Alaska Fish Fertilizer Co")
	void CompanyOfRecord2835() {
		assertEquals("Alaska Fish Fertilizer Co", customers.get(2834).getCompany());
	}

	@Test
	@DisplayName("Record 2835: Address is 114 E Perimeter Rd")
	void AddressOfRecord2835() {
		assertEquals("114 E Perimeter Rd", customers.get(2834).getAddress());
	}

	@Test
	@DisplayName("Record 2835: City is Nashua")
	void CityOfRecord2835() {
		assertEquals("Nashua", customers.get(2834).getCity());
	}

	@Test
	@DisplayName("Record 2835: County is Hillsborough")
	void CountyOfRecord2835() {
		assertEquals("Hillsborough", customers.get(2834).getCounty());
	}

	@Test
	@DisplayName("Record 2835: State is NH")
	void StateOfRecord2835() {
		assertEquals("NH", customers.get(2834).getState());
	}

	@Test
	@DisplayName("Record 2835: ZIP is 3063")
	void ZIPOfRecord2835() {
		assertEquals("3063", customers.get(2834).getZIP());
	}

	@Test
	@DisplayName("Record 2835: Phone is 603-882-1265")
	void PhoneOfRecord2835() {
		assertEquals("603-882-1265", customers.get(2834).getPhone());
	}

	@Test
	@DisplayName("Record 2835: Fax is 603-882-1835")
	void FaxOfRecord2835() {
		assertEquals("603-882-1835", customers.get(2834).getFax());
	}

	@Test
	@DisplayName("Record 2835: Email is hollis@sondles.com")
	void EmailOfRecord2835() {
		assertEquals("hollis@sondles.com", customers.get(2834).getEmail());
	}

	@Test
	@DisplayName("Record 2835: Web is http://www.hollissondles.com")
	void WebOfRecord2835() {
		assertEquals("http://www.hollissondles.com", customers.get(2834).getWeb());
	}
}
