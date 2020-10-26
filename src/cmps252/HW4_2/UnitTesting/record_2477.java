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

@Tag("22")
class Record_2477 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2477: FirstName is Jeanette")
	void FirstNameOfRecord2477() {
		assertEquals("Jeanette", customers.get(2476).getFirstName());
	}

	@Test
	@DisplayName("Record 2477: LastName is Carn")
	void LastNameOfRecord2477() {
		assertEquals("Carn", customers.get(2476).getLastName());
	}

	@Test
	@DisplayName("Record 2477: Company is Artcraft Printers Inc")
	void CompanyOfRecord2477() {
		assertEquals("Artcraft Printers Inc", customers.get(2476).getCompany());
	}

	@Test
	@DisplayName("Record 2477: Address is 233 Broadway")
	void AddressOfRecord2477() {
		assertEquals("233 Broadway", customers.get(2476).getAddress());
	}

	@Test
	@DisplayName("Record 2477: City is New York")
	void CityOfRecord2477() {
		assertEquals("New York", customers.get(2476).getCity());
	}

	@Test
	@DisplayName("Record 2477: County is New York")
	void CountyOfRecord2477() {
		assertEquals("New York", customers.get(2476).getCounty());
	}

	@Test
	@DisplayName("Record 2477: State is NY")
	void StateOfRecord2477() {
		assertEquals("NY", customers.get(2476).getState());
	}

	@Test
	@DisplayName("Record 2477: ZIP is 10279")
	void ZIPOfRecord2477() {
		assertEquals("10279", customers.get(2476).getZIP());
	}

	@Test
	@DisplayName("Record 2477: Phone is 212-962-2406")
	void PhoneOfRecord2477() {
		assertEquals("212-962-2406", customers.get(2476).getPhone());
	}

	@Test
	@DisplayName("Record 2477: Fax is 212-962-0004")
	void FaxOfRecord2477() {
		assertEquals("212-962-0004", customers.get(2476).getFax());
	}

	@Test
	@DisplayName("Record 2477: Email is jeanette@carn.com")
	void EmailOfRecord2477() {
		assertEquals("jeanette@carn.com", customers.get(2476).getEmail());
	}

	@Test
	@DisplayName("Record 2477: Web is http://www.jeanettecarn.com")
	void WebOfRecord2477() {
		assertEquals("http://www.jeanettecarn.com", customers.get(2476).getWeb());
	}
}
