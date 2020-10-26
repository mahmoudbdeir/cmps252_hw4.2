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

@Tag("39")
class Record_237 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 237: FirstName is Amber")
	void FirstNameOfRecord237() {
		assertEquals("Amber", customers.get(236).getFirstName());
	}

	@Test
	@DisplayName("Record 237: LastName is Wygert")
	void LastNameOfRecord237() {
		assertEquals("Wygert", customers.get(236).getLastName());
	}

	@Test
	@DisplayName("Record 237: Company is Coffey Overhead Doors Inc")
	void CompanyOfRecord237() {
		assertEquals("Coffey Overhead Doors Inc", customers.get(236).getCompany());
	}

	@Test
	@DisplayName("Record 237: Address is 94 9th St")
	void AddressOfRecord237() {
		assertEquals("94 9th St", customers.get(236).getAddress());
	}

	@Test
	@DisplayName("Record 237: City is Brooklyn")
	void CityOfRecord237() {
		assertEquals("Brooklyn", customers.get(236).getCity());
	}

	@Test
	@DisplayName("Record 237: County is Kings")
	void CountyOfRecord237() {
		assertEquals("Kings", customers.get(236).getCounty());
	}

	@Test
	@DisplayName("Record 237: State is NY")
	void StateOfRecord237() {
		assertEquals("NY", customers.get(236).getState());
	}

	@Test
	@DisplayName("Record 237: ZIP is 11215")
	void ZIPOfRecord237() {
		assertEquals("11215", customers.get(236).getZIP());
	}

	@Test
	@DisplayName("Record 237: Phone is 718-832-2728")
	void PhoneOfRecord237() {
		assertEquals("718-832-2728", customers.get(236).getPhone());
	}

	@Test
	@DisplayName("Record 237: Fax is 718-832-6694")
	void FaxOfRecord237() {
		assertEquals("718-832-6694", customers.get(236).getFax());
	}

	@Test
	@DisplayName("Record 237: Email is amber@wygert.com")
	void EmailOfRecord237() {
		assertEquals("amber@wygert.com", customers.get(236).getEmail());
	}

	@Test
	@DisplayName("Record 237: Web is http://www.amberwygert.com")
	void WebOfRecord237() {
		assertEquals("http://www.amberwygert.com", customers.get(236).getWeb());
	}
}
