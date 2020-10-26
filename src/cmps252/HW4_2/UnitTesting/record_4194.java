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

@Tag("46")
class Record_4194 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4194: FirstName is Sun")
	void FirstNameOfRecord4194() {
		assertEquals("Sun", customers.get(4193).getFirstName());
	}

	@Test
	@DisplayName("Record 4194: LastName is Allman")
	void LastNameOfRecord4194() {
		assertEquals("Allman", customers.get(4193).getLastName());
	}

	@Test
	@DisplayName("Record 4194: Company is Secaucus Animal Hospital Pa")
	void CompanyOfRecord4194() {
		assertEquals("Secaucus Animal Hospital Pa", customers.get(4193).getCompany());
	}

	@Test
	@DisplayName("Record 4194: Address is 10000 Alliance Rd")
	void AddressOfRecord4194() {
		assertEquals("10000 Alliance Rd", customers.get(4193).getAddress());
	}

	@Test
	@DisplayName("Record 4194: City is Cincinnati")
	void CityOfRecord4194() {
		assertEquals("Cincinnati", customers.get(4193).getCity());
	}

	@Test
	@DisplayName("Record 4194: County is Hamilton")
	void CountyOfRecord4194() {
		assertEquals("Hamilton", customers.get(4193).getCounty());
	}

	@Test
	@DisplayName("Record 4194: State is OH")
	void StateOfRecord4194() {
		assertEquals("OH", customers.get(4193).getState());
	}

	@Test
	@DisplayName("Record 4194: ZIP is 45242")
	void ZIPOfRecord4194() {
		assertEquals("45242", customers.get(4193).getZIP());
	}

	@Test
	@DisplayName("Record 4194: Phone is 513-545-9198")
	void PhoneOfRecord4194() {
		assertEquals("513-545-9198", customers.get(4193).getPhone());
	}

	@Test
	@DisplayName("Record 4194: Fax is 513-545-8835")
	void FaxOfRecord4194() {
		assertEquals("513-545-8835", customers.get(4193).getFax());
	}

	@Test
	@DisplayName("Record 4194: Email is sun@allman.com")
	void EmailOfRecord4194() {
		assertEquals("sun@allman.com", customers.get(4193).getEmail());
	}

	@Test
	@DisplayName("Record 4194: Web is http://www.sunallman.com")
	void WebOfRecord4194() {
		assertEquals("http://www.sunallman.com", customers.get(4193).getWeb());
	}
}
