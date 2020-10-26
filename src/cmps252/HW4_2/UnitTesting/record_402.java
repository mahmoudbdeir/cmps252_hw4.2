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

@Tag("16")
class Record_402 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 402: FirstName is Angeline")
	void FirstNameOfRecord402() {
		assertEquals("Angeline", customers.get(401).getFirstName());
	}

	@Test
	@DisplayName("Record 402: LastName is Ryfsteck")
	void LastNameOfRecord402() {
		assertEquals("Ryfsteck", customers.get(401).getLastName());
	}

	@Test
	@DisplayName("Record 402: Company is Public Library")
	void CompanyOfRecord402() {
		assertEquals("Public Library", customers.get(401).getCompany());
	}

	@Test
	@DisplayName("Record 402: Address is 106 Swarthmore Ave")
	void AddressOfRecord402() {
		assertEquals("106 Swarthmore Ave", customers.get(401).getAddress());
	}

	@Test
	@DisplayName("Record 402: City is Folsom")
	void CityOfRecord402() {
		assertEquals("Folsom", customers.get(401).getCity());
	}

	@Test
	@DisplayName("Record 402: County is Delaware")
	void CountyOfRecord402() {
		assertEquals("Delaware", customers.get(401).getCounty());
	}

	@Test
	@DisplayName("Record 402: State is PA")
	void StateOfRecord402() {
		assertEquals("PA", customers.get(401).getState());
	}

	@Test
	@DisplayName("Record 402: ZIP is 19033")
	void ZIPOfRecord402() {
		assertEquals("19033", customers.get(401).getZIP());
	}

	@Test
	@DisplayName("Record 402: Phone is 610-237-7536")
	void PhoneOfRecord402() {
		assertEquals("610-237-7536", customers.get(401).getPhone());
	}

	@Test
	@DisplayName("Record 402: Fax is 610-237-0374")
	void FaxOfRecord402() {
		assertEquals("610-237-0374", customers.get(401).getFax());
	}

	@Test
	@DisplayName("Record 402: Email is angeline@ryfsteck.com")
	void EmailOfRecord402() {
		assertEquals("angeline@ryfsteck.com", customers.get(401).getEmail());
	}

	@Test
	@DisplayName("Record 402: Web is http://www.angelineryfsteck.com")
	void WebOfRecord402() {
		assertEquals("http://www.angelineryfsteck.com", customers.get(401).getWeb());
	}
}
