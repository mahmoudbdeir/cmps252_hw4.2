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

@Tag("17")
class Record_2390 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2390: FirstName is Tommie")
	void FirstNameOfRecord2390() {
		assertEquals("Tommie", customers.get(2389).getFirstName());
	}

	@Test
	@DisplayName("Record 2390: LastName is Tessmer")
	void LastNameOfRecord2390() {
		assertEquals("Tessmer", customers.get(2389).getLastName());
	}

	@Test
	@DisplayName("Record 2390: Company is Motek Engr & Mfg Co")
	void CompanyOfRecord2390() {
		assertEquals("Motek Engr & Mfg Co", customers.get(2389).getCompany());
	}

	@Test
	@DisplayName("Record 2390: Address is 34443 Industrial Rd")
	void AddressOfRecord2390() {
		assertEquals("34443 Industrial Rd", customers.get(2389).getAddress());
	}

	@Test
	@DisplayName("Record 2390: City is Livonia")
	void CityOfRecord2390() {
		assertEquals("Livonia", customers.get(2389).getCity());
	}

	@Test
	@DisplayName("Record 2390: County is Wayne")
	void CountyOfRecord2390() {
		assertEquals("Wayne", customers.get(2389).getCounty());
	}

	@Test
	@DisplayName("Record 2390: State is MI")
	void StateOfRecord2390() {
		assertEquals("MI", customers.get(2389).getState());
	}

	@Test
	@DisplayName("Record 2390: ZIP is 48150")
	void ZIPOfRecord2390() {
		assertEquals("48150", customers.get(2389).getZIP());
	}

	@Test
	@DisplayName("Record 2390: Phone is 734-522-3776")
	void PhoneOfRecord2390() {
		assertEquals("734-522-3776", customers.get(2389).getPhone());
	}

	@Test
	@DisplayName("Record 2390: Fax is 734-522-7551")
	void FaxOfRecord2390() {
		assertEquals("734-522-7551", customers.get(2389).getFax());
	}

	@Test
	@DisplayName("Record 2390: Email is tommie@tessmer.com")
	void EmailOfRecord2390() {
		assertEquals("tommie@tessmer.com", customers.get(2389).getEmail());
	}

	@Test
	@DisplayName("Record 2390: Web is http://www.tommietessmer.com")
	void WebOfRecord2390() {
		assertEquals("http://www.tommietessmer.com", customers.get(2389).getWeb());
	}
}
