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
class Record_2172 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2172: FirstName is Allen")
	void FirstNameOfRecord2172() {
		assertEquals("Allen", customers.get(2171).getFirstName());
	}

	@Test
	@DisplayName("Record 2172: LastName is Ferns")
	void LastNameOfRecord2172() {
		assertEquals("Ferns", customers.get(2171).getLastName());
	}

	@Test
	@DisplayName("Record 2172: Company is Haines & Essick Co")
	void CompanyOfRecord2172() {
		assertEquals("Haines & Essick Co", customers.get(2171).getCompany());
	}

	@Test
	@DisplayName("Record 2172: Address is 610 Sw Broadway  #-606")
	void AddressOfRecord2172() {
		assertEquals("610 Sw Broadway  #-606", customers.get(2171).getAddress());
	}

	@Test
	@DisplayName("Record 2172: City is Portland")
	void CityOfRecord2172() {
		assertEquals("Portland", customers.get(2171).getCity());
	}

	@Test
	@DisplayName("Record 2172: County is Multnomah")
	void CountyOfRecord2172() {
		assertEquals("Multnomah", customers.get(2171).getCounty());
	}

	@Test
	@DisplayName("Record 2172: State is OR")
	void StateOfRecord2172() {
		assertEquals("OR", customers.get(2171).getState());
	}

	@Test
	@DisplayName("Record 2172: ZIP is 97205")
	void ZIPOfRecord2172() {
		assertEquals("97205", customers.get(2171).getZIP());
	}

	@Test
	@DisplayName("Record 2172: Phone is 503-295-6417")
	void PhoneOfRecord2172() {
		assertEquals("503-295-6417", customers.get(2171).getPhone());
	}

	@Test
	@DisplayName("Record 2172: Fax is 503-295-5849")
	void FaxOfRecord2172() {
		assertEquals("503-295-5849", customers.get(2171).getFax());
	}

	@Test
	@DisplayName("Record 2172: Email is allen@ferns.com")
	void EmailOfRecord2172() {
		assertEquals("allen@ferns.com", customers.get(2171).getEmail());
	}

	@Test
	@DisplayName("Record 2172: Web is http://www.allenferns.com")
	void WebOfRecord2172() {
		assertEquals("http://www.allenferns.com", customers.get(2171).getWeb());
	}
}
