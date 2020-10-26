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

@Tag("31")
class Record_2194 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2194: FirstName is Alana")
	void FirstNameOfRecord2194() {
		assertEquals("Alana", customers.get(2193).getFirstName());
	}

	@Test
	@DisplayName("Record 2194: LastName is Mcanulty")
	void LastNameOfRecord2194() {
		assertEquals("Mcanulty", customers.get(2193).getLastName());
	}

	@Test
	@DisplayName("Record 2194: Company is Perpetual Savings Bank")
	void CompanyOfRecord2194() {
		assertEquals("Perpetual Savings Bank", customers.get(2193).getCompany());
	}

	@Test
	@DisplayName("Record 2194: Address is 5400 N Lamar Blvd  #-201")
	void AddressOfRecord2194() {
		assertEquals("5400 N Lamar Blvd  #-201", customers.get(2193).getAddress());
	}

	@Test
	@DisplayName("Record 2194: City is Austin")
	void CityOfRecord2194() {
		assertEquals("Austin", customers.get(2193).getCity());
	}

	@Test
	@DisplayName("Record 2194: County is Travis")
	void CountyOfRecord2194() {
		assertEquals("Travis", customers.get(2193).getCounty());
	}

	@Test
	@DisplayName("Record 2194: State is TX")
	void StateOfRecord2194() {
		assertEquals("TX", customers.get(2193).getState());
	}

	@Test
	@DisplayName("Record 2194: ZIP is 78751")
	void ZIPOfRecord2194() {
		assertEquals("78751", customers.get(2193).getZIP());
	}

	@Test
	@DisplayName("Record 2194: Phone is 512-454-9992")
	void PhoneOfRecord2194() {
		assertEquals("512-454-9992", customers.get(2193).getPhone());
	}

	@Test
	@DisplayName("Record 2194: Fax is 512-454-4351")
	void FaxOfRecord2194() {
		assertEquals("512-454-4351", customers.get(2193).getFax());
	}

	@Test
	@DisplayName("Record 2194: Email is alana@mcanulty.com")
	void EmailOfRecord2194() {
		assertEquals("alana@mcanulty.com", customers.get(2193).getEmail());
	}

	@Test
	@DisplayName("Record 2194: Web is http://www.alanamcanulty.com")
	void WebOfRecord2194() {
		assertEquals("http://www.alanamcanulty.com", customers.get(2193).getWeb());
	}
}
