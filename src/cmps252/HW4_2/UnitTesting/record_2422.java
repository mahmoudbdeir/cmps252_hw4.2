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

@Tag("38")
class Record_2422 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2422: FirstName is Dayna")
	void FirstNameOfRecord2422() {
		assertEquals("Dayna", customers.get(2421).getFirstName());
	}

	@Test
	@DisplayName("Record 2422: LastName is Durley")
	void LastNameOfRecord2422() {
		assertEquals("Durley", customers.get(2421).getLastName());
	}

	@Test
	@DisplayName("Record 2422: Company is Bishop, David Esq")
	void CompanyOfRecord2422() {
		assertEquals("Bishop, David Esq", customers.get(2421).getCompany());
	}

	@Test
	@DisplayName("Record 2422: Address is 14731 Garfield Ave")
	void AddressOfRecord2422() {
		assertEquals("14731 Garfield Ave", customers.get(2421).getAddress());
	}

	@Test
	@DisplayName("Record 2422: City is Paramount")
	void CityOfRecord2422() {
		assertEquals("Paramount", customers.get(2421).getCity());
	}

	@Test
	@DisplayName("Record 2422: County is Los Angeles")
	void CountyOfRecord2422() {
		assertEquals("Los Angeles", customers.get(2421).getCounty());
	}

	@Test
	@DisplayName("Record 2422: State is CA")
	void StateOfRecord2422() {
		assertEquals("CA", customers.get(2421).getState());
	}

	@Test
	@DisplayName("Record 2422: ZIP is 90723")
	void ZIPOfRecord2422() {
		assertEquals("90723", customers.get(2421).getZIP());
	}

	@Test
	@DisplayName("Record 2422: Phone is 562-529-3610")
	void PhoneOfRecord2422() {
		assertEquals("562-529-3610", customers.get(2421).getPhone());
	}

	@Test
	@DisplayName("Record 2422: Fax is 562-529-8717")
	void FaxOfRecord2422() {
		assertEquals("562-529-8717", customers.get(2421).getFax());
	}

	@Test
	@DisplayName("Record 2422: Email is dayna@durley.com")
	void EmailOfRecord2422() {
		assertEquals("dayna@durley.com", customers.get(2421).getEmail());
	}

	@Test
	@DisplayName("Record 2422: Web is http://www.daynadurley.com")
	void WebOfRecord2422() {
		assertEquals("http://www.daynadurley.com", customers.get(2421).getWeb());
	}
}
