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

@Tag("31")
class Record_3095 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3095: FirstName is Josefina")
	void FirstNameOfRecord3095() {
		assertEquals("Josefina", customers.get(3094).getFirstName());
	}

	@Test
	@DisplayName("Record 3095: LastName is Kimbley")
	void LastNameOfRecord3095() {
		assertEquals("Kimbley", customers.get(3094).getLastName());
	}

	@Test
	@DisplayName("Record 3095: Company is Baltimore Public Works Museum")
	void CompanyOfRecord3095() {
		assertEquals("Baltimore Public Works Museum", customers.get(3094).getCompany());
	}

	@Test
	@DisplayName("Record 3095: Address is 318 Us Highway 9")
	void AddressOfRecord3095() {
		assertEquals("318 Us Highway 9", customers.get(3094).getAddress());
	}

	@Test
	@DisplayName("Record 3095: City is Englishtown")
	void CityOfRecord3095() {
		assertEquals("Englishtown", customers.get(3094).getCity());
	}

	@Test
	@DisplayName("Record 3095: County is Monmouth")
	void CountyOfRecord3095() {
		assertEquals("Monmouth", customers.get(3094).getCounty());
	}

	@Test
	@DisplayName("Record 3095: State is NJ")
	void StateOfRecord3095() {
		assertEquals("NJ", customers.get(3094).getState());
	}

	@Test
	@DisplayName("Record 3095: ZIP is 7726")
	void ZIPOfRecord3095() {
		assertEquals("7726", customers.get(3094).getZIP());
	}

	@Test
	@DisplayName("Record 3095: Phone is 732-446-9816")
	void PhoneOfRecord3095() {
		assertEquals("732-446-9816", customers.get(3094).getPhone());
	}

	@Test
	@DisplayName("Record 3095: Fax is 732-446-5121")
	void FaxOfRecord3095() {
		assertEquals("732-446-5121", customers.get(3094).getFax());
	}

	@Test
	@DisplayName("Record 3095: Email is josefina@kimbley.com")
	void EmailOfRecord3095() {
		assertEquals("josefina@kimbley.com", customers.get(3094).getEmail());
	}

	@Test
	@DisplayName("Record 3095: Web is http://www.josefinakimbley.com")
	void WebOfRecord3095() {
		assertEquals("http://www.josefinakimbley.com", customers.get(3094).getWeb());
	}
}
