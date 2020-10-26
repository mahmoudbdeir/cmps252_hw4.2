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

@Tag("40")
class Record_1322 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1322: FirstName is Elsie")
	void FirstNameOfRecord1322() {
		assertEquals("Elsie", customers.get(1321).getFirstName());
	}

	@Test
	@DisplayName("Record 1322: LastName is Lemon")
	void LastNameOfRecord1322() {
		assertEquals("Lemon", customers.get(1321).getLastName());
	}

	@Test
	@DisplayName("Record 1322: Company is Middletown Journal")
	void CompanyOfRecord1322() {
		assertEquals("Middletown Journal", customers.get(1321).getCompany());
	}

	@Test
	@DisplayName("Record 1322: Address is 348 E Liberty St")
	void AddressOfRecord1322() {
		assertEquals("348 E Liberty St", customers.get(1321).getAddress());
	}

	@Test
	@DisplayName("Record 1322: City is Wooster")
	void CityOfRecord1322() {
		assertEquals("Wooster", customers.get(1321).getCity());
	}

	@Test
	@DisplayName("Record 1322: County is Wayne")
	void CountyOfRecord1322() {
		assertEquals("Wayne", customers.get(1321).getCounty());
	}

	@Test
	@DisplayName("Record 1322: State is OH")
	void StateOfRecord1322() {
		assertEquals("OH", customers.get(1321).getState());
	}

	@Test
	@DisplayName("Record 1322: ZIP is 44691")
	void ZIPOfRecord1322() {
		assertEquals("44691", customers.get(1321).getZIP());
	}

	@Test
	@DisplayName("Record 1322: Phone is 330-264-7944")
	void PhoneOfRecord1322() {
		assertEquals("330-264-7944", customers.get(1321).getPhone());
	}

	@Test
	@DisplayName("Record 1322: Fax is 330-264-6175")
	void FaxOfRecord1322() {
		assertEquals("330-264-6175", customers.get(1321).getFax());
	}

	@Test
	@DisplayName("Record 1322: Email is elsie@lemon.com")
	void EmailOfRecord1322() {
		assertEquals("elsie@lemon.com", customers.get(1321).getEmail());
	}

	@Test
	@DisplayName("Record 1322: Web is http://www.elsielemon.com")
	void WebOfRecord1322() {
		assertEquals("http://www.elsielemon.com", customers.get(1321).getWeb());
	}
}
