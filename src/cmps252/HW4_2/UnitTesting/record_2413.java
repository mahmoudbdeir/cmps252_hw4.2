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

@Tag("20")
class Record_2413 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2413: FirstName is Jewel")
	void FirstNameOfRecord2413() {
		assertEquals("Jewel", customers.get(2412).getFirstName());
	}

	@Test
	@DisplayName("Record 2413: LastName is Krishman")
	void LastNameOfRecord2413() {
		assertEquals("Krishman", customers.get(2412).getLastName());
	}

	@Test
	@DisplayName("Record 2413: Company is Rosenberg, Bryan D Esq")
	void CompanyOfRecord2413() {
		assertEquals("Rosenberg, Bryan D Esq", customers.get(2412).getCompany());
	}

	@Test
	@DisplayName("Record 2413: Address is 39926 Us Highway 19n N")
	void AddressOfRecord2413() {
		assertEquals("39926 Us Highway 19n N", customers.get(2412).getAddress());
	}

	@Test
	@DisplayName("Record 2413: City is Tarpon Springs")
	void CityOfRecord2413() {
		assertEquals("Tarpon Springs", customers.get(2412).getCity());
	}

	@Test
	@DisplayName("Record 2413: County is Pinellas")
	void CountyOfRecord2413() {
		assertEquals("Pinellas", customers.get(2412).getCounty());
	}

	@Test
	@DisplayName("Record 2413: State is FL")
	void StateOfRecord2413() {
		assertEquals("FL", customers.get(2412).getState());
	}

	@Test
	@DisplayName("Record 2413: ZIP is 34689")
	void ZIPOfRecord2413() {
		assertEquals("34689", customers.get(2412).getZIP());
	}

	@Test
	@DisplayName("Record 2413: Phone is 727-938-4011")
	void PhoneOfRecord2413() {
		assertEquals("727-938-4011", customers.get(2412).getPhone());
	}

	@Test
	@DisplayName("Record 2413: Fax is 727-938-5984")
	void FaxOfRecord2413() {
		assertEquals("727-938-5984", customers.get(2412).getFax());
	}

	@Test
	@DisplayName("Record 2413: Email is jewel@krishman.com")
	void EmailOfRecord2413() {
		assertEquals("jewel@krishman.com", customers.get(2412).getEmail());
	}

	@Test
	@DisplayName("Record 2413: Web is http://www.jewelkrishman.com")
	void WebOfRecord2413() {
		assertEquals("http://www.jewelkrishman.com", customers.get(2412).getWeb());
	}
}
