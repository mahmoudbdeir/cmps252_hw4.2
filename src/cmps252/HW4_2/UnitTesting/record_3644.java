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

@Tag("10")
class Record_3644 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3644: FirstName is Naomi")
	void FirstNameOfRecord3644() {
		assertEquals("Naomi", customers.get(3643).getFirstName());
	}

	@Test
	@DisplayName("Record 3644: LastName is Hohenberger")
	void LastNameOfRecord3644() {
		assertEquals("Hohenberger", customers.get(3643).getLastName());
	}

	@Test
	@DisplayName("Record 3644: Company is Chesapeake Display & Pkgng Co")
	void CompanyOfRecord3644() {
		assertEquals("Chesapeake Display & Pkgng Co", customers.get(3643).getCompany());
	}

	@Test
	@DisplayName("Record 3644: Address is 3623 Blackington Ave")
	void AddressOfRecord3644() {
		assertEquals("3623 Blackington Ave", customers.get(3643).getAddress());
	}

	@Test
	@DisplayName("Record 3644: City is Flint")
	void CityOfRecord3644() {
		assertEquals("Flint", customers.get(3643).getCity());
	}

	@Test
	@DisplayName("Record 3644: County is Genesee")
	void CountyOfRecord3644() {
		assertEquals("Genesee", customers.get(3643).getCounty());
	}

	@Test
	@DisplayName("Record 3644: State is MI")
	void StateOfRecord3644() {
		assertEquals("MI", customers.get(3643).getState());
	}

	@Test
	@DisplayName("Record 3644: ZIP is 48532")
	void ZIPOfRecord3644() {
		assertEquals("48532", customers.get(3643).getZIP());
	}

	@Test
	@DisplayName("Record 3644: Phone is 810-232-0588")
	void PhoneOfRecord3644() {
		assertEquals("810-232-0588", customers.get(3643).getPhone());
	}

	@Test
	@DisplayName("Record 3644: Fax is 810-232-9278")
	void FaxOfRecord3644() {
		assertEquals("810-232-9278", customers.get(3643).getFax());
	}

	@Test
	@DisplayName("Record 3644: Email is naomi@hohenberger.com")
	void EmailOfRecord3644() {
		assertEquals("naomi@hohenberger.com", customers.get(3643).getEmail());
	}

	@Test
	@DisplayName("Record 3644: Web is http://www.naomihohenberger.com")
	void WebOfRecord3644() {
		assertEquals("http://www.naomihohenberger.com", customers.get(3643).getWeb());
	}
}
