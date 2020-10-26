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

@Tag("30")
class Record_692 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 692: FirstName is Gino")
	void FirstNameOfRecord692() {
		assertEquals("Gino", customers.get(691).getFirstName());
	}

	@Test
	@DisplayName("Record 692: LastName is Yearling")
	void LastNameOfRecord692() {
		assertEquals("Yearling", customers.get(691).getLastName());
	}

	@Test
	@DisplayName("Record 692: Company is Cupid Foundtns Inc")
	void CompanyOfRecord692() {
		assertEquals("Cupid Foundtns Inc", customers.get(691).getCompany());
	}

	@Test
	@DisplayName("Record 692: Address is 875 Old Rich Hy")
	void AddressOfRecord692() {
		assertEquals("875 Old Rich Hy", customers.get(691).getAddress());
	}

	@Test
	@DisplayName("Record 692: City is Fairbanks")
	void CityOfRecord692() {
		assertEquals("Fairbanks", customers.get(691).getCity());
	}

	@Test
	@DisplayName("Record 692: County is Fairbanks North Star")
	void CountyOfRecord692() {
		assertEquals("Fairbanks North Star", customers.get(691).getCounty());
	}

	@Test
	@DisplayName("Record 692: State is AK")
	void StateOfRecord692() {
		assertEquals("AK", customers.get(691).getState());
	}

	@Test
	@DisplayName("Record 692: ZIP is 99701")
	void ZIPOfRecord692() {
		assertEquals("99701", customers.get(691).getZIP());
	}

	@Test
	@DisplayName("Record 692: Phone is 907-456-8046")
	void PhoneOfRecord692() {
		assertEquals("907-456-8046", customers.get(691).getPhone());
	}

	@Test
	@DisplayName("Record 692: Fax is 907-456-4449")
	void FaxOfRecord692() {
		assertEquals("907-456-4449", customers.get(691).getFax());
	}

	@Test
	@DisplayName("Record 692: Email is gino@yearling.com")
	void EmailOfRecord692() {
		assertEquals("gino@yearling.com", customers.get(691).getEmail());
	}

	@Test
	@DisplayName("Record 692: Web is http://www.ginoyearling.com")
	void WebOfRecord692() {
		assertEquals("http://www.ginoyearling.com", customers.get(691).getWeb());
	}
}
