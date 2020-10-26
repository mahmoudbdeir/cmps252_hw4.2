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
class Record_942 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 942: FirstName is Isiah")
	void FirstNameOfRecord942() {
		assertEquals("Isiah", customers.get(941).getFirstName());
	}

	@Test
	@DisplayName("Record 942: LastName is Cavalaris")
	void LastNameOfRecord942() {
		assertEquals("Cavalaris", customers.get(941).getLastName());
	}

	@Test
	@DisplayName("Record 942: Company is Robert L Schibel Law Offices O")
	void CompanyOfRecord942() {
		assertEquals("Robert L Schibel Law Offices O", customers.get(941).getCompany());
	}

	@Test
	@DisplayName("Record 942: Address is 410 S Michigan Ave")
	void AddressOfRecord942() {
		assertEquals("410 S Michigan Ave", customers.get(941).getAddress());
	}

	@Test
	@DisplayName("Record 942: City is Chicago")
	void CityOfRecord942() {
		assertEquals("Chicago", customers.get(941).getCity());
	}

	@Test
	@DisplayName("Record 942: County is Cook")
	void CountyOfRecord942() {
		assertEquals("Cook", customers.get(941).getCounty());
	}

	@Test
	@DisplayName("Record 942: State is IL")
	void StateOfRecord942() {
		assertEquals("IL", customers.get(941).getState());
	}

	@Test
	@DisplayName("Record 942: ZIP is 60605")
	void ZIPOfRecord942() {
		assertEquals("60605", customers.get(941).getZIP());
	}

	@Test
	@DisplayName("Record 942: Phone is 312-922-7087")
	void PhoneOfRecord942() {
		assertEquals("312-922-7087", customers.get(941).getPhone());
	}

	@Test
	@DisplayName("Record 942: Fax is 312-922-3839")
	void FaxOfRecord942() {
		assertEquals("312-922-3839", customers.get(941).getFax());
	}

	@Test
	@DisplayName("Record 942: Email is isiah@cavalaris.com")
	void EmailOfRecord942() {
		assertEquals("isiah@cavalaris.com", customers.get(941).getEmail());
	}

	@Test
	@DisplayName("Record 942: Web is http://www.isiahcavalaris.com")
	void WebOfRecord942() {
		assertEquals("http://www.isiahcavalaris.com", customers.get(941).getWeb());
	}
}
