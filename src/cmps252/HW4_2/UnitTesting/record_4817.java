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

@Tag("17")
class Record_4817 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4817: FirstName is Adolfo")
	void FirstNameOfRecord4817() {
		assertEquals("Adolfo", customers.get(4816).getFirstName());
	}

	@Test
	@DisplayName("Record 4817: LastName is Turnbill")
	void LastNameOfRecord4817() {
		assertEquals("Turnbill", customers.get(4816).getLastName());
	}

	@Test
	@DisplayName("Record 4817: Company is Law Garcia Davis")
	void CompanyOfRecord4817() {
		assertEquals("Law Garcia Davis", customers.get(4816).getCompany());
	}

	@Test
	@DisplayName("Record 4817: Address is 1301 W Park Ave")
	void AddressOfRecord4817() {
		assertEquals("1301 W Park Ave", customers.get(4816).getAddress());
	}

	@Test
	@DisplayName("Record 4817: City is Asbury Park")
	void CityOfRecord4817() {
		assertEquals("Asbury Park", customers.get(4816).getCity());
	}

	@Test
	@DisplayName("Record 4817: County is Monmouth")
	void CountyOfRecord4817() {
		assertEquals("Monmouth", customers.get(4816).getCounty());
	}

	@Test
	@DisplayName("Record 4817: State is NJ")
	void StateOfRecord4817() {
		assertEquals("NJ", customers.get(4816).getState());
	}

	@Test
	@DisplayName("Record 4817: ZIP is 7712")
	void ZIPOfRecord4817() {
		assertEquals("7712", customers.get(4816).getZIP());
	}

	@Test
	@DisplayName("Record 4817: Phone is 732-493-1948")
	void PhoneOfRecord4817() {
		assertEquals("732-493-1948", customers.get(4816).getPhone());
	}

	@Test
	@DisplayName("Record 4817: Fax is 732-493-7376")
	void FaxOfRecord4817() {
		assertEquals("732-493-7376", customers.get(4816).getFax());
	}

	@Test
	@DisplayName("Record 4817: Email is adolfo@turnbill.com")
	void EmailOfRecord4817() {
		assertEquals("adolfo@turnbill.com", customers.get(4816).getEmail());
	}

	@Test
	@DisplayName("Record 4817: Web is http://www.adolfoturnbill.com")
	void WebOfRecord4817() {
		assertEquals("http://www.adolfoturnbill.com", customers.get(4816).getWeb());
	}
}
