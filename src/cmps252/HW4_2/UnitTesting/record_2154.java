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

@Tag("48")
class Record_2154 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2154: FirstName is Annette")
	void FirstNameOfRecord2154() {
		assertEquals("Annette", customers.get(2153).getFirstName());
	}

	@Test
	@DisplayName("Record 2154: LastName is Tebo")
	void LastNameOfRecord2154() {
		assertEquals("Tebo", customers.get(2153).getLastName());
	}

	@Test
	@DisplayName("Record 2154: Company is Post Printing Inc")
	void CompanyOfRecord2154() {
		assertEquals("Post Printing Inc", customers.get(2153).getCompany());
	}

	@Test
	@DisplayName("Record 2154: Address is 3000 Chestnut Ave")
	void AddressOfRecord2154() {
		assertEquals("3000 Chestnut Ave", customers.get(2153).getAddress());
	}

	@Test
	@DisplayName("Record 2154: City is Baltimore")
	void CityOfRecord2154() {
		assertEquals("Baltimore", customers.get(2153).getCity());
	}

	@Test
	@DisplayName("Record 2154: County is Baltimore City")
	void CountyOfRecord2154() {
		assertEquals("Baltimore City", customers.get(2153).getCounty());
	}

	@Test
	@DisplayName("Record 2154: State is MD")
	void StateOfRecord2154() {
		assertEquals("MD", customers.get(2153).getState());
	}

	@Test
	@DisplayName("Record 2154: ZIP is 21211")
	void ZIPOfRecord2154() {
		assertEquals("21211", customers.get(2153).getZIP());
	}

	@Test
	@DisplayName("Record 2154: Phone is 410-467-4062")
	void PhoneOfRecord2154() {
		assertEquals("410-467-4062", customers.get(2153).getPhone());
	}

	@Test
	@DisplayName("Record 2154: Fax is 410-467-1438")
	void FaxOfRecord2154() {
		assertEquals("410-467-1438", customers.get(2153).getFax());
	}

	@Test
	@DisplayName("Record 2154: Email is annette@tebo.com")
	void EmailOfRecord2154() {
		assertEquals("annette@tebo.com", customers.get(2153).getEmail());
	}

	@Test
	@DisplayName("Record 2154: Web is http://www.annettetebo.com")
	void WebOfRecord2154() {
		assertEquals("http://www.annettetebo.com", customers.get(2153).getWeb());
	}
}
