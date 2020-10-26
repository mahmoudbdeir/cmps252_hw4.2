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

@Tag("39")
class Record_301 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 301: FirstName is Lino")
	void FirstNameOfRecord301() {
		assertEquals("Lino", customers.get(300).getFirstName());
	}

	@Test
	@DisplayName("Record 301: LastName is Mallory")
	void LastNameOfRecord301() {
		assertEquals("Mallory", customers.get(300).getLastName());
	}

	@Test
	@DisplayName("Record 301: Company is Hoppe, Theodore W Esq")
	void CompanyOfRecord301() {
		assertEquals("Hoppe, Theodore W Esq", customers.get(300).getCompany());
	}

	@Test
	@DisplayName("Record 301: Address is 1505 S Redwood Rd")
	void AddressOfRecord301() {
		assertEquals("1505 S Redwood Rd", customers.get(300).getAddress());
	}

	@Test
	@DisplayName("Record 301: City is Salt Lake City")
	void CityOfRecord301() {
		assertEquals("Salt Lake City", customers.get(300).getCity());
	}

	@Test
	@DisplayName("Record 301: County is Salt Lake")
	void CountyOfRecord301() {
		assertEquals("Salt Lake", customers.get(300).getCounty());
	}

	@Test
	@DisplayName("Record 301: State is UT")
	void StateOfRecord301() {
		assertEquals("UT", customers.get(300).getState());
	}

	@Test
	@DisplayName("Record 301: ZIP is 84104")
	void ZIPOfRecord301() {
		assertEquals("84104", customers.get(300).getZIP());
	}

	@Test
	@DisplayName("Record 301: Phone is 801-972-9914")
	void PhoneOfRecord301() {
		assertEquals("801-972-9914", customers.get(300).getPhone());
	}

	@Test
	@DisplayName("Record 301: Fax is 801-972-5215")
	void FaxOfRecord301() {
		assertEquals("801-972-5215", customers.get(300).getFax());
	}

	@Test
	@DisplayName("Record 301: Email is lino@mallory.com")
	void EmailOfRecord301() {
		assertEquals("lino@mallory.com", customers.get(300).getEmail());
	}

	@Test
	@DisplayName("Record 301: Web is http://www.linomallory.com")
	void WebOfRecord301() {
		assertEquals("http://www.linomallory.com", customers.get(300).getWeb());
	}
}
