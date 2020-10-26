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

@Tag("44")
class Record_2249 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2249: FirstName is Gretchen")
	void FirstNameOfRecord2249() {
		assertEquals("Gretchen", customers.get(2248).getFirstName());
	}

	@Test
	@DisplayName("Record 2249: LastName is Nivison")
	void LastNameOfRecord2249() {
		assertEquals("Nivison", customers.get(2248).getLastName());
	}

	@Test
	@DisplayName("Record 2249: Company is Dooley Groves")
	void CompanyOfRecord2249() {
		assertEquals("Dooley Groves", customers.get(2248).getCompany());
	}

	@Test
	@DisplayName("Record 2249: Address is 459 W 15th St")
	void AddressOfRecord2249() {
		assertEquals("459 W 15th St", customers.get(2248).getAddress());
	}

	@Test
	@DisplayName("Record 2249: City is New York")
	void CityOfRecord2249() {
		assertEquals("New York", customers.get(2248).getCity());
	}

	@Test
	@DisplayName("Record 2249: County is New York")
	void CountyOfRecord2249() {
		assertEquals("New York", customers.get(2248).getCounty());
	}

	@Test
	@DisplayName("Record 2249: State is NY")
	void StateOfRecord2249() {
		assertEquals("NY", customers.get(2248).getState());
	}

	@Test
	@DisplayName("Record 2249: ZIP is 10011")
	void ZIPOfRecord2249() {
		assertEquals("10011", customers.get(2248).getZIP());
	}

	@Test
	@DisplayName("Record 2249: Phone is 212-366-3157")
	void PhoneOfRecord2249() {
		assertEquals("212-366-3157", customers.get(2248).getPhone());
	}

	@Test
	@DisplayName("Record 2249: Fax is 212-366-6668")
	void FaxOfRecord2249() {
		assertEquals("212-366-6668", customers.get(2248).getFax());
	}

	@Test
	@DisplayName("Record 2249: Email is gretchen@nivison.com")
	void EmailOfRecord2249() {
		assertEquals("gretchen@nivison.com", customers.get(2248).getEmail());
	}

	@Test
	@DisplayName("Record 2249: Web is http://www.gretchennivison.com")
	void WebOfRecord2249() {
		assertEquals("http://www.gretchennivison.com", customers.get(2248).getWeb());
	}
}
