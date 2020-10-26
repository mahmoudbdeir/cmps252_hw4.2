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

@Tag("30")
class Record_3925 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3925: FirstName is Madge")
	void FirstNameOfRecord3925() {
		assertEquals("Madge", customers.get(3924).getFirstName());
	}

	@Test
	@DisplayName("Record 3925: LastName is Azulay")
	void LastNameOfRecord3925() {
		assertEquals("Azulay", customers.get(3924).getLastName());
	}

	@Test
	@DisplayName("Record 3925: Company is Tull Forsberg & Olson")
	void CompanyOfRecord3925() {
		assertEquals("Tull Forsberg & Olson", customers.get(3924).getCompany());
	}

	@Test
	@DisplayName("Record 3925: Address is 327 S Sophie St")
	void AddressOfRecord3925() {
		assertEquals("327 S Sophie St", customers.get(3924).getAddress());
	}

	@Test
	@DisplayName("Record 3925: City is Bessemer")
	void CityOfRecord3925() {
		assertEquals("Bessemer", customers.get(3924).getCity());
	}

	@Test
	@DisplayName("Record 3925: County is Gogebic")
	void CountyOfRecord3925() {
		assertEquals("Gogebic", customers.get(3924).getCounty());
	}

	@Test
	@DisplayName("Record 3925: State is MI")
	void StateOfRecord3925() {
		assertEquals("MI", customers.get(3924).getState());
	}

	@Test
	@DisplayName("Record 3925: ZIP is 49911")
	void ZIPOfRecord3925() {
		assertEquals("49911", customers.get(3924).getZIP());
	}

	@Test
	@DisplayName("Record 3925: Phone is 906-663-3189")
	void PhoneOfRecord3925() {
		assertEquals("906-663-3189", customers.get(3924).getPhone());
	}

	@Test
	@DisplayName("Record 3925: Fax is 906-663-9385")
	void FaxOfRecord3925() {
		assertEquals("906-663-9385", customers.get(3924).getFax());
	}

	@Test
	@DisplayName("Record 3925: Email is madge@azulay.com")
	void EmailOfRecord3925() {
		assertEquals("madge@azulay.com", customers.get(3924).getEmail());
	}

	@Test
	@DisplayName("Record 3925: Web is http://www.madgeazulay.com")
	void WebOfRecord3925() {
		assertEquals("http://www.madgeazulay.com", customers.get(3924).getWeb());
	}
}
