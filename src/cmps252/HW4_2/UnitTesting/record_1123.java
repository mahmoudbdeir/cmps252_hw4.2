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

@Tag("39")
class Record_1123 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1123: FirstName is Laura")
	void FirstNameOfRecord1123() {
		assertEquals("Laura", customers.get(1122).getFirstName());
	}

	@Test
	@DisplayName("Record 1123: LastName is Schydecker")
	void LastNameOfRecord1123() {
		assertEquals("Schydecker", customers.get(1122).getLastName());
	}

	@Test
	@DisplayName("Record 1123: Company is Fry, Mark W Esq")
	void CompanyOfRecord1123() {
		assertEquals("Fry, Mark W Esq", customers.get(1122).getCompany());
	}

	@Test
	@DisplayName("Record 1123: Address is 2723 Anthony Ave")
	void AddressOfRecord1123() {
		assertEquals("2723 Anthony Ave", customers.get(1122).getAddress());
	}

	@Test
	@DisplayName("Record 1123: City is Janesville")
	void CityOfRecord1123() {
		assertEquals("Janesville", customers.get(1122).getCity());
	}

	@Test
	@DisplayName("Record 1123: County is Rock")
	void CountyOfRecord1123() {
		assertEquals("Rock", customers.get(1122).getCounty());
	}

	@Test
	@DisplayName("Record 1123: State is WI")
	void StateOfRecord1123() {
		assertEquals("WI", customers.get(1122).getState());
	}

	@Test
	@DisplayName("Record 1123: ZIP is 53546")
	void ZIPOfRecord1123() {
		assertEquals("53546", customers.get(1122).getZIP());
	}

	@Test
	@DisplayName("Record 1123: Phone is 608-754-1674")
	void PhoneOfRecord1123() {
		assertEquals("608-754-1674", customers.get(1122).getPhone());
	}

	@Test
	@DisplayName("Record 1123: Fax is 608-754-9481")
	void FaxOfRecord1123() {
		assertEquals("608-754-9481", customers.get(1122).getFax());
	}

	@Test
	@DisplayName("Record 1123: Email is laura@schydecker.com")
	void EmailOfRecord1123() {
		assertEquals("laura@schydecker.com", customers.get(1122).getEmail());
	}

	@Test
	@DisplayName("Record 1123: Web is http://www.lauraschydecker.com")
	void WebOfRecord1123() {
		assertEquals("http://www.lauraschydecker.com", customers.get(1122).getWeb());
	}
}
