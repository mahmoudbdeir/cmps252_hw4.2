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

@Tag("18")
class Record_1328 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1328: FirstName is Carl")
	void FirstNameOfRecord1328() {
		assertEquals("Carl", customers.get(1327).getFirstName());
	}

	@Test
	@DisplayName("Record 1328: LastName is Hinch")
	void LastNameOfRecord1328() {
		assertEquals("Hinch", customers.get(1327).getLastName());
	}

	@Test
	@DisplayName("Record 1328: Company is Market Street Mission Inc")
	void CompanyOfRecord1328() {
		assertEquals("Market Street Mission Inc", customers.get(1327).getCompany());
	}

	@Test
	@DisplayName("Record 1328: Address is 290 Northern Ave")
	void AddressOfRecord1328() {
		assertEquals("290 Northern Ave", customers.get(1327).getAddress());
	}

	@Test
	@DisplayName("Record 1328: City is Boston")
	void CityOfRecord1328() {
		assertEquals("Boston", customers.get(1327).getCity());
	}

	@Test
	@DisplayName("Record 1328: County is Suffolk")
	void CountyOfRecord1328() {
		assertEquals("Suffolk", customers.get(1327).getCounty());
	}

	@Test
	@DisplayName("Record 1328: State is MA")
	void StateOfRecord1328() {
		assertEquals("MA", customers.get(1327).getState());
	}

	@Test
	@DisplayName("Record 1328: ZIP is 2210")
	void ZIPOfRecord1328() {
		assertEquals("2210", customers.get(1327).getZIP());
	}

	@Test
	@DisplayName("Record 1328: Phone is 617-261-4526")
	void PhoneOfRecord1328() {
		assertEquals("617-261-4526", customers.get(1327).getPhone());
	}

	@Test
	@DisplayName("Record 1328: Fax is 617-261-4717")
	void FaxOfRecord1328() {
		assertEquals("617-261-4717", customers.get(1327).getFax());
	}

	@Test
	@DisplayName("Record 1328: Email is carl@hinch.com")
	void EmailOfRecord1328() {
		assertEquals("carl@hinch.com", customers.get(1327).getEmail());
	}

	@Test
	@DisplayName("Record 1328: Web is http://www.carlhinch.com")
	void WebOfRecord1328() {
		assertEquals("http://www.carlhinch.com", customers.get(1327).getWeb());
	}
}
