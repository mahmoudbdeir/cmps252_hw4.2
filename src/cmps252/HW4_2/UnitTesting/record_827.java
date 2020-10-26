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

@Tag("36")
class Record_827 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 827: FirstName is Rudy")
	void FirstNameOfRecord827() {
		assertEquals("Rudy", customers.get(826).getFirstName());
	}

	@Test
	@DisplayName("Record 827: LastName is Demuzio")
	void LastNameOfRecord827() {
		assertEquals("Demuzio", customers.get(826).getLastName());
	}

	@Test
	@DisplayName("Record 827: Company is Inter Ski Services Inc")
	void CompanyOfRecord827() {
		assertEquals("Inter Ski Services Inc", customers.get(826).getCompany());
	}

	@Test
	@DisplayName("Record 827: Address is 823 Atlanta Rd")
	void AddressOfRecord827() {
		assertEquals("823 Atlanta Rd", customers.get(826).getAddress());
	}

	@Test
	@DisplayName("Record 827: City is Marietta")
	void CityOfRecord827() {
		assertEquals("Marietta", customers.get(826).getCity());
	}

	@Test
	@DisplayName("Record 827: County is Cobb")
	void CountyOfRecord827() {
		assertEquals("Cobb", customers.get(826).getCounty());
	}

	@Test
	@DisplayName("Record 827: State is GA")
	void StateOfRecord827() {
		assertEquals("GA", customers.get(826).getState());
	}

	@Test
	@DisplayName("Record 827: ZIP is 30060")
	void ZIPOfRecord827() {
		assertEquals("30060", customers.get(826).getZIP());
	}

	@Test
	@DisplayName("Record 827: Phone is 770-428-1080")
	void PhoneOfRecord827() {
		assertEquals("770-428-1080", customers.get(826).getPhone());
	}

	@Test
	@DisplayName("Record 827: Fax is 770-428-3357")
	void FaxOfRecord827() {
		assertEquals("770-428-3357", customers.get(826).getFax());
	}

	@Test
	@DisplayName("Record 827: Email is rudy@demuzio.com")
	void EmailOfRecord827() {
		assertEquals("rudy@demuzio.com", customers.get(826).getEmail());
	}

	@Test
	@DisplayName("Record 827: Web is http://www.rudydemuzio.com")
	void WebOfRecord827() {
		assertEquals("http://www.rudydemuzio.com", customers.get(826).getWeb());
	}
}
