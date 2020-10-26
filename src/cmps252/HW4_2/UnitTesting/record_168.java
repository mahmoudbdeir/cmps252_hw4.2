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

@Tag("24")
class Record_168 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 168: FirstName is Sierra")
	void FirstNameOfRecord168() {
		assertEquals("Sierra", customers.get(167).getFirstName());
	}

	@Test
	@DisplayName("Record 168: LastName is Komlos")
	void LastNameOfRecord168() {
		assertEquals("Komlos", customers.get(167).getLastName());
	}

	@Test
	@DisplayName("Record 168: Company is Dugger, Jessica Dawn Esq")
	void CompanyOfRecord168() {
		assertEquals("Dugger, Jessica Dawn Esq", customers.get(167).getCompany());
	}

	@Test
	@DisplayName("Record 168: Address is 1455 Boston St")
	void AddressOfRecord168() {
		assertEquals("1455 Boston St", customers.get(167).getAddress());
	}

	@Test
	@DisplayName("Record 168: City is Aurora")
	void CityOfRecord168() {
		assertEquals("Aurora", customers.get(167).getCity());
	}

	@Test
	@DisplayName("Record 168: County is Arapahoe")
	void CountyOfRecord168() {
		assertEquals("Arapahoe", customers.get(167).getCounty());
	}

	@Test
	@DisplayName("Record 168: State is CO")
	void StateOfRecord168() {
		assertEquals("CO", customers.get(167).getState());
	}

	@Test
	@DisplayName("Record 168: ZIP is 80010")
	void ZIPOfRecord168() {
		assertEquals("80010", customers.get(167).getZIP());
	}

	@Test
	@DisplayName("Record 168: Phone is 303-366-6579")
	void PhoneOfRecord168() {
		assertEquals("303-366-6579", customers.get(167).getPhone());
	}

	@Test
	@DisplayName("Record 168: Fax is 303-366-3537")
	void FaxOfRecord168() {
		assertEquals("303-366-3537", customers.get(167).getFax());
	}

	@Test
	@DisplayName("Record 168: Email is sierra@komlos.com")
	void EmailOfRecord168() {
		assertEquals("sierra@komlos.com", customers.get(167).getEmail());
	}

	@Test
	@DisplayName("Record 168: Web is http://www.sierrakomlos.com")
	void WebOfRecord168() {
		assertEquals("http://www.sierrakomlos.com", customers.get(167).getWeb());
	}
}
