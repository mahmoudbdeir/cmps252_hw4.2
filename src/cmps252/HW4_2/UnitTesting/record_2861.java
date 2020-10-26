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

@Tag("36")
class Record_2861 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2861: FirstName is Latrice")
	void FirstNameOfRecord2861() {
		assertEquals("Latrice", customers.get(2860).getFirstName());
	}

	@Test
	@DisplayName("Record 2861: LastName is Bragado")
	void LastNameOfRecord2861() {
		assertEquals("Bragado", customers.get(2860).getLastName());
	}

	@Test
	@DisplayName("Record 2861: Company is Simmons Charter Inc")
	void CompanyOfRecord2861() {
		assertEquals("Simmons Charter Inc", customers.get(2860).getCompany());
	}

	@Test
	@DisplayName("Record 2861: Address is 2140 American Ave")
	void AddressOfRecord2861() {
		assertEquals("2140 American Ave", customers.get(2860).getAddress());
	}

	@Test
	@DisplayName("Record 2861: City is Hayward")
	void CityOfRecord2861() {
		assertEquals("Hayward", customers.get(2860).getCity());
	}

	@Test
	@DisplayName("Record 2861: County is Alameda")
	void CountyOfRecord2861() {
		assertEquals("Alameda", customers.get(2860).getCounty());
	}

	@Test
	@DisplayName("Record 2861: State is CA")
	void StateOfRecord2861() {
		assertEquals("CA", customers.get(2860).getState());
	}

	@Test
	@DisplayName("Record 2861: ZIP is 94545")
	void ZIPOfRecord2861() {
		assertEquals("94545", customers.get(2860).getZIP());
	}

	@Test
	@DisplayName("Record 2861: Phone is 510-351-1154")
	void PhoneOfRecord2861() {
		assertEquals("510-351-1154", customers.get(2860).getPhone());
	}

	@Test
	@DisplayName("Record 2861: Fax is 510-351-0791")
	void FaxOfRecord2861() {
		assertEquals("510-351-0791", customers.get(2860).getFax());
	}

	@Test
	@DisplayName("Record 2861: Email is latrice@bragado.com")
	void EmailOfRecord2861() {
		assertEquals("latrice@bragado.com", customers.get(2860).getEmail());
	}

	@Test
	@DisplayName("Record 2861: Web is http://www.latricebragado.com")
	void WebOfRecord2861() {
		assertEquals("http://www.latricebragado.com", customers.get(2860).getWeb());
	}
}
