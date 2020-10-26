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

@Tag("5")
class Record_2221 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2221: FirstName is Vida")
	void FirstNameOfRecord2221() {
		assertEquals("Vida", customers.get(2220).getFirstName());
	}

	@Test
	@DisplayName("Record 2221: LastName is Hashaway")
	void LastNameOfRecord2221() {
		assertEquals("Hashaway", customers.get(2220).getLastName());
	}

	@Test
	@DisplayName("Record 2221: Company is Musick Peeler & Garrett")
	void CompanyOfRecord2221() {
		assertEquals("Musick Peeler & Garrett", customers.get(2220).getCompany());
	}

	@Test
	@DisplayName("Record 2221: Address is 7547 Rosecrans Ave")
	void AddressOfRecord2221() {
		assertEquals("7547 Rosecrans Ave", customers.get(2220).getAddress());
	}

	@Test
	@DisplayName("Record 2221: City is Paramount")
	void CityOfRecord2221() {
		assertEquals("Paramount", customers.get(2220).getCity());
	}

	@Test
	@DisplayName("Record 2221: County is Los Angeles")
	void CountyOfRecord2221() {
		assertEquals("Los Angeles", customers.get(2220).getCounty());
	}

	@Test
	@DisplayName("Record 2221: State is CA")
	void StateOfRecord2221() {
		assertEquals("CA", customers.get(2220).getState());
	}

	@Test
	@DisplayName("Record 2221: ZIP is 90723")
	void ZIPOfRecord2221() {
		assertEquals("90723", customers.get(2220).getZIP());
	}

	@Test
	@DisplayName("Record 2221: Phone is 562-634-0333")
	void PhoneOfRecord2221() {
		assertEquals("562-634-0333", customers.get(2220).getPhone());
	}

	@Test
	@DisplayName("Record 2221: Fax is 562-634-2964")
	void FaxOfRecord2221() {
		assertEquals("562-634-2964", customers.get(2220).getFax());
	}

	@Test
	@DisplayName("Record 2221: Email is vida@hashaway.com")
	void EmailOfRecord2221() {
		assertEquals("vida@hashaway.com", customers.get(2220).getEmail());
	}

	@Test
	@DisplayName("Record 2221: Web is http://www.vidahashaway.com")
	void WebOfRecord2221() {
		assertEquals("http://www.vidahashaway.com", customers.get(2220).getWeb());
	}
}
