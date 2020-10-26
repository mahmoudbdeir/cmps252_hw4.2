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

@Tag("10")
class Record_2689 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2689: FirstName is Bob")
	void FirstNameOfRecord2689() {
		assertEquals("Bob", customers.get(2688).getFirstName());
	}

	@Test
	@DisplayName("Record 2689: LastName is Wagman")
	void LastNameOfRecord2689() {
		assertEquals("Wagman", customers.get(2688).getLastName());
	}

	@Test
	@DisplayName("Record 2689: Company is Canfield Moore Shapiro Sease")
	void CompanyOfRecord2689() {
		assertEquals("Canfield Moore Shapiro Sease", customers.get(2688).getCompany());
	}

	@Test
	@DisplayName("Record 2689: Address is 44519 10th St W")
	void AddressOfRecord2689() {
		assertEquals("44519 10th St W", customers.get(2688).getAddress());
	}

	@Test
	@DisplayName("Record 2689: City is Lancaster")
	void CityOfRecord2689() {
		assertEquals("Lancaster", customers.get(2688).getCity());
	}

	@Test
	@DisplayName("Record 2689: County is Los Angeles")
	void CountyOfRecord2689() {
		assertEquals("Los Angeles", customers.get(2688).getCounty());
	}

	@Test
	@DisplayName("Record 2689: State is CA")
	void StateOfRecord2689() {
		assertEquals("CA", customers.get(2688).getState());
	}

	@Test
	@DisplayName("Record 2689: ZIP is 93534")
	void ZIPOfRecord2689() {
		assertEquals("93534", customers.get(2688).getZIP());
	}

	@Test
	@DisplayName("Record 2689: Phone is 661-949-4179")
	void PhoneOfRecord2689() {
		assertEquals("661-949-4179", customers.get(2688).getPhone());
	}

	@Test
	@DisplayName("Record 2689: Fax is 661-949-9991")
	void FaxOfRecord2689() {
		assertEquals("661-949-9991", customers.get(2688).getFax());
	}

	@Test
	@DisplayName("Record 2689: Email is bob@wagman.com")
	void EmailOfRecord2689() {
		assertEquals("bob@wagman.com", customers.get(2688).getEmail());
	}

	@Test
	@DisplayName("Record 2689: Web is http://www.bobwagman.com")
	void WebOfRecord2689() {
		assertEquals("http://www.bobwagman.com", customers.get(2688).getWeb());
	}
}
