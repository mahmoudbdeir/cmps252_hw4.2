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

@Tag("12")
class Record_4439 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4439: FirstName is Shaun")
	void FirstNameOfRecord4439() {
		assertEquals("Shaun", customers.get(4438).getFirstName());
	}

	@Test
	@DisplayName("Record 4439: LastName is Nofziger")
	void LastNameOfRecord4439() {
		assertEquals("Nofziger", customers.get(4438).getLastName());
	}

	@Test
	@DisplayName("Record 4439: Company is Norman, Kenneth J Esq")
	void CompanyOfRecord4439() {
		assertEquals("Norman, Kenneth J Esq", customers.get(4438).getCompany());
	}

	@Test
	@DisplayName("Record 4439: Address is 1800 Stars Aven")
	void AddressOfRecord4439() {
		assertEquals("1800 Stars Aven", customers.get(4438).getAddress());
	}

	@Test
	@DisplayName("Record 4439: City is Los Angeles")
	void CityOfRecord4439() {
		assertEquals("Los Angeles", customers.get(4438).getCity());
	}

	@Test
	@DisplayName("Record 4439: County is Los Angeles")
	void CountyOfRecord4439() {
		assertEquals("Los Angeles", customers.get(4438).getCounty());
	}

	@Test
	@DisplayName("Record 4439: State is CA")
	void StateOfRecord4439() {
		assertEquals("CA", customers.get(4438).getState());
	}

	@Test
	@DisplayName("Record 4439: ZIP is 90067")
	void ZIPOfRecord4439() {
		assertEquals("90067", customers.get(4438).getZIP());
	}

	@Test
	@DisplayName("Record 4439: Phone is 310-203-4396")
	void PhoneOfRecord4439() {
		assertEquals("310-203-4396", customers.get(4438).getPhone());
	}

	@Test
	@DisplayName("Record 4439: Fax is 310-203-1052")
	void FaxOfRecord4439() {
		assertEquals("310-203-1052", customers.get(4438).getFax());
	}

	@Test
	@DisplayName("Record 4439: Email is shaun@nofziger.com")
	void EmailOfRecord4439() {
		assertEquals("shaun@nofziger.com", customers.get(4438).getEmail());
	}

	@Test
	@DisplayName("Record 4439: Web is http://www.shaunnofziger.com")
	void WebOfRecord4439() {
		assertEquals("http://www.shaunnofziger.com", customers.get(4438).getWeb());
	}
}
