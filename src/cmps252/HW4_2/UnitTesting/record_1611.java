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

@Tag("42")
class Record_1611 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1611: FirstName is Harley")
	void FirstNameOfRecord1611() {
		assertEquals("Harley", customers.get(1610).getFirstName());
	}

	@Test
	@DisplayName("Record 1611: LastName is Stecklair")
	void LastNameOfRecord1611() {
		assertEquals("Stecklair", customers.get(1610).getLastName());
	}

	@Test
	@DisplayName("Record 1611: Company is Hampton Inn St Louis Airport")
	void CompanyOfRecord1611() {
		assertEquals("Hampton Inn St Louis Airport", customers.get(1610).getCompany());
	}

	@Test
	@DisplayName("Record 1611: Address is 1364 Beverly Rd")
	void AddressOfRecord1611() {
		assertEquals("1364 Beverly Rd", customers.get(1610).getAddress());
	}

	@Test
	@DisplayName("Record 1611: City is Mc Lean")
	void CityOfRecord1611() {
		assertEquals("Mc Lean", customers.get(1610).getCity());
	}

	@Test
	@DisplayName("Record 1611: County is Fairfax")
	void CountyOfRecord1611() {
		assertEquals("Fairfax", customers.get(1610).getCounty());
	}

	@Test
	@DisplayName("Record 1611: State is VA")
	void StateOfRecord1611() {
		assertEquals("VA", customers.get(1610).getState());
	}

	@Test
	@DisplayName("Record 1611: ZIP is 22101")
	void ZIPOfRecord1611() {
		assertEquals("22101", customers.get(1610).getZIP());
	}

	@Test
	@DisplayName("Record 1611: Phone is 703-734-3612")
	void PhoneOfRecord1611() {
		assertEquals("703-734-3612", customers.get(1610).getPhone());
	}

	@Test
	@DisplayName("Record 1611: Fax is 703-734-9015")
	void FaxOfRecord1611() {
		assertEquals("703-734-9015", customers.get(1610).getFax());
	}

	@Test
	@DisplayName("Record 1611: Email is harley@stecklair.com")
	void EmailOfRecord1611() {
		assertEquals("harley@stecklair.com", customers.get(1610).getEmail());
	}

	@Test
	@DisplayName("Record 1611: Web is http://www.harleystecklair.com")
	void WebOfRecord1611() {
		assertEquals("http://www.harleystecklair.com", customers.get(1610).getWeb());
	}
}
