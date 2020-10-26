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

@Tag("35")
class Record_4544 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4544: FirstName is Isabel")
	void FirstNameOfRecord4544() {
		assertEquals("Isabel", customers.get(4543).getFirstName());
	}

	@Test
	@DisplayName("Record 4544: LastName is Hollands")
	void LastNameOfRecord4544() {
		assertEquals("Hollands", customers.get(4543).getLastName());
	}

	@Test
	@DisplayName("Record 4544: Company is Moongate")
	void CompanyOfRecord4544() {
		assertEquals("Moongate", customers.get(4543).getCompany());
	}

	@Test
	@DisplayName("Record 4544: Address is 2801 Merced St")
	void AddressOfRecord4544() {
		assertEquals("2801 Merced St", customers.get(4543).getAddress());
	}

	@Test
	@DisplayName("Record 4544: City is San Leandro")
	void CityOfRecord4544() {
		assertEquals("San Leandro", customers.get(4543).getCity());
	}

	@Test
	@DisplayName("Record 4544: County is Alameda")
	void CountyOfRecord4544() {
		assertEquals("Alameda", customers.get(4543).getCounty());
	}

	@Test
	@DisplayName("Record 4544: State is CA")
	void StateOfRecord4544() {
		assertEquals("CA", customers.get(4543).getState());
	}

	@Test
	@DisplayName("Record 4544: ZIP is 94577")
	void ZIPOfRecord4544() {
		assertEquals("94577", customers.get(4543).getZIP());
	}

	@Test
	@DisplayName("Record 4544: Phone is 510-357-4136")
	void PhoneOfRecord4544() {
		assertEquals("510-357-4136", customers.get(4543).getPhone());
	}

	@Test
	@DisplayName("Record 4544: Fax is 510-357-8987")
	void FaxOfRecord4544() {
		assertEquals("510-357-8987", customers.get(4543).getFax());
	}

	@Test
	@DisplayName("Record 4544: Email is isabel@hollands.com")
	void EmailOfRecord4544() {
		assertEquals("isabel@hollands.com", customers.get(4543).getEmail());
	}

	@Test
	@DisplayName("Record 4544: Web is http://www.isabelhollands.com")
	void WebOfRecord4544() {
		assertEquals("http://www.isabelhollands.com", customers.get(4543).getWeb());
	}
}
