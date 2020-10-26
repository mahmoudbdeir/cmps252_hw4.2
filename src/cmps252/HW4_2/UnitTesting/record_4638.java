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

@Tag("28")
class Record_4638 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4638: FirstName is Amber")
	void FirstNameOfRecord4638() {
		assertEquals("Amber", customers.get(4637).getFirstName());
	}

	@Test
	@DisplayName("Record 4638: LastName is Pease")
	void LastNameOfRecord4638() {
		assertEquals("Pease", customers.get(4637).getLastName());
	}

	@Test
	@DisplayName("Record 4638: Company is Casa Mexicana Tile")
	void CompanyOfRecord4638() {
		assertEquals("Casa Mexicana Tile", customers.get(4637).getCompany());
	}

	@Test
	@DisplayName("Record 4638: Address is 704 Lee Ave")
	void AddressOfRecord4638() {
		assertEquals("704 Lee Ave", customers.get(4637).getAddress());
	}

	@Test
	@DisplayName("Record 4638: City is Lafayette")
	void CityOfRecord4638() {
		assertEquals("Lafayette", customers.get(4637).getCity());
	}

	@Test
	@DisplayName("Record 4638: County is Lafayette")
	void CountyOfRecord4638() {
		assertEquals("Lafayette", customers.get(4637).getCounty());
	}

	@Test
	@DisplayName("Record 4638: State is LA")
	void StateOfRecord4638() {
		assertEquals("LA", customers.get(4637).getState());
	}

	@Test
	@DisplayName("Record 4638: ZIP is 70501")
	void ZIPOfRecord4638() {
		assertEquals("70501", customers.get(4637).getZIP());
	}

	@Test
	@DisplayName("Record 4638: Phone is 337-233-4442")
	void PhoneOfRecord4638() {
		assertEquals("337-233-4442", customers.get(4637).getPhone());
	}

	@Test
	@DisplayName("Record 4638: Fax is 337-233-1563")
	void FaxOfRecord4638() {
		assertEquals("337-233-1563", customers.get(4637).getFax());
	}

	@Test
	@DisplayName("Record 4638: Email is amber@pease.com")
	void EmailOfRecord4638() {
		assertEquals("amber@pease.com", customers.get(4637).getEmail());
	}

	@Test
	@DisplayName("Record 4638: Web is http://www.amberpease.com")
	void WebOfRecord4638() {
		assertEquals("http://www.amberpease.com", customers.get(4637).getWeb());
	}
}
