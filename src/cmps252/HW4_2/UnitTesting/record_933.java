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

@Tag("3")
class Record_933 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 933: FirstName is Lynette")
	void FirstNameOfRecord933() {
		assertEquals("Lynette", customers.get(932).getFirstName());
	}

	@Test
	@DisplayName("Record 933: LastName is Zoucha")
	void LastNameOfRecord933() {
		assertEquals("Zoucha", customers.get(932).getLastName());
	}

	@Test
	@DisplayName("Record 933: Company is Riders Engraving Service")
	void CompanyOfRecord933() {
		assertEquals("Riders Engraving Service", customers.get(932).getCompany());
	}

	@Test
	@DisplayName("Record 933: Address is 2244 S Shirlington Rd")
	void AddressOfRecord933() {
		assertEquals("2244 S Shirlington Rd", customers.get(932).getAddress());
	}

	@Test
	@DisplayName("Record 933: City is Arlington")
	void CityOfRecord933() {
		assertEquals("Arlington", customers.get(932).getCity());
	}

	@Test
	@DisplayName("Record 933: County is Arlington")
	void CountyOfRecord933() {
		assertEquals("Arlington", customers.get(932).getCounty());
	}

	@Test
	@DisplayName("Record 933: State is VA")
	void StateOfRecord933() {
		assertEquals("VA", customers.get(932).getState());
	}

	@Test
	@DisplayName("Record 933: ZIP is 22206")
	void ZIPOfRecord933() {
		assertEquals("22206", customers.get(932).getZIP());
	}

	@Test
	@DisplayName("Record 933: Phone is 703-892-8146")
	void PhoneOfRecord933() {
		assertEquals("703-892-8146", customers.get(932).getPhone());
	}

	@Test
	@DisplayName("Record 933: Fax is 703-892-9071")
	void FaxOfRecord933() {
		assertEquals("703-892-9071", customers.get(932).getFax());
	}

	@Test
	@DisplayName("Record 933: Email is lynette@zoucha.com")
	void EmailOfRecord933() {
		assertEquals("lynette@zoucha.com", customers.get(932).getEmail());
	}

	@Test
	@DisplayName("Record 933: Web is http://www.lynettezoucha.com")
	void WebOfRecord933() {
		assertEquals("http://www.lynettezoucha.com", customers.get(932).getWeb());
	}
}
