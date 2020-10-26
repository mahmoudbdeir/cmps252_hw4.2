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
class Record_1715 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1715: FirstName is Michael")
	void FirstNameOfRecord1715() {
		assertEquals("Michael", customers.get(1714).getFirstName());
	}

	@Test
	@DisplayName("Record 1715: LastName is Kaster")
	void LastNameOfRecord1715() {
		assertEquals("Kaster", customers.get(1714).getLastName());
	}

	@Test
	@DisplayName("Record 1715: Company is Lincoln Oakton Curr Exch Inc")
	void CompanyOfRecord1715() {
		assertEquals("Lincoln Oakton Curr Exch Inc", customers.get(1714).getCompany());
	}

	@Test
	@DisplayName("Record 1715: Address is 3470 Ocean View Blvd")
	void AddressOfRecord1715() {
		assertEquals("3470 Ocean View Blvd", customers.get(1714).getAddress());
	}

	@Test
	@DisplayName("Record 1715: City is Glendale")
	void CityOfRecord1715() {
		assertEquals("Glendale", customers.get(1714).getCity());
	}

	@Test
	@DisplayName("Record 1715: County is Los Angeles")
	void CountyOfRecord1715() {
		assertEquals("Los Angeles", customers.get(1714).getCounty());
	}

	@Test
	@DisplayName("Record 1715: State is CA")
	void StateOfRecord1715() {
		assertEquals("CA", customers.get(1714).getState());
	}

	@Test
	@DisplayName("Record 1715: ZIP is 91208")
	void ZIPOfRecord1715() {
		assertEquals("91208", customers.get(1714).getZIP());
	}

	@Test
	@DisplayName("Record 1715: Phone is 818-249-6038")
	void PhoneOfRecord1715() {
		assertEquals("818-249-6038", customers.get(1714).getPhone());
	}

	@Test
	@DisplayName("Record 1715: Fax is 818-249-3515")
	void FaxOfRecord1715() {
		assertEquals("818-249-3515", customers.get(1714).getFax());
	}

	@Test
	@DisplayName("Record 1715: Email is michael@kaster.com")
	void EmailOfRecord1715() {
		assertEquals("michael@kaster.com", customers.get(1714).getEmail());
	}

	@Test
	@DisplayName("Record 1715: Web is http://www.michaelkaster.com")
	void WebOfRecord1715() {
		assertEquals("http://www.michaelkaster.com", customers.get(1714).getWeb());
	}
}
