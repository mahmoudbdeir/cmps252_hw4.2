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

@Tag("49")
class Record_4702 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4702: FirstName is Tammy")
	void FirstNameOfRecord4702() {
		assertEquals("Tammy", customers.get(4701).getFirstName());
	}

	@Test
	@DisplayName("Record 4702: LastName is Gutiennez")
	void LastNameOfRecord4702() {
		assertEquals("Gutiennez", customers.get(4701).getLastName());
	}

	@Test
	@DisplayName("Record 4702: Company is Birmingham Steel Corporation")
	void CompanyOfRecord4702() {
		assertEquals("Birmingham Steel Corporation", customers.get(4701).getCompany());
	}

	@Test
	@DisplayName("Record 4702: Address is Genuardi ' S")
	void AddressOfRecord4702() {
		assertEquals("Genuardi ' S", customers.get(4701).getAddress());
	}

	@Test
	@DisplayName("Record 4702: City is Ambler")
	void CityOfRecord4702() {
		assertEquals("Ambler", customers.get(4701).getCity());
	}

	@Test
	@DisplayName("Record 4702: County is Montgomery")
	void CountyOfRecord4702() {
		assertEquals("Montgomery", customers.get(4701).getCounty());
	}

	@Test
	@DisplayName("Record 4702: State is PA")
	void StateOfRecord4702() {
		assertEquals("PA", customers.get(4701).getState());
	}

	@Test
	@DisplayName("Record 4702: ZIP is 19002")
	void ZIPOfRecord4702() {
		assertEquals("19002", customers.get(4701).getZIP());
	}

	@Test
	@DisplayName("Record 4702: Phone is 215-628-7204")
	void PhoneOfRecord4702() {
		assertEquals("215-628-7204", customers.get(4701).getPhone());
	}

	@Test
	@DisplayName("Record 4702: Fax is 215-628-5689")
	void FaxOfRecord4702() {
		assertEquals("215-628-5689", customers.get(4701).getFax());
	}

	@Test
	@DisplayName("Record 4702: Email is tammy@gutiennez.com")
	void EmailOfRecord4702() {
		assertEquals("tammy@gutiennez.com", customers.get(4701).getEmail());
	}

	@Test
	@DisplayName("Record 4702: Web is http://www.tammygutiennez.com")
	void WebOfRecord4702() {
		assertEquals("http://www.tammygutiennez.com", customers.get(4701).getWeb());
	}
}
