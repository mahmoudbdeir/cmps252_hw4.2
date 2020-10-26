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

@Tag("33")
class Record_555 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 555: FirstName is Richie")
	void FirstNameOfRecord555() {
		assertEquals("Richie", customers.get(554).getFirstName());
	}

	@Test
	@DisplayName("Record 555: LastName is Goldston")
	void LastNameOfRecord555() {
		assertEquals("Goldston", customers.get(554).getLastName());
	}

	@Test
	@DisplayName("Record 555: Company is Flash Printing Service")
	void CompanyOfRecord555() {
		assertEquals("Flash Printing Service", customers.get(554).getCompany());
	}

	@Test
	@DisplayName("Record 555: Address is 11327 Trade Center Dr  #-345")
	void AddressOfRecord555() {
		assertEquals("11327 Trade Center Dr  #-345", customers.get(554).getAddress());
	}

	@Test
	@DisplayName("Record 555: City is Rancho Cordova")
	void CityOfRecord555() {
		assertEquals("Rancho Cordova", customers.get(554).getCity());
	}

	@Test
	@DisplayName("Record 555: County is Sacramento")
	void CountyOfRecord555() {
		assertEquals("Sacramento", customers.get(554).getCounty());
	}

	@Test
	@DisplayName("Record 555: State is CA")
	void StateOfRecord555() {
		assertEquals("CA", customers.get(554).getState());
	}

	@Test
	@DisplayName("Record 555: ZIP is 95742")
	void ZIPOfRecord555() {
		assertEquals("95742", customers.get(554).getZIP());
	}

	@Test
	@DisplayName("Record 555: Phone is 916-631-2222")
	void PhoneOfRecord555() {
		assertEquals("916-631-2222", customers.get(554).getPhone());
	}

	@Test
	@DisplayName("Record 555: Fax is 916-631-6515")
	void FaxOfRecord555() {
		assertEquals("916-631-6515", customers.get(554).getFax());
	}

	@Test
	@DisplayName("Record 555: Email is richie@goldston.com")
	void EmailOfRecord555() {
		assertEquals("richie@goldston.com", customers.get(554).getEmail());
	}

	@Test
	@DisplayName("Record 555: Web is http://www.richiegoldston.com")
	void WebOfRecord555() {
		assertEquals("http://www.richiegoldston.com", customers.get(554).getWeb());
	}
}
