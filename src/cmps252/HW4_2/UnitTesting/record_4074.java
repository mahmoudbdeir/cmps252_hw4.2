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

@Tag("39")
class Record_4074 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4074: FirstName is Dominic")
	void FirstNameOfRecord4074() {
		assertEquals("Dominic", customers.get(4073).getFirstName());
	}

	@Test
	@DisplayName("Record 4074: LastName is Bolt")
	void LastNameOfRecord4074() {
		assertEquals("Bolt", customers.get(4073).getLastName());
	}

	@Test
	@DisplayName("Record 4074: Company is Lucas Assembly & Test Systems")
	void CompanyOfRecord4074() {
		assertEquals("Lucas Assembly & Test Systems", customers.get(4073).getCompany());
	}

	@Test
	@DisplayName("Record 4074: Address is 984 E 35th St")
	void AddressOfRecord4074() {
		assertEquals("984 E 35th St", customers.get(4073).getAddress());
	}

	@Test
	@DisplayName("Record 4074: City is Brooklyn")
	void CityOfRecord4074() {
		assertEquals("Brooklyn", customers.get(4073).getCity());
	}

	@Test
	@DisplayName("Record 4074: County is Kings")
	void CountyOfRecord4074() {
		assertEquals("Kings", customers.get(4073).getCounty());
	}

	@Test
	@DisplayName("Record 4074: State is NY")
	void StateOfRecord4074() {
		assertEquals("NY", customers.get(4073).getState());
	}

	@Test
	@DisplayName("Record 4074: ZIP is 11210")
	void ZIPOfRecord4074() {
		assertEquals("11210", customers.get(4073).getZIP());
	}

	@Test
	@DisplayName("Record 4074: Phone is 718-253-6224")
	void PhoneOfRecord4074() {
		assertEquals("718-253-6224", customers.get(4073).getPhone());
	}

	@Test
	@DisplayName("Record 4074: Fax is 718-253-0262")
	void FaxOfRecord4074() {
		assertEquals("718-253-0262", customers.get(4073).getFax());
	}

	@Test
	@DisplayName("Record 4074: Email is dominic@bolt.com")
	void EmailOfRecord4074() {
		assertEquals("dominic@bolt.com", customers.get(4073).getEmail());
	}

	@Test
	@DisplayName("Record 4074: Web is http://www.dominicbolt.com")
	void WebOfRecord4074() {
		assertEquals("http://www.dominicbolt.com", customers.get(4073).getWeb());
	}
}
