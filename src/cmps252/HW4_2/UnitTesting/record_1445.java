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
class Record_1445 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1445: FirstName is Philip")
	void FirstNameOfRecord1445() {
		assertEquals("Philip", customers.get(1444).getFirstName());
	}

	@Test
	@DisplayName("Record 1445: LastName is Fraine")
	void LastNameOfRecord1445() {
		assertEquals("Fraine", customers.get(1444).getLastName());
	}

	@Test
	@DisplayName("Record 1445: Company is Charles Schwab & Co Inc")
	void CompanyOfRecord1445() {
		assertEquals("Charles Schwab & Co Inc", customers.get(1444).getCompany());
	}

	@Test
	@DisplayName("Record 1445: Address is 313 W Airport Fwy")
	void AddressOfRecord1445() {
		assertEquals("313 W Airport Fwy", customers.get(1444).getAddress());
	}

	@Test
	@DisplayName("Record 1445: City is Irving")
	void CityOfRecord1445() {
		assertEquals("Irving", customers.get(1444).getCity());
	}

	@Test
	@DisplayName("Record 1445: County is Dallas")
	void CountyOfRecord1445() {
		assertEquals("Dallas", customers.get(1444).getCounty());
	}

	@Test
	@DisplayName("Record 1445: State is TX")
	void StateOfRecord1445() {
		assertEquals("TX", customers.get(1444).getState());
	}

	@Test
	@DisplayName("Record 1445: ZIP is 75062")
	void ZIPOfRecord1445() {
		assertEquals("75062", customers.get(1444).getZIP());
	}

	@Test
	@DisplayName("Record 1445: Phone is 972-255-7893")
	void PhoneOfRecord1445() {
		assertEquals("972-255-7893", customers.get(1444).getPhone());
	}

	@Test
	@DisplayName("Record 1445: Fax is 972-255-3916")
	void FaxOfRecord1445() {
		assertEquals("972-255-3916", customers.get(1444).getFax());
	}

	@Test
	@DisplayName("Record 1445: Email is philip@fraine.com")
	void EmailOfRecord1445() {
		assertEquals("philip@fraine.com", customers.get(1444).getEmail());
	}

	@Test
	@DisplayName("Record 1445: Web is http://www.philipfraine.com")
	void WebOfRecord1445() {
		assertEquals("http://www.philipfraine.com", customers.get(1444).getWeb());
	}
}
