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
class Record_1402 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1402: FirstName is Lauretta")
	void FirstNameOfRecord1402() {
		assertEquals("Lauretta", customers.get(1401).getFirstName());
	}

	@Test
	@DisplayName("Record 1402: LastName is Faletti")
	void LastNameOfRecord1402() {
		assertEquals("Faletti", customers.get(1401).getLastName());
	}

	@Test
	@DisplayName("Record 1402: Company is Sarto Retreat House")
	void CompanyOfRecord1402() {
		assertEquals("Sarto Retreat House", customers.get(1401).getCompany());
	}

	@Test
	@DisplayName("Record 1402: Address is 407 Irving St")
	void AddressOfRecord1402() {
		assertEquals("407 Irving St", customers.get(1401).getAddress());
	}

	@Test
	@DisplayName("Record 1402: City is Olean")
	void CityOfRecord1402() {
		assertEquals("Olean", customers.get(1401).getCity());
	}

	@Test
	@DisplayName("Record 1402: County is Cattaraugus")
	void CountyOfRecord1402() {
		assertEquals("Cattaraugus", customers.get(1401).getCounty());
	}

	@Test
	@DisplayName("Record 1402: State is NY")
	void StateOfRecord1402() {
		assertEquals("NY", customers.get(1401).getState());
	}

	@Test
	@DisplayName("Record 1402: ZIP is 14760")
	void ZIPOfRecord1402() {
		assertEquals("14760", customers.get(1401).getZIP());
	}

	@Test
	@DisplayName("Record 1402: Phone is 716-372-0826")
	void PhoneOfRecord1402() {
		assertEquals("716-372-0826", customers.get(1401).getPhone());
	}

	@Test
	@DisplayName("Record 1402: Fax is 716-372-0987")
	void FaxOfRecord1402() {
		assertEquals("716-372-0987", customers.get(1401).getFax());
	}

	@Test
	@DisplayName("Record 1402: Email is lauretta@faletti.com")
	void EmailOfRecord1402() {
		assertEquals("lauretta@faletti.com", customers.get(1401).getEmail());
	}

	@Test
	@DisplayName("Record 1402: Web is http://www.laurettafaletti.com")
	void WebOfRecord1402() {
		assertEquals("http://www.laurettafaletti.com", customers.get(1401).getWeb());
	}
}
