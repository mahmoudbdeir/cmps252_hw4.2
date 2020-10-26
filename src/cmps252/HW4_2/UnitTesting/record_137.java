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
class Record_137 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 137: FirstName is Tameka")
	void FirstNameOfRecord137() {
		assertEquals("Tameka", customers.get(136).getFirstName());
	}

	@Test
	@DisplayName("Record 137: LastName is Forstedt")
	void LastNameOfRecord137() {
		assertEquals("Forstedt", customers.get(136).getLastName());
	}

	@Test
	@DisplayName("Record 137: Company is Rothschild, Steven J Esq")
	void CompanyOfRecord137() {
		assertEquals("Rothschild, Steven J Esq", customers.get(136).getCompany());
	}

	@Test
	@DisplayName("Record 137: Address is 1731 G St")
	void AddressOfRecord137() {
		assertEquals("1731 G St", customers.get(136).getAddress());
	}

	@Test
	@DisplayName("Record 137: City is Arcata")
	void CityOfRecord137() {
		assertEquals("Arcata", customers.get(136).getCity());
	}

	@Test
	@DisplayName("Record 137: County is Humboldt")
	void CountyOfRecord137() {
		assertEquals("Humboldt", customers.get(136).getCounty());
	}

	@Test
	@DisplayName("Record 137: State is CA")
	void StateOfRecord137() {
		assertEquals("CA", customers.get(136).getState());
	}

	@Test
	@DisplayName("Record 137: ZIP is 95521")
	void ZIPOfRecord137() {
		assertEquals("95521", customers.get(136).getZIP());
	}

	@Test
	@DisplayName("Record 137: Phone is 707-826-0973")
	void PhoneOfRecord137() {
		assertEquals("707-826-0973", customers.get(136).getPhone());
	}

	@Test
	@DisplayName("Record 137: Fax is 707-826-5649")
	void FaxOfRecord137() {
		assertEquals("707-826-5649", customers.get(136).getFax());
	}

	@Test
	@DisplayName("Record 137: Email is tameka@forstedt.com")
	void EmailOfRecord137() {
		assertEquals("tameka@forstedt.com", customers.get(136).getEmail());
	}

	@Test
	@DisplayName("Record 137: Web is http://www.tamekaforstedt.com")
	void WebOfRecord137() {
		assertEquals("http://www.tamekaforstedt.com", customers.get(136).getWeb());
	}
}
