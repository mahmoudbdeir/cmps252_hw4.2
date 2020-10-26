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

@Tag("46")
class Record_1644 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1644: FirstName is Elizabeth")
	void FirstNameOfRecord1644() {
		assertEquals("Elizabeth", customers.get(1643).getFirstName());
	}

	@Test
	@DisplayName("Record 1644: LastName is Bratton")
	void LastNameOfRecord1644() {
		assertEquals("Bratton", customers.get(1643).getLastName());
	}

	@Test
	@DisplayName("Record 1644: Company is Kay Stanton & Watson")
	void CompanyOfRecord1644() {
		assertEquals("Kay Stanton & Watson", customers.get(1643).getCompany());
	}

	@Test
	@DisplayName("Record 1644: Address is 2029 Century Park E")
	void AddressOfRecord1644() {
		assertEquals("2029 Century Park E", customers.get(1643).getAddress());
	}

	@Test
	@DisplayName("Record 1644: City is Los Angeles")
	void CityOfRecord1644() {
		assertEquals("Los Angeles", customers.get(1643).getCity());
	}

	@Test
	@DisplayName("Record 1644: County is Los Angeles")
	void CountyOfRecord1644() {
		assertEquals("Los Angeles", customers.get(1643).getCounty());
	}

	@Test
	@DisplayName("Record 1644: State is CA")
	void StateOfRecord1644() {
		assertEquals("CA", customers.get(1643).getState());
	}

	@Test
	@DisplayName("Record 1644: ZIP is 90067")
	void ZIPOfRecord1644() {
		assertEquals("90067", customers.get(1643).getZIP());
	}

	@Test
	@DisplayName("Record 1644: Phone is 310-201-5016")
	void PhoneOfRecord1644() {
		assertEquals("310-201-5016", customers.get(1643).getPhone());
	}

	@Test
	@DisplayName("Record 1644: Fax is 310-201-8942")
	void FaxOfRecord1644() {
		assertEquals("310-201-8942", customers.get(1643).getFax());
	}

	@Test
	@DisplayName("Record 1644: Email is elizabeth@bratton.com")
	void EmailOfRecord1644() {
		assertEquals("elizabeth@bratton.com", customers.get(1643).getEmail());
	}

	@Test
	@DisplayName("Record 1644: Web is http://www.elizabethbratton.com")
	void WebOfRecord1644() {
		assertEquals("http://www.elizabethbratton.com", customers.get(1643).getWeb());
	}
}
