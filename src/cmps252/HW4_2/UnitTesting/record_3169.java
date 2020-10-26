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

@Tag("9")
class Record_3169 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3169: FirstName is Bernadine")
	void FirstNameOfRecord3169() {
		assertEquals("Bernadine", customers.get(3168).getFirstName());
	}

	@Test
	@DisplayName("Record 3169: LastName is Melford")
	void LastNameOfRecord3169() {
		assertEquals("Melford", customers.get(3168).getLastName());
	}

	@Test
	@DisplayName("Record 3169: Company is Spectrum Chemical Services Inc")
	void CompanyOfRecord3169() {
		assertEquals("Spectrum Chemical Services Inc", customers.get(3168).getCompany());
	}

	@Test
	@DisplayName("Record 3169: Address is 2403 N Oakley Ave")
	void AddressOfRecord3169() {
		assertEquals("2403 N Oakley Ave", customers.get(3168).getAddress());
	}

	@Test
	@DisplayName("Record 3169: City is Chicago")
	void CityOfRecord3169() {
		assertEquals("Chicago", customers.get(3168).getCity());
	}

	@Test
	@DisplayName("Record 3169: County is Cook")
	void CountyOfRecord3169() {
		assertEquals("Cook", customers.get(3168).getCounty());
	}

	@Test
	@DisplayName("Record 3169: State is IL")
	void StateOfRecord3169() {
		assertEquals("IL", customers.get(3168).getState());
	}

	@Test
	@DisplayName("Record 3169: ZIP is 60647")
	void ZIPOfRecord3169() {
		assertEquals("60647", customers.get(3168).getZIP());
	}

	@Test
	@DisplayName("Record 3169: Phone is 773-227-1247")
	void PhoneOfRecord3169() {
		assertEquals("773-227-1247", customers.get(3168).getPhone());
	}

	@Test
	@DisplayName("Record 3169: Fax is 773-227-5384")
	void FaxOfRecord3169() {
		assertEquals("773-227-5384", customers.get(3168).getFax());
	}

	@Test
	@DisplayName("Record 3169: Email is bernadine@melford.com")
	void EmailOfRecord3169() {
		assertEquals("bernadine@melford.com", customers.get(3168).getEmail());
	}

	@Test
	@DisplayName("Record 3169: Web is http://www.bernadinemelford.com")
	void WebOfRecord3169() {
		assertEquals("http://www.bernadinemelford.com", customers.get(3168).getWeb());
	}
}
