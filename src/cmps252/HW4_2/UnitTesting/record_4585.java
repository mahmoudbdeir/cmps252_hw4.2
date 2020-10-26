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

@Tag("11")
class Record_4585 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4585: FirstName is Blaine")
	void FirstNameOfRecord4585() {
		assertEquals("Blaine", customers.get(4584).getFirstName());
	}

	@Test
	@DisplayName("Record 4585: LastName is Shellenbarger")
	void LastNameOfRecord4585() {
		assertEquals("Shellenbarger", customers.get(4584).getLastName());
	}

	@Test
	@DisplayName("Record 4585: Company is Herington Times")
	void CompanyOfRecord4585() {
		assertEquals("Herington Times", customers.get(4584).getCompany());
	}

	@Test
	@DisplayName("Record 4585: Address is 3337 Stovall St")
	void AddressOfRecord4585() {
		assertEquals("3337 Stovall St", customers.get(4584).getAddress());
	}

	@Test
	@DisplayName("Record 4585: City is Irving")
	void CityOfRecord4585() {
		assertEquals("Irving", customers.get(4584).getCity());
	}

	@Test
	@DisplayName("Record 4585: County is Dallas")
	void CountyOfRecord4585() {
		assertEquals("Dallas", customers.get(4584).getCounty());
	}

	@Test
	@DisplayName("Record 4585: State is TX")
	void StateOfRecord4585() {
		assertEquals("TX", customers.get(4584).getState());
	}

	@Test
	@DisplayName("Record 4585: ZIP is 75061")
	void ZIPOfRecord4585() {
		assertEquals("75061", customers.get(4584).getZIP());
	}

	@Test
	@DisplayName("Record 4585: Phone is 972-790-8215")
	void PhoneOfRecord4585() {
		assertEquals("972-790-8215", customers.get(4584).getPhone());
	}

	@Test
	@DisplayName("Record 4585: Fax is 972-790-9071")
	void FaxOfRecord4585() {
		assertEquals("972-790-9071", customers.get(4584).getFax());
	}

	@Test
	@DisplayName("Record 4585: Email is blaine@shellenbarger.com")
	void EmailOfRecord4585() {
		assertEquals("blaine@shellenbarger.com", customers.get(4584).getEmail());
	}

	@Test
	@DisplayName("Record 4585: Web is http://www.blaineshellenbarger.com")
	void WebOfRecord4585() {
		assertEquals("http://www.blaineshellenbarger.com", customers.get(4584).getWeb());
	}
}
