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

@Tag("2")
class Record_1917 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1917: FirstName is Daniel")
	void FirstNameOfRecord1917() {
		assertEquals("Daniel", customers.get(1916).getFirstName());
	}

	@Test
	@DisplayName("Record 1917: LastName is Brickles")
	void LastNameOfRecord1917() {
		assertEquals("Brickles", customers.get(1916).getLastName());
	}

	@Test
	@DisplayName("Record 1917: Company is Abca Recycling Inc")
	void CompanyOfRecord1917() {
		assertEquals("Abca Recycling Inc", customers.get(1916).getCompany());
	}

	@Test
	@DisplayName("Record 1917: Address is Box #-23376")
	void AddressOfRecord1917() {
		assertEquals("Box #-23376", customers.get(1916).getAddress());
	}

	@Test
	@DisplayName("Record 1917: City is Anchorage")
	void CityOfRecord1917() {
		assertEquals("Anchorage", customers.get(1916).getCity());
	}

	@Test
	@DisplayName("Record 1917: County is Anchorage")
	void CountyOfRecord1917() {
		assertEquals("Anchorage", customers.get(1916).getCounty());
	}

	@Test
	@DisplayName("Record 1917: State is AK")
	void StateOfRecord1917() {
		assertEquals("AK", customers.get(1916).getState());
	}

	@Test
	@DisplayName("Record 1917: ZIP is 99523")
	void ZIPOfRecord1917() {
		assertEquals("99523", customers.get(1916).getZIP());
	}

	@Test
	@DisplayName("Record 1917: Phone is 907-272-4179")
	void PhoneOfRecord1917() {
		assertEquals("907-272-4179", customers.get(1916).getPhone());
	}

	@Test
	@DisplayName("Record 1917: Fax is 907-272-0096")
	void FaxOfRecord1917() {
		assertEquals("907-272-0096", customers.get(1916).getFax());
	}

	@Test
	@DisplayName("Record 1917: Email is daniel@brickles.com")
	void EmailOfRecord1917() {
		assertEquals("daniel@brickles.com", customers.get(1916).getEmail());
	}

	@Test
	@DisplayName("Record 1917: Web is http://www.danielbrickles.com")
	void WebOfRecord1917() {
		assertEquals("http://www.danielbrickles.com", customers.get(1916).getWeb());
	}
}
