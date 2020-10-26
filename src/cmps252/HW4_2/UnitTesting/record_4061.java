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

@Tag("19")
class Record_4061 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4061: FirstName is Jodi")
	void FirstNameOfRecord4061() {
		assertEquals("Jodi", customers.get(4060).getFirstName());
	}

	@Test
	@DisplayName("Record 4061: LastName is Roccio")
	void LastNameOfRecord4061() {
		assertEquals("Roccio", customers.get(4060).getLastName());
	}

	@Test
	@DisplayName("Record 4061: Company is Pure News")
	void CompanyOfRecord4061() {
		assertEquals("Pure News", customers.get(4060).getCompany());
	}

	@Test
	@DisplayName("Record 4061: Address is 1323c Shepherd Dr")
	void AddressOfRecord4061() {
		assertEquals("1323c Shepherd Dr", customers.get(4060).getAddress());
	}

	@Test
	@DisplayName("Record 4061: City is Sterling")
	void CityOfRecord4061() {
		assertEquals("Sterling", customers.get(4060).getCity());
	}

	@Test
	@DisplayName("Record 4061: County is Loudoun")
	void CountyOfRecord4061() {
		assertEquals("Loudoun", customers.get(4060).getCounty());
	}

	@Test
	@DisplayName("Record 4061: State is VA")
	void StateOfRecord4061() {
		assertEquals("VA", customers.get(4060).getState());
	}

	@Test
	@DisplayName("Record 4061: ZIP is 20164")
	void ZIPOfRecord4061() {
		assertEquals("20164", customers.get(4060).getZIP());
	}

	@Test
	@DisplayName("Record 4061: Phone is 703-450-4883")
	void PhoneOfRecord4061() {
		assertEquals("703-450-4883", customers.get(4060).getPhone());
	}

	@Test
	@DisplayName("Record 4061: Fax is 703-450-7719")
	void FaxOfRecord4061() {
		assertEquals("703-450-7719", customers.get(4060).getFax());
	}

	@Test
	@DisplayName("Record 4061: Email is jodi@roccio.com")
	void EmailOfRecord4061() {
		assertEquals("jodi@roccio.com", customers.get(4060).getEmail());
	}

	@Test
	@DisplayName("Record 4061: Web is http://www.jodiroccio.com")
	void WebOfRecord4061() {
		assertEquals("http://www.jodiroccio.com", customers.get(4060).getWeb());
	}
}
