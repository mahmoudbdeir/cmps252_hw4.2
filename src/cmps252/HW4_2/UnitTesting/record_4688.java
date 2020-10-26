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

@Tag("29")
class Record_4688 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4688: FirstName is Fryda")
	void FirstNameOfRecord4688() {
		assertEquals("Fryda", customers.get(4687).getFirstName());
	}

	@Test
	@DisplayName("Record 4688: LastName is Schy")
	void LastNameOfRecord4688() {
		assertEquals("Schy", customers.get(4687).getLastName());
	}

	@Test
	@DisplayName("Record 4688: Company is Allied Metal Products Co")
	void CompanyOfRecord4688() {
		assertEquals("Allied Metal Products Co", customers.get(4687).getCompany());
	}

	@Test
	@DisplayName("Record 4688: Address is 2267 Massachusetts Ave")
	void AddressOfRecord4688() {
		assertEquals("2267 Massachusetts Ave", customers.get(4687).getAddress());
	}

	@Test
	@DisplayName("Record 4688: City is Cambridge")
	void CityOfRecord4688() {
		assertEquals("Cambridge", customers.get(4687).getCity());
	}

	@Test
	@DisplayName("Record 4688: County is Middlesex")
	void CountyOfRecord4688() {
		assertEquals("Middlesex", customers.get(4687).getCounty());
	}

	@Test
	@DisplayName("Record 4688: State is MA")
	void StateOfRecord4688() {
		assertEquals("MA", customers.get(4687).getState());
	}

	@Test
	@DisplayName("Record 4688: ZIP is 2140")
	void ZIPOfRecord4688() {
		assertEquals("2140", customers.get(4687).getZIP());
	}

	@Test
	@DisplayName("Record 4688: Phone is 617-868-0433")
	void PhoneOfRecord4688() {
		assertEquals("617-868-0433", customers.get(4687).getPhone());
	}

	@Test
	@DisplayName("Record 4688: Fax is 617-868-4022")
	void FaxOfRecord4688() {
		assertEquals("617-868-4022", customers.get(4687).getFax());
	}

	@Test
	@DisplayName("Record 4688: Email is fryda@schy.com")
	void EmailOfRecord4688() {
		assertEquals("fryda@schy.com", customers.get(4687).getEmail());
	}

	@Test
	@DisplayName("Record 4688: Web is http://www.frydaschy.com")
	void WebOfRecord4688() {
		assertEquals("http://www.frydaschy.com", customers.get(4687).getWeb());
	}
}
