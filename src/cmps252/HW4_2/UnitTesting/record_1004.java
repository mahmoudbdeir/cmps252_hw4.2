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
class Record_1004 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1004: FirstName is Abe")
	void FirstNameOfRecord1004() {
		assertEquals("Abe", customers.get(1003).getFirstName());
	}

	@Test
	@DisplayName("Record 1004: LastName is Couchman")
	void LastNameOfRecord1004() {
		assertEquals("Couchman", customers.get(1003).getLastName());
	}

	@Test
	@DisplayName("Record 1004: Company is Hoppe, Robert Esq")
	void CompanyOfRecord1004() {
		assertEquals("Hoppe, Robert Esq", customers.get(1003).getCompany());
	}

	@Test
	@DisplayName("Record 1004: Address is 2700 S Colorado Blvd")
	void AddressOfRecord1004() {
		assertEquals("2700 S Colorado Blvd", customers.get(1003).getAddress());
	}

	@Test
	@DisplayName("Record 1004: City is Denver")
	void CityOfRecord1004() {
		assertEquals("Denver", customers.get(1003).getCity());
	}

	@Test
	@DisplayName("Record 1004: County is Denver")
	void CountyOfRecord1004() {
		assertEquals("Denver", customers.get(1003).getCounty());
	}

	@Test
	@DisplayName("Record 1004: State is CO")
	void StateOfRecord1004() {
		assertEquals("CO", customers.get(1003).getState());
	}

	@Test
	@DisplayName("Record 1004: ZIP is 80222")
	void ZIPOfRecord1004() {
		assertEquals("80222", customers.get(1003).getZIP());
	}

	@Test
	@DisplayName("Record 1004: Phone is 303-458-6308")
	void PhoneOfRecord1004() {
		assertEquals("303-458-6308", customers.get(1003).getPhone());
	}

	@Test
	@DisplayName("Record 1004: Fax is 303-458-4229")
	void FaxOfRecord1004() {
		assertEquals("303-458-4229", customers.get(1003).getFax());
	}

	@Test
	@DisplayName("Record 1004: Email is abe@couchman.com")
	void EmailOfRecord1004() {
		assertEquals("abe@couchman.com", customers.get(1003).getEmail());
	}

	@Test
	@DisplayName("Record 1004: Web is http://www.abecouchman.com")
	void WebOfRecord1004() {
		assertEquals("http://www.abecouchman.com", customers.get(1003).getWeb());
	}
}
