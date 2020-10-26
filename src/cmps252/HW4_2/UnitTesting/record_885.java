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

@Tag("7")
class Record_885 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 885: FirstName is Elsie")
	void FirstNameOfRecord885() {
		assertEquals("Elsie", customers.get(884).getFirstName());
	}

	@Test
	@DisplayName("Record 885: LastName is Loll")
	void LastNameOfRecord885() {
		assertEquals("Loll", customers.get(884).getLastName());
	}

	@Test
	@DisplayName("Record 885: Company is Better Business Bureau Ak Inc")
	void CompanyOfRecord885() {
		assertEquals("Better Business Bureau Ak Inc", customers.get(884).getCompany());
	}

	@Test
	@DisplayName("Record 885: Address is 427 Riverside Ave")
	void AddressOfRecord885() {
		assertEquals("427 Riverside Ave", customers.get(884).getAddress());
	}

	@Test
	@DisplayName("Record 885: City is Medford")
	void CityOfRecord885() {
		assertEquals("Medford", customers.get(884).getCity());
	}

	@Test
	@DisplayName("Record 885: County is Middlesex")
	void CountyOfRecord885() {
		assertEquals("Middlesex", customers.get(884).getCounty());
	}

	@Test
	@DisplayName("Record 885: State is MA")
	void StateOfRecord885() {
		assertEquals("MA", customers.get(884).getState());
	}

	@Test
	@DisplayName("Record 885: ZIP is 2155")
	void ZIPOfRecord885() {
		assertEquals("2155", customers.get(884).getZIP());
	}

	@Test
	@DisplayName("Record 885: Phone is 781-395-1704")
	void PhoneOfRecord885() {
		assertEquals("781-395-1704", customers.get(884).getPhone());
	}

	@Test
	@DisplayName("Record 885: Fax is 781-395-0008")
	void FaxOfRecord885() {
		assertEquals("781-395-0008", customers.get(884).getFax());
	}

	@Test
	@DisplayName("Record 885: Email is elsie@loll.com")
	void EmailOfRecord885() {
		assertEquals("elsie@loll.com", customers.get(884).getEmail());
	}

	@Test
	@DisplayName("Record 885: Web is http://www.elsieloll.com")
	void WebOfRecord885() {
		assertEquals("http://www.elsieloll.com", customers.get(884).getWeb());
	}
}
