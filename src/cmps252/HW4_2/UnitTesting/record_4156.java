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

@Tag("40")
class Record_4156 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4156: FirstName is Oscar")
	void FirstNameOfRecord4156() {
		assertEquals("Oscar", customers.get(4155).getFirstName());
	}

	@Test
	@DisplayName("Record 4156: LastName is Sheets")
	void LastNameOfRecord4156() {
		assertEquals("Sheets", customers.get(4155).getLastName());
	}

	@Test
	@DisplayName("Record 4156: Company is Dudley Building Systems")
	void CompanyOfRecord4156() {
		assertEquals("Dudley Building Systems", customers.get(4155).getCompany());
	}

	@Test
	@DisplayName("Record 4156: Address is 2200 W Higgins Rd")
	void AddressOfRecord4156() {
		assertEquals("2200 W Higgins Rd", customers.get(4155).getAddress());
	}

	@Test
	@DisplayName("Record 4156: City is Schaumburg")
	void CityOfRecord4156() {
		assertEquals("Schaumburg", customers.get(4155).getCity());
	}

	@Test
	@DisplayName("Record 4156: County is Cook")
	void CountyOfRecord4156() {
		assertEquals("Cook", customers.get(4155).getCounty());
	}

	@Test
	@DisplayName("Record 4156: State is IL")
	void StateOfRecord4156() {
		assertEquals("IL", customers.get(4155).getState());
	}

	@Test
	@DisplayName("Record 4156: ZIP is 60195")
	void ZIPOfRecord4156() {
		assertEquals("60195", customers.get(4155).getZIP());
	}

	@Test
	@DisplayName("Record 4156: Phone is 847-885-7882")
	void PhoneOfRecord4156() {
		assertEquals("847-885-7882", customers.get(4155).getPhone());
	}

	@Test
	@DisplayName("Record 4156: Fax is 847-885-1725")
	void FaxOfRecord4156() {
		assertEquals("847-885-1725", customers.get(4155).getFax());
	}

	@Test
	@DisplayName("Record 4156: Email is oscar@sheets.com")
	void EmailOfRecord4156() {
		assertEquals("oscar@sheets.com", customers.get(4155).getEmail());
	}

	@Test
	@DisplayName("Record 4156: Web is http://www.oscarsheets.com")
	void WebOfRecord4156() {
		assertEquals("http://www.oscarsheets.com", customers.get(4155).getWeb());
	}
}
