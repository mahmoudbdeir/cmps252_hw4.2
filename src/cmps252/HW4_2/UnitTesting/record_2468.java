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

@Tag("47")
class Record_2468 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2468: FirstName is Earline")
	void FirstNameOfRecord2468() {
		assertEquals("Earline", customers.get(2467).getFirstName());
	}

	@Test
	@DisplayName("Record 2468: LastName is Sires")
	void LastNameOfRecord2468() {
		assertEquals("Sires", customers.get(2467).getLastName());
	}

	@Test
	@DisplayName("Record 2468: Company is Kvol Fm 105 9 & Am 1330")
	void CompanyOfRecord2468() {
		assertEquals("Kvol Fm 105 9 & Am 1330", customers.get(2467).getCompany());
	}

	@Test
	@DisplayName("Record 2468: Address is 453 W 17th St")
	void AddressOfRecord2468() {
		assertEquals("453 W 17th St", customers.get(2467).getAddress());
	}

	@Test
	@DisplayName("Record 2468: City is New York")
	void CityOfRecord2468() {
		assertEquals("New York", customers.get(2467).getCity());
	}

	@Test
	@DisplayName("Record 2468: County is New York")
	void CountyOfRecord2468() {
		assertEquals("New York", customers.get(2467).getCounty());
	}

	@Test
	@DisplayName("Record 2468: State is NY")
	void StateOfRecord2468() {
		assertEquals("NY", customers.get(2467).getState());
	}

	@Test
	@DisplayName("Record 2468: ZIP is 10011")
	void ZIPOfRecord2468() {
		assertEquals("10011", customers.get(2467).getZIP());
	}

	@Test
	@DisplayName("Record 2468: Phone is 212-206-8947")
	void PhoneOfRecord2468() {
		assertEquals("212-206-8947", customers.get(2467).getPhone());
	}

	@Test
	@DisplayName("Record 2468: Fax is 212-206-9405")
	void FaxOfRecord2468() {
		assertEquals("212-206-9405", customers.get(2467).getFax());
	}

	@Test
	@DisplayName("Record 2468: Email is earline@sires.com")
	void EmailOfRecord2468() {
		assertEquals("earline@sires.com", customers.get(2467).getEmail());
	}

	@Test
	@DisplayName("Record 2468: Web is http://www.earlinesires.com")
	void WebOfRecord2468() {
		assertEquals("http://www.earlinesires.com", customers.get(2467).getWeb());
	}
}
