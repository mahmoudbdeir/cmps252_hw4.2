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

@Tag("21")
class Record_268 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 268: FirstName is Jennie")
	void FirstNameOfRecord268() {
		assertEquals("Jennie", customers.get(267).getFirstName());
	}

	@Test
	@DisplayName("Record 268: LastName is Oppy")
	void LastNameOfRecord268() {
		assertEquals("Oppy", customers.get(267).getLastName());
	}

	@Test
	@DisplayName("Record 268: Company is Daniel The Weaver Co")
	void CompanyOfRecord268() {
		assertEquals("Daniel The Weaver Co", customers.get(267).getCompany());
	}

	@Test
	@DisplayName("Record 268: Address is 225 Liberty St")
	void AddressOfRecord268() {
		assertEquals("225 Liberty St", customers.get(267).getAddress());
	}

	@Test
	@DisplayName("Record 268: City is New York")
	void CityOfRecord268() {
		assertEquals("New York", customers.get(267).getCity());
	}

	@Test
	@DisplayName("Record 268: County is New York")
	void CountyOfRecord268() {
		assertEquals("New York", customers.get(267).getCounty());
	}

	@Test
	@DisplayName("Record 268: State is NY")
	void StateOfRecord268() {
		assertEquals("NY", customers.get(267).getState());
	}

	@Test
	@DisplayName("Record 268: ZIP is 10281")
	void ZIPOfRecord268() {
		assertEquals("10281", customers.get(267).getZIP());
	}

	@Test
	@DisplayName("Record 268: Phone is 212-786-3778")
	void PhoneOfRecord268() {
		assertEquals("212-786-3778", customers.get(267).getPhone());
	}

	@Test
	@DisplayName("Record 268: Fax is 212-786-5852")
	void FaxOfRecord268() {
		assertEquals("212-786-5852", customers.get(267).getFax());
	}

	@Test
	@DisplayName("Record 268: Email is jennie@oppy.com")
	void EmailOfRecord268() {
		assertEquals("jennie@oppy.com", customers.get(267).getEmail());
	}

	@Test
	@DisplayName("Record 268: Web is http://www.jennieoppy.com")
	void WebOfRecord268() {
		assertEquals("http://www.jennieoppy.com", customers.get(267).getWeb());
	}
}
