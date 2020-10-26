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

@Tag("45")
class Record_374 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 374: FirstName is Bertie")
	void FirstNameOfRecord374() {
		assertEquals("Bertie", customers.get(373).getFirstName());
	}

	@Test
	@DisplayName("Record 374: LastName is Kilborne")
	void LastNameOfRecord374() {
		assertEquals("Kilborne", customers.get(373).getLastName());
	}

	@Test
	@DisplayName("Record 374: Company is Barbaras Bakery")
	void CompanyOfRecord374() {
		assertEquals("Barbaras Bakery", customers.get(373).getCompany());
	}

	@Test
	@DisplayName("Record 374: Address is 601 Lighthouse Ave")
	void AddressOfRecord374() {
		assertEquals("601 Lighthouse Ave", customers.get(373).getAddress());
	}

	@Test
	@DisplayName("Record 374: City is Monterey")
	void CityOfRecord374() {
		assertEquals("Monterey", customers.get(373).getCity());
	}

	@Test
	@DisplayName("Record 374: County is Monterey")
	void CountyOfRecord374() {
		assertEquals("Monterey", customers.get(373).getCounty());
	}

	@Test
	@DisplayName("Record 374: State is CA")
	void StateOfRecord374() {
		assertEquals("CA", customers.get(373).getState());
	}

	@Test
	@DisplayName("Record 374: ZIP is 93940")
	void ZIPOfRecord374() {
		assertEquals("93940", customers.get(373).getZIP());
	}

	@Test
	@DisplayName("Record 374: Phone is 831-375-6712")
	void PhoneOfRecord374() {
		assertEquals("831-375-6712", customers.get(373).getPhone());
	}

	@Test
	@DisplayName("Record 374: Fax is 831-375-0663")
	void FaxOfRecord374() {
		assertEquals("831-375-0663", customers.get(373).getFax());
	}

	@Test
	@DisplayName("Record 374: Email is bertie@kilborne.com")
	void EmailOfRecord374() {
		assertEquals("bertie@kilborne.com", customers.get(373).getEmail());
	}

	@Test
	@DisplayName("Record 374: Web is http://www.bertiekilborne.com")
	void WebOfRecord374() {
		assertEquals("http://www.bertiekilborne.com", customers.get(373).getWeb());
	}
}
