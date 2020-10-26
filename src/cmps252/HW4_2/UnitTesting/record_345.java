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

@Tag("43")
class Record_345 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 345: FirstName is Cary")
	void FirstNameOfRecord345() {
		assertEquals("Cary", customers.get(344).getFirstName());
	}

	@Test
	@DisplayName("Record 345: LastName is Leona")
	void LastNameOfRecord345() {
		assertEquals("Leona", customers.get(344).getLastName());
	}

	@Test
	@DisplayName("Record 345: Company is Tillamook Cnty Shopg Guid Inc")
	void CompanyOfRecord345() {
		assertEquals("Tillamook Cnty Shopg Guid Inc", customers.get(344).getCompany());
	}

	@Test
	@DisplayName("Record 345: Address is 29300 Goddard Rd")
	void AddressOfRecord345() {
		assertEquals("29300 Goddard Rd", customers.get(344).getAddress());
	}

	@Test
	@DisplayName("Record 345: City is Romulus")
	void CityOfRecord345() {
		assertEquals("Romulus", customers.get(344).getCity());
	}

	@Test
	@DisplayName("Record 345: County is Wayne")
	void CountyOfRecord345() {
		assertEquals("Wayne", customers.get(344).getCounty());
	}

	@Test
	@DisplayName("Record 345: State is MI")
	void StateOfRecord345() {
		assertEquals("MI", customers.get(344).getState());
	}

	@Test
	@DisplayName("Record 345: ZIP is 48174")
	void ZIPOfRecord345() {
		assertEquals("48174", customers.get(344).getZIP());
	}

	@Test
	@DisplayName("Record 345: Phone is 734-946-9558")
	void PhoneOfRecord345() {
		assertEquals("734-946-9558", customers.get(344).getPhone());
	}

	@Test
	@DisplayName("Record 345: Fax is 734-946-1779")
	void FaxOfRecord345() {
		assertEquals("734-946-1779", customers.get(344).getFax());
	}

	@Test
	@DisplayName("Record 345: Email is cary@leona.com")
	void EmailOfRecord345() {
		assertEquals("cary@leona.com", customers.get(344).getEmail());
	}

	@Test
	@DisplayName("Record 345: Web is http://www.caryleona.com")
	void WebOfRecord345() {
		assertEquals("http://www.caryleona.com", customers.get(344).getWeb());
	}
}
