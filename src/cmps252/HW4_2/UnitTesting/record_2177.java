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

@Tag("40")
class Record_2177 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2177: FirstName is Thurman")
	void FirstNameOfRecord2177() {
		assertEquals("Thurman", customers.get(2176).getFirstName());
	}

	@Test
	@DisplayName("Record 2177: LastName is Balluch")
	void LastNameOfRecord2177() {
		assertEquals("Balluch", customers.get(2176).getLastName());
	}

	@Test
	@DisplayName("Record 2177: Company is Hcw Halls Cabinet Works")
	void CompanyOfRecord2177() {
		assertEquals("Hcw Halls Cabinet Works", customers.get(2176).getCompany());
	}

	@Test
	@DisplayName("Record 2177: Address is 350 Ward Ave  #-106")
	void AddressOfRecord2177() {
		assertEquals("350 Ward Ave  #-106", customers.get(2176).getAddress());
	}

	@Test
	@DisplayName("Record 2177: City is Honolulu")
	void CityOfRecord2177() {
		assertEquals("Honolulu", customers.get(2176).getCity());
	}

	@Test
	@DisplayName("Record 2177: County is Honolulu")
	void CountyOfRecord2177() {
		assertEquals("Honolulu", customers.get(2176).getCounty());
	}

	@Test
	@DisplayName("Record 2177: State is HI")
	void StateOfRecord2177() {
		assertEquals("HI", customers.get(2176).getState());
	}

	@Test
	@DisplayName("Record 2177: ZIP is 96814")
	void ZIPOfRecord2177() {
		assertEquals("96814", customers.get(2176).getZIP());
	}

	@Test
	@DisplayName("Record 2177: Phone is 808-521-2672")
	void PhoneOfRecord2177() {
		assertEquals("808-521-2672", customers.get(2176).getPhone());
	}

	@Test
	@DisplayName("Record 2177: Fax is 808-521-2554")
	void FaxOfRecord2177() {
		assertEquals("808-521-2554", customers.get(2176).getFax());
	}

	@Test
	@DisplayName("Record 2177: Email is thurman@balluch.com")
	void EmailOfRecord2177() {
		assertEquals("thurman@balluch.com", customers.get(2176).getEmail());
	}

	@Test
	@DisplayName("Record 2177: Web is http://www.thurmanballuch.com")
	void WebOfRecord2177() {
		assertEquals("http://www.thurmanballuch.com", customers.get(2176).getWeb());
	}
}
