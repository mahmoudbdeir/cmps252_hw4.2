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

@Tag("36")
class Record_2444 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2444: FirstName is Emilie")
	void FirstNameOfRecord2444() {
		assertEquals("Emilie", customers.get(2443).getFirstName());
	}

	@Test
	@DisplayName("Record 2444: LastName is Stakelin")
	void LastNameOfRecord2444() {
		assertEquals("Stakelin", customers.get(2443).getLastName());
	}

	@Test
	@DisplayName("Record 2444: Company is Bestex Acoustical Co")
	void CompanyOfRecord2444() {
		assertEquals("Bestex Acoustical Co", customers.get(2443).getCompany());
	}

	@Test
	@DisplayName("Record 2444: Address is Box #-9272")
	void AddressOfRecord2444() {
		assertEquals("Box #-9272", customers.get(2443).getAddress());
	}

	@Test
	@DisplayName("Record 2444: City is Moscow")
	void CityOfRecord2444() {
		assertEquals("Moscow", customers.get(2443).getCity());
	}

	@Test
	@DisplayName("Record 2444: County is Latah")
	void CountyOfRecord2444() {
		assertEquals("Latah", customers.get(2443).getCounty());
	}

	@Test
	@DisplayName("Record 2444: State is ID")
	void StateOfRecord2444() {
		assertEquals("ID", customers.get(2443).getState());
	}

	@Test
	@DisplayName("Record 2444: ZIP is 83843")
	void ZIPOfRecord2444() {
		assertEquals("83843", customers.get(2443).getZIP());
	}

	@Test
	@DisplayName("Record 2444: Phone is 208-883-4305")
	void PhoneOfRecord2444() {
		assertEquals("208-883-4305", customers.get(2443).getPhone());
	}

	@Test
	@DisplayName("Record 2444: Fax is 208-883-7068")
	void FaxOfRecord2444() {
		assertEquals("208-883-7068", customers.get(2443).getFax());
	}

	@Test
	@DisplayName("Record 2444: Email is emilie@stakelin.com")
	void EmailOfRecord2444() {
		assertEquals("emilie@stakelin.com", customers.get(2443).getEmail());
	}

	@Test
	@DisplayName("Record 2444: Web is http://www.emiliestakelin.com")
	void WebOfRecord2444() {
		assertEquals("http://www.emiliestakelin.com", customers.get(2443).getWeb());
	}
}
