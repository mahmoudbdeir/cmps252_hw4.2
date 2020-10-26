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

@Tag("45")
class Record_1444 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1444: FirstName is Harley")
	void FirstNameOfRecord1444() {
		assertEquals("Harley", customers.get(1443).getFirstName());
	}

	@Test
	@DisplayName("Record 1444: LastName is Demus")
	void LastNameOfRecord1444() {
		assertEquals("Demus", customers.get(1443).getLastName());
	}

	@Test
	@DisplayName("Record 1444: Company is Canal Refining Co")
	void CompanyOfRecord1444() {
		assertEquals("Canal Refining Co", customers.get(1443).getCompany());
	}

	@Test
	@DisplayName("Record 1444: Address is 1323 Rhode Island Ave Nw")
	void AddressOfRecord1444() {
		assertEquals("1323 Rhode Island Ave Nw", customers.get(1443).getAddress());
	}

	@Test
	@DisplayName("Record 1444: City is Washington")
	void CityOfRecord1444() {
		assertEquals("Washington", customers.get(1443).getCity());
	}

	@Test
	@DisplayName("Record 1444: County is District of Columbia")
	void CountyOfRecord1444() {
		assertEquals("District of Columbia", customers.get(1443).getCounty());
	}

	@Test
	@DisplayName("Record 1444: State is DC")
	void StateOfRecord1444() {
		assertEquals("DC", customers.get(1443).getState());
	}

	@Test
	@DisplayName("Record 1444: ZIP is 20005")
	void ZIPOfRecord1444() {
		assertEquals("20005", customers.get(1443).getZIP());
	}

	@Test
	@DisplayName("Record 1444: Phone is 202-387-1792")
	void PhoneOfRecord1444() {
		assertEquals("202-387-1792", customers.get(1443).getPhone());
	}

	@Test
	@DisplayName("Record 1444: Fax is 202-387-7705")
	void FaxOfRecord1444() {
		assertEquals("202-387-7705", customers.get(1443).getFax());
	}

	@Test
	@DisplayName("Record 1444: Email is harley@demus.com")
	void EmailOfRecord1444() {
		assertEquals("harley@demus.com", customers.get(1443).getEmail());
	}

	@Test
	@DisplayName("Record 1444: Web is http://www.harleydemus.com")
	void WebOfRecord1444() {
		assertEquals("http://www.harleydemus.com", customers.get(1443).getWeb());
	}
}
