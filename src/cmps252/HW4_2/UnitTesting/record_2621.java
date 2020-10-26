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

@Tag("1")
class Record_2621 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2621: FirstName is Theodore")
	void FirstNameOfRecord2621() {
		assertEquals("Theodore", customers.get(2620).getFirstName());
	}

	@Test
	@DisplayName("Record 2621: LastName is Schoneman")
	void LastNameOfRecord2621() {
		assertEquals("Schoneman", customers.get(2620).getLastName());
	}

	@Test
	@DisplayName("Record 2621: Company is Electronic Metal Fabrication")
	void CompanyOfRecord2621() {
		assertEquals("Electronic Metal Fabrication", customers.get(2620).getCompany());
	}

	@Test
	@DisplayName("Record 2621: Address is 4949 Dempster St")
	void AddressOfRecord2621() {
		assertEquals("4949 Dempster St", customers.get(2620).getAddress());
	}

	@Test
	@DisplayName("Record 2621: City is Skokie")
	void CityOfRecord2621() {
		assertEquals("Skokie", customers.get(2620).getCity());
	}

	@Test
	@DisplayName("Record 2621: County is Cook")
	void CountyOfRecord2621() {
		assertEquals("Cook", customers.get(2620).getCounty());
	}

	@Test
	@DisplayName("Record 2621: State is IL")
	void StateOfRecord2621() {
		assertEquals("IL", customers.get(2620).getState());
	}

	@Test
	@DisplayName("Record 2621: ZIP is 60077")
	void ZIPOfRecord2621() {
		assertEquals("60077", customers.get(2620).getZIP());
	}

	@Test
	@DisplayName("Record 2621: Phone is 847-679-2249")
	void PhoneOfRecord2621() {
		assertEquals("847-679-2249", customers.get(2620).getPhone());
	}

	@Test
	@DisplayName("Record 2621: Fax is 847-679-2355")
	void FaxOfRecord2621() {
		assertEquals("847-679-2355", customers.get(2620).getFax());
	}

	@Test
	@DisplayName("Record 2621: Email is theodore@schoneman.com")
	void EmailOfRecord2621() {
		assertEquals("theodore@schoneman.com", customers.get(2620).getEmail());
	}

	@Test
	@DisplayName("Record 2621: Web is http://www.theodoreschoneman.com")
	void WebOfRecord2621() {
		assertEquals("http://www.theodoreschoneman.com", customers.get(2620).getWeb());
	}
}
