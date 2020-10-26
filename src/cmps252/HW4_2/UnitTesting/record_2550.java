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

@Tag("27")
class Record_2550 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2550: FirstName is Lyndon")
	void FirstNameOfRecord2550() {
		assertEquals("Lyndon", customers.get(2549).getFirstName());
	}

	@Test
	@DisplayName("Record 2550: LastName is Moreshead")
	void LastNameOfRecord2550() {
		assertEquals("Moreshead", customers.get(2549).getLastName());
	}

	@Test
	@DisplayName("Record 2550: Company is South American Technology Inc")
	void CompanyOfRecord2550() {
		assertEquals("South American Technology Inc", customers.get(2549).getCompany());
	}

	@Test
	@DisplayName("Record 2550: Address is 9660 Topanga Canyon Pl")
	void AddressOfRecord2550() {
		assertEquals("9660 Topanga Canyon Pl", customers.get(2549).getAddress());
	}

	@Test
	@DisplayName("Record 2550: City is Chatsworth")
	void CityOfRecord2550() {
		assertEquals("Chatsworth", customers.get(2549).getCity());
	}

	@Test
	@DisplayName("Record 2550: County is Los Angeles")
	void CountyOfRecord2550() {
		assertEquals("Los Angeles", customers.get(2549).getCounty());
	}

	@Test
	@DisplayName("Record 2550: State is CA")
	void StateOfRecord2550() {
		assertEquals("CA", customers.get(2549).getState());
	}

	@Test
	@DisplayName("Record 2550: ZIP is 91311")
	void ZIPOfRecord2550() {
		assertEquals("91311", customers.get(2549).getZIP());
	}

	@Test
	@DisplayName("Record 2550: Phone is 818-882-6316")
	void PhoneOfRecord2550() {
		assertEquals("818-882-6316", customers.get(2549).getPhone());
	}

	@Test
	@DisplayName("Record 2550: Fax is 818-882-0334")
	void FaxOfRecord2550() {
		assertEquals("818-882-0334", customers.get(2549).getFax());
	}

	@Test
	@DisplayName("Record 2550: Email is lyndon@moreshead.com")
	void EmailOfRecord2550() {
		assertEquals("lyndon@moreshead.com", customers.get(2549).getEmail());
	}

	@Test
	@DisplayName("Record 2550: Web is http://www.lyndonmoreshead.com")
	void WebOfRecord2550() {
		assertEquals("http://www.lyndonmoreshead.com", customers.get(2549).getWeb());
	}
}
