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

@Tag("2")
class Record_2342 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2342: FirstName is Renae")
	void FirstNameOfRecord2342() {
		assertEquals("Renae", customers.get(2341).getFirstName());
	}

	@Test
	@DisplayName("Record 2342: LastName is Vanoosten")
	void LastNameOfRecord2342() {
		assertEquals("Vanoosten", customers.get(2341).getLastName());
	}

	@Test
	@DisplayName("Record 2342: Company is Ryd, James G Esq")
	void CompanyOfRecord2342() {
		assertEquals("Ryd, James G Esq", customers.get(2341).getCompany());
	}

	@Test
	@DisplayName("Record 2342: Address is 6585 Commerce Blvd")
	void AddressOfRecord2342() {
		assertEquals("6585 Commerce Blvd", customers.get(2341).getAddress());
	}

	@Test
	@DisplayName("Record 2342: City is Rohnert Park")
	void CityOfRecord2342() {
		assertEquals("Rohnert Park", customers.get(2341).getCity());
	}

	@Test
	@DisplayName("Record 2342: County is Sonoma")
	void CountyOfRecord2342() {
		assertEquals("Sonoma", customers.get(2341).getCounty());
	}

	@Test
	@DisplayName("Record 2342: State is CA")
	void StateOfRecord2342() {
		assertEquals("CA", customers.get(2341).getState());
	}

	@Test
	@DisplayName("Record 2342: ZIP is 94928")
	void ZIPOfRecord2342() {
		assertEquals("94928", customers.get(2341).getZIP());
	}

	@Test
	@DisplayName("Record 2342: Phone is 707-585-5582")
	void PhoneOfRecord2342() {
		assertEquals("707-585-5582", customers.get(2341).getPhone());
	}

	@Test
	@DisplayName("Record 2342: Fax is 707-585-0806")
	void FaxOfRecord2342() {
		assertEquals("707-585-0806", customers.get(2341).getFax());
	}

	@Test
	@DisplayName("Record 2342: Email is renae@vanoosten.com")
	void EmailOfRecord2342() {
		assertEquals("renae@vanoosten.com", customers.get(2341).getEmail());
	}

	@Test
	@DisplayName("Record 2342: Web is http://www.renaevanoosten.com")
	void WebOfRecord2342() {
		assertEquals("http://www.renaevanoosten.com", customers.get(2341).getWeb());
	}
}
