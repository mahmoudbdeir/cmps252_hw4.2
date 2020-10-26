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

@Tag("29")
class Record_1788 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1788: FirstName is Joel")
	void FirstNameOfRecord1788() {
		assertEquals("Joel", customers.get(1787).getFirstName());
	}

	@Test
	@DisplayName("Record 1788: LastName is Vassel")
	void LastNameOfRecord1788() {
		assertEquals("Vassel", customers.get(1787).getLastName());
	}

	@Test
	@DisplayName("Record 1788: Company is Biotrol International Inc")
	void CompanyOfRecord1788() {
		assertEquals("Biotrol International Inc", customers.get(1787).getCompany());
	}

	@Test
	@DisplayName("Record 1788: Address is 600 Harrison St")
	void AddressOfRecord1788() {
		assertEquals("600 Harrison St", customers.get(1787).getAddress());
	}

	@Test
	@DisplayName("Record 1788: City is San Francisco")
	void CityOfRecord1788() {
		assertEquals("San Francisco", customers.get(1787).getCity());
	}

	@Test
	@DisplayName("Record 1788: County is San Francisco")
	void CountyOfRecord1788() {
		assertEquals("San Francisco", customers.get(1787).getCounty());
	}

	@Test
	@DisplayName("Record 1788: State is CA")
	void StateOfRecord1788() {
		assertEquals("CA", customers.get(1787).getState());
	}

	@Test
	@DisplayName("Record 1788: ZIP is 94107")
	void ZIPOfRecord1788() {
		assertEquals("94107", customers.get(1787).getZIP());
	}

	@Test
	@DisplayName("Record 1788: Phone is 415-905-5970")
	void PhoneOfRecord1788() {
		assertEquals("415-905-5970", customers.get(1787).getPhone());
	}

	@Test
	@DisplayName("Record 1788: Fax is 415-905-8436")
	void FaxOfRecord1788() {
		assertEquals("415-905-8436", customers.get(1787).getFax());
	}

	@Test
	@DisplayName("Record 1788: Email is joel@vassel.com")
	void EmailOfRecord1788() {
		assertEquals("joel@vassel.com", customers.get(1787).getEmail());
	}

	@Test
	@DisplayName("Record 1788: Web is http://www.joelvassel.com")
	void WebOfRecord1788() {
		assertEquals("http://www.joelvassel.com", customers.get(1787).getWeb());
	}
}
