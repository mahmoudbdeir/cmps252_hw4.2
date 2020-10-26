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

@Tag("14")
class Record_284 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 284: FirstName is Milan")
	void FirstNameOfRecord284() {
		assertEquals("Milan", customers.get(283).getFirstName());
	}

	@Test
	@DisplayName("Record 284: LastName is Kubert")
	void LastNameOfRecord284() {
		assertEquals("Kubert", customers.get(283).getLastName());
	}

	@Test
	@DisplayName("Record 284: Company is Ward, James Albert")
	void CompanyOfRecord284() {
		assertEquals("Ward, James Albert", customers.get(283).getCompany());
	}

	@Test
	@DisplayName("Record 284: Address is 6 W Bacon St")
	void AddressOfRecord284() {
		assertEquals("6 W Bacon St", customers.get(283).getAddress());
	}

	@Test
	@DisplayName("Record 284: City is Plainville")
	void CityOfRecord284() {
		assertEquals("Plainville", customers.get(283).getCity());
	}

	@Test
	@DisplayName("Record 284: County is Norfolk")
	void CountyOfRecord284() {
		assertEquals("Norfolk", customers.get(283).getCounty());
	}

	@Test
	@DisplayName("Record 284: State is MA")
	void StateOfRecord284() {
		assertEquals("MA", customers.get(283).getState());
	}

	@Test
	@DisplayName("Record 284: ZIP is 2762")
	void ZIPOfRecord284() {
		assertEquals("2762", customers.get(283).getZIP());
	}

	@Test
	@DisplayName("Record 284: Phone is 508-699-1948")
	void PhoneOfRecord284() {
		assertEquals("508-699-1948", customers.get(283).getPhone());
	}

	@Test
	@DisplayName("Record 284: Fax is 508-699-6057")
	void FaxOfRecord284() {
		assertEquals("508-699-6057", customers.get(283).getFax());
	}

	@Test
	@DisplayName("Record 284: Email is milan@kubert.com")
	void EmailOfRecord284() {
		assertEquals("milan@kubert.com", customers.get(283).getEmail());
	}

	@Test
	@DisplayName("Record 284: Web is http://www.milankubert.com")
	void WebOfRecord284() {
		assertEquals("http://www.milankubert.com", customers.get(283).getWeb());
	}
}
