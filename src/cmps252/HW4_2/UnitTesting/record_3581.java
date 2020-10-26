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

@Tag("37")
class Record_3581 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3581: FirstName is Janine")
	void FirstNameOfRecord3581() {
		assertEquals("Janine", customers.get(3580).getFirstName());
	}

	@Test
	@DisplayName("Record 3581: LastName is Haakenson")
	void LastNameOfRecord3581() {
		assertEquals("Haakenson", customers.get(3580).getLastName());
	}

	@Test
	@DisplayName("Record 3581: Company is Noritsu America Corp")
	void CompanyOfRecord3581() {
		assertEquals("Noritsu America Corp", customers.get(3580).getCompany());
	}

	@Test
	@DisplayName("Record 3581: Address is 920 E 8th Ave")
	void AddressOfRecord3581() {
		assertEquals("920 E 8th Ave", customers.get(3580).getAddress());
	}

	@Test
	@DisplayName("Record 3581: City is King of Prussia")
	void CityOfRecord3581() {
		assertEquals("King of Prussia", customers.get(3580).getCity());
	}

	@Test
	@DisplayName("Record 3581: County is Montgomery")
	void CountyOfRecord3581() {
		assertEquals("Montgomery", customers.get(3580).getCounty());
	}

	@Test
	@DisplayName("Record 3581: State is PA")
	void StateOfRecord3581() {
		assertEquals("PA", customers.get(3580).getState());
	}

	@Test
	@DisplayName("Record 3581: ZIP is 19406")
	void ZIPOfRecord3581() {
		assertEquals("19406", customers.get(3580).getZIP());
	}

	@Test
	@DisplayName("Record 3581: Phone is 610-265-1528")
	void PhoneOfRecord3581() {
		assertEquals("610-265-1528", customers.get(3580).getPhone());
	}

	@Test
	@DisplayName("Record 3581: Fax is 610-265-1261")
	void FaxOfRecord3581() {
		assertEquals("610-265-1261", customers.get(3580).getFax());
	}

	@Test
	@DisplayName("Record 3581: Email is janine@haakenson.com")
	void EmailOfRecord3581() {
		assertEquals("janine@haakenson.com", customers.get(3580).getEmail());
	}

	@Test
	@DisplayName("Record 3581: Web is http://www.janinehaakenson.com")
	void WebOfRecord3581() {
		assertEquals("http://www.janinehaakenson.com", customers.get(3580).getWeb());
	}
}
