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

@Tag("23")
class Record_2512 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2512: FirstName is Ericka")
	void FirstNameOfRecord2512() {
		assertEquals("Ericka", customers.get(2511).getFirstName());
	}

	@Test
	@DisplayName("Record 2512: LastName is Murrish")
	void LastNameOfRecord2512() {
		assertEquals("Murrish", customers.get(2511).getLastName());
	}

	@Test
	@DisplayName("Record 2512: Company is Resource Publishers Inc")
	void CompanyOfRecord2512() {
		assertEquals("Resource Publishers Inc", customers.get(2511).getCompany());
	}

	@Test
	@DisplayName("Record 2512: Address is 3843 W 95th St")
	void AddressOfRecord2512() {
		assertEquals("3843 W 95th St", customers.get(2511).getAddress());
	}

	@Test
	@DisplayName("Record 2512: City is Evergreen Park")
	void CityOfRecord2512() {
		assertEquals("Evergreen Park", customers.get(2511).getCity());
	}

	@Test
	@DisplayName("Record 2512: County is Cook")
	void CountyOfRecord2512() {
		assertEquals("Cook", customers.get(2511).getCounty());
	}

	@Test
	@DisplayName("Record 2512: State is IL")
	void StateOfRecord2512() {
		assertEquals("IL", customers.get(2511).getState());
	}

	@Test
	@DisplayName("Record 2512: ZIP is 60805")
	void ZIPOfRecord2512() {
		assertEquals("60805", customers.get(2511).getZIP());
	}

	@Test
	@DisplayName("Record 2512: Phone is 708-233-2024")
	void PhoneOfRecord2512() {
		assertEquals("708-233-2024", customers.get(2511).getPhone());
	}

	@Test
	@DisplayName("Record 2512: Fax is 708-233-6762")
	void FaxOfRecord2512() {
		assertEquals("708-233-6762", customers.get(2511).getFax());
	}

	@Test
	@DisplayName("Record 2512: Email is ericka@murrish.com")
	void EmailOfRecord2512() {
		assertEquals("ericka@murrish.com", customers.get(2511).getEmail());
	}

	@Test
	@DisplayName("Record 2512: Web is http://www.erickamurrish.com")
	void WebOfRecord2512() {
		assertEquals("http://www.erickamurrish.com", customers.get(2511).getWeb());
	}
}
