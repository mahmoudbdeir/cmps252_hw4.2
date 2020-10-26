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

@Tag("31")
class Record_3168 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3168: FirstName is Alonzo")
	void FirstNameOfRecord3168() {
		assertEquals("Alonzo", customers.get(3167).getFirstName());
	}

	@Test
	@DisplayName("Record 3168: LastName is Candill")
	void LastNameOfRecord3168() {
		assertEquals("Candill", customers.get(3167).getLastName());
	}

	@Test
	@DisplayName("Record 3168: Company is Hofmann, Douglas A Esq")
	void CompanyOfRecord3168() {
		assertEquals("Hofmann, Douglas A Esq", customers.get(3167).getCompany());
	}

	@Test
	@DisplayName("Record 3168: Address is 9520 Midwest Ave")
	void AddressOfRecord3168() {
		assertEquals("9520 Midwest Ave", customers.get(3167).getAddress());
	}

	@Test
	@DisplayName("Record 3168: City is Cleveland")
	void CityOfRecord3168() {
		assertEquals("Cleveland", customers.get(3167).getCity());
	}

	@Test
	@DisplayName("Record 3168: County is Cuyahoga")
	void CountyOfRecord3168() {
		assertEquals("Cuyahoga", customers.get(3167).getCounty());
	}

	@Test
	@DisplayName("Record 3168: State is OH")
	void StateOfRecord3168() {
		assertEquals("OH", customers.get(3167).getState());
	}

	@Test
	@DisplayName("Record 3168: ZIP is 44125")
	void ZIPOfRecord3168() {
		assertEquals("44125", customers.get(3167).getZIP());
	}

	@Test
	@DisplayName("Record 3168: Phone is 216-663-3845")
	void PhoneOfRecord3168() {
		assertEquals("216-663-3845", customers.get(3167).getPhone());
	}

	@Test
	@DisplayName("Record 3168: Fax is 216-663-5286")
	void FaxOfRecord3168() {
		assertEquals("216-663-5286", customers.get(3167).getFax());
	}

	@Test
	@DisplayName("Record 3168: Email is alonzo@candill.com")
	void EmailOfRecord3168() {
		assertEquals("alonzo@candill.com", customers.get(3167).getEmail());
	}

	@Test
	@DisplayName("Record 3168: Web is http://www.alonzocandill.com")
	void WebOfRecord3168() {
		assertEquals("http://www.alonzocandill.com", customers.get(3167).getWeb());
	}
}
