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

@Tag("47")
class Record_558 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 558: FirstName is Mason")
	void FirstNameOfRecord558() {
		assertEquals("Mason", customers.get(557).getFirstName());
	}

	@Test
	@DisplayName("Record 558: LastName is Rodas")
	void LastNameOfRecord558() {
		assertEquals("Rodas", customers.get(557).getLastName());
	}

	@Test
	@DisplayName("Record 558: Company is Browning Ferris Industries")
	void CompanyOfRecord558() {
		assertEquals("Browning Ferris Industries", customers.get(557).getCompany());
	}

	@Test
	@DisplayName("Record 558: Address is 1961 Walters Ct")
	void AddressOfRecord558() {
		assertEquals("1961 Walters Ct", customers.get(557).getAddress());
	}

	@Test
	@DisplayName("Record 558: City is Fairfield")
	void CityOfRecord558() {
		assertEquals("Fairfield", customers.get(557).getCity());
	}

	@Test
	@DisplayName("Record 558: County is Solano")
	void CountyOfRecord558() {
		assertEquals("Solano", customers.get(557).getCounty());
	}

	@Test
	@DisplayName("Record 558: State is CA")
	void StateOfRecord558() {
		assertEquals("CA", customers.get(557).getState());
	}

	@Test
	@DisplayName("Record 558: ZIP is 94533")
	void ZIPOfRecord558() {
		assertEquals("94533", customers.get(557).getZIP());
	}

	@Test
	@DisplayName("Record 558: Phone is 707-429-6589")
	void PhoneOfRecord558() {
		assertEquals("707-429-6589", customers.get(557).getPhone());
	}

	@Test
	@DisplayName("Record 558: Fax is 707-429-7046")
	void FaxOfRecord558() {
		assertEquals("707-429-7046", customers.get(557).getFax());
	}

	@Test
	@DisplayName("Record 558: Email is mason@rodas.com")
	void EmailOfRecord558() {
		assertEquals("mason@rodas.com", customers.get(557).getEmail());
	}

	@Test
	@DisplayName("Record 558: Web is http://www.masonrodas.com")
	void WebOfRecord558() {
		assertEquals("http://www.masonrodas.com", customers.get(557).getWeb());
	}
}
