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
class Record_854 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 854: FirstName is Bryon")
	void FirstNameOfRecord854() {
		assertEquals("Bryon", customers.get(853).getFirstName());
	}

	@Test
	@DisplayName("Record 854: LastName is Zumpfe")
	void LastNameOfRecord854() {
		assertEquals("Zumpfe", customers.get(853).getLastName());
	}

	@Test
	@DisplayName("Record 854: Company is Jean Patou Inc")
	void CompanyOfRecord854() {
		assertEquals("Jean Patou Inc", customers.get(853).getCompany());
	}

	@Test
	@DisplayName("Record 854: Address is 3458 Hooker Rd")
	void AddressOfRecord854() {
		assertEquals("3458 Hooker Rd", customers.get(853).getAddress());
	}

	@Test
	@DisplayName("Record 854: City is Pinckney")
	void CityOfRecord854() {
		assertEquals("Pinckney", customers.get(853).getCity());
	}

	@Test
	@DisplayName("Record 854: County is Livingston")
	void CountyOfRecord854() {
		assertEquals("Livingston", customers.get(853).getCounty());
	}

	@Test
	@DisplayName("Record 854: State is MI")
	void StateOfRecord854() {
		assertEquals("MI", customers.get(853).getState());
	}

	@Test
	@DisplayName("Record 854: ZIP is 48169")
	void ZIPOfRecord854() {
		assertEquals("48169", customers.get(853).getZIP());
	}

	@Test
	@DisplayName("Record 854: Phone is 734-878-5659")
	void PhoneOfRecord854() {
		assertEquals("734-878-5659", customers.get(853).getPhone());
	}

	@Test
	@DisplayName("Record 854: Fax is 734-878-4853")
	void FaxOfRecord854() {
		assertEquals("734-878-4853", customers.get(853).getFax());
	}

	@Test
	@DisplayName("Record 854: Email is bryon@zumpfe.com")
	void EmailOfRecord854() {
		assertEquals("bryon@zumpfe.com", customers.get(853).getEmail());
	}

	@Test
	@DisplayName("Record 854: Web is http://www.bryonzumpfe.com")
	void WebOfRecord854() {
		assertEquals("http://www.bryonzumpfe.com", customers.get(853).getWeb());
	}
}
