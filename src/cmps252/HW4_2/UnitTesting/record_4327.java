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
class Record_4327 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4327: FirstName is Santo")
	void FirstNameOfRecord4327() {
		assertEquals("Santo", customers.get(4326).getFirstName());
	}

	@Test
	@DisplayName("Record 4327: LastName is Cadorette")
	void LastNameOfRecord4327() {
		assertEquals("Cadorette", customers.get(4326).getLastName());
	}

	@Test
	@DisplayName("Record 4327: Company is Stone Mcgee & Co")
	void CompanyOfRecord4327() {
		assertEquals("Stone Mcgee & Co", customers.get(4326).getCompany());
	}

	@Test
	@DisplayName("Record 4327: Address is 108 Main St")
	void AddressOfRecord4327() {
		assertEquals("108 Main St", customers.get(4326).getAddress());
	}

	@Test
	@DisplayName("Record 4327: City is Beckley")
	void CityOfRecord4327() {
		assertEquals("Beckley", customers.get(4326).getCity());
	}

	@Test
	@DisplayName("Record 4327: County is Ralygh")
	void CountyOfRecord4327() {
		assertEquals("Ralygh", customers.get(4326).getCounty());
	}

	@Test
	@DisplayName("Record 4327: State is WV")
	void StateOfRecord4327() {
		assertEquals("WV", customers.get(4326).getState());
	}

	@Test
	@DisplayName("Record 4327: ZIP is 25801")
	void ZIPOfRecord4327() {
		assertEquals("25801", customers.get(4326).getZIP());
	}

	@Test
	@DisplayName("Record 4327: Phone is 304-252-5753")
	void PhoneOfRecord4327() {
		assertEquals("304-252-5753", customers.get(4326).getPhone());
	}

	@Test
	@DisplayName("Record 4327: Fax is 304-252-4365")
	void FaxOfRecord4327() {
		assertEquals("304-252-4365", customers.get(4326).getFax());
	}

	@Test
	@DisplayName("Record 4327: Email is santo@cadorette.com")
	void EmailOfRecord4327() {
		assertEquals("santo@cadorette.com", customers.get(4326).getEmail());
	}

	@Test
	@DisplayName("Record 4327: Web is http://www.santocadorette.com")
	void WebOfRecord4327() {
		assertEquals("http://www.santocadorette.com", customers.get(4326).getWeb());
	}
}
